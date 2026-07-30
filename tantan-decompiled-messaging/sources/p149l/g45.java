package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class g45 implements InterfaceC8723b {

    /* JADX INFO: renamed from: a */
    public vi90 f100541a;

    /* JADX INFO: renamed from: b */
    public d45 f100542b;

    /* JADX INFO: renamed from: c */
    public TextView f100543c;

    public g45(vi90 vi90Var) {
        this.f100541a = vi90Var;
        this.f100542b = new d45(vi90Var);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: a */
    public boolean mo52395a(vi90 vi90Var) {
        return (r65.m178035m() || sb90.m183209e(vi90Var.f181561a)) && TextUtils.equals("from_city_center_conv_banner", vi90Var.f181562b) && !TextUtils.equals(this.f100541a.f181564d, CoreModule.m29931H().userId());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo52396b(int i) {
        if (i == 1) {
            boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19678r0.f20038s0.m221515e(), this.f100541a.f181564d);
            TextView textView = this.f100543c;
            if (zEquals) {
                textView.setText("招呼已发送");
                this.f100543c.setEnabled(false);
            } else {
                textView.setText("发送招呼");
                this.f100543c.setEnabled(true);
            }
        }
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo52397c() {
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: d */
    public void mo52398d(hh90 hh90Var) {
        final ProfileButton profileButtonMo114662e = hh90Var.mo114662e(ProfileButton.ProfileButtonType.CityGreet);
        this.f100543c = (TextView) profileButtonMo114662e.m52392a();
        xdl0.m208329E0(profileButtonMo114662e.m52392a(), new View.OnClickListener() { // from class: l.f45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94737a.m124357g(profileButtonMo114662e, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b
    /* JADX INFO: renamed from: e */
    public hh90 mo52399e(Context context, LayoutDesc layoutDesc) {
        return upa.m194847z() ? new x8f(context, layoutDesc) : new e45(context, layoutDesc);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m124357g(ProfileButton profileButton, View view) {
        this.f100542b.mo106857a(profileButton);
    }
}
