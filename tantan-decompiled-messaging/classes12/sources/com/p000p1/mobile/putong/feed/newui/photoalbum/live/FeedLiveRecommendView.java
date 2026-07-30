package com.p000p1.mobile.putong.feed.newui.photoalbum.live;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.LiveMultiCallLiveSchema;
import com.p000p1.mobile.putong.feed.data.LiveRecommendCard;
import com.p000p1.mobile.putong.feed.newui.photoalbum.adapter.MomentItem;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.FeedLiveRecommendView;
import java.util.List;
import l.e30;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.xdl0;
import p007l.obh;
import p007l.osg;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedLiveRecommendView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f3486d;

    /* JADX INFO: renamed from: e */
    public TextView f3487e;

    /* JADX INFO: renamed from: f */
    public TextView f3488f;

    /* JADX INFO: renamed from: g */
    public TextView f3489g;

    /* JADX INFO: renamed from: h */
    public PhotoAlbumBaseFrag f3490h;

    /* JADX INFO: renamed from: i */
    public MomentItem f3491i;

    public FeedLiveRecommendView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m5887i0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public final void m5889k0(View view) {
        obh.m12511a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m5890l0(final LiveRecommendCard liveRecommendCard) {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.lbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9999a.m5892n0(liveRecommendCard, view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m5891m0(LiveRecommendCard liveRecommendCard, List list) {
        if (vwb.J(list) || TextUtils.isEmpty(((LiveMultiCallLiveSchema) list.get(0)).schema)) {
            FeedModule.m1141M().zn(this.f3490h.act(), liveRecommendCard.extra);
            return;
        }
        MomentItem momentItem = this.f3491i;
        osg.m12853i(momentItem.f2812d, momentItem.f2809a + 1, true);
        FeedModule.m1141M().gj(this.f3490h.act(), ((LiveMultiCallLiveSchema) list.get(0)).schema);
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m5892n0(final LiveRecommendCard liveRecommendCard, View view) {
        this.f3490h.duringCreated(FeedModule.f316d.m16502M7(liveRecommendCard.extra)).subscribe(mkd0.H(new e30() { // from class: l.mbh
            public final void call(Object obj) {
                this.f10414a.m5891m0(liveRecommendCard, (List) obj);
            }
        }, new e30() { // from class: l.nbh
            public final void call(Object obj) {
                FeedLiveRecommendView.m5887i0((Throwable) obj);
            }
        }));
        osg.m12849e(true);
    }

    /* JADX INFO: renamed from: o0 */
    public void m5893o0(PhotoAlbumBaseFrag photoAlbumBaseFrag, MomentItem momentItem) {
        this.f3490h = photoAlbumBaseFrag;
        this.f3491i = momentItem;
        LiveRecommendCard liveRecommendCard = momentItem.f2820l;
        if (liveRecommendCard == null) {
            return;
        }
        m5894p0(liveRecommendCard);
        m5890l0(liveRecommendCard);
        osg.m12850f(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5889k0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m5894p0(LiveRecommendCard liveRecommendCard) {
        qib0.G.L0(this.f3486d, liveRecommendCard.icon);
        this.f3487e.setText(liveRecommendCard.title);
        this.f3488f.setText(liveRecommendCard.desc);
        this.f3489g.setText(liveRecommendCard.buttonText);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedLiveRecommendView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
