package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.ftd0;
import l.t100;
import l.xdl0;
import p006l.C1440xi;
import p006l.InterfaceC0508ai;
import p006l.qib0;
import p006l.v2c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f761a;

    /* JADX INFO: renamed from: b */
    public VFrame f762b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f763c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f764d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f765e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0508ai f766f;

    public AccountCameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m839d(View view) {
        C1440xi.m27265a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m840e() {
        m845j();
    }

    /* JADX INFO: renamed from: f */
    public void m841f(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f765e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(v2c0.f24001U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(v2c0.f24004V);
        SimpleDraweeView draweeView = this.f765e.getDraweeView();
        draweeView.getHierarchy().H(new RoundingParams().v(false).s(xdl0.w(6.0f)));
        draweeView.getHierarchy().w(ftd0.h);
        draweeView.getLayoutParams();
        int iD = t100.d(3.0f);
        draweeView.setPadding(iD, iD, iD, iD);
        qib0.f19782G.m12780m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m842g(View view) {
        if (NullChecker.a(this.f766f)) {
            this.f766f.mo11853i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m843h(View view) {
        if (!NullChecker.a(this.f766f) || this.f766f.mo11854p()) {
            return;
        }
        this.f766f.onStateChanged(3);
        this.f766f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m844i(View view) {
        if (NullChecker.a(this.f766f)) {
            this.f766f.mo11855v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m845j() {
        this.f763c.setOnClickListener(new View.OnClickListener() { // from class: l.ui
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23549a.m842g(view);
            }
        });
        this.f761a.setOnClickListener(new View.OnClickListener() { // from class: l.vi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24330a.m843h(view);
            }
        });
        this.f765e.setOnClickListener(new View.OnClickListener() { // from class: l.wi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25159a.m844i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m846k(boolean z) {
        xdl0.M(this.f764d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m839d(this);
        m840e();
    }

    public void setCallback(InterfaceC0508ai interfaceC0508ai) {
        this.f766f = interfaceC0508ai;
    }

    public void setEnable(boolean z) {
        this.f761a.setEnabled(z);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
