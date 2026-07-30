package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.C21154xi;
import p149l.InterfaceC15629ai;
import p149l.ftd0;
import p149l.qib0;
import p149l.t100;
import p149l.v2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraPhotoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f16772a;

    /* JADX INFO: renamed from: b */
    public VFrame f16773b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f16774c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f16775d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f16776e;

    /* JADX INFO: renamed from: f */
    public InterfaceC15629ai f16777f;

    public AccountCameraPhotoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: d */
    public final void m28933d(View view) {
        C21154xi.m208909a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m28934e() {
        m28939j();
    }

    /* JADX INFO: renamed from: f */
    public void m28935f(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f16776e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(v2c0.f179437U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(v2c0.f179440V);
        VDraweeView draweeView = this.f16776e.getDraweeView();
        draweeView.getHierarchy().m112053H(new RoundingParams().m8268v(false).m8265s(xdl0.m208407w(6.0f)));
        draweeView.getHierarchy().m112076w(ftd0.f99184h);
        draweeView.getLayoutParams();
        int iM186890d = t100.m186890d(3.0f);
        draweeView.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        qib0.f154691G.m102367m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m28936g(View view) {
        if (NullChecker.m81303a(this.f16777f)) {
            this.f16777f.mo96768i(view);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m28937h(View view) {
        if (!NullChecker.m81303a(this.f16777f) || this.f16777f.mo96769p()) {
            return;
        }
        this.f16777f.onStateChanged(3);
        this.f16777f.onStateChanged(2);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m28938i(View view) {
        if (NullChecker.m81303a(this.f16777f)) {
            this.f16777f.mo96770v(view);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m28939j() {
        this.f16774c.setOnClickListener(new View.OnClickListener() { // from class: l.ui
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176609a.m28936g(view);
            }
        });
        this.f16772a.setOnClickListener(new View.OnClickListener() { // from class: l.vi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181544a.m28937h(view);
            }
        });
        this.f16776e.setOnClickListener(new View.OnClickListener() { // from class: l.wi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186484a.m28938i(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m28940k(boolean z) {
        xdl0.m208344M(this.f16775d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28933d(this);
        m28934e();
    }

    public void setCallback(InterfaceC15629ai interfaceC15629ai) {
        this.f16777f = interfaceC15629ai;
    }

    public void setEnable(boolean z) {
        this.f16772a.setEnabled(z);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraPhotoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
