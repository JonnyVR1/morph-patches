package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.intlfriendpurpose.EditIntlFriendPurposeAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xle extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f194947u;

    /* JADX INFO: renamed from: v */
    public VText f194948v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f194949w;

    /* JADX INFO: renamed from: x */
    public VText f194950x;

    /* JADX INFO: renamed from: y */
    public VImage f194951y;

    public xle(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: U */
    private void m211618U() {
        sfj0.m185596c("e_intl_add_relation_goals_button", "p_edit_profile_view", new sfj0.C20032a[0]);
        bnl0.m105524M(this.f194951y, false);
        List<String> list = mo53983O().m189086i2().profile.extensions.basic.intlFriendPurposeV2;
        mo53983O().startActivityForResult(EditIntlFriendPurposeAct.m52630e2(mo53983O().act(), !jyb.m147479J(list) ? list.get(0) : "", false), 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m211619V(View view) {
        m211618U();
    }

    /* JADX INFO: renamed from: S */
    public View m211620S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yle.m216569b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: T */
    public final void m211621T() {
        m121832C(mo53983O().act().getResources().getColor(c9c0.f80362O1), this.f194950x);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        m211621T();
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m211620S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        List<String> list = mo53983O().m189086i2().profile.extensions.basic.intlFriendPurposeV2;
        if (jyb.m147479J(list)) {
            this.f194950x.setText("");
            bnl0.m105524M(this.f194951y, lhn.INSTANCE.m154234e());
        } else {
            bnl0.m105524M(this.f194951y, false);
            lhn.C18395a c18395aM154230a = lhn.INSTANCE.m154230a(list.get(0));
            if (NullChecker.m82486a(c18395aM154230a)) {
                this.f194950x.setText(c18395aM154230a.getName());
            }
        }
        this.f194949w.setOnClickListener(new View.OnClickListener() { // from class: l.wle
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189685a.m211619V(view);
            }
        });
    }
}
