package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import org.eclipse.jetty.http.HttpTokens;
import p153l.iam;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cm2<V extends iam> extends yj2<oo2, V> {
    public cm2(dum<oo2> dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: V3 */
    public void m111076V3() {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null || map.isEmpty()) {
            return;
        }
        jyb.m147537z(this.f130285b.values(), new vz0());
        this.f130285b.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public <P extends kf2> P m111077W3(BLiveButtonType bLiveButtonType) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return null;
        }
        for (uwl uwlVar : map.values()) {
            if (uwlVar instanceof kf2) {
                P p = (P) uwlVar;
                if (TEnum.equals(bLiveButtonType, p.mo96799X3())) {
                    return p;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public View m111078X3(BLiveButtonType bLiveButtonType) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return null;
        }
        for (uwl uwlVar : map.values()) {
            if (uwlVar instanceof kf2) {
                kf2 kf2Var = (kf2) uwlVar;
                if (TEnum.equals(bLiveButtonType, kf2Var.mo96799X3())) {
                    return kf2Var.mo149346a4();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y3 */
    public AbstractC17128g4.a m111079Y3(String str) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return null;
        }
        for (uwl uwlVar : map.values()) {
            if (uwlVar instanceof kf2) {
                kf2 kf2Var = (kf2) uwlVar;
                if (TextUtils.equals(str, kf2Var.m149345Y3())) {
                    return new AbstractC17128g4.a(kf2Var.mo149346a4());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public AbstractC17128g4.a m111080Z3(String str) {
        View viewM111081a4 = m111081a4(str);
        if (viewM111081a4 == null || !bnl0.m105529O0(viewM111081a4)) {
            return null;
        }
        return new AbstractC17128g4.a(viewM111081a4);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a4 */
    public View m111081a4(String str) {
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
                return m111078X3(BLiveButtonType.get(BLiveButtonType.pkButton));
            case 1:
                return m111078X3(BLiveButtonType.get("fastGiftButton"));
            case 2:
            case 7:
            case 9:
            case 12:
            case 13:
                return m111078X3(BLiveButtonType.get("settingButton"));
            case 3:
                return m111078X3(BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket));
            case 4:
                return m111078X3(BLiveButtonType.get("giftButton"));
            case 5:
                return m111078X3(BLiveButtonType.get(BLiveButtonType.firstRechargeStimulus));
            case 6:
            case 11:
                return m111078X3(BLiveButtonType.get(BLiveButtonType.newUserTreasureBoxButton));
            case 8:
                return m111078X3(BLiveButtonType.get(BLiveButtonType.intlGamePanel));
            case 10:
                return m111078X3(BLiveButtonType.get("firstRechargeButton"));
            default:
                return null;
        }
    }
}
