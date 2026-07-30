package p002l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.base.data.BLiveState;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.bwr;
import l.e30;
import l.ffw;
import l.h7d0;
import l.lsi0;
import l.w14;
import l.ypv;
import l.zcu;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nil<D extends ho2> extends zel<D, hil> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f16060j;

    public nil(bsm<D> bsmVar) {
        super(bsmVar);
        this.f16060j = new ArrayList();
        C(new hil(bsmVar.f8332a));
    }

    /* JADX INFO: renamed from: c4 */
    private void m18790c4() {
        m25547E2().m14611y1(((DbObject) m25547E2().m14582l0()).id);
        m25707N3(m25547E2().m14596q1().o()).subscribe(ffw.e(new e30() { // from class: l.iil
            public final void call(Object obj) {
                this.f13264a.m18792d4((List) obj);
            }
        }, new e30() { // from class: l.jil
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        m25707N3(m25547E2().m14573i0()).subscribe(ffw.e(new e30() { // from class: l.kil
            public final void call(Object obj) {
                this.f14346a.m18793e4((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.lil
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        m25707N3(m25547E2().m14566g0()).subscribe(ffw.h(new e30() { // from class: l.mil
            public final void call(Object obj) {
                this.f15403a.m18794f4((BLiveHourLeaderBoard) obj);
            }
        }));
    }

    @Override // p002l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo10254P3() {
        super.mo10254P3();
        ((hil) ((bwr) this).viewModel).m14400l();
        m18790c4();
    }

    @Override // p002l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo15251S3() {
        return new cjl("主播小时榜", ((hil) ((bwr) this).viewModel).m14394e(), 0);
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo15252T3() {
        return 0;
    }

    @Override // p002l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo15253V3() {
        ((hil) ((bwr) this).viewModel).m14395f();
        if (this.f16060j.size() > 0) {
            ((hil) ((bwr) this).viewModel).m14396i(this.f16060j);
        } else {
            m25547E2().m14611y1(((DbObject) m25547E2().m14582l0()).id);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m18791b4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.h(h7d0.x().r(bLiveHourLeaderBoardItem.liveId).g(bLiveHourLeaderBoardItem.userId).u(bLiveHourLeaderBoardItem.liveState.toString()).m(String.valueOf(bLiveHourLeaderBoardItem.rank)).w("e_hoursboard").t(gar.m13677e(bLiveHourLeaderBoardItem)).a(), mo21430R2());
        boolean zM25552L2 = m25552L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM25552L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.y(ypv.e.getString(R$string.f2841L0));
                return;
            } else {
                m18795g4(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m25547E2().m17239o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m18795g4(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m14184F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((hil) ((bwr) this).viewModel).m14393c();
            m25548F2().JumpRoomEvent.jumpRoom().j(new JumpRoomData.C0350a().m6554t(m25547E2().mo14591o0()).m6552r(m25547E2().m17235k()).m6553s(m25547E2().m17234j().room.id).m6551q(m25547E2().m14582l0().name).m6556v(bLiveHourLeaderBoardItem.liveId).m6557w(bLiveHourLeaderBoardItem.roomId).m6555u("hour-leader-boards").m6548n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m6547m());
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m18792d4(List list) {
        this.f16060j = list;
        ((hil) ((bwr) this).viewModel).m14396i(list);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m18793e4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((hil) ((bwr) this).viewModel).m14398j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m18794f4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((hil) ((bwr) this).viewModel).m14399k(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m18795g4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }
}
