package p002l;

import android.content.Context;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.upa;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class h7l0 implements InterfaceC0148b {

    /* JADX INFO: renamed from: a */
    public vi90 f11924a;

    /* JADX INFO: renamed from: b */
    public hh90 f11925b;

    /* JADX INFO: renamed from: c */
    public gwg0 f11926c;

    /* JADX INFO: renamed from: d */
    public m2l0 f11927d;

    /* JADX INFO: renamed from: e */
    public qt4 f11928e;

    /* JADX INFO: renamed from: f */
    public boolean f11929f;

    public h7l0(vi90 vi90Var) {
        this.f11924a = vi90Var;
        this.f11926c = new gwg0(vi90Var);
        this.f11927d = new m2l0(vi90Var);
        this.f11928e = new qt4(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m14277i(ProfileButton profileButton, View view) {
        this.f11926c.mo11038a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m14278j(ProfileButton profileButton, View view) {
        this.f11927d.mo11038a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m14279k(ProfileButton profileButton, View view) {
        this.f11928e.mo11038a(profileButton);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m23960H();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        LayoutDesc.ComboType comboType;
        Conversation conversationM23980b = this.f11924a.m23980b();
        if (!NullChecker.a(conversationM23980b) || TEnum.equals(conversationM23980b.status, "dismissed")) {
            comboType = !this.f11924a.m23971S() ? LayoutDesc.ComboType.SuperLike_VideoChat : LayoutDesc.ComboType.VideoChat;
        } else {
            comboType = LayoutDesc.ComboType.Chat_VideoChat;
        }
        if (NullChecker.a(this.f11925b)) {
            this.f11925b.m14371l(comboType.getLayoutDesc());
            if (i == 0 && !this.f11929f) {
                this.f11927d.mo11041d();
                this.f11929f = true;
            }
        }
        return comboType;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        return LayoutDesc.ComboType.VideoChat;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        this.f11925b = hh90Var;
        final ProfileButton profileButtonMo12175e = hh90Var.mo12175e(ProfileButton.ProfileButtonType.SuperLike);
        xdl0.E0(profileButtonMo12175e.m2926a(), new View.OnClickListener() { // from class: l.e7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9618a.m14277i(profileButtonMo12175e, view);
            }
        });
        final ProfileButton profileButtonMo12175e2 = hh90Var.mo12175e(ProfileButton.ProfileButtonType.VideoChat);
        xdl0.E0(profileButtonMo12175e2.m2926a(), new View.OnClickListener() { // from class: l.f7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10180a.m14278j(profileButtonMo12175e2, view);
            }
        });
        final ProfileButton profileButtonMo12175e3 = hh90Var.mo12175e(ProfileButton.ProfileButtonType.Chat);
        xdl0.E0(profileButtonMo12175e3.m2926a(), new View.OnClickListener() { // from class: l.g7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11299a.m14279k(profileButtonMo12175e3, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: e */
    public hh90 mo2933e(Context context, LayoutDesc layoutDesc) {
        return upa.z() ? new jjf(context, layoutDesc) : new n2l0(context, layoutDesc);
    }
}
