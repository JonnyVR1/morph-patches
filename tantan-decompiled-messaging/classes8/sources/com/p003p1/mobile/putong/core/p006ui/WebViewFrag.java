package com.p003p1.mobile.putong.core.p006ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p003p1.mobile.android.app.C0231c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import l.aoq;
import l.d30;
import l.e30;
import l.sw3;
import l.thp0;
import l.w9j;
import l.zkp0;
import p007l.mkd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class WebViewFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public WebViewX f1747A;

    /* JADX INFO: renamed from: B */
    public ProgressBar f1748B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f1749C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f1750D;

    /* JADX INFO: renamed from: E */
    public ImageView f1751E;

    /* JADX INFO: renamed from: F */
    public String f1752F;

    /* JADX INFO: renamed from: G */
    public String f1753G;

    /* JADX INFO: renamed from: H */
    public aoq f1754H;

    /* JADX INFO: renamed from: I */
    public d30 f1755I;

    /* JADX INFO: renamed from: z */
    public FrameLayout f1756z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.WebViewFrag$a */
    public class C0486a implements sw3.a {
        public C0486a() {
        }

        /* JADX INFO: renamed from: a */
        public void m8411a(String str) {
            WebViewFrag.this.f1748B.setVisibility(8);
            if (TextUtils.isEmpty(WebViewFrag.this.f1752F) && !TextUtils.isEmpty(WebViewFrag.this.f1747A.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && WebViewFrag.this.f1749C.getVisibility() != 0) {
                WebViewFrag.this.act().setTitle(WebViewFrag.this.f1747A.getTitle());
            }
            if (NullChecker.a(WebViewFrag.this.f1755I)) {
                WebViewFrag.this.f1755I.call();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m8412b(String str) {
        }

        /* JADX INFO: renamed from: c */
        public void m8413c(int i, String str, String str2) {
            WebViewFrag.this.f1749C.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewFrag() {
        creates(new e30() { // from class: l.wkp0
            public final void call(Object obj) {
                this.f5045a.m8402X4((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m9874G(new e30() { // from class: l.xkp0
            public final void call(Object obj) {
                this.f5345a.m8409Y4((C0231c) obj);
            }
        }));
        this.f1755I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ Boolean m8401W4(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f1747A.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m8402X4(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f1752F)) {
            act().setTitle(this.f1752F);
        }
        m8408V4(null);
    }

    /* JADX INFO: renamed from: Q4 */
    public View m8403Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zkp0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public aoq m8404R4() {
        return this.f1754H;
    }

    /* JADX INFO: renamed from: S4 */
    public w9j<String, Boolean> m8405S4() {
        return new w9j() { // from class: l.ykp0
            public final Object call(Object obj) {
                return this.f5446a.m8401W4((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: T4 */
    public sw3.a m8406T4() {
        return new C0486a();
    }

    /* JADX INFO: renamed from: U4 */
    public String m8407U4() {
        return this.f1753G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V4 */
    public void m8408V4(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f1753G)) {
            return;
        }
        aoq aoqVarM8404R4 = m8404R4();
        if (NullChecker.a(aoqVarM8404R4)) {
            this.f1747A.addJavascriptInterface(aoqVarM8404R4, "tantan");
        }
        sw3 sw3Var = new sw3(act(), m8405S4(), false);
        sw3Var.setListener(m8406T4());
        this.f1747A.setWebViewClientX(sw3Var);
        this.f1747A.setWebChromeClientX(new thp0());
        boolean zA = NullChecker.a(map);
        WebViewX webViewX = this.f1747A;
        if (zA) {
            webViewX.loadUrl(this.f1753G, map);
        } else {
            webViewX.loadUrl(this.f1753G);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m8409Y4(C0231c c0231c) {
        if (c0231c == C0231c.f1251m) {
            if (NullChecker.a(this.f1754H)) {
                this.f1754H.k();
            }
            if (NullChecker.a(this.f1747A)) {
                this.f1747A.removeAllViews();
                ((ViewGroup) this.f1747A.getParent()).removeView(this.f1747A);
                this.f1747A.setTag(null);
                this.f1747A.clearHistory();
                this.f1747A.destroy();
                this.f1747A = null;
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8403Q4(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: n4 */
    public void m8410n4(Bundle bundle) {
        if (NullChecker.a(getArguments())) {
            this.f1752F = getArguments().getString("title");
            this.f1753G = getArguments().getString("url");
        }
    }
}
