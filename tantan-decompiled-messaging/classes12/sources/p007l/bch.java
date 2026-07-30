package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedMakeupItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bch {
    /* JADX INFO: renamed from: a */
    public static void m8798a(FeedMakeupItemView feedMakeupItemView, View view) {
        feedMakeupItemView.f1061a = (FeedMakeupItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMakeupItemView.f1062b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMakeupItemView.f1063c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMakeupItemView.f1064d = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedMakeupItemView.f1065e = viewGroup.getChildAt(1);
        feedMakeupItemView.f1066f = (TextView) viewGroup.getChildAt(2);
    }
}
