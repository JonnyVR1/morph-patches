package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;
import com.p046p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class nji {
    /* JADX INFO: renamed from: a */
    public static void m159742a(FilterMenuView filterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        filterMenuView.f39675a = viewGroup.getChildAt(0);
        filterMenuView.f39676b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        filterMenuView.f39677c = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        filterMenuView.f39678d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        filterMenuView.f39679e = (RecyclerView) viewGroup.getChildAt(3);
    }
}
