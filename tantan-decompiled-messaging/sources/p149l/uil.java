package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uil extends h4t<ho2, dil> {
    public uil(bsm<?> bsmVar) {
        super(bsmVar);
        mo51532C(new dil());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m193889S3(Boolean bool) {
        if (bool.booleanValue()) {
            m193896W3();
        } else {
            m193892P3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m193890T3(List list) {
        ((dil) this.viewModel).m111885m(list);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    private void m193891X3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    /* JADX INFO: renamed from: P3 */
    public void m193892P3() {
        ((dil) this.viewModel).m111879e();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m193893R3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218093h(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129684w("e_hoursboard").m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), mo77274R2());
        boolean zM206032L2 = m206032L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM206032L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
                return;
            } else {
                m193891X3(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m206027E2().m149818o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m193891X3(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m129297F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((dil) this.viewModel).m111879e();
            m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(bLiveHourLeaderBoardItem.liveId).m73034w(bLiveHourLeaderBoardItem.roomId).m73032u("hour-leader-boards").m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().HourLeaderBoardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.oil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144138a.m193889S3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m193894U3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((dil) this.viewModel).m111886n(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m193895V3(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((dil) this.viewModel).m111887p(bLiveHourLeaderBoard);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m193896W3() {
        m206027E2().m132175y1(m206027E2().m132146l0().f56011id);
        ((dil) this.viewModel).m111889s();
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m206027E2().m132175y1(m206027E2().m132146l0().f56011id);
        duringCreated(m206027E2().m132160q1().m189128o()).subscribe(ffw.m121194e(new e30() { // from class: l.pil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149578a.m193890T3((List) obj);
            }
        }, new e30() { // from class: l.qil
            @Override // p149l.e30
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        duringCreated(m206027E2().m132137i0()).subscribe(ffw.m121194e(new e30() { // from class: l.ril
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159565a.m193894U3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.sil
            @Override // p149l.e30
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        duringCreated(m206027E2().m132130g0()).subscribe(ffw.m121197h(new e30() { // from class: l.til
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f170591a.m193895V3((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
