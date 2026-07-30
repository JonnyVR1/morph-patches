package com.p046p1.mobile.putong.account.p050ui.camera.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p149l.C15643ak;
import p149l.InterfaceC15629ai;
import p149l.ftd0;
import p149l.qib0;
import p149l.t100;
import p149l.v2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class AccountCameraVideoControlView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public AccountRecordButton f16778a;

    /* JADX INFO: renamed from: b */
    public VFrame f16779b;

    /* JADX INFO: renamed from: c */
    public AccountCameraMenuView f16780c;

    /* JADX INFO: renamed from: d */
    public AccountRedDotView f16781d;

    /* JADX INFO: renamed from: e */
    public AccountCameraMenuView f16782e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f16783f;

    /* JADX INFO: renamed from: g */
    public ImageView f16784g;

    /* JADX INFO: renamed from: h */
    public ImageView f16785h;

    /* JADX INFO: renamed from: i */
    public int f16786i;

    /* JADX INFO: renamed from: j */
    public InterfaceC15629ai f16787j;

    /* JADX INFO: renamed from: k */
    public boolean f16788k;

    public AccountCameraVideoControlView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m28946f(View view) {
        C15643ak.m97094a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m28947g() {
        int i = this.f16786i;
        if (i != 2) {
            if (i == 4) {
                this.f16786i = 5;
                return;
            } else if (i != 5) {
                return;
            }
        }
        this.f16786i = 4;
    }

    /* JADX INFO: renamed from: h */
    public final void m28948h() {
        m28958r();
        this.f16786i = 1;
    }

    /* JADX INFO: renamed from: i */
    public void m28949i() {
        this.f16786i = 2;
    }

    /* JADX INFO: renamed from: j */
    public void m28950j(Media media) {
        AccountCameraMenuView accountCameraMenuView = this.f16782e;
        if (media == null) {
            accountCameraMenuView.getDraweeLayout().setBackgroundResource(v2c0.f179437U);
            return;
        }
        accountCameraMenuView.getDraweeView().setBackgroundResource(v2c0.f179440V);
        VDraweeView draweeView = this.f16782e.getDraweeView();
        draweeView.getHierarchy().m112053H(new RoundingParams().m8268v(false).m8265s(xdl0.m208407w(5.0f)));
        draweeView.getHierarchy().m112076w(ftd0.f99184h);
        int iM186890d = t100.m186890d(3.0f);
        draweeView.setPadding(iM186890d, iM186890d, iM186890d, iM186890d);
        qib0.f154691G.m102367m0(draweeView, media.url);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m28951k(View view) {
        if (NullChecker.m81303a(this.f16787j)) {
            this.f16787j.mo96768i(view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m28952l(View view) {
        if (NullChecker.m81303a(this.f16787j)) {
            this.f16787j.mo96770v(view);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m28953m(View view) {
        if (NullChecker.m81303a(this.f16787j)) {
            this.f16787j.mo96767f(view);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m28954n(View view) {
        if (this.f16786i == 1) {
            return;
        }
        if (NullChecker.m81303a(this.f16787j) && this.f16787j.mo96769p()) {
            return;
        }
        m28960t();
        m28947g();
        m28956p();
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m28955o(View view) {
        this.f16786i = 6;
        m28956p();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m28946f(this);
        m28948h();
    }

    /* JADX INFO: renamed from: p */
    public final void m28956p() {
        if (NullChecker.m81303a(this.f16787j)) {
            this.f16787j.onStateChanged(this.f16786i);
        }
        int i = this.f16786i;
        if (i == 2) {
            this.f16779b.setVisibility(0);
            this.f16782e.setVisibility(0);
            this.f16783f.setVisibility(8);
            this.f16778a.setState(1);
            return;
        }
        if (i == 4) {
            this.f16779b.setVisibility(8);
            this.f16782e.setVisibility(8);
            this.f16783f.setVisibility(8);
            this.f16778a.setState(2);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f16779b.setVisibility(0);
        this.f16782e.setVisibility(8);
        this.f16783f.setVisibility(0);
        this.f16778a.setState(1);
    }

    /* JADX INFO: renamed from: q */
    public void m28957q() {
        this.f16786i = 1;
    }

    /* JADX INFO: renamed from: r */
    public final void m28958r() {
        this.f16780c.setOnClickListener(new View.OnClickListener() { // from class: l.vj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181648a.m28951k(view);
            }
        });
        xdl0.m208329E0(this.f16782e, new View.OnClickListener() { // from class: l.wj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186587a.m28952l(view);
            }
        });
        this.f16784g.setOnClickListener(new View.OnClickListener() { // from class: l.xj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193167a.m28953m(view);
            }
        });
        this.f16778a.setOnClickListener(new View.OnClickListener() { // from class: l.yj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198567a.m28954n(view);
            }
        });
        this.f16785h.setOnClickListener(new View.OnClickListener() { // from class: l.zj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203365a.m28955o(view);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m28959s(boolean z) {
        xdl0.m208344M(this.f16781d, z);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        this.f16778a.setActivated(z);
    }

    public void setCallback(InterfaceC15629ai interfaceC15629ai) {
        this.f16787j = interfaceC15629ai;
    }

    public void setState(int i) {
        this.f16786i = i;
        m28956p();
    }

    /* JADX INFO: renamed from: t */
    public final void m28960t() {
        if (this.f16788k) {
            return;
        }
        this.f16788k = true;
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountCameraVideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
