package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.MusicCategory;
import com.p051p1.mobile.putong.feed.newui.camera.MusicListAct;
import com.p051p1.mobile.putong.newui.camera.momosdk.MusicContent;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class hz10 extends ar2<MusicListAct> {

    /* JADX INFO: renamed from: a */
    public MusicCategory f112185a;

    /* JADX INFO: renamed from: b */
    public boolean f112186b;

    public hz10(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m137791k0() {
        l120.m152432o(l120.m152421d());
        l120.m152425h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m137792p0(List list) {
        ((MusicListAct) this.viewModel).m62382l2(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q0 */
    public /* synthetic */ void m137793q0(uxj0 uxj0Var) {
        ((MusicListAct) this.viewModel).m62383m2(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m137794r0(Throwable th) {
        ((MusicListAct) this.viewModel).m62383m2(true);
    }

    /* JADX INFO: renamed from: l0 */
    public void m137795l0() {
        if (this.f112186b) {
            return;
        }
        this.f112186b = true;
        duringCreated(FeedModule.f39701b.m61691U2(this.f112185a.category)).subscribe(psd0.m173597H(new y20() { // from class: l.fz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101438a.m137797n0((Boolean) obj);
            }
        }, new y20() { // from class: l.gz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107136a.m137798o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m0 */
    public void m137796m0(final MusicCategory musicCategory) {
        this.f112185a = musicCategory;
        creates(new y20() { // from class: l.az10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74069a.m137799s0(musicCategory, (Bundle) obj);
            }
        }, new x20() { // from class: l.bz10
            @Override // p153l.x20
            public final void call() {
                hz10.m137791k0();
            }
        });
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m137797n0(Boolean bool) {
        this.f112186b = false;
        if (bool.booleanValue()) {
            return;
        }
        ((MusicListAct) this.viewModel).m62384n2();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m137798o0(Throwable th) {
        this.f112186b = false;
        o1j0.m165634h(R$string.f39979q1);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m137799s0(MusicCategory musicCategory, Bundle bundle) {
        duringCreated(FeedModule.f39701b.m61689T2(musicCategory.category)).subscribe(psd0.m173596G(new y20() { // from class: l.cz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84416a.m137792p0((List) obj);
            }
        }));
        duringCreated(FeedModule.f39701b.m61681O2(musicCategory.category)).subscribe(psd0.m173597H(new y20() { // from class: l.dz10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91318a.m137793q0((uxj0) obj);
            }
        }, new y20() { // from class: l.ez10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96555a.m137794r0((Throwable) obj);
            }
        }));
        ((MusicListAct) this.viewModel).m62385r();
    }

    /* JADX INFO: renamed from: t0 */
    public void m137800t0(MusicContent musicContent) {
        l120.m152431n(musicContent, musicContent.startMillTime, musicContent.endMillTime);
    }

    /* JADX INFO: renamed from: u0 */
    public void m137801u0() {
        l120.m152432o(l120.m152421d());
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
