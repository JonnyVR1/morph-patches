package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.base.data.BLiveState;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.List;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class ell<D extends oo2> extends qhl<D, ykl> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f94566j;

    public ell(dum<D> dumVar) {
        super(dumVar);
        this.f94566j = new ArrayList();
        mo52715C(new ykl(dumVar.f90815a));
    }

    /* JADX INFO: renamed from: c4 */
    private void m121234c4() {
        m213810E2().m168559y1(m213810E2().m168532l0().f56859id);
        m214779N3(m213810E2().m168545q1().m98310o()).subscribe(dhw.m115826e(new y20() { // from class: l.zkl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f204785a.m121236d4((List) obj);
            }
        }, new y20() { // from class: l.all
            @Override // p153l.y20
            public final void call(Object obj) {
                lll.class.toString();
            }
        }));
        m214779N3(m213810E2().m168523i0()).subscribe(dhw.m115826e(new y20() { // from class: l.bll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77199a.m121237e4((BLiveHourLeaderBoardItem) obj);
            }
        }, new y20() { // from class: l.cll
            @Override // p153l.y20
            public final void call(Object obj) {
                lll.class.toString();
            }
        }));
        m214779N3(m213810E2().m168516g0()).subscribe(dhw.m115829h(new y20() { // from class: l.dll
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89546a.m121238f4((BLiveHourLeaderBoard) obj);
            }
        }));
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: P3 */
    public void mo96837P3() {
        super.mo96837P3();
        ((ykl) this.viewModel).m216482l();
        m121234c4();
    }

    @Override // p153l.qhl
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public tll mo113680S3() {
        return new tll("主播小时榜", ((ykl) this.viewModel).m216477e(), 0);
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: T3 */
    public int mo113681T3() {
        return 0;
    }

    @Override // p153l.qhl
    /* JADX INFO: renamed from: V3 */
    public void mo113682V3() {
        ((ykl) this.viewModel).m216478f();
        if (this.f94566j.size() > 0) {
            ((ykl) this.viewModel).m216479i(this.f94566j);
        } else {
            m213810E2().m168559y1(m213810E2().m168532l0().f56859id);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m121235b4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        afu.m97559h(kfd0.m149385x().m149409r(bLiveHourLeaderBoardItem.liveId).m149398g(bLiveHourLeaderBoardItem.userId).m149412u(bLiveHourLeaderBoardItem.liveState.toString()).m149404m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m149414w("e_hoursboard").m149411t(icr.m139462e(bLiveHourLeaderBoardItem)).m149392a(), mo78457R2());
        boolean zM213815L2 = m213815L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM213815L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                o1j0.m165651y(zrv.f205803e.getString(R$string.f47647L0));
                return;
            } else {
                m121239g4(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m213810E2().m202194o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m121239g4(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m138856F3(new v24(4100, 1))).booleanValue()) {
                return;
            }
            ((ykl) this.viewModel).m216476c();
            m213811F2().JumpRoomEvent.jumpRoom().mo199273j(new JumpRoomData.C12924a().m74214t(m213810E2().mo160117o0()).m74212r(m213810E2().m202191k()).m74213s(m213810E2().mo183435j().room.f45267id).m74211q(m213810E2().m168532l0().name).m74216v(bLiveHourLeaderBoardItem.liveId).m74217w(bLiveHourLeaderBoardItem.roomId).m74215u("hour-leader-boards").m74208n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m74207m());
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m121236d4(List list) {
        this.f94566j = list;
        ((ykl) this.viewModel).m216479i(list);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m121237e4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((ykl) this.viewModel).m216480j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m121238f4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((ykl) this.viewModel).m216481k(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m121239g4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }
}
