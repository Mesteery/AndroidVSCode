package fr.mestery.vscode;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;

public class MainActivity extends Activity {

		private WebView mWebView;

		@Override
		protected void onCreate (Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				setContentView(R.layout.main);

				mWebView = (WebView) findViewById(R.id.webview);

				mWebView.setWebChromeClient(new WebChromeClient()); 
				mWebView.setWebViewClient(new WebViewClient());

				// init settings
				WebSettings settings = mWebView.getSettings();
				settings.setJavaScriptEnabled(true);
				settings.setJavaScriptCanOpenWindowsAutomatically(true);
				settings.setSavePassword(true);
				settings.enableSmoothTransition();
				settings.setDomStorageEnabled(true);
				settings.setAllowFileAccessFromFileURLs(true);
				settings.setAllowContentAccess(true);
				settings.setAllowFileAccess(true);
				settings.setAppCacheEnabled(true);
				settings.setDatabaseEnabled(true);
				settings.setAllowUniversalAccessFromFileURLs(true);
				settings.setUseWideViewPort(true);
				settings.setJavaScriptCanOpenWindowsAutomatically(true);
				settings.setLoadsImagesAutomatically(true);

				mWebView.loadUrl("http://127.0.0.1:8080/");

    }

}
