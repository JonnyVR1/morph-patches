package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task.CommonTaskItemView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jn5 {
    /* JADX INFO: renamed from: a */
    public static void m146214a(CommonTaskItemView commonTaskItemView, View view) {
        commonTaskItemView.f27511a = (CommonTaskItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        commonTaskItemView.f27512b = (LinearLayout) viewGroup.getChildAt(0);
        commonTaskItemView.f27513c = (VText_Medium) viewGroup.getChildAt(1);
        commonTaskItemView.f27514d = (VText) viewGroup.getChildAt(2);
        commonTaskItemView.f27515e = (LinearLayout) viewGroup.getChildAt(3);
        commonTaskItemView.f27516f = (FrameLayout) viewGroup.getChildAt(4);
        commonTaskItemView.f27517g = (VText_Medium) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }
}
