package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class h55 implements InterfaceC8886b {

    /* JADX INFO: renamed from: a */
    public zq90 f107896a;

    /* JADX INFO: renamed from: b */
    public e55 f107897b;

    /* JADX INFO: renamed from: c */
    public TextView f107898c;

    public h55(zq90 zq90Var) {
        this.f107896a = zq90Var;
        this.f107897b = new e55(zq90Var);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: a */
    public boolean mo53578a(zq90 zq90Var) {
        return (s75.m184965m() || wj90.m206622e(zq90Var.f205576a)) && TextUtils.equals("from_city_center_conv_banner", zq90Var.f205577b) && !TextUtils.equals(this.f107896a.f205579d, CoreModule.m30929H().userId());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo53579b(int i) {
        if (i == 1) {
            boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20420r0.f20780s0.m222761e(), this.f107896a.f205579d);
            TextView textView = this.f107898c;
            if (zEquals) {
                textView.setText("招呼已发送");
                this.f107898c.setEnabled(false);
            } else {
                textView.setText("发送招呼");
                this.f107898c.setEnabled(true);
            }
        }
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo53580c() {
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: d */
    public void mo53581d(lp90 lp90Var) {
        final ProfileButton profileButtonMo112044e = lp90Var.mo112044e(ProfileButton.ProfileButtonType.CityGreet);
        this.f107898c = (TextView) profileButtonMo112044e.m53575a();
        bnl0.m105509E0(profileButtonMo112044e.m53575a(), new View.OnClickListener() { // from class: l.g55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102281a.m133625g(profileButtonMo112044e, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b
    /* JADX INFO: renamed from: e */
    public lp90 mo53582e(Context context, LayoutDesc layoutDesc) {
        return gra.m131778z() ? new daf(context, layoutDesc) : new f55(context, layoutDesc);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m133625g(ProfileButton profileButton, View view) {
        this.f107897b.mo106121a(profileButton);
    }
}
