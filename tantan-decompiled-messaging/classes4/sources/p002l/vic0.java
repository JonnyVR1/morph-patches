package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import l.f6c0;
import l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vic0 extends hh90 {

    /* JADX INFO: renamed from: e */
    public TextView f21168e;

    public vic0(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType) {
        if (profileButtonType == ProfileButton.ProfileButtonType.Recovery) {
            return new ProfileButton(profileButtonType, this.f12033b.m2923a()).m2927b(this.f21168e);
        }
        return null;
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: g */
    public View mo12176g() {
        return LayoutInflater.from(this.f12034c).inflate(f6c0.q9, (ViewGroup) null);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        super.mo12177h(view);
        this.f21168e = (TextView) view.findViewById(u4c0.nb);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: j */
    public void mo12178j(LayoutDesc layoutDesc) {
    }
}
