package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.CopyObject;
import l.t100;
import p007l.p270;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumCommentParentDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f2645n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f2646o;

    /* JADX INFO: renamed from: p */
    public VImage f2647p;

    /* JADX INFO: renamed from: q */
    public VText f2648q;

    /* JADX INFO: renamed from: r */
    public VText f2649r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f2650s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f2651t;

    /* JADX INFO: renamed from: u */
    public VText f2652u;

    /* JADX INFO: renamed from: v */
    public VText f2653v;

    /* JADX INFO: renamed from: w */
    public VRelative f2654w;

    /* JADX INFO: renamed from: x */
    public VImage f2655x;

    /* JADX INFO: renamed from: y */
    public VText f2656y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f2657z;

    public PhotoAlbumCommentParentDetailsView(Context context) {
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
        return ((CopyObject) this.f2628a).id;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo4504N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iD = t100.d(148.0f) + t100.d(m4567P(str) ? 8.0f : 0.0f);
        if (z && m4567P(str2)) {
            f = 8.0f;
        }
        return iD + t100.d(f);
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f2648q;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f2651t;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f2650s;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f2649r;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f2656y;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f2654w;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f2655x;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f2657z;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f2646o;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f2647p;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f2653v;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f2652u;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m4602z0(this);
        this.f2657z = this.f2646o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m4602z0(View view) {
        p270.m12902a(this, view);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
