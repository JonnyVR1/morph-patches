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
public class lgl0 implements InterfaceC8886b {

    /* JADX INFO: renamed from: a */
    public zq90 f131977a;

    /* JADX INFO: renamed from: b */
    public lp90 f131978b;

    /* JADX INFO: renamed from: c */
    public o4h0 f131979c;

    /* JADX INFO: renamed from: d */
    public rbl0 f131980d;

    /* JADX INFO: renamed from: e */
    public pu4 f131981e;

    /* JADX INFO: renamed from: f */
    public boolean f131982f;

    public lgl0(zq90 zq90Var) {
        this.f131977a = zq90Var;
        this.f131979c = new o4h0(zq90Var);
        this.f131980d = new rbl0(zq90Var);
        this.f131981e = new pu4(zq90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m154079i(ProfileButton profileButton, View view) {
        this.f131979c.mo106121a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m154080j(ProfileButton profileButton, View view) {
        this.f131980d.mo106121a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m154081k(ProfileButton profileButton, View view) {
        this.f131981e.mo106121a(profileButton);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220955H();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        LayoutDesc.ComboType comboType;
        Conversation conversationM220975b = this.f131977a.m220975b();
        if (!NullChecker.m82486a(conversationM220975b) || TEnum.equals(conversationM220975b.status, "dismissed")) {
            comboType = !this.f131977a.m220966S() ? LayoutDesc.ComboType.SuperLike_VideoChat : LayoutDesc.ComboType.VideoChat;
        } else {
            comboType = LayoutDesc.ComboType.Chat_VideoChat;
        }
        if (NullChecker.m82486a(this.f131978b)) {
            this.f131978b.m155170l(comboType.getLayoutDesc());
            if (i == 0 && !this.f131982f) {
                this.f131980d.mo111881d();
                this.f131982f = true;
            }
        }
        return comboType;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        return LayoutDesc.ComboType.VideoChat;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        this.f131978b = lp90Var;
        final ProfileButton profileButtonMo112044e = lp90Var.mo112044e(ProfileButton.ProfileButtonType.SuperLike);
        bnl0.m105509E0(profileButtonMo112044e.m53575a(), new View.OnClickListener() { // from class: l.igl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114799a.m154079i(profileButtonMo112044e, view);
            }
        });
        final ProfileButton profileButtonMo112044e2 = lp90Var.mo112044e(ProfileButton.ProfileButtonType.VideoChat);
        bnl0.m105509E0(profileButtonMo112044e2.m53575a(), new View.OnClickListener() { // from class: l.jgl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120744a.m154080j(profileButtonMo112044e2, view);
            }
        });
        final ProfileButton profileButtonMo112044e3 = lp90Var.mo112044e(ProfileButton.ProfileButtonType.Chat);
        bnl0.m105509E0(profileButtonMo112044e3.m53575a(), new View.OnClickListener() { // from class: l.kgl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f126627a.m154081k(profileButtonMo112044e3, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: e */
    public lp90 mo53582e(Context context, LayoutDesc layoutDesc) {
        return gra.m131778z() ? new pkf(context, layoutDesc) : new sbl0(context, layoutDesc);
    }
}
