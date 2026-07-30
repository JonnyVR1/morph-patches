package com.p046p1.mobile.putong.feed.newui.camera;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.GifMedia;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.MomentDetailAct;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import p147v.VDraweeView;
import p149l.a870;
import p149l.nkg;
import p149l.qib0;
import p149l.sn10;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class MusicAggregateItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f39353a;

    /* JADX INFO: renamed from: b */
    public TextView f39354b;

    public MusicAggregateItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m61095b(View view) {
        sn10.m185030a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final MusicAggregateAct m61096c() {
        return (MusicAggregateAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m61097d(Moment moment, View view) {
        if (nkg.m159896o()) {
            m61096c().startActivityWithCustomTransition(PhotoAlbumFeedPreviewAct.m65307Z1(m61096c(), moment.f56011id, 0, true, m61096c().pageId(), true, false, -1), new a870());
            return;
        }
        Intent intentM64835b = MomentDetailAct.C11306a.m64834a(m61096c()).m64839f("aggregate_page").m64846m(moment.f56011id).m64847n(moment.owner).m64853t(true).m64844k(moment).m64848o(moment.momentValue).m64835b();
        if (intentM64835b == null) {
            return;
        }
        m61096c().startActivity(intentM64835b);
    }

    /* JADX INFO: renamed from: e */
    public void m61098e(final Moment moment) {
        Video video;
        GifMedia gifMedia;
        xdl0.m208344M(this.f39354b, TextUtils.equals(moment.status, MatchFrom.selected));
        this.f39354b.setText("精选");
        if (!(moment.media.get(0) instanceof Video) || (gifMedia = (video = (Video) moment.media.get(0)).gif) == null || TextUtils.isEmpty(gifMedia.url)) {
            qib0.f154691G.m102331L0(this.f39353a, moment.media.get(0).cover().url);
        } else {
            qib0.f154691G.m102331L0(this.f39353a, moment.media.get(0).cover().url);
            qib0.f154691G.m102335N0(this.f39353a, video.gif.url, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.rn10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160232a.m61097d(moment, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61095b(this);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusicAggregateItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
