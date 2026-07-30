package p153l;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.profile.EditAboutMeAct;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class hme extends km90 {

    /* JADX INFO: renamed from: z */
    public Spannable f110622z;

    public hme(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
        this.f110622z = new SpannableString("");
        m168321p().creates(new y20() { // from class: l.gme
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104970a.m135857k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    private void m135856e0() {
        if (mo53983O().mo52236D2() || mo53983O().mo52265S()) {
            return;
        }
        m121832C(mo53983O().act().getResources().getColor(c9c0.f80362O1), this.f127455x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m135857k0(Bundle bundle) {
        if (mo53983O().mo52302m0()) {
            this.f110622z = new SpannableString(mo53983O().mo53478me().description);
        }
    }

    @Override // p153l.km90, p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m135858f0() {
        if ("ko".equals(mo53983O().act().getResources().getConfiguration().locale.getLanguage())) {
            bnl0.m105509E0(this.f127454w, new View.OnClickListener() { // from class: l.ame
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f72218a.m135859g0(view);
                }
            });
            return;
        }
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_edit_self_introduction_view", w1e.C20993b.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        m121835F(this.f127454w, true, true, mo53983O().act().getString(R$string.f18524Hl), 5, 500, mo53983O().act().getString(R$string.f18285A), new y20() { // from class: l.bme
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77287a.m135860h0((String) obj);
            }
        }, new pcj() { // from class: l.cme
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f82588a.m135861i0();
            }
        }, new x20() { // from class: l.dme
            @Override // p153l.x20
            public final void call() {
                w1e.m204402f(l4g0VarM204399c);
            }
        }, new x20() { // from class: l.eme
            @Override // p153l.x20
            public final void call() {
                w1e.m204401e(l4g0VarM204399c);
            }
        }, new x20() { // from class: l.fme
            @Override // p153l.x20
            public final void call() {
                this.f99767a.m135862j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m135859g0(View view) {
        mo53983O().startActivityForResult(EditAboutMeAct.m51753g2(mo53983O().act(), mo53983O().m189086i2().description), 1);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m135860h0(String str) {
        mo53983O().m189086i2().description = jyb.m147516k(str);
        mo53983O().mo52239E();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ String m135861i0() {
        return mo53983O().m189086i2().description;
    }

    @Override // p153l.km90, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        m135856e0();
        m135858f0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m135862j0() {
        m135864m0(mo53983O().m189086i2());
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m135863l0(int[] iArr) {
        if (this.f127455x.getLineCount() > 1) {
            this.f127455x.setTextSize(15.0f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m135864m0(User user) {
        if (NullChecker.m82486a(user)) {
            this.f127455x.setText(user.description);
            this.f110622z = new SpannableString(user.description);
            m135858f0();
            if (mo53983O().mo52236D2() || mo53983O().mo52265S()) {
                return;
            }
            bnl0.m105533Q0(this.f127455x, new y20() { // from class: l.zle
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f204914a.m135863l0((int[]) obj);
                }
            });
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m135864m0(mo53983O().m189086i2());
    }
}
