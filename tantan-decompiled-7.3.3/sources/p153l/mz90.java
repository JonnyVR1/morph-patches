package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class mz90 extends ep90 {

    /* JADX INFO: renamed from: A */
    public LinearLayout f139484A;

    /* JADX INFO: renamed from: B */
    public VText f139485B;

    /* JADX INFO: renamed from: C */
    public VText f139486C;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f139487u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f139488v;

    /* JADX INFO: renamed from: w */
    public VText f139489w;

    /* JADX INFO: renamed from: x */
    public VLinear f139490x;

    /* JADX INFO: renamed from: y */
    public VText f139491y;

    /* JADX INFO: renamed from: z */
    public VImage f139492z;

    public mz90(@NonNull @NotNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: T */
    public View m160897T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return nz90.m165369b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m160898U(User user) {
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        VLinear vLinear = this.f139490x;
        boolean z = true;
        if (!jyb.m147479J(list) && (list.size() != 1 || !TextUtils.isEmpty(list.get(0)))) {
            z = false;
        }
        bnl0.m105524M(vLinear, z);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m160899V(View view) {
        sfj0.m185596c("e_intl_add_mine_relation_goals_button", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        mo53983O().startActivity(EditIntlFriendPurposeAct.m52630e2(mo53983O().act(), "", true));
    }

    /* JADX INFO: renamed from: W */
    public void m160900W(User user) {
        lhn.C18395a c18395aM154230a;
        List<String> list = user.profile.extensions.basic.intlFriendPurposeV2;
        if (!jyb.m147479J(list) && (c18395aM154230a = lhn.INSTANCE.m154230a(list.get(0))) != null) {
            this.f139486C.setText(c18395aM154230a.getName());
        }
        mo53983O().act().duringCreated(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.kz90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129394a.m160898U((User) obj);
            }
        }));
        bnl0.m105509E0(this.f139490x, new View.OnClickListener() { // from class: l.lz90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134165a.m160899V(view);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        if (mo53983O().mo52302m0()) {
            return false;
        }
        return !jyb.m147479J(mo53983O().mo52252K2().profile.extensions.basic.intlFriendPurposeV2);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m160897T(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        m160900W(mo53983O().mo52252K2());
    }
}
