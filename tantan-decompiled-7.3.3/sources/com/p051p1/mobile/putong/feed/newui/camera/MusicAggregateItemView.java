package com.p051p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.GifMedia;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import p151v.VDraweeView;
import p153l.aw10;
import p153l.bnl0;
import p153l.cmg;
import p153l.gg70;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class MusicAggregateItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f40201a;

    /* JADX INFO: renamed from: b */
    public TextView f40202b;

    public MusicAggregateItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m62279b(View view) {
        aw10.m100560a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicAggregateAct m62280c() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m62281d(Moment moment, View view) {
        if (cmg.m111225o()) {
            m62280c().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m66490a2(m62280c(), moment.f56859id, 0, true, m62280c().pageId(), true, false, -1), new gg70());
            return;
        }
        Intent intentM66018b = MomentDetailAct.C11469a.m66017a(m62280c()).m66022f("aggregate_page").m66029m(moment.f56859id).m66030n(moment.owner).m66036t(true).m66027k(moment).m66031o(moment.momentValue).m66018b();
        if (intentM66018b == null) {
            return;
        }
        m62280c().startActivity(intentM66018b);
    }

    /* JADX INFO: renamed from: e */
    public void m62282e(final Moment moment) {
        Video video;
        GifMedia gifMedia;
        bnl0.m105524M(this.f40202b, TextUtils.equals(moment.status, MatchFrom.selected));
        this.f40202b.setText("精选");
        if (!(moment.media.get(0) instanceof Video) || (gifMedia = (video = (Video) moment.media.get(0)).gif) == null || TextUtils.isEmpty(gifMedia.url)) {
            uqb0.f180374G.m127115L0(this.f40201a, moment.media.get(0).cover().url);
        } else {
            uqb0.f180374G.m127115L0(this.f40201a, moment.media.get(0).cover().url);
            uqb0.f180374G.m127119N0(this.f40201a, video.gif.url, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.zv10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f206180a.m62281d(moment, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62279b(this);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
