package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfileView;
import p151v.VFrame_Anim;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class f110 {
    /* JADX INFO: renamed from: a */
    public static void m123543a(MomentsInProfileView momentsInProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileView.f44792c = (VFrame_Anim) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileView.f44793d = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f44794e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f44795f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileView.f44796g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileView.f44797h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileView.f44798i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f44799j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f44800k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
