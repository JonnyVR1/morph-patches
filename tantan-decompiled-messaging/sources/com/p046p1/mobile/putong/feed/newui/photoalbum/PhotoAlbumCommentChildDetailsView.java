package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.CommentInfo;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.c170;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumCommentChildDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f41139n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f41140o;

    /* JADX INFO: renamed from: p */
    public VImage f41141p;

    /* JADX INFO: renamed from: q */
    public VText f41142q;

    /* JADX INFO: renamed from: r */
    public VText f41143r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f41144s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41145t;

    /* JADX INFO: renamed from: u */
    public VText f41146u;

    /* JADX INFO: renamed from: v */
    public VText f41147v;

    /* JADX INFO: renamed from: w */
    public VRelative f41148w;

    /* JADX INFO: renamed from: x */
    public VImage f41149x;

    /* JADX INFO: renamed from: y */
    public VText f41150y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f41151z;

    public PhotoAlbumCommentChildDetailsView(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: D */
    public Act mo63485D() {
        return (Act) getContext();
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: L */
    public String mo63486L(boolean z) {
        MomentMessage momentMessage = this.f41167a;
        if (z) {
            return momentMessage.parentCommentId;
        }
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null) {
            return null;
        }
        return commentInfo.parentMessageId;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo63487N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iM186890d = t100.m186890d(188.0f) + t100.m186890d(m63550P(str) ? 8.0f : 0.0f);
        if (z && m63550P(str2)) {
            f = 8.0f;
        }
        return iM186890d + t100.m186890d(f);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f41142q;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f41145t;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f41144s;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f41143r;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f41150y;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f41148w;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f41149x;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f41151z;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f41140o;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f41141p;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f41147v;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f41146u;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m63488z0(this);
        this.f41151z = this.f41140o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m63488z0(View view) {
        c170.m104831a(this, view);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
