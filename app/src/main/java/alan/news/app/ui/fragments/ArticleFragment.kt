package alan.news.app.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import alan.news.app.R
import alan.news.app.ui.NewsActivity
import alan.news.app.ui.NewsViewModel
import android.webkit.WebViewClient
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_article.*

class ArticleFragment : Fragment(R.layout.fragment_article) {

    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }
    }

}