package com.p051p1.mobile.putong.core.p058ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p153l.dup0;
import p153l.psd0;
import p153l.qcj;
import p153l.rx3;
import p153l.wqp0;
import p153l.x20;
import p153l.y20;
import p153l.zpq;

/* JADX INFO: loaded from: classes6.dex */
public class WebViewFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public WebViewX f29024A;

    /* JADX INFO: renamed from: B */
    public ProgressBar f29025B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f29026C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f29027D;

    /* JADX INFO: renamed from: E */
    public ImageView f29028E;

    /* JADX INFO: renamed from: F */
    public String f29029F;

    /* JADX INFO: renamed from: G */
    public String f29030G;

    /* JADX INFO: renamed from: H */
    public zpq f29031H;

    /* JADX INFO: renamed from: I */
    public x20 f29032I;

    /* JADX INFO: renamed from: z */
    public FrameLayout f29033z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.WebViewFrag$a */
    public class C8437a implements rx3.InterfaceC19928a {
        public C8437a() {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: a */
        public void mo37613a(String str) {
            WebViewFrag.this.f29025B.setVisibility(8);
            if (TextUtils.isEmpty(WebViewFrag.this.f29029F) && !TextUtils.isEmpty(WebViewFrag.this.f29024A.getTitle()) && !str.equals(rx3.EMPTY_PAGE) && WebViewFrag.this.f29026C.getVisibility() != 0) {
                WebViewFrag.this.act().setTitle(WebViewFrag.this.f29024A.getTitle());
            }
            if (NullChecker.m82486a(WebViewFrag.this.f29032I)) {
                WebViewFrag.this.f29032I.call();
            }
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: b */
        public void mo37614b(String str) {
        }

        @Override // p153l.rx3.InterfaceC19928a
        /* JADX INFO: renamed from: c */
        public void mo37615c(int i, String str, String str2) {
            WebViewFrag.this.f29026C.setVisibility(0);
        }
    }

    public WebViewFrag() {
        creates(new y20() { // from class: l.aup0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73537a.m45262X4((Bundle) obj);
            }
        });
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.bup0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78533a.m45267Y4((C4470c) obj);
            }
        }));
        this.f29032I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ Boolean m45261W4(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f29024A.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m45262X4(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f29029F)) {
            act().setTitle(this.f29029F);
        }
        mo37608V4(null);
    }

    /* JADX INFO: renamed from: Q4 */
    public View m45263Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dup0.m118165b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public zpq m45264R4() {
        return this.f29031H;
    }

    /* JADX INFO: renamed from: S4 */
    public qcj<String, Boolean> m45265S4() {
        return new qcj() { // from class: l.cup0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f83867a.m45261W4((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: T4 */
    public rx3.InterfaceC19928a mo37607T4() {
        return new C8437a();
    }

    /* JADX INFO: renamed from: U4 */
    public String m45266U4() {
        return this.f29030G;
    }

    /* JADX INFO: renamed from: V4 */
    public void mo37608V4(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f29030G)) {
            return;
        }
        zpq zpqVarM45264R4 = m45264R4();
        if (NullChecker.m82486a(zpqVarM45264R4)) {
            this.f29024A.addJavascriptInterface(zpqVarM45264R4, "tantan");
        }
        rx3 rx3Var = new rx3(act(), m45265S4(), false);
        rx3Var.setListener(mo37607T4());
        this.f29024A.setWebViewClientX(rx3Var);
        this.f29024A.setWebChromeClientX(new wqp0());
        boolean zM82486a = NullChecker.m82486a(map);
        WebViewX webViewX = this.f29024A;
        if (zM82486a) {
            webViewX.loadUrl(this.f29030G, map);
        } else {
            webViewX.loadUrl(this.f29030G);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m45267Y4(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            if (NullChecker.m82486a(this.f29031H)) {
                this.f29031H.m220926k();
            }
            if (NullChecker.m82486a(this.f29024A)) {
                this.f29024A.removeAllViews();
                ((ViewGroup) this.f29024A.getParent()).removeView(this.f29024A);
                this.f29024A.setTag(null);
                this.f29024A.clearHistory();
                this.f29024A.destroy();
                this.f29024A = null;
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m45263Q4(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        if (NullChecker.m82486a(getArguments())) {
            this.f29029F = getArguments().getString("title");
            this.f29030G = getArguments().getString("url");
        }
    }
}
