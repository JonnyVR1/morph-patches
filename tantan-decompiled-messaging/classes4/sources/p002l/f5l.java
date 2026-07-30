package p002l;

import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import v.VFrame_Shadow;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class f5l extends fl5 {

    /* JADX INFO: renamed from: l.f5l$a */
    public class C0556a implements VFrame_Shadow.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProfileButton f10128a;

        public C0556a(ProfileButton profileButton) {
            this.f10128a = profileButton;
        }

        /* JADX INFO: renamed from: a */
        public void m12948a() {
            f5l.this.f10449b.mo11039b(this.f10128a);
        }

        /* JADX INFO: renamed from: b */
        public void m12949b() {
            f5l.this.f10449b.mo11040c(this.f10128a);
        }
    }

    public f5l(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23992o() || vi90Var.m23958F();
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p002l.fl5, com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        ProfileButton profileButtonMo12175e = hh90Var.mo12175e(ProfileButton.ProfileButtonType.SuperLike);
        if (profileButtonMo12175e.m2926a() instanceof VFrame_Shadow) {
            profileButtonMo12175e.m2926a().setOnLongPressListener(new C0556a(profileButtonMo12175e));
        }
        super.mo2932d(hh90Var);
    }
}
