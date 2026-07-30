package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedBeautyMakeupPageView;

/* JADX INFO: loaded from: classes12.dex */
public class spg {
    /* JADX INFO: renamed from: a */
    public static void m185366a(FeedBeautyMakeupPageView feedBeautyMakeupPageView, View view) {
        feedBeautyMakeupPageView.f39582a = (FeedBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBeautyMakeupPageView.f39583b = (RecyclerView) viewGroup.getChildAt(0);
        feedBeautyMakeupPageView.f39584c = (LinearLayout) viewGroup.getChildAt(1);
        feedBeautyMakeupPageView.f39585d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedBeautyMakeupPageView.f39586e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedBeautyMakeupPageView.f39587f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
