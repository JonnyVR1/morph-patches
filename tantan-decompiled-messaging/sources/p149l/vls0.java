package p149l;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.internal.ads.zzcei;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class vls0 {

    /* JADX INFO: renamed from: b */
    public final Context f181981b;

    /* JADX INFO: renamed from: c */
    public final String f181982c;

    /* JADX INFO: renamed from: d */
    public final zzcei f181983d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final b5w0 f181984e;

    /* JADX INFO: renamed from: f */
    public final h4s0 f181985f;

    /* JADX INFO: renamed from: g */
    public final h4s0 f181986g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public uls0 f181987h;

    /* JADX INFO: renamed from: a */
    public final Object f181980a = new Object();

    /* JADX INFO: renamed from: i */
    public int f181988i = 1;

    public vls0(Context context, zzcei zzceiVar, String str, h4s0 h4s0Var, h4s0 h4s0Var2, @Nullable b5w0 b5w0Var) {
        this.f181982c = str;
        this.f181981b = context.getApplicationContext();
        this.f181983d = zzceiVar;
        this.f181984e = b5w0Var;
        this.f181985f = h4s0Var;
        this.f181986g = h4s0Var2;
    }

    /* JADX INFO: renamed from: b */
    public final pls0 m198863b(@Nullable ptr0 ptr0Var) {
        xsu0.m210834k("getEngine: Trying to acquire lock");
        synchronized (this.f181980a) {
            try {
                xsu0.m210834k("getEngine: Lock acquired");
                xsu0.m210834k("refreshIfDestroyed: Trying to acquire lock");
                synchronized (this.f181980a) {
                    try {
                        xsu0.m210834k("refreshIfDestroyed: Lock acquired");
                        uls0 uls0Var = this.f181987h;
                        if (uls0Var != null && this.f181988i == 0) {
                            uls0Var.m114708e(new r3t0() { // from class: l.tks0
                                @Override // p149l.r3t0
                                public final void zza(Object obj) {
                                    this.f170912a.m198867k((iks0) obj);
                                }
                            }, new p3t0() { // from class: l.uks0
                                @Override // p149l.p3t0
                                public final void zza() {
                                }
                            });
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                xsu0.m210834k("refreshIfDestroyed: Lock released");
                uls0 uls0Var2 = this.f181987h;
                if (uls0Var2 != null && uls0Var2.m114705a() != -1) {
                    int i = this.f181988i;
                    if (i == 0) {
                        xsu0.m210834k("getEngine (NO_UPDATE): Lock released");
                        return this.f181987h.m194261f();
                    }
                    if (i != 1) {
                        xsu0.m210834k("getEngine (UPDATING): Lock released");
                        return this.f181987h.m194261f();
                    }
                    this.f181988i = 2;
                    m198864d(null);
                    xsu0.m210834k("getEngine (PENDING_UPDATE): Lock released");
                    return this.f181987h.m194261f();
                }
                this.f181988i = 2;
                this.f181987h = m198864d(null);
                xsu0.m210834k("getEngine (NULL or REJECTED): Lock released");
                return this.f181987h.m194261f();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final uls0 m198864d(@Nullable ptr0 ptr0Var) {
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f181981b, 6);
        l4w0VarM144514a.zzh();
        final uls0 uls0Var = new uls0(this.f181986g);
        xsu0.m210834k("loadJavascriptEngine > Before UI_THREAD_EXECUTOR");
        final ptr0 ptr0Var2 = null;
        i3t0.f111376e.execute(new Runnable(ptr0Var2, uls0Var) { // from class: l.xks0

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ uls0 f193350b;

            {
                this.f193350b = uls0Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f193349a.m198866j(null, this.f193350b);
            }
        });
        xsu0.m210834k("loadNewJavascriptEngine: Promise created");
        uls0Var.m114708e(new cls0(this, uls0Var, l4w0VarM144514a), new dls0(this, uls0Var, l4w0VarM144514a));
        return uls0Var;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m198865i(uls0 uls0Var, final iks0 iks0Var, ArrayList arrayList, long j) {
        xsu0.m210834k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Trying to acquire lock");
        synchronized (this.f181980a) {
            xsu0.m210834k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock acquired");
            if (uls0Var.m114705a() != -1 && uls0Var.m114705a() != 1) {
                uls0Var.m114706c();
                rmw0 rmw0Var = i3t0.f111376e;
                Objects.requireNonNull(iks0Var);
                rmw0Var.execute(new Runnable() { // from class: l.vks0
                    @Override // java.lang.Runnable
                    public final void run() {
                        iks0Var.zzc();
                    }
                });
                xsu0.m210834k("Could not receive /jsLoaded in " + String.valueOf(d1s0.m109677c().m144697a(m7s0.f132182c)) + " ms. JS engine session reference status(onEngLoadedTimeout) is " + uls0Var.m114705a() + ". Update status(onEngLoadedTimeout) is " + this.f181988i + ". LoadNewJavascriptEngine(onEngLoadedTimeout) latency is " + String.valueOf(arrayList.get(0)) + " ms. Total latency(onEngLoadedTimeout) is " + (vny0.m199064b().currentTimeMillis() - j) + " ms. Rejecting.");
                xsu0.m210834k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released");
                return;
            }
            xsu0.m210834k("loadJavascriptEngine > newEngine.setLoadedListener(postDelayed): Lock released, the promise is already settled");
        }
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m198866j(ptr0 ptr0Var, uls0 uls0Var) {
        long jCurrentTimeMillis = vny0.m199064b().currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            xsu0.m210834k("loadJavascriptEngine > Before createJavascriptEngine");
            qks0 qks0Var = new qks0(this.f181981b, this.f181983d, null, null);
            xsu0.m210834k("loadJavascriptEngine > After createJavascriptEngine");
            xsu0.m210834k("loadJavascriptEngine > Before setting new engine loaded listener");
            qks0Var.mo136895O(new wks0(this, arrayList, jCurrentTimeMillis, uls0Var, qks0Var));
            xsu0.m210834k("loadJavascriptEngine > Before registering GmsgHandler for /jsLoaded");
            qks0Var.mo175389q0("/jsLoaded", new yks0(this, jCurrentTimeMillis, uls0Var, qks0Var));
            yzs0 yzs0Var = new yzs0();
            zks0 zks0Var = new zks0(this, null, qks0Var, yzs0Var);
            yzs0Var.m216697b(zks0Var);
            xsu0.m210834k("loadJavascriptEngine > Before registering GmsgHandler for /requestReload");
            qks0Var.mo175389q0("/requestReload", zks0Var);
            xsu0.m210834k("loadJavascriptEngine > javascriptPath: ".concat(String.valueOf(this.f181982c)));
            if (this.f181982c.endsWith(".js")) {
                xsu0.m210834k("loadJavascriptEngine > Before newEngine.loadJavascript");
                qks0Var.mo136893A(this.f181982c);
                xsu0.m210834k("loadJavascriptEngine > After newEngine.loadJavascript");
            } else if (this.f181982c.startsWith("<html>")) {
                xsu0.m210834k("loadJavascriptEngine > Before newEngine.loadHtml");
                qks0Var.mo136896i(this.f181982c);
                xsu0.m210834k("loadJavascriptEngine > After newEngine.loadHtml");
            } else {
                xsu0.m210834k("loadJavascriptEngine > Before newEngine.loadHtmlWrapper");
                qks0Var.mo136894B(this.f181982c);
                xsu0.m210834k("loadJavascriptEngine > After newEngine.loadHtmlWrapper");
            }
            xsu0.m210834k("loadJavascriptEngine > Before calling ADMOB_UI_HANDLER.postDelayed");
            C2075b.f9714l.postDelayed(new bls0(this, uls0Var, qks0Var, arrayList, jCurrentTimeMillis), ((Integer) d1s0.m109677c().m144697a(m7s0.f132195d)).intValue());
        } catch (Throwable th) {
            x2t0.m206867e("Error creating webview.", th);
            vny0.m199079q().m212290w(th, "SdkJavascriptFactory.loadJavascriptEngine");
            uls0Var.m114706c();
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m198867k(iks0 iks0Var) {
        if (iks0Var.zzi()) {
            this.f181988i = 1;
        }
    }
}
