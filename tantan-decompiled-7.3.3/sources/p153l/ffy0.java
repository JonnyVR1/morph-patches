package p153l;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ffy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f98848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzo f98849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f98850c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zzbf f98851d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f98852e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ hcy0 f98853f;

    public ffy0(hcy0 hcy0Var, boolean z, zzo zzoVar, boolean z2, zzbf zzbfVar, String str) {
        this.f98848a = z;
        this.f98849b = zzoVar;
        this.f98850c = z2;
        this.f98851d = zzbfVar;
        this.f98852e = str;
        this.f98853f = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long jElapsedRealtime;
        isw0 isw0Var = this.f98853f.f108759d;
        if (isw0Var == null) {
            this.f98853f.zzj().m114558A().m153300a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.f98848a) {
            Preconditions.checkNotNull(this.f98849b);
            this.f98853f.m134542K(isw0Var, this.f98850c ? null : this.f98851d, this.f98849b);
        } else {
            boolean zM98440n = this.f98853f.mo15139a().m98440n(whs0.f189203F0);
            try {
                if (TextUtils.isEmpty(this.f98852e)) {
                    Preconditions.checkNotNull(this.f98849b);
                    if (zM98440n) {
                        long jCurrentTimeMillis = this.f98853f.f202159a.zzb().currentTimeMillis();
                        try {
                            jElapsedRealtime = this.f98853f.f202159a.zzb().elapsedRealtime();
                            j = jCurrentTimeMillis;
                        } catch (RemoteException e) {
                            e = e;
                            jElapsedRealtime = 0;
                            j = jCurrentTimeMillis;
                            this.f98853f.zzj().m114558A().m153301b("Failed to send event to the service", e);
                            if (zM98440n && j != 0) {
                                v3x0.m199632a(this.f98853f.f202159a).m199633b(36301, 13, j, this.f98853f.f202159a.zzb().currentTimeMillis(), (int) (this.f98853f.f202159a.zzb().elapsedRealtime() - jElapsedRealtime));
                            }
                            this.f98853f.m134527g0();
                        }
                    } else {
                        j = 0;
                        jElapsedRealtime = 0;
                    }
                    try {
                        isw0Var.mo112721r4(this.f98851d, this.f98849b);
                        if (zM98440n) {
                            this.f98853f.zzj().m114562E().m153300a("Logging telemetry for logEvent");
                            v3x0.m199632a(this.f98853f.f202159a).m199633b(36301, 0, j, this.f98853f.f202159a.zzb().currentTimeMillis(), (int) (this.f98853f.f202159a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                        this.f98853f.zzj().m114558A().m153301b("Failed to send event to the service", e);
                        if (zM98440n) {
                            v3x0.m199632a(this.f98853f.f202159a).m199633b(36301, 13, j, this.f98853f.f202159a.zzb().currentTimeMillis(), (int) (this.f98853f.f202159a.zzb().elapsedRealtime() - jElapsedRealtime));
                        }
                    }
                } else {
                    isw0Var.mo112724y5(this.f98851d, this.f98852e, this.f98853f.zzj().m114566I());
                }
            } catch (RemoteException e3) {
                e = e3;
                j = 0;
                jElapsedRealtime = 0;
            }
        }
        this.f98853f.m134527g0();
    }
}
