package p149l;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.p053ui.profile.EditAboutMeAct;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class dle extends ge90 {

    /* JADX INFO: renamed from: z */
    public Spannable f86799z;

    public dle(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
        this.f86799z = new SpannableString("");
        m131821p().creates(new e30() { // from class: l.cle
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81385a.m112341k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e0 */
    private void m112340e0() {
        if (mo52800O().mo51053D2() || mo52800O().mo51082S()) {
            return;
        }
        m96407C(mo52800O().act().getResources().getColor(w0c0.f183790N1), this.f102172x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m112341k0(Bundle bundle) {
        if (mo52800O().mo51119m0()) {
            this.f86799z = new SpannableString(mo52800O().mo52295me().description);
        }
    }

    @Override // p149l.ge90, p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: f0 */
    public final void m112342f0() {
        if ("ko".equals(mo52800O().act().getResources().getConfiguration().locale.getLanguage())) {
            xdl0.m208329E0(this.f102171w, new View.OnClickListener() { // from class: l.wke
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f186742a.m112343g0(view);
                }
            });
            return;
        }
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_edit_self_introduction_view", i0e.C17451b.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        m96410F(this.f102171w, true, true, mo52800O().act().getString(R$string.f18706ll), 5, 500, mo52800O().act().getString(R$string.f17566A), new e30() { // from class: l.xke
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193285a.m112344h0((String) obj);
            }
        }, new v9j() { // from class: l.yke
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f198746a.m112345i0();
            }
        }, new d30() { // from class: l.zke
            @Override // p149l.d30
            public final void call() {
                i0e.m133797f(cwf0VarM133794c);
            }
        }, new d30() { // from class: l.ale
            @Override // p149l.d30
            public final void call() {
                i0e.m133796e(cwf0VarM133794c);
            }
        }, new d30() { // from class: l.ble
            @Override // p149l.d30
            public final void call() {
                this.f76178a.m112346j0();
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m112343g0(View view) {
        mo52800O().startActivityForResult(EditAboutMeAct.m50570e2(mo52800O().act(), mo52800O().m94569i2().description), 1);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m112344h0(String str) {
        mo52800O().m94569i2().description = vwb.m200333k(str);
        mo52800O().mo51056E();
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ String m112345i0() {
        return mo52800O().m94569i2().description;
    }

    @Override // p149l.ge90, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        m112340e0();
        m112342f0();
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m112346j0() {
        m112348m0(mo52800O().m94569i2());
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m112347l0(int[] iArr) {
        if (this.f102172x.getLineCount() > 1) {
            this.f102172x.setTextSize(15.0f);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m112348m0(User user) {
        if (NullChecker.m81303a(user)) {
            this.f102172x.setText(user.description);
            this.f86799z = new SpannableString(user.description);
            m112342f0();
            if (mo52800O().mo51053D2() || mo52800O().mo51082S()) {
                return;
            }
            xdl0.m208353Q0(this.f102172x, new e30() { // from class: l.vke
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f181782a.m112347l0((int[]) obj);
                }
            });
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m112348m0(mo52800O().m94569i2());
    }
}
