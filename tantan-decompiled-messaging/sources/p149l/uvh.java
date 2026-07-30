package p149l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;

/* JADX INFO: loaded from: classes12.dex */
public interface uvh {
    /* JADX INFO: renamed from: b */
    void mo142717b(w660 w660Var);

    /* JADX INFO: renamed from: d */
    default void m196080d(int i, View view) {
        if (view instanceof PhotoAlbumPlayerView) {
            mo142726j(i, (PhotoAlbumPlayerView) view);
        } else if (view instanceof FeedPhotoPreviewView) {
            mo142728k(i, (FeedPhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    c680.C16085c mo142722e();

    /* JADX INFO: renamed from: f */
    void mo142208f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo142210g();

    /* JADX INFO: renamed from: j */
    void mo142726j(int i, PhotoAlbumPlayerView photoAlbumPlayerView);

    /* JADX INFO: renamed from: k */
    void mo142728k(int i, FeedPhotoPreviewView feedPhotoPreviewView);

    /* JADX INFO: renamed from: l */
    void mo142730l(FeedVideoLikeContainerView feedVideoLikeContainerView);
}
