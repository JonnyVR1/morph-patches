package com.p000p1.mobile.putong.account.p002ui.mediapicker.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Video;
import l.ikh0;
import l.xdl0;
import p006l.C1540zs;
import p006l.aml;
import p006l.qib0;
import v.VCheckCircle;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f995a;

    /* JADX INFO: renamed from: b */
    public ImageView f996b;

    /* JADX INFO: renamed from: c */
    public View f997c;

    /* JADX INFO: renamed from: d */
    public VFrame f998d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f999e;

    /* JADX INFO: renamed from: f */
    public Media f1000f;

    public AccountMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m1079e(Media media, VDraweeView vDraweeView) {
        qib0.f19782G.m12780m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m1080b(View view) {
        C1540zs.m28813a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m1081c(View view) {
        if (this.f999e.d()) {
            if (m1082d().mo1093i(this.f1000f, false)) {
                this.f999e.e(false, true);
            }
        } else if (m1082d().mo1093i(this.f1000f, true)) {
            this.f999e.e(true, true);
        }
        m1082d().mo1091f();
    }

    /* JADX INFO: renamed from: d */
    public aml m1082d() {
        return (aml) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m1083f(Media media, boolean z) {
        this.f1000f = media;
        m1079e(media, this.f995a);
        xdl0.M0(this.f996b, media instanceof Video);
        if (z) {
            this.f999e.e(m1082d().mo1096k().contains(media), false);
        } else {
            xdl0.M0(this.f998d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m1082d().mo1095j(view, this.f1000f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1080b(this);
        setOnClickListener(this);
        this.f998d.setOnClickListener(new View.OnClickListener() { // from class: l.ys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28364a.m1081c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iA = ikh0.a(i, i2);
        super.onMeasure(iA, iA);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
