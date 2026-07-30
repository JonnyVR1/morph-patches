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
public class xic0 implements InterfaceC8723b {

    /* JADX INFO: renamed from: a */
    public vi90 f193097a;

    /* JADX INFO: renamed from: b */
    public uic0 f193098b;

    /* JADX INFO: renamed from: c */
    public hh90 f193099c;

    public xic0(vi90 vi90Var) {
        this.f193097a = vi90Var;
        this.f193098b = new uic0(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m209634g(ProfileButton profileButton, View view) {
        this.f193098b.mo106857a(profileButton);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198548x() && !vi90Var.m198519T();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        Conversation conversationM198527b = this.f193097a.m198527b();
        LayoutDesc.ComboType comboType = (!NullChecker.m81303a(conversationM198527b) || TEnum.equals(conversationM198527b.status, "dismissed")) ? LayoutDesc.ComboType.Recovery_Single : LayoutDesc.ComboType.None;
        if (NullChecker.m81303a(this.f193099c)) {
            this.f193099c.m130945l(comboType.getLayoutDesc());
        }
        return comboType;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        this.f193099c = hh90Var;
        final ProfileButton profileButtonMo114662e = hh90Var.mo114662e(ProfileButton.ProfileButtonType.Recovery);
        xdl0.m208329E0(profileButtonMo114662e.m52392a(), new View.OnClickListener() { // from class: l.wic0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186519a.m209634g(profileButtonMo114662e, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: e */
    public hh90 mo52399e(Context context, LayoutDesc layoutDesc) {
        return upa.m194847z() ? new zif(context, layoutDesc) : new vic0(context, layoutDesc);
    }
}
