package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceItemView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class hwg {
    /* JADX INFO: renamed from: a */
    public static void m137473a(FeedComicFaceItemView feedComicFaceItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedComicFaceItemView.f41046a = (VDraweeView) viewGroup.getChildAt(0);
        feedComicFaceItemView.f41047b = (ImageView) viewGroup.getChildAt(1);
        feedComicFaceItemView.f41048c = viewGroup.getChildAt(2);
        feedComicFaceItemView.f41049d = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m137474b(FeedComicFaceItemView feedComicFaceItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173671h0, viewGroup, false);
        m137473a(feedComicFaceItemView, viewInflate);
        return viewInflate;
    }
}
