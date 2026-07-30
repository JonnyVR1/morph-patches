package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f170857u;

    /* JADX INFO: renamed from: v */
    public VText f170858v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f170859w;

    /* JADX INFO: renamed from: x */
    public VText f170860x;

    /* JADX INFO: renamed from: y */
    public VImage f170861y;

    public tke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    private void m189476U() {
        o6j0.m162859c("e_intl_add_relation_goals_button", "p_edit_profile_view", new o6j0.C18854a[0]);
        xdl0.m208344M(this.f170861y, false);
        List<String> list = mo52800O().m94569i2().profile.extensions.basic.intlFriendPurposeV2;
        mo52800O().startActivityForResult(EditIntlFriendPurposeAct.m51447d2(mo52800O().act(), !vwb.m200296J(list) ? list.get(0) : "", false), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m189477V(View view) {
        m189476U();
    }

    /* JADX INFO: renamed from: S */
    public View m189478S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uke.m194152b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m189479T() {
        m96407C(mo52800O().act().getResources().getColor(w0c0.f183790N1), this.f170860x);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        m189479T();
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m189478S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        List<String> list = mo52800O().m94569i2().profile.extensions.basic.intlFriendPurposeV2;
        if (vwb.m200296J(list)) {
            this.f170860x.setText("");
            xdl0.m208344M(this.f170861y, lfn.INSTANCE.m149730e());
        } else {
            xdl0.m208344M(this.f170861y, false);
            lfn.C18216a c18216aM149726a = lfn.INSTANCE.m149726a(list.get(0));
            if (NullChecker.m81303a(c18216aM149726a)) {
                this.f170860x.setText(c18216aM149726a.getName());
            }
        }
        this.f170859w.setOnClickListener(new View.OnClickListener() { // from class: l.ske
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164961a.m189477V(view);
            }
        });
    }
}
