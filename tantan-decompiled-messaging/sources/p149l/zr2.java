package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p046p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class zr2<D extends nnn0> extends zbm0<D> {
    public zr2(bsm<D> bsmVar, VoiceLiveBubbleView voiceLiveBubbleView) {
        super(bsmVar);
        mo51532C(voiceLiveBubbleView);
    }

    @Override // p149l.zbm0
    /* JADX INFO: renamed from: O4 */
    public void mo217968O4(String str, AbstractC16991g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, kkm0 kkm0Var) {
        m217970S4(bLiveBubbleConfig, kkm0Var, aVar);
    }

    @Override // p149l.zbm0
    /* JADX INFO: renamed from: j4 */
    public boolean mo217974j4(String str) {
        return ((Boolean) m129297F3(new zuj(1700))).booleanValue() || m206031K2().m182469l(LiveDialogEnum.CHAT_INPUT, LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.GIFT_REMINDER, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW) || m217976l4();
    }

    @Override // p149l.zbm0
    /* JADX INFO: renamed from: p4 */
    public C22306c<BLiveMonetizationConfig> mo217978p4() {
        return ((idv) ypv.m215673l(fld0.f98147b)).m135632d();
    }

    @Override // p149l.zbm0
    /* JADX INFO: renamed from: r4 */
    public AbstractC16991g4.a mo217980r4(String str, int i) {
        return TextUtils.equals(str, "voiceChatButtonBubble") ? (AbstractC16991g4.a) m129297F3(new hf3.C17296c(1700)) : (AbstractC16991g4.a) m129297F3(new hf3.C17295b(1700).m130729e(i).m130730f(str));
    }

    @Override // p149l.zbm0
    /* JADX INFO: renamed from: I4 */
    public void mo217967I4(String str) {
    }
}
