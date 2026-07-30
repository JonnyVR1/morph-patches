package p153l;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcei;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ftv0 implements wuv0 {

    /* JADX INFO: renamed from: a */
    public final Context f100810a;

    /* JADX INFO: renamed from: b */
    public final xvw0 f100811b;

    /* JADX INFO: renamed from: c */
    public final o7w0 f100812c;

    /* JADX INFO: renamed from: d */
    public final zzcei f100813d;

    public ftv0(Context context, xvw0 xvw0Var, o7w0 o7w0Var, zzcei zzceiVar) {
        this.f100810a = context;
        this.f100811b = xvw0Var;
        this.f100812c = o7w0Var;
        this.f100813d = zzceiVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00ed A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00ed, B:31:0x0111, B:33:0x011c, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gtv0 m127400a() throws Exception {
        glw0 glw0Var;
        boolean z;
        boolean zM154799q;
        llw0 llw0VarM154791j;
        try {
            Context context = this.f100810a;
            boolean zM166386b = this.f100812c.m166386b();
            glw0 glw0Var2 = new glw0();
            glw0 glw0Var3 = new glw0();
            boolean zM154798p = true;
            if (zM166386b) {
                if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168086O2)).booleanValue()) {
                    return new gtv0(true);
                }
            }
            if (!zM166386b) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168038K2)).booleanValue()) {
                    glw0Var2 = klw0.m150399k(context).m150400i(((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                } else if (zM166386b) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168062M2)).booleanValue()) {
                        glw0Var2 = klw0.m150399k(context).m150400i(((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                    }
                }
            } else if (zM166386b) {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168062M2)).booleanValue()) {
                    glw0Var2 = klw0.m150399k(context).m150400i(((Long) jas0.m144075c().m176505a(sgs0.f168206Y2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                }
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168170V2)).booleanValue()) {
                if (this.f100813d.zzc < ((Integer) jas0.m144075c().m176505a(sgs0.f168158U2)).intValue()) {
                    llw0.m154791j(context).m154793k();
                }
            }
            if (zM166386b) {
                if (zM166386b) {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168074N2)).booleanValue()) {
                        llw0VarM154791j = llw0.m154791j(context);
                        if (this.f100813d.zzc >= ((Integer) jas0.m144075c().m176505a(sgs0.f168158U2)).intValue()) {
                            glw0Var3 = llw0VarM154791j.m154792i(((Long) jas0.m144075c().m176505a(sgs0.f168218Z2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                            zM154798p = llw0VarM154791j.m154798p();
                        }
                        zM154799q = llw0VarM154791j.m154799q();
                        glw0Var = glw0Var3;
                        z = zM154798p;
                    }
                }
                glw0Var = glw0Var3;
                z = true;
                zM154799q = true;
            } else {
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168050L2)).booleanValue()) {
                    llw0VarM154791j = llw0.m154791j(context);
                    if (this.f100813d.zzc >= ((Integer) jas0.m144075c().m176505a(sgs0.f168158U2)).intValue()) {
                        glw0Var3 = llw0VarM154791j.m154792i(((Long) jas0.m144075c().m176505a(sgs0.f168218Z2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                        zM154798p = llw0VarM154791j.m154798p();
                    }
                    zM154799q = llw0VarM154791j.m154799q();
                    glw0Var = glw0Var3;
                    z = zM154798p;
                } else {
                    if (zM166386b) {
                        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168074N2)).booleanValue()) {
                            llw0VarM154791j = llw0.m154791j(context);
                            if (this.f100813d.zzc >= ((Integer) jas0.m144075c().m176505a(sgs0.f168158U2)).intValue()) {
                                glw0Var3 = llw0VarM154791j.m154792i(((Long) jas0.m144075c().m176505a(sgs0.f168218Z2)).longValue(), bxy0.m106933q().m120264i().mo131896f());
                                zM154798p = llw0VarM154791j.m154798p();
                            }
                            zM154799q = llw0VarM154791j.m154799q();
                            glw0Var = glw0Var3;
                            z = zM154798p;
                        }
                    }
                    glw0Var = glw0Var3;
                    z = true;
                    zM154799q = true;
                }
            }
            return new gtv0(glw0Var2, glw0Var, z, zM154799q, zM166386b);
        } catch (IOException e) {
            bxy0.m106933q().m120275w(e, "PerAppIdSignal");
            return new gtv0(this.f100812c.m166386b());
        }
    }

    @Override // p153l.wuv0
    public final int zza() {
        return 53;
    }

    @Override // p153l.wuv0
    public final hpr zzb() {
        return this.f100811b.mo155969R(new Callable() { // from class: l.etv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f95818a.m127400a();
            }
        });
    }
}
