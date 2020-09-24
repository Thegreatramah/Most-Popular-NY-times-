package com.kk.nytimesapp.model

import com.kk.nytimesapp.model.Result

data class ResultResponse(val status: String, val copyright: String, val num_results: String, val results: List<Result>)