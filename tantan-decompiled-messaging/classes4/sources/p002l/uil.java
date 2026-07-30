package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.h7d0;
import l.lsi0;
import l.w14;
import l.ypv;
import l.zcu;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uil extends h4t<ho2, dil> {
    public uil(bsm<?> bsmVar) {
        super(bsmVar);
        C(new dil());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m23488S3(Boolean bool) {
        if (bool.booleanValue()) {
            m23496W3();
        } else {
            m23491P3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m23489T3(List list) {
        ((dil) ((bwr) this).viewModel).m11901m(list);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v4, types: [l.ho2] */
    /* JADX INFO: renamed from: X3 */
    private void m23490X3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }

    /* JADX INFO: renamed from: P3 */
    public void m23491P3() {
        ((dil) ((bwr) this).viewModel).m11894e();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v14, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v16, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r1v20, types: [l.ho2] */
    /* JADX INFO: renamed from: R3 */
    public void m23492R3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.h(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).m(String.valueOf(bLiveHourLeaderBoardItem.rank)).w("e_hoursboard").t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), mo21430R2());
        boolean zM25552L2 = m25552L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM25552L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.y(ypv.e.getString(R$string.f2841L0));
                return;
            } else {
                m23490X3(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m25547E2().m17239o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m23490X3(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m14184F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((dil) ((bwr) this).viewModel).m11894e();
            m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m25547E2().mo14591o0()).m6552r(m25547E2().m17235k()).m6553s(m25547E2().m17234j().room.id).m6551q(m25547E2().m14582l0().name).m6556v(bLiveHourLeaderBoardItem.liveId).m6557w(bLiveHourLeaderBoardItem.roomId).m6555u("hour-leader-boards").m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
        }
    }

    /* JADX INFO: renamed from: T */
    public void m23493T() {
        super.T();
        duringCreated((c) m25548F2().HourLeaderBoardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.oil
            public final void call(Object obj) {
                this.f16629a.m23488S3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m23494U3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((dil) ((bwr) this).viewModel).m11902n(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m23495V3(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((dil) ((bwr) this).viewModel).m11903p(bLiveHourLeaderBoard);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public void m23496W3() {
        m25547E2().m14611y1(((DbObject) m25547E2().m14582l0()).id);
        ((dil) ((bwr) this).viewModel).m11905s();
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m23497t() {
        super.t();
        m25547E2().m14611y1(((DbObject) m25547E2().m14582l0()).id);
        duringCreated(m25547E2().m14596q1().o()).subscribe(ffw.e(new e30() { // from class: l.pil
            public final void call(Object obj) {
                this.f17386a.m23489T3((List) obj);
            }
        }, new e30() { // from class: l.qil
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        duringCreated(m25547E2().m14573i0()).subscribe(ffw.e(new e30() { // from class: l.ril
            public final void call(Object obj) {
                this.f18531a.m23494U3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.sil
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        duringCreated(m25547E2().m14566g0()).subscribe(ffw.h(new e30() { // from class: l.til
            public final void call(Object obj) {
                this.f20243a.m23495V3((BLiveHourLeaderBoard) obj);
            }
        }));
    }
}
