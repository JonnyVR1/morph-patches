package p149l;

import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import p147v.VFrame_Shadow;

/* JADX INFO: loaded from: classes4.dex */
public class f5l extends fl5 {

    /* JADX INFO: renamed from: l.f5l$a */
    public class C16761a implements VFrame_Shadow.InterfaceC22542a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ProfileButton f95186a;

        public C16761a(ProfileButton profileButton) {
            this.f95186a = profileButton;
        }

        @Override // p147v.VFrame_Shadow.InterfaceC22542a
        /* JADX INFO: renamed from: a */
        public void mo52381a() {
            f5l.this.f98120b.mo106858b(this.f95186a);
        }

        @Override // p147v.VFrame_Shadow.InterfaceC22542a
        /* JADX INFO: renamed from: b */
        public void mo52382b() {
            f5l.this.f98120b.mo106859c(this.f95186a);
        }
    }

    public f5l(vi90 vi90Var) {
        super(vi90Var);
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198539o() || vi90Var.m198505F();
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }

    @Override // p149l.fl5, com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        ProfileButton profileButtonMo114662e = hh90Var.mo114662e(ProfileButton.ProfileButtonType.SuperLike);
        if (profileButtonMo114662e.m52392a() instanceof VFrame_Shadow) {
            ((VFrame_Shadow) profileButtonMo114662e.m52392a()).setOnLongPressListener(new C16761a(profileButtonMo114662e));
        }
        super.mo52398d(hh90Var);
    }
}
