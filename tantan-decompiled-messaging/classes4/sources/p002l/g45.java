package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p1.mobile.putong.core.CoreModule;
import l.r65;
import l.sb90;
import l.upa;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class g45 implements InterfaceC0148b {

    /* JADX INFO: renamed from: a */
    public vi90 f10766a;

    /* JADX INFO: renamed from: b */
    public d45 f10767b;

    /* JADX INFO: renamed from: c */
    public TextView f10768c;

    public g45(vi90 vi90Var) {
        this.f10766a = vi90Var;
        this.f10767b = new d45(vi90Var);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: a */
    public boolean mo2929a(vi90 vi90Var) {
        return (r65.m() || sb90.e(vi90Var.f21137a)) && TextUtils.equals("from_city_center_conv_banner", vi90Var.f21138b) && !TextUtils.equals(this.f10766a.f21140d, CoreModule.H().userId());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: b */
    public LayoutDesc.ComboType mo2930b(int i) {
        if (i == 1) {
            boolean zEquals = TextUtils.equals((CharSequence) CoreModule.c.r0.s0.e(), this.f10766a.f21140d);
            TextView textView = this.f10768c;
            if (zEquals) {
                textView.setText("招呼已发送");
                this.f10768c.setEnabled(false);
            } else {
                textView.setText("发送招呼");
                this.f10768c.setEnabled(true);
            }
        }
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: c */
    public LayoutDesc.ComboType mo2931c() {
        return LayoutDesc.ComboType.CityC;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: d */
    public void mo2932d(hh90 hh90Var) {
        final ProfileButton profileButtonMo12175e = hh90Var.mo12175e(ProfileButton.ProfileButtonType.CityGreet);
        this.f10768c = (TextView) profileButtonMo12175e.m2926a();
        xdl0.E0(profileButtonMo12175e.m2926a(), new View.OnClickListener() { // from class: l.f45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10116a.m13621g(profileButtonMo12175e, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b
    /* JADX INFO: renamed from: e */
    public hh90 mo2933e(Context context, LayoutDesc layoutDesc) {
        return upa.z() ? new x8f(context, layoutDesc) : new e45(context, layoutDesc);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m13621g(ProfileButton profileButton, View view) {
        this.f10767b.mo11038a(profileButton);
    }
}
