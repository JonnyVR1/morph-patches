package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview.FeedCommentPhotoPreviewAct;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p000p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.tantanapp.common.utils.NullChecker;
import l.s7m;
import l.vwb;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class svg implements s7m<qvg> {

    /* JADX INFO: renamed from: a */
    public FeedCommentPhotoPreviewAct f13096a;

    /* JADX INFO: renamed from: b */
    public PhotoAlbumPhotoPreviewView f13097b;

    /* JADX INFO: renamed from: c */
    public FeedDragDismissContainerView f13098c;

    /* JADX INFO: renamed from: d */
    public l2h f13099d;

    /* JADX INFO: renamed from: e */
    public View f13100e;

    public svg(FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct) {
        this.f13096a = feedCommentPhotoPreviewAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14321C0() {
        return this.f13096a;
    }

    /* JADX INFO: renamed from: b */
    public final View m14322b(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView((Context) this.f13096a, false);
        this.f13098c = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f13099d);
        this.f13098c.setInnerContentView(view);
        this.f13098c.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        m14326f(media);
        return this.f13098c;
    }

    /* JADX INFO: renamed from: d */
    public final View m14324d(View view) {
        Picture picture;
        boolean zA = NullChecker.a(this.f13096a.f2941e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f13096a;
        if (zA) {
            picture = feedCommentPhotoPreviewAct.f2941e.pictures.get(0);
        } else {
            picture = NullChecker.a(feedCommentPhotoPreviewAct.f2942f) ? this.f13096a.f2942f : null;
        }
        if (picture != null) {
            Dimension dimension = picture.size;
            if (vqg.m15534p0(dimension.width, dimension.height)) {
                return m14322b(view, picture);
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: e */
    public View m14325e() {
        return this.f13100e;
    }

    /* JADX INFO: renamed from: f */
    public final void m14326f(Media media) {
        this.f13098c.setId(b5c0.f6077o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f13098c.setOriginalHeight(video.size.height);
            this.f13098c.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f13098c.setOriginalHeight(Math.min(xdl0.w0(), picture.size.height));
            this.f13098c.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean m14327i() {
        StickerInfo stickerInfo = this.f13096a.f2941e;
        if (stickerInfo != null && !vwb.J(stickerInfo.pictures)) {
            return true;
        }
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f13096a;
        vwi.m15592G(feedCommentPhotoPreviewAct, feedCommentPhotoPreviewAct.f2942f);
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.f13097b = new PhotoAlbumPhotoPreviewView(this.f13096a);
        boolean zA = NullChecker.a(this.f13096a.f2941e);
        FeedCommentPhotoPreviewAct feedCommentPhotoPreviewAct = this.f13096a;
        if (zA) {
            m14329j(feedCommentPhotoPreviewAct.f2941e);
        } else if (NullChecker.a(feedCommentPhotoPreviewAct.f2942f)) {
            m14330k(this.f13096a.f2942f);
        }
        l2h l2hVar = new l2h(this.f13096a);
        this.f13099d = l2hVar;
        this.f13097b.f4117a.setOnDragDismissListenler(l2hVar);
        this.f13100e = m14324d(this.f13097b);
        this.f13097b.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC2165b() { // from class: l.rvg
            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC2165b
            /* JADX INFO: renamed from: a */
            public final boolean mo6515a() {
                return this.f12742a.m14327i();
            }
        });
        return this.f13100e;
    }

    /* JADX INFO: renamed from: j */
    public void m14329j(StickerInfo stickerInfo) {
        this.f13097b.setStickerInfo(stickerInfo);
    }

    /* JADX INFO: renamed from: k */
    public void m14330k(Picture picture) {
        this.f13097b.setPicture(picture);
    }

    /* JADX INFO: renamed from: l */
    public void m14331l() {
        this.f13097b.m6510W();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m14328i1(qvg qvgVar) {
    }
}
