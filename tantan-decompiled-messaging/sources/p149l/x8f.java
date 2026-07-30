package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;

/* JADX INFO: loaded from: classes4.dex */
public class x8f extends hh90 {

    /* JADX INFO: renamed from: e */
    public TextView f191506e;

    public x8f(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType) {
        if (profileButtonType == ProfileButton.ProfileButtonType.CityGreet) {
            return new ProfileButton(profileButtonType, this.f107690b.m52389a()).m52393b(this.f191506e);
        }
        return null;
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: g */
    public View mo114663g() {
        return LayoutInflater.from(this.f107691c).inflate(f6c0.f95340E9, (ViewGroup) null);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        this.f191506e = (TextView) view.findViewById(u4c0.f174441r1);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: j */
    public void mo114665j(LayoutDesc layoutDesc) {
    }
}
