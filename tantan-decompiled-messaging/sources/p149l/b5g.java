package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class b5g implements s7m<c5g> {

    /* JADX INFO: renamed from: a */
    public c5g f73656a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f73657b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f73658c;

    /* JADX INFO: renamed from: d */
    public final AnimEffectPlayer f73659d;

    /* JADX INFO: renamed from: e */
    public final VImage f73660e;

    /* JADX INFO: renamed from: f */
    public final boolean f73661f;

    public b5g(VDraweeView vDraweeView, VDraweeView vDraweeView2, AnimEffectPlayer animEffectPlayer, VImage vImage, boolean z) {
        this.f73657b = vDraweeView;
        this.f73658c = vDraweeView2;
        this.f73659d = animEffectPlayer;
        this.f73660e = vImage;
        this.f73661f = z;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(c5g c5gVar) {
        this.f73656a = c5gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m100332b() {
        this.f73659d.stopAnimation(true);
    }

    /* JADX INFO: renamed from: c */
    public void m100333c(mcg mcgVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = mcgVar.f133108f;
        if (bLiveAccommpanyTaskSummary != null) {
            if (!vwb.m200296J(bLiveAccommpanyTaskSummary.users)) {
                hxs.m133407t("context_single_room", this.f73657b, bLiveAccommpanyTaskSummary.users.get(0).avatar, t100.m186890d(62.0f));
                if (bLiveAccommpanyTaskSummary.users.size() > 1) {
                    boolean zEquals = bLiveAccommpanyTaskSummary.users.get(0).f44325id.equals(bLiveAccommpanyTaskSummary.users.get(1).f44325id);
                    VDraweeView vDraweeView = this.f73658c;
                    if (zEquals) {
                        vDraweeView.setActualImageResource(i3c0.f110876U4);
                    } else {
                        hxs.m133407t("context_single_room", vDraweeView, bLiveAccommpanyTaskSummary.users.get(1).avatar, t100.m186890d(62.0f));
                    }
                }
            }
            if (!"done".equals(bLiveAccommpanyTaskSummary.status) && !this.f73661f) {
                xdl0.m208344M(this.f73659d, false);
                xdl0.m208344M(this.f73660e, true);
            } else {
                xdl0.m208344M(this.f73659d, true);
                xdl0.m208344M(this.f73660e, false);
                this.f73659d.clearDynamicData();
                this.f73659d.m68500j("https://auto.tancdn.com/v1/raw/60051f2a-ba7d-4b43-ac8e-3017bd96a03310.so", 0);
            }
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
