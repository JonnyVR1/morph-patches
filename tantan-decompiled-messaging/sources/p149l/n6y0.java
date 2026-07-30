package p149l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class n6y0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f137465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f137466b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zzo f137467c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qdu0 f137468d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ b3y0 f137469e;

    public n6y0(b3y0 b3y0Var, String str, String str2, zzo zzoVar, qdu0 qdu0Var) {
        this.f137465a = str;
        this.f137466b = str2;
        this.f137467c = zzoVar;
        this.f137468d = qdu0Var;
        this.f137469e = b3y0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<Bundle> arrayList = new ArrayList<>();
        try {
            try {
                cjw0 cjw0Var = this.f137469e.f73268d;
                if (cjw0Var == null) {
                    this.f137469e.zzj().m211412A().m123938c("Failed to get conditional properties; not connected to service", this.f137465a, this.f137466b);
                    this.f137469e.mo15089e().m101473O(this.f137468d, arrayList);
                } else {
                    Preconditions.checkNotNull(this.f137467c);
                    ArrayList<Bundle> arrayListM101445n0 = bey0.m101445n0(cjw0Var.mo107282z0(this.f137465a, this.f137466b, this.f137467c));
                    this.f137469e.m100127g0();
                    this.f137469e.mo15089e().m101473O(this.f137468d, arrayListM101445n0);
                }
            } catch (RemoteException e) {
                this.f137469e.zzj().m211412A().m123939d("Failed to get conditional properties; remote exception", this.f137465a, this.f137466b, e);
                this.f137469e.mo15089e().m101473O(this.f137468d, arrayList);
            }
        } catch (Throwable th) {
            this.f137469e.mo15089e().m101473O(this.f137468d, arrayList);
            throw th;
        }
    }
}
