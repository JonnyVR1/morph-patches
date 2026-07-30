package p149l;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.C2075b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class p5t0 {

    /* JADX INFO: renamed from: b */
    public long f147323b;

    /* JADX INFO: renamed from: a */
    public final long f147322a = TimeUnit.MILLISECONDS.toNanos(((Long) d1s0.m109677c().m144697a(m7s0.f131880D)).longValue());

    /* JADX INFO: renamed from: c */
    public boolean f147324c = true;

    /* JADX INFO: renamed from: a */
    public final void m167513a(SurfaceTexture surfaceTexture, final t4t0 t4t0Var) {
        if (t4t0Var == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.f147324c) {
            long j = timestamp - this.f147323b;
            if (Math.abs(j) < this.f147322a) {
                return;
            }
        }
        this.f147324c = false;
        this.f147323b = timestamp;
        C2075b.f9714l.post(new Runnable() { // from class: l.o5t0
            @Override // java.lang.Runnable
            public final void run() {
                t4t0Var.zzk();
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public final void m167514b() {
        this.f147324c = true;
    }
}
