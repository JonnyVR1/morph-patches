package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes4.dex */
public class kz0 extends ul2<lz0> {
    public kz0(bsm<ho2> bsmVar, BottomView bottomView) {
        super(bsmVar);
        mo51532C(new lz0(bottomView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m147919l4(LiveControlMessage liveControlMessage) {
        m147924n4();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m4 */
    private void m147920m4(BLiveBottomButton bLiveBottomButton) {
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -2092967872:
                if (string.equals(BLiveButtonType.lotteryGiftRedpacket)) {
                    b = 0;
                }
                break;
            case -1986648670:
                if (string.equals("settingButton")) {
                    b = 1;
                }
                break;
            case -1733544604:
                if (string.equals(BLiveButtonType.multiCallPkButton)) {
                    b = 2;
                }
                break;
            case -1372337666:
                if (string.equals("fastGiftButton")) {
                    b = 3;
                }
                break;
            case -915885359:
                if (string.equals(BLiveButtonType.firstRechargeStimulus)) {
                    b = 4;
                }
                break;
            case -759804765:
                if (string.equals(BLiveButtonType.newUserTreasureBoxButton)) {
                    b = 5;
                }
                break;
            case -319825790:
                if (string.equals("giftButton")) {
                    b = 6;
                }
                break;
            case -240132779:
                if (string.equals("unknown_")) {
                    b = 7;
                }
                break;
            case 101021965:
                if (string.equals(BLiveButtonType.pkButton)) {
                    b = 8;
                }
                break;
            case 715842441:
                if (string.equals("firstRechargeButton")) {
                    b = 9;
                }
                break;
            case 1102827312:
                if (string.equals(BLiveButtonType.callButton)) {
                    b = 10;
                }
                break;
            case 1525811029:
                if (string.equals(BLiveButtonType.intlGamePanel)) {
                    b = 11;
                }
                break;
            case 1655054676:
                if (string.equals("diamond")) {
                    b = 12;
                }
                break;
            case 1659505993:
                if (string.equals(BLiveButtonType.multiCallButton)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
        }
        switch (b) {
            case 0:
                m144512z2(new sa2(this.f188512e, bLiveBottomButton));
                break;
            case 1:
                m144512z2(new gb2(this.f188512e, bLiveBottomButton));
                break;
            case 2:
                m144512z2(new va2(this.f188512e, bLiveBottomButton));
                break;
            case 3:
                m144512z2(new kq1(this.f188512e, bLiveBottomButton));
                break;
            case 4:
                m144512z2(new lq1(this.f188512e, bLiveBottomButton));
                break;
            case 5:
                m144512z2(new wa2(this.f188512e, bLiveBottomButton));
                break;
            case 6:
                m144512z2(new oq1(this.f188512e, bLiveBottomButton));
                break;
            case 7:
                m144512z2(new tb2(this.f188512e, bLiveBottomButton));
                break;
            case 8:
                m144512z2(new za2(this.f188512e, bLiveBottomButton));
                break;
            case 9:
                m144512z2(new mq1(this.f188512e, bLiveBottomButton));
                break;
            case 10:
                m144512z2(new cq1(this.f188512e, bLiveBottomButton));
                break;
            case 11:
                m144512z2(new wun(this.f188512e, 0, bLiveBottomButton));
                break;
            case 12:
                m144512z2(new xp1(this.f188512e, bLiveBottomButton));
                break;
            case 13:
                m144512z2(new y310(this.f188512e, bLiveBottomButton));
                break;
        }
    }

    @Override // p149l.qj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo104532T3() {
        return ((lz0) this.viewModel).f130618b;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m147921i4(BLiveBottomButton bLiveBottomButton) {
        m147920m4(bLiveBottomButton);
        V v2 = this.viewModel;
        View childAt = ((lz0) v2).f130618b.getChildAt(((lz0) v2).f130618b.getChildCount() - 1);
        if (childAt != null) {
            ((lz0) this.viewModel).m152301a(childAt, bLiveBottomButton.localType);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ View m147922j4(ujj ujjVar) {
        return m194212X3(ujjVar.f176768c);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m147923k4(tzd tzdVar) {
        xdl0.m208344M(((lz0) this.viewModel).f130618b, !tzdVar.f172731c);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m147924n4() {
        df2 df2VarM194211W3 = m194211W3(BLiveButtonType.get(BLiveButtonType.firstRechargeStimulus));
        if (df2VarM194211W3 != null) {
            m144506C2(df2VarM194211W3);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m147925o4(List<BLiveBottomButton> list) {
        ((lz0) this.viewModel).f130618b.removeAllViews();
        xdl0.m208344M(((lz0) this.viewModel).f130618b, true);
        m147926p4(list);
        final long jM155944o = mqi0.m155944o() - r9d0.f158355l;
        eet.m116004c(this, "audience_bottom_menu_loaded", new e30() { // from class: l.iz0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m147926p4(List<BLiveBottomButton> list) {
        vwb.m200354z(list, new e30() { // from class: l.jz0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120346a.m147921i4((BLiveBottomButton) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m129301d3(ujj.class, new w9j() { // from class: l.dz0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88445a.m147922j4((ujj) obj);
            }
        });
        duringCreated(m206028F2().DialogCenterEvent.changeVisibility().m172460g()).filter(new w9j() { // from class: l.ez0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((tzd) obj).f172730b == 80);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fz0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99925a.m147923k4((tzd) obj);
            }
        }));
        duringCreated(m206027E2().m132153n1()).filter(new w9j() { // from class: l.gz0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge_stimulus"));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.hz0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110163a.m147919l4((LiveControlMessage) obj);
            }
        }));
    }
}
