package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveFeedSummary;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class ybn0 extends ar2<VoiceConversationsEntry> {

    /* JADX INFO: renamed from: a */
    public int f198350a;

    /* JADX INFO: renamed from: b */
    public int f198351b;

    public ybn0(ner nerVar) {
        super(nerVar);
        this.f198351b = 1;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m215086f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m215087g0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m215093m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m215096p0(Bundle bundle) {
        if (act() != null) {
            act().startActivity(mbs.m157821G().mo68412M6().mo127333d(act()));
            mbs.m157821G().mo68412M6().mo127350u(act(), bundle);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private void m215097u0() {
        duringCreated(LiveVoiceApi.getVoiceFeedEntryConfig()).subscribe(dhw.m115826e(new y20() { // from class: l.sbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167165a.m215098q0((udn0) obj);
            }
        }, new y20() { // from class: l.tbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172973a.m215099r0((Throwable) obj);
            }
        }));
        itd0<gm3> itd0Var = itd0.f116821c;
        duringCreated(((gm3) tbs.m190077m(itd0Var)).m130733h()).map(new qcj() { // from class: l.ubn0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveCounter) obj).activity.voiceActivityUnread);
            }
        }).distinctUntilChanged().subscribe(dhw.m115826e(new y20() { // from class: l.vbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183265a.m215100s0((Integer) obj);
            }
        }, new y20() { // from class: l.wbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ybn0.m215087g0((Throwable) obj);
            }
        }));
        duringCreated(((gm3) tbs.m190077m(itd0Var)).m130732g()).subscribe(dhw.m115826e(new y20() { // from class: l.xbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f193177a.m215101t0((uxj0) obj);
            }
        }, new y20() { // from class: l.obn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ybn0.m215093m0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        duringCreated(tbs.f172989b.m203652j6().take(1)).subscribe(dhw.m115826e(new y20() { // from class: l.nbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
            }
        }, new y20() { // from class: l.pbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                ybn0.m215086f0((Throwable) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.qbn0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return mbs.m157878u(TabName.Msg);
            }
        }, false).subscribe(dhw.m115825d(new y20() { // from class: l.rbn0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162032a.m215096p0((Bundle) obj);
            }
        }));
        m215097u0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m215098q0(udn0 udn0Var) {
        List<BLiveFeedSummary> list = udn0Var.f178557a;
        if (list == null || list.size() <= 0 || !udn0Var.f178557a.get(0).display || !uqb0.f180396b0.f170326c.mo68409Kb()) {
            ((VoiceConversationsEntry) this.viewModel).m72136d();
        } else {
            ((VoiceConversationsEntry) this.viewModel).m72138i(udn0Var.f178558b, udn0Var.f178557a.get(0), true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m215099r0(Throwable th) {
        ((VoiceConversationsEntry) this.viewModel).m72136d();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m215100s0(Integer num) {
        if (this.f198350a != num.intValue()) {
            this.f198350a = num.intValue();
            ((VoiceConversationsEntry) this.viewModel).setRedDot(num.intValue());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m215101t0(uxj0 uxj0Var) {
        ((VoiceConversationsEntry) this.viewModel).m72137e();
    }

    /* JADX INFO: renamed from: x0 */
    public void m215102x0() {
        m215097u0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
