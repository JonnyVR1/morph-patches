package com.p051p1.mobile.putong.camera.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p051p1.mobile.putong.camera.R$string;
import p153l.bnl0;
import p153l.gc2;
import p153l.iec0;
import p153l.qa00;
import p153l.u6m;
import p153l.xcc0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraRecordView extends CoordinatorLayout implements u6m {

    /* JADX INFO: renamed from: a */
    public TTFullScreenAutoFitSurfaceView f18010a;

    /* JADX INFO: renamed from: b */
    public CircleProgressView f18011b;

    /* JADX INFO: renamed from: c */
    public View f18012c;

    /* JADX INFO: renamed from: d */
    public TextView f18013d;

    /* JADX INFO: renamed from: e */
    public View f18014e;

    /* JADX INFO: renamed from: f */
    public TextView f18015f;

    /* JADX INFO: renamed from: g */
    public TextView f18016g;

    /* JADX INFO: renamed from: h */
    public final String f18017h;

    public TTCameraRecordView(Context context) {
        super(context);
        this.f18017h = "%ds";
        m30877e(context);
    }

    /* JADX INFO: renamed from: e */
    private void m30877e(Context context) {
        LayoutInflater.from(context).inflate(iec0.f114573f, (ViewGroup) this, true);
        this.f18010a = (TTFullScreenAutoFitSurfaceView) findViewById(xcc0.f193295h);
        TextView textView = (TextView) findViewById(xcc0.f193299l);
        this.f18013d = textView;
        textView.setBackground(gc2.m129823b("#c3ffffff", qa00.f156322i));
        this.f18012c = findViewById(xcc0.f193288a);
        this.f18014e = findViewById(xcc0.f193293f);
        this.f18011b = (CircleProgressView) findViewById(xcc0.f193291d);
        this.f18015f = (TextView) findViewById(xcc0.f193306s);
        this.f18016g = (TextView) findViewById(xcc0.f193289b);
    }

    @Override // p153l.u6m
    /* JADX INFO: renamed from: a */
    public void mo30878a(long j) {
        if (j > 0) {
            this.f18015f.setText(String.format("%ds", 0));
            this.f18011b.m30856d(100, j * 1000);
        }
        bnl0.m105525M0(this.f18015f, true);
        this.f18016g.setText(R$string.f17928b);
    }

    @Override // p153l.u6m
    /* JADX INFO: renamed from: b */
    public void mo30879b(boolean z) {
        bnl0.m105525M0(this.f18011b, z);
        bnl0.m105525M0(this.f18016g, z);
    }

    @Override // p153l.u6m
    /* JADX INFO: renamed from: c */
    public void mo30880c() {
        bnl0.m105525M0(this.f18015f, false);
        this.f18016g.setText(R$string.f17929c);
        this.f18011b.setProgress(0);
    }

    @Override // p153l.u6m
    /* JADX INFO: renamed from: d */
    public void mo30881d(long j, long j2) {
        this.f18015f.setText(String.format("%ds", Long.valueOf(j)));
    }

    @Override // p153l.u6m
    public View getCloseButton() {
        return this.f18012c;
    }

    @Override // p153l.u6m
    public TTFullScreenAutoFitSurfaceView getPreviewSurface() {
        return this.f18010a;
    }

    @Override // p153l.u6m
    public View getRecordButton() {
        return this.f18011b;
    }

    @Override // p153l.u6m
    @Nullable
    public View getSwitchCameraButton() {
        return this.f18014e;
    }

    @Override // p153l.u6m
    /* JADX INFO: renamed from: q */
    public View mo30882q() {
        return this;
    }

    @Override // p153l.u6m
    public void release() {
        this.f18011b.m30854b();
    }

    public void setDescriptionText(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f18013d.setText(str);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18017h = "%ds";
        m30877e(context);
    }

    public TTCameraRecordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18017h = "%ds";
        m30877e(context);
    }
}
