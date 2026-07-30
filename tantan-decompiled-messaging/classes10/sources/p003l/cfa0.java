package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.loop.input.ProfileLoopCreateTagAct;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cfa0 {
    /* JADX INFO: renamed from: a */
    public static void m5942a(ProfileLoopCreateTagAct profileLoopCreateTagAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        profileLoopCreateTagAct.c = viewGroup.getChildAt(0);
        profileLoopCreateTagAct.d = viewGroup.getChildAt(1);
        profileLoopCreateTagAct.e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5943b(ProfileLoopCreateTagAct profileLoopCreateTagAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.t, viewGroup, false);
        m5942a(profileLoopCreateTagAct, viewInflate);
        return viewInflate;
    }
}
