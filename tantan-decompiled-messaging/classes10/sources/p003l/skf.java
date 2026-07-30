package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.profile.expandprofilelike.view.ProfileLikeContentRootLayout;
import l.f6c0;
import l.rkf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class skf {
    /* JADX INFO: renamed from: a */
    public static void m9358a(rkf rkfVar, View view) {
        rkfVar.a = (ProfileLikeContentRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        rkfVar.b = viewGroup.getChildAt(0);
        rkfVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        rkfVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        rkfVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        rkfVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9359b(rkf rkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.V2, viewGroup, false);
        m9358a(rkfVar, viewInflate);
        return viewInflate;
    }
}
