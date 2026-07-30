package com.p051p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.view.BoostViewContainer;
import p151v.VFrame;
import p151v.VIcon;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p153l.bgl;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.iam;
import p153l.k3m;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class HomeTitleMenuLayout extends VLinear implements iam {

    /* JADX INFO: renamed from: c */
    public ViewStub f24693c;

    /* JADX INFO: renamed from: d */
    public VFrame f24694d;

    /* JADX INFO: renamed from: e */
    public BoostViewContainer f24695e;

    /* JADX INFO: renamed from: f */
    public VIcon f24696f;

    /* JADX INFO: renamed from: g */
    public VFrame f24697g;

    /* JADX INFO: renamed from: h */
    public VIcon f24698h;

    /* JADX INFO: renamed from: i */
    public VFrame f24699i;

    /* JADX INFO: renamed from: j */
    public VImage f24700j;

    /* JADX INFO: renamed from: k */
    public VOnlineIndicator f24701k;

    public HomeTitleMenuLayout(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: P */
    public final void m40176P(View view) {
        bgl.m104227a(this, view);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40176P(this);
        if (gra.m131778z()) {
            bnl0.m105526N(this.f24698h, dbc0.f86230Ht);
            bnl0.m105526N(this.f24700j, dbc0.f86198Gt);
            bnl0.m105526N(this.f24696f, dbc0.f86240I7);
            bnl0.m105507D0(qa00.m175859d(32.0f), this.f24694d);
            bnl0.m105505C0(this.f24694d, qa00.m175859d(32.0f));
            bnl0.m105507D0(qa00.m175859d(32.0f), this.f24698h);
            bnl0.m105505C0(this.f24698h, qa00.m175859d(32.0f));
            bnl0.m105507D0(qa00.m175859d(32.0f), this.f24700j);
            bnl0.m105505C0(this.f24700j, qa00.m175859d(32.0f));
            bnl0.m105507D0(qa00.m175859d(32.0f), this.f24696f);
            bnl0.m105505C0(this.f24696f, qa00.m175859d(32.0f));
        }
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeTitleMenuLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i1 */
    public void mo22064i1(k3m k3mVar) {
    }
}
