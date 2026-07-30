package p149l;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public interface ujs0 extends IInterface {
    /* JADX INFO: renamed from: B2 */
    void mo131151B2(String str, ids0 ids0Var, @Nullable fds0 fds0Var) throws RemoteException;

    /* JADX INFO: renamed from: T3 */
    void mo131152T3(r8s0 r8s0Var) throws RemoteException;

    /* JADX INFO: renamed from: W5 */
    void mo131153W5(mds0 mds0Var, zzq zzqVar) throws RemoteException;

    /* JADX INFO: renamed from: X0 */
    void mo131154X0(zzbjb zzbjbVar) throws RemoteException;

    /* JADX INFO: renamed from: Z5 */
    void mo131155Z5(rjs0 rjs0Var) throws RemoteException;

    /* JADX INFO: renamed from: a8 */
    void mo131156a8(t3t0 t3t0Var) throws RemoteException;

    /* JADX INFO: renamed from: h4 */
    void mo131157h4(zds0 zds0Var) throws RemoteException;

    /* JADX INFO: renamed from: k6 */
    void mo131158k6(zcs0 zcs0Var) throws RemoteException;

    /* JADX INFO: renamed from: l7 */
    void mo131159l7(cds0 cds0Var) throws RemoteException;

    /* JADX INFO: renamed from: o4 */
    void mo131160o4(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    /* JADX INFO: renamed from: q4 */
    void mo131162q4(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    /* JADX INFO: renamed from: t2 */
    void mo131163t2(zzbpp zzbppVar) throws RemoteException;

    fgs0 zze() throws RemoteException;
}
