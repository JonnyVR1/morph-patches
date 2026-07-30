package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveFeedSummary;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.voice.entry.VoiceConversationsEntry;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class u2n0 extends jq2<VoiceConversationsEntry> {

    /* JADX INFO: renamed from: a */
    public int f173505a;

    /* JADX INFO: renamed from: b */
    public int f173506b;

    public u2n0(mcr mcrVar) {
        super(mcrVar);
        this.f173506b = 1;
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m191527f0(Throwable th) {
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m191528g0(Throwable th) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m191534m0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public void m191537p0(Bundle bundle) {
        if (act() != null) {
            act().startActivity(l9s.m149044G().mo67229M6().mo102419d(act()));
            l9s.m149044G().mo67229M6().mo102436u(act(), bundle);
        }
    }

    /* JADX INFO: renamed from: u0 */
    private void m191538u0() {
        duringCreated(LiveVoiceApi.getVoiceFeedEntryConfig()).subscribe(ffw.m121194e(new e30() { // from class: l.o2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141541a.m191539q0((q4n0) obj);
            }
        }, new e30() { // from class: l.p2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146902a.m191540r0((Throwable) obj);
            }
        }));
        gld0<hl3> gld0Var = gld0.f103313c;
        duringCreated(((hl3) s9s.m182763m(gld0Var)).m131634h()).map(new w9j() { // from class: l.q2n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((BLiveCounter) obj).activity.voiceActivityUnread);
            }
        }).distinctUntilChanged().subscribe(ffw.m121194e(new e30() { // from class: l.r2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157426a.m191541s0((Integer) obj);
            }
        }, new e30() { // from class: l.s2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                u2n0.m191528g0((Throwable) obj);
            }
        }));
        duringCreated(((hl3) s9s.m182763m(gld0Var)).m131633g()).subscribe(ffw.m121194e(new e30() { // from class: l.t2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167521a.m191542t0((roj0) obj);
            }
        }, new e30() { // from class: l.k2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                u2n0.m191534m0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        duringCreated(s9s.f163228b.m195865j6().take(1)).subscribe(ffw.m121194e(new e30() { // from class: l.j2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveVoiceApi.notifyRefreshVoiceActivitiesNum();
            }
        }, new e30() { // from class: l.l2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                u2n0.m191527f0((Throwable) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.m2n0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return l9s.m149101u(TabName.Msg);
            }
        }, false).subscribe(ffw.m121193d(new e30() { // from class: l.n2n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136861a.m191537p0((Bundle) obj);
            }
        }));
        m191538u0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m191539q0(q4n0 q4n0Var) {
        List<BLiveFeedSummary> list = q4n0Var.f152653a;
        if (list == null || list.size() <= 0 || !q4n0Var.f152653a.get(0).display || !qib0.f154713b0.f139232c.mo67226Kb()) {
            ((VoiceConversationsEntry) this.viewModel).m70953d();
        } else {
            ((VoiceConversationsEntry) this.viewModel).m70955i(q4n0Var.f152654b, q4n0Var.f152653a.get(0), true);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m191540r0(Throwable th) {
        ((VoiceConversationsEntry) this.viewModel).m70953d();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m191541s0(Integer num) {
        if (this.f173505a != num.intValue()) {
            this.f173505a = num.intValue();
            ((VoiceConversationsEntry) this.viewModel).setRedDot(num.intValue());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m191542t0(roj0 roj0Var) {
        ((VoiceConversationsEntry) this.viewModel).m70954e();
    }

    /* JADX INFO: renamed from: x0 */
    public void m191543x0() {
        m191538u0();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
