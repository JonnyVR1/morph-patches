package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ojq {
    /* JADX INFO: renamed from: a */
    public static void m164749a(JailedDialogLikeAct jailedDialogLikeAct, View view) {
        jailedDialogLikeAct.f28243c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jailedDialogLikeAct.f28244d = (LinearLayout) viewGroup.getChildAt(0);
        jailedDialogLikeAct.f28245e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jailedDialogLikeAct.f28246f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jailedDialogLikeAct.f28247g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jailedDialogLikeAct.f28248h = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        jailedDialogLikeAct.f28249i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m164750b(JailedDialogLikeAct jailedDialogLikeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137354h, viewGroup, false);
        m164749a(jailedDialogLikeAct, viewInflate);
        return viewInflate;
    }
}
