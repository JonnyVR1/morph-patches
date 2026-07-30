package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.signin.main.TaskView;
import com.p000p1.mobile.putong.live.livingroom.common.signin.prize.LiveSignInProgressView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class qfi0 {
    /* JADX INFO: renamed from: a */
    public static void m21253a(TaskView taskView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        taskView.f5366a = viewGroup.getChildAt(0);
        taskView.f5367b = viewGroup.getChildAt(1);
        taskView.f5368c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        taskView.f5369d = (HorizontalScrollView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f5370e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        taskView.f5371f = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        taskView.f5372g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        taskView.f5373h = (LiveSignInProgressView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        taskView.f5374i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(2);
        taskView.f5375j = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        taskView.f5376k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        taskView.f5377l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
