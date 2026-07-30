package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class g9a0 {
    /* JADX INFO: renamed from: a */
    public static void m6618a(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, View view) {
        profileListFragLocalEditImpl.z = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileListFragLocalEditImpl.A = viewGroup.getChildAt(0);
        profileListFragLocalEditImpl.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.C = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.D = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileListFragLocalEditImpl.E = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        profileListFragLocalEditImpl.F = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileListFragLocalEditImpl.G = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0);
        profileListFragLocalEditImpl.H = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1);
        profileListFragLocalEditImpl.I = (FrameLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.J = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.K = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.L = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.M = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileListFragLocalEditImpl.N = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileListFragLocalEditImpl.O = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        profileListFragLocalEditImpl.P = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.Q = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        profileListFragLocalEditImpl.R = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        profileListFragLocalEditImpl.S = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(3);
        profileListFragLocalEditImpl.T = (ViewStub) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(0)).getChildAt(4);
        profileListFragLocalEditImpl.U = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6619b(ProfileListFragLocalEditImpl profileListFragLocalEditImpl, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ba, viewGroup, false);
        m6618a(profileListFragLocalEditImpl, viewInflate);
        return viewInflate;
    }
}
