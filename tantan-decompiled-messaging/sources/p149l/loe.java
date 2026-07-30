package p149l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class loe extends cua0 {

    /* JADX INFO: renamed from: y */
    public VLinear f129088y;

    public loe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.cua0
    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo108739c0() {
        return vwb.m200339n(mo52800O().m94569i2().profile.tags, new w9j() { // from class: l.koe
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m150767h0() {
        m96407C(i0g0.f110329f[0], this.f82546w);
    }

    /* JADX INFO: renamed from: i0 */
    public void m150768i0() {
        m96418N(NullChecker.m81303a(this.f129088y) ? this.f129088y : this.f82546w, new d30() { // from class: l.joe
            @Override // p149l.d30
            public final void call() {
                this.f118954a.m150769j0();
            }
        }, true);
    }

    @Override // p149l.cua0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        if (mo52800O().mo51119m0()) {
            m150767h0();
            m150768i0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m150769j0() {
        o6j0.m162859c("e_edit_profile_personality", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51462F("personality", mo52800O().mo51066J1(), mo52800O().m94569i2());
    }

    @Override // p149l.cua0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0() && mo52800O().mo51075P1();
    }
}
