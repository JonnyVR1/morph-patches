package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.MusicCategory;
import com.p046p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p046p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class zq10 extends jq2<MusicListAct> {

    /* JADX INFO: renamed from: a */
    public MusicCategory f204339a;

    /* JADX INFO: renamed from: b */
    public boolean f204340b;

    public zq10(mcr mcrVar) {
        super(mcrVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m219824k0() {
        dt10.m113523o(dt10.m113512d());
        dt10.m113516h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m219825p0(List list) {
        ((MusicListAct) this.viewModel).m61198k2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m219826q0(roj0 roj0Var) {
        ((MusicListAct) this.viewModel).m61199l2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m219827r0(Throwable th) {
        ((MusicListAct) this.viewModel).m61199l2(true);
    }

    /* JADX INFO: renamed from: l0 */
    public void m219828l0() {
        if (this.f204340b) {
            return;
        }
        this.f204340b = true;
        duringCreated(FeedModule.f38853b.m60507U2(this.f204339a.category)).subscribe(mkd0.m154956H(new e30() { // from class: l.xq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193976a.m219830n0((Boolean) obj);
            }
        }, new e30() { // from class: l.yq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199514a.m219831o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m219829m0(final MusicCategory musicCategory) {
        this.f204339a = musicCategory;
        creates(new e30() { // from class: l.sq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165909a.m219832s0(musicCategory, (Bundle) obj);
            }
        }, new d30() { // from class: l.tq10
            @Override // p149l.d30
            public final void call() {
                zq10.m219824k0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m219830n0(Boolean bool) {
        this.f204340b = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicListAct) this.viewModel).m61200m2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m219831o0(Throwable th) {
        this.f204340b = false;
        lsi0.m151578h(R$string.f39131q1);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m219832s0(MusicCategory musicCategory, Bundle bundle) {
        duringCreated(FeedModule.f38853b.m60505T2(musicCategory.category)).subscribe(mkd0.m154955G(new e30() { // from class: l.uq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177695a.m219825p0((List) obj);
            }
        }));
        duringCreated(FeedModule.f38853b.m60497O2(musicCategory.category)).subscribe(mkd0.m154956H(new e30() { // from class: l.vq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182563a.m219826q0((roj0) obj);
            }
        }, new e30() { // from class: l.wq10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187607a.m219827r0((Throwable) obj);
            }
        }));
        ((MusicListAct) this.viewModel).m61201r();
    }

    /* JADX INFO: renamed from: t0 */
    public void m219833t0(MusicContent musicContent) {
        dt10.m113522n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: u0 */
    public void m219834u0() {
        dt10.m113523o(dt10.m113512d());
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
