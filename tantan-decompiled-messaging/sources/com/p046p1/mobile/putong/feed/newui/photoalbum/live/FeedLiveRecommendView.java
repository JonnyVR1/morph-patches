package com.p046p1.mobile.putong.feed.newui.photoalbum.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p046p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p046p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import java.util.List;
import p147v.VDraweeView;
import p149l.e30;
import p149l.mkd0;
import p149l.obh;
import p149l.osg;
import p149l.qib0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedLiveRecommendView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f42025d;

    /* JADX INFO: renamed from: e */
    public TextView f42026e;

    /* JADX INFO: renamed from: f */
    public TextView f42027f;

    /* JADX INFO: renamed from: g */
    public TextView f42028g;

    /* JADX INFO: renamed from: h */
    public PhotoAlbumBaseFrag f42029h;

    /* JADX INFO: renamed from: i */
    public MomentItem f42030i;

    public FeedLiveRecommendView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m64790i0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public final void m64792k0(View view) {
        obh.m163442a(this, view);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m64793l0(final LiveRecommendCard liveRecommendCard) {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.lbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127294a.m64795n0(liveRecommendCard, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m64794m0(LiveRecommendCard liveRecommendCard, List list) {
        if (vwb.m200296J(list) || TextUtils.isEmpty(((LiveMultiCallLiveSchema) list.get(0)).schema)) {
            FeedModule.m60223M().mo67294zn(this.f42029h.act(), liveRecommendCard.extra);
            return;
        }
        MomentItem momentItem = this.f42030i;
        osg.m165774i(momentItem.f41351d, momentItem.f41348a + 1, true);
        FeedModule.m60223M().mo67269gj(this.f42029h.act(), ((LiveMultiCallLiveSchema) list.get(0)).schema);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m64795n0(final LiveRecommendCard liveRecommendCard, View view) {
        this.f42029h.duringCreated(FeedModule.f38855d.m209321M7(liveRecommendCard.extra)).subscribe(mkd0.m154956H(new e30() { // from class: l.mbh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133022a.m64794m0(liveRecommendCard, (List) obj);
            }
        }, new e30() { // from class: l.nbh
            @Override // p149l.e30
            public final void call(Object obj) {
                FeedLiveRecommendView.m64790i0((Throwable) obj);
            }
        }));
        osg.m165770e(true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m64796o0(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem) {
        this.f42029h = photoAlbumBaseFrag;
        this.f42030i = momentItem;
        LiveRecommendCard liveRecommendCard = momentItem.f41359l;
        if (liveRecommendCard == null) {
            return;
        }
        m64797p0(liveRecommendCard);
        m64793l0(liveRecommendCard);
        osg.m165771f(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m64792k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m64797p0(LiveRecommendCard liveRecommendCard) {
        qib0.f154691G.m102331L0(this.f42025d, liveRecommendCard.icon);
        this.f42026e.setText(liveRecommendCard.title);
        this.f42027f.setText(liveRecommendCard.desc);
        this.f42028g.setText(liveRecommendCard.buttonText);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
