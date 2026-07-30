package p002l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.d30;
import l.i0g0;
import l.mcr;
import l.o6j0;
import l.vwb;
import l.w9j;
import org.jetbrains.annotations.NotNull;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class loe extends cua0 {

    /* JADX INFO: renamed from: y */
    public VLinear f14969y;

    public loe(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.cua0
    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo11364c0() {
        return vwb.n(mo3351O().m9268i2().profile.tags, new w9j() { // from class: l.koe
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m17339h0() {
        m9638C(i0g0.f[0], this.f8942w);
    }

    /* JADX INFO: renamed from: i0 */
    public void m17340i0() {
        m9649N(NullChecker.a(this.f14969y) ? this.f14969y : this.f8942w, new d30() { // from class: l.joe
            public final void call() {
                this.f13888a.m17341j0();
            }
        }, true);
    }

    @Override // p002l.cua0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        if (mo3351O().mo1570m0()) {
            m17339h0();
            m17340i0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m17341j0() {
        o6j0.c("e_edit_profile_personality", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1944F("personality", mo3351O().mo1514J1(), mo3351O().m9268i2());
    }

    @Override // p002l.cua0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0() && mo3351O().mo1523P1();
    }
}
