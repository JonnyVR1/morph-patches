package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import java.util.ArrayList;
import l.fld0;
import l.idv;
import l.ypv;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class on2<D extends ho2> extends AbstractC0583g4<D> {

    /* JADX INFO: renamed from: w */
    public String f16724w;

    public on2(bsm<D> bsmVar) {
        super(bsmVar);
        this.f16724w = "BaseLiveBootBubble";
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: O4 */
    public void mo13590O4(String str, AbstractC0583g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var) {
        str.getClass();
        if (str.equals("localFollowLiveButtonBubble")) {
            mo19639a5(aVar, bLiveBubbleConfig);
        } else if (str.equals("newUserTreasureBoxGetBubble")) {
            m19640b5(bLiveBubbleConfig, sf3Var, aVar);
        } else {
            m13594S4(bLiveBubbleConfig, sf3Var, aVar);
        }
    }

    /* JADX INFO: renamed from: b5 */
    public final void m19640b5(BLiveBubbleConfig bLiveBubbleConfig, sf3 sf3Var, AbstractC0583g4.a aVar) {
        String str = (String) bLiveBubbleConfig.bubbleTextList.get(0);
        String str2 = ypv.a.V().name;
        if (str2.length() > 5) {
            str2 = String.format("%s...", str2.substring(0, 5));
        }
        bLiveBubbleConfig.bubbleTextList.set(0, str2 + " " + str);
        m13594S4(bLiveBubbleConfig, sf3Var, aVar);
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: j4 */
    public boolean mo13602j4(String str) {
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
            return "friends".equals(m25547E2().m17234j().liveMode);
        }
        return ((Boolean) m14184F3(new zuj(1700))).booleanValue() || m25551K2().m22224l((LiveDialogEnum[]) arrayList.toArray(new LiveDialogEnum[0])) || mo13604l4();
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: p4 */
    public c<BLiveMonetizationConfig> mo13608p4() {
        return ((idv) ypv.l(fld0.b)).d();
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: r4 */
    public AbstractC0583g4.a mo13610r4(String str, int i) {
        str.getClass();
        switch (str) {
            case "localFollowLiveButtonBubble":
                return (AbstractC0583g4.a) m14184F3(new hf3.C0603a(1700).m14351f(str));
            case "chatButtonBubble":
            case "stormCommentButtonBubble":
            case "bulletCommentButtonBubble":
            case "vipServiceBubble":
                return (AbstractC0583g4.a) m14184F3(new hf3.C0605c(1700).m14351f(str));
            case "firstRechargeGiftDialogBubble":
                return (AbstractC0583g4.a) m14184F3(new hf3.C0606d(700).m14351f(str));
            default:
                Boolean bool = (Boolean) m14184F3(new r25(1700, i));
                return (bool == null || !bool.booleanValue()) ? (AbstractC0583g4.a) m14184F3(new hf3.C0604b(1700).m14350e(i).m14351f(str)) : new AbstractC0583g4.a((View) m14184F3(new ujj(800).m23512e(BLiveButtonType.get("settingButton"))));
        }
    }

    @Override // p002l.AbstractC0583g4
    /* JADX INFO: renamed from: I4 */
    public void mo13585I4(String str) {
    }

    /* JADX INFO: renamed from: a5 */
    public void mo19639a5(AbstractC0583g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig) {
    }
}
