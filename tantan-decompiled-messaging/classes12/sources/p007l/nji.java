package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nji {
    /* JADX INFO: renamed from: a */
    public static void m12198a(FilterMenuView filterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        filterMenuView.f1136a = viewGroup.getChildAt(0);
        filterMenuView.f1137b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        filterMenuView.f1138c = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        filterMenuView.f1139d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        filterMenuView.f1140e = viewGroup.getChildAt(3);
    }
}
