package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class w9k0<D extends oo2> extends ms2<w9k0<D>, D> implements iam<w9k0<D>> {

    /* JADX INFO: renamed from: k */
    public LiveNewGiftWallEntranceView f188018k;

    public w9k0(dum<D> dumVar, LiveNewGiftWallEntranceView liveNewGiftWallEntranceView) {
        super(dumVar);
        mo52715C(this);
        this.f188018k = liveNewGiftWallEntranceView;
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        if (mo159733g4() == null || m213809D2()) {
            return;
        }
        m205575n4(mo159733g4().m200538m());
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m205573l4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        nsv<User> nsvVarM159729c4 = m159729c4();
        return (nsvVarM159729c4 == null || !e3t.m119319a(nsvVarM159729c4).m119322d()) && bLiveUserProfileConfig.showGiftWallEntranceV2;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m205574m4(BLiveExtraResponse bLiveExtraResponse) {
        this.f188018k.m74866o0(bLiveExtraResponse.data);
    }

    /* JADX INFO: renamed from: n4 */
    public void m205575n4(@Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.m82486a(bLiveUserProfileConfig) && m205573l4(bLiveUserProfileConfig);
        bnl0.m105524M(this.f188018k, z);
        if (z) {
            m214779N3(aiv.m98048K0(m159728b4(), m213810E2().m202194o())).subscribe(dhw.m115829h(new y20() { // from class: l.v9k0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183008a.m205574m4((BLiveExtraResponse) obj);
                }
            }));
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(w9k0<D> w9k0Var) {
    }
}
