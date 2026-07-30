package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzeir;

/* JADX INFO: loaded from: classes6.dex */
public final class ghv0 {

    /* JADX INFO: renamed from: a */
    public final f8w0 f104157a;

    /* JADX INFO: renamed from: b */
    public final xtu0 f104158b;

    /* JADX INFO: renamed from: c */
    public final xwu0 f104159c;

    /* JADX INFO: renamed from: d */
    public final vcw0 f104160d;

    public ghv0(f8w0 f8w0Var, xtu0 xtu0Var, xwu0 xwu0Var, vcw0 vcw0Var) {
        this.f104157a = f8w0Var;
        this.f104158b = xtu0Var;
        this.f104159c = xwu0Var;
        this.f104160d = vcw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m130262a(t6w0 t6w0Var, q6w0 q6w0Var, int i, zzeir zzeirVar, long j) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168554z8)).booleanValue()) {
            ucw0 ucw0VarM195443b = ucw0.m195443b("adapter_status");
            ucw0VarM195443b.m195449g(t6w0Var);
            ucw0VarM195443b.m195448f(q6w0Var);
            ucw0VarM195443b.m195445a("adapter_l", String.valueOf(j));
            ucw0VarM195443b.m195445a(Constants.INAPP_NOTIF_SHOW_CLOSE, Integer.toString(i));
            if (zzeirVar != null) {
                ucw0VarM195443b.m195445a("arec", Integer.toString(zzeirVar.zzb().zza));
                String strM124572a = this.f104157a.m124572a(zzeirVar.getMessage());
                if (strM124572a != null) {
                    ucw0VarM195443b.m195445a("areec", strM124572a);
                }
            }
            wtu0 wtu0VarM213105b = this.f104158b.m213105b(q6w0Var.f155913u);
            if (wtu0VarM213105b != null) {
                ucw0VarM195443b.m195445a("ancn", wtu0VarM213105b.f190814a);
                zzbvg zzbvgVar = wtu0VarM213105b.f190815b;
                if (zzbvgVar != null) {
                    ucw0VarM195443b.m195445a("adapter_v", zzbvgVar.toString());
                }
                zzbvg zzbvgVar2 = wtu0VarM213105b.f190816c;
                if (zzbvgVar2 != null) {
                    ucw0VarM195443b.m195445a("adapter_sv", zzbvgVar2.toString());
                }
            }
            this.f104160d.mo125151a(ucw0VarM195443b);
            return;
        }
        wwu0 wwu0VarM213443a = this.f104159c.m213443a();
        wwu0VarM213443a.m208310e(t6w0Var);
        wwu0VarM213443a.m208309d(q6w0Var);
        wwu0VarM213443a.m208307b("action", "adapter_status");
        wwu0VarM213443a.m208307b("adapter_l", String.valueOf(j));
        wwu0VarM213443a.m208307b(Constants.INAPP_NOTIF_SHOW_CLOSE, Integer.toString(i));
        if (zzeirVar != null) {
            wwu0VarM213443a.m208307b("arec", Integer.toString(zzeirVar.zzb().zza));
            String strM124572a2 = this.f104157a.m124572a(zzeirVar.getMessage());
            if (strM124572a2 != null) {
                wwu0VarM213443a.m208307b("areec", strM124572a2);
            }
        }
        wtu0 wtu0VarM213105b2 = this.f104158b.m213105b(q6w0Var.f155913u);
        if (wtu0VarM213105b2 != null) {
            wwu0VarM213443a.m208307b("ancn", wtu0VarM213105b2.f190814a);
            zzbvg zzbvgVar3 = wtu0VarM213105b2.f190815b;
            if (zzbvgVar3 != null) {
                wwu0VarM213443a.m208307b("adapter_v", zzbvgVar3.toString());
            }
            zzbvg zzbvgVar4 = wtu0VarM213105b2.f190816c;
            if (zzbvgVar4 != null) {
                wwu0VarM213443a.m208307b("adapter_sv", zzbvgVar4.toString());
            }
        }
        wwu0VarM213443a.m208312g();
    }
}
