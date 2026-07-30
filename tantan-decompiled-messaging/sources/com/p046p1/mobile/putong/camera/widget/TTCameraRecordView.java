package com.p046p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p046p1.mobile.putong.camera.R$string;
import p149l.d6c0;
import p149l.e4m;
import p149l.r4c0;
import p149l.t100;
import p149l.xdl0;
import p149l.zb2;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraRecordView extends CoordinatorLayout implements e4m {

    /* JADX INFO: renamed from: a */
    public TTFullScreenAutoFitSurfaceView f17291a;

    /* JADX INFO: renamed from: b */
    public CircleProgressView f17292b;

    /* JADX INFO: renamed from: c */
    public View f17293c;

    /* JADX INFO: renamed from: d */
    public TextView f17294d;

    /* JADX INFO: renamed from: e */
    public View f17295e;

    /* JADX INFO: renamed from: f */
    public TextView f17296f;

    /* JADX INFO: renamed from: g */
    public TextView f17297g;

    /* JADX INFO: renamed from: h */
    public final String f17298h;

    public TTCameraRecordView(Context context) {
        super(context);
        this.f17298h = "%ds";
        m29879e(context);
    }

    /* JADX INFO: renamed from: e */
    private void m29879e(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f84617f, (ViewGroup) this, true);
        this.f17291a = (TTFullScreenAutoFitSurfaceView) findViewById(r4c0.f157653h);
        TextView textView = (TextView) findViewById(r4c0.f157657l);
        this.f17294d = textView;
        textView.setBackground(zb2.m217814b("#c3ffffff", t100.f167260i));
        this.f17293c = findViewById(r4c0.f157646a);
        this.f17295e = findViewById(r4c0.f157651f);
        this.f17292b = (CircleProgressView) findViewById(r4c0.f157649d);
        this.f17296f = (TextView) findViewById(r4c0.f157664s);
        this.f17297g = (TextView) findViewById(r4c0.f157647b);
    }

    @Override // p149l.e4m
    /* JADX INFO: renamed from: a */
    public void mo29880a(long j) {
        if (j > 0) {
            this.f17296f.setText(String.format("%ds", 0));
            this.f17292b.m29858d(100, j * 1000);
        }
        xdl0.m208345M0(this.f17296f, true);
        this.f17297g.setText(R$string.f17209b);
    }

    @Override // p149l.e4m
    /* JADX INFO: renamed from: b */
    public void mo29881b(boolean z) {
        xdl0.m208345M0(this.f17292b, z);
        xdl0.m208345M0(this.f17297g, z);
    }

    @Override // p149l.e4m
    /* JADX INFO: renamed from: c */
    public void mo29882c() {
        xdl0.m208345M0(this.f17296f, false);
        this.f17297g.setText(R$string.f17210c);
        this.f17292b.setProgress(0);
    }

    @Override // p149l.e4m
    /* JADX INFO: renamed from: d */
    public void mo29883d(long j, long j2) {
        this.f17296f.setText(String.format("%ds", Long.valueOf(j)));
    }

    @Override // p149l.e4m
    public View getCloseButton() {
        return this.f17293c;
    }

    @Override // p149l.e4m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f17291a;
    }

    @Override // p149l.e4m
    public View getRecordButton() {
        return this.f17292b;
    }

    @Override // p149l.e4m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f17295e;
    }

    @Override // p149l.e4m
    /* JADX INFO: renamed from: p */
    public View mo29884p() {
        return this;
    }

    @Override // p149l.e4m
    public void release() {
        this.f17292b.m29856b();
    }

    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f17294d.setText(str);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17298h = "%ds";
        m29879e(context);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17298h = "%ds";
        m29879e(context);
    }
}
