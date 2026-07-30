package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class qw10 extends ar2<MusicAggregateAct> {

    /* JADX INFO: renamed from: a */
    public Music f159848a;

    /* JADX INFO: renamed from: b */
    public boolean f159849b;

    /* JADX INFO: renamed from: c */
    public boolean f159850c;

    public qw10(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m178419C0(Bundle bundle) {
        duringCreated(FeedModule.f39701b.m61679M2(this.f159848a.f39629id)).subscribe(psd0.m173597H(new y20() { // from class: l.mw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138992a.m178436A0((Boolean) obj);
            }
        }, new y20() { // from class: l.nw10
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f39979q1);
            }
        }));
        ((MusicAggregateAct) this.viewModel).m62254r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m178420D0(Pair pair) {
        if (TextUtils.equals(this.f159848a.f39629id, (CharSequence) pair.first)) {
            ((MusicAggregateAct) this.viewModel).m62243B2((List) pair.second);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m178427k0() {
        l120.m152432o(l120.m152421d());
        l120.m152425h();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m178436A0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) this.viewModel).m62256y2();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m178437E0(Music music) {
        if (TextUtils.equals(this.f159848a.f39629id, music.f39629id)) {
            this.f159848a = music;
            ((MusicAggregateAct) this.viewModel).m62257z2(music);
            ((MusicAggregateAct) this.viewModel).m62247F2();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m178438F0(Moment moment) {
        ((MusicAggregateAct) this.viewModel).m62251o2(moment);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m178439G0(uxj0 uxj0Var) {
        m178441I0(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m178440H0(uxj0 uxj0Var) {
        m178441I0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m178441I0(boolean z) {
        this.f159848a.favor = z;
        o1j0.m165634h(z ? R$string.f40008v0 : R$string.f39957n0);
        FeedModule.f39701b.m61695W2(this.f159848a);
        ((MusicAggregateAct) this.viewModel).m62247F2();
    }

    /* JADX INFO: renamed from: J0 */
    public void m178442J0(View view) {
        Music music = this.f159848a;
        if (music.favor) {
            duringCreated(FeedModule.f39701b.m61698Z1(music.f39629id)).subscribe(psd0.m173597H(new y20() { // from class: l.cw10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84085a.m178439G0((uxj0) obj);
                }
            }, new y20() { // from class: l.dw10
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f39979q1);
                }
            }));
        } else {
            duringCreated(FeedModule.f39701b.m61684R1(music)).subscribe(psd0.m173597H(new y20() { // from class: l.ew10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f96066a.m178440H0((uxj0) obj);
                }
            }, new y20() { // from class: l.fw10
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165634h(R$string.f39979q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m178443L0(MusicContent musicContent) {
        l120.m152431n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: N0 */
    public void m178444N0() {
        l120.m152432o(l120.m152421d());
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.bw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78674a.m178419C0((Bundle) obj);
            }
        }, new x20() { // from class: l.hw10
            @Override // p153l.x20
            public final void call() {
                qw10.m178427k0();
            }
        });
        duringCreated(FeedModule.f39701b.m61685R2()).subscribe(psd0.m173596G(new y20() { // from class: l.iw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117238a.m178420D0((Pair) obj);
            }
        }));
        duringCreated(FeedModule.f39701b.m61686S1()).subscribe(psd0.m173596G(new y20() { // from class: l.jw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122869a.m178437E0((Music) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.kw10
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f39703d.f121371p0;
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.lw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133768a.m178438F0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m178445t0() {
        if (mrb0.m159625C().isJailedOrRestrict()) {
            orb0.m168880I();
        } else {
            if (this.f159849b) {
                o1j0.m165634h(R$string.f39752H0);
                return;
            }
            ((MusicAggregateAct) this.viewModel).m62242A2(true);
            ((MusicAggregateAct) this.viewModel).m62252p2().m183241K(this.f159848a, new y20() { // from class: l.gw10
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106720a.m178447x0((MusicContent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m178446u0() {
        if (this.f159850c) {
            return;
        }
        this.f159850c = true;
        duringCreated(FeedModule.f39701b.m61687S2(this.f159848a.f39629id)).subscribe(psd0.m173597H(new y20() { // from class: l.ow10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149416a.m178448y0((Boolean) obj);
            }
        }, new y20() { // from class: l.pw10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154360a.m178449z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m178447x0(MusicContent musicContent) {
        ((MusicAggregateAct) this.viewModel).act().pickMediasWithInstaPicker(musicContent);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m178448y0(Boolean bool) {
        this.f159850c = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) this.viewModel).m62256y2();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m178449z0(Throwable th) {
        this.f159850c = false;
        o1j0.m165634h(R$string.f39979q1);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
