package p153l;

import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class kmb0 extends im5 {
    public kmb0(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220952E();
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        LayoutDesc.ComboType comboTypeMo53580c = super.mo53580c();
        if (comboTypeMo53580c.getLayoutDesc().m53573b(ProfileButton.ProfileButtonType.Dislike)) {
            i4g0.m138526x("e_push_profile_dislike", "p_push_profile");
        }
        if (comboTypeMo53580c.getLayoutDesc().m53573b(ProfileButton.ProfileButtonType.Like)) {
            i4g0.m138526x("e_push_profile_like", "p_push_profile");
        }
        if (comboTypeMo53580c.getLayoutDesc().m53573b(ProfileButton.ProfileButtonType.SuperLike)) {
            i4g0.m138526x("e_push_profile_superlike", "p_push_profile");
        }
        return comboTypeMo53580c;
    }
}
