package com.example.voteintention.implementation

/*
class DataSource_implementation(private val taskApi: Retrofit):DataSource {
    override fun getAcceptanceAndRejectionByGender(gender:String): VotingIntention {
        val request = taskApi.getRetrofitInstance()
            .getAcceptanceAndRejectionByGender(gender)
            .execute()
        val votingIntention:VotingIntention = if(request.isSuccessful){
            request.body()!!
        }else{
            VotingIntention(null, null)
        }
        return votingIntention
    }

}*/