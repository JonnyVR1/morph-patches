package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.view.BottomView;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes4.dex */
public class rz0 extends cm2<sz0> {
    public rz0(dum<oo2> dumVar, BottomView bottomView) {
        super(dumVar);
        mo52715C(new sz0(bottomView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public /* synthetic */ void m183661l4(LiveControlMessage liveControlMessage) {
        m183666n4();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: m4 */
    private void m183662m4(BLiveBottomButton bLiveBottomButton) {
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
                m153103z2(new za2(this.f196918e, bLiveBottomButton));
                break;
            case 1:
                m153103z2(new nb2(this.f196918e, bLiveBottomButton));
                break;
            case 2:
                m153103z2(new cb2(this.f196918e, bLiveBottomButton));
                break;
            case 3:
                m153103z2(new rq1(this.f196918e, bLiveBottomButton));
                break;
            case 4:
                m153103z2(new sq1(this.f196918e, bLiveBottomButton));
                break;
            case 5:
                m153103z2(new db2(this.f196918e, bLiveBottomButton));
                break;
            case 6:
                m153103z2(new vq1(this.f196918e, bLiveBottomButton));
                break;
            case 7:
                m153103z2(new ac2(this.f196918e, bLiveBottomButton));
                break;
            case 8:
                m153103z2(new gb2(this.f196918e, bLiveBottomButton));
                break;
            case 9:
                m153103z2(new tq1(this.f196918e, bLiveBottomButton));
                break;
            case 10:
                m153103z2(new jq1(this.f196918e, bLiveBottomButton));
                break;
            case 11:
                m153103z2(new wwn(this.f196918e, 0, bLiveBottomButton));
                break;
            case 12:
                m153103z2(new eq1(this.f196918e, bLiveBottomButton));
                break;
            case 13:
                m153103z2(new ic10(this.f196918e, bLiveBottomButton));
                break;
        }
    }

    @Override // p153l.yj2
    /* JADX INFO: renamed from: T3 */
    public ViewGroup mo130467T3() {
        return ((sz0) this.viewModel).f171347b;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m183663i4(BLiveBottomButton bLiveBottomButton) {
        m183662m4(bLiveBottomButton);
        V v2 = this.viewModel;
        View childAt = ((sz0) v2).f171347b.getChildAt(((sz0) v2).f171347b.getChildCount() - 1);
        if (childAt != null) {
            ((sz0) this.viewModel).m188611a(childAt, bLiveBottomButton.localType);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ View m183664j4(nmj nmjVar) {
        return m111078X3(nmjVar.f142712c);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m183665k4(h1e h1eVar) {
        bnl0.m105524M(((sz0) this.viewModel).f171347b, !h1eVar.f107443c);
    }

    /* JADX INFO: renamed from: n4 */
    public final void m183666n4() {
        kf2 kf2VarM111077W3 = m111077W3(BLiveButtonType.get(BLiveButtonType.firstRechargeStimulus));
        if (kf2VarM111077W3 != null) {
            m153097C2(kf2VarM111077W3);
        }
    }

    /* JADX INFO: renamed from: o4 */
    public void m183667o4(List<BLiveBottomButton> list) {
        ((sz0) this.viewModel).f171347b.removeAllViews();
        bnl0.m105524M(((sz0) this.viewModel).f171347b, true);
        m183668p4(list);
        final long jM174454o = pzi0.m174454o() - uhd0.f179016l;
        fgt.m125531c(this, "audience_bottom_menu_loaded", new y20() { // from class: l.pz0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final void m183668p4(List<BLiveBottomButton> list) {
        jyb.m147537z(list, new y20() { // from class: l.qz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160212a.m183663i4((BLiveBottomButton) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m138860d3(nmj.class, new qcj() { // from class: l.kz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f129379a.m183664j4((nmj) obj);
            }
        });
        duringCreated(m213811F2().DialogCenterEvent.changeVisibility().m199270g()).filter(new qcj() { // from class: l.lz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((h1e) obj).f107442b == 80);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.mz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139450a.m183665k4((h1e) obj);
            }
        }));
        duringCreated(m213810E2().m168539n1()).filter(new qcj() { // from class: l.nz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge_stimulus"));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.oz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149836a.m183661l4((LiveControlMessage) obj);
            }
        }));
    }
}
