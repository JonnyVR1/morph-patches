package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ojq {
    /* JADX INFO: renamed from: a */
    public static void m8460a(JailedDialogLikeAct jailedDialogLikeAct, View view) {
        jailedDialogLikeAct.c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jailedDialogLikeAct.d = (LinearLayout) viewGroup.getChildAt(0);
        jailedDialogLikeAct.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jailedDialogLikeAct.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jailedDialogLikeAct.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jailedDialogLikeAct.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        jailedDialogLikeAct.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8461b(JailedDialogLikeAct jailedDialogLikeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.h, viewGroup, false);
        m8460a(jailedDialogLikeAct, viewInflate);
        return viewInflate;
    }
}
