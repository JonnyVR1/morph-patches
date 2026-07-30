package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import l.ftd0;
import l.t100;
import l.xdl0;
import p006l.C0510ak;
import p006l.InterfaceC0508ai;
import p006l.qib0;
import p006l.v2c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountCameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f767a;

    /* JADX INFO: renamed from: b */
    public VFrame f768b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f769c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f770d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f771e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f772f;

    /* JADX INFO: renamed from: g */
    public ImageView f773g;

    /* JADX INFO: renamed from: h */
    public ImageView f774h;

    /* JADX INFO: renamed from: i */
    public int f775i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0508ai f776j;

    /* JADX INFO: renamed from: k */
    public boolean f777k;

    public AccountCameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m852f(View view) {
        C0510ak.m11875a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m853g() {
        int i = this.f775i;
        if (i != 2) {
            if (i == 4) {
                this.f775i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f775i = 4;
    }

    /* JADX INFO: renamed from: h */
    public final void m854h() {
        m864r();
        this.f775i = 1;
    }

    /* JADX INFO: renamed from: i */
    public void m855i() {
        this.f775i = 2;
    }

    /* JADX INFO: renamed from: j */
    public void m856j(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f771e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(v2c0.f24001U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(v2c0.f24004V);
        SimpleDraweeView draweeView = this.f771e.getDraweeView();
        draweeView.getHierarchy().H(new RoundingParams().v(false).s(xdl0.w(5.0f)));
        draweeView.getHierarchy().w(ftd0.h);
        int iD = t100.d(3.0f);
        draweeView.setPadding(iD, iD, iD, iD);
        qib0.f19782G.m12780m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m857k(View view) {
        if (NullChecker.a(this.f776j)) {
            this.f776j.mo11853i(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m858l(View view) {
        if (NullChecker.a(this.f776j)) {
            this.f776j.mo11855v(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m859m(View view) {
        if (NullChecker.a(this.f776j)) {
            this.f776j.mo11852f(view);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m860n(View view) {
        if (this.f775i == 1) {
            return;
        }
        if (NullChecker.a(this.f776j) && this.f776j.mo11854p()) {
            return;
        }
        m866t();
        m853g();
        m862p();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m861o(View view) {
        this.f775i = 6;
        m862p();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m852f(this);
        m854h();
    }

    /* JADX INFO: renamed from: p */
    public final void m862p() {
        if (NullChecker.a(this.f776j)) {
            this.f776j.onStateChanged(this.f775i);
        }
        int i = this.f775i;
        if (i == 2) {
            this.f768b.setVisibility(0);
            this.f771e.setVisibility(0);
            this.f772f.setVisibility(8);
            this.f767a.setState(1);
            return;
        }
        if (i == 4) {
            this.f768b.setVisibility(8);
            this.f771e.setVisibility(8);
            this.f772f.setVisibility(8);
            this.f767a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f768b.setVisibility(0);
        this.f771e.setVisibility(8);
        this.f772f.setVisibility(0);
        this.f767a.setState(1);
    }

    /* JADX INFO: renamed from: q */
    public void m863q() {
        this.f775i = 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m864r() {
        this.f769c.setOnClickListener(new View.OnClickListener() { // from class: l.vj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f24342a.m857k(view);
            }
        });
        xdl0.E0(this.f771e, new View.OnClickListener() { // from class: l.wj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25176a.m858l(view);
            }
        });
        this.f773g.setOnClickListener(new View.OnClickListener() { // from class: l.xj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27543a.m859m(view);
            }
        });
        this.f767a.setOnClickListener(new View.OnClickListener() { // from class: l.yj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28247a.m860n(view);
            }
        });
        this.f774h.setOnClickListener(new View.OnClickListener() { // from class: l.zj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f28771a.m861o(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m865s(boolean z) {
        xdl0.M(this.f770d, z);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f767a.setActivated(z);
    }

    public void setCallback(InterfaceC0508ai interfaceC0508ai) {
        this.f776j = interfaceC0508ai;
    }

    public void setState(int i) {
        this.f775i = i;
        m862p();
    }

    /* JADX INFO: renamed from: t */
    public final void m866t() {
        if (this.f777k) {
            return;
        }
        this.f777k = true;
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
