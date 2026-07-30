package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedMakeupItemView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bch {
    /* JADX INFO: renamed from: a */
    public static void m101062a(FeedMakeupItemView feedMakeupItemView, View view) {
        feedMakeupItemView.f39600a = (FeedMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupItemView.f39601b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupItemView.f39602c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupItemView.f39603d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupItemView.f39604e = (VText) viewGroup.getChildAt(1);
        feedMakeupItemView.f39605f = (TextView) viewGroup.getChildAt(2);
    }
}
