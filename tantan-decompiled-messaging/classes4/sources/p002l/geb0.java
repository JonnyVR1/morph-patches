package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class geb0 extends fl5 {
    public geb0(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23957E();
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        LayoutDesc.ComboType comboTypeMo2931c = super.mo2931c();
        if (comboTypeMo2931c.getLayoutDesc().m2924b(ProfileButton.ProfileButtonType.Dislike)) {
            zvf0.x("e_push_profile_dislike", "p_push_profile");
        }
        if (comboTypeMo2931c.getLayoutDesc().m2924b(ProfileButton.ProfileButtonType.Like)) {
            zvf0.x("e_push_profile_like", "p_push_profile");
        }
        if (comboTypeMo2931c.getLayoutDesc().m2924b(ProfileButton.ProfileButtonType.SuperLike)) {
            zvf0.x("e_push_profile_superlike", "p_push_profile");
        }
        return comboTypeMo2931c;
    }
}
