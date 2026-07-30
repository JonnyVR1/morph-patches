package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fm5 {
    /* JADX INFO: renamed from: a */
    public static void m122164a(CommonTaskItemView commonTaskItemView, View view) {
        commonTaskItemView.f26663a = (CommonTaskItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commonTaskItemView.f26664b = (LinearLayout) viewGroup.getChildAt(0);
        commonTaskItemView.f26665c = (VText_Medium) viewGroup.getChildAt(1);
        commonTaskItemView.f26666d = (VText) viewGroup.getChildAt(2);
        commonTaskItemView.f26667e = (LinearLayout) viewGroup.getChildAt(3);
        commonTaskItemView.f26668f = (FrameLayout) viewGroup.getChildAt(4);
        commonTaskItemView.f26669g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
