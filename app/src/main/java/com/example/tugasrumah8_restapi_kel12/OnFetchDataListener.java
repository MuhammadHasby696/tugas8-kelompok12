package com.example.tugasrumah8_restapi_kel12;

import com.example.tugasrumah8_restapi_kel12.Models.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}