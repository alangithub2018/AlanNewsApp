package alan.news.app.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import alan.news.app.repository.NewsRepository
import android.app.Application

class NewsViewModelProviderFactory(
    val app: Application,
    val newsRepository: NewsRepository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return NewsViewModel(app, newsRepository) as T
    }
}