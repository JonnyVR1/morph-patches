package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeSVIPBadgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class kb90 {
    /* JADX INFO: renamed from: a */
    public static void m7552a(PrivilegeSVIPBadgeView privilegeSVIPBadgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        privilegeSVIPBadgeView.a = (FrameLayout) viewGroup.getChildAt(0);
        privilegeSVIPBadgeView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        privilegeSVIPBadgeView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        privilegeSVIPBadgeView.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
