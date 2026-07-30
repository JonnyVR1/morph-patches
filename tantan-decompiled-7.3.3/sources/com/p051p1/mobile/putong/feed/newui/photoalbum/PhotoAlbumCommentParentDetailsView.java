package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.qa00;
import p153l.va70;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumCommentParentDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f42032n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f42033o;

    /* JADX INFO: renamed from: p */
    public VImage f42034p;

    /* JADX INFO: renamed from: q */
    public VText f42035q;

    /* JADX INFO: renamed from: r */
    public VText f42036r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f42037s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f42038t;

    /* JADX INFO: renamed from: u */
    public VText f42039u;

    /* JADX INFO: renamed from: v */
    public VText f42040v;

    /* JADX INFO: renamed from: w */
    public VRelative f42041w;

    /* JADX INFO: renamed from: x */
    public VImage f42042x;

    /* JADX INFO: renamed from: y */
    public VText f42043y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f42044z;

    public PhotoAlbumCommentParentDetailsView(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: D */
    public Act mo64668D() {
        return (Act) getContext();
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: L */
    public String mo64669L(boolean z) {
        return this.f42015a.f56856id;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo64670N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iM175859d = qa00.m175859d(148.0f) + qa00.m175859d(m64733P(str) ? 8.0f : 0.0f);
        if (z && m64733P(str2)) {
            f = 8.0f;
        }
        return iM175859d + qa00.m175859d(f);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f42035q;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f42038t;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f42037s;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f42036r;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f42043y;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f42041w;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f42042x;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f42044z;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f42033o;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f42034p;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f42040v;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f42039u;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m64768z0(this);
        this.f42044z = this.f42033o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m64768z0(View view) {
        va70.m200498a(this, view);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
