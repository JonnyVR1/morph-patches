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
import p151v.VImage;
import p153l.bnl0;
import p153l.iec0;
import p153l.ma5;
import p153l.qa00;
import p153l.qnp0;
import p153l.t6m;
import p153l.xcc0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraAvatarAndEmblemView extends ConstraintLayout implements t6m {

    /* JADX INFO: renamed from: d */
    public TTFullScreenAutoFitSurfaceView f17990d;

    /* JADX INFO: renamed from: e */
    public View f17991e;

    /* JADX INFO: renamed from: f */
    public View f17992f;

    /* JADX INFO: renamed from: g */
    public View f17993g;

    /* JADX INFO: renamed from: h */
    public VImage f17994h;

    /* JADX INFO: renamed from: i */
    public VImage f17995i;

    /* JADX INFO: renamed from: j */
    public TextView f17996j;

    public TTCameraAvatarAndEmblemView(Context context) {
        super(context);
        m30857h0(context);
    }

    /* JADX INFO: renamed from: h0 */
    private void m30857h0(Context context) {
        LayoutInflater.from(context).inflate(iec0.f114569b, (ViewGroup) this, true);
        this.f17990d = (TTFullScreenAutoFitSurfaceView) findViewById(xcc0.f193295h);
        this.f17991e = findViewById(xcc0.f193294g);
        this.f17992f = findViewById(xcc0.f193288a);
        View viewFindViewById = findViewById(xcc0.f193303p);
        this.f17993g = viewFindViewById;
        qnp0.m177261d1(viewFindViewById, qa00.f156322i);
        this.f17994h = (VImage) findViewById(xcc0.f193300m);
        this.f17995i = (VImage) findViewById(xcc0.f193302o);
        this.f17996j = (TextView) findViewById(xcc0.f193299l);
    }

    @Override // p153l.t6m
    /* JADX INFO: renamed from: c */
    public ma5 mo30858c() {
        return ma5.m157634a(this.f17990d, this.f17993g);
    }

    @Nullable
    public View getCaptureContentAreaView() {
        return this.f17993g;
    }

    @Override // p153l.t6m
    public View getCloseButton() {
        return this.f17992f;
    }

    @Override // p153l.t6m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f17990d;
    }

    @Override // p153l.t6m
    @Nullable
    public View getSwitchCameraButton() {
        return null;
    }

    @Override // p153l.t6m
    public View getTakePictureButton() {
        return this.f17991e;
    }

    /* JADX INFO: renamed from: i0 */
    public void m30859i0(boolean z) {
        bnl0.m105525M0(this.f17994h, z);
        bnl0.m105525M0(this.f17995i, !z);
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
        this.f17996j.setText(str);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30857h0(context);
    }

    public TTCameraAvatarAndEmblemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30857h0(context);
    }
}
