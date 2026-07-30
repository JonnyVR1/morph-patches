package p153l;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbbz;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzeih;
import com.google.android.gms.internal.ads.zzeii;

/* JADX INFO: loaded from: classes6.dex */
public final class xiu0 implements k8u0, joy0, j7u0 {

    /* JADX INFO: renamed from: a */
    public final Context f194512a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final wit0 f194513b;

    /* JADX INFO: renamed from: c */
    public final q6w0 f194514c;

    /* JADX INFO: renamed from: d */
    public final zzcei f194515d;

    /* JADX INFO: renamed from: e */
    public final zzbbz f194516e;

    /* JADX INFO: renamed from: f */
    @Nullable
    @VisibleForTesting
    public hfw0 f194517f;

    public xiu0(Context context, @Nullable wit0 wit0Var, q6w0 q6w0Var, zzcei zzceiVar, zzbbz zzbbzVar) {
        this.f194512a = context;
        this.f194513b = wit0Var;
        this.f194514c = q6w0Var;
        this.f194515d = zzceiVar;
        this.f194516e = zzbbzVar;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final void mo113755P2() {
        if (this.f194517f == null || this.f194513b == null) {
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168220Z4)).booleanValue()) {
            return;
        }
        this.f194513b.mo13728Z("onSdkImpression", new l01());
    }

    @Override // p153l.j7u0
    /* JADX INFO: renamed from: a */
    public final void mo106809a() {
        if (this.f194517f == null || this.f194513b == null) {
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168220Z4)).booleanValue()) {
            this.f194513b.mo13728Z("onSdkImpression", new l01());
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final void mo113769m5(int i) {
        this.f194517f = null;
    }

    @Override // p153l.k8u0
    public final void zzr() {
        zzeii zzeiiVar;
        zzeih zzeihVar;
        zzbbz zzbbzVar = this.f194516e;
        if ((zzbbzVar == zzbbz.REWARD_BASED_VIDEO_AD || zzbbzVar == zzbbz.INTERSTITIAL || zzbbzVar == zzbbz.APP_OPEN) && this.f194514c.f155867U && this.f194513b != null) {
            if (bxy0.m106917a().mo144388b(this.f194512a)) {
                zzcei zzceiVar = this.f194515d;
                String str = zzceiVar.zzb + "." + zzceiVar.zzc;
                r7w0 r7w0Var = this.f194514c.f155869W;
                String strM180165a = r7w0Var.m180165a();
                if (r7w0Var.m180166b() == 1) {
                    zzeihVar = zzeih.VIDEO;
                    zzeiiVar = zzeii.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzeiiVar = this.f194514c.f155872Z == 2 ? zzeii.UNSPECIFIED : zzeii.BEGIN_TO_RENDER;
                    zzeihVar = zzeih.HTML_DISPLAY;
                }
                hfw0 hfw0VarMo144389c = bxy0.m106917a().mo144389c(str, this.f194513b.mo13715L(), "", "javascript", strM180165a, zzeiiVar, zzeihVar, this.f194514c.f155898m0);
                this.f194517f = hfw0VarMo144389c;
                if (hfw0VarMo144389c != null) {
                    bxy0.m106917a().mo144391e(this.f194517f, (View) this.f194513b);
                    this.f194513b.mo13725W(this.f194517f);
                    bxy0.m106917a().mo144394h(this.f194517f);
                    this.f194513b.mo13728Z("onSdkLoaded", new l01());
                }
            }
        }
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
    }
}
