package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedCircleProgressBar;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFacePropMenuView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qwg {
    /* JADX INFO: renamed from: a */
    public static void m178476a(FeedComicFacePropMenuView feedComicFacePropMenuView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFacePropMenuView.f41053a = (VText) viewGroup.getChildAt(0);
        feedComicFacePropMenuView.f41054b = (FeedCircleProgressBar) viewGroup.getChildAt(1);
        feedComicFacePropMenuView.f41055c = (FeedCircleProgressBar) viewGroup.getChildAt(2);
        feedComicFacePropMenuView.f41056d = (ImageView) viewGroup.getChildAt(3);
        feedComicFacePropMenuView.f41057e = (ImageView) viewGroup.getChildAt(4);
        feedComicFacePropMenuView.f41058f = (ViewPager2) viewGroup.getChildAt(5);
        feedComicFacePropMenuView.f41059g = (RecyclerView) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m178477b(FeedComicFacePropMenuView feedComicFacePropMenuView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173678i0, viewGroup, false);
        m178476a(feedComicFacePropMenuView, viewInflate);
        return viewInflate;
    }
}
