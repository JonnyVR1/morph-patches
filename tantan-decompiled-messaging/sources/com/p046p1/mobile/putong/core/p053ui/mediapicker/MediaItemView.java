package com.p046p1.mobile.putong.core.p053ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Video;
import p147v.VCheckCircle;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.gwl;
import p149l.ikh0;
import p149l.jkx;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30616a;

    /* JADX INFO: renamed from: b */
    public ImageView f30617b;

    /* JADX INFO: renamed from: c */
    public View f30618c;

    /* JADX INFO: renamed from: d */
    public VFrame f30619d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f30620e;

    /* JADX INFO: renamed from: f */
    public Media f30621f;

    public MediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m47774e(Media media, VDraweeView vDraweeView) {
        qib0.f154691G.m102367m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m47775b(View view) {
        jkx.m141916a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m47776c(View view) {
        if (this.f30620e.m223002d()) {
            if (m47777d().mo47768i(this.f30621f, false)) {
                this.f30620e.m223003e(false, true);
            }
        } else if (m47777d().mo47768i(this.f30621f, true)) {
            this.f30620e.m223003e(true, true);
        }
        m47777d().mo47767f();
    }

    /* JADX INFO: renamed from: d */
    public gwl m47777d() {
        return (gwl) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m47778f(Media media, boolean z) {
        this.f30621f = media;
        m47774e(media, this.f30616a);
        xdl0.m208345M0(this.f30617b, media instanceof Video);
        if (z) {
            this.f30620e.m223003e(m47777d().mo47793k().contains(media), false);
        } else {
            xdl0.m208345M0(this.f30619d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m47777d().mo47769j(view, this.f30621f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47775b(this);
        setOnClickListener(this);
        this.f30619d.setOnClickListener(new View.OnClickListener() { // from class: l.ikx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f113738a.m47776c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public MediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
