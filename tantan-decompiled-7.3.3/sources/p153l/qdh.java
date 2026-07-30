package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedMakeupItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qdh {
    /* JADX INFO: renamed from: a */
    public static void m176164a(FeedMakeupItemView feedMakeupItemView, View view) {
        feedMakeupItemView.f40448a = (FeedMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupItemView.f40449b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupItemView.f40450c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupItemView.f40451d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupItemView.f40452e = (VText) viewGroup.getChildAt(1);
        feedMakeupItemView.f40453f = (TextView) viewGroup.getChildAt(2);
    }
}
