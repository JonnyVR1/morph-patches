package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p051p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class hxg implements iam<fxg> {

    /* JADX INFO: renamed from: a */
    public FeedCommentPhotoPreviewAct f112001a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumPhotoPreviewView f112002b;

    /* JADX INFO: renamed from: c */
    public FeedDragDismissContainerView f112003c;

    /* JADX INFO: renamed from: d */
    public a4h f112004d;

    /* JADX INFO: renamed from: e */
    public View f112005e;

    public hxg(FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        this.f112001a = feedCommentPhotoPreviewAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f112001a;
    }

    /* JADX INFO: renamed from: b */
    public final View m137598b(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView((Context) this.f112001a, false);
        this.f112003c = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f112004d);
        this.f112003c.setInnerContentView(view);
        this.f112003c.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        m137602f(media);
        return this.f112003c;
    }

    /* JADX INFO: renamed from: d */
    public final View m137600d(View view) {
        Picture picture;
        boolean zM82486a = NullChecker.m82486a(this.f112001a.f42328e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f112001a;
        if (zM82486a) {
            picture = feedCommentPhotoPreviewAct.f42328e.pictures.get(0);
        } else {
            picture = NullChecker.m82486a(feedCommentPhotoPreviewAct.f42329f) ? this.f112001a.f42329f : null;
        }
        if (picture != null) {
            Dimension dimension = picture.size;
            if (ksg.m151223p0(dimension.width, dimension.height)) {
                return m137598b(view, picture);
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: e */
    public View m137601e() {
        return this.f112005e;
    }

    /* JADX INFO: renamed from: f */
    public final void m137602f(Media media) {
        this.f112003c.setId(hdc0.f108949o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f112003c.setOriginalHeight(video.size.height);
            this.f112003c.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f112003c.setOriginalHeight(Math.min(bnl0.m105588w0(), picture.size.height));
            this.f112003c.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m137603i() {
        StickerInfo stickerInfo = this.f112001a.f42328e;
        if (stickerInfo != null && !jyb.m147479J(stickerInfo.pictures)) {
            return true;
        }
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f112001a;
        rzi.m183760G(feedCommentPhotoPreviewAct, feedCommentPhotoPreviewAct.f42329f);
        return true;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f112002b = new PhotoAlbumPhotoPreviewView(this.f112001a);
        boolean zM82486a = NullChecker.m82486a(this.f112001a.f42328e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f112001a;
        if (zM82486a) {
            m137604j(feedCommentPhotoPreviewAct.f42328e);
        } else if (NullChecker.m82486a(feedCommentPhotoPreviewAct.f42329f)) {
            m137605k(this.f112001a.f42329f);
        }
        a4h a4hVar = new a4h(this.f112001a);
        this.f112004d = a4hVar;
        this.f112002b.f43504a.setOnDragDismissListenler(a4hVar);
        this.f112005e = m137600d(this.f112002b);
        this.f112002b.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC11484b() { // from class: l.gxg
            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11484b
            /* JADX INFO: renamed from: a */
            public final boolean mo66579a() {
                return this.f106940a.m137603i();
            }
        });
        return this.f112005e;
    }

    /* JADX INFO: renamed from: j */
    public void m137604j(StickerInfo stickerInfo) {
        this.f112002b.setStickerInfo(stickerInfo);
    }

    /* JADX INFO: renamed from: k */
    public void m137605k(Picture picture) {
        this.f112002b.setPicture(picture);
    }

    /* JADX INFO: renamed from: l */
    public void m137606l() {
        this.f112002b.m66578W();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fxg fxgVar) {
    }
}
