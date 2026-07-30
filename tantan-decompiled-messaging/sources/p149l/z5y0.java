package p149l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class z5y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f201873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f201874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f201875c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbf f201876d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f201877e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ b3y0 f201878f;

    public z5y0(b3y0 b3y0Var, boolean z, zzo zzoVar, boolean z2, zzbf zzbfVar, String str) {
        this.f201873a = z;
        this.f201874b = zzoVar;
        this.f201875c = z2;
        this.f201876d = zzbfVar;
        this.f201877e = str;
        this.f201878f = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long jElapsedRealtime;
        cjw0 cjw0Var = this.f201878f.f73268d;
        if (cjw0Var == null) {
            this.f201878f.zzj().m211412A().m123936a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f201873a) {
            Preconditions.checkNotNull(this.f201874b);
            this.f201878f.m100142K(cjw0Var, this.f201875c ? null : this.f201876d, this.f201874b);
        } else {
            boolean zM192648n = this.f201878f.mo15085a().m192648n(q8s0.f153227F0);
            try {
                if (TextUtils.isEmpty(this.f201877e)) {
                    Preconditions.checkNotNull(this.f201874b);
                    if (zM192648n) {
                        long jCurrentTimeMillis = this.f201878f.f165891a.zzb().currentTimeMillis();
                        try {
                            jElapsedRealtime = this.f201878f.f165891a.zzb().elapsedRealtime();
                            j = jCurrentTimeMillis;
                        } catch (RemoteException e) {
                            e = e;
                            jElapsedRealtime = 0;
                            j = jCurrentTimeMillis;
                            this.f201878f.zzj().m211412A().m123937b("Failed to send event to the service", e);
                            if (zM192648n && j != 0) {
                                puw0.m171484a(this.f201878f.f165891a).m171485b(36301, 13, j, this.f201878f.f165891a.zzb().currentTimeMillis(), (int) (this.f201878f.f165891a.zzb().elapsedRealtime() - jElapsedRealtime));
                            }
                            this.f201878f.m100127g0();
                        }
                    } else {
                        j = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        cjw0Var.mo107278r4(this.f201876d, this.f201874b);
                        if (zM192648n) {
                            this.f201878f.zzj().m211416E().m123936a("Logging telemetry for logEvent");
                            puw0.m171484a(this.f201878f.f165891a).m171485b(36301, 0, j, this.f201878f.f165891a.zzb().currentTimeMillis(), (int) (this.f201878f.f165891a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        this.f201878f.zzj().m211412A().m123937b("Failed to send event to the service", e);
                        if (zM192648n) {
                            puw0.m171484a(this.f201878f.f165891a).m171485b(36301, 13, j, this.f201878f.f165891a.zzb().currentTimeMillis(), (int) (this.f201878f.f165891a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else {
                    cjw0Var.mo107281y5(this.f201876d, this.f201877e, this.f201878f.zzj().m211420I());
                }
            } catch (RemoteException e3) {
                e = e3;
                j = 0;
                jElapsedRealtime = 0;
            }
        }
        this.f201878f.m100127g0();
    }
}
