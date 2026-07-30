package com.p051p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.d36;
import p153l.f7k0;
import p153l.jlk0;
import p153l.jyb;
import p153l.nsv;
import p153l.tak0;

/* JADX INFO: loaded from: classes4.dex */
public class UserCardContributionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f50253a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50254b;

    /* JADX INFO: renamed from: c */
    public VText f50255c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f50256d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f50257e;

    /* JADX INFO: renamed from: f */
    public VText f50258f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f50259g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f50260h;

    /* JADX INFO: renamed from: i */
    public VText f50261i;

    /* JADX INFO: renamed from: j */
    public ArrayList<String> f50262j;

    public UserCardContributionView(Context context) {
        super(context);
        this.f50262j = jyb.m147507f0("", "", "");
    }

    /* JADX INFO: renamed from: d */
    public final void m74511d(View view) {
        f7k0.m124475a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m74512e() {
        this.f50262j = jyb.m147507f0("", "", "");
        this.f50254b.setController(null);
        this.f50255c.setText("0");
        this.f50257e.setController(null);
        this.f50258f.setText("0");
        this.f50260h.setController(null);
        this.f50261i.setText("0");
    }

    /* JADX INFO: renamed from: f */
    public void m74513f(final tak0 tak0Var) {
        bnl0.m105509E0(this.f50259g, new View.OnClickListener() { // from class: l.c7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80117a.m74514g(tak0Var, view);
            }
        });
        bnl0.m105509E0(this.f50256d, new View.OnClickListener() { // from class: l.d7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85532a.m74515h(tak0Var, view);
            }
        });
        bnl0.m105509E0(this.f50253a, new View.OnClickListener() { // from class: l.e7k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92445a.m74516i(tak0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m74514g(tak0 tak0Var, View view) {
        tak0Var.m189904d5(this.f50262j.get(2));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m74515h(tak0 tak0Var, View view) {
        tak0Var.m189904d5(this.f50262j.get(1));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m74516i(tak0 tak0Var, View view) {
        tak0Var.m189904d5(this.f50262j.get(0));
    }

    /* JADX INFO: renamed from: j */
    public void m74517j(d36 d36Var) {
        for (int i = 0; i < d36Var.m113790e().size(); i++) {
            m74518k(this.f50254b, this.f50255c, i, 0, d36Var);
            m74518k(this.f50257e, this.f50258f, i, 1, d36Var);
            m74518k(this.f50260h, this.f50261i, i, 2, d36Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m74518k(VDraweeView vDraweeView, VText vText, int i, int i2, d36 d36Var) {
        if (i != i2) {
            return;
        }
        nsv nsvVar = d36Var.m113790e().get(i);
        this.f50262j.set(i, ((d36.C16429b) nsvVar.f143542a).f84866a);
        jlk0.m146084f(nsvVar, vDraweeView);
        vText.setText(((d36.C16429b) nsvVar.f143542a).f84867b.amount);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74511d(this);
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50262j = jyb.m147507f0("", "", "");
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50262j = jyb.m147507f0("", "", "");
    }
}
