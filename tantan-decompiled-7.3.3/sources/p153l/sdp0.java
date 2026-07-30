package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class sdp0<D extends rwn0> extends scp0<D> {
    public sdp0(dum dumVar) {
        super(dumVar);
    }

    @Override // p153l.scp0
    /* JADX INFO: renamed from: l4 */
    public void mo185387l4(hrk0 hrk0Var) {
        BLiveVoiceTagBubble bLiveVoiceTagBubble;
        super.mo185387l4(hrk0Var);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = m213810E2().m183409O2().mo122891j().voiceRoomTagInfo;
        if (bLiveVoiceRoomTagInfo == null || (bLiveVoiceTagBubble = bLiveVoiceRoomTagInfo.bubble) == null) {
            return;
        }
        final String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, SayHiBubbleView.getGreetedToUserId())) {
            return;
        }
        List<BLiveVoiceCall> listM136877p = hrk0Var.m136877p();
        if (jyb.m147479J(listM136877p)) {
            m213811F2().VoiceVirtualLiveEvent.showSayHiBubble().mo199273j(str);
            return;
        }
        final BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) jyb.m147529r(listM136877p, new qcj() { // from class: l.pdp0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveVoiceCall) obj).user));
            }
        });
        if (!NullChecker.m82486a(bLiveVoiceCall)) {
            m213811F2().VoiceVirtualLiveEvent.showSayHiBubble().mo199273j(str);
        } else {
            SayHiBubbleView.setGreetedToUserId(str);
            l51.m152888H(this.f196919f, new Runnable() { // from class: l.qdp0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f156757a.m185498q4(bLiveVoiceCall, bLiveVoiceRoomTagInfo);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m185497p4(jsv jsvVar) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setVisible(true);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m185498q4(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m78072o0(bLiveVoiceCall.user, bLiveVoiceCall.position, bLiveVoiceRoomTagInfo.bubble);
    }

    @Override // p153l.scp0, p153l.m1m0, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.rdp0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162349a.m185497p4((jsv) obj);
            }
        }));
    }
}
