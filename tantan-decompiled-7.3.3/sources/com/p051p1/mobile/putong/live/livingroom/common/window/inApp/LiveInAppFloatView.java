package com.p051p1.mobile.putong.live.livingroom.common.window.inApp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.view.LiveLoadingView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.eti;
import p153l.lwl;
import p153l.uzs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveInAppFloatView extends FrameLayout implements lwl {

    /* JADX INFO: renamed from: a */
    public FrameLayout f50279a;

    /* JADX INFO: renamed from: b */
    public View f50280b;

    /* JADX INFO: renamed from: c */
    public ViewStub f50281c;

    /* JADX INFO: renamed from: d */
    public VText f50282d;

    /* JADX INFO: renamed from: e */
    public VImage f50283e;

    /* JADX INFO: renamed from: f */
    public VImage f50284f;

    /* JADX INFO: renamed from: g */
    public LiveLoadingView f50285g;

    /* JADX INFO: renamed from: h */
    public List<eti> f50286h;

    public LiveInAppFloatView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50286h = new ArrayList();
    }

    /* JADX INFO: renamed from: c */
    public final void m74523c(View view) {
        uzs.m198860a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m74524d(eti etiVar) {
        if (etiVar == null || this.f50286h.contains(etiVar)) {
            return;
        }
        this.f50286h.add(etiVar);
    }

    @Override // p153l.lwl
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public void m74525e() {
        bnl0.m105509E0(this.f50283e, new View.OnClickListener() { // from class: l.rzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165566a.m74526f(view);
            }
        });
        bnl0.m105509E0(this.f50284f, new View.OnClickListener() { // from class: l.szs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171416a.m74527g(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m74526f(View view) {
        Iterator<eti> it = this.f50286h.iterator();
        while (it.hasNext()) {
            it.next().mo120251b(true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m74527g(View view) {
        VImage vImage = this.f50284f;
        vImage.setSelected(!vImage.isSelected());
        Iterator<eti> it = this.f50286h.iterator();
        while (it.hasNext()) {
            it.next().mo120252c(this.f50284f.isSelected());
        }
    }

    @Override // p153l.lwl
    public FrameLayout getPlayerContainer() {
        return this.f50279a;
    }

    /* JADX INFO: renamed from: h */
    public void m74528h() {
        Iterator<eti> it = this.f50286h.iterator();
        while (it.hasNext()) {
            it.next().mo120250a();
        }
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: m */
    public void mo74529m(boolean z) {
        if (this.f50285g == null) {
            this.f50285g = (LiveLoadingView) this.f50281c.inflate();
        }
        LiveLoadingView liveLoadingView = this.f50285g;
        if (z) {
            bnl0.m105524M(liveLoadingView, true);
            this.f50285g.m69927g();
        } else {
            liveLoadingView.m69928h();
            bnl0.m105524M(this.f50281c, false);
        }
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: n */
    public void mo74530n() {
        this.f50282d.setText("");
        bnl0.m105524M(this.f50282d, false);
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: o */
    public void mo74531o(String str) {
        bnl0.m105524M(this.f50282d, true);
        this.f50282d.setText(str);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74523c(this);
        m74525e();
    }

    @Override // p153l.lwl
    /* JADX INFO: renamed from: p */
    public void mo74532p(boolean z) {
        bnl0.m105524M(this.f50280b, z);
    }

    @Override // p153l.lwl
    public void setVoiceSelected(boolean z) {
        this.f50284f.setSelected(z);
    }

    public LiveInAppFloatView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveInAppFloatView(Context context) {
        this(context, null);
    }
}
