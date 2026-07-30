package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class kpe extends aza0 {
    public kpe(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a0 */
    public /* synthetic */ void m150721a0(View view) {
        sfj0.m185596c("e_profile_add_my_question", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52647H(mo53983O().mo52249J1(), LoopInputType.QUESTION_CHOICE);
    }

    /* JADX INFO: renamed from: Z */
    public void mo150722Z() {
        m121832C(mo53983O().act().color(c9c0.f80362O1), this.f74122w);
    }

    @Override // p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52302m0()) {
            mo150722Z();
        }
        bnl0.m105509E0(this.f74122w, new View.OnClickListener() { // from class: l.jpe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f122088a.m150721a0(view2);
            }
        });
    }

    @Override // p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        m101040X(mo53983O().m189086i2());
    }
}
