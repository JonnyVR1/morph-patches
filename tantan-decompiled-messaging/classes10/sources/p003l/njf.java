package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import l.f6c0;
import l.mjf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class njf {
    /* JADX INFO: renamed from: a */
    public static void m8337a(mjf mjfVar, View view) {
        mjfVar.a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mjfVar.b = viewGroup.getChildAt(0);
        mjfVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mjfVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mjfVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        mjfVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8338b(mjf mjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.R2, viewGroup, false);
        m8337a(mjfVar, viewInflate);
        return viewInflate;
    }
}
