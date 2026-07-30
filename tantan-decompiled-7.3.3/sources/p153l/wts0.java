package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class wts0 implements ots0, mts0 {

    /* JADX INFO: renamed from: a */
    public final wit0 f190807a;

    /* JADX WARN: Multi-variable type inference failed */
    public wts0(Context context, zzcei zzceiVar, @Nullable v2s0 v2s0Var, far0 far0Var) throws zzcjw {
        bxy0.m106916B();
        wit0 wit0VarM145141a = jjt0.m145141a(context, xkt0.m211415a(), "", false, false, null, null, zzceiVar, null, null, null, fcs0.m125045a(), null, null, null, null);
        this.f190807a = wit0VarM145141a;
        ((View) wit0VarM145141a).setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m207908d0(Runnable runnable) {
        k6s0.m148569b();
        if (obt0.m167046w()) {
            d2v0.m113737k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            d2v0.m113737k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (C2098b.f9751l.post(runnable)) {
                return;
            }
            dct0.m115298g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // p153l.ots0
    /* JADX INFO: renamed from: A */
    public final void mo169178A(String str) {
        d2v0.m113737k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        m207908d0(new Runnable() { // from class: l.uts0
            @Override // java.lang.Runnable
            public final void run() {
                this.f180993a.m207911U(str2);
            }
        });
    }

    @Override // p153l.ots0
    /* JADX INFO: renamed from: B */
    public final void mo169179B(final String str) {
        d2v0.m113737k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        m207908d0(new Runnable() { // from class: l.qts0
            @Override // java.lang.Runnable
            public final void run() {
                this.f159482a.m207910S(str);
            }
        });
    }

    @Override // p153l.ots0
    /* JADX INFO: renamed from: O */
    public final void mo169180O(final cus0 cus0Var) {
        nkt0 nkt0VarZzN = this.f190807a.zzN();
        Objects.requireNonNull(cus0Var);
        nkt0VarZzN.zzH(new mkt0() { // from class: l.rts0
            @Override // p153l.mkt0
            public final void zza() {
                long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
                cus0 cus0Var2 = cus0Var;
                final long j = cus0Var2.f83892c;
                final ArrayList arrayList = cus0Var2.f83891b;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                d2v0.m113737k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                ukw0 ukw0Var = C2098b.f9751l;
                final bvs0 bvs0Var = cus0Var2.f83890a;
                final avs0 avs0Var = cus0Var2.f83893d;
                final ots0 ots0Var = cus0Var2.f83894e;
                ukw0Var.postDelayed(new Runnable() { // from class: l.yts0
                    @Override // java.lang.Runnable
                    public final void run() {
                        bvs0Var.m106607i(avs0Var, ots0Var, arrayList, j);
                    }
                }, ((Integer) jas0.m144075c().m176505a(sgs0.f168253c)).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m207909R(String str) {
        this.f190807a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m207910S(String str) {
        this.f190807a.loadUrl(str);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m207911U(String str) {
        this.f190807a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13728Z(String str, Map map) {
        lts0.m155807a(this, str, map);
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo13731b(String str, String str2) {
        lts0.m155809c(this, str, str2);
    }

    @Override // p153l.ots0
    /* JADX INFO: renamed from: i */
    public final void mo169181i(final String str) {
        d2v0.m113737k("loadHtml on adWebView from html");
        m207908d0(new Runnable() { // from class: l.tts0
            @Override // java.lang.Runnable
            public final void run() {
                this.f176101a.m207909R(str);
            }
        });
    }

    @Override // p153l.cvs0
    /* JADX INFO: renamed from: k0 */
    public final void mo112871k0(String str, final bqs0 bqs0Var) {
        this.f190807a.mo13765t0(str, new Predicate() { // from class: l.pts0
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                bqs0 bqs0Var2 = (bqs0) obj;
                if (bqs0Var2 instanceof vts0) {
                    return ((vts0) bqs0Var2).f185744a.equals(bqs0Var);
                }
                return false;
            }
        });
    }

    @Override // p153l.kts0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo13759q(String str, JSONObject jSONObject) {
        lts0.m155808b(this, str, jSONObject);
    }

    @Override // p153l.cvs0
    /* JADX INFO: renamed from: q0 */
    public final void mo112872q0(String str, bqs0 bqs0Var) {
        this.f190807a.mo13747j0(str, new vts0(this, bqs0Var));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m207912z(String str) {
        this.f190807a.zza(str);
    }

    @Override // p153l.xts0
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void mo13777z0(String str, JSONObject jSONObject) {
        lts0.m155810d(this, str, jSONObject);
    }

    @Override // p153l.xts0
    public final void zza(final String str) {
        d2v0.m113737k("invokeJavascript on adWebView from js");
        m207908d0(new Runnable() { // from class: l.sts0
            @Override // java.lang.Runnable
            public final void run() {
                this.f170603a.m207912z(str);
            }
        });
    }

    @Override // p153l.ots0
    public final void zzc() {
        this.f190807a.destroy();
    }

    @Override // p153l.ots0
    public final boolean zzi() {
        return this.f190807a.mo13724V();
    }

    @Override // p153l.ots0
    public final dvs0 zzj() {
        return new dvs0(this);
    }
}
