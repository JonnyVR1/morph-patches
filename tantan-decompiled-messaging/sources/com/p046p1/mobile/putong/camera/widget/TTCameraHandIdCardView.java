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
import p149l.d4m;
import p149l.d6c0;
import p149l.l95;
import p149l.r4c0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraHandIdCardView extends ConstraintLayout implements d4m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f17278d;

    /* JADX INFO: renamed from: e */
    public View f17279e;

    /* JADX INFO: renamed from: f */
    public View f17280f;

    /* JADX INFO: renamed from: g */
    public View f17281g;

    /* JADX INFO: renamed from: h */
    public TextView f17282h;

    /* JADX INFO: renamed from: i */
    public View f17283i;

    public TTCameraHandIdCardView(Context context) {
        super(context);
        m29863h0(context);
    }

    /* JADX INFO: renamed from: h0 */
    private void m29863h0(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f84614c, (ViewGroup) this, true);
        this.f17278d = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f157653h);
        this.f17279e = findViewById(r4c0.f157652g);
        this.f17280f = findViewById(r4c0.f157646a);
        this.f17281g = findViewById(r4c0.f157651f);
        this.f17282h = (TextView) findViewById(r4c0.f157657l);
        this.f17283i = findViewById(r4c0.f157654i);
    }

    @Override // p149l.d4m
    /* JADX INFO: renamed from: c */
    public l95 mo29860c() {
        return l95.m148999a(this.f17278d, this.f17283i);
    }

    public View getCaptureContentAreaView() {
        return this;
    }

    @Override // p149l.d4m
    public View getCloseButton() {
        return this.f17280f;
    }

    @Override // p149l.d4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f17278d;
    }

    @Override // p149l.d4m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f17281g;
    }

    @Override // p149l.d4m
    public View getTakePictureButton() {
        return this.f17279e;
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
        this.f17282h.setText(str);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m29863h0(context);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m29863h0(context);
    }
}
