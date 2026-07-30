package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedBeautyMakeupPageView;

/* JADX INFO: loaded from: classes13.dex */
public class hrg {
    /* JADX INFO: renamed from: a */
    public static void m136849a(FeedBeautyMakeupPageView feedBeautyMakeupPageView, View view) {
        feedBeautyMakeupPageView.f40430a = (FeedBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBeautyMakeupPageView.f40431b = (RecyclerView) viewGroup.getChildAt(0);
        feedBeautyMakeupPageView.f40432c = (LinearLayout) viewGroup.getChildAt(1);
        feedBeautyMakeupPageView.f40433d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedBeautyMakeupPageView.f40434e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedBeautyMakeupPageView.f40435f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
