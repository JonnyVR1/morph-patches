package p153l;

import android.util.Pair;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import p137rx.C22421c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes5.dex */
public class dc10 extends hj2<oo2, gm10> {

    /* JADX INFO: renamed from: k */
    public cm0 f87733k;

    /* JADX INFO: renamed from: l */
    public BLiveMultiPkLeaderboard f87734l;

    public dc10(dum dumVar) {
        super(dumVar);
        m135319L3();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m115201U3(String str, String str2) {
        duringCreated(LivingNormalApiProvider.m72746r5(str, str2, eb20.m120148a())).flatMap(new qcj() { // from class: l.yb10
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198269a.m115205Y3((BLiveMultiPkLeaderboard) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.zb10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203615a.m115206Z3((cm0) obj);
            }
        }, new y20() { // from class: l.ac10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69670a.m115207a4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public gm10 mo76862K3() {
        return new gm10();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public void m115203W3(String str) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(IMediaPlayer.MEDIA_INFO_INITBUFFERING_START).userId(str).setSource("liveLeaderboard").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 1100)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 1100)).setScene("live").trackFrom("liveOnlineUser").build());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m115204X3(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, cm0 cm0Var) {
        if (cm0Var.m111075b()) {
            return;
        }
        this.f87734l = bLiveMultiPkLeaderboard;
        this.f87733k = cm0Var;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22421c m115205Y3(final BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard) {
        return LivingNormalApiProvider.m72475N4(bLiveMultiPkLeaderboard.fanbaseId).map(new r7g()).doOnNext(new y20() { // from class: l.cc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f80882a.m115204X3(bLiveMultiPkLeaderboard, (cm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m115206Z3(cm0 cm0Var) {
        ((gm10) this.viewModel).m130724x(this.f87734l, this.f87733k, new em10(act(), new y20() { // from class: l.bc10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76089a.m115203W3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m115207a4(Throwable th) {
        ((gm10) this.viewModel).m130725y();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m115208b4(Pair pair) {
        mo135321N3();
        m115201U3((String) pair.first, (String) pair.second);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().MultiCallEvent.clickPkBoard().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xb10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193119a.m115208b4((Pair) obj);
            }
        }));
    }
}
