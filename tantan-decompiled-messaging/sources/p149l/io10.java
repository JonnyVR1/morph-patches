package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class io10 extends jq2<MusicAggregateAct> {

    /* JADX INFO: renamed from: a */
    public Music f114090a;

    /* JADX INFO: renamed from: b */
    public boolean f114091b;

    /* JADX INFO: renamed from: c */
    public boolean f114092c;

    public io10(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m137254C0(Bundle bundle) {
        duringCreated(FeedModule.f38853b.m60495M2(this.f114090a.f38781id)).subscribe(mkd0.m154956H(new e30() { // from class: l.eo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92415a.m137271A0((Boolean) obj);
            }
        }, new e30() { // from class: l.fo10
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f39131q1);
            }
        }));
        ((MusicAggregateAct) this.viewModel).m61070r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m137255D0(Pair pair) {
        if (TextUtils.equals(this.f114090a.f38781id, (CharSequence) pair.first)) {
            ((MusicAggregateAct) this.viewModel).m61058A2((List) pair.second);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m137262k0() {
        dt10.m113523o(dt10.m113512d());
        dt10.m113516h();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m137271A0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) this.viewModel).m61071w2();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m137272E0(Music music) {
        if (TextUtils.equals(this.f114090a.f38781id, music.f38781id)) {
            this.f114090a = music;
            ((MusicAggregateAct) this.viewModel).m61072y2(music);
            ((MusicAggregateAct) this.viewModel).m61062E2();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m137273F0(Moment moment) {
        ((MusicAggregateAct) this.viewModel).m61066n2(moment);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m137274G0(roj0 roj0Var) {
        m137276I0(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m137275H0(roj0 roj0Var) {
        m137276I0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m137276I0(boolean z) {
        this.f114090a.favor = z;
        lsi0.m151578h(z ? R$string.f39160v0 : R$string.f39109n0);
        FeedModule.f38853b.m60511W2(this.f114090a);
        ((MusicAggregateAct) this.viewModel).m61062E2();
    }

    /* JADX INFO: renamed from: J0 */
    public void m137277J0(View view) {
        Music music = this.f114090a;
        if (music.favor) {
            duringCreated(FeedModule.f38853b.m60514Z1(music.f38781id)).subscribe(mkd0.m154956H(new e30() { // from class: l.un10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f177329a.m137274G0((roj0) obj);
                }
            }, new e30() { // from class: l.vn10
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f39131q1);
                }
            }));
        } else {
            duringCreated(FeedModule.f38853b.m60500R1(music)).subscribe(mkd0.m154956H(new e30() { // from class: l.wn10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f187243a.m137275H0((roj0) obj);
                }
            }, new e30() { // from class: l.xn10
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151578h(R$string.f39131q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m137278L0(MusicContent musicContent) {
        dt10.m113522n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: N0 */
    public void m137279N0() {
        dt10.m113523o(dt10.m113512d());
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        creates(new e30() { // from class: l.tn10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171204a.m137254C0((Bundle) obj);
            }
        }, new d30() { // from class: l.zn10
            @Override // p149l.d30
            public final void call() {
                io10.m137262k0();
            }
        });
        duringCreated(FeedModule.f38853b.m60501R2()).subscribe(mkd0.m154955G(new e30() { // from class: l.ao10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70782a.m137255D0((Pair) obj);
            }
        }));
        duringCreated(FeedModule.f38853b.m60502S1()).subscribe(mkd0.m154955G(new e30() { // from class: l.bo10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76476a.m137272E0((Music) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.co10
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return FeedModule.f38855d.f193061p0;
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.do10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87123a.m137273F0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m137280t0() {
        if (ijb0.m136539C().isJailedOrRestrict()) {
            kjb0.m146186I();
        } else {
            if (this.f114091b) {
                lsi0.m151578h(R$string.f38904H0);
                return;
            }
            ((MusicAggregateAct) this.viewModel).m61073z2(true);
            ((MusicAggregateAct) this.viewModel).m61067o2().m142252K(this.f114090a, new e30() { // from class: l.yn10
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199138a.m137282x0((MusicContent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m137281u0() {
        if (this.f114092c) {
            return;
        }
        this.f114092c = true;
        duringCreated(FeedModule.f38853b.m60503S2(this.f114090a.f38781id)).subscribe(mkd0.m154956H(new e30() { // from class: l.go10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103646a.m137283y0((Boolean) obj);
            }
        }, new e30() { // from class: l.ho10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108739a.m137284z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m137282x0(MusicContent musicContent) {
        ((MusicAggregateAct) this.viewModel).act().pickMediasWithInstaPicker(musicContent);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m137283y0(Boolean bool) {
        this.f114092c = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) this.viewModel).m61071w2();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m137284z0(Throwable th) {
        this.f114092c = false;
        lsi0.m151578h(R$string.f39131q1);
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
