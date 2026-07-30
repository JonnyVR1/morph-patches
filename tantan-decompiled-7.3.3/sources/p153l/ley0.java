package p153l;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;

/* JADX INFO: loaded from: classes6.dex */
public final class ley0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f131795a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wmu0 f131796b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hcy0 f131797c;

    public ley0(hcy0 hcy0Var, zzo zzoVar, wmu0 wmu0Var) {
        this.f131795a = zzoVar;
        this.f131796b = wmu0Var;
        this.f131797c = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            try {
                boolean zM15412z = this.f131797c.mo15142d().m98510G().m15412z();
                hcy0 hcy0Var = this.f131797c;
                if (!zM15412z) {
                    hcy0Var.zzj().m114564G().m153300a("Analytics storage consent denied; will not get app instance id");
                    this.f131797c.mo15150l().m15249U0(null);
                    this.f131797c.mo15142d().f71902i.m105277b(null);
                    this.f131797c.mo15143e().m136338N(this.f131796b, null);
                    return;
                }
                isw0 isw0Var = hcy0Var.f108759d;
                if (isw0Var == null) {
                    this.f131797c.zzj().m114558A().m153300a("Failed to get app instance id");
                    this.f131797c.mo15143e().m136338N(this.f131796b, null);
                    return;
                }
                Preconditions.checkNotNull(this.f131795a);
                String strMo112711U6 = isw0Var.mo112711U6(this.f131795a);
                if (strMo112711U6 != null) {
                    this.f131797c.mo15150l().m15249U0(strMo112711U6);
                    this.f131797c.mo15142d().f71902i.m105277b(strMo112711U6);
                }
                this.f131797c.m134527g0();
                this.f131797c.mo15143e().m136338N(this.f131796b, strMo112711U6);
            } catch (RemoteException e) {
                this.f131797c.zzj().m114558A().m153301b("Failed to get app instance id", e);
                this.f131797c.mo15143e().m136338N(this.f131796b, null);
            }
        } catch (Throwable th) {
            this.f131797c.mo15143e().m136338N(this.f131796b, null);
            throw th;
        }
    }
}
