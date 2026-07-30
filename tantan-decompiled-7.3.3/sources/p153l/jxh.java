package p153l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;

/* JADX INFO: loaded from: classes13.dex */
public interface jxh {
    /* JADX INFO: renamed from: b */
    void mo107410b(cf60 cf60Var);

    /* JADX INFO: renamed from: d */
    default void m147343d(int i, View view) {
        if (view instanceof PhotoAlbumPlayerView) {
            mo107416j(i, (PhotoAlbumPlayerView) view);
        } else if (view instanceof FeedPhotoPreviewView) {
            mo107417k(i, (FeedPhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    ie80.C17711c mo107412e();

    /* JADX INFO: renamed from: f */
    void mo107413f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo107414g();

    /* JADX INFO: renamed from: j */
    void mo107416j(int i, PhotoAlbumPlayerView photoAlbumPlayerView);

    /* JADX INFO: renamed from: k */
    void mo107417k(int i, FeedPhotoPreviewView feedPhotoPreviewView);

    /* JADX INFO: renamed from: l */
    void mo107418l(FeedVideoLikeContainerView feedVideoLikeContainerView);
}
