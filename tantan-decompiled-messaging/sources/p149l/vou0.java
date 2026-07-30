package p149l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vou0 implements fv0, r0u0, b1r0, cxt0, dyt0, eyt0, ezt0, mxt0, g3w0 {

    /* JADX INFO: renamed from: a */
    public final List f182428a;

    /* JADX INFO: renamed from: b */
    public final dou0 f182429b;

    /* JADX INFO: renamed from: c */
    public long f182430c;

    public vou0(dou0 dou0Var, xbt0 xbt0Var) {
        this.f182429b = dou0Var;
        this.f182428a = Collections.singletonList(xbt0Var);
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: B */
    public final void mo102676B(Context context) {
        m199200O(eyt0.class, "onDestroy", context);
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: D */
    public final void mo94578D(zzflg zzflgVar, String str, Throwable th) {
        m199200O(z2w0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: K */
    public final void mo102677K(Context context) {
        m199200O(eyt0.class, "onPause", context);
    }

    /* JADX INFO: renamed from: O */
    public final void m199200O(Class cls, String str, Object... objArr) {
        this.f182429b.m112826a(this.f182428a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // p149l.eyt0
    /* JADX INFO: renamed from: P */
    public final void mo102680P(Context context) {
        m199200O(eyt0.class, "onResume", context);
    }

    @Override // p149l.dyt0
    /* JADX INFO: renamed from: a */
    public final void mo95459a() {
        m199200O(dyt0.class, "onAdImpression", new Object[0]);
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: b */
    public final void mo94579b(zzflg zzflgVar, String str) {
        m199200O(z2w0.class, "onTaskStarted", str);
    }

    @Override // p149l.cxt0
    /* JADX INFO: renamed from: i */
    public final void mo100929i(zvs0 zvs0Var, String str, String str2) {
        m199200O(cxt0.class, "onRewarded", zvs0Var, str, str2);
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: k */
    public final void mo94580k(zzflg zzflgVar, String str) {
        m199200O(z2w0.class, "onTaskSucceeded", str);
    }

    @Override // p149l.b1r0
    public final void onAdClicked() {
        m199200O(b1r0.class, "onAdClicked", new Object[0]);
    }

    @Override // p149l.fv0
    /* JADX INFO: renamed from: q */
    public final void mo123249q(String str, String str2) {
        m199200O(fv0.class, "onAppEvent", str, str2);
    }

    @Override // p149l.mxt0
    /* JADX INFO: renamed from: u */
    public final void mo97693u(zze zzeVar) {
        m199200O(mxt0.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: x */
    public final void mo97694x(zzbze zzbzeVar) {
        this.f182430c = vny0.m199064b().elapsedRealtime();
        m199200O(r0u0.class, "onAdRequest", new Object[0]);
    }

    @Override // p149l.g3w0
    /* JADX INFO: renamed from: z */
    public final void mo94581z(zzflg zzflgVar, String str) {
        m199200O(z2w0.class, "onTaskCreated", str);
    }

    @Override // p149l.cxt0
    public final void zza() {
        m199200O(cxt0.class, "onAdClosed", new Object[0]);
    }

    @Override // p149l.cxt0
    public final void zzb() {
        m199200O(cxt0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // p149l.cxt0
    public final void zzc() {
        m199200O(cxt0.class, "onAdOpened", new Object[0]);
    }

    @Override // p149l.cxt0
    public final void zze() {
        m199200O(cxt0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // p149l.cxt0
    public final void zzf() {
        m199200O(cxt0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // p149l.ezt0
    public final void zzr() {
        xsu0.m210834k("Ad Request Latency : " + (vny0.m199064b().elapsedRealtime() - this.f182430c));
        m199200O(ezt0.class, "onAdLoaded", new Object[0]);
    }

    @Override // p149l.r0u0
    /* JADX INFO: renamed from: A */
    public final void mo97687A(vxv0 vxv0Var) {
    }
}
