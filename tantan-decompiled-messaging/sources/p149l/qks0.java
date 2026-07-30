package p149l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.eclipse.jetty.http.MimeTypes;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class qks0 implements iks0, gks0 {

    /* JADX INFO: renamed from: a */
    public final q9t0 f155161a;

    /* JADX WARN: Multi-variable type inference failed */
    public qks0(Context context, zzcei zzceiVar, @Nullable ptr0 ptr0Var, z0r0 z0r0Var) throws zzcjw {
        vny0.m199062B();
        q9t0 q9t0VarM110631a = dat0.m110631a(context, rbt0.m178692a(), "", false, false, null, null, zzceiVar, null, null, null, z2s0.m216992a(), null, null, null, null);
        this.f155161a = q9t0VarM110631a;
        ((View) q9t0VarM110631a).setWillNotDraw(true);
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m175384d0(Runnable runnable) {
        exr0.m118703b();
        if (i2t0.m134093w()) {
            xsu0.m210834k("runOnUiThread > the UI thread is the main thread, the runnable will be run now");
            runnable.run();
        } else {
            xsu0.m210834k("runOnUiThread > the UI thread is not the main thread, the runnable will be added to the message queue");
            if (C2075b.f9714l.post(runnable)) {
                return;
            }
            x2t0.m206869g("runOnUiThread > the runnable could not be placed to the message queue");
        }
    }

    @Override // p149l.iks0
    /* JADX INFO: renamed from: A */
    public final void mo136893A(String str) {
        xsu0.m210834k("loadJavascript on adWebView from path: ".concat(String.valueOf(str)));
        final String str2 = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        m175384d0(new Runnable() { // from class: l.oks0
            @Override // java.lang.Runnable
            public final void run() {
                this.f144457a.m175387U(str2);
            }
        });
    }

    @Override // p149l.iks0
    /* JADX INFO: renamed from: B */
    public final void mo136894B(final String str) {
        xsu0.m210834k("loadHtmlWrapper on adWebView from path: ".concat(String.valueOf(str)));
        m175384d0(new Runnable() { // from class: l.kks0
            @Override // java.lang.Runnable
            public final void run() {
                this.f123594a.m175386S(str);
            }
        });
    }

    @Override // p149l.iks0
    /* JADX INFO: renamed from: O */
    public final void mo136895O(final wks0 wks0Var) {
        hbt0 hbt0VarZzN = this.f155161a.zzN();
        Objects.requireNonNull(wks0Var);
        hbt0VarZzN.zzH(new gbt0() { // from class: l.lks0
            @Override // p149l.gbt0
            public final void zza() {
                long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
                wks0 wks0Var2 = wks0Var;
                final long j = wks0Var2.f186822c;
                final ArrayList arrayList = wks0Var2.f186821b;
                arrayList.add(Long.valueOf(jCurrentTimeMillis - j));
                xsu0.m210834k("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                obw0 obw0Var = C2075b.f9714l;
                final vls0 vls0Var = wks0Var2.f186820a;
                final uls0 uls0Var = wks0Var2.f186823d;
                final iks0 iks0Var = wks0Var2.f186824e;
                obw0Var.postDelayed(new Runnable() { // from class: l.sks0
                    @Override // java.lang.Runnable
                    public final void run() {
                        vls0Var.m198865i(uls0Var, iks0Var, arrayList, j);
                    }
                }, ((Integer) d1s0.m109677c().m144697a(m7s0.f132182c)).intValue());
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m175385R(String str) {
        this.f155161a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m175386S(String str) {
        this.f155161a.loadUrl(str);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m175387U(String str) {
        this.f155161a.loadData(str, MimeTypes.TEXT_HTML, "UTF-8");
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void mo13674Z(String str, Map map) {
        fks0.m121889a(this, str, map);
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo13677b(String str, String str2) {
        fks0.m121891c(this, str, str2);
    }

    @Override // p149l.iks0
    /* JADX INFO: renamed from: i */
    public final void mo136896i(final String str) {
        xsu0.m210834k("loadHtml on adWebView from html");
        m175384d0(new Runnable() { // from class: l.nks0
            @Override // java.lang.Runnable
            public final void run() {
                this.f139469a.m175385R(str);
            }
        });
    }

    @Override // p149l.wls0
    /* JADX INFO: renamed from: k0 */
    public final void mo175388k0(String str, final vgs0 vgs0Var) {
        this.f155161a.mo13711t0(str, new Predicate() { // from class: l.jks0
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                vgs0 vgs0Var2 = (vgs0) obj;
                if (vgs0Var2 instanceof pks0) {
                    return ((pks0) vgs0Var2).f150027a.equals(vgs0Var);
                }
                return false;
            }
        });
    }

    @Override // p149l.eks0
    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void mo13705q(String str, JSONObject jSONObject) {
        fks0.m121890b(this, str, jSONObject);
    }

    @Override // p149l.wls0
    /* JADX INFO: renamed from: q0 */
    public final void mo175389q0(String str, vgs0 vgs0Var) {
        this.f155161a.mo13693j0(str, new pks0(this, vgs0Var));
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m175390z(String str) {
        this.f155161a.zza(str);
    }

    @Override // p149l.rks0
    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void mo13723z0(String str, JSONObject jSONObject) {
        fks0.m121892d(this, str, jSONObject);
    }

    @Override // p149l.rks0
    public final void zza(final String str) {
        xsu0.m210834k("invokeJavascript on adWebView from js");
        m175384d0(new Runnable() { // from class: l.mks0
            @Override // java.lang.Runnable
            public final void run() {
                this.f134378a.m175390z(str);
            }
        });
    }

    @Override // p149l.iks0
    public final void zzc() {
        this.f155161a.destroy();
    }

    @Override // p149l.iks0
    public final boolean zzi() {
        return this.f155161a.mo13670V();
    }

    @Override // p149l.iks0
    public final xls0 zzj() {
        return new xls0(this);
    }
}
