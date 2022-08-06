package com.davideploy.repository.searcher.data.repositories

import com.davideploy.repository.searcher.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}