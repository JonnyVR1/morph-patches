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
public class xic0 implements InterfaceC0148b {

    /* JADX INFO: renamed from: a */
    public vi90 f22304a;

    /* JADX INFO: renamed from: b */
    public uic0 f22305b;

    /* JADX INFO: renamed from: c */
    public hh90 f22306c;

    public xic0(vi90 vi90Var) {
        this.f22304a = vi90Var;
        this.f22305b = new uic0(vi90Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m25981g(ProfileButton profileButton, View view) {
        this.f22305b.mo11038a(profileButton);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return vi90Var.m24001x() && !vi90Var.m23972T();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        Conversation conversationM23980b = this.f22304a.m23980b();
        LayoutDesc.ComboType comboType = (!NullChecker.a(conversationM23980b) || TEnum.equals(conversationM23980b.status, "dismissed")) ? LayoutDesc.ComboType.Recovery_Single : LayoutDesc.ComboType.None;
        if (NullChecker.a(this.f22306c)) {
            this.f22306c.m14371l(comboType.getLayoutDesc());
        }
        return comboType;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        return LayoutDesc.ComboType.None;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        this.f22306c = hh90Var;
        final ProfileButton profileButtonMo12175e = hh90Var.mo12175e(ProfileButton.ProfileButtonType.Recovery);
        xdl0.E0(profileButtonMo12175e.m2926a(), new View.OnClickListener() { // from class: l.wic0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21789a.m25981g(profileButtonMo12175e, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: e */
    public hh90 mo2933e(Context context, LayoutDesc layoutDesc) {
        return upa.z() ? new zif(context, layoutDesc) : new vic0(context, layoutDesc);
    }
}
