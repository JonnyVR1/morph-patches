package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import org.eclipse.jetty.http.HttpTokens;
import p149l.s7m;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ul2<V extends s7m> extends qj2<ho2, V> {
    public ul2(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: V3 */
    public void m194210V3() {
        HashMap<String, gul> map = this.f121122b;
        if (map == null || map.isEmpty()) {
            return;
        }
        vwb.m200354z(this.f121122b.values(), new oz0());
        this.f121122b.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public <P extends df2> P m194211W3(BLiveButtonType bLiveButtonType) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return null;
        }
        for (gul gulVar : map.values()) {
            if (gulVar instanceof df2) {
                P p = (P) gulVar;
                if (TEnum.equals(bLiveButtonType, p.mo103807X3())) {
                    return p;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public View m194212X3(BLiveButtonType bLiveButtonType) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return null;
        }
        for (gul gulVar : map.values()) {
            if (gulVar instanceof df2) {
                df2 df2Var = (df2) gulVar;
                if (TEnum.equals(bLiveButtonType, df2Var.mo103807X3())) {
                    return df2Var.mo111418a4();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y3 */
    public AbstractC16991g4.a m194213Y3(String str) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return null;
        }
        for (gul gulVar : map.values()) {
            if (gulVar instanceof df2) {
                df2 df2Var = (df2) gulVar;
                if (TextUtils.equals(str, df2Var.m111416Y3())) {
                    return new AbstractC16991g4.a(df2Var.mo111418a4());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public AbstractC16991g4.a m194214Z3(String str) {
        View viewM194215a4 = m194215a4(str);
        if (viewM194215a4 == null || !xdl0.m208349O0(viewM194215a4)) {
            return null;
        }
        return new AbstractC16991g4.a(viewM194215a4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a4 */
    public View m194215a4(String str) {
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1489609735:
                if (str.equals("pkButtonBubble")) {
                    b = 0;
                }
                break;
            case -1272548310:
                if (str.equals("fastGiftButtonBubble")) {
                    b = 1;
                }
                break;
            case -1198095154:
                if (str.equals("settingButtonBubble")) {
                    b = 2;
                }
                break;
            case -892647188:
                if (str.equals("lotteryGiftRedpacketBubble")) {
                    b = 3;
                }
                break;
            case -740913234:
                if (str.equals("giftButtonBubble")) {
                    b = 4;
                }
                break;
            case -674221379:
                if (str.equals("firstRechargeStimulusBubble")) {
                    b = 5;
                }
                break;
            case -559812495:
                if (str.equals("newUserTreasureBoxGetBubble")) {
                    b = 6;
                }
                break;
            case -249665077:
                if (str.equals("songGameNoticeBubble")) {
                    b = 7;
                }
                break;
            case 533375152:
                if (str.equals("gamePanelButtonBubble")) {
                    b = 8;
                }
                break;
            case 633669673:
                if (str.equals("stickerBubble")) {
                    b = 9;
                }
                break;
            case 715288803:
                if (str.equals("firstRechargeBubble")) {
                    b = 10;
                }
                break;
            case 1255741668:
                if (str.equals("newUserTreasureBoxTakeBubble")) {
                    b = 11;
                }
                break;
            case 1458615022:
                if (str.equals("signInBubble")) {
                    b = 12;
                }
                break;
            case 1764533542:
                if (str.equals("signInUpgradeBubble")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
        }
        switch (b) {
            case 0:
                return m194212X3(BLiveButtonType.get(BLiveButtonType.pkButton));
            case 1:
                return m194212X3(BLiveButtonType.get("fastGiftButton"));
            case 2:
            case 7:
            case 9:
            case 12:
            case 13:
                return m194212X3(BLiveButtonType.get("settingButton"));
            case 3:
                return m194212X3(BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket));
            case 4:
                return m194212X3(BLiveButtonType.get("giftButton"));
            case 5:
                return m194212X3(BLiveButtonType.get(BLiveButtonType.firstRechargeStimulus));
            case 6:
            case 11:
                return m194212X3(BLiveButtonType.get(BLiveButtonType.newUserTreasureBoxButton));
            case 8:
                return m194212X3(BLiveButtonType.get(BLiveButtonType.intlGamePanel));
            case 10:
                return m194212X3(BLiveButtonType.get("firstRechargeButton"));
            default:
                return null;
        }
    }
}
