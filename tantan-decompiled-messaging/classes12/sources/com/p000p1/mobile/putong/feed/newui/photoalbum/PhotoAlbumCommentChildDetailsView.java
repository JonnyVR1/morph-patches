package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.feed.data.CommentInfo;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import l.t100;
import p007l.c170;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumCommentChildDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f2600n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f2601o;

    /* JADX INFO: renamed from: p */
    public VImage f2602p;

    /* JADX INFO: renamed from: q */
    public VText f2603q;

    /* JADX INFO: renamed from: r */
    public VText f2604r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f2605s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f2606t;

    /* JADX INFO: renamed from: u */
    public VText f2607u;

    /* JADX INFO: renamed from: v */
    public VText f2608v;

    /* JADX INFO: renamed from: w */
    public VRelative f2609w;

    /* JADX INFO: renamed from: x */
    public VImage f2610x;

    /* JADX INFO: renamed from: y */
    public VText f2611y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f2612z;

    public PhotoAlbumCommentChildDetailsView(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: D */
    public Act mo4502D() {
        return getContext();
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: L */
    public String mo4503L(boolean z) {
        MomentMessage momentMessage = this.f2628a;
        if (z) {
            return momentMessage.parentCommentId;
        }
        CommentInfo commentInfo = momentMessage.commentInfo;
        if (commentInfo == null) {
            return null;
        }
        return commentInfo.parentMessageId;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo4504N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iD = t100.d(188.0f) + t100.d(m4567P(str) ? 8.0f : 0.0f);
        if (z && m4567P(str2)) {
            f = 8.0f;
        }
        return iD + t100.d(f);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f2603q;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f2606t;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f2605s;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f2604r;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f2611y;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f2609w;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f2610x;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f2612z;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f2601o;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f2602p;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f2608v;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f2607u;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m4505z0(this);
        this.f2612z = this.f2601o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m4505z0(View view) {
        c170.m9063a(this, view);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentChildDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
