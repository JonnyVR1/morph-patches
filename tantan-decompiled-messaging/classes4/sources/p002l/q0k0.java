package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.tantanapp.common.utils.NullChecker;
import l.d1t;
import l.e30;
import l.ffw;
import l.mqv;
import l.s7m;
import l.xdl0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q0k0<D extends ho2> extends wr2<q0k0<D>, D> implements s7m<q0k0<D>> {

    /* JADX INFO: renamed from: k */
    public LiveNewGiftWallEntranceView f17751k;

    public q0k0(bsm<D> bsmVar, LiveNewGiftWallEntranceView liveNewGiftWallEntranceView) {
        super(bsmVar);
        C(this);
        this.f17751k = liveNewGiftWallEntranceView;
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        if (mo18414g4() == null || m25546D2()) {
            return;
        }
        m20789n4(mo18414g4().m19973m());
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m20787l4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        mqv<User> mqvVarM25333c4 = m25333c4();
        return (mqvVarM25333c4 == null || !d1t.a(mqvVarM25333c4).d()) && bLiveUserProfileConfig.showGiftWallEntranceV2;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m20788m4(BLiveExtraResponse bLiveExtraResponse) {
        this.f17751k.m7231o0(bLiveExtraResponse.data);
    }

    /* JADX INFO: renamed from: n4 */
    public void m20789n4(@Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.a(bLiveUserProfileConfig) && m20787l4(bLiveUserProfileConfig);
        xdl0.M(this.f17751k, z);
        if (z) {
            m25707N3(zfv.m27217K0(m25332b4(), m25547E2().m17239o())).subscribe(ffw.h(new e30() { // from class: l.p0k0
                public final void call(Object obj) {
                    this.f16949a.m20788m4((BLiveExtraResponse) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void m20785i1(q0k0<D> q0k0Var) {
    }
}
