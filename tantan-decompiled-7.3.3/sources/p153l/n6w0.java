package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzcab;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class n6w0 extends h5t0 {

    /* JADX INFO: renamed from: a */
    public final y5w0 f140492a;

    /* JADX INFO: renamed from: b */
    public final o5w0 f140493b;

    /* JADX INFO: renamed from: c */
    public final c7w0 f140494c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public ksu0 f140495d;

    /* JADX INFO: renamed from: e */
    public boolean f140496e = false;

    public n6w0(y5w0 y5w0Var, o5w0 o5w0Var, c7w0 c7w0Var) {
        this.f140492a = y5w0Var;
        this.f140493b = o5w0Var;
        this.f140494c = c7w0Var;
    }

    /* JADX INFO: renamed from: r8 */
    private final synchronized boolean m161809r8() {
        ksu0 ksu0Var = this.f140495d;
        return (ksu0Var == null || ksu0Var.m151287l()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) p153l.jas0.m144075c().m176505a(p153l.sgs0.f168454r5)).booleanValue() == false) goto L18;
     */
    @Override // p153l.i5t0
    /* JADX INFO: renamed from: B6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void mo138763B6(zzcab zzcabVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzcabVar.zzb;
        String str2 = (String) jas0.m144075c().m176505a(sgs0.f168428p5);
        if (str2 != null && str != null) {
            try {
                if (!Pattern.matches(str2, str)) {
                }
            } catch (RuntimeException e) {
                bxy0.m106933q().m120275w(e, "NonagonUtil.isPatternMatched");
            }
            return;
        }
        if (m161809r8()) {
        }
        q5w0 q5w0Var = new q5w0(null);
        this.f140495d = null;
        this.f140492a.m214331i(1);
        this.f140492a.mo95567a(zzcabVar.zza, zzcabVar.zzb, q5w0Var, new l6w0(this));
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: C */
    public final synchronized void mo138764C(p1m p1mVar) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.f140495d != null) {
            this.f140495d.m152229e().m166366A0(p1mVar == null ? null : (Context) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: H */
    public final synchronized void mo138765H(@Nullable p1m p1mVar) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.f140495d != null) {
                Activity activity = null;
                if (p1mVar != null) {
                    Object objM134037P2 = h950.m134037P2(p1mVar);
                    if (objM134037P2 instanceof Activity) {
                        activity = (Activity) objM134037P2;
                    }
                }
                this.f140495d.m151290o(this.f140496e, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: J7 */
    public final void mo138766J7(i3t0 i3t0Var) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        o5w0 o5w0Var = this.f140493b;
        if (i3t0Var == null) {
            o5w0Var.m166179z(null);
        } else {
            o5w0Var.m166179z(new m6w0(this, i3t0Var));
        }
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: P */
    public final synchronized void mo138767P(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.f140494c.f80151a = str;
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: R5 */
    public final void mo138768R5(a7t0 a7t0Var) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f140493b.m166175K(a7t0Var);
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: Z */
    public final synchronized void mo138769Z(p1m p1mVar) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.f140493b.m166179z(null);
        if (this.f140495d != null) {
            if (p1mVar != null) {
                context = (Context) h950.m134037P2(p1mVar);
            }
            this.f140495d.m152229e().m166367w0(context);
        }
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo138770a() throws RemoteException {
        mo138765H(null);
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: a1 */
    public final void mo138771a1(g5t0 g5t0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f140493b.m166176O(g5t0Var);
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: c0 */
    public final synchronized void mo138772c0(p1m p1mVar) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.f140495d != null) {
            this.f140495d.m152229e().m166368z0(p1mVar == null ? null : (Context) h950.m134037P2(p1mVar));
        }
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: q */
    public final synchronized void mo138773q(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f140496e = z;
    }

    @Override // p153l.i5t0
    /* JADX INFO: renamed from: q1 */
    public final synchronized void mo138774q1(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.f140494c.f80152b = str;
    }

    @Override // p153l.i5t0
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        ksu0 ksu0Var = this.f140495d;
        return ksu0Var != null ? ksu0Var.m151284i() : new Bundle();
    }

    @Override // p153l.i5t0
    @Nullable
    public final synchronized tlu0 zzc() throws RemoteException {
        ksu0 ksu0Var;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168078N6)).booleanValue() && (ksu0Var = this.f140495d) != null) {
            return ksu0Var.m152228d();
        }
        return null;
    }

    @Override // p153l.i5t0
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        ksu0 ksu0Var = this.f140495d;
        if (ksu0Var == null || ksu0Var.m152228d() == null) {
            return null;
        }
        return ksu0Var.m152228d().zzg();
    }

    @Override // p153l.i5t0
    public final void zze() throws RemoteException {
        mo138769Z(null);
    }

    @Override // p153l.i5t0
    public final void zzh() {
        mo138772c0(null);
    }

    @Override // p153l.i5t0
    public final void zzj() {
        mo138764C(null);
    }

    @Override // p153l.i5t0
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return m161809r8();
    }

    @Override // p153l.i5t0
    public final boolean zzt() {
        ksu0 ksu0Var = this.f140495d;
        return ksu0Var != null && ksu0Var.m151289n();
    }
}
