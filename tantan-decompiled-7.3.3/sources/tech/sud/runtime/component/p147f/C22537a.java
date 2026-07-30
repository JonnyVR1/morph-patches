package tech.sud.runtime.component.p147f;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p149h.C22545a;
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: renamed from: tech.sud.runtime.component.f.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22537a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TextView f208647a;

    /* JADX INFO: renamed from: b */
    private WebView f208648b;

    /* JADX INFO: renamed from: c */
    private boolean f208649c;

    /* JADX INFO: renamed from: d */
    private List<String> f208650d;

    /* JADX INFO: renamed from: e */
    private boolean f208651e;

    /* JADX INFO: renamed from: f */
    private int f208652f;

    /* JADX INFO: renamed from: g */
    private int f208653g;

    /* JADX INFO: renamed from: tech.sud.runtime.component.f.a$a */
    public final class a extends Button {

        /* JADX INFO: renamed from: b */
        private int f208661b;

        /* JADX INFO: renamed from: c */
        private int f208662c;

        /* JADX INFO: renamed from: d */
        private int f208663d;

        /* JADX INFO: renamed from: e */
        private int f208664e;

        /* JADX INFO: renamed from: f */
        private boolean f208665f;

        public a(Context context) {
            super(context);
        }

        @Override // android.widget.TextView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int action = motionEvent.getAction() & 255;
            if (action != 0) {
                int i = 0;
                if (action != 1) {
                    if (action == 2) {
                        int i2 = (this.f208663d + rawX) - this.f208661b;
                        int i3 = (this.f208664e + rawY) - this.f208662c;
                        int width = getWidth();
                        int height = getHeight();
                        int width2 = C22537a.this.getWidth() - width;
                        int height2 = C22537a.this.getHeight() - height;
                        if (i2 < 0) {
                            i2 = 0;
                        } else if (i2 > width2) {
                            i2 = width2;
                        }
                        if (i3 >= 0) {
                            i = i3 > height2 ? height2 : i3;
                        }
                        if (Math.pow(rawY - this.f208662c, 2.0d) + Math.pow(rawX - this.f208661b, 2.0d) > Math.pow(40.0d, 2.0d)) {
                            this.f208665f = true;
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                            layoutParams.leftMargin = i2;
                            layoutParams.topMargin = i;
                            setLayoutParams(layoutParams);
                        }
                    }
                } else if (this.f208665f) {
                    this.f208665f = false;
                } else {
                    callOnClick();
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
                this.f208663d = layoutParams2.leftMargin;
                this.f208664e = layoutParams2.topMargin;
                this.f208661b = rawX;
                this.f208662c = rawY;
            }
            return true;
        }
    }

    public C22537a(Context context, FrameLayout frameLayout) {
        super(context);
        this.f208647a = null;
        this.f208648b = null;
        this.f208649c = false;
        this.f208650d = new ArrayList();
        this.f208651e = false;
        this.f208652f = 0;
        this.f208653g = 0;
        this.f208649c = true;
        if (!C22545a.m223086a(context, "file:////android_asset/JSConsole/index.html")) {
            this.f208651e = true;
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WebView webView = new WebView(context);
        this.f208648b = webView;
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f208648b.getSettings();
        settings.setAppCacheEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.f208648b.setWebChromeClient(new WebChromeClient());
        this.f208648b.setWebViewClient(new WebViewClient() { // from class: tech.sud.runtime.component.f.a.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                C22537a.this.m223045e();
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (Build.VERSION.SDK_INT < 26) {
                    Log.e("WebView", "RenderProcessGone: ");
                    return true;
                }
                Log.e("WebView", "RenderProcessGone: " + renderProcessGoneDetail.didCrash());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, WebResourceRequest webResourceRequest) {
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                return true;
            }
        });
        this.f208647a = new a(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16749902);
        gradientDrawable.setCornerRadius(displayMetrics.density * 15.0f);
        gradientDrawable.setStroke(1, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f208647a.setPadding(30, 7, 30, 7);
        this.f208647a.setText("JSConsole");
        this.f208647a.setTextSize(15.0f);
        this.f208647a.setBackground(gradientDrawable);
        this.f208647a.setTextColor(-1);
        addView(this.f208647a, new FrameLayout.LayoutParams(-2, -2));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.2
            @Override // java.lang.Runnable
            public void run() {
                C22537a.this.m223044d();
            }
        });
        this.f208647a.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.f.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z = C22537a.this.f208649c;
                C22537a c22537a = C22537a.this;
                if (z) {
                    c22537a.m223048b();
                } else {
                    c22537a.m223046a();
                }
            }
        });
        this.f208648b.loadUrl("file:////android_asset/JSConsole/index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m223037a(int i, int i2) {
        boolean z;
        TextView textView = this.f208647a;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        int i3 = this.f208653g;
        boolean z2 = true;
        if (layoutParams.leftMargin + i3 > i) {
            layoutParams.leftMargin = (i - i3) - 50;
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f208652f;
        if (layoutParams.topMargin + i4 > i2) {
            layoutParams.topMargin = (i2 - i4) - 30;
        } else {
            z2 = z;
        }
        if (z2) {
            this.f208647a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m223042c(String str) {
        WebView webView = this.f208648b;
        if (webView != null) {
            webView.loadUrl("javascript:addLog('" + m223040b(str) + "')");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m223044d() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f208647a.getLayoutParams();
        int width = this.f208647a.getWidth();
        this.f208653g = width;
        int height = this.f208647a.getHeight();
        this.f208652f = height;
        layoutParams.leftMargin = (getWidth() - width) - 50;
        layoutParams.topMargin = (getHeight() - height) - 30;
        this.f208647a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m223045e() {
        this.f208651e = true;
        if (this.f208650d.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f208650d.iterator();
        while (it.hasNext()) {
            m223042c(it.next());
        }
        this.f208650d = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public void m223048b() {
        this.f208649c = false;
        WebView webView = this.f208648b;
        if (webView != null) {
            webView.setVisibility(4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        C22550f.m223102b("JSConsole", String.format("%d, %d", Integer.valueOf(i5), Integer.valueOf(i6)));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.4
            @Override // java.lang.Runnable
            public void run() {
                C22537a.this.m223037a(i5, i6);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static String m223040b(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    /* JADX INFO: renamed from: c */
    public void m223049c() {
        removeAllViews();
        WebView webView = this.f208648b;
        if (webView != null) {
            webView.setVisibility(8);
            this.f208648b.removeAllViews();
            this.f208648b.destroy();
            this.f208648b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223046a() {
        this.f208649c = true;
        WebView webView = this.f208648b;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m223047a(String str) {
        if (this.f208648b == null) {
            return;
        }
        if (!this.f208651e) {
            this.f208650d.add(str);
        } else {
            m223042c(str);
        }
    }
}
