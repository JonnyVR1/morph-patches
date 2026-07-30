package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p046p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class svg implements s7m<qvg> {

    /* JADX INFO: renamed from: a */
    public FeedCommentPhotoPreviewAct f166566a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumPhotoPreviewView f166567b;

    /* JADX INFO: renamed from: c */
    public FeedDragDismissContainerView f166568c;

    /* JADX INFO: renamed from: d */
    public l2h f166569d;

    /* JADX INFO: renamed from: e */
    public View f166570e;

    public svg(FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        this.f166566a = feedCommentPhotoPreviewAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f166566a;
    }

    /* JADX INFO: renamed from: b */
    public final View m186070b(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView((Context) this.f166566a, false);
        this.f166568c = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f166569d);
        this.f166568c.setInnerContentView(view);
        this.f166568c.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        m186074f(media);
        return this.f166568c;
    }

    /* JADX INFO: renamed from: d */
    public final View m186072d(View view) {
        Picture picture;
        boolean zM81303a = NullChecker.m81303a(this.f166566a.f41480e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f166566a;
        if (zM81303a) {
            picture = feedCommentPhotoPreviewAct.f41480e.pictures.get(0);
        } else {
            picture = NullChecker.m81303a(feedCommentPhotoPreviewAct.f41481f) ? this.f166566a.f41481f : null;
        }
        if (picture != null) {
            Dimension dimension = picture.size;
            if (vqg.m199564p0(dimension.width, dimension.height)) {
                return m186070b(view, picture);
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: e */
    public View m186073e() {
        return this.f166570e;
    }

    /* JADX INFO: renamed from: f */
    public final void m186074f(Media media) {
        this.f166568c.setId(b5c0.f73596o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f166568c.setOriginalHeight(video.size.height);
            this.f166568c.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f166568c.setOriginalHeight(Math.min(xdl0.m208408w0(), picture.size.height));
            this.f166568c.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m186075i() {
        StickerInfo stickerInfo = this.f166566a.f41480e;
        if (stickerInfo != null && !vwb.m200296J(stickerInfo.pictures)) {
            return true;
        }
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f166566a;
        vwi.m200376G(feedCommentPhotoPreviewAct, feedCommentPhotoPreviewAct.f41481f);
        return true;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f166567b = new PhotoAlbumPhotoPreviewView(this.f166566a);
        boolean zM81303a = NullChecker.m81303a(this.f166566a.f41480e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f166566a;
        if (zM81303a) {
            m186076j(feedCommentPhotoPreviewAct.f41480e);
        } else if (NullChecker.m81303a(feedCommentPhotoPreviewAct.f41481f)) {
            m186077k(this.f166566a.f41481f);
        }
        l2h l2hVar = new l2h(this.f166566a);
        this.f166569d = l2hVar;
        this.f166567b.f42656a.setOnDragDismissListenler(l2hVar);
        this.f166570e = m186072d(this.f166567b);
        this.f166567b.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC11321b() { // from class: l.rvg
            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11321b
            /* JADX INFO: renamed from: a */
            public final boolean mo65396a() {
                return this.f161200a.m186075i();
            }
        });
        return this.f166570e;
    }

    /* JADX INFO: renamed from: j */
    public void m186076j(StickerInfo stickerInfo) {
        this.f166567b.setStickerInfo(stickerInfo);
    }

    /* JADX INFO: renamed from: k */
    public void m186077k(Picture picture) {
        this.f166567b.setPicture(picture);
    }

    /* JADX INFO: renamed from: l */
    public void m186078l() {
        this.f166567b.m65395W();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qvg qvgVar) {
    }
}
