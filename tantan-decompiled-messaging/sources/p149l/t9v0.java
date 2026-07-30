package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzeir;
import com.p046p1.mobile.putong.core.data.NotificationStatus;

/* JADX INFO: loaded from: classes6.dex */
public final class t9v0 implements zyt0 {

    /* JADX INFO: renamed from: a */
    public boolean f169074a = false;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m3v0 f169075b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ n3t0 f169076c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ u9v0 f169077d;

    public t9v0(u9v0 u9v0Var, m3v0 m3v0Var, n3t0 n3t0Var) {
        this.f169075b = m3v0Var;
        this.f169076c = n3t0Var;
        this.f169077d = u9v0Var;
    }

    @Override // p149l.zyt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo187680a(int i, @Nullable String str) {
        try {
            if (this.f169074a) {
                return;
            }
            this.f169074a = true;
            if (str == null) {
                str = u9v0.m192664e(this.f169075b.f131186a, i);
            }
            m187681b(new zze(i, str, NotificationStatus.undefined, null, null));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m187681b(zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) d1s0.m109677c().m144697a(m7s0.f132396s5)).booleanValue()) {
            i = 3;
        }
        this.f169076c.m157775c(new zzeir(i, zzeVar));
    }

    @Override // p149l.zyt0
    /* JADX INFO: renamed from: t0 */
    public final synchronized void mo187682t0(zze zzeVar) {
        if (this.f169074a) {
            return;
        }
        this.f169074a = true;
        m187681b(zzeVar);
    }

    @Override // p149l.zyt0
    public final synchronized void zza(int i) {
        if (this.f169074a) {
            return;
        }
        this.f169074a = true;
        m187681b(new zze(i, u9v0.m192664e(this.f169075b.f131186a, i), NotificationStatus.undefined, null, null));
    }

    @Override // p149l.zyt0
    public final synchronized void zzd() {
        this.f169076c.m157774b(null);
    }
}
