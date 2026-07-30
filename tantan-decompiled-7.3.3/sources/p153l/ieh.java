package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class ieh {
    /* JADX INFO: renamed from: a */
    public static void m139611a(FeedMakeupSeekbarPageView feedMakeupSeekbarPageView, View view) {
        feedMakeupSeekbarPageView.f40471a = (FeedMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupSeekbarPageView.f40472b = (ConstraintLayout) viewGroup.getChildAt(0);
        feedMakeupSeekbarPageView.f40473c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupSeekbarPageView.f40474d = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupSeekbarPageView.f40475e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupSeekbarPageView.f40476f = (ConstraintLayout) viewGroup.getChildAt(1);
        feedMakeupSeekbarPageView.f40477g = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMakeupSeekbarPageView.f40478h = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMakeupSeekbarPageView.f40479i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
