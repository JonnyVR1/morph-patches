package p002l;

import android.content.Context;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.xdl0;
import l.xp5;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fl5 implements InterfaceC0148b {

    /* JADX INFO: renamed from: a */
    public vi90 f10448a;

    /* JADX INFO: renamed from: b */
    public gwg0 f10449b;

    /* JADX INFO: renamed from: c */
    public wh50 f10450c;

    /* JADX INFO: renamed from: d */
    public wcr f10451d;

    /* JADX INFO: renamed from: e */
    public t3e f10452e;

    /* JADX INFO: renamed from: f */
    public qt4 f10453f;

    /* JADX INFO: renamed from: g */
    public hh90 f10454g;

    /* JADX INFO: renamed from: h */
    public boolean f10455h = false;

    public fl5(vi90 vi90Var) {
        this.f10448a = vi90Var;
        this.f10449b = new gwg0(vi90Var);
        this.f10450c = new wh50(vi90Var);
        this.f10451d = new wcr(vi90Var);
        this.f10452e = new t3e(vi90Var);
        this.f10453f = new qt4(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m13280l(ProfileButton profileButton, View view) {
        this.f10449b.mo11038a(profileButton);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        if (this.f10448a.m23977Y()) {
            return LayoutDesc.ComboType.None;
        }
        Conversation conversationM23980b = this.f10448a.m23980b();
        LayoutDesc.ComboType comboTypeM13287s = m13287s(conversationM23980b);
        if (comboTypeM13287s == null) {
            if (NullChecker.a(conversationM23980b) && !TEnum.equals(conversationM23980b.status, "dismissed") && !conversationM23980b.lowPayOneSideConv()) {
                comboTypeM13287s = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f10448a.m23996s()) {
                comboTypeM13287s = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            } else {
                comboTypeM13287s = (this.f10448a.m23995r() || this.f10448a.m23993p()) ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            }
        }
        if (NullChecker.a(this.f10454g)) {
            this.f10454g.m14371l(comboTypeM13287s.getLayoutDesc());
        }
        return comboTypeM13287s;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        this.f10454g = hh90Var;
        ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
        final ProfileButton profileButtonMo13304f = hh90Var.mo13304f(profileButtonType, LayoutDesc.ComboType.SuperLike_Match);
        xdl0.E0(profileButtonMo13304f.m2926a(), new View.OnClickListener() { // from class: l.zk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23473a.m13280l(profileButtonMo13304f, view);
            }
        });
        final ProfileButton profileButtonMo13304f2 = hh90Var.mo13304f(profileButtonType, LayoutDesc.ComboType.Like_SuperLike_Match);
        xdl0.E0(profileButtonMo13304f2.m2926a(), new View.OnClickListener() { // from class: l.al5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7712a.m13281m(profileButtonMo13304f2, view);
            }
        });
        final ProfileButton profileButtonMo12175e = hh90Var.mo12175e(ProfileButton.ProfileButtonType.OneKeyMatch);
        xdl0.E0(profileButtonMo12175e.m2926a(), new View.OnClickListener() { // from class: l.bl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8247a.m13282n(profileButtonMo12175e, view);
            }
        });
        final ProfileButton profileButtonMo12175e2 = hh90Var.mo12175e(ProfileButton.ProfileButtonType.Dislike);
        xdl0.E0(profileButtonMo12175e2.m2926a(), new View.OnClickListener() { // from class: l.cl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8730a.m13283o(profileButtonMo12175e2, view);
            }
        });
        final ProfileButton profileButtonMo12175e3 = hh90Var.mo12175e(ProfileButton.ProfileButtonType.Like);
        xdl0.E0(profileButtonMo12175e3.m2926a(), new View.OnClickListener() { // from class: l.dl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9317a.m13284p(profileButtonMo12175e3, view);
            }
        });
        final ProfileButton profileButtonMo12175e4 = hh90Var.mo12175e(ProfileButton.ProfileButtonType.Chat);
        xdl0.E0(profileButtonMo12175e4.m2926a(), new View.OnClickListener() { // from class: l.el5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9846a.m13285q(profileButtonMo12175e4, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: e */
    public hh90 mo2933e(Context context, LayoutDesc layoutDesc) {
        return new fm40(context, layoutDesc);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m13281m(ProfileButton profileButton, View view) {
        this.f10449b.mo11038a(profileButton);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m13282n(ProfileButton profileButton, View view) {
        this.f10450c.mo11038a(profileButton);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m13283o(ProfileButton profileButton, View view) {
        this.f10452e.mo11038a(profileButton);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m13284p(ProfileButton profileButton, View view) {
        this.f10451d.mo11038a(profileButton);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m13285q(ProfileButton profileButton, View view) {
        this.f10453f.mo11038a(profileButton);
    }

    /* JADX INFO: renamed from: r */
    public void m13286r(LayoutDesc layoutDesc) {
        if (layoutDesc.m2924b(ProfileButton.ProfileButtonType.OneKeyMatch)) {
            this.f10450c.mo11041d();
        }
    }

    /* JADX INFO: renamed from: s */
    public final LayoutDesc.ComboType m13287s(Conversation conversation) {
        if (conversation == null || !xp5.o(conversation, this.f10448a.f21137a)) {
            return null;
        }
        if (xp5.d(conversation)) {
            return xp5.j(conversation) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
        }
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }
}
