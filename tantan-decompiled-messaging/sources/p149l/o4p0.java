package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomTagInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.VoiceVirtualNineDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class o4p0<D extends nnn0> extends o3p0<D> {
    public o4p0(bsm bsmVar) {
        super(bsmVar);
    }

    @Override // p149l.o3p0
    /* JADX INFO: renamed from: l4 */
    public void mo162467l4(bik0 bik0Var) {
        BLiveVoiceTagBubble bLiveVoiceTagBubble;
        super.mo162467l4(bik0Var);
        final BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo = m206027E2().m160247O2().mo165469j().voiceRoomTagInfo;
        if (bLiveVoiceRoomTagInfo == null || (bLiveVoiceTagBubble = bLiveVoiceRoomTagInfo.bubble) == null) {
            return;
        }
        final String str = bLiveVoiceTagBubble.fromUserId;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, SayHiBubbleView.getGreetedToUserId())) {
            return;
        }
        List<BLiveVoiceCall> listM102067p = bik0Var.m102067p();
        if (vwb.m200296J(listM102067p)) {
            m206028F2().VoiceVirtualLiveEvent.showSayHiBubble().mo172463j(str);
            return;
        }
        final BLiveVoiceCall bLiveVoiceCall = (BLiveVoiceCall) vwb.m200346r(listM102067p, new w9j() { // from class: l.l4p0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLiveVoiceCall) obj).user));
            }
        });
        if (!NullChecker.m81303a(bLiveVoiceCall)) {
            m206028F2().VoiceVirtualLiveEvent.showSayHiBubble().mo172463j(str);
        } else {
            SayHiBubbleView.setGreetedToUserId(str);
            e51.m114743H(this.f188513f, new Runnable() { // from class: l.m4p0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131315a.m162614q4(bLiveVoiceCall, bLiveVoiceRoomTagInfo);
                }
            }, 2000L);
        }
    }

    /* JADX INFO: renamed from: p4 */
    public final void m162613p4(iqv iqvVar) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).setVisible(true);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m162614q4(BLiveVoiceCall bLiveVoiceCall, BLiveVoiceRoomTagInfo bLiveVoiceRoomTagInfo) {
        ((VoiceVirtualNineDeputyWidgetView) this.viewModel).m76889o0(bLiveVoiceCall.user, bLiveVoiceCall.position, bLiveVoiceRoomTagInfo.bubble);
    }

    @Override // p149l.o3p0, p149l.isl0, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.n4p0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137118a.m162613p4((iqv) obj);
            }
        }));
    }
}
