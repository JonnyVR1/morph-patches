package com.p046p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.f3c0;
import p149l.ftd0;
import p149l.na4;
import p149l.p84;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class CameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RecordButton f39562a;

    /* JADX INFO: renamed from: b */
    public VFrame f39563b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f39564c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f39565d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f39566e;

    /* JADX INFO: renamed from: f */
    public p84 f39567f;

    public CameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m61435d(View view) {
        na4.m158579a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m61436e() {
        m61441j();
    }

    /* JADX INFO: renamed from: f */
    public void m61437f(Media media) {
        CameraMenuView cameraMenuView = this.f39566e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(f3c0.f94601q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(f3c0.f94609r0);
        VDraweeView draweeView = this.f39566e.getDraweeView();
        draweeView.getHierarchy().m112053H(new RoundingParams().m8268v(false).m8265s(xdl0.m208407w(6.0f)));
        draweeView.getHierarchy().m112076w(ftd0.f99184h);
        draweeView.getLayoutParams();
        int iM186890d = t100.m186890d(3.0f);
        draweeView.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        qib0.f154691G.m102367m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m61438g(View view) {
        if (NullChecker.m81303a(this.f39567f)) {
            this.f39567f.mo167787i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m61439h(View view) {
        if (!NullChecker.m81303a(this.f39567f) || this.f39567f.mo167788p()) {
            return;
        }
        this.f39567f.onStateChanged(3);
        this.f39567f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m61440i(View view) {
        if (NullChecker.m81303a(this.f39567f)) {
            this.f39567f.mo167789v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m61441j() {
        this.f39564c.setOnClickListener(new View.OnClickListener() { // from class: l.ka4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122094a.m61438g(view);
            }
        });
        this.f39562a.setOnClickListener(new View.OnClickListener() { // from class: l.la4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127165a.m61439h(view);
            }
        });
        this.f39566e.setOnClickListener(new View.OnClickListener() { // from class: l.ma4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f132831a.m61440i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m61442k(boolean z) {
        xdl0.m208344M(this.f39565d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m61435d(this);
        m61436e();
    }

    public void setCallback(p84 p84Var) {
        this.f39567f = p84Var;
    }

    public void setEnable(boolean z) {
        this.f39562a.setEnabled(z);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
