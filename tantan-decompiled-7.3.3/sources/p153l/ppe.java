package p153l;

import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.data.Tag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;

/* JADX INFO: loaded from: classes4.dex */
public class ppe extends g2b0 {

    /* JADX INFO: renamed from: y */
    public VLinear f153529y;

    public ppe(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.g2b0
    /* JADX INFO: renamed from: c0 */
    public ArrayList<Tag> mo128608c0() {
        return jyb.m147522n(mo53983O().m189086i2().profile.tags, new qcj() { // from class: l.ope
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf("personality".equals(((Tag) obj).category));
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public void m173197h0() {
        m121832C(q8g0.f156113f[0], this.f101821w);
    }

    /* JADX INFO: renamed from: i0 */
    public void m173198i0() {
        m121843N(NullChecker.m82486a(this.f153529y) ? this.f153529y : this.f101821w, new x20() { // from class: l.npe
            @Override // p153l.x20
            public final void call() {
                this.f143097a.m173199j0();
            }
        }, true);
    }

    @Override // p153l.g2b0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        if (mo53983O().mo52302m0()) {
            m173197h0();
            m173198i0();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m173199j0() {
        sfj0.m185596c("e_edit_profile_personality", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52645F("personality", mo53983O().mo52249J1(), mo53983O().m189086i2());
    }

    @Override // p153l.g2b0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0() && mo53983O().mo52258P1();
    }
}
