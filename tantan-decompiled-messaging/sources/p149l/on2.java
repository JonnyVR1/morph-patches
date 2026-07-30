package p149l;

import android.text.TextUtils;
import android.view.View;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import java.util.ArrayList;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class on2<D extends ho2> extends AbstractC16991g4<D> {

    /* JADX INFO: renamed from: w */
    public String f144738w;

    public on2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f144738w = "BaseLiveBootBubble";
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: O4 */
    public void mo124328O4(String str, AbstractC16991g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        str.getClass();
        if (str.equals("localFollowLiveButtonBubble")) {
            mo165154a5(aVar, bLiveBubbleConfig);
        } else if (str.equals("newUserTreasureBoxGetBubble")) {
            m165155b5(bLiveBubbleConfig, sf3Var, aVar);
        } else {
            m124332S4(bLiveBubbleConfig, sf3Var, aVar);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m165155b5(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var, AbstractC16991g4.a aVar) {
        String str = bLiveBubbleConfig.bubbleTextList.get(0);
        String str2 = ypv.f199493a.m199329V().name;
        if (str2.length() > 5) {
            str2 = String.format("%s...", str2.substring(0, 5));
        }
        bLiveBubbleConfig.bubbleTextList.set(0, str2 + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + str);
        m124332S4(bLiveBubbleConfig, sf3Var, aVar);
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: j4 */
    public boolean mo124339j4(String str) {
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
            return "friends".equals(m206027E2().mo149813j().liveMode);
        }
        return ((Boolean) m129297F3(new zuj(1700))).booleanValue() || m206031K2().m182469l((LiveDialogEnum[]) arrayList.toArray(new LiveDialogEnum[0])) || mo124341l4();
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: p4 */
    public C22306c<BLiveMonetizationConfig> mo124345p4() {
        return ((idv) ypv.m215673l(fld0.f98147b)).m135632d();
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: r4 */
    public AbstractC16991g4.a mo124347r4(String str, int i) {
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                return (AbstractC16991g4.a) m129297F3(new hf3.C17294a(1700).m130730f(str));
            case "chatButtonBubble":
            case "stormCommentButtonBubble":
            case "bulletCommentButtonBubble":
            case "vipServiceBubble":
                return (AbstractC16991g4.a) m129297F3(new hf3.C17296c(1700).m130730f(str));
            case "firstRechargeGiftDialogBubble":
                return (AbstractC16991g4.a) m129297F3(new hf3.C17297d(700).m130730f(str));
            default:
                Boolean bool = (Boolean) m129297F3(new r25(1700, i));
                return (bool == null || !bool.booleanValue()) ? (AbstractC16991g4.a) m129297F3(new hf3.C17295b(1700).m130729e(i).m130730f(str)) : new AbstractC16991g4.a((View) m129297F3(new ujj(800).m194015e(BLiveButtonType.get("settingButton"))));
        }
    }

    @Override // p149l.AbstractC16991g4
    /* JADX INFO: renamed from: I4 */
    public void mo124323I4(String str) {
    }

    /* JADX INFO: renamed from: a5 */
    public void mo165154a5(AbstractC16991g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
    }
}
