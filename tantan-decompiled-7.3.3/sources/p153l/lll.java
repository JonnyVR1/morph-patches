package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class lll extends i6t<oo2, ukl> {
    public lll(dum<?> dumVar) {
        super(dumVar);
        mo52715C(new ukl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m154740S3(Boolean bool) {
        if (bool.booleanValue()) {
            m154747W3();
        } else {
            m154743P3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m154741T3(List list) {
        ((ukl) this.viewModel).m196499m(list);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.oo2] */
    /* JADX INFO: renamed from: X3 */
    private void m154742X3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    /* JADX INFO: renamed from: P3 */
    public void m154743P3() {
        ((ukl) this.viewModel).m196493e();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.oo2] */
    /* JADX INFO: renamed from: R3 */
    public void m154744R3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97559h(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149414w("e_hoursboard").m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), mo78457R2());
        boolean zM213815L2 = m213815L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM213815L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
                return;
            } else {
                m154742X3(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m213810E2().m202194o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m154742X3(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m138856F3(new v24(4100, 1))).booleanValue()) {
                return;
            }
            ((ukl) this.viewModel).m196493e();
            m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(bLiveHourLeaderBoardItem.liveId).m74217w(bLiveHourLeaderBoardItem.roomId).m74215u("hour-leader-boards").m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().HourLeaderBoardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.fll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99672a.m154740S3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m154745U3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((ukl) this.viewModel).m196500n(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m154746V3(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((ukl) this.viewModel).m196501p(bLiveHourLeaderBoard);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public void m154747W3() {
        m213810E2().m168559y1(m213810E2().m168532l0().f56859id);
        ((ukl) this.viewModel).m196503s();
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m213810E2().m168559y1(m213810E2().m168532l0().f56859id);
        duringCreated(m213810E2().m168545q1().m98310o()).subscribe(dhw.m115826e(new y20() { // from class: l.gll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104867a.m154741T3((List) obj);
            }
        }, new y20() { // from class: l.hll
            @Override // p153l.y20
            public final void call(Object obj) {
                lll.class.toString();
            }
        }));
        duringCreated(m213810E2().m168523i0()).subscribe(dhw.m115826e(new y20() { // from class: l.ill
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f115587a.m154745U3((BLiveHourLeaderBoardItem) obj);
            }
        }, new y20() { // from class: l.jll
            @Override // p153l.y20
            public final void call(Object obj) {
                lll.class.toString();
            }
        }));
        duringCreated(m213810E2().m168516g0()).subscribe(dhw.m115829h(new y20() { // from class: l.kll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f127395a.m154746V3((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
