package p149l;

import android.util.Pair;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkLeaderboard;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import p133rx.C22306c;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* JADX INFO: loaded from: classes5.dex */
public class t310 extends zi2<ho2, wd10> {

    /* JADX INFO: renamed from: k */
    public gm0 f167584k;

    /* JADX INFO: renamed from: l */
    public BLiveMultiPkLeaderboard f167585l;

    public t310(bsm bsmVar) {
        super(bsmVar);
        m218910L3();
    }

    /* JADX INFO: renamed from: U3 */
    public final void m187093U3(String str, String str2) {
        duringCreated(LivingNormalApiProvider.m71563r5(str, str2, w220.m201014a())).flatMap(new w9j() { // from class: l.o310
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f141594a.m187097Y3((BLiveMultiPkLeaderboard) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.p310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146955a.m187098Z3((gm0) obj);
            }
        }, new e30() { // from class: l.q310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152355a.m187099a4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: V3, reason: merged with bridge method [inline-methods] */
    public wd10 mo75679K3() {
        return new wd10();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r2v5, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m187095W3(String str) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(IMediaPlayer.MEDIA_INFO_INITBUFFERING_START).userId(str).setSource("liveLeaderboard").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 1100)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 1100)).setScene("live").trackFrom("liveOnlineUser").build());
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m187096X3(BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard, gm0 gm0Var) {
        if (gm0Var.m126927b()) {
            return;
        }
        this.f167585l = bLiveMultiPkLeaderboard;
        this.f167584k = gm0Var;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ C22306c m187097Y3(final BLiveMultiPkLeaderboard bLiveMultiPkLeaderboard) {
        return LivingNormalApiProvider.m71292N4(bLiveMultiPkLeaderboard.fanbaseId).map(new d6g()).doOnNext(new e30() { // from class: l.s310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162035a.m187096X3(bLiveMultiPkLeaderboard, (gm0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m187098Z3(gm0 gm0Var) {
        ((wd10) this.viewModel).m202699x(this.f167585l, this.f167584k, new ud10(act(), new e30() { // from class: l.r310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157478a.m187095W3((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m187099a4(Throwable th) {
        ((wd10) this.viewModel).m202700y();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m187100b4(Pair pair) {
        mo168244N3();
        m187093U3((String) pair.first, (String) pair.second);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().MultiCallEvent.clickPkBoard().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.n310
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136898a.m187100b4((Pair) obj);
            }
        }));
    }
}
