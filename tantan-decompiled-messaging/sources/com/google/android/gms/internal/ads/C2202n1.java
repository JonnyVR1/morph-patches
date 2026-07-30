package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.android.gms.ads.internal.util.C2075b;
import p149l.aat0;
import p149l.ltr0;
import p149l.ptr0;
import p149l.vat0;
import p149l.wat0;
import p149l.x2t0;
import p149l.xsu0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2202n1 {

    /* JADX INFO: renamed from: a */
    public final wat0 f9995a;

    /* JADX INFO: renamed from: b */
    public final vat0 f9996b;

    public C2202n1(wat0 wat0Var, vat0 vat0Var) {
        this.f9996b = vat0Var;
        this.f9995a = wat0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m13002a(String str) {
        Uri uri = Uri.parse(str);
        aat0 aat0VarM13727B0 = ((zzckf) this.f9996b.f180781a).m13727B0();
        if (aat0VarM13727B0 == null) {
            x2t0.m206866d("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            aat0VarM13727B0.zzj(uri);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.cbt0, l.wat0] */
    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            xsu0.m210834k("Click string is empty, not proceeding.");
            return "";
        }
        ?? r0 = this.f9995a;
        ptr0 ptr0VarMo13703p = r0.mo13703p();
        if (ptr0VarMo13703p == null) {
            xsu0.m210834k("Signal utils is empty, ignoring.");
            return "";
        }
        ltr0 ltr0VarM171378c = ptr0VarMo13703p.m171378c();
        if (r0.getContext() == null) {
            xsu0.m210834k("Context is null, ignoring.");
            return "";
        }
        wat0 wat0Var = this.f9995a;
        return ltr0VarM171378c.mo136910g(wat0Var.getContext(), str, (View) wat0Var, wat0Var.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [l.cbt0, l.wat0] */
    @JavascriptInterface
    public String getViewSignals() {
        ?? r0 = this.f9995a;
        ptr0 ptr0VarMo13703p = r0.mo13703p();
        if (ptr0VarMo13703p == null) {
            xsu0.m210834k("Signal utils is empty, ignoring.");
            return "";
        }
        ltr0 ltr0VarM171378c = ptr0VarMo13703p.m171378c();
        if (r0.getContext() == null) {
            xsu0.m210834k("Context is null, ignoring.");
            return "";
        }
        wat0 wat0Var = this.f9995a;
        return ltr0VarM171378c.mo136911h(wat0Var.getContext(), (View) wat0Var, wat0Var.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            x2t0.m206869g("URL is empty, ignoring message");
        } else {
            C2075b.f9714l.post(new Runnable() { // from class: l.uat0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175634a.m13002a(str);
                }
            });
        }
    }
}
