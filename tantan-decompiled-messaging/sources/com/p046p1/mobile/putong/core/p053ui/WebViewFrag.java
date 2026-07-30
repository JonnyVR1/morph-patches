package com.p046p1.mobile.putong.core.p053ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.tantanapp.common.utils.NullChecker;
import java.util.Map;
import p149l.aoq;
import p149l.d30;
import p149l.e30;
import p149l.mkd0;
import p149l.sw3;
import p149l.thp0;
import p149l.w9j;
import p149l.zkp0;

/* JADX INFO: loaded from: classes8.dex */
public class WebViewFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public WebViewX f28176A;

    /* JADX INFO: renamed from: B */
    public ProgressBar f28177B;

    /* JADX INFO: renamed from: C */
    public FrameLayout f28178C;

    /* JADX INFO: renamed from: D */
    public FrameLayout f28179D;

    /* JADX INFO: renamed from: E */
    public ImageView f28180E;

    /* JADX INFO: renamed from: F */
    public String f28181F;

    /* JADX INFO: renamed from: G */
    public String f28182G;

    /* JADX INFO: renamed from: H */
    public aoq f28183H;

    /* JADX INFO: renamed from: I */
    public d30 f28184I;

    /* JADX INFO: renamed from: z */
    public FrameLayout f28185z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.WebViewFrag$a */
    public class C8274a implements sw3.InterfaceC20043a {
        public C8274a() {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: a */
        public void mo36610a(String str) {
            WebViewFrag.this.f28177B.setVisibility(8);
            if (TextUtils.isEmpty(WebViewFrag.this.f28181F) && !TextUtils.isEmpty(WebViewFrag.this.f28176A.getTitle()) && !str.equals(sw3.EMPTY_PAGE) && WebViewFrag.this.f28178C.getVisibility() != 0) {
                WebViewFrag.this.act().setTitle(WebViewFrag.this.f28176A.getTitle());
            }
            if (NullChecker.m81303a(WebViewFrag.this.f28184I)) {
                WebViewFrag.this.f28184I.call();
            }
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: b */
        public void mo36611b(String str) {
        }

        @Override // p149l.sw3.InterfaceC20043a
        /* JADX INFO: renamed from: c */
        public void mo36612c(int i, String str, String str2) {
            WebViewFrag.this.f28178C.setVisibility(0);
        }
    }

    public WebViewFrag() {
        creates(new e30() { // from class: l.wkp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186797a.m44079X4((Bundle) obj);
            }
        });
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xkp0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193334a.m44084Y4((C4319c) obj);
            }
        }));
        this.f28184I = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W4 */
    public /* synthetic */ Boolean m44078W4(String str) {
        if (!str.contains("tantan")) {
            return Boolean.FALSE;
        }
        this.f28176A.loadUrl(str);
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X4 */
    public /* synthetic */ void m44079X4(Bundle bundle) {
        if (!TextUtils.isEmpty(this.f28181F)) {
            act().setTitle(this.f28181F);
        }
        mo36605V4(null);
    }

    /* JADX INFO: renamed from: Q4 */
    public View m44080Q4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return zkp0.m219194b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R4 */
    public aoq m44081R4() {
        return this.f28183H;
    }

    /* JADX INFO: renamed from: S4 */
    public w9j<String, Boolean> m44082S4() {
        return new w9j() { // from class: l.ykp0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f198792a.m44078W4((String) obj);
            }
        };
    }

    /* JADX INFO: renamed from: T4 */
    public sw3.InterfaceC20043a mo36604T4() {
        return new C8274a();
    }

    /* JADX INFO: renamed from: U4 */
    public String m44083U4() {
        return this.f28182G;
    }

    /* JADX INFO: renamed from: V4 */
    public void mo36605V4(Map<String, String> map) {
        if (TextUtils.isEmpty(this.f28182G)) {
            return;
        }
        aoq aoqVarM44081R4 = m44081R4();
        if (NullChecker.m81303a(aoqVarM44081R4)) {
            this.f28176A.addJavascriptInterface(aoqVarM44081R4, "tantan");
        }
        sw3 sw3Var = new sw3(act(), m44082S4(), false);
        sw3Var.setListener(mo36604T4());
        this.f28176A.setWebViewClientX(sw3Var);
        this.f28176A.setWebChromeClientX(new thp0());
        boolean zM81303a = NullChecker.m81303a(map);
        WebViewX webViewX = this.f28176A;
        if (zM81303a) {
            webViewX.loadUrl(this.f28182G, map);
        } else {
            webViewX.loadUrl(this.f28182G);
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public final /* synthetic */ void m44084Y4(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            if (NullChecker.m81303a(this.f28183H)) {
                this.f28183H.m97931k();
            }
            if (NullChecker.m81303a(this.f28176A)) {
                this.f28176A.removeAllViews();
                ((ViewGroup) this.f28176A.getParent()).removeView(this.f28176A);
                this.f28176A.setTag(null);
                this.f28176A.clearHistory();
                this.f28176A.destroy();
                this.f28176A = null;
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m44080Q4(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        if (NullChecker.m81303a(getArguments())) {
            this.f28181F = getArguments().getString("title");
            this.f28182G = getArguments().getString("url");
        }
    }
}
