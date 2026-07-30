package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.lfn;
import l.mcr;
import l.o6j0;
import l.uke;
import l.vwb;
import l.w0c0;
import l.xdl0;
import v.VImage;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tke extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f20290u;

    /* JADX INFO: renamed from: v */
    public VText f20291v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f20292w;

    /* JADX INFO: renamed from: x */
    public VText f20293x;

    /* JADX INFO: renamed from: y */
    public VImage f20294y;

    public tke(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    private void m23004U() {
        o6j0.c("e_intl_add_relation_goals_button", "p_edit_profile_view", new o6j0.a[0]);
        xdl0.M(this.f20294y, false);
        List list = mo3351O().m9268i2().profile.extensions.basic.intlFriendPurposeV2;
        mo3351O().startActivityForResult(EditIntlFriendPurposeAct.m1929d2(mo3351O().act(), !vwb.J(list) ? (String) list.get(0) : "", false), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m23005V(View view) {
        m23004U();
    }

    /* JADX INFO: renamed from: S */
    public View m23006S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uke.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m23007T() {
        m9638C(mo3351O().act().getResources().getColor(w0c0.N1), this.f20293x);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        m23007T();
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m23006S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        List list = mo3351O().m9268i2().profile.extensions.basic.intlFriendPurposeV2;
        if (vwb.J(list)) {
            this.f20293x.setText("");
            xdl0.M(this.f20294y, lfn.INSTANCE.e());
        } else {
            xdl0.M(this.f20294y, false);
            lfn.a aVarA = lfn.INSTANCE.a((String) list.get(0));
            if (NullChecker.a(aVarA)) {
                this.f20293x.setText(aVarA.d());
            }
        }
        this.f20292w.setOnClickListener(new View.OnClickListener() { // from class: l.ske
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19072a.m23005V(view);
            }
        });
    }
}
