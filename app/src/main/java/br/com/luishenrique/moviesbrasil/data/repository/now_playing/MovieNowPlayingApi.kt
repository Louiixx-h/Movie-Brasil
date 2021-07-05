package br.com.luishenrique.moviesbrasil.data.repository.now_playing

import br.com.luishenrique.moviesbrasil.data.models.ResponseMovieNowPlaying
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieNowPlayingApi {

    @GET("movie/now_playing")
    fun getNowPlaying(
        @Query("api_key") key: String,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ): Call<ResponseMovieNowPlaying>
}