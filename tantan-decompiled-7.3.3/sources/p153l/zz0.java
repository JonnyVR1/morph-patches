package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes4.dex */
public class zz0 extends i6t<oo2, Object> {

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, et3> f206658i;

    public zz0(dum<oo2> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Integer m222206K3(et3 et3Var) {
        BLiveBottomButton bLiveBottomButton = et3Var.f95681a;
        if (bLiveBottomButton != null) {
            return Integer.valueOf(bLiveBottomButton.f45187id);
        }
        return -111;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ et3 m222208M3(et3 et3Var) {
        return et3Var;
    }

    /* JADX INFO: renamed from: N3 */
    public void m222209N3() {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null || map.isEmpty()) {
            return;
        }
        jyb.m147537z(this.f130285b.values(), new vz0());
        this.f130285b.clear();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m222210O3(List<et3> list) {
        this.f206658i = jyb.m147502d(list, new qcj() { // from class: l.wz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zz0.m222206K3((et3) obj);
            }
        }, new qcj() { // from class: l.xz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zz0.m222208M3((et3) obj);
            }
        });
        m138860d3(q35.class, new qcj() { // from class: l.yz0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f202165a.m222211P3((q35) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Boolean m222211P3(q35 q35Var) {
        return Boolean.valueOf(this.f206658i.containsKey(Integer.valueOf(q35Var.f155423c)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: R3 */
    public final void m222212R3(et3 et3Var) {
        BLiveBottomButton bLiveBottomButton = et3Var.f95681a;
        int i = et3Var.f95682b;
        int i2 = et3Var.f95683c;
        String str = et3Var.f95684d;
        String str2 = et3Var.f95685e;
        String string = bLiveBottomButton.localType.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -2114315087:
                if (string.equals("shootGame")) {
                    b = 0;
                }
                break;
            case -2092967872:
                if (string.equals(BLiveButtonType.lotteryGiftRedpacket)) {
                    b = 1;
                }
                break;
            case -2076820916:
                if (string.equals(BLiveButtonType.guideGift)) {
                    b = 2;
                }
                break;
            case -2050875664:
                if (string.equals(BLiveButtonType.giftResourceStatus)) {
                    b = 3;
                }
                break;
            case -1890252483:
                if (string.equals("sticker")) {
                    b = 4;
                }
                break;
            case -1489034955:
                if (string.equals(BLiveButtonType.chatManager)) {
                    b = 5;
                }
                break;
            case -1393028996:
                if (string.equals("beauty")) {
                    b = 6;
                }
                break;
            case -902468670:
                if (string.equals(BLiveButtonType.signIn)) {
                    b = 7;
                }
                break;
            case -240132779:
                if (string.equals("unknown_")) {
                    b = 8;
                }
                break;
            case 80032833:
                if (string.equals(BLiveButtonType.summonFans)) {
                    b = 9;
                }
                break;
            case 715842441:
                if (string.equals("firstRechargeButton")) {
                    b = 10;
                }
                break;
            case 767111033:
                if (string.equals(BLiveButtonType.switchCamera)) {
                    b = 11;
                }
                break;
            case 1102827312:
                if (string.equals(BLiveButtonType.callButton)) {
                    b = 12;
                }
                break;
            case 1332059453:
                if (string.equals(BLiveButtonType.blackList)) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 1438416604:
                if (string.equals(BLiveButtonType.magicGesture)) {
                    b = 14;
                }
                break;
        }
        switch (b) {
            case 0:
                m153103z2(new fu3(this.f196918e, bLiveBottomButton, i, i2, str, 0, str2));
                break;
            case 1:
                m153103z2(new gt3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 2:
                m153103z2(new dt3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 3:
                m153103z2(new xs3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                ((ifv) zrv.m221194l(htd0.f111523e)).f114703l.put(Boolean.TRUE);
                break;
            case 4:
                m153103z2(new ju3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 5:
                m153103z2(new gs3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 6:
                m153103z2(new bs3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 7:
                m153103z2(new iu3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 8:
                m153103z2(new lx3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 9:
                m153103z2(new ku3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 10:
                m153103z2(new ws3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 11:
                m153103z2(new lu3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 12:
                m153103z2(new fs3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 13:
                m153103z2(new cs3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 14:
                m153103z2(new au3(this.f196918e, bLiveBottomButton, i, i2, str, str2));
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m222213S3(List<et3> list, String str) {
        m222210O3(list);
        ((ifv) zrv.m221194l(htd0.f111523e)).f114703l.put(Boolean.FALSE);
        jyb.m147537z(list, new y20() { // from class: l.uz0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181695a.m222212R3((et3) obj);
            }
        });
    }
}
