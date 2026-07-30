package com.p051p1.mobile.putong.feed.newui.camera.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.feed.newui.photoalbum.redpointview.FeedRedDotView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p153l.bnl0;
import p153l.h1e0;
import p153l.lbc0;
import p153l.mb4;
import p153l.o94;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class CameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public RecordButton f40410a;

    /* JADX INFO: renamed from: b */
    public VFrame f40411b;

    /* JADX INFO: renamed from: c */
    public CameraMenuView f40412c;

    /* JADX INFO: renamed from: d */
    public FeedRedDotView f40413d;

    /* JADX INFO: renamed from: e */
    public CameraMenuView f40414e;

    /* JADX INFO: renamed from: f */
    public o94 f40415f;

    public CameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m62619d(View view) {
        mb4.m157766a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m62620e() {
        m62625j();
    }

    /* JADX INFO: renamed from: f */
    public void m62621f(Media media) {
        CameraMenuView cameraMenuView = this.f40414e;
        if (media == null) {
            cameraMenuView.getDraweeLayout().setBackgroundResource(lbc0.f131119q0);
            return;
        }
        cameraMenuView.getDraweeView().setBackgroundResource(lbc0.f131127r0);
        VDraweeView draweeView = this.f40414e.getDraweeView();
        draweeView.getHierarchy().m207045H(new RoundingParams().m8322v(false).m8319s(bnl0.m105587w(6.0f)));
        draweeView.getHierarchy().m207062w(h1e0.f107451h);
        draweeView.getLayoutParams();
        int iM175859d = qa00.m175859d(3.0f);
        draweeView.setPadding(iM175859d, iM175859d, iM175859d, iM175859d);
        uqb0.f180374G.m127150m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m62622g(View view) {
        if (NullChecker.m82486a(this.f40415f)) {
            this.f40415f.mo166673i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m62623h(View view) {
        if (!NullChecker.m82486a(this.f40415f) || this.f40415f.mo166674p()) {
            return;
        }
        this.f40415f.onStateChanged(3);
        this.f40415f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m62624i(View view) {
        if (NullChecker.m82486a(this.f40415f)) {
            this.f40415f.mo166675v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m62625j() {
        this.f40412c.setOnClickListener(new View.OnClickListener() { // from class: l.jb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119126a.m62622g(view);
            }
        });
        this.f40410a.setOnClickListener(new View.OnClickListener() { // from class: l.kb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124751a.m62623h(view);
            }
        });
        this.f40414e.setOnClickListener(new View.OnClickListener() { // from class: l.lb4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130770a.m62624i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m62626k(boolean z) {
        bnl0.m105524M(this.f40413d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m62619d(this);
        m62620e();
    }

    public void setCallback(o94 o94Var) {
        this.f40415f = o94Var;
    }

    public void setEnable(boolean z) {
        this.f40410a.setEnabled(z);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
