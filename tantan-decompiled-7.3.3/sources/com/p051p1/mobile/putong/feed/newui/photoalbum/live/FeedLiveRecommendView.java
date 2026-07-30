package com.p051p1.mobile.putong.feed.newui.photoalbum.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p051p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p051p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.ddh;
import p153l.dug;
import p153l.jyb;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedLiveRecommendView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f42873d;

    /* JADX INFO: renamed from: e */
    public TextView f42874e;

    /* JADX INFO: renamed from: f */
    public TextView f42875f;

    /* JADX INFO: renamed from: g */
    public TextView f42876g;

    /* JADX INFO: renamed from: h */
    public PhotoAlbumBaseFrag f42877h;

    /* JADX INFO: renamed from: i */
    public MomentItem f42878i;

    public FeedLiveRecommendView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m65973i0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public final void m65975k0(View view) {
        ddh.m115340a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m65976l0(final LiveRecommendCard liveRecommendCard) {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.adh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70689a.m65978n0(liveRecommendCard, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m65977m0(LiveRecommendCard liveRecommendCard, List list) {
        if (jyb.m147479J(list) || TextUtils.isEmpty(((LiveMultiCallLiveSchema) list.get(0)).schema)) {
            FeedModule.m61407M().mo68477zn(this.f42877h.act(), liveRecommendCard.extra);
            return;
        }
        MomentItem momentItem = this.f42878i;
        dug.m118143i(momentItem.f42199d, momentItem.f42196a + 1, true);
        FeedModule.m61407M().mo68452gj(this.f42877h.act(), ((LiveMultiCallLiveSchema) list.get(0)).schema);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m65978n0(final LiveRecommendCard liveRecommendCard, View view) {
        this.f42877h.duringCreated(FeedModule.f39703d.m145562M7(liveRecommendCard.extra)).subscribe(psd0.m173597H(new y20() { // from class: l.bdh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76266a.m65977m0(liveRecommendCard, (List) obj);
            }
        }, new y20() { // from class: l.cdh
            @Override // p153l.y20
            public final void call(Object obj) {
                FeedLiveRecommendView.m65973i0((Throwable) obj);
            }
        }));
        dug.m118139e(true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m65979o0(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem) {
        this.f42877h = photoAlbumBaseFrag;
        this.f42878i = momentItem;
        LiveRecommendCard liveRecommendCard = momentItem.f42207l;
        if (liveRecommendCard == null) {
            return;
        }
        m65980p0(liveRecommendCard);
        m65976l0(liveRecommendCard);
        dug.m118140f(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65975k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m65980p0(LiveRecommendCard liveRecommendCard) {
        uqb0.f180374G.m127115L0(this.f42873d, liveRecommendCard.icon);
        this.f42874e.setText(liveRecommendCard.title);
        this.f42875f.setText(liveRecommendCard.desc);
        this.f42876g.setText(liveRecommendCard.buttonText);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
