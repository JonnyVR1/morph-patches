package com.p000p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p006l.d4m;
import p006l.d6c0;
import p006l.l95;
import p006l.r4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraHandIdCardView extends ConstraintLayout implements d4m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f1267d;

    /* JADX INFO: renamed from: e */
    public View f1268e;

    /* JADX INFO: renamed from: f */
    public View f1269f;

    /* JADX INFO: renamed from: g */
    public View f1270g;

    /* JADX INFO: renamed from: h */
    public TextView f1271h;

    /* JADX INFO: renamed from: i */
    public View f1272i;

    public TTCameraHandIdCardView(Context context) {
        super(context);
        m1775h0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    private void m1775h0(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f10029c, (ViewGroup) this, true);
        this.f1267d = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f20298h);
        this.f1268e = findViewById(r4c0.f20297g);
        this.f1269f = findViewById(r4c0.f20291a);
        this.f1270g = findViewById(r4c0.f20296f);
        this.f1271h = (TextView) findViewById(r4c0.f20302l);
        this.f1272i = findViewById(r4c0.f20299i);
    }

    @Override // p006l.d4m
    /* JADX INFO: renamed from: c */
    public l95 mo1772c() {
        return l95.m18605a(this.f1267d, this.f1272i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View getCaptureContentAreaView() {
        return this;
    }

    @Override // p006l.d4m
    public View getCloseButton() {
        return this.f1269f;
    }

    @Override // p006l.d4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f1267d;
    }

    @Override // p006l.d4m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f1270g;
    }

    @Override // p006l.d4m
    public View getTakePictureButton() {
        return this.f1268e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.d4m
    /* JADX INFO: renamed from: p */
    public View mo1774p() {
        return this;
    }

    @Override // p006l.d4m
    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f1271h.setText(str);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1775h0(context);
    }

    public TTCameraHandIdCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1775h0(context);
    }
}
