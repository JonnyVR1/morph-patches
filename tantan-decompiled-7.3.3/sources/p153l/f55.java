package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class f55 extends lp90 {

    /* JADX INFO: renamed from: e */
    public TextView f97191e;

    public f55(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        if (profileButtonType == ProfileButton.ProfileButtonType.CityGreet) {
            return new ProfileButton(profileButtonType, this.f133028b.m53572a()).m53576b(this.f97191e);
        }
        return null;
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return LayoutInflater.from(this.f133029c).inflate(kec0.f125975o1, (ViewGroup) null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        this.f97191e = (TextView) view.findViewById(adc0.f70532r1);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
    }
}
