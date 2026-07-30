package com.p000p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.data.GifMedia;
import com.p000p1.mobile.putong.data.MatchFrom;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.tantanapp.common.data.DbObject;
import l.qib0;
import l.xdl0;
import p007l.a870;
import p007l.nkg;
import p007l.sn10;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MusicAggregateItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f814a;

    /* JADX INFO: renamed from: b */
    public TextView f815b;

    public MusicAggregateItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m2028b(View view) {
        sn10.m14262a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicAggregateAct m2029c() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m2030d(Moment moment, View view) {
        if (nkg.m12255o()) {
            m2029c().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m6408Z1(m2029c(), ((DbObject) moment).id, 0, true, m2029c().pageId(), true, false, -1), new a870());
            return;
        }
        Intent intentM5932b = MomentDetailAct.C2150a.m5931a(m2029c()).m5936f("aggregate_page").m5943m(((DbObject) moment).id).m5944n(moment.owner).m5950t(true).m5941k(moment).m5945o(moment.momentValue).m5932b();
        if (intentM5932b == null) {
            return;
        }
        m2029c().startActivity(intentM5932b);
    }

    /* JADX INFO: renamed from: e */
    public void m2031e(final Moment moment) {
        Video video;
        GifMedia gifMedia;
        xdl0.M(this.f815b, TextUtils.equals(moment.status, MatchFrom.selected));
        this.f815b.setText("精选");
        if (!(moment.media.get(0) instanceof Video) || (gifMedia = (video = (Video) moment.media.get(0)).gif) == null || TextUtils.isEmpty(gifMedia.url)) {
            qib0.G.L0(this.f814a, moment.media.get(0).cover().url);
        } else {
            qib0.G.L0(this.f814a, moment.media.get(0).cover().url);
            qib0.G.N0(this.f814a, video.gif.url, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.rn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12684a.m2030d(moment, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2028b(this);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
