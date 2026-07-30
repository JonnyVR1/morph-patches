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
import l.mep0;
import l.t100;
import l.xdl0;
import p006l.d4m;
import p006l.d6c0;
import p006l.l95;
import p006l.r4c0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraAvatarAndEmblemView extends ConstraintLayout implements d4m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f1260d;

    /* JADX INFO: renamed from: e */
    public View f1261e;

    /* JADX INFO: renamed from: f */
    public View f1262f;

    /* JADX INFO: renamed from: g */
    public View f1263g;

    /* JADX INFO: renamed from: h */
    public VImage f1264h;

    /* JADX INFO: renamed from: i */
    public VImage f1265i;

    /* JADX INFO: renamed from: j */
    public TextView f1266j;

    public TTCameraAvatarAndEmblemView(Context context) {
        super(context);
        m1771h0(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    private void m1771h0(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f10028b, (ViewGroup) this, true);
        this.f1260d = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f20298h);
        this.f1261e = findViewById(r4c0.f20297g);
        this.f1262f = findViewById(r4c0.f20291a);
        View viewFindViewById = findViewById(r4c0.f20306p);
        this.f1263g = viewFindViewById;
        mep0.d1(viewFindViewById, t100.i);
        this.f1264h = findViewById(r4c0.f20303m);
        this.f1265i = findViewById(r4c0.f20305o);
        this.f1266j = (TextView) findViewById(r4c0.f20302l);
    }

    @Override // p006l.d4m
    /* JADX INFO: renamed from: c */
    public l95 mo1772c() {
        return l95.m18605a(this.f1260d, this.f1263g);
    }

    @Nullable
    public View getCaptureContentAreaView() {
        return this.f1263g;
    }

    @Override // p006l.d4m
    public View getCloseButton() {
        return this.f1262f;
    }

    @Override // p006l.d4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f1260d;
    }

    @Override // p006l.d4m
    @Nullable
    public View getSwitchCameraButton() {
        return null;
    }

    @Override // p006l.d4m
    public View getTakePictureButton() {
        return this.f1261e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m1773i0(boolean z) {
        xdl0.M0(this.f1264h, z);
        xdl0.M0(this.f1265i, !z);
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
        this.f1266j.setText(str);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1771h0(context);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1771h0(context);
    }
}
