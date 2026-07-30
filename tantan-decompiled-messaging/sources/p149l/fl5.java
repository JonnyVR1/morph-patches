package p149l;

import android.content.Context;
import android.view.View;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class fl5 implements InterfaceC8723b {

    /* JADX INFO: renamed from: a */
    public vi90 f98119a;

    /* JADX INFO: renamed from: b */
    public gwg0 f98120b;

    /* JADX INFO: renamed from: c */
    public wh50 f98121c;

    /* JADX INFO: renamed from: d */
    public wcr f98122d;

    /* JADX INFO: renamed from: e */
    public t3e f98123e;

    /* JADX INFO: renamed from: f */
    public qt4 f98124f;

    /* JADX INFO: renamed from: g */
    public hh90 f98125g;

    /* JADX INFO: renamed from: h */
    public boolean f98126h = false;

    public fl5(vi90 vi90Var) {
        this.f98119a = vi90Var;
        this.f98120b = new gwg0(vi90Var);
        this.f98121c = new wh50(vi90Var);
        this.f98122d = new wcr(vi90Var);
        this.f98123e = new t3e(vi90Var);
        this.f98124f = new qt4(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m121955l(ProfileButton profileButton, View view) {
        this.f98120b.mo106857a(profileButton);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        if (this.f98119a.m198524Y()) {
            return LayoutDesc.ComboType.None;
        }
        Conversation conversationM198527b = this.f98119a.m198527b();
        LayoutDesc.ComboType comboTypeM121962s = m121962s(conversationM198527b);
        if (comboTypeM121962s == null) {
            if (NullChecker.m81303a(conversationM198527b) && !TEnum.equals(conversationM198527b.status, "dismissed") && !conversationM198527b.lowPayOneSideConv()) {
                comboTypeM121962s = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f98119a.m198543s()) {
                comboTypeM121962s = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            } else {
                comboTypeM121962s = (this.f98119a.m198542r() || this.f98119a.m198540p()) ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            }
        }
        if (NullChecker.m81303a(this.f98125g)) {
            this.f98125g.m130945l(comboTypeM121962s.getLayoutDesc());
        }
        return comboTypeM121962s;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        this.f98125g = hh90Var;
        ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
        final ProfileButton profileButtonMo122155f = hh90Var.mo122155f(profileButtonType, LayoutDesc.ComboType.SuperLike_Match);
        xdl0.m208329E0(profileButtonMo122155f.m52392a(), new View.OnClickListener() { // from class: l.zk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203506a.m121955l(profileButtonMo122155f, view);
            }
        });
        final ProfileButton profileButtonMo122155f2 = hh90Var.mo122155f(profileButtonType, LayoutDesc.ComboType.Like_SuperLike_Match);
        xdl0.m208329E0(profileButtonMo122155f2.m52392a(), new View.OnClickListener() { // from class: l.al5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70406a.m121956m(profileButtonMo122155f2, view);
            }
        });
        final ProfileButton profileButtonMo114662e = hh90Var.mo114662e(ProfileButton.ProfileButtonType.OneKeyMatch);
        xdl0.m208329E0(profileButtonMo114662e.m52392a(), new View.OnClickListener() { // from class: l.bl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76161a.m121957n(profileButtonMo114662e, view);
            }
        });
        final ProfileButton profileButtonMo114662e2 = hh90Var.mo114662e(ProfileButton.ProfileButtonType.Dislike);
        xdl0.m208329E0(profileButtonMo114662e2.m52392a(), new View.OnClickListener() { // from class: l.cl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81367a.m121958o(profileButtonMo114662e2, view);
            }
        });
        final ProfileButton profileButtonMo114662e3 = hh90Var.mo114662e(ProfileButton.ProfileButtonType.Like);
        xdl0.m208329E0(profileButtonMo114662e3.m52392a(), new View.OnClickListener() { // from class: l.dl5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86781a.m121959p(profileButtonMo114662e3, view);
            }
        });
        final ProfileButton profileButtonMo114662e4 = hh90Var.mo114662e(ProfileButton.ProfileButtonType.Chat);
        xdl0.m208329E0(profileButtonMo114662e4.m52392a(), new View.OnClickListener() { // from class: l.el5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92068a.m121960q(profileButtonMo114662e4, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: e */
    public hh90 mo52399e(Context context, LayoutDesc layoutDesc) {
        return new fm40(context, layoutDesc);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m121956m(ProfileButton profileButton, View view) {
        this.f98120b.mo106857a(profileButton);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m121957n(ProfileButton profileButton, View view) {
        this.f98121c.mo106857a(profileButton);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m121958o(ProfileButton profileButton, View view) {
        this.f98123e.mo106857a(profileButton);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m121959p(ProfileButton profileButton, View view) {
        this.f98122d.mo106857a(profileButton);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m121960q(ProfileButton profileButton, View view) {
        this.f98124f.mo106857a(profileButton);
    }

    /* JADX INFO: renamed from: r */
    public void m121961r(LayoutDesc layoutDesc) {
        if (layoutDesc.m52390b(ProfileButton.ProfileButtonType.OneKeyMatch)) {
            this.f98121c.mo106860d();
        }
    }

    /* JADX INFO: renamed from: s */
    public final LayoutDesc.ComboType m121962s(Conversation conversation) {
        if (conversation == null || !xp5.m210475o(conversation, this.f98119a.f181561a)) {
            return null;
        }
        if (xp5.m210464d(conversation)) {
            return xp5.m210470j(conversation) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
        }
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }
}
