package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class tch {
    /* JADX INFO: renamed from: a */
    public static void m187986a(FeedMakeupSeekbarPageView feedMakeupSeekbarPageView, View view) {
        feedMakeupSeekbarPageView.f39623a = (FeedMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupSeekbarPageView.f39624b = (ConstraintLayout) viewGroup.getChildAt(0);
        feedMakeupSeekbarPageView.f39625c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupSeekbarPageView.f39626d = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupSeekbarPageView.f39627e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupSeekbarPageView.f39628f = (ConstraintLayout) viewGroup.getChildAt(1);
        feedMakeupSeekbarPageView.f39629g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMakeupSeekbarPageView.f39630h = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMakeupSeekbarPageView.f39631i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
