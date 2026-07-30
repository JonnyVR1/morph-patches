package p149l;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzff;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class fmv0 extends fet0 {

    /* JADX INFO: renamed from: a */
    public fjs0 f98378a;

    @Override // p149l.gft0
    /* JADX INFO: renamed from: b */
    public final boolean mo122266b() throws RemoteException {
        return false;
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: b5 */
    public final void mo122267b5(fjs0 fjs0Var) throws RemoteException {
        this.f98378a = fjs0Var;
    }

    public final /* synthetic */ void zzb() {
        fjs0 fjs0Var = this.f98378a;
        if (fjs0Var != null) {
            try {
                fjs0Var.mo112111m0(Collections.EMPTY_LIST);
            } catch (RemoteException e) {
                x2t0.m206870h("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // p149l.gft0
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // p149l.gft0
    public final String zzf() {
        return "";
    }

    @Override // p149l.gft0
    public final List zzg() throws RemoteException {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.gft0
    public final void zzk() throws RemoteException {
        x2t0.m206866d("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        i2t0.f110583b.post(new Runnable() { // from class: l.zkv0
            @Override // java.lang.Runnable
            public final void run() {
                this.f203576a.zzb();
            }
        });
    }

    @Override // p149l.gft0
    public final void zzi() {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: A */
    public final void mo122258A(@Nullable String str) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: B3 */
    public final void mo122259B3(float f) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: C3 */
    public final void mo122260C3(ons0 ons0Var) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: G7 */
    public final void mo122261G7(zzff zzffVar) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: R1 */
    public final void mo122263R1(String str) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: X */
    public final void mo122264X(boolean z) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: X4 */
    public final void mo122265X4(ewt0 ewt0Var) {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: p6 */
    public final void mo122269p6(String str) {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: u4 */
    public final void mo122270u4(boolean z) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: J2 */
    public final void mo122262J2(uyl uylVar, String str) throws RemoteException {
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: j6 */
    public final void mo122268j6(@Nullable String str, uyl uylVar) throws RemoteException {
    }
}
