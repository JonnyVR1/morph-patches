package p153l;

import android.content.Context;
import android.view.View;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class im5 implements InterfaceC8886b {

    /* JADX INFO: renamed from: a */
    public zq90 f115652a;

    /* JADX INFO: renamed from: b */
    public o4h0 f115653b;

    /* JADX INFO: renamed from: c */
    public cq50 f115654c;

    /* JADX INFO: renamed from: d */
    public xer f115655d;

    /* JADX INFO: renamed from: e */
    public h5e f115656e;

    /* JADX INFO: renamed from: f */
    public pu4 f115657f;

    /* JADX INFO: renamed from: g */
    public lp90 f115658g;

    /* JADX INFO: renamed from: h */
    public boolean f115659h = false;

    public im5(zq90 zq90Var) {
        this.f115652a = zq90Var;
        this.f115653b = new o4h0(zq90Var);
        this.f115654c = new cq50(zq90Var);
        this.f115655d = new xer(zq90Var);
        this.f115656e = new h5e(zq90Var);
        this.f115657f = new pu4(zq90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m140734l(ProfileButton profileButton, View view) {
        this.f115653b.mo106121a(profileButton);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        if (this.f115652a.m220972Y()) {
            return LayoutDesc.ComboType.None;
        }
        Conversation conversationM220975b = this.f115652a.m220975b();
        LayoutDesc.ComboType comboTypeM140741s = m140741s(conversationM220975b);
        if (comboTypeM140741s == null) {
            if (NullChecker.m82486a(conversationM220975b) && !TEnum.equals(conversationM220975b.status, "dismissed") && !conversationM220975b.lowPayOneSideConv()) {
                comboTypeM140741s = LayoutDesc.ComboType.Chat_Single;
            } else if (this.f115652a.m220991s()) {
                comboTypeM140741s = LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            } else {
                comboTypeM140741s = (this.f115652a.m220990r() || this.f115652a.m220988p()) ? LayoutDesc.ComboType.SuperLike_Match : LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
            }
        }
        if (NullChecker.m82486a(this.f115658g)) {
            this.f115658g.m155170l(comboTypeM140741s.getLayoutDesc());
        }
        return comboTypeM140741s;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        this.f115658g = lp90Var;
        ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
        final ProfileButton profileButtonMo155167f = lp90Var.mo155167f(profileButtonType, LayoutDesc.ComboType.SuperLike_Match);
        bnl0.m105509E0(profileButtonMo155167f.m53575a(), new View.OnClickListener() { // from class: l.cm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82511a.m140734l(profileButtonMo155167f, view);
            }
        });
        final ProfileButton profileButtonMo155167f2 = lp90Var.mo155167f(profileButtonType, LayoutDesc.ComboType.Like_SuperLike_Match);
        bnl0.m105509E0(profileButtonMo155167f2.m53575a(), new View.OnClickListener() { // from class: l.dm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89604a.m140735m(profileButtonMo155167f2, view);
            }
        });
        final ProfileButton profileButtonMo112044e = lp90Var.mo112044e(ProfileButton.ProfileButtonType.OneKeyMatch);
        bnl0.m105509E0(profileButtonMo112044e.m53575a(), new View.OnClickListener() { // from class: l.em5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94618a.m140736n(profileButtonMo112044e, view);
            }
        });
        final ProfileButton profileButtonMo112044e2 = lp90Var.mo112044e(ProfileButton.ProfileButtonType.Dislike);
        bnl0.m105509E0(profileButtonMo112044e2.m53575a(), new View.OnClickListener() { // from class: l.fm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99728a.m140737o(profileButtonMo112044e2, view);
            }
        });
        final ProfileButton profileButtonMo112044e3 = lp90Var.mo112044e(ProfileButton.ProfileButtonType.Like);
        bnl0.m105509E0(profileButtonMo112044e3.m53575a(), new View.OnClickListener() { // from class: l.gm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104924a.m140738p(profileButtonMo112044e3, view);
            }
        });
        final ProfileButton profileButtonMo112044e4 = lp90Var.mo112044e(ProfileButton.ProfileButtonType.Chat);
        bnl0.m105509E0(profileButtonMo112044e4.m53575a(), new View.OnClickListener() { // from class: l.hm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110598a.m140739q(profileButtonMo112044e4, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: e */
    public lp90 mo53582e(Context context, LayoutDesc layoutDesc) {
        return new tu40(context, layoutDesc);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m140735m(ProfileButton profileButton, View view) {
        this.f115653b.mo106121a(profileButton);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m140736n(ProfileButton profileButton, View view) {
        this.f115654c.mo106121a(profileButton);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m140737o(ProfileButton profileButton, View view) {
        this.f115656e.mo106121a(profileButton);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m140738p(ProfileButton profileButton, View view) {
        this.f115655d.mo106121a(profileButton);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m140739q(ProfileButton profileButton, View view) {
        this.f115657f.mo106121a(profileButton);
    }

    /* JADX INFO: renamed from: r */
    public void m140740r(LayoutDesc layoutDesc) {
        if (layoutDesc.m53573b(ProfileButton.ProfileButtonType.OneKeyMatch)) {
            this.f115654c.mo111881d();
        }
    }

    /* JADX INFO: renamed from: s */
    public final LayoutDesc.ComboType m140741s(Conversation conversation) {
        if (conversation == null || !br5.m106044o(conversation, this.f115652a.f205576a)) {
            return null;
        }
        if (br5.m106033d(conversation)) {
            return br5.m106039j(conversation) ? LayoutDesc.ComboType.Match : LayoutDesc.ComboType.SuperLike_Match;
        }
        return LayoutDesc.ComboType.Dislike_Like_SuperLike_Match;
    }
}
