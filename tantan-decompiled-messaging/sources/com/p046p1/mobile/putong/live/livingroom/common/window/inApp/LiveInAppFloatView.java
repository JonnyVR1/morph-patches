package com.p046p1.mobile.putong.live.livingroom.common.window.inApp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.iqi;
import p149l.txs;
import p149l.xdl0;
import p149l.xtl;

/* JADX INFO: loaded from: classes4.dex */
public class LiveInAppFloatView extends FrameLayout implements xtl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49431a;

    /* JADX INFO: renamed from: b */
    public View f49432b;

    /* JADX INFO: renamed from: c */
    public ViewStub f49433c;

    /* JADX INFO: renamed from: d */
    public VText f49434d;

    /* JADX INFO: renamed from: e */
    public VImage f49435e;

    /* JADX INFO: renamed from: f */
    public VImage f49436f;

    /* JADX INFO: renamed from: g */
    public LiveLoadingView f49437g;

    /* JADX INFO: renamed from: h */
    public List<iqi> f49438h;

    public LiveInAppFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49438h = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final void m73340c(View view) {
        txs.m190974a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m73341d(iqi iqiVar) {
        if (iqiVar == null || this.f49438h.contains(iqiVar)) {
            return;
        }
        this.f49438h.add(iqiVar);
    }

    @Override // p149l.xtl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m73342e() {
        xdl0.m208329E0(this.f49435e, new View.OnClickListener() { // from class: l.qxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156867a.m73343f(view);
            }
        });
        xdl0.m208329E0(this.f49436f, new View.OnClickListener() { // from class: l.rxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161506a.m73344g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m73343f(View view) {
        Iterator<iqi> it = this.f49438h.iterator();
        while (it.hasNext()) {
            it.next().mo110492b(true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m73344g(View view) {
        VImage vImage = this.f49436f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<iqi> it = this.f49438h.iterator();
        while (it.hasNext()) {
            it.next().mo110493c(this.f49436f.isSelected());
        }
    }

    @Override // p149l.xtl
    public FrameLayout getPlayerContainer() {
        return this.f49431a;
    }

    /* JADX INFO: renamed from: h */
    public void m73345h() {
        Iterator<iqi> it = this.f49438h.iterator();
        while (it.hasNext()) {
            it.next().mo110491a();
        }
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: m */
    public void mo73346m(boolean z) {
        if (this.f49437g == null) {
            this.f49437g = (LiveLoadingView) this.f49433c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f49437g;
        if (z) {
            xdl0.m208344M(liveLoadingView, true);
            this.f49437g.m68744g();
        } else {
            liveLoadingView.m68745h();
            xdl0.m208344M(this.f49433c, false);
        }
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: n */
    public void mo73347n() {
        this.f49434d.setText("");
        xdl0.m208344M(this.f49434d, false);
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: o */
    public void mo73348o(String str) {
        xdl0.m208344M(this.f49434d, true);
        this.f49434d.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73340c(this);
        m73342e();
    }

    @Override // p149l.xtl
    /* JADX INFO: renamed from: p */
    public void mo73349p(boolean z) {
        xdl0.m208344M(this.f49432b, z);
    }

    @Override // p149l.xtl
    public void setVoiceSelected(boolean z) {
        this.f49436f.setSelected(z);
    }

    public LiveInAppFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveInAppFloatView(Context context) {
        this(context, null);
    }
}
