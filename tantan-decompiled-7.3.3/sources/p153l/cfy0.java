package p153l;

import android.os.RemoteException;
import com.google.android.gms.measurement.internal.zzbf;

/* JADX INFO: loaded from: classes6.dex */
public final class cfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzbf f81606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f81607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wmu0 f81608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ hcy0 f81609d;

    public cfy0(hcy0 hcy0Var, zzbf zzbfVar, String str, wmu0 wmu0Var) {
        this.f81606a = zzbfVar;
        this.f81607b = str;
        this.f81608c = wmu0Var;
        this.f81609d = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                isw0 isw0Var = this.f81609d.f108759d;
                if (isw0Var == null) {
                    this.f81609d.zzj().m114558A().m153300a("Discarding data. Failed to send event to service to bundle");
                    this.f81609d.mo15143e().m136343Q(this.f81608c, null);
                } else {
                    byte[] bArrMo112714V7 = isw0Var.mo112714V7(this.f81606a, this.f81607b);
                    this.f81609d.m134527g0();
                    this.f81609d.mo15143e().m136343Q(this.f81608c, bArrMo112714V7);
                }
            } catch (RemoteException e) {
                this.f81609d.zzj().m114558A().m153301b("Failed to send event to the service to bundle", e);
                this.f81609d.mo15143e().m136343Q(this.f81608c, null);
            }
        } catch (Throwable th) {
            this.f81609d.mo15143e().m136343Q(this.f81608c, null);
            throw th;
        }
    }
}
