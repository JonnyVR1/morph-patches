package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p000p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bmg {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m8945a(FeedAlbumPersionTitleView feedAlbumPersionTitleView, View view) {
        feedAlbumPersionTitleView.f3129d = (FeedAlbumPersionTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumPersionTitleView.f3130e = viewGroup.getChildAt(0);
        feedAlbumPersionTitleView.f3131f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAlbumPersionTitleView.f3132g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAlbumPersionTitleView.f3133h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f3134i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f3135j = (FeedUserSexAndAgeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        feedAlbumPersionTitleView.f3136k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        feedAlbumPersionTitleView.f3137l = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        feedAlbumPersionTitleView.f3138m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f3139n = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedAlbumPersionTitleView.f3140o = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedAlbumPersionTitleView.f3141p = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedAlbumPersionTitleView.f3142q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f3143r = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        feedAlbumPersionTitleView.f3144s = (FeedWriterLevelInProfileView) viewGroup.getChildAt(1);
    }
}
