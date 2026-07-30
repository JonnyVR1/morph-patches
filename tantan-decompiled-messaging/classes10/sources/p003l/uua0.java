package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.popup.ProfileThinPopup;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class uua0 {
    /* JADX INFO: renamed from: a */
    public static void m9786a(ProfileThinPopup profileThinPopup, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileThinPopup.c = (LinearLayout) viewGroup.getChildAt(0);
        profileThinPopup.d = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        profileThinPopup.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        profileThinPopup.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        profileThinPopup.h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        profileThinPopup.i = viewGroup.getChildAt(1);
        profileThinPopup.j = viewGroup.getChildAt(2);
        profileThinPopup.k = viewGroup.getChildAt(3);
        profileThinPopup.l = viewGroup.getChildAt(4);
        profileThinPopup.m = viewGroup.getChildAt(5);
        profileThinPopup.n = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m9787b(ProfileThinPopup profileThinPopup, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.wd, viewGroup, false);
        m9786a(profileThinPopup, viewInflate);
        return viewInflate;
    }
}
