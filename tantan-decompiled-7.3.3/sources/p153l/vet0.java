package p153l;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.C2098b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class vet0 {

    /* JADX INFO: renamed from: b */
    public long f183846b;

    /* JADX INFO: renamed from: a */
    public final long f183845a = TimeUnit.MILLISECONDS.toNanos(((Long) jas0.m144075c().m176505a(sgs0.f167951D)).longValue());

    /* JADX INFO: renamed from: c */
    public boolean f183847c = true;

    /* JADX INFO: renamed from: a */
    public final void m201076a(SurfaceTexture surfaceTexture, final zdt0 zdt0Var) {
        if (zdt0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f183847c) {
            long j = timestamp - this.f183846b;
            if (Math.abs(j) < this.f183845a) {
                return;
            }
        }
        this.f183847c = false;
        this.f183846b = timestamp;
        C2098b.f9751l.post(new Runnable() { // from class: l.uet0
            @Override // java.lang.Runnable
            public final void run() {
                zdt0Var.zzk();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m201077b() {
        this.f183847c = true;
    }
}
