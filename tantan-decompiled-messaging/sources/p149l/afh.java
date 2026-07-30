package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedMomentDetailToolBarView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class afh {
    /* JADX INFO: renamed from: a */
    public static void m96222a(FeedMomentDetailToolBarView feedMomentDetailToolBarView, View view) {
        feedMomentDetailToolBarView.f40882a = (FeedMomentDetailToolBarView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentDetailToolBarView.f40883b = (VText) viewGroup.getChildAt(0);
        feedMomentDetailToolBarView.f40884c = (VLinear) viewGroup.getChildAt(1);
        feedMomentDetailToolBarView.f40885d = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedMomentDetailToolBarView.f40886e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedMomentDetailToolBarView.f40887f = (TextView) viewGroup.getChildAt(2);
        feedMomentDetailToolBarView.f40888g = (VImage) viewGroup.getChildAt(3);
    }
}
