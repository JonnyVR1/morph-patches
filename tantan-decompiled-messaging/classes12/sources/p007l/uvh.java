package p007l;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;
import l.c680;
import l.w660;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public interface uvh {
    /* JADX INFO: renamed from: b */
    void mo11300b(w660 w660Var);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    default void m15177d(int i, View view) {
        if (view instanceof PhotoAlbumPlayerView) {
            mo11310j(i, (PhotoAlbumPlayerView) view);
        } else if (view instanceof FeedPhotoPreviewView) {
            mo11312k(i, (FeedPhotoPreviewView) view);
        }
    }

    /* JADX INFO: renamed from: e */
    c680.c mo11305e();

    /* JADX INFO: renamed from: f */
    void mo11226f(ViewPager viewPager, int i, int i2);

    /* JADX INFO: renamed from: g */
    void mo11228g();

    /* JADX INFO: renamed from: j */
    void mo11310j(int i, PhotoAlbumPlayerView photoAlbumPlayerView);

    /* JADX INFO: renamed from: k */
    void mo11312k(int i, FeedPhotoPreviewView feedPhotoPreviewView);

    /* JADX INFO: renamed from: l */
    void mo11314l(FeedVideoLikeContainerView feedVideoLikeContainerView);
}
