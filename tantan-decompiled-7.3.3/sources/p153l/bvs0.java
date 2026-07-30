package p153l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class bvs0 {

    /* JADX INFO: renamed from: b */
    public final Context f78624b;

    /* JADX INFO: renamed from: c */
    public final String f78625c;

    /* JADX INFO: renamed from: d */
    public final zzcei f78626d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final hew0 f78627e;

    /* JADX INFO: renamed from: f */
    public final nds0 f78628f;

    /* JADX INFO: renamed from: g */
    public final nds0 f78629g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public avs0 f78630h;

    /* JADX INFO: renamed from: a */
    public final Object f78623a = new Object();

    /* JADX INFO: renamed from: i */
    public int f78631i = 1;

    public bvs0(Context context, zzcei zzceiVar, String str, nds0 nds0Var, nds0 nds0Var2, @Nullable hew0 hew0Var) {
        this.f78625c = str;
        this.f78624b = context.getApplicationContext();
        this.f78626d = zzceiVar;
        this.f78627e = hew0Var;
        this.f78628f = nds0Var;
        this.f78629g = nds0Var2;
    }

    /* JADX INFO: renamed from: b */
    public final vus0 m106605b(@Nullable v2s0 v2s0Var) {
        d2v0.m113737k("getEngine: Trying to acquire lock");
        synchronized (this.f78623a) {
            try {
                d2v0.m113737k("getEngine: Lock acquired");
                d2v0.m113737k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f78623a) {
                    try {
                        d2v0.m113737k("refreshIfDestroyed: Lock acquired");
                        avs0 avs0Var = this.f78630h;
                        if (avs0Var != null && this.f78631i == 0) {
                            avs0Var.m149269e(new xct0() { // from class: l.zts0
                                @Override // p153l.xct0
                                public final void zza(Object obj) {
                                    this.f206038a.m106609k((ots0) obj);
                                }
                            }, new vct0() { // from class: l.aus0
                                @Override // p153l.vct0
                                public final void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                d2v0.m113737k("refreshIfDestroyed: Lock released");
                avs0 avs0Var2 = this.f78630h;
                if (avs0Var2 != null && avs0Var2.m149266a() != -1) {
                    int i = this.f78631i;
                    if (i == 0) {
                        d2v0.m113737k("getEngine (NO_UPDATE): Lock released");
                        return this.f78630h.m100515f();
                    }
                    if (i != 1) {
                        d2v0.m113737k("getEngine (UPDATING): Lock released");
                        return this.f78630h.m100515f();
                    }
                    this.f78631i = 2;
                    m106606d(null);
                    d2v0.m113737k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f78630h.m100515f();
                }
                this.f78631i = 2;
                this.f78630h = m106606d(null);
                d2v0.m113737k("getEngine (NULL or REJECTED): Lock released");
                return this.f78630h.m100515f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final avs0 m106606d(@Nullable v2s0 v2s0Var) {
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f78624b, 6);
        rdw0VarM176209a.zzh();
        final avs0 avs0Var = new avs0(this.f78629g);
        d2v0.m113737k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final v2s0 v2s0Var2 = null;
        oct0.f146737e.execute(new Runnable(v2s0Var2, avs0Var) { // from class: l.dus0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ avs0 f90850b;

            {
                this.f90850b = avs0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f90849a.m106608j(null, this.f90850b);
            }
        });
        d2v0.m113737k("loadNewJavascriptEngine: Promise created");
        avs0Var.m149269e(new ius0(this, avs0Var, rdw0VarM176209a), new jus0(this, avs0Var, rdw0VarM176209a));
        return avs0Var;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m106607i(avs0 avs0Var, final ots0 ots0Var, ArrayList arrayList, long j) {
        d2v0.m113737k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f78623a) {
            d2v0.m113737k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (avs0Var.m149266a() != -1 && avs0Var.m149266a() != 1) {
                avs0Var.m149267c();
                xvw0 xvw0Var = oct0.f146737e;
                Objects.requireNonNull(ots0Var);
                xvw0Var.execute(new Runnable() { // from class: l.bus0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ots0Var.zzc();
                    }
                });
                d2v0.m113737k("Could not receive /jsLoaded in " + String.valueOf(jas0.m144075c().m176505a(sgs0.f168253c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + avs0Var.m149266a() + ". Update status(onEngLoadedTimeout) is " + this.f78631i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (bxy0.m106918b().currentTimeMillis() - j) + " ms. Rejecting.");
                d2v0.m113737k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            d2v0.m113737k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m106608j(v2s0 v2s0Var, avs0 avs0Var) {
        long jCurrentTimeMillis = bxy0.m106918b().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            d2v0.m113737k("loadJavascriptEngine > Before createJavascriptEngine");
            wts0 wts0Var = new wts0(this.f78624b, this.f78626d, null, null);
            d2v0.m113737k("loadJavascriptEngine > After createJavascriptEngine");
            d2v0.m113737k("loadJavascriptEngine > Before setting new engine loaded listener");
            wts0Var.mo169180O(new cus0(this, arrayList, jCurrentTimeMillis, avs0Var, wts0Var));
            d2v0.m113737k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            wts0Var.mo112872q0("/jsLoaded", new eus0(this, jCurrentTimeMillis, avs0Var, wts0Var));
            e9t0 e9t0Var = new e9t0();
            fus0 fus0Var = new fus0(this, null, wts0Var, e9t0Var);
            e9t0Var.m119956b(fus0Var);
            d2v0.m113737k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            wts0Var.mo112872q0("/requestReload", fus0Var);
            d2v0.m113737k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f78625c)));
            if (this.f78625c.endsWith(".js")) {
                d2v0.m113737k("loadJavascriptEngine > Before newEngine.loadJavascript");
                wts0Var.mo169178A(this.f78625c);
                d2v0.m113737k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f78625c.startsWith("<html>")) {
                d2v0.m113737k("loadJavascriptEngine > Before newEngine.loadHtml");
                wts0Var.mo169181i(this.f78625c);
                d2v0.m113737k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                d2v0.m113737k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                wts0Var.mo169179B(this.f78625c);
                d2v0.m113737k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            d2v0.m113737k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            C2098b.f9751l.postDelayed(new hus0(this, avs0Var, wts0Var, arrayList, jCurrentTimeMillis), ((Integer) jas0.m144075c().m176505a(sgs0.f168266d)).intValue());
        } catch (Throwable th) {
            dct0.m115296e("Error creating webview.", th);
            bxy0.m106933q().m120275w(th, "SdkJavascriptFactory.loadJavascriptEngine");
            avs0Var.m149267c();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m106609k(ots0 ots0Var) {
        if (ots0Var.zzi()) {
            this.f78631i = 1;
        }
    }
}
