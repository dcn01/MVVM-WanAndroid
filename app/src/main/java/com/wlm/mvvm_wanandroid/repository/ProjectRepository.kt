package com.wlm.mvvm_wanandroid.repository

import com.wlm.mvvm_wanandroid.base.BaseRepository
import com.wlm.mvvm_wanandroid.base.HttpResponse
import com.wlm.mvvm_wanandroid.common.Knowledge
import com.wlm.mvvm_wanandroid.common.net.RetrofitManager
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProjectRepository : BaseRepository() {
    suspend fun getProjectTree() : HttpResponse<List<Knowledge>> {
        return withContext(Dispatchers.IO) {
            RetrofitManager.service.getProjectTree()
        }
    }

}