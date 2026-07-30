package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummary;
import com.p1.mobile.putong.live.base.data.BLiveAccommpanyTaskSummaryUser;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import l.hxs;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class b5g implements s7m<c5g> {

    /* JADX INFO: renamed from: a */
    public c5g f7991a;

    /* JADX INFO: renamed from: b */
    public final VDraweeView f7992b;

    /* JADX INFO: renamed from: c */
    public final VDraweeView f7993c;

    /* JADX INFO: renamed from: d */
    public final AnimEffectPlayer f7994d;

    /* JADX INFO: renamed from: e */
    public final VImage f7995e;

    /* JADX INFO: renamed from: f */
    public final boolean f7996f;

    public b5g(VDraweeView vDraweeView, VDraweeView vDraweeView2, AnimEffectPlayer animEffectPlayer, VImage vImage, boolean z) {
        this.f7992b = vDraweeView;
        this.f7993c = vDraweeView2;
        this.f7994d = animEffectPlayer;
        this.f7995e = vImage;
        this.f7996f = z;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m10165C0() {
        return null;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void m10169i1(c5g c5gVar) {
        this.f7991a = c5gVar;
    }

    /* JADX INFO: renamed from: b */
    public void m10167b() {
        this.f7994d.stopAnimation(true);
    }

    /* JADX INFO: renamed from: c */
    public void m10168c(mcg mcgVar) {
        BLiveAccommpanyTaskSummary bLiveAccommpanyTaskSummary = mcgVar.f15336f;
        if (bLiveAccommpanyTaskSummary != null) {
            if (!vwb.J(bLiveAccommpanyTaskSummary.users)) {
                hxs.t("context_single_room", this.f7992b, ((BLiveAccommpanyTaskSummaryUser) bLiveAccommpanyTaskSummary.users.get(0)).avatar, t100.d(62.0f));
                if (bLiveAccommpanyTaskSummary.users.size() > 1) {
                    boolean zEquals = ((BLiveAccommpanyTaskSummaryUser) bLiveAccommpanyTaskSummary.users.get(0)).id.equals(((BLiveAccommpanyTaskSummaryUser) bLiveAccommpanyTaskSummary.users.get(1)).id);
                    VDraweeView vDraweeView = this.f7993c;
                    if (zEquals) {
                        vDraweeView.setActualImageResource(i3c0.f12661U4);
                    } else {
                        hxs.t("context_single_room", vDraweeView, ((BLiveAccommpanyTaskSummaryUser) bLiveAccommpanyTaskSummary.users.get(1)).avatar, t100.d(62.0f));
                    }
                }
            }
            if (!"done".equals(bLiveAccommpanyTaskSummary.status) && !this.f7996f) {
                xdl0.M(this.f7994d, false);
                xdl0.M(this.f7995e, true);
            } else {
                xdl0.M(this.f7994d, true);
                xdl0.M(this.f7995e, false);
                this.f7994d.clearDynamicData();
                this.f7994d.j("https://auto.tancdn.com/v1/raw/60051f2a-ba7d-4b43-ac8e-3017bd96a03310.so", 0);
            }
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
