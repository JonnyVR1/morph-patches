package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FeedTextSeekBar;
import com.p051p1.mobile.putong.feed.newui.camera.widget.FilterMenuView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class jmi {
    /* JADX INFO: renamed from: a */
    public static void m146158a(FilterMenuView filterMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        filterMenuView.f40523a = viewGroup.getChildAt(0);
        filterMenuView.f40524b = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        filterMenuView.f40525c = (FeedTextSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        filterMenuView.f40526d = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        filterMenuView.f40527e = (RecyclerView) viewGroup.getChildAt(3);
    }
}
