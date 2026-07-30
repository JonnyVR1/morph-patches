package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;
import p149l.p270;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumCommentParentDetailsView extends PhotoAlbumCommentExpandDetailsView {

    /* JADX INFO: renamed from: n */
    public FrameLayout f41184n;

    /* JADX INFO: renamed from: o */
    public HeaderFrameWrapper f41185o;

    /* JADX INFO: renamed from: p */
    public VImage f41186p;

    /* JADX INFO: renamed from: q */
    public VText f41187q;

    /* JADX INFO: renamed from: r */
    public VText f41188r;

    /* JADX INFO: renamed from: s */
    public RelativeLayout f41189s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f41190t;

    /* JADX INFO: renamed from: u */
    public VText f41191u;

    /* JADX INFO: renamed from: v */
    public VText f41192v;

    /* JADX INFO: renamed from: w */
    public VRelative f41193w;

    /* JADX INFO: renamed from: x */
    public VImage f41194x;

    /* JADX INFO: renamed from: y */
    public VText f41195y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f41196z;

    public PhotoAlbumCommentParentDetailsView(Context context) {
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
        return this.f41167a.f56008id;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    /* JADX INFO: renamed from: N */
    public float mo63487N(String str, String str2, boolean z) {
        float f = 0.0f;
        int iM186890d = t100.m186890d(148.0f) + t100.m186890d(m63550P(str) ? 8.0f : 0.0f);
        if (z && m63550P(str2)) {
            f = 8.0f;
        }
        return iM186890d + t100.m186890d(f);
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentName() {
        return this.f41187q;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getCommentSticker() {
        return this.f41190t;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public RelativeLayout getCommentStickerContent() {
        return this.f41189s;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getCommentText() {
        return this.f41188r;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getLikeCount() {
        return this.f41195y;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VRelative getLikeCountContainer() {
        return this.f41193w;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getLikeIndicator() {
        return this.f41194x;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VDraweeView getPic() {
        return this.f41196z;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public HeaderFrameWrapper getPicFrame() {
        return this.f41185o;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VImage getPicVerification() {
        return this.f41186p;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getReply() {
        return this.f41192v;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView
    public VText getTime() {
        return this.f41191u;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumCommentExpandDetailsView, android.view.View
    public void onFinishInflate() {
        m63585z0(this);
        this.f41196z = this.f41185o.get_pic();
        super.onFinishInflate();
    }

    /* JADX INFO: renamed from: z0 */
    public final void m63585z0(View view) {
        p270.m167129a(this, view);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PhotoAlbumCommentParentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
