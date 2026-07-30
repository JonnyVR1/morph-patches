package p149l;

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
public final class e8v0 implements rlw0 {

    /* JADX INFO: renamed from: a */
    public final f3w0 f89878a;

    /* JADX INFO: renamed from: b */
    public final ext0 f89879b;

    /* JADX INFO: renamed from: c */
    public final o5w0 f89880c;

    /* JADX INFO: renamed from: d */
    public final s5w0 f89881d;

    /* JADX INFO: renamed from: e */
    public final Executor f89882e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f89883f;

    /* JADX INFO: renamed from: g */
    public final hqt0 f89884g;

    /* JADX INFO: renamed from: h */
    public final y7v0 f89885h;

    /* JADX INFO: renamed from: i */
    public final n3v0 f89886i;

    /* JADX INFO: renamed from: j */
    public final Context f89887j;

    /* JADX INFO: renamed from: k */
    public final w4w0 f89888k;

    /* JADX INFO: renamed from: l */
    public final c7v0 f89889l;

    public e8v0(Context context, f3w0 f3w0Var, y7v0 y7v0Var, ext0 ext0Var, o5w0 o5w0Var, s5w0 s5w0Var, hqt0 hqt0Var, Executor executor, ScheduledExecutorService scheduledExecutorService, n3v0 n3v0Var, w4w0 w4w0Var, c7v0 c7v0Var) {
        this.f89887j = context;
        this.f89878a = f3w0Var;
        this.f89885h = y7v0Var;
        this.f89879b = ext0Var;
        this.f89880c = o5w0Var;
        this.f89881d = s5w0Var;
        this.f89884g = hqt0Var;
        this.f89882e = executor;
        this.f89883f = scheduledExecutorService;
        this.f89886i = n3v0Var;
        this.f89888k = w4w0Var;
        this.f89889l = c7v0Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX INFO: renamed from: b */
    public static String m115305b(vxv0 vxv0Var) {
        String str = "No fill.";
        String str2 = true != ((Boolean) d1s0.m109677c().m144697a(m7s0.f132420u5)).booleanValue() ? "No ad config." : "No fill.";
        int i = vxv0Var.f183478b.f178773b.f141058e;
        if (i == 0) {
            str = str2;
        } else if (i >= 200 && i < 300) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132408t5)).booleanValue()) {
                str = str2;
            }
        } else if (i < 300 || i >= 400) {
            str = "Received error HTTP response code: " + i;
        } else {
            str = "No location header to follow redirect or too many redirects.";
        }
        mxv0 mxv0Var = vxv0Var.f183478b.f178773b.f141062i;
        return mxv0Var != null ? mxv0Var.m156932a() : str;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m115306a(kxv0 kxv0Var, vxv0 vxv0Var, j3v0 j3v0Var, Throwable th) throws Exception {
        l4w0 l4w0VarM144514a = k4w0.m144514a(this.f89887j, 12);
        l4w0VarM144514a.mo129466z(kxv0Var.f125162F);
        l4w0VarM144514a.zzh();
        gnr gnrVarM142242o = jmw0.m142242o(j3v0Var.mo120128b(vxv0Var, kxv0Var), kxv0Var.f125175S, TimeUnit.MILLISECONDS, this.f89883f);
        this.f89885h.m213329f(vxv0Var, kxv0Var, gnrVarM142242o, this.f89880c);
        v4w0.m197065a(gnrVarM142242o, this.f89888k, l4w0VarM144514a);
        return gnrVarM142242o;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    /* JADX WARN: Code duplicated, block: B:23:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a1 A[SYNTHETIC] */
    @Override // p149l.rlw0
    public final /* synthetic */ gnr zza(Object obj) throws Exception {
        Iterator it;
        j3v0 j3v0VarMo110632d;
        int i;
        final vxv0 vxv0Var = (vxv0) obj;
        String strM115305b = m115305b(vxv0Var);
        this.f89886i.m157785i(vxv0Var.f183478b.f178773b);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132256h8)).booleanValue() && (i = vxv0Var.f183478b.f178773b.f141058e) != 0 && (i < 200 || i >= 300)) {
            return jmw0.m142234g(new zzeml(3, strM115305b));
        }
        nxv0 nxv0Var = vxv0Var.f183478b.f178773b;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132394s3)).booleanValue()) {
            for (kxv0 kxv0Var : vxv0Var.f183478b.f178772a) {
                this.f89886i.m157780d(kxv0Var);
                it = kxv0Var.f125183a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.f89886i.m157782f(kxv0Var, 0L, pzv0.m172256d(1, null, null));
                        break;
                        break;
                    }
                    j3v0VarMo110632d = this.f89884g.mo110632d(kxv0Var.f125185b, (String) it.next());
                    if (j3v0VarMo110632d == null) {
                    }
                }
            }
        } else {
            String str = nxv0Var.f141068o;
            if (TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.f89886i.m157780d(kxv0Var);
                    it = kxv0Var.f125183a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.f89886i.m157782f(kxv0Var, 0L, pzv0.m172256d(1, null, null));
                            break;
                        }
                        j3v0VarMo110632d = this.f89884g.mo110632d(kxv0Var.f125185b, (String) it.next());
                        if (j3v0VarMo110632d == null && j3v0VarMo110632d.mo120127a(vxv0Var, kxv0Var)) {
                            break;
                        }
                    }
                }
            } else {
                this.f89886i.m157784h(str, vxv0Var.f183478b.f178772a);
            }
        }
        this.f89879b.m114710q0(new blt0(vxv0Var, this.f89881d, this.f89880c), this.f89882e);
        if (vxv0Var.f183478b.f178773b.f141069p > 1) {
            return this.f89889l.m105642b(vxv0Var);
        }
        g2w0 g2w0VarM206873a = l2w0.m148323c(jmw0.m142234g(new zzeml(3, m115305b(vxv0Var))), zzflg.RENDER_CONFIG_INIT, this.f89878a).m206873a();
        this.f89885h.m213334l();
        int i2 = 0;
        for (final kxv0 kxv0Var2 : vxv0Var.f183478b.f178772a) {
            for (String str2 : kxv0Var2.f125183a) {
                final j3v0 j3v0VarMo110632d2 = this.f89884g.mo110632d(kxv0Var2.f125185b, str2);
                if (j3v0VarMo110632d2 != null && j3v0VarMo110632d2.mo120127a(vxv0Var, kxv0Var2)) {
                    g2w0VarM206873a = this.f89878a.m212753b(zzflg.RENDER_CONFIG_WATERFALL, g2w0VarM206873a).m206880h("render-config-" + i2 + "-" + str2).m206875c(Throwable.class, new rlw0() { // from class: l.c8v0
                        @Override // p149l.rlw0
                        public final gnr zza(Object obj2) {
                            return this.f79817a.m115306a(kxv0Var2, vxv0Var, j3v0VarMo110632d2, (Throwable) obj2);
                        }
                    }).m206873a();
                    break;
                }
            }
            i2++;
        }
        final y7v0 y7v0Var = this.f89885h;
        Objects.requireNonNull(y7v0Var);
        g2w0VarM206873a.addListener(new Runnable() { // from class: l.d8v0
            @Override // java.lang.Runnable
            public final void run() {
                y7v0Var.m213332j();
            }
        }, this.f89882e);
        return g2w0VarM206873a;
    }
}
