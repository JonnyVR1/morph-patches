package p007l;

import android.os.Bundle;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.MusicCategory;
import com.p000p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;
import l.d30;
import l.e30;
import l.jq2;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class zq10 extends jq2<MusicListAct> {

    /* JADX INFO: renamed from: a */
    public MusicCategory f15828a;

    /* JADX INFO: renamed from: b */
    public boolean f15829b;

    public zq10(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m17521k0() {
        dt10.m9579o(dt10.m9568d());
        dt10.m9572h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m17522p0(List list) {
        ((MusicListAct) ((jq2) this).viewModel).m2134k2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m17523q0(roj0 roj0Var) {
        ((MusicListAct) ((jq2) this).viewModel).m2135l2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m17524r0(Throwable th) {
        ((MusicListAct) ((jq2) this).viewModel).m2135l2(true);
    }

    /* JADX INFO: renamed from: l0 */
    public void m17525l0() {
        if (this.f15829b) {
            return;
        }
        this.f15829b = true;
        duringCreated(FeedModule.f314b.m1433U2(this.f15828a.category)).subscribe(mkd0.H(new e30() { // from class: l.xq10
            public final void call(Object obj) {
                this.f15068a.m17527n0((Boolean) obj);
            }
        }, new e30() { // from class: l.yq10
            public final void call(Object obj) {
                this.f15490a.m17528o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m17526m0(final MusicCategory musicCategory) {
        this.f15828a = musicCategory;
        creates(new e30() { // from class: l.sq10
            public final void call(Object obj) {
                this.f13035a.m17529s0(musicCategory, (Bundle) obj);
            }
        }, new d30() { // from class: l.tq10
            public final void call() {
                zq10.m17521k0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m17527n0(Boolean bool) {
        this.f15829b = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicListAct) ((jq2) this).viewModel).m2136m2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m17528o0(Throwable th) {
        this.f15829b = false;
        lsi0.h(R$string.f592q1);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m17529s0(MusicCategory musicCategory, Bundle bundle) {
        duringCreated(FeedModule.f314b.m1431T2(musicCategory.category)).subscribe(mkd0.G(new e30() { // from class: l.uq10
            public final void call(Object obj) {
                this.f13913a.m17522p0((List) obj);
            }
        }));
        duringCreated(FeedModule.f314b.m1423O2(musicCategory.category)).subscribe(mkd0.H(new e30() { // from class: l.vq10
            public final void call(Object obj) {
                this.f14264a.m17523q0((roj0) obj);
            }
        }, new e30() { // from class: l.wq10
            public final void call(Object obj) {
                this.f14660a.m17524r0((Throwable) obj);
            }
        }));
        ((MusicListAct) ((jq2) this).viewModel).m2137r();
    }

    /* JADX INFO: renamed from: t0 */
    public void m17530t0(MusicContent musicContent) {
        dt10.m9578n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: u0 */
    public void m17531u0() {
        dt10.m9579o(dt10.m9568d());
    }

    public void destroy() {
    }
}
