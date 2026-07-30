package tech.sud.runtime.component.p143f;

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
import tech.sud.runtime.component.p145h.C22430a;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: renamed from: tech.sud.runtime.component.f.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22422a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TextView f207725a;

    /* JADX INFO: renamed from: b */
    private WebView f207726b;

    /* JADX INFO: renamed from: c */
    private boolean f207727c;

    /* JADX INFO: renamed from: d */
    private List<String> f207728d;

    /* JADX INFO: renamed from: e */
    private boolean f207729e;

    /* JADX INFO: renamed from: f */
    private int f207730f;

    /* JADX INFO: renamed from: g */
    private int f207731g;

    /* JADX INFO: renamed from: tech.sud.runtime.component.f.a$a */
    public final class a extends Button {

        /* JADX INFO: renamed from: b */
        private int f207739b;

        /* JADX INFO: renamed from: c */
        private int f207740c;

        /* JADX INFO: renamed from: d */
        private int f207741d;

        /* JADX INFO: renamed from: e */
        private int f207742e;

        /* JADX INFO: renamed from: f */
        private boolean f207743f;

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
                        int i2 = (this.f207741d + rawX) - this.f207739b;
                        int i3 = (this.f207742e + rawY) - this.f207740c;
                        int width = getWidth();
                        int height = getHeight();
                        int width2 = C22422a.this.getWidth() - width;
                        int height2 = C22422a.this.getHeight() - height;
                        if (i2 < 0) {
                            i2 = 0;
                        } else if (i2 > width2) {
                            i2 = width2;
                        }
                        if (i3 >= 0) {
                            i = i3 > height2 ? height2 : i3;
                        }
                        if (Math.pow(rawY - this.f207740c, 2.0d) + Math.pow(rawX - this.f207739b, 2.0d) > Math.pow(40.0d, 2.0d)) {
                            this.f207743f = true;
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                            layoutParams.leftMargin = i2;
                            layoutParams.topMargin = i;
                            setLayoutParams(layoutParams);
                        }
                    }
                } else if (this.f207743f) {
                    this.f207743f = false;
                } else {
                    callOnClick();
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
                this.f207741d = layoutParams2.leftMargin;
                this.f207742e = layoutParams2.topMargin;
                this.f207739b = rawX;
                this.f207740c = rawY;
            }
            return true;
        }
    }

    public C22422a(Context context, FrameLayout frameLayout) {
        super(context);
        this.f207725a = null;
        this.f207726b = null;
        this.f207727c = false;
        this.f207728d = new ArrayList();
        this.f207729e = false;
        this.f207730f = 0;
        this.f207731g = 0;
        this.f207727c = true;
        if (!C22430a.m221840a(context, "file:////android_asset/JSConsole/index.html")) {
            this.f207729e = true;
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WebView webView = new WebView(context);
        this.f207726b = webView;
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f207726b.getSettings();
        settings.setAppCacheEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.f207726b.setWebChromeClient(new WebChromeClient());
        this.f207726b.setWebViewClient(new WebViewClient() { // from class: tech.sud.runtime.component.f.a.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                C22422a.this.m221799e();
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
        this.f207725a = new a(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16749902);
        gradientDrawable.setCornerRadius(displayMetrics.density * 15.0f);
        gradientDrawable.setStroke(1, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f207725a.setPadding(30, 7, 30, 7);
        this.f207725a.setText("JSConsole");
        this.f207725a.setTextSize(15.0f);
        this.f207725a.setBackground(gradientDrawable);
        this.f207725a.setTextColor(-1);
        addView(this.f207725a, new FrameLayout.LayoutParams(-2, -2));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.2
            @Override // java.lang.Runnable
            public void run() {
                C22422a.this.m221798d();
            }
        });
        this.f207725a.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.f.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z = C22422a.this.f207727c;
                C22422a c22422a = C22422a.this;
                if (z) {
                    c22422a.m221802b();
                } else {
                    c22422a.m221800a();
                }
            }
        });
        this.f207726b.loadUrl("file:////android_asset/JSConsole/index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m221791a(int i, int i2) {
        boolean z;
        TextView textView = this.f207725a;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        int i3 = this.f207731g;
        boolean z2 = true;
        if (layoutParams.leftMargin + i3 > i) {
            layoutParams.leftMargin = (i - i3) - 50;
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f207730f;
        if (layoutParams.topMargin + i4 > i2) {
            layoutParams.topMargin = (i2 - i4) - 30;
        } else {
            z2 = z;
        }
        if (z2) {
            this.f207725a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m221796c(String str) {
        WebView webView = this.f207726b;
        if (webView != null) {
            webView.loadUrl("javascript:addLog('" + m221794b(str) + "')");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m221798d() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f207725a.getLayoutParams();
        int width = this.f207725a.getWidth();
        this.f207731g = width;
        int height = this.f207725a.getHeight();
        this.f207730f = height;
        layoutParams.leftMargin = (getWidth() - width) - 50;
        layoutParams.topMargin = (getHeight() - height) - 30;
        this.f207725a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m221799e() {
        this.f207729e = true;
        if (this.f207728d.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f207728d.iterator();
        while (it.hasNext()) {
            m221796c(it.next());
        }
        this.f207728d = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public void m221802b() {
        this.f207727c = false;
        WebView webView = this.f207726b;
        if (webView != null) {
            webView.setVisibility(4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        C22435f.m221856b("JSConsole", String.format("%d, %d", Integer.valueOf(i5), Integer.valueOf(i6)));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.4
            @Override // java.lang.Runnable
            public void run() {
                C22422a.this.m221791a(i5, i6);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static String m221794b(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    /* JADX INFO: renamed from: c */
    public void m221803c() {
        removeAllViews();
        WebView webView = this.f207726b;
        if (webView != null) {
            webView.setVisibility(8);
            this.f207726b.removeAllViews();
            this.f207726b.destroy();
            this.f207726b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221800a() {
        this.f207727c = true;
        WebView webView = this.f207726b;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m221801a(String str) {
        if (this.f207726b == null) {
            return;
        }
        if (!this.f207729e) {
            this.f207728d.add(str);
        } else {
            m221796c(str);
        }
    }
}
