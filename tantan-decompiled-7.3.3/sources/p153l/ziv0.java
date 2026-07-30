package p153l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzeir;
import com.p051p1.mobile.putong.core.data.NotificationStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class ziv0 implements f8u0 {

    /* JADX INFO: renamed from: a */
    public boolean f204624a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ scv0 f204625b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tct0 f204626c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ajv0 f204627d;

    public ziv0(ajv0 ajv0Var, scv0 scv0Var, tct0 tct0Var) {
        this.f204625b = scv0Var;
        this.f204626c = tct0Var;
        this.f204627d = ajv0Var;
    }

    @Override // p153l.f8u0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo124563a(int i, @Nullable String str) {
        try {
            if (this.f204624a) {
                return;
            }
            this.f204624a = true;
            if (str == null) {
                str = ajv0.m98487e(this.f204625b.f167347a, i);
            }
            m219948b(new zze(i, str, NotificationStatus.undefined, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m219948b(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) jas0.m144075c().m176505a(sgs0.f168467s5)).booleanValue()) {
            i = 3;
        }
        this.f204626c.m190495c(new zzeir(i, zzeVar));
    }

    @Override // p153l.f8u0
    /* JADX INFO: renamed from: t0 */
    public final synchronized void mo124564t0(zze zzeVar) {
        if (this.f204624a) {
            return;
        }
        this.f204624a = true;
        m219948b(zzeVar);
    }

    @Override // p153l.f8u0
    public final synchronized void zza(int i) {
        if (this.f204624a) {
            return;
        }
        this.f204624a = true;
        m219948b(new zze(i, ajv0.m98487e(this.f204625b.f167347a, i), NotificationStatus.undefined, null, null));
    }

    @Override // p153l.f8u0
    public final synchronized void zzd() {
        this.f204626c.m190494b(null);
    }
}
