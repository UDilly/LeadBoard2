package com.webcafeappdev.leadboard.services;

import com.webcafeappdev.leadboard.data.Learner;
import com.webcafeappdev.leadboard.data.SkillQ;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiServices {

    @GET("api/hours")
    Call<ArrayList<Learner>> getTopLearners();

    @GET("api/skilliq")
    Call<ArrayList<SkillQ>> getTopSkillIQScores();

}
