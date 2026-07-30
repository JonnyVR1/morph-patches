package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.base.data.BLiveState;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomType;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.ArrayList;
import java.util.List;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class nil<D extends ho2> extends zel<D, hil> {

    /* JADX INFO: renamed from: j */
    public List<BLiveHourLeaderBoardItem> f139109j;

    public nil(bsm<D> bsmVar) {
        super(bsmVar);
        this.f139109j = new ArrayList();
        mo51532C(new hil(bsmVar.f77095a));
    }

    /* JADX INFO: renamed from: c4 */
    private void m159520c4() {
        m206027E2().m132175y1(m206027E2().m132146l0().f56011id);
        m207199N3(m206027E2().m132160q1().m189128o()).subscribe(ffw.m121194e(new e30() { // from class: l.iil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f113413a.m159522d4((List) obj);
            }
        }, new e30() { // from class: l.jil
            @Override // p149l.e30
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        m207199N3(m206027E2().m132137i0()).subscribe(ffw.m121194e(new e30() { // from class: l.kil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123354a.m159523e4((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.lil
            @Override // p149l.e30
            public final void call(Object obj) {
                uil.class.toString();
            }
        }));
        m207199N3(m206027E2().m132130g0()).subscribe(ffw.m121197h(new e30() { // from class: l.mil
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134000a.m159524f4((BLiveHourLeaderBoard) obj);
            }
        }));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        ((hil) this.viewModel).m131281l();
        m159520c4();
    }

    @Override // p149l.zel
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public cjl mo137153S3() {
        return new cjl("主播小时榜", ((hil) this.viewModel).m131276e(), 0);
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: T3 */
    public int mo137154T3() {
        return 0;
    }

    @Override // p149l.zel
    /* JADX INFO: renamed from: V3 */
    public void mo137155V3() {
        ((hil) this.viewModel).m131277f();
        if (this.f139109j.size() > 0) {
            ((hil) this.viewModel).m131278i(this.f139109j);
        } else {
            m206027E2().m132175y1(m206027E2().m132146l0().f56011id);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public void m159521b4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        zcu.m218093h(h7d0.m129655x().m129679r(bLiveHourLeaderBoardItem.liveId).m129668g(bLiveHourLeaderBoardItem.userId).m129682u(bLiveHourLeaderBoardItem.liveState.toString()).m129674m(String.valueOf(bLiveHourLeaderBoardItem.rank)).m129684w("e_hoursboard").m129681t(gar.m125011e(bLiveHourLeaderBoardItem)).m129662a(), mo77274R2());
        boolean zM206032L2 = m206032L2();
        BLiveState bLiveState = bLiveHourLeaderBoardItem.liveState;
        if (zM206032L2) {
            if (TEnum.equals(bLiveState, "onlive")) {
                lsi0.m151595y(ypv.f199497e.getString(R$string.f46799L0));
                return;
            } else {
                m159525g4(bLiveHourLeaderBoardItem);
                return;
            }
        }
        if (!TEnum.equals(bLiveState, "onlive") || TextUtils.isEmpty(bLiveHourLeaderBoardItem.liveId) || m206027E2().m149818o().equals(bLiveHourLeaderBoardItem.roomId)) {
            m159525g4(bLiveHourLeaderBoardItem);
        } else {
            if (((Boolean) m129297F3(new w14(4100, 1))).booleanValue()) {
                return;
            }
            ((hil) this.viewModel).m131275c();
            m206028F2().JumpRoomEvent.jumpRoom().mo172463j(new JumpRoomData.C12761a().m73031t(m206027E2().mo132155o0()).m73029r(m206027E2().m149814k()).m73030s(m206027E2().mo149813j().room.f44419id).m73028q(m206027E2().m132146l0().name).m73033v(bLiveHourLeaderBoardItem.liveId).m73034w(bLiveHourLeaderBoardItem.roomId).m73032u("hour-leader-boards").m73025n(JumpRoomType.CHANGE_SOURCE_WITH_BACK).m73024m());
        }
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m159522d4(List list) {
        this.f139109j = list;
        ((hil) this.viewModel).m131278i(list);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m159523e4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        ((hil) this.viewModel).m131279j(bLiveHourLeaderBoardItem);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m159524f4(BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        ((hil) this.viewModel).m131280k(bLiveHourLeaderBoard);
    }

    /* JADX INFO: renamed from: g4 */
    public final void m159525g4(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(4100).userId(bLiveHourLeaderBoardItem.userId).setSource("live").setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, bLiveHourLeaderBoardItem.userId, 4100)).setScene("live").trackFrom("giftBanner").showShadow().build());
    }
}
