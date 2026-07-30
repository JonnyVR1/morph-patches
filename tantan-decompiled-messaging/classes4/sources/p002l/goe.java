package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import l.mcr;
import l.o6j0;
import l.w0c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class goe extends wqa0 {
    public goe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m13990a0(View view) {
        o6j0.c("e_profile_add_my_question", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1946H(mo3351O().mo1514J1(), LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: Z */
    public void mo13991Z() {
        m9638C(mo3351O().act().color(w0c0.N1), this.f21931w);
    }

    @Override // p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1570m0()) {
            mo13991Z();
        }
        xdl0.E0(this.f21931w, new View.OnClickListener() { // from class: l.foe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f10572a.m13990a0(view2);
            }
        });
    }

    @Override // p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        m25325X(mo3351O().m9268i2());
    }
}
