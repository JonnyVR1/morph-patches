package com.p046p1.mobile.putong.account.p050ui.mediapicker.impl;

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
import p149l.C21758zs;
import p149l.aml;
import p149l.ikh0;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountMediaItemView extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17006a;

    /* JADX INFO: renamed from: b */
    public ImageView f17007b;

    /* JADX INFO: renamed from: c */
    public View f17008c;

    /* JADX INFO: renamed from: d */
    public VFrame f17009d;

    /* JADX INFO: renamed from: e */
    public VCheckCircle f17010e;

    /* JADX INFO: renamed from: f */
    public Media f17011f;

    public AccountMediaItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public static void m29173e(Media media, VDraweeView vDraweeView) {
        qib0.f154691G.m102367m0(vDraweeView, media.url);
    }

    /* JADX INFO: renamed from: b */
    public final void m29174b(View view) {
        C21758zs.m219991a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m29175c(View view) {
        if (this.f17010e.m223002d()) {
            if (m29176d().mo29187i(this.f17011f, false)) {
                this.f17010e.m223003e(false, true);
            }
        } else if (m29176d().mo29187i(this.f17011f, true)) {
            this.f17010e.m223003e(true, true);
        }
        m29176d().mo29185f();
    }

    /* JADX INFO: renamed from: d */
    public aml m29176d() {
        return (aml) getContext();
    }

    /* JADX INFO: renamed from: f */
    public void m29177f(Media media, boolean z) {
        this.f17011f = media;
        m29173e(media, this.f17006a);
        xdl0.m208345M0(this.f17007b, media instanceof Video);
        if (z) {
            this.f17010e.m223003e(m29176d().mo29190k().contains(media), false);
        } else {
            xdl0.m208345M0(this.f17009d, false);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        m29176d().mo29189j(view, this.f17011f);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m29174b(this);
        setOnClickListener(this);
        this.f17009d.setOnClickListener(new View.OnClickListener() { // from class: l.ys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199733a.m29175c(view);
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM136799a = ikh0.m136799a(i, i2);
        super.onMeasure(iM136799a, iM136799a);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AccountMediaItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
