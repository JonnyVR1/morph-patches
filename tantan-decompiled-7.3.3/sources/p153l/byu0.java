package p153l;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzflg;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class byu0 implements mv0, x9u0, har0, i6u0, j7u0, k7u0, k8u0, s6u0, mcw0 {

    /* JADX INFO: renamed from: a */
    public final List f79062a;

    /* JADX INFO: renamed from: b */
    public final jxu0 f79063b;

    /* JADX INFO: renamed from: c */
    public long f79064c;

    public byu0(jxu0 jxu0Var, dlt0 dlt0Var) {
        this.f79063b = jxu0Var;
        this.f79062a = Collections.singletonList(dlt0Var);
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: B */
    public final void mo107083B(Context context) {
        m107085O(k7u0.class, "onDestroy", context);
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: D */
    public final void mo100841D(zzflg zzflgVar, String str, Throwable th) {
        m107085O(fcw0.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: K */
    public final void mo107084K(Context context) {
        m107085O(k7u0.class, "onPause", context);
    }

    /* JADX INFO: renamed from: O */
    public final void m107085O(Class cls, String str, Object... objArr) {
        this.f79063b.m147427a(this.f79062a, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // p153l.k7u0
    /* JADX INFO: renamed from: P */
    public final void mo107086P(Context context) {
        m107085O(k7u0.class, "onResume", context);
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        m107085O(j7u0.class, "onAdImpression", new Object[0]);
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: b */
    public final void mo100843b(zzflg zzflgVar, String str) {
        m107085O(fcw0.class, "onTaskStarted", str);
    }

    @Override // p153l.i6u0
    /* JADX INFO: renamed from: i */
    public final void mo107087i(f5t0 f5t0Var, String str, String str2) {
        m107085O(i6u0.class, "onRewarded", f5t0Var, str, str2);
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: k */
    public final void mo100844k(zzflg zzflgVar, String str) {
        m107085O(fcw0.class, "onTaskSucceeded", str);
    }

    @Override // p153l.har0
    public final void onAdClicked() {
        m107085O(har0.class, "onAdClicked", new Object[0]);
    }

    @Override // p153l.mv0
    /* JADX INFO: renamed from: q */
    public final void mo96610q(String str, String str2) {
        m107085O(mv0.class, "onAppEvent", str, str2);
    }

    @Override // p153l.s6u0
    /* JADX INFO: renamed from: u */
    public final void mo103145u(zze zzeVar) {
        m107085O(s6u0.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: x */
    public final void mo107088x(zzbze zzbzeVar) {
        this.f79064c = bxy0.m106918b().elapsedRealtime();
        m107085O(x9u0.class, "onAdRequest", new Object[0]);
    }

    @Override // p153l.mcw0
    /* JADX INFO: renamed from: z */
    public final void mo100845z(zzflg zzflgVar, String str) {
        m107085O(fcw0.class, "onTaskCreated", str);
    }

    @Override // p153l.i6u0
    public final void zza() {
        m107085O(i6u0.class, "onAdClosed", new Object[0]);
    }

    @Override // p153l.i6u0
    public final void zzb() {
        m107085O(i6u0.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // p153l.i6u0
    public final void zzc() {
        m107085O(i6u0.class, "onAdOpened", new Object[0]);
    }

    @Override // p153l.i6u0
    public final void zze() {
        m107085O(i6u0.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // p153l.i6u0
    public final void zzf() {
        m107085O(i6u0.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // p153l.k8u0
    public final void zzr() {
        d2v0.m113737k("Ad Request Latency : " + (bxy0.m106918b().elapsedRealtime() - this.f79064c));
        m107085O(k8u0.class, "onAdLoaded", new Object[0]);
    }

    @Override // p153l.x9u0
    /* JADX INFO: renamed from: A */
    public final void mo107082A(b7w0 b7w0Var) {
    }
}
