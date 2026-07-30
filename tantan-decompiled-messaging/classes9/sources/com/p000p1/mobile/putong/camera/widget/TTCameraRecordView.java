package com.p000p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p000p1.mobile.putong.camera.R$string;
import l.t100;
import l.xdl0;
import l.zb2;
import p006l.d6c0;
import p006l.e4m;
import p006l.r4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraRecordView extends CoordinatorLayout implements e4m {

    /* JADX INFO: renamed from: a */
    public TTFullScreenAutoFitSurfaceView f1280a;

    /* JADX INFO: renamed from: b */
    public CircleProgressView f1281b;

    /* JADX INFO: renamed from: c */
    public View f1282c;

    /* JADX INFO: renamed from: d */
    public TextView f1283d;

    /* JADX INFO: renamed from: e */
    public View f1284e;

    /* JADX INFO: renamed from: f */
    public TextView f1285f;

    /* JADX INFO: renamed from: g */
    public TextView f1286g;

    /* JADX INFO: renamed from: h */
    public final String f1287h;

    public TTCameraRecordView(Context context) {
        super(context);
        this.f1287h = "%ds";
        m1791e(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    private void m1791e(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f10032f, (ViewGroup) this, true);
        this.f1280a = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f20298h);
        TextView textView = (TextView) findViewById(r4c0.f20302l);
        this.f1283d = textView;
        textView.setBackground(zb2.b("#c3ffffff", t100.i));
        this.f1282c = findViewById(r4c0.f20291a);
        this.f1284e = findViewById(r4c0.f20296f);
        this.f1281b = (CircleProgressView) findViewById(r4c0.f20294d);
        this.f1285f = (TextView) findViewById(r4c0.f20309s);
        this.f1286g = (TextView) findViewById(r4c0.f20292b);
    }

    @Override // p006l.e4m
    /* JADX INFO: renamed from: a */
    public void mo1792a(long j) {
        if (j > 0) {
            this.f1285f.setText(String.format("%ds", 0));
            this.f1281b.m1770d(100, j * 1000);
        }
        xdl0.M0(this.f1285f, true);
        this.f1286g.setText(R$string.f1198b);
    }

    @Override // p006l.e4m
    /* JADX INFO: renamed from: b */
    public void mo1793b(boolean z) {
        xdl0.M0(this.f1281b, z);
        xdl0.M0(this.f1286g, z);
    }

    @Override // p006l.e4m
    /* JADX INFO: renamed from: c */
    public void mo1794c() {
        xdl0.M0(this.f1285f, false);
        this.f1286g.setText(R$string.f1199c);
        this.f1281b.setProgress(0);
    }

    @Override // p006l.e4m
    /* JADX INFO: renamed from: d */
    public void mo1795d(long j, long j2) {
        this.f1285f.setText(String.format("%ds", Long.valueOf(j)));
    }

    @Override // p006l.e4m
    public View getCloseButton() {
        return this.f1282c;
    }

    @Override // p006l.e4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f1280a;
    }

    @Override // p006l.e4m
    public View getRecordButton() {
        return this.f1281b;
    }

    @Override // p006l.e4m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f1284e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p006l.e4m
    /* JADX INFO: renamed from: p */
    public View mo1796p() {
        return this;
    }

    @Override // p006l.e4m
    public void release() {
        this.f1281b.m1768b();
    }

    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f1283d.setText(str);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1287h = "%ds";
        m1791e(context);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1287h = "%ds";
        m1791e(context);
    }
}
