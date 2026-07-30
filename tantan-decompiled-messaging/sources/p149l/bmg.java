package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.newui.FeedAlbumPersionTitleView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.FeedWriterLevelInProfileView;
import com.p046p1.mobile.putong.feed.newui.view.FeedUserSexAndAgeView;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bmg {
    /* JADX INFO: renamed from: a */
    public static void m102654a(FeedAlbumPersionTitleView feedAlbumPersionTitleView, View view) {
        feedAlbumPersionTitleView.f41668d = (FeedAlbumPersionTitleView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedAlbumPersionTitleView.f41669e = (ConstraintLayout) viewGroup.getChildAt(0);
        feedAlbumPersionTitleView.f41670f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedAlbumPersionTitleView.f41671g = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedAlbumPersionTitleView.f41672h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f41673i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedAlbumPersionTitleView.f41674j = (FeedUserSexAndAgeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        feedAlbumPersionTitleView.f41675k = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
        feedAlbumPersionTitleView.f41676l = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4);
        feedAlbumPersionTitleView.f41677m = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f41678n = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedAlbumPersionTitleView.f41679o = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        feedAlbumPersionTitleView.f41680p = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        feedAlbumPersionTitleView.f41681q = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(0);
        feedAlbumPersionTitleView.f41682r = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4)).getChildAt(1);
        feedAlbumPersionTitleView.f41683s = (FeedWriterLevelInProfileView) viewGroup.getChildAt(1);
    }
}
