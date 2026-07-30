package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class kmg {
    /* JADX INFO: renamed from: a */
    public static void m146531a(FeedAllGroupItemView feedAllGroupItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedAllGroupItemView.f39979d = (VDraweeView) viewGroup.getChildAt(0);
        feedAllGroupItemView.f39980e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedAllGroupItemView.f39981f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedAllGroupItemView.f39982g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedAllGroupItemView.f39983h = (VImage) viewGroup.getChildAt(2);
        feedAllGroupItemView.f39984i = (VFrame) viewGroup.getChildAt(3);
        feedAllGroupItemView.f39985j = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        feedAllGroupItemView.f39986k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        feedAllGroupItemView.f39987l = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        feedAllGroupItemView.f39988m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        feedAllGroupItemView.f39989n = (VFrame) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        feedAllGroupItemView.f39990o = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        feedAllGroupItemView.f39991p = (TextView) viewGroup.getChildAt(4);
    }
}
