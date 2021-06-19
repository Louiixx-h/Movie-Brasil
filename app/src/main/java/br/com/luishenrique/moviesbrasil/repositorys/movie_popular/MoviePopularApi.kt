package br.com.luishenrique.moviesbrasil.repositorys.movie_popular

import br.com.luishenrique.moviesbrasil.models.ResponseMoviePopular
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviePopularApi {

    @GET("movie/popular")
    fun getMoviesPopular(
        @Query("api_key") key: String,
        @Query("language") language: String,
        @Query("page") page: Int
    ): Call<ResponseMoviePopular>
}