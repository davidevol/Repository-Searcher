package com.davideploy.repository.searcher.domain

import com.davideploy.repository.searcher.core.UseCase
import com.davideploy.repository.searcher.data.model.Repo
import com.davideploy.repository.searcher.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}