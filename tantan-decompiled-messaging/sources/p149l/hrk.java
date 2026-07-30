package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.growth.views.GrowthPushPopView;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hrk {
    /* JADX INFO: renamed from: a */
    public static void m132689a(GrowthPushPopView growthPushPopView, View view) {
        growthPushPopView.f29557d = (GrowthPushPopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        growthPushPopView.f29558e = (ConstraintLayout) viewGroup.getChildAt(0);
        growthPushPopView.f29559f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        growthPushPopView.f29560g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        growthPushPopView.f29561h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        growthPushPopView.f29562i = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        growthPushPopView.f29563j = (VFrame) viewGroup.getChildAt(1);
        growthPushPopView.f29564k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        growthPushPopView.f29565l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
