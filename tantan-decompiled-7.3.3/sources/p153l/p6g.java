package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class p6g implements iam<q6g> {

    /* JADX INFO: renamed from: a */
    public q6g f150839a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f150840b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f150841c;

    /* JADX INFO: renamed from: d */
    public final AnimEffectPlayer f150842d;

    /* JADX INFO: renamed from: e */
    public final VImage f150843e;

    /* JADX INFO: renamed from: f */
    public final boolean f150844f;

    public p6g(VDraweeView vDraweeView, VDraweeView vDraweeView2, AnimEffectPlayer animEffectPlayer, VImage vImage, boolean z) {
        this.f150840b = vDraweeView;
        this.f150841c = vDraweeView2;
        this.f150842d = animEffectPlayer;
        this.f150843e = vImage;
        this.f150844f = z;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q6g q6gVar) {
        this.f150839a = q6gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m170867b() {
        this.f150842d.stopAnimation(true);
    }

    /* JADX INFO: renamed from: c */
    public void m170868c(aeg aegVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = aegVar.f70796f;
        if (bLiveAccommpanyTaskSummary != null) {
            if (!jyb.m147479J(bLiveAccommpanyTaskSummary.users)) {
                izs.m142869t("context_single_room", this.f150840b, bLiveAccommpanyTaskSummary.users.get(0).avatar, qa00.m175859d(62.0f));
                if (bLiveAccommpanyTaskSummary.users.size() > 1) {
                    boolean zEquals = bLiveAccommpanyTaskSummary.users.get(0).f45173id.equals(bLiveAccommpanyTaskSummary.users.get(1).f45173id);
                    VDraweeView vDraweeView = this.f150841c;
                    if (zEquals) {
                        vDraweeView.setActualImageResource(obc0.f146204U4);
                    } else {
                        izs.m142869t("context_single_room", vDraweeView, bLiveAccommpanyTaskSummary.users.get(1).avatar, qa00.m175859d(62.0f));
                    }
                }
            }
            if (!"done".equals(bLiveAccommpanyTaskSummary.status) && !this.f150844f) {
                bnl0.m105524M(this.f150842d, false);
                bnl0.m105524M(this.f150843e, true);
            } else {
                bnl0.m105524M(this.f150842d, true);
                bnl0.m105524M(this.f150843e, false);
                this.f150842d.clearDynamicData();
                this.f150842d.m69683j("https://auto.tancdn.com/v1/raw/60051f2a-ba7d-4b43-ac8e-3017bd96a03310.so", 0);
            }
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
