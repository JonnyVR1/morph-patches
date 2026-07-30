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
public class erc0 implements InterfaceC8886b {

    /* JADX INFO: renamed from: a */
    public zq90 f95460a;

    /* JADX INFO: renamed from: b */
    public brc0 f95461b;

    /* JADX INFO: renamed from: c */
    public lp90 f95462c;

    public erc0(zq90 zq90Var) {
        this.f95460a = zq90Var;
        this.f95461b = new brc0(zq90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m122141g(ProfileButton profileButton, View view) {
        this.f95461b.mo106121a(profileButton);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return zq90Var.m220996x() && !zq90Var.m220967T();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        Conversation conversationM220975b = this.f95460a.m220975b();
        LayoutDesc.ComboType comboType = (!NullChecker.m82486a(conversationM220975b) || TEnum.equals(conversationM220975b.status, "dismissed")) ? LayoutDesc.ComboType.Recovery_Single : LayoutDesc.ComboType.None;
        if (NullChecker.m82486a(this.f95462c)) {
            this.f95462c.m155170l(comboType.getLayoutDesc());
        }
        return comboType;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        this.f95462c = lp90Var;
        final ProfileButton profileButtonMo112044e = lp90Var.mo112044e(ProfileButton.ProfileButtonType.Recovery);
        bnl0.m105509E0(profileButtonMo112044e.m53575a(), new View.OnClickListener() { // from class: l.drc0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90369a.m122141g(profileButtonMo112044e, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: e */
    public lp90 mo53582e(Context context, LayoutDesc layoutDesc) {
        return gra.m131778z() ? new fkf(context, layoutDesc) : new crc0(context, layoutDesc);
    }
}
