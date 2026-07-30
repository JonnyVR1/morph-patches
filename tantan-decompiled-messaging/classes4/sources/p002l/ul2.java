package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import java.util.HashMap;
import l.k4t;
import l.s7m;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class ul2<V extends s7m> extends qj2<ho2, V> {
    public ul2(bsm<ho2> bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: V3 */
    public void m23513V3() {
        HashMap map = ((k4t) this).b;
        if (map == null || map.isEmpty()) {
            return;
        }
        vwb.z(((k4t) this).b.values(), new oz0());
        ((k4t) this).b.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public <P extends df2> P m23514W3(BLiveButtonType bLiveButtonType) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return null;
        }
        for (P p : map.values()) {
            if (p instanceof df2) {
                P p2 = p;
                if (TEnum.equals(bLiveButtonType, p2.mo10613X3())) {
                    return p2;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X3 */
    public View m23515X3(BLiveButtonType bLiveButtonType) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return null;
        }
        for (df2 df2Var : map.values()) {
            if (df2Var instanceof df2) {
                df2 df2Var2 = df2Var;
                if (TEnum.equals(bLiveButtonType, df2Var2.mo10613X3())) {
                    return df2Var2.mo11810a4();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Y3 */
    public AbstractC0583g4.a m23516Y3(String str) {
        HashMap map = ((k4t) this).b;
        if (map == null) {
            return null;
        }
        for (df2 df2Var : map.values()) {
            if (df2Var instanceof df2) {
                df2 df2Var2 = df2Var;
                if (TextUtils.equals(str, df2Var2.m11808Y3())) {
                    return new AbstractC0583g4.a(df2Var2.mo11810a4());
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: Z3 */
    public AbstractC0583g4.a m23517Z3(String str) {
        View viewM23518a4 = m23518a4(str);
        if (viewM23518a4 == null || !xdl0.O0(viewM23518a4)) {
            return null;
        }
        return new AbstractC0583g4.a(viewM23518a4);
    }

    /* JADX INFO: renamed from: a4 */
    public View m23518a4(String str) {
        str.getClass();
        switch (str) {
            case "pkButtonBubble":
                return m23515X3(BLiveButtonType.get("pkButton"));
            case "fastGiftButtonBubble":
                return m23515X3(BLiveButtonType.get("fastGiftButton"));
            case "settingButtonBubble":
            case "songGameNoticeBubble":
            case "stickerBubble":
            case "signInBubble":
            case "signInUpgradeBubble":
                return m23515X3(BLiveButtonType.get("settingButton"));
            case "lotteryGiftRedpacketBubble":
                return m23515X3(BLiveButtonType.get("lotteryGiftRedpacket"));
            case "giftButtonBubble":
                return m23515X3(BLiveButtonType.get("giftButton"));
            case "firstRechargeStimulusBubble":
                return m23515X3(BLiveButtonType.get("firstRechargeStimulus"));
            case "newUserTreasureBoxGetBubble":
            case "newUserTreasureBoxTakeBubble":
                return m23515X3(BLiveButtonType.get("newUserTreasureBoxButton"));
            case "gamePanelButtonBubble":
                return m23515X3(BLiveButtonType.get("intlGamePanel"));
            case "firstRechargeBubble":
                return m23515X3(BLiveButtonType.get("firstRechargeButton"));
            default:
                return null;
        }
    }
}
