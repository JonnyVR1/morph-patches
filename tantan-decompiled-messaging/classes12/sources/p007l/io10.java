package p007l;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;
import l.v9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class io10 extends jq2<MusicAggregateAct> {

    /* JADX INFO: renamed from: a */
    public Music f9107a;

    /* JADX INFO: renamed from: b */
    public boolean f9108b;

    /* JADX INFO: renamed from: c */
    public boolean f9109c;

    public io10(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C0 */
    public /* synthetic */ void m10991C0(Bundle bundle) {
        duringCreated(FeedModule.f314b.m1421M2(this.f9107a.f242id)).subscribe(mkd0.H(new e30() { // from class: l.eo10
            public final void call(Object obj) {
                this.f7442a.m11008A0((Boolean) obj);
            }
        }, new e30() { // from class: l.fo10
            public final void call(Object obj) {
                lsi0.h(R$string.f592q1);
            }
        }));
        ((MusicAggregateAct) ((jq2) this).viewModel).m2002r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m10992D0(Pair pair) {
        if (TextUtils.equals(this.f9107a.f242id, (CharSequence) pair.first)) {
            ((MusicAggregateAct) ((jq2) this).viewModel).m1988A2((List) pair.second);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m10999k0() {
        dt10.m9579o(dt10.m9568d());
        dt10.m9572h();
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m11008A0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) ((jq2) this).viewModel).m2003w2();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m11009E0(Music music) {
        if (TextUtils.equals(this.f9107a.f242id, music.f242id)) {
            this.f9107a = music;
            ((MusicAggregateAct) ((jq2) this).viewModel).m2004y2(music);
            ((MusicAggregateAct) ((jq2) this).viewModel).m1993E2();
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final /* synthetic */ void m11010F0(Moment moment) {
        ((MusicAggregateAct) ((jq2) this).viewModel).m1998n2(moment);
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m11011G0(roj0 roj0Var) {
        m11013I0(false);
    }

    /* JADX INFO: renamed from: H0 */
    public final /* synthetic */ void m11012H0(roj0 roj0Var) {
        m11013I0(true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m11013I0(boolean z) {
        this.f9107a.favor = z;
        lsi0.h(z ? R$string.f621v0 : R$string.f570n0);
        FeedModule.f314b.m1437W2(this.f9107a);
        ((MusicAggregateAct) ((jq2) this).viewModel).m1993E2();
    }

    /* JADX INFO: renamed from: J0 */
    public void m11014J0(View view) {
        Music music = this.f9107a;
        if (music.favor) {
            duringCreated(FeedModule.f314b.m1440Z1(music.f242id)).subscribe(mkd0.H(new e30() { // from class: l.un10
                public final void call(Object obj) {
                    this.f13889a.m11011G0((roj0) obj);
                }
            }, new e30() { // from class: l.vn10
                public final void call(Object obj) {
                    lsi0.h(R$string.f592q1);
                }
            }));
        } else {
            duringCreated(FeedModule.f314b.m1426R1(music)).subscribe(mkd0.H(new e30() { // from class: l.wn10
                public final void call(Object obj) {
                    this.f14627a.m11012H0((roj0) obj);
                }
            }, new e30() { // from class: l.xn10
                public final void call(Object obj) {
                    lsi0.h(R$string.f592q1);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m11015L0(MusicContent musicContent) {
        dt10.m9578n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: N0 */
    public void m11016N0() {
        dt10.m9579o(dt10.m9568d());
    }

    /* JADX INFO: renamed from: a0 */
    public void m11017a0() {
        creates(new e30() { // from class: l.tn10
            public final void call(Object obj) {
                this.f13346a.m10991C0((Bundle) obj);
            }
        }, new d30() { // from class: l.zn10
            public final void call() {
                io10.m10999k0();
            }
        });
        duringCreated(FeedModule.f314b.m1427R2()).subscribe(mkd0.G(new e30() { // from class: l.ao10
            public final void call(Object obj) {
                this.f5789a.m10992D0((Pair) obj);
            }
        }));
        duringCreated(FeedModule.f314b.m1428S1()).subscribe(mkd0.G(new e30() { // from class: l.bo10
            public final void call(Object obj) {
                this.f6380a.m11009E0((Music) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.co10
            public final Object call() {
                return FeedModule.f316d.f14996p0;
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.do10
            public final void call(Object obj) {
                this.f7015a.m11010F0((Moment) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t0 */
    public void m11018t0() {
        if (ijb0.m10892C().isJailedOrRestrict()) {
            kjb0.m11445I();
        } else {
            if (this.f9108b) {
                lsi0.h(R$string.f365H0);
                return;
            }
            ((MusicAggregateAct) ((jq2) this).viewModel).m2005z2(true);
            ((MusicAggregateAct) ((jq2) this).viewModel).m1999o2().m11244K(this.f9107a, new e30() { // from class: l.yn10
                public final void call(Object obj) {
                    this.f15477a.m11020x0((MusicContent) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m11019u0() {
        if (this.f9109c) {
            return;
        }
        this.f9109c = true;
        duringCreated(FeedModule.f314b.m1429S2(this.f9107a.f242id)).subscribe(mkd0.H(new e30() { // from class: l.go10
            public final void call(Object obj) {
                this.f8492a.m11021y0((Boolean) obj);
            }
        }, new e30() { // from class: l.ho10
            public final void call(Object obj) {
                this.f8781a.m11022z0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m11020x0(MusicContent musicContent) {
        ((MusicAggregateAct) ((jq2) this).viewModel).act().pickMediasWithInstaPicker(musicContent);
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m11021y0(Boolean bool) {
        this.f9109c = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicAggregateAct) ((jq2) this).viewModel).m2003w2();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m11022z0(Throwable th) {
        this.f9109c = false;
        lsi0.h(R$string.f592q1);
    }

    public void destroy() {
    }
}
