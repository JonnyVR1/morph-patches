package p153l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzff;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class lvv0 extends lnt0 {

    /* JADX INFO: renamed from: a */
    public lss0 f133735a;

    @Override // p153l.mot0
    /* JADX INFO: renamed from: b */
    public final boolean mo156015b() throws RemoteException {
        return false;
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: b5 */
    public final void mo156016b5(lss0 lss0Var) throws RemoteException {
        this.f133735a = lss0Var;
    }

    public final /* synthetic */ void zzb() {
        lss0 lss0Var = this.f133735a;
        if (lss0Var != null) {
            try {
                lss0Var.mo115302m0(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                dct0.m115299h("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // p153l.mot0
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // p153l.mot0
    public final String zzf() {
        return "";
    }

    @Override // p153l.mot0
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.mot0
    public final void zzk() throws RemoteException {
        dct0.m115295d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        obt0.f146613b.post(new Runnable() { // from class: l.fuv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f100955a.zzb();
            }
        });
    }

    @Override // p153l.mot0
    public final void zzi() {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: A */
    public final void mo156007A(@Nullable String str) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: B3 */
    public final void mo156008B3(float f) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: C3 */
    public final void mo156009C3(uws0 uws0Var) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: G7 */
    public final void mo156010G7(zzff zzffVar) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: R1 */
    public final void mo156012R1(String str) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: X */
    public final void mo156013X(boolean z) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: X4 */
    public final void mo156014X4(k5u0 k5u0Var) {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: p6 */
    public final void mo156018p6(String str) {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: u4 */
    public final void mo156019u4(boolean z) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: J2 */
    public final void mo156011J2(p1m p1mVar, String str) throws RemoteException {
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: j6 */
    public final void mo156017j6(@Nullable String str, p1m p1mVar) throws RemoteException {
    }
}
