package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p051p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qng {
    /* JADX INFO: renamed from: a */
    public static void m177213a(FeedAlbumPersionTitleView feedAlbumPersionTitleView, View view) {
        feedAlbumPersionTitleView.f42516d = (FeedAlbumPersionTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumPersionTitleView.f42517e = (ConstraintLayout) viewGroup.getChildAt(0);
        feedAlbumPersionTitleView.f42518f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAlbumPersionTitleView.f42519g = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAlbumPersionTitleView.f42520h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f42521i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f42522j = (FeedUserSexAndAgeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        feedAlbumPersionTitleView.f42523k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        feedAlbumPersionTitleView.f42524l = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        feedAlbumPersionTitleView.f42525m = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f42526n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedAlbumPersionTitleView.f42527o = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedAlbumPersionTitleView.f42528p = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedAlbumPersionTitleView.f42529q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f42530r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        feedAlbumPersionTitleView.f42531s = (FeedWriterLevelInProfileView) viewGroup.getChildAt(1);
    }
}
