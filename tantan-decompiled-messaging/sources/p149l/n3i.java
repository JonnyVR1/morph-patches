package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.improve.FeedStatusPostGuidePopView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class n3i {
    /* JADX INFO: renamed from: a */
    public static void m157758a(FeedStatusPostGuidePopView feedStatusPostGuidePopView, View view) {
        feedStatusPostGuidePopView.f42941d = (FeedStatusPostGuidePopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusPostGuidePopView.f42942e = (ConstraintLayout) viewGroup.getChildAt(0);
        feedStatusPostGuidePopView.f42943f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusPostGuidePopView.f42944g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusPostGuidePopView.f42945h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedStatusPostGuidePopView.f42946i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedStatusPostGuidePopView.f42947j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedStatusPostGuidePopView.f42948k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedStatusPostGuidePopView.f42949l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        feedStatusPostGuidePopView.f42950m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        feedStatusPostGuidePopView.f42951n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedStatusPostGuidePopView.f42952o = (VFrame) viewGroup.getChildAt(1);
        feedStatusPostGuidePopView.f42953p = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusPostGuidePopView.f42954q = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
