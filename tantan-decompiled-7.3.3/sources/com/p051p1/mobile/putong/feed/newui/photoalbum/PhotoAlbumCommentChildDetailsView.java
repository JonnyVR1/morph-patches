package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.CommentInfo;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRelative;
import p151v.VText;
import p153l.i970;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumCommentChildDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f41987n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f41988o;

    /* JADX INFO: renamed from: p */
    public VImage f41989p;

    /* JADX INFO: renamed from: q */
    public VText f41990q;

    /* JADX INFO: renamed from: r */
    public VText f41991r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f41992s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41993t;

    /* JADX INFO: renamed from: u */
    public VText f41994u;

    /* JADX INFO: renamed from: v */
    public VText f41995v;

    /* JADX INFO: renamed from: w */
    public VRelative f41996w;

    /* JADX INFO: renamed from: x */
    public VImage f41997x;

    /* JADX INFO: renamed from: y */
    public VText f41998y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f41999z;

    public PhotoAlbumCommentChildDetailsView(Context context) {
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
        MomentMessage momentMessage = this.f42015a;
        if (z) {
            return momentMessage.parentCommentId;
        }
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null) {
            return null;
        }
        return commentInfo.parentMessageId;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo64670N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iM175859d = qa00.m175859d(188.0f) + qa00.m175859d(m64733P(str) ? 8.0f : 0.0f);
        if (z && m64733P(str2)) {
            f = 8.0f;
        }
        return iM175859d + qa00.m175859d(f);
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f41990q;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f41993t;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f41992s;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f41991r;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f41998y;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f41996w;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f41997x;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f41999z;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f41988o;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f41989p;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f41995v;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f41994u;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m64671z0(this);
        this.f41999z = this.f41988o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m64671z0(View view) {
        i970.m139082a(this, view);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
