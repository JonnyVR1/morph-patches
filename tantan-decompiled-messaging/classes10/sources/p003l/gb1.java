package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.AudioMatchPrivilegeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gb1 {
    /* JADX INFO: renamed from: a */
    public static void m6622a(AudioMatchPrivilegeView audioMatchPrivilegeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        audioMatchPrivilegeView.d = viewGroup.getChildAt(0);
        audioMatchPrivilegeView.e = viewGroup.getChildAt(1);
        audioMatchPrivilegeView.f = viewGroup.getChildAt(2);
        audioMatchPrivilegeView.g = (FrameLayout) viewGroup.getChildAt(3);
        audioMatchPrivilegeView.h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        audioMatchPrivilegeView.i = (FrameLayout) viewGroup.getChildAt(4);
        audioMatchPrivilegeView.j = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        audioMatchPrivilegeView.k = viewGroup.getChildAt(5);
        audioMatchPrivilegeView.l = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        audioMatchPrivilegeView.m = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }
}
