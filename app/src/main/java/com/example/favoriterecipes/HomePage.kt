package com.example.favoriterecipes

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.favoriterecipes.api.model.ApiManager
import com.example.favoriterecipes.api.model.RandomsResponse
import com.example.favoriterecipes.api.model.RecipesItem
import com.example.favoriterecipes.databinding.ActivityHomePageBinding
import com.example.islami.Base.BaseActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomePage : BaseActivity() {
    lateinit var binding: ActivityHomePageBinding
    lateinit var adapter: RecipesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        adapter=RecipesAdapter(null)
        binding.recyclerView.adapter=adapter
        getRecipes()
    }

    fun getRecipes() {
        ApiManager.getApi()
            .getRecipeInformation(Constants.apiKey, "", 10)
            .enqueue(object : Callback<RandomsResponse> {
                override fun onResponse(
                    call: Call<RandomsResponse>,
                    response: Response<RandomsResponse>
                ) {
                    binding.progressPar.visibility= View.GONE
                    if (response.isSuccessful){
                        showRecipesInRecycleView(response?.body()?.recipes)
                    }
                    else{
                        showDialoge(message = response.body()?.message?:"",
                            posActionName = getString(R.string.ok), posAction =DialogInterface.OnClickListener{dialog, which ->
                                dialog.dismiss()
                            }  )
                    }
                }
                override fun onFailure(call: Call<RandomsResponse>, t: Throwable) {
                    showDialoge(message = t.localizedMessage,
                        posActionName = getString(R.string.retry),
                        posAction = DialogInterface.OnClickListener { dialog, which ->
                            call.clone().enqueue(this)
                            dialog.dismiss()
                        })
                }
            })

    }

    private fun showRecipesInRecycleView(recipesList: List<RecipesItem?>?) {
        adapter.changeData(recipesList)

    }




}