package com.p051p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p153l.iec0;
import p153l.ma5;
import p153l.t6m;
import p153l.xcc0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraHandIdCardView extends ConstraintLayout implements t6m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f17997d;

    /* JADX INFO: renamed from: e */
    public View f17998e;

    /* JADX INFO: renamed from: f */
    public View f17999f;

    /* JADX INFO: renamed from: g */
    public View f18000g;

    /* JADX INFO: renamed from: h */
    public TextView f18001h;

    /* JADX INFO: renamed from: i */
    public View f18002i;

    public TTCameraHandIdCardView(Context context) {
        super(context);
        m30861h0(context);
    }

    /* JADX INFO: renamed from: h0 */
    private void m30861h0(Context context) {
        LayoutInflater.from(context).inflate(iec0.f114570c, (ViewGroup) this, true);
        this.f17997d = (TTFullScreenAutoFitSurfaceView) findViewById(xcc0.f193295h);
        this.f17998e = findViewById(xcc0.f193294g);
        this.f17999f = findViewById(xcc0.f193288a);
        this.f18000g = findViewById(xcc0.f193293f);
        this.f18001h = (TextView) findViewById(xcc0.f193299l);
        this.f18002i = findViewById(xcc0.f193296i);
    }

    @Override // p153l.t6m
    /* JADX INFO: renamed from: c */
    public ma5 mo30858c() {
        return ma5.m157634a(this.f17997d, this.f18002i);
    }

    public View getCaptureContentAreaView() {
        return this;
    }

    @Override // p153l.t6m
    public View getCloseButton() {
        return this.f17999f;
    }

    @Override // p153l.t6m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f17997d;
    }

    @Override // p153l.t6m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f18000g;
    }

    @Override // p153l.t6m
    public View getTakePictureButton() {
        return this.f17998e;
    }

    @Override // p153l.t6m
    /* JADX INFO: renamed from: q */
    public View mo30860q() {
        return this;
    }

    @Override // p153l.t6m
    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18001h.setText(str);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30861h0(context);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30861h0(context);
    }
}
