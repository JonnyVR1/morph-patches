package p153l;

import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class vn2<D extends oo2> extends AbstractC17128g4<D> {

    /* JADX INFO: renamed from: w */
    public String f184802w;

    public vn2(dum<D> dumVar) {
        super(dumVar);
        this.f184802w = "BaseLiveBootBubble";
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: O4 */
    public void mo128802O4(String str, AbstractC17128g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var) {
        str.getClass();
        if (str.equals("localFollowLiveButtonBubble")) {
            mo109358a5(aVar, bLiveBubbleConfig);
        } else if (str.equals("newUserTreasureBoxGetBubble")) {
            m201898b5(bLiveBubbleConfig, gg3Var, aVar);
        } else {
            m128806S4(bLiveBubbleConfig, gg3Var, aVar);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m201898b5(BLiveBubbleConfig bLiveBubbleConfig, gg3 gg3Var, AbstractC17128g4.a aVar) {
        String str = bLiveBubbleConfig.bubbleTextList.get(0);
        String str2 = zrv.f205799a.m207651V().name;
        if (str2.length() > 5) {
            str2 = String.format("%s...", str2.substring(0, 5));
        }
        bLiveBubbleConfig.bubbleTextList.set(0, str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        m128806S4(bLiveBubbleConfig, gg3Var, aVar);
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: j4 */
    public boolean mo128812j4(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(LiveDialogEnum.FAST_RECHARGE);
        arrayList.add(LiveDialogEnum.GIFT);
        arrayList.add(LiveDialogEnum.GIFT_REMINDER);
        arrayList.add(LiveDialogEnum.MEMBER);
        arrayList.add(LiveDialogEnum.USER_CARD);
        arrayList.add(LiveDialogEnum.WEBVIEW);
        if (!TextUtils.equals(str, "vipServiceBubble")) {
            arrayList.add(LiveDialogEnum.CHAT_INPUT);
        }
        if (TextUtils.equals(str, "firstRechargeGiftDialogBubble")) {
            return false;
        }
        if ("multiCallBubble".equals(str)) {
            return "friends".equals(m213810E2().mo183435j().liveMode);
        }
        return ((Boolean) m138856F3(new pxj(1700))).booleanValue() || m213814K2().m189705l((LiveDialogEnum[]) arrayList.toArray(new LiveDialogEnum[0])) || mo109360l4();
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: p4 */
    public C22421c<BLiveMonetizationConfig> mo128816p4() {
        return ((jfv) zrv.m221194l(htd0.f111520b)).m144717d();
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: r4 */
    public AbstractC17128g4.a mo128818r4(String str, int i) {
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                return (AbstractC17128g4.a) m138856F3(new vf3.C20825a(1700).m201115f(str));
            case "chatButtonBubble":
            case "stormCommentButtonBubble":
            case "bulletCommentButtonBubble":
            case "vipServiceBubble":
                return (AbstractC17128g4.a) m138856F3(new vf3.C20827c(1700).m201115f(str));
            case "firstRechargeGiftDialogBubble":
                return (AbstractC17128g4.a) m138856F3(new vf3.C20828d(700).m201115f(str));
            default:
                Boolean bool = (Boolean) m138856F3(new q35(1700, i));
                return (bool == null || !bool.booleanValue()) ? (AbstractC17128g4.a) m138856F3(new vf3.C20826b(1700).m201114e(i).m201115f(str)) : new AbstractC17128g4.a((View) m138856F3(new nmj(800).m163820e(BLiveButtonType.get("settingButton"))));
        }
    }

    @Override // p153l.AbstractC17128g4
    /* JADX INFO: renamed from: I4 */
    public void mo95417I4(String str) {
    }

    /* JADX INFO: renamed from: a5 */
    public void mo109358a5(AbstractC17128g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
    }
}
