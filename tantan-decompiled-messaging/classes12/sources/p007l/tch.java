package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupSeekbarPageView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tch {
    /* JADX INFO: renamed from: a */
    public static void m14481a(FeedMakeupSeekbarPageView feedMakeupSeekbarPageView, View view) {
        feedMakeupSeekbarPageView.f1084a = (FeedMakeupSeekbarPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupSeekbarPageView.f1085b = viewGroup.getChildAt(0);
        feedMakeupSeekbarPageView.f1086c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupSeekbarPageView.f1087d = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupSeekbarPageView.f1088e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupSeekbarPageView.f1089f = viewGroup.getChildAt(1);
        feedMakeupSeekbarPageView.f1090g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMakeupSeekbarPageView.f1091h = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMakeupSeekbarPageView.f1092i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
