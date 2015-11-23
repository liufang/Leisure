package com.mummyding.app.leisure.ui;



import com.mummyding.app.leisure.R;

public class WebViewUrlActivity extends BaseWebViewActivity {
    @Override
    protected String getData() {
        return getIntent().getStringExtra(getString(R.string.id_url));
    }
    @Override
    protected void loadData() {
        webView.post(new Runnable() {
            @Override
            public void run() {
                webView.loadUrl(data);
            }
        });
    }
}
