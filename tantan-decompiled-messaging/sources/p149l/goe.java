package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class goe extends wqa0 {
    public goe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m127240a0(View view) {
        o6j0.m162859c("e_profile_add_my_question", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51464H(mo52800O().mo51066J1(), LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: Z */
    public void mo127241Z() {
        m96407C(mo52800O().act().color(w0c0.f183790N1), this.f187675w);
    }

    @Override // p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51119m0()) {
            mo127241Z();
        }
        xdl0.m208329E0(this.f187675w, new View.OnClickListener() { // from class: l.foe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98555a.m127240a0(view2);
            }
        });
    }

    @Override // p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        m205058X(mo52800O().m94569i2());
    }
}
