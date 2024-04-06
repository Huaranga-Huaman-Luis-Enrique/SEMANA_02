package com.example.semana_02.service;

import com.example.semana_02.entity.User;

import java.util.List;

import retrofit2.Call;
import  retrofit2.http.GET;

public interface ServiceUser {

    @GET("users")
    public abstract Call<List<User>> listaUsuarios();

}