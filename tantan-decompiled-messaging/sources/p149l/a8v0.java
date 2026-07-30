package p149l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzeir;

/* JADX INFO: loaded from: classes6.dex */
public final class a8v0 {

    /* JADX INFO: renamed from: a */
    public final zyv0 f68078a;

    /* JADX INFO: renamed from: b */
    public final rku0 f68079b;

    /* JADX INFO: renamed from: c */
    public final rnu0 f68080c;

    /* JADX INFO: renamed from: d */
    public final p3w0 f68081d;

    public a8v0(zyv0 zyv0Var, rku0 rku0Var, rnu0 rnu0Var, p3w0 p3w0Var) {
        this.f68078a = zyv0Var;
        this.f68079b = rku0Var;
        this.f68080c = rnu0Var;
        this.f68081d = p3w0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m95372a(nxv0 nxv0Var, kxv0 kxv0Var, int i, zzeir zzeirVar, long j) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132483z8)).booleanValue()) {
            o3w0 o3w0VarM162489b = o3w0.m162489b("adapter_status");
            o3w0VarM162489b.m162495g(nxv0Var);
            o3w0VarM162489b.m162494f(kxv0Var);
            o3w0VarM162489b.m162491a("adapter_l", String.valueOf(j));
            o3w0VarM162489b.m162491a(Constants.INAPP_NOTIF_SHOW_CLOSE, Integer.toString(i));
            if (zzeirVar != null) {
                o3w0VarM162489b.m162491a("arec", Integer.toString(zzeirVar.zzb().zza));
                String strM220950a = this.f68078a.m220950a(zzeirVar.getMessage());
                if (strM220950a != null) {
                    o3w0VarM162489b.m162491a("areec", strM220950a);
                }
            }
            qku0 qku0VarM179766b = this.f68079b.m179766b(kxv0Var.f125223u);
            if (qku0VarM179766b != null) {
                o3w0VarM162489b.m162491a("ancn", qku0VarM179766b.f155170a);
                zzbvg zzbvgVar = qku0VarM179766b.f155171b;
                if (zzbvgVar != null) {
                    o3w0VarM162489b.m162491a("adapter_v", zzbvgVar.toString());
                }
                zzbvg zzbvgVar2 = qku0VarM179766b.f155172c;
                if (zzbvgVar2 != null) {
                    o3w0VarM162489b.m162491a("adapter_sv", zzbvgVar2.toString());
                }
            }
            this.f68081d.mo124429a(o3w0VarM162489b);
            return;
        }
        qnu0 qnu0VarM180208a = this.f68080c.m180208a();
        qnu0VarM180208a.m175696e(nxv0Var);
        qnu0VarM180208a.m175695d(kxv0Var);
        qnu0VarM180208a.m175693b("action", "adapter_status");
        qnu0VarM180208a.m175693b("adapter_l", String.valueOf(j));
        qnu0VarM180208a.m175693b(Constants.INAPP_NOTIF_SHOW_CLOSE, Integer.toString(i));
        if (zzeirVar != null) {
            qnu0VarM180208a.m175693b("arec", Integer.toString(zzeirVar.zzb().zza));
            String strM220950a2 = this.f68078a.m220950a(zzeirVar.getMessage());
            if (strM220950a2 != null) {
                qnu0VarM180208a.m175693b("areec", strM220950a2);
            }
        }
        qku0 qku0VarM179766b2 = this.f68079b.m179766b(kxv0Var.f125223u);
        if (qku0VarM179766b2 != null) {
            qnu0VarM180208a.m175693b("ancn", qku0VarM179766b2.f155170a);
            zzbvg zzbvgVar3 = qku0VarM179766b2.f155171b;
            if (zzbvgVar3 != null) {
                qnu0VarM180208a.m175693b("adapter_v", zzbvgVar3.toString());
            }
            zzbvg zzbvgVar4 = qku0VarM179766b2.f155172c;
            if (zzbvgVar4 != null) {
                qnu0VarM180208a.m175693b("adapter_sv", zzbvgVar4.toString());
            }
        }
        qnu0VarM180208a.m175698g();
    }
}
