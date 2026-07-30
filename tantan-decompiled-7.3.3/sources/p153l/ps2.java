package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveBubbleConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p051p1.mobile.putong.live.livingroom.voice.bubble.VoiceLiveBubbleView;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class ps2<D extends rwn0> extends dlm0<D> {
    public ps2(dum<D> dumVar, VoiceLiveBubbleView voiceLiveBubbleView) {
        super(dumVar);
        mo52715C(voiceLiveBubbleView);
    }

    @Override // p153l.dlm0
    /* JADX INFO: renamed from: O4 */
    public void mo116828O4(String str, AbstractC17128g4.a aVar, BLiveBubbleConfig bLiveBubbleConfig, otm0 otm0Var) {
        m116830S4(bLiveBubbleConfig, otm0Var, aVar);
    }

    @Override // p153l.dlm0
    /* JADX INFO: renamed from: j4 */
    public boolean mo116834j4(String str) {
        return ((Boolean) m138856F3(new pxj(1700))).booleanValue() || m213814K2().m189705l(LiveDialogEnum.CHAT_INPUT, LiveDialogEnum.FAST_RECHARGE, LiveDialogEnum.GIFT, LiveDialogEnum.GIFT_REMINDER, LiveDialogEnum.MEMBER, LiveDialogEnum.USER_CARD, LiveDialogEnum.WEBVIEW) || m116836l4();
    }

    @Override // p153l.dlm0
    /* JADX INFO: renamed from: p4 */
    public C22421c<BLiveMonetizationConfig> mo116838p4() {
        return ((jfv) zrv.m221194l(htd0.f111520b)).m144717d();
    }

    @Override // p153l.dlm0
    /* JADX INFO: renamed from: r4 */
    public AbstractC17128g4.a mo116840r4(String str, int i) {
        return TextUtils.equals(str, "voiceChatButtonBubble") ? (AbstractC17128g4.a) m138856F3(new vf3.C20827c(1700)) : (AbstractC17128g4.a) m138856F3(new vf3.C20826b(1700).m201114e(i).m201115f(str));
    }

    @Override // p153l.dlm0
    /* JADX INFO: renamed from: I4 */
    public void mo116827I4(String str) {
    }
}
