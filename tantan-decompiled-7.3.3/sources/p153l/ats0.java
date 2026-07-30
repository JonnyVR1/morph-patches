package p153l;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* JADX INFO: loaded from: classes6.dex */
public interface ats0 extends IInterface {
    /* JADX INFO: renamed from: B2 */
    void mo100261B2(String str, oms0 oms0Var, @Nullable lms0 lms0Var) throws RemoteException;

    /* JADX INFO: renamed from: T3 */
    void mo100262T3(xhs0 xhs0Var) throws RemoteException;

    /* JADX INFO: renamed from: W5 */
    void mo100263W5(sms0 sms0Var, zzq zzqVar) throws RemoteException;

    /* JADX INFO: renamed from: X0 */
    void mo100264X0(zzbjb zzbjbVar) throws RemoteException;

    /* JADX INFO: renamed from: Z5 */
    void mo100265Z5(xss0 xss0Var) throws RemoteException;

    /* JADX INFO: renamed from: a8 */
    void mo100266a8(zct0 zct0Var) throws RemoteException;

    /* JADX INFO: renamed from: h4 */
    void mo100267h4(fns0 fns0Var) throws RemoteException;

    /* JADX INFO: renamed from: k6 */
    void mo100268k6(fms0 fms0Var) throws RemoteException;

    /* JADX INFO: renamed from: l7 */
    void mo100269l7(ims0 ims0Var) throws RemoteException;

    /* JADX INFO: renamed from: o4 */
    void mo100270o4(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    /* JADX INFO: renamed from: q4 */
    void mo100271q4(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    /* JADX INFO: renamed from: t2 */
    void mo100272t2(zzbpp zzbppVar) throws RemoteException;

    lps0 zze() throws RemoteException;
}
