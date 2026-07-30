package tech.sud.runtime.component.p024f;

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
import l.y9t0;
import tech.sud.gip.core.view.round.RoundedDrawable;
import tech.sud.runtime.component.p026h.C1223a;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: renamed from: tech.sud.runtime.component.f.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1215a extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private TextView f11350a;

    /* JADX INFO: renamed from: b */
    private WebView f11351b;

    /* JADX INFO: renamed from: c */
    private boolean f11352c;

    /* JADX INFO: renamed from: d */
    private List<String> f11353d;

    /* JADX INFO: renamed from: e */
    private boolean f11354e;

    /* JADX INFO: renamed from: f */
    private int f11355f;

    /* JADX INFO: renamed from: g */
    private int f11356g;

    /* JADX INFO: renamed from: tech.sud.runtime.component.f.a$a */
    public final class a extends Button {

        /* JADX INFO: renamed from: b */
        private int f11364b;

        /* JADX INFO: renamed from: c */
        private int f11365c;

        /* JADX INFO: renamed from: d */
        private int f11366d;

        /* JADX INFO: renamed from: e */
        private int f11367e;

        /* JADX INFO: renamed from: f */
        private boolean f11368f;

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
                        int i2 = (this.f11366d + rawX) - this.f11364b;
                        int i3 = (this.f11367e + rawY) - this.f11365c;
                        int width = getWidth();
                        int height = getHeight();
                        int width2 = C1215a.this.getWidth() - width;
                        int height2 = C1215a.this.getHeight() - height;
                        if (i2 < 0) {
                            i2 = 0;
                        } else if (i2 > width2) {
                            i2 = width2;
                        }
                        if (i3 >= 0) {
                            i = i3 > height2 ? height2 : i3;
                        }
                        if (Math.pow(rawY - this.f11365c, 2.0d) + Math.pow(rawX - this.f11364b, 2.0d) > Math.pow(40.0d, 2.0d)) {
                            this.f11368f = true;
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                            layoutParams.leftMargin = i2;
                            layoutParams.topMargin = i;
                            setLayoutParams(layoutParams);
                        }
                    }
                } else if (this.f11368f) {
                    this.f11368f = false;
                } else {
                    callOnClick();
                }
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
                this.f11366d = layoutParams2.leftMargin;
                this.f11367e = layoutParams2.topMargin;
                this.f11364b = rawX;
                this.f11365c = rawY;
            }
            return true;
        }
    }

    public C1215a(Context context, FrameLayout frameLayout) {
        super(context);
        this.f11350a = null;
        this.f11351b = null;
        this.f11352c = false;
        this.f11353d = new ArrayList();
        this.f11354e = false;
        this.f11355f = 0;
        this.f11356g = 0;
        this.f11352c = true;
        if (!C1223a.m10311a(context, "file:////android_asset/JSConsole/index.html")) {
            this.f11354e = true;
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WebView webView = new WebView(context);
        this.f11351b = webView;
        addView(webView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this, new FrameLayout.LayoutParams(-1, -1));
        WebSettings settings = this.f11351b.getSettings();
        settings.setAppCacheEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        this.f11351b.setWebChromeClient(new WebChromeClient());
        this.f11351b.setWebViewClient(new WebViewClient() { // from class: tech.sud.runtime.component.f.a.1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView2, String str) {
                super.onPageFinished(webView2, str);
                C1215a.this.m10270e();
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                if (Build.VERSION.SDK_INT < 26) {
                    Log.e("WebView", "RenderProcessGone: ");
                    return true;
                }
                Log.e("WebView", "RenderProcessGone: " + y9t0.a(renderProcessGoneDetail));
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
        this.f11350a = new a(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16749902);
        gradientDrawable.setCornerRadius(displayMetrics.density * 15.0f);
        gradientDrawable.setStroke(1, RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f11350a.setPadding(30, 7, 30, 7);
        this.f11350a.setText("JSConsole");
        this.f11350a.setTextSize(15.0f);
        this.f11350a.setBackground(gradientDrawable);
        this.f11350a.setTextColor(-1);
        addView(this.f11350a, new FrameLayout.LayoutParams(-2, -2));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.2
            @Override // java.lang.Runnable
            public void run() {
                C1215a.this.m10269d();
            }
        });
        this.f11350a.setOnClickListener(new View.OnClickListener() { // from class: tech.sud.runtime.component.f.a.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean z = C1215a.this.f11352c;
                C1215a c1215a = C1215a.this;
                if (z) {
                    c1215a.m10273b();
                } else {
                    c1215a.m10271a();
                }
            }
        });
        this.f11351b.loadUrl("file:////android_asset/JSConsole/index.html");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m10262a(int i, int i2) {
        boolean z;
        TextView textView = this.f11350a;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        int i3 = this.f11356g;
        boolean z2 = true;
        if (layoutParams.leftMargin + i3 > i) {
            layoutParams.leftMargin = (i - i3) - 50;
            z = true;
        } else {
            z = false;
        }
        int i4 = this.f11355f;
        if (layoutParams.topMargin + i4 > i2) {
            layoutParams.topMargin = (i2 - i4) - 30;
        } else {
            z2 = z;
        }
        if (z2) {
            this.f11350a.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m10267c(String str) {
        WebView webView = this.f11351b;
        if (webView != null) {
            webView.loadUrl("javascript:addLog('" + m10265b(str) + "')");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m10269d() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f11350a.getLayoutParams();
        int width = this.f11350a.getWidth();
        this.f11356g = width;
        int height = this.f11350a.getHeight();
        this.f11355f = height;
        layoutParams.leftMargin = (getWidth() - width) - 50;
        layoutParams.topMargin = (getHeight() - height) - 30;
        this.f11350a.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m10270e() {
        this.f11354e = true;
        if (this.f11353d.isEmpty()) {
            return;
        }
        Iterator<String> it = this.f11353d.iterator();
        while (it.hasNext()) {
            m10267c(it.next());
        }
        this.f11353d = new ArrayList();
    }

    /* JADX INFO: renamed from: b */
    public void m10273b() {
        this.f11352c = false;
        WebView webView = this.f11351b;
        if (webView != null) {
            webView.setVisibility(4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        final int i5 = i3 - i;
        final int i6 = i4 - i2;
        C1228f.m10327b("JSConsole", String.format("%d, %d", Integer.valueOf(i5), Integer.valueOf(i6)));
        post(new Runnable() { // from class: tech.sud.runtime.component.f.a.4
            @Override // java.lang.Runnable
            public void run() {
                C1215a.this.m10262a(i5, i6);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private static String m10265b(String str) {
        return Base64.encodeToString(str.getBytes(), 0);
    }

    /* JADX INFO: renamed from: c */
    public void m10274c() {
        removeAllViews();
        WebView webView = this.f11351b;
        if (webView != null) {
            webView.setVisibility(8);
            this.f11351b.removeAllViews();
            this.f11351b.destroy();
            this.f11351b = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10271a() {
        this.f11352c = true;
        WebView webView = this.f11351b;
        if (webView != null) {
            webView.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m10272a(String str) {
        if (this.f11351b == null) {
            return;
        }
        if (!this.f11354e) {
            this.f11353d.add(str);
        } else {
            m10267c(str);
        }
    }
}
