package com.p046p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p149l.d4m;
import p149l.d6c0;
import p149l.l95;
import p149l.mep0;
import p149l.r4c0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraAvatarAndEmblemView extends ConstraintLayout implements d4m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f17271d;

    /* JADX INFO: renamed from: e */
    public View f17272e;

    /* JADX INFO: renamed from: f */
    public View f17273f;

    /* JADX INFO: renamed from: g */
    public View f17274g;

    /* JADX INFO: renamed from: h */
    public VImage f17275h;

    /* JADX INFO: renamed from: i */
    public VImage f17276i;

    /* JADX INFO: renamed from: j */
    public TextView f17277j;

    public TTCameraAvatarAndEmblemView(Context context) {
        super(context);
        m29859h0(context);
    }

    /* JADX INFO: renamed from: h0 */
    private void m29859h0(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f84613b, (ViewGroup) this, true);
        this.f17271d = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f157653h);
        this.f17272e = findViewById(r4c0.f157652g);
        this.f17273f = findViewById(r4c0.f157646a);
        View viewFindViewById = findViewById(r4c0.f157661p);
        this.f17274g = viewFindViewById;
        mep0.m154302d1(viewFindViewById, t100.f167260i);
        this.f17275h = (VImage) findViewById(r4c0.f157658m);
        this.f17276i = (VImage) findViewById(r4c0.f157660o);
        this.f17277j = (TextView) findViewById(r4c0.f157657l);
    }

    @Override // p149l.d4m
    /* JADX INFO: renamed from: c */
    public l95 mo29860c() {
        return l95.m148999a(this.f17271d, this.f17274g);
    }

    @Nullable
    public View getCaptureContentAreaView() {
        return this.f17274g;
    }

    @Override // p149l.d4m
    public View getCloseButton() {
        return this.f17273f;
    }

    @Override // p149l.d4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f17271d;
    }

    @Override // p149l.d4m
    @Nullable
    public View getSwitchCameraButton() {
        return null;
    }

    @Override // p149l.d4m
    public View getTakePictureButton() {
        return this.f17272e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m29861i0(boolean z) {
        xdl0.m208345M0(this.f17275h, z);
        xdl0.m208345M0(this.f17276i, !z);
    }

    @Override // p149l.d4m
    /* JADX INFO: renamed from: p */
    public View mo29862p() {
        return this;
    }

    @Override // p149l.d4m
    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17277j.setText(str);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29859h0(context);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29859h0(context);
    }
}
