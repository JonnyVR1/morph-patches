package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fm5 {
    /* JADX INFO: renamed from: a */
    public static void m6483a(CommonTaskItemView commonTaskItemView, View view) {
        commonTaskItemView.a = (CommonTaskItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commonTaskItemView.b = (LinearLayout) viewGroup.getChildAt(0);
        commonTaskItemView.c = viewGroup.getChildAt(1);
        commonTaskItemView.d = viewGroup.getChildAt(2);
        commonTaskItemView.e = (LinearLayout) viewGroup.getChildAt(3);
        commonTaskItemView.f = (FrameLayout) viewGroup.getChildAt(4);
        commonTaskItemView.g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
