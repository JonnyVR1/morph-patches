package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopMyLifeFrag;

/* JADX INFO: loaded from: classes4.dex */
public class ria0 extends jq2<xia0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopMyLifeFrag f159533a;

    public ria0(mcr mcrVar) {
        super(mcrVar);
        this.f159533a = (ProfileLoopMyLifeFrag) mcrVar;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m179482j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m179483l0(Bundle bundle) {
        ((xia0) this.viewModel).m209626r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m179484m0(Bundle bundle) {
        this.f159533a.mo29638J4().m109040p(vwb.m200311Y("edit_specific_profile_show_from", TextUtils.equals(this.f159533a.f33451E, "from_complete_equity_guide_card") ? "invisible_photo_card" : "invisible_photo_profile"), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169527p9().pictures.size())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m179485n0() {
        ((xia0) this.viewModel).m209619i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m179486o0(C4319c c4319c) {
        e51.m114744I(((xia0) this.viewModel).f193089g, new Runnable() { // from class: l.qia0
            @Override // java.lang.Runnable
            public final void run() {
                this.f154678a.m179485n0();
            }
        }, 1000L);
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.lia0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128179a.m179483l0((Bundle) obj);
            }
        });
        if (lqa.m150973k() || lqa.m150975m()) {
            if (this.f159533a.m51657i5()) {
                creates(new e30() { // from class: l.mia0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f133954a.m179484m0((Bundle) obj);
                    }
                });
            }
            lifecycle().filter(new w9j() { // from class: l.nia0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.oia0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144100a.m179486o0((C4319c) obj);
                }
            }, new e30() { // from class: l.pia0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ria0.m179482j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m179487k0() {
        ((xia0) this.viewModel).m209624n();
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
