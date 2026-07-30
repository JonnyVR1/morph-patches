package com.p051p1.mobile.putong.core.p058ui.mediapicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Video;
import p151v.VCheckCircle;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.gtx;
import p153l.psh0;
import p153l.uqb0;
import p153l.yyl;

/* JADX INFO: loaded from: classes3.dex */
public class MediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31464a;

    /* JADX INFO: renamed from: b */
    public ImageView f31465b;

    /* JADX INFO: renamed from: c */
    public View f31466c;

    /* JADX INFO: renamed from: d */
    public VFrame f31467d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f31468e;

    /* JADX INFO: renamed from: f */
    public Media f31469f;

    public MediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m48957e(Media media, VDraweeView vDraweeView) {
        uqb0.f180374G.m127150m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m48958b(View view) {
        gtx.m132259a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m48959c(View view) {
        if (this.f31468e.m224248d()) {
            if (m48960d().mo48951i(this.f31469f, false)) {
                this.f31468e.m224249e(false, true);
            }
        } else if (m48960d().mo48951i(this.f31469f, true)) {
            this.f31468e.m224249e(true, true);
        }
        m48960d().mo48950f();
    }

    /* JADX INFO: renamed from: d */
    public yyl m48960d() {
        return (yyl) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m48961f(Media media, boolean z) {
        this.f31469f = media;
        m48957e(media, this.f31464a);
        bnl0.m105525M0(this.f31465b, media instanceof Video);
        if (z) {
            this.f31468e.m224249e(m48960d().mo48976k().contains(media), false);
        } else {
            bnl0.m105525M0(this.f31467d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m48960d().mo48952j(view, this.f31469f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48958b(this);
        setOnClickListener(this);
        this.f31467d.setOnClickListener(new View.OnClickListener() { // from class: l.ftx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100815a.m48959c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
    }

    public MediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
