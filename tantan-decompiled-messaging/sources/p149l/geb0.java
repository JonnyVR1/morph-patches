package p149l;

import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class geb0 extends fl5 {
    public geb0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198504E();
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        LayoutDesc.ComboType comboTypeMo52397c = super.mo52397c();
        if (comboTypeMo52397c.getLayoutDesc().m52390b(ProfileButton.ProfileButtonType.Dislike)) {
            zvf0.m220402x("e_push_profile_dislike", "p_push_profile");
        }
        if (comboTypeMo52397c.getLayoutDesc().m52390b(ProfileButton.ProfileButtonType.Like)) {
            zvf0.m220402x("e_push_profile_like", "p_push_profile");
        }
        if (comboTypeMo52397c.getLayoutDesc().m52390b(ProfileButton.ProfileButtonType.SuperLike)) {
            zvf0.m220402x("e_push_profile_superlike", "p_push_profile");
        }
        return comboTypeMo52397c;
    }
}
