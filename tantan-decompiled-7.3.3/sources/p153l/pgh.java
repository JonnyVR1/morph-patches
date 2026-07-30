package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pgh {
    /* JADX INFO: renamed from: a */
    public static void m172232a(FeedMomentDetailToolBarView feedMomentDetailToolBarView, View view) {
        feedMomentDetailToolBarView.f41730a = (FeedMomentDetailToolBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentDetailToolBarView.f41731b = (VText) viewGroup.getChildAt(0);
        feedMomentDetailToolBarView.f41732c = (VLinear) viewGroup.getChildAt(1);
        feedMomentDetailToolBarView.f41733d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMomentDetailToolBarView.f41734e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMomentDetailToolBarView.f41735f = (TextView) viewGroup.getChildAt(2);
        feedMomentDetailToolBarView.f41736g = (VImage) viewGroup.getChildAt(3);
    }
}
