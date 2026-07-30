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
public class h7l0 implements InterfaceC8723b {

    /* JADX INFO: renamed from: a */
    public vi90 f106308a;

    /* JADX INFO: renamed from: b */
    public hh90 f106309b;

    /* JADX INFO: renamed from: c */
    public gwg0 f106310c;

    /* JADX INFO: renamed from: d */
    public m2l0 f106311d;

    /* JADX INFO: renamed from: e */
    public qt4 f106312e;

    /* JADX INFO: renamed from: f */
    public boolean f106313f;

    public h7l0(vi90 vi90Var) {
        this.f106308a = vi90Var;
        this.f106310c = new gwg0(vi90Var);
        this.f106311d = new m2l0(vi90Var);
        this.f106312e = new qt4(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m129748i(ProfileButton profileButton, View view) {
        this.f106310c.mo106857a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m129749j(ProfileButton profileButton, View view) {
        this.f106311d.mo106857a(profileButton);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m129750k(ProfileButton profileButton, View view) {
        this.f106312e.mo106857a(profileButton);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return vi90Var.m198507H();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        LayoutDesc.ComboType comboType;
        Conversation conversationM198527b = this.f106308a.m198527b();
        if (!NullChecker.m81303a(conversationM198527b) || TEnum.equals(conversationM198527b.status, "dismissed")) {
            comboType = !this.f106308a.m198518S() ? LayoutDesc.ComboType.SuperLike_VideoChat : LayoutDesc.ComboType.VideoChat;
        } else {
            comboType = LayoutDesc.ComboType.Chat_VideoChat;
        }
        if (NullChecker.m81303a(this.f106309b)) {
            this.f106309b.m130945l(comboType.getLayoutDesc());
            if (i == 0 && !this.f106313f) {
                this.f106311d.mo106860d();
                this.f106313f = true;
            }
        }
        return comboType;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        return LayoutDesc.ComboType.VideoChat;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        this.f106309b = hh90Var;
        final ProfileButton profileButtonMo114662e = hh90Var.mo114662e(ProfileButton.ProfileButtonType.SuperLike);
        xdl0.m208329E0(profileButtonMo114662e.m52392a(), new View.OnClickListener() { // from class: l.e7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89725a.m129748i(profileButtonMo114662e, view);
            }
        });
        final ProfileButton profileButtonMo114662e2 = hh90Var.mo114662e(ProfileButton.ProfileButtonType.VideoChat);
        xdl0.m208329E0(profileButtonMo114662e2.m52392a(), new View.OnClickListener() { // from class: l.f7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96267a.m129749j(profileButtonMo114662e2, view);
            }
        });
        final ProfileButton profileButtonMo114662e3 = hh90Var.mo114662e(ProfileButton.ProfileButtonType.Chat);
        xdl0.m208329E0(profileButtonMo114662e3.m52392a(), new View.OnClickListener() { // from class: l.g7l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101413a.m129750k(profileButtonMo114662e3, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: e */
    public hh90 mo52399e(Context context, LayoutDesc layoutDesc) {
        return upa.m194847z() ? new jjf(context, layoutDesc) : new n2l0(context, layoutDesc);
    }
}
