package com.p000p1.mobile.putong.core.p001ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import l.jkx;
import l.qib0;
import l.xdl0;
import p003l.gwl;
import p003l.ikh0;
import p028v.VCheckCircle;
import p028v.VDraweeView;
import p028v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f507a;

    /* JADX INFO: renamed from: b */
    public ImageView f508b;

    /* JADX INFO: renamed from: c */
    public View f509c;

    /* JADX INFO: renamed from: d */
    public VFrame f510d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f511e;

    /* JADX INFO: renamed from: f */
    public Media f512f;

    public MediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m838e(Media media, VDraweeView vDraweeView) {
        qib0.G.m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m839b(View view) {
        jkx.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m840c(View view) {
        if (this.f511e.m11475d()) {
            if (m841d().mo832i(this.f512f, false)) {
                this.f511e.m11476e(false, true);
            }
        } else if (m841d().mo832i(this.f512f, true)) {
            this.f511e.m11476e(true, true);
        }
        m841d().mo831f();
    }

    /* JADX INFO: renamed from: d */
    public gwl m841d() {
        return (gwl) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m842f(Media media, boolean z) {
        this.f512f = media;
        m838e(media, this.f507a);
        xdl0.M0(this.f508b, media instanceof Video);
        if (z) {
            this.f511e.m11476e(m841d().mo857k().contains(media), false);
        } else {
            xdl0.M0(this.f510d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m841d().mo833j(view, this.f512f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m839b(this);
        setOnClickListener(this);
        this.f510d.setOnClickListener(new View.OnClickListener() { // from class: l.ikx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4434a.m840c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM5155a = ikh0.m5155a(i, i2);
        super.onMeasure(iM5155a, iM5155a);
    }

    public MediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
