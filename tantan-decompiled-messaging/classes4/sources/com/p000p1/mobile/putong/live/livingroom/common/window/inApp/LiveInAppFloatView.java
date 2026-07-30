package com.p000p1.mobile.putong.live.livingroom.common.window.inApp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.xdl0;
import p002l.iqi;
import p002l.txs;
import p002l.xtl;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveInAppFloatView extends FrameLayout implements xtl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5473a;

    /* JADX INFO: renamed from: b */
    public View f5474b;

    /* JADX INFO: renamed from: c */
    public ViewStub f5475c;

    /* JADX INFO: renamed from: d */
    public VText f5476d;

    /* JADX INFO: renamed from: e */
    public VImage f5477e;

    /* JADX INFO: renamed from: f */
    public VImage f5478f;

    /* JADX INFO: renamed from: g */
    public LiveLoadingView f5479g;

    /* JADX INFO: renamed from: h */
    public List<iqi> f5480h;

    public LiveInAppFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5480h = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final void m6876c(View view) {
        txs.m23231a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m6877d(iqi iqiVar) {
        if (iqiVar == null || this.f5480h.contains(iqiVar)) {
            return;
        }
        this.f5480h.add(iqiVar);
    }

    @Override // p002l.xtl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m6878e() {
        xdl0.E0(this.f5477e, new View.OnClickListener() { // from class: l.qxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18272a.m6879f(view);
            }
        });
        xdl0.E0(this.f5478f, new View.OnClickListener() { // from class: l.rxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18719a.m6880g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m6879f(View view) {
        Iterator<iqi> it = this.f5480h.iterator();
        while (it.hasNext()) {
            it.next().mo11698b(true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6880g(View view) {
        VImage vImage = this.f5478f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<iqi> it = this.f5480h.iterator();
        while (it.hasNext()) {
            it.next().mo11699c(this.f5478f.isSelected());
        }
    }

    @Override // p002l.xtl
    public FrameLayout getPlayerContainer() {
        return this.f5473a;
    }

    /* JADX INFO: renamed from: h */
    public void m6881h() {
        Iterator<iqi> it = this.f5480h.iterator();
        while (it.hasNext()) {
            it.next().mo11697a();
        }
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: m */
    public void mo6882m(boolean z) {
        if (this.f5479g == null) {
            this.f5479g = this.f5475c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f5479g;
        if (z) {
            xdl0.M(liveLoadingView, true);
            this.f5479g.g();
        } else {
            liveLoadingView.h();
            xdl0.M(this.f5475c, false);
        }
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: n */
    public void mo6883n() {
        this.f5476d.setText("");
        xdl0.M(this.f5476d, false);
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: o */
    public void mo6884o(String str) {
        xdl0.M(this.f5476d, true);
        this.f5476d.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6876c(this);
        m6878e();
    }

    @Override // p002l.xtl
    /* JADX INFO: renamed from: p */
    public void mo6885p(boolean z) {
        xdl0.M(this.f5474b, z);
    }

    @Override // p002l.xtl
    public void setVoiceSelected(boolean z) {
        this.f5478f.setSelected(z);
    }

    public LiveInAppFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveInAppFloatView(Context context) {
        this(context, null);
    }
}
