package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/ve3;", "", "<init>", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;", "button", "", "a", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;", "buttonTypes", "", "b", "(Lcom/p1/mobile/putong/live/base/data/BLiveBottomButton;[Lcom/p1/mobile/putong/live/base/data/BLiveButtonType;)Z", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ve3 {

    @NotNull
    public static final ve3 INSTANCE = new ve3();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0176, code lost:
    
        if (r1.equals("lianmai") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c4, code lost:
    
        if (r1.equals("memberManage") == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        r18.localType = com.p051p1.mobile.putong.live.base.data.BLiveButtonType.get(com.p051p1.mobile.putong.live.base.data.BLiveButtonType.callButton);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmStatic
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m201031a(@NotNull BLiveBottomButton button) {
        button.getClass();
        ve3 ve3Var = INSTANCE;
        BLiveButtonType bLiveButtonType = BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
        bLiveButtonType.getClass();
        BLiveButtonType bLiveButtonType2 = BLiveButtonType.get(BLiveButtonType.userDailyTask);
        bLiveButtonType2.getClass();
        BLiveButtonType bLiveButtonType3 = BLiveButtonType.get(BLiveButtonType.anchorDailyTask);
        bLiveButtonType3.getClass();
        BLiveButtonType bLiveButtonType4 = BLiveButtonType.get("shootGame");
        bLiveButtonType4.getClass();
        BLiveButtonType bLiveButtonType5 = BLiveButtonType.get("diamond");
        bLiveButtonType5.getClass();
        BLiveButtonType bLiveButtonType6 = BLiveButtonType.get(BLiveButtonType.guideGift);
        bLiveButtonType6.getClass();
        BLiveButtonType bLiveButtonType7 = BLiveButtonType.get(BLiveButtonType.blackList);
        bLiveButtonType7.getClass();
        BLiveButtonType bLiveButtonType8 = BLiveButtonType.get(BLiveButtonType.giftResourceStatus);
        bLiveButtonType8.getClass();
        BLiveButtonType bLiveButtonType9 = BLiveButtonType.get(BLiveButtonType.luckyParadiseV2);
        bLiveButtonType9.getClass();
        BLiveButtonType bLiveButtonType10 = BLiveButtonType.get(BLiveButtonType.emojiPlayPanel);
        bLiveButtonType10.getClass();
        BLiveButtonType bLiveButtonType11 = BLiveButtonType.get(BLiveButtonType.intlGamePanel);
        bLiveButtonType11.getClass();
        BLiveButtonType bLiveButtonType12 = BLiveButtonType.get(BLiveButtonType.lt_funFair);
        bLiveButtonType12.getClass();
        BLiveButtonType bLiveButtonType13 = BLiveButtonType.get(BLiveButtonType.onCallPk);
        bLiveButtonType13.getClass();
        if (ve3Var.m201032b(button, bLiveButtonType, bLiveButtonType2, bLiveButtonType3, bLiveButtonType4, bLiveButtonType5, bLiveButtonType6, bLiveButtonType7, bLiveButtonType8, bLiveButtonType9, bLiveButtonType10, bLiveButtonType11, bLiveButtonType12, bLiveButtonType13)) {
            return;
        }
        String str = new zit(button.url).f112154a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2092967872:
                    if (str.equals(BLiveButtonType.lotteryGiftRedpacket)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.lotteryGiftRedpacket);
                    }
                    break;
                case -1890252483:
                    if (str.equals("sticker")) {
                        button.localType = BLiveButtonType.get("sticker");
                    }
                    break;
                case -1770317270:
                    if (str.equals("game-lib")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.gameLib);
                    }
                    break;
                case -1489034955:
                    if (str.equals(BLiveButtonType.chatManager)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.chatManager);
                    }
                    break;
                case -1393028996:
                    if (str.equals("beauty")) {
                        button.localType = BLiveButtonType.get("beauty");
                    }
                    break;
                case -1207468233:
                    if (str.equals(BLiveActivity.TYPE_MULTI_CALL)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.multiCallButton);
                    }
                    break;
                case -805885608:
                    if (str.equals("earpiece")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.ear);
                    }
                    break;
                case -576571233:
                    break;
                case -540017270:
                    if (str.equals(BLiveButtonType.emojiPlayPanel)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.emojiPlayPanel);
                    }
                    break;
                case 3363353:
                    if (str.equals(BLiveButtonType.mute)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.mute);
                    }
                    break;
                case 101021965:
                    if (str.equals(BLiveButtonType.pkButton)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.pkButton);
                    }
                    break;
                case 121149255:
                    if (str.equals("showSignInDialog")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.signIn);
                    }
                    break;
                case 165177003:
                    break;
                case 483021631:
                    if (str.equals("call-apply")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.callApply);
                    }
                    break;
                case 525348817:
                    if (str.equals("userTreasureBox")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.newUserTreasureBoxButton);
                    }
                    break;
                case 767111033:
                    if (str.equals(BLiveButtonType.switchCamera)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.switchCamera);
                    }
                    break;
                case 1035339127:
                    if (str.equals("firstRecharge")) {
                        button.localType = BLiveButtonType.get("firstRechargeButton");
                    }
                    break;
                case 1092838490:
                    if (str.equals("notifyFollow")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.summonFans);
                    }
                    break;
                case 1239070508:
                    if (str.equals("showRechargeDialog")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.firstRechargeStimulus);
                    }
                    break;
                case 1300382909:
                    if (str.equals("quickGift")) {
                        button.localType = BLiveButtonType.get("fastGiftButton");
                    }
                    break;
                case 1319865717:
                    if (str.equals("showGiftDialog")) {
                        button.localType = BLiveButtonType.get("giftButton");
                    }
                    break;
                case 1406563572:
                    if (str.equals("multiPK")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.multiCallPkButton);
                    }
                    break;
                case 1438416604:
                    if (str.equals(BLiveButtonType.magicGesture)) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.magicGesture);
                    }
                    break;
                case 1632997910:
                    if (str.equals("timingFastGift")) {
                        button.localType = BLiveButtonType.get(BLiveButtonType.timingFastGiftButton);
                    }
                    break;
            }
            return;
        }
        button.localType = BLiveButtonType.get("unknown_");
    }

    /* JADX INFO: renamed from: b */
    public final boolean m201032b(BLiveBottomButton button, BLiveButtonType... buttonTypes) {
        for (BLiveButtonType bLiveButtonType : buttonTypes) {
            if (TextUtils.equals(button.type, bLiveButtonType.name())) {
                button.localType = bLiveButtonType;
                return true;
            }
        }
        return false;
    }
}
