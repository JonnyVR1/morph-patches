package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mf90 {
    /* JADX INFO: renamed from: a */
    public static void m8150a(ProfileAct profileAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileAct.c = viewGroup.getChildAt(0);
        profileAct.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8151b(ProfileAct profileAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Qd, viewGroup, false);
        m8150a(profileAct, viewInflate);
        return viewInflate;
    }
}
