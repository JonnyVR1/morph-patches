package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes4.dex */
public class sz0 extends h4t<ho2, Object> {

    /* JADX INFO: renamed from: i */
    public HashMap<Integer, fs3> f167009i;

    public sz0(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Integer m186733K3(fs3 fs3Var) {
        BLiveBottomButton bLiveBottomButton = fs3Var.f99029a;
        if (bLiveBottomButton != null) {
            return Integer.valueOf(bLiveBottomButton.f44339id);
        }
        return -111;
    }

    /* JADX INFO: renamed from: M3 */
    public static /* synthetic */ fs3 m186735M3(fs3 fs3Var) {
        return fs3Var;
    }

    /* JADX INFO: renamed from: N3 */
    public void m186736N3() {
        HashMap<String, gul> map = this.f121122b;
        if (map == null || map.isEmpty()) {
            return;
        }
        vwb.m200354z(this.f121122b.values(), new oz0());
        this.f121122b.clear();
    }

    /* JADX INFO: renamed from: O3 */
    public final void m186737O3(List<fs3> list) {
        this.f167009i = vwb.m200319d(list, new w9j() { // from class: l.pz0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sz0.m186733K3((fs3) obj);
            }
        }, new w9j() { // from class: l.qz0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return sz0.m186735M3((fs3) obj);
            }
        });
        m129301d3(r25.class, new w9j() { // from class: l.rz0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f161599a.m186738P3((r25) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ Boolean m186738P3(r25 r25Var) {
        return Boolean.valueOf(this.f167009i.containsKey(Integer.valueOf(r25Var.f157359c)));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: R3 */
    public final void m186739R3(fs3 fs3Var) {
        BLiveBottomButton bLiveBottomButton = fs3Var.f99029a;
        int i = fs3Var.f99030b;
        int i2 = fs3Var.f99031c;
        String str = fs3Var.f99032d;
        String str2 = fs3Var.f99033e;
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
                m144512z2(new gt3(this.f188512e, bLiveBottomButton, i, i2, str, 0, str2));
                break;
            case 1:
                m144512z2(new hs3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 2:
                m144512z2(new es3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 3:
                m144512z2(new yr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                ((hdv) ypv.m215673l(fld0.f98150e)).f107306l.put(Boolean.TRUE);
                break;
            case 4:
                m144512z2(new kt3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 5:
                m144512z2(new hr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 6:
                m144512z2(new cr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 7:
                m144512z2(new jt3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 8:
                m144512z2(new mw3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 9:
                m144512z2(new lt3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 10:
                m144512z2(new xr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 11:
                m144512z2(new mt3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 12:
                m144512z2(new gr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 13:
                m144512z2(new dr3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
            case 14:
                m144512z2(new bt3(this.f188512e, bLiveBottomButton, i, i2, str, str2));
                break;
        }
    }

    /* JADX INFO: renamed from: S3 */
    public void m186740S3(List<fs3> list, String str) {
        m186737O3(list);
        ((hdv) ypv.m215673l(fld0.f98150e)).f107306l.put(Boolean.FALSE);
        vwb.m200354z(list, new e30() { // from class: l.nz0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141175a.m186739R3((fs3) obj);
            }
        });
    }
}
