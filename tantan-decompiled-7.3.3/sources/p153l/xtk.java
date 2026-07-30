package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.growth.views.GrowthPushPopView;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xtk {
    /* JADX INFO: renamed from: a */
    public static void m213102a(GrowthPushPopView growthPushPopView, View view) {
        growthPushPopView.f30405d = (GrowthPushPopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        growthPushPopView.f30406e = (ConstraintLayout) viewGroup.getChildAt(0);
        growthPushPopView.f30407f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        growthPushPopView.f30408g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        growthPushPopView.f30409h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        growthPushPopView.f30410i = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        growthPushPopView.f30411j = (VFrame) viewGroup.getChildAt(1);
        growthPushPopView.f30412k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        growthPushPopView.f30413l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
