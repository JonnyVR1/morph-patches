package com.p000p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import l.ftd0;
import l.qib0;
import l.t100;
import l.xdl0;
import p007l.f3c0;
import p007l.na4;
import p007l.p84;
import v.VDraweeView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class CameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RecordButton f1023a;

    /* JADX INFO: renamed from: b */
    public VFrame f1024b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f1025c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f1026d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f1027e;

    /* JADX INFO: renamed from: f */
    public p84 f1028f;

    public CameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m2385d(View view) {
        na4.m12130a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m2386e() {
        m2391j();
    }

    /* JADX INFO: renamed from: f */
    public void m2387f(Media media) {
        CameraMenuView cameraMenuView = this.f1027e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(f3c0.f7884q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(f3c0.f7892r0);
        VDraweeView draweeView = this.f1027e.getDraweeView();
        draweeView.getHierarchy().H(new RoundingParams().v(false).s(xdl0.w(6.0f)));
        draweeView.getHierarchy().w(ftd0.h);
        draweeView.getLayoutParams();
        int iD = t100.d(3.0f);
        draweeView.setPadding(iD, iD, iD, iD);
        qib0.G.m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2388g(View view) {
        if (NullChecker.a(this.f1028f)) {
            this.f1028f.mo12941i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m2389h(View view) {
        if (!NullChecker.a(this.f1028f) || this.f1028f.mo12942p()) {
            return;
        }
        this.f1028f.onStateChanged(3);
        this.f1028f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m2390i(View view) {
        if (NullChecker.a(this.f1028f)) {
            this.f1028f.mo12943v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2391j() {
        this.f1025c.setOnClickListener(new View.OnClickListener() { // from class: l.ka4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9653a.m2388g(view);
            }
        });
        this.f1023a.setOnClickListener(new View.OnClickListener() { // from class: l.la4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9971a.m2389h(view);
            }
        });
        this.f1027e.setOnClickListener(new View.OnClickListener() { // from class: l.ma4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10369a.m2390i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m2392k(boolean z) {
        xdl0.M(this.f1026d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2385d(this);
        m2386e();
    }

    public void setCallback(p84 p84Var) {
        this.f1028f = p84Var;
    }

    public void setEnable(boolean z) {
        this.f1023a.setEnabled(z);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
