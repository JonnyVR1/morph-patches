package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopMyLifeFrag;

/* JADX INFO: loaded from: classes4.dex */
public class vqa0 extends ar2<bra0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopMyLifeFrag f185343a;

    public vqa0(ner nerVar) {
        super(nerVar);
        this.f185343a = (ProfileLoopMyLifeFrag) nerVar;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m202365j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m202366l0(Bundle bundle) {
        ((bra0) this.viewModel).m106114r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m202367m0(Bundle bundle) {
        this.f185343a.mo30636J4().m152781p(jyb.m147494Y("edit_specific_profile_show_from", TextUtils.equals(this.f185343a.f34299E, "from_complete_equity_guide_card") ? "invisible_photo_card" : "invisible_photo_profile"), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116600p9().pictures.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m202368n0() {
        ((bra0) this.viewModel).m106107i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m202369o0(C4470c c4470c) {
        l51.m152889I(((bra0) this.viewModel).f77999g, new Runnable() { // from class: l.uqa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f180359a.m202368n0();
            }
        }, 1000L);
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.pqa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153654a.m202366l0((Bundle) obj);
            }
        });
        if (xra.m212792k() || xra.m212794m()) {
            if (this.f185343a.m52840i5()) {
                creates(new y20() { // from class: l.qqa0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f158974a.m202367m0((Bundle) obj);
                    }
                });
            }
            lifecycle().filter(new qcj() { // from class: l.rqa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).first().subscribe(psd0.m173597H(new y20() { // from class: l.sqa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f170154a.m202369o0((C4470c) obj);
                }
            }, new y20() { // from class: l.tqa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    vqa0.m202365j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m202370k0() {
        ((bra0) this.viewModel).m106112n();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
