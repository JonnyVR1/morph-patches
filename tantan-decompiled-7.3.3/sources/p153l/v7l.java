package p153l;

import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import p151v.VFrame_Shadow;

/* JADX INFO: loaded from: classes4.dex */
public class v7l extends im5 {

    /* JADX INFO: renamed from: l.v7l$a */
    public class C20785a implements VFrame_Shadow.InterfaceC22657a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProfileButton f182781a;

        public C20785a(ProfileButton profileButton) {
            this.f182781a = profileButton;
        }

        @Override // p151v.VFrame_Shadow.InterfaceC22657a
        /* JADX INFO: renamed from: a */
        public void mo53564a() {
            v7l.this.f115653b.mo131239b(this.f182781a);
        }

        @Override // p151v.VFrame_Shadow.InterfaceC22657a
        /* JADX INFO: renamed from: b */
        public void mo53565b() {
            v7l.this.f115653b.mo131240c(this.f182781a);
        }
    }

    public v7l(zq90 zq90Var) {
        super(zq90Var);
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220987o() || zq90Var.m220953F();
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p153l.im5, com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        ProfileButton profileButtonMo112044e = lp90Var.mo112044e(ProfileButton.ProfileButtonType.SuperLike);
        if (profileButtonMo112044e.m53575a() instanceof VFrame_Shadow) {
            ((VFrame_Shadow) profileButtonMo112044e.m53575a()).setOnLongPressListener(new C20785a(profileButtonMo112044e));
        }
        super.mo53581d(lp90Var);
    }
}
