package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.profile.EditAboutMeAct;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pje {
    /* JADX INFO: renamed from: a */
    public static void m8754a(EditAboutMeAct editAboutMeAct, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        editAboutMeAct.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        editAboutMeAct.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        editAboutMeAct.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        editAboutMeAct.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8755b(EditAboutMeAct editAboutMeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.gd, viewGroup, false);
        m8754a(editAboutMeAct, viewInflate);
        return viewInflate;
    }
}
