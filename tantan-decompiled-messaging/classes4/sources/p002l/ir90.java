package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.e30;
import l.jr90;
import l.lfn;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VLinear;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ir90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f13370A;

    /* JADX INFO: renamed from: B */
    public VText f13371B;

    /* JADX INFO: renamed from: C */
    public VText f13372C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f13373u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f13374v;

    /* JADX INFO: renamed from: w */
    public VText f13375w;

    /* JADX INFO: renamed from: x */
    public VLinear f13376x;

    /* JADX INFO: renamed from: y */
    public VText f13377y;

    /* JADX INFO: renamed from: z */
    public VImage f13378z;

    public ir90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: T */
    public View m15316T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jr90.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m15317U(User user) {
        List list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f13376x;
        boolean z = true;
        if (!vwb.J(list) && (list.size() != 1 || !TextUtils.isEmpty((CharSequence) list.get(0)))) {
            z = false;
        }
        xdl0.M(vLinear, z);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m15318V(View view) {
        o6j0.c("e_intl_add_mine_relation_goals_button", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        mo3351O().startActivity(EditIntlFriendPurposeAct.m1929d2(mo3351O().act(), "", true));
    }

    /* JADX INFO: renamed from: W */
    public void m15319W(User user) {
        lfn.a aVarA;
        List list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!vwb.J(list) && (aVarA = lfn.INSTANCE.a((String) list.get(0))) != null) {
            this.f13372C.setText(aVarA.d());
        }
        mo3351O().act().duringCreated(CoreModule.c.e0.o9().distinctUntilChanged()).subscribe(mkd0.G(new e30() { // from class: l.gr90
            public final void call(Object obj) {
                this.f11599a.m15317U((User) obj);
            }
        }));
        xdl0.E0(this.f13376x, new View.OnClickListener() { // from class: l.hr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12239a.m15318V(view);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        if (mo3351O().mo1570m0()) {
            return false;
        }
        return !vwb.J(mo3351O().mo1517K2().profile.extensions.basic.intlFriendPurposeV2);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m15316T(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        m15319W(mo3351O().mo1517K2());
    }
}
