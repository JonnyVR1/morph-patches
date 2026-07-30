package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveUserProfileConfig;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveNewGiftWallEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class q0k0<D extends ho2> extends wr2<q0k0<D>, D> implements s7m<q0k0<D>> {

    /* JADX INFO: renamed from: k */
    public LiveNewGiftWallEntranceView f152064k;

    public q0k0(bsm<D> bsmVar, LiveNewGiftWallEntranceView liveNewGiftWallEntranceView) {
        super(bsmVar);
        mo51532C(this);
        this.f152064k = liveNewGiftWallEntranceView;
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        if (mo157426g4() == null || m206026D2()) {
            return;
        }
        m172334n4(mo157426g4().m167093m());
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l4 */
    public boolean m172332l4(BLiveUserProfileConfig bLiveUserProfileConfig) {
        mqv<User> mqvVarM205083c4 = m205083c4();
        return (mqvVarM205083c4 == null || !d1t.m109678a(mqvVarM205083c4).m109681d()) && bLiveUserProfileConfig.showGiftWallEntranceV2;
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m172333m4(BLiveExtraResponse bLiveExtraResponse) {
        this.f152064k.m73683o0(bLiveExtraResponse.data);
    }

    /* JADX INFO: renamed from: n4 */
    public void m172334n4(@Nullable BLiveUserProfileConfig bLiveUserProfileConfig) {
        boolean z = NullChecker.m81303a(bLiveUserProfileConfig) && m172332l4(bLiveUserProfileConfig);
        xdl0.m208344M(this.f152064k, z);
        if (z) {
            m207199N3(zfv.m218514K0(m205082b4(), m206027E2().m149818o())).subscribe(ffw.m121197h(new e30() { // from class: l.p0k0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146605a.m172333m4((BLiveExtraResponse) obj);
                }
            }));
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q0k0<D> q0k0Var) {
    }
}
