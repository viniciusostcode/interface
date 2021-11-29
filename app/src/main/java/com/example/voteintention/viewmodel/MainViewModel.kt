package com.example.voteintention.viewmodel
/*
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.voteintention.implementation.DataSource_implementation
import com.example.voteintention.retrofit.Retrofit
import com.example.voteintention.data.Repository
import com.example.voteintention.model.VotingIntention
import com.example.voteintention.usecase.UseCase
*/
import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
    /*
    private val task = Retrofit()
    private val dataSource = DataSource_implementation(task)
    private val repository = Repository(dataSource)
    private val useCase = UseCase(repository)

    private var _acceptanceAndRejection = MutableLiveData<VotingIntention>()
    val acceptanceAndRejection:LiveData<VotingIntention> get() = _acceptanceAndRejection

    fun initViewModel(gender: String){
        getVotingIntention(gender)
    }

    private fun getVotingIntention(gender:String){
        Thread{
            try{
                _acceptanceAndRejection.postValue(useCase.invoke(gender))
            }catch (ex:Exception){
                Log.e("##ERROR_GENDER##", ex.message.toString())
            }
        }.start()
    }

     */
}