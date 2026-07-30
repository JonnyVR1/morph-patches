package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes6.dex */
public final class hxv0 extends bws0 {

    /* JADX INFO: renamed from: a */
    public final swv0 f109930a;

    /* JADX INFO: renamed from: b */
    public final iwv0 f109931b;

    /* JADX INFO: renamed from: c */
    public final wxv0 f109932c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public eju0 f109933d;

    /* JADX INFO: renamed from: e */
    public boolean f109934e = false;

    public hxv0(swv0 swv0Var, iwv0 iwv0Var, wxv0 wxv0Var) {
        this.f109930a = swv0Var;
        this.f109931b = iwv0Var;
        this.f109932c = wxv0Var;
    }

    /* JADX INFO: renamed from: r8 */
    private final synchronized boolean m133429r8() {
        eju0 eju0Var = this.f109933d;
        return (eju0Var == null || eju0Var.m116904l()) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (((java.lang.Boolean) p149l.d1s0.m109677c().m144697a(p149l.m7s0.f132383r5)).booleanValue() == false) goto L18;
     */
    @Override // p149l.cws0
    /* JADX INFO: renamed from: B6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void mo109053B6(com.google.android.gms.internal.ads.zzcab r5) throws android.os.RemoteException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r5.zzb     // Catch: java.lang.Throwable -> L20
            l.x6s0 r1 = p149l.m7s0.f132357p5     // Catch: java.lang.Throwable -> L20
            l.k7s0 r2 = p149l.d1s0.m109677c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r1 = r2.m144697a(r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L2c
            if (r0 != 0) goto L19
            goto L2c
        L19:
            boolean r0 = java.util.regex.Pattern.matches(r1, r0)     // Catch: java.lang.Throwable -> L20 java.lang.RuntimeException -> L22
            if (r0 == 0) goto L2c
            goto L44
        L20:
            r5 = move-exception
            goto L64
        L22:
            r0 = move-exception
            java.lang.String r1 = "NonagonUtil.isPatternMatched"
            l.y1t0 r2 = p149l.vny0.m199079q()     // Catch: java.lang.Throwable -> L20
            r2.m212290w(r0, r1)     // Catch: java.lang.Throwable -> L20
        L2c:
            boolean r0 = r4.m133429r8()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L46
            l.x6s0 r0 = p149l.m7s0.f132383r5     // Catch: java.lang.Throwable -> L20
            l.k7s0 r1 = p149l.d1s0.m109677c()     // Catch: java.lang.Throwable -> L20
            java.lang.Object r0 = r1.m144697a(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L46
        L44:
            monitor-exit(r4)
            return
        L46:
            l.kwv0 r0 = new l.kwv0     // Catch: java.lang.Throwable -> L20
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L20
            r4.f109933d = r1     // Catch: java.lang.Throwable -> L20
            l.swv0 r1 = r4.f109930a     // Catch: java.lang.Throwable -> L20
            r2 = 1
            r1.m186385i(r2)     // Catch: java.lang.Throwable -> L20
            l.swv0 r1 = r4.f109930a     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.ads.internal.client.zzl r2 = r5.zza     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r5.zzb     // Catch: java.lang.Throwable -> L20
            l.fxv0 r3 = new l.fxv0     // Catch: java.lang.Throwable -> L20
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20
            r1.mo113608a(r2, r5, r0, r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r4)
            return
        L64:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L20
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.hxv0.mo109053B6(com.google.android.gms.internal.ads.zzcab):void");
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: C */
    public final synchronized void mo109054C(uyl uylVar) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.f109933d != null) {
            this.f109933d.m117799e().m139009A0(uylVar == null ? null : (Context) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: H */
    public final synchronized void mo109055H(@Nullable uyl uylVar) throws RemoteException {
        try {
            Preconditions.checkMainThread("showAd must be called on the main UI thread.");
            if (this.f109933d != null) {
                Activity activity = null;
                if (uylVar != null) {
                    Object objM181847P2 = s050.m181847P2(uylVar);
                    if (objM181847P2 instanceof Activity) {
                        activity = (Activity) objM181847P2;
                    }
                }
                this.f109933d.m116907o(this.f109934e, activity);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: J7 */
    public final void mo109056J7(cus0 cus0Var) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        iwv0 iwv0Var = this.f109931b;
        if (cus0Var == null) {
            iwv0Var.m138774z(null);
        } else {
            iwv0Var.m138774z(new gxv0(this, cus0Var));
        }
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: P */
    public final synchronized void mo109057P(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.f109932c.f188521a = str;
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: R5 */
    public final void mo109058R5(uxs0 uxs0Var) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.f109931b.m138770K(uxs0Var);
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: Z */
    public final synchronized void mo109059Z(uyl uylVar) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.f109931b.m138774z(null);
        if (this.f109933d != null) {
            if (uylVar != null) {
                context = (Context) s050.m181847P2(uylVar);
            }
            this.f109933d.m117799e().m139010w0(context);
        }
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo109060a() throws RemoteException {
        mo109055H(null);
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: a1 */
    public final void mo109061a1(aws0 aws0Var) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.f109931b.m138771O(aws0Var);
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: c0 */
    public final synchronized void mo109062c0(uyl uylVar) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.f109933d != null) {
            this.f109933d.m117799e().m139011z0(uylVar == null ? null : (Context) s050.m181847P2(uylVar));
        }
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: q */
    public final synchronized void mo109063q(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.f109934e = z;
    }

    @Override // p149l.cws0
    /* JADX INFO: renamed from: q1 */
    public final synchronized void mo109064q1(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.f109932c.f188522b = str;
    }

    @Override // p149l.cws0
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        eju0 eju0Var = this.f109933d;
        return eju0Var != null ? eju0Var.m116901i() : new Bundle();
    }

    @Override // p149l.cws0
    @Nullable
    public final synchronized ncu0 zzc() throws RemoteException {
        eju0 eju0Var;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132007N6)).booleanValue() && (eju0Var = this.f109933d) != null) {
            return eju0Var.m117798d();
        }
        return null;
    }

    @Override // p149l.cws0
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        eju0 eju0Var = this.f109933d;
        if (eju0Var == null || eju0Var.m117798d() == null) {
            return null;
        }
        return eju0Var.m117798d().zzg();
    }

    @Override // p149l.cws0
    public final void zze() throws RemoteException {
        mo109059Z(null);
    }

    @Override // p149l.cws0
    public final void zzh() {
        mo109062c0(null);
    }

    @Override // p149l.cws0
    public final void zzj() {
        mo109054C(null);
    }

    @Override // p149l.cws0
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return m133429r8();
    }

    @Override // p149l.cws0
    public final boolean zzt() {
        eju0 eju0Var = this.f109933d;
        return eju0Var != null && eju0Var.m116906n();
    }
}
