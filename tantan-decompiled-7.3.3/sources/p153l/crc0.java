package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class crc0 extends lp90 {

    /* JADX INFO: renamed from: e */
    public TextView f83313e;

    public crc0(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        if (profileButtonType == ProfileButton.ProfileButtonType.Recovery) {
            return new ProfileButton(profileButtonType, this.f133028b.m53572a()).m53576b(this.f83313e);
        }
        return null;
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return LayoutInflater.from(this.f133029c).inflate(kec0.f126136x9, (ViewGroup) null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        super.mo112046h(view);
        this.f83313e = (TextView) view.findViewById(adc0.f70508pb);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
    }
}
