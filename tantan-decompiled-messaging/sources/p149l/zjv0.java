package p149l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class zjv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final Context f203481a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f203482b;

    /* JADX INFO: renamed from: c */
    public final iyv0 f203483c;

    /* JADX INFO: renamed from: d */
    public final zzcei f203484d;

    public zjv0(Context context, rmw0 rmw0Var, iyv0 iyv0Var, zzcei zzceiVar) {
        this.f203481a = context;
        this.f203482b = rmw0Var;
        this.f203483c = iyv0Var;
        this.f203484d = zzceiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ akv0 m219150a() throws Exception {
        acw0 acw0Var;
        boolean z;
        boolean zM120488q;
        fcw0 fcw0VarM120480j;
        try {
            Context context = this.f203481a;
            boolean zM139022b = this.f203483c.m139022b();
            acw0 acw0Var2 = new acw0();
            acw0 acw0Var3 = new acw0();
            boolean zM120487p = true;
            if (zM139022b) {
                if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132015O2)).booleanValue()) {
                    return new akv0(true);
                }
            }
            if (!zM139022b) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131967K2)).booleanValue()) {
                    acw0Var2 = ecw0.m115755k(context).m115756i(((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                } else if (zM139022b) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131991M2)).booleanValue()) {
                        acw0Var2 = ecw0.m115755k(context).m115756i(((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                    }
                }
            } else if (zM139022b) {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131991M2)).booleanValue()) {
                    acw0Var2 = ecw0.m115755k(context).m115756i(((Long) d1s0.m109677c().m144697a(m7s0.f132135Y2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                }
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132099V2)).booleanValue()) {
                if (this.f203484d.zzc < ((Integer) d1s0.m109677c().m144697a(m7s0.f132087U2)).intValue()) {
                    fcw0.m120480j(context).m120482k();
                }
            }
            if (zM139022b) {
                if (zM139022b) {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132003N2)).booleanValue()) {
                        fcw0VarM120480j = fcw0.m120480j(context);
                        if (this.f203484d.zzc >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132087U2)).intValue()) {
                            acw0Var3 = fcw0VarM120480j.m120481i(((Long) d1s0.m109677c().m144697a(m7s0.f132147Z2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                            zM120487p = fcw0VarM120480j.m120487p();
                        }
                        zM120488q = fcw0VarM120480j.m120488q();
                        acw0Var = acw0Var3;
                        z = zM120487p;
                    }
                }
                acw0Var = acw0Var3;
                z = true;
                zM120488q = true;
            } else {
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131979L2)).booleanValue()) {
                    fcw0VarM120480j = fcw0.m120480j(context);
                    if (this.f203484d.zzc >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132087U2)).intValue()) {
                        acw0Var3 = fcw0VarM120480j.m120481i(((Long) d1s0.m109677c().m144697a(m7s0.f132147Z2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                        zM120487p = fcw0VarM120480j.m120487p();
                    }
                    zM120488q = fcw0VarM120480j.m120488q();
                    acw0Var = acw0Var3;
                    z = zM120487p;
                } else {
                    if (zM139022b) {
                        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132003N2)).booleanValue()) {
                            fcw0VarM120480j = fcw0.m120480j(context);
                            if (this.f203484d.zzc >= ((Integer) d1s0.m109677c().m144697a(m7s0.f132087U2)).intValue()) {
                                acw0Var3 = fcw0VarM120480j.m120481i(((Long) d1s0.m109677c().m144697a(m7s0.f132147Z2)).longValue(), vny0.m199079q().m212279i().mo96947f());
                                zM120487p = fcw0VarM120480j.m120487p();
                            }
                            zM120488q = fcw0VarM120480j.m120488q();
                            acw0Var = acw0Var3;
                            z = zM120487p;
                        }
                    }
                    acw0Var = acw0Var3;
                    z = true;
                    zM120488q = true;
                }
            }
            return new akv0(acw0Var2, acw0Var, z, zM120488q, zM139022b);
        } catch (IOException e) {
            vny0.m199079q().m212290w(e, "PerAppIdSignal");
            return new akv0(this.f203483c.m139022b());
        }
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 53;
    }

    @Override // p149l.qlv0
    public final gnr zzb() {
        return this.f203482b.mo122102R(new Callable() { // from class: l.yjv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f198692a.m219150a();
            }
        });
    }
}
