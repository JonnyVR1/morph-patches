package p002l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopMyLifeFrag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import l.e30;
import l.e51;
import l.j760;
import l.jq2;
import l.lqa;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ria0 extends jq2<xia0> {

    /* JADX INFO: renamed from: a */
    public ProfileLoopMyLifeFrag f18528a;

    public ria0(mcr mcrVar) {
        super(mcrVar);
        this.f18528a = (ProfileLoopMyLifeFrag) mcrVar;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m22001j0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l0 */
    public /* synthetic */ void m22002l0(Bundle bundle) {
        ((xia0) ((jq2) this).viewModel).m25973r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m0 */
    public /* synthetic */ void m22003m0(Bundle bundle) {
        this.f18528a.J4().p(new j760[]{vwb.Y("edit_specific_profile_show_from", TextUtils.equals(this.f18528a.f1273E, "from_complete_equity_guide_card") ? "invisible_photo_card" : "invisible_photo_profile"), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.p9().pictures.size()))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public /* synthetic */ void m22004n0() {
        ((xia0) ((jq2) this).viewModel).m25964i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m22005o0(c cVar) {
        e51.I(((xia0) ((jq2) this).viewModel).f22299g, new Runnable() { // from class: l.qia0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17999a.m22004n0();
            }
        }, 1000L);
    }

    /* JADX INFO: renamed from: a0 */
    public void m22006a0() {
        super.a0();
        creates(new e30() { // from class: l.lia0
            public final void call(Object obj) {
                this.f14883a.m22002l0((Bundle) obj);
            }
        });
        if (lqa.k() || lqa.m()) {
            if (this.f18528a.m2164i5()) {
                creates(new e30() { // from class: l.mia0
                    public final void call(Object obj) {
                        this.f15398a.m22003m0((Bundle) obj);
                    }
                });
            }
            lifecycle().filter(new w9j() { // from class: l.nia0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).first().subscribe(mkd0.H(new e30() { // from class: l.oia0
                public final void call(Object obj) {
                    this.f16625a.m22005o0((c) obj);
                }
            }, new e30() { // from class: l.pia0
                public final void call(Object obj) {
                    ria0.m22001j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m22007k0() {
        ((xia0) ((jq2) this).viewModel).m25970n();
    }

    public void destroy() {
    }
}
