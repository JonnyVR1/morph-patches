package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class khv0 implements xuw0 {

    /* JADX INFO: renamed from: a */
    public final lcw0 f126920a;

    /* JADX INFO: renamed from: b */
    public final k6u0 f126921b;

    /* JADX INFO: renamed from: c */
    public final uew0 f126922c;

    /* JADX INFO: renamed from: d */
    public final yew0 f126923d;

    /* JADX INFO: renamed from: e */
    public final Executor f126924e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f126925f;

    /* JADX INFO: renamed from: g */
    public final nzt0 f126926g;

    /* JADX INFO: renamed from: h */
    public final ehv0 f126927h;

    /* JADX INFO: renamed from: i */
    public final tcv0 f126928i;

    /* JADX INFO: renamed from: j */
    public final Context f126929j;

    /* JADX INFO: renamed from: k */
    public final cew0 f126930k;

    /* JADX INFO: renamed from: l */
    public final igv0 f126931l;

    public khv0(Context context, lcw0 lcw0Var, ehv0 ehv0Var, k6u0 k6u0Var, uew0 uew0Var, yew0 yew0Var, nzt0 nzt0Var, Executor executor, ScheduledExecutorService scheduledExecutorService, tcv0 tcv0Var, cew0 cew0Var, igv0 igv0Var) {
        this.f126929j = context;
        this.f126920a = lcw0Var;
        this.f126927h = ehv0Var;
        this.f126921b = k6u0Var;
        this.f126922c = uew0Var;
        this.f126923d = yew0Var;
        this.f126926g = nzt0Var;
        this.f126924e = executor;
        this.f126925f = scheduledExecutorService;
        this.f126928i = tcv0Var;
        this.f126930k = cew0Var;
        this.f126931l = igv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX INFO: renamed from: b */
    public static String m149828b(b7w0 b7w0Var) {
        String str = "No fill.";
        String str2 = true != ((Boolean) jas0.m144075c().m176505a(sgs0.f168491u5)).booleanValue() ? "No ad config." : "No fill.";
        int i = b7w0Var.f75343b.f68854b.f172371e;
        if (i == 0) {
            str = str2;
        } else if (i >= 200 && i < 300) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168479t5)).booleanValue()) {
                str = str2;
            }
        } else if (i < 300 || i >= 400) {
            str = "Received error HTTP response code: " + i;
        } else {
            str = "No location header to follow redirect or too many redirects.";
        }
        s6w0 s6w0Var = b7w0Var.f75343b.f68854b.f172375i;
        return s6w0Var != null ? s6w0Var.m184927a() : str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hpr m149829a(q6w0 q6w0Var, b7w0 b7w0Var, pcv0 pcv0Var, Throwable th) throws Exception {
        rdw0 rdw0VarM176209a = qdw0.m176209a(this.f126929j, 12);
        rdw0VarM176209a.mo162915z(q6w0Var.f155852F);
        rdw0VarM176209a.zzh();
        hpr hprVarM173988o = pvw0.m173988o(pcv0Var.mo98489b(b7w0Var, q6w0Var), q6w0Var.f155865S, TimeUnit.MILLISECONDS, this.f126925f);
        this.f126927h.m120864f(b7w0Var, q6w0Var, hprVarM173988o, this.f126922c);
        bew0.m103785a(hprVarM173988o, this.f126930k, rdw0VarM176209a);
        return hprVarM173988o;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[SYNTHETIC] */
    @Override // p153l.xuw0
    public final /* synthetic */ hpr zza(Object obj) throws Exception {
        Iterator it;
        pcv0 pcv0VarMo145142d;
        int i;
        final b7w0 b7w0Var = (b7w0) obj;
        String strM149828b = m149828b(b7w0Var);
        this.f126928i.m190517i(b7w0Var.f75343b.f68854b);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168327h8)).booleanValue() && (i = b7w0Var.f75343b.f68854b.f172371e) != 0 && (i < 200 || i >= 300)) {
            return pvw0.m173980g(new zzeml(3, strM149828b));
        }
        t6w0 t6w0Var = b7w0Var.f75343b.f68854b;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168465s3)).booleanValue()) {
            for (q6w0 q6w0Var : b7w0Var.f75343b.f68853a) {
                this.f126928i.m190512d(q6w0Var);
                it = q6w0Var.f155873a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.f126928i.m190514f(q6w0Var, 0L, v8w0.m200327d(1, null, null));
                        break;
                        break;
                    }
                    pcv0VarMo145142d = this.f126926g.mo145142d(q6w0Var.f155875b, (String) it.next());
                    if (pcv0VarMo145142d == null) {
                    }
                }
            }
        } else {
            String str = t6w0Var.f172381o;
            if (TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.f126928i.m190512d(q6w0Var);
                    it = q6w0Var.f155873a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.f126928i.m190514f(q6w0Var, 0L, v8w0.m200327d(1, null, null));
                            break;
                        }
                        pcv0VarMo145142d = this.f126926g.mo145142d(q6w0Var.f155875b, (String) it.next());
                        if (pcv0VarMo145142d == null && pcv0VarMo145142d.mo98488a(b7w0Var, q6w0Var)) {
                            break;
                        }
                    }
                }
            } else {
                this.f126928i.m190516h(str, b7w0Var.f75343b.f68853a);
            }
        }
        this.f126921b.m149283q0(new hut0(b7w0Var, this.f126923d, this.f126922c), this.f126924e);
        if (b7w0Var.f75343b.f68854b.f172382p > 1) {
            return this.f126931l.m139960b(b7w0Var);
        }
        mbw0 mbw0VarM115303a = rbw0.m180767c(pvw0.m173980g(new zzeml(3, m149828b(b7w0Var))), zzflg.RENDER_CONFIG_INIT, this.f126920a).m115303a();
        this.f126927h.m120869l();
        int i2 = 0;
        for (final q6w0 q6w0Var2 : b7w0Var.f75343b.f68853a) {
            for (String str2 : q6w0Var2.f155873a) {
                final pcv0 pcv0VarMo145142d2 = this.f126926g.mo145142d(q6w0Var2.f155875b, str2);
                if (pcv0VarMo145142d2 != null && pcv0VarMo145142d2.mo98488a(b7w0Var, q6w0Var2)) {
                    mbw0VarM115303a = this.f126920a.m120409b(zzflg.RENDER_CONFIG_WATERFALL, mbw0VarM115303a).m115310h("render-config-" + i2 + "-" + str2).m115305c(Throwable.class, new xuw0() { // from class: l.ihv0
                        @Override // p153l.xuw0
                        public final hpr zza(Object obj2) {
                            return this.f115020a.m149829a(q6w0Var2, b7w0Var, pcv0VarMo145142d2, (Throwable) obj2);
                        }
                    }).m115303a();
                    break;
                }
            }
            i2++;
        }
        final ehv0 ehv0Var = this.f126927h;
        Objects.requireNonNull(ehv0Var);
        mbw0VarM115303a.addListener(new Runnable() { // from class: l.jhv0
            @Override // java.lang.Runnable
            public final void run() {
                ehv0Var.m120867j();
            }
        }, this.f126924e);
        return mbw0VarM115303a;
    }
}
