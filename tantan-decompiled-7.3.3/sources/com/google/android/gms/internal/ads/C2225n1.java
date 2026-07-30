package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.C2098b;
import p153l.bkt0;
import p153l.ckt0;
import p153l.d2v0;
import p153l.dct0;
import p153l.gjt0;
import p153l.r2s0;
import p153l.v2s0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2225n1 {

    /* JADX INFO: renamed from: a */
    public final ckt0 f10032a;

    /* JADX INFO: renamed from: b */
    public final bkt0 f10033b;

    public C2225n1(ckt0 ckt0Var, bkt0 bkt0Var) {
        this.f10033b = bkt0Var;
        this.f10032a = ckt0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m13056a(String str) {
        Uri uri = Uri.parse(str);
        gjt0 gjt0VarM13781B0 = ((zzckf) this.f10033b.f77124a).m13781B0();
        if (gjt0VarM13781B0 == null) {
            dct0.m115295d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            gjt0VarM13781B0.zzj(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ckt0, l.ikt0] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            d2v0.m113737k("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.f10032a;
        v2s0 v2s0VarMo13757p = r0.mo13757p();
        if (v2s0VarMo13757p == null) {
            d2v0.m113737k("Signal utils is empty, ignoring.");
            return "";
        }
        r2s0 r2s0VarM199147c = v2s0VarMo13757p.m199147c();
        if (r0.getContext() == null) {
            d2v0.m113737k("Context is null, ignoring.");
            return "";
        }
        ckt0 ckt0Var = this.f10032a;
        return r2s0VarM199147c.mo165760g(ckt0Var.getContext(), str, (View) ckt0Var, ckt0Var.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.ckt0, l.ikt0] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.f10032a;
        v2s0 v2s0VarMo13757p = r0.mo13757p();
        if (v2s0VarMo13757p == null) {
            d2v0.m113737k("Signal utils is empty, ignoring.");
            return "";
        }
        r2s0 r2s0VarM199147c = v2s0VarMo13757p.m199147c();
        if (r0.getContext() == null) {
            d2v0.m113737k("Context is null, ignoring.");
            return "";
        }
        ckt0 ckt0Var = this.f10032a;
        return r2s0VarM199147c.mo165761h(ckt0Var.getContext(), (View) ckt0Var, ckt0Var.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            dct0.m115298g("URL is empty, ignoring message");
        } else {
            C2098b.f9751l.post(new Runnable() { // from class: l.akt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72041a.m13056a(str);
                }
            });
        }
    }
}
