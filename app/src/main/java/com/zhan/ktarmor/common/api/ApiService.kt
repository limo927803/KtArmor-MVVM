package com.zhan.ktarmor.common.api

import com.zhan.ktarmor.account.data.response.LoginRsp
import com.zhan.ktarmor.common.data.BaseResponse
import kotlinx.coroutines.Deferred
import retrofit2.http.POST
import retrofit2.http.Query

/**
 * @author  hyzhan
 * @date    2019/5/28
 * @desc    TODO
 */
interface ApiService {

    @POST(API.LOGIN)
    fun login(@Query("username") username: String,
              @Query("password") password: String): Deferred<BaseResponse<LoginRsp>>
}