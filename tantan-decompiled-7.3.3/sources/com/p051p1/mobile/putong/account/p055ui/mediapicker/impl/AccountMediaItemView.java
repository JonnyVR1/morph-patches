package com.p051p1.mobile.putong.account.p055ui.mediapicker.impl;

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
import p153l.C20387ts;
import p153l.bnl0;
import p153l.mol;
import p153l.psh0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17725a;

    /* JADX INFO: renamed from: b */
    public ImageView f17726b;

    /* JADX INFO: renamed from: c */
    public View f17727c;

    /* JADX INFO: renamed from: d */
    public VFrame f17728d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f17729e;

    /* JADX INFO: renamed from: f */
    public Media f17730f;

    public AccountMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m30171e(Media media, VDraweeView vDraweeView) {
        uqb0.f180374G.m127150m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m30172b(View view) {
        C20387ts.m192531a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m30173c(View view) {
        if (this.f17729e.m224248d()) {
            if (m30174d().mo30184i(this.f17730f, false)) {
                this.f17729e.m224249e(false, true);
            }
        } else if (m30174d().mo30184i(this.f17730f, true)) {
            this.f17729e.m224249e(true, true);
        }
        m30174d().mo30183f();
    }

    /* JADX INFO: renamed from: d */
    public mol m30174d() {
        return (mol) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m30175f(Media media, boolean z) {
        this.f17730f = media;
        m30171e(media, this.f17725a);
        bnl0.m105525M0(this.f17726b, media instanceof Video);
        if (z) {
            this.f17729e.m224249e(m30174d().mo30187k().contains(media), false);
        } else {
            bnl0.m105525M0(this.f17728d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m30174d().mo30186j(view, this.f17730f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m30172b(this);
        setOnClickListener(this);
        this.f17728d.setOnClickListener(new View.OnClickListener() { // from class: l.ss
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f170423a.m30173c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM173642a = psh0.m173642a(i, i2);
        super.onMeasure(iM173642a, iM173642a);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
