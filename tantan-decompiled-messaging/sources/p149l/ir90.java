package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ir90 extends ah90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f114594A;

    /* JADX INFO: renamed from: B */
    public VText f114595B;

    /* JADX INFO: renamed from: C */
    public VText f114596C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f114597u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f114598v;

    /* JADX INFO: renamed from: w */
    public VText f114599w;

    /* JADX INFO: renamed from: x */
    public VLinear f114600x;

    /* JADX INFO: renamed from: y */
    public VText f114601y;

    /* JADX INFO: renamed from: z */
    public VImage f114602z;

    public ir90(@NonNull @NotNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: T */
    public View m137828T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jr90.m142925b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m137829U(User user) {
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f114600x;
        boolean z = true;
        if (!vwb.m200296J(list) && (list.size() != 1 || !TextUtils.isEmpty(list.get(0)))) {
            z = false;
        }
        xdl0.m208344M(vLinear, z);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m137830V(View view) {
        o6j0.m162859c("e_intl_add_mine_relation_goals_button", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        mo52800O().startActivity(EditIntlFriendPurposeAct.m51447d2(mo52800O().act(), "", true));
    }

    /* JADX INFO: renamed from: W */
    public void m137831W(User user) {
        lfn.C18216a c18216aM149726a;
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!vwb.m200296J(list) && (c18216aM149726a = lfn.INSTANCE.m149726a(list.get(0))) != null) {
            this.f114596C.setText(c18216aM149726a.getName());
        }
        mo52800O().act().duringCreated(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.gr90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104036a.m137829U((User) obj);
            }
        }));
        xdl0.m208329E0(this.f114600x, new View.OnClickListener() { // from class: l.hr90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109190a.m137830V(view);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        if (mo52800O().mo51119m0()) {
            return false;
        }
        return !vwb.m200296J(mo52800O().mo51069K2().profile.extensions.basic.intlFriendPurposeV2);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m137828T(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        m137831W(mo52800O().mo51069K2());
    }
}
