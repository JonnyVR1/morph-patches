package p153l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class tfy0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f174025a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f174026b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzo f174027c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wmu0 f174028d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ hcy0 f174029e;

    public tfy0(hcy0 hcy0Var, String str, String str2, zzo zzoVar, wmu0 wmu0Var) {
        this.f174025a = str;
        this.f174026b = str2;
        this.f174027c = zzoVar;
        this.f174028d = wmu0Var;
        this.f174029e = hcy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                isw0 isw0Var = this.f174029e.f108759d;
                if (isw0Var == null) {
                    this.f174029e.zzj().m114558A().m153302c("Failed to get conditional properties; not connected to service", this.f174025a, this.f174026b);
                    this.f174029e.mo15143e().m136340O(this.f174028d, arrayList);
                } else {
                    Preconditions.checkNotNull(this.f174027c);
                    ArrayList<Bundle> arrayListM136312n0 = hny0.m136312n0(isw0Var.mo112725z0(this.f174025a, this.f174026b, this.f174027c));
                    this.f174029e.m134527g0();
                    this.f174029e.mo15143e().m136340O(this.f174028d, arrayListM136312n0);
                }
            } catch (RemoteException e) {
                this.f174029e.zzj().m114558A().m153303d("Failed to get conditional properties; remote exception", this.f174025a, this.f174026b, e);
                this.f174029e.mo15143e().m136340O(this.f174028d, arrayList);
            }
        } catch (Throwable th) {
            this.f174029e.mo15143e().m136340O(this.f174028d, arrayList);
            throw th;
        }
    }
}
