package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.improve.FeedStatusPostGuidePopView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class c5i {
    /* JADX INFO: renamed from: a */
    public static void m108055a(FeedStatusPostGuidePopView feedStatusPostGuidePopView, View view) {
        feedStatusPostGuidePopView.f43789d = (FeedStatusPostGuidePopView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStatusPostGuidePopView.f43790e = (ConstraintLayout) viewGroup.getChildAt(0);
        feedStatusPostGuidePopView.f43791f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStatusPostGuidePopView.f43792g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStatusPostGuidePopView.f43793h = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedStatusPostGuidePopView.f43794i = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedStatusPostGuidePopView.f43795j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedStatusPostGuidePopView.f43796k = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedStatusPostGuidePopView.f43797l = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(0);
        feedStatusPostGuidePopView.f43798m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1)).getChildAt(1);
        feedStatusPostGuidePopView.f43799n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedStatusPostGuidePopView.f43800o = (VFrame) viewGroup.getChildAt(1);
        feedStatusPostGuidePopView.f43801p = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStatusPostGuidePopView.f43802q = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
