package com.p000p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import l.hce;
import l.mqv;
import l.vwb;
import l.xdl0;
import p002l.dck0;
import p002l.n1k0;
import p002l.y16;
import p002l.zxj0;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class UserCardContributionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f5447a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f5448b;

    /* JADX INFO: renamed from: c */
    public VText f5449c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f5450d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f5451e;

    /* JADX INFO: renamed from: f */
    public VText f5452f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5453g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f5454h;

    /* JADX INFO: renamed from: i */
    public VText f5455i;

    /* JADX INFO: renamed from: j */
    public ArrayList<String> f5456j;

    public UserCardContributionView(Context context) {
        super(context);
        this.f5456j = vwb.f0(new String[]{"", "", ""});
    }

    /* JADX INFO: renamed from: d */
    public final void m6864d(View view) {
        zxj0.m27677a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m6865e() {
        this.f5456j = vwb.f0(new String[]{"", "", ""});
        this.f5448b.setController((hce) null);
        this.f5449c.setText("0");
        this.f5451e.setController((hce) null);
        this.f5452f.setText("0");
        this.f5454h.setController((hce) null);
        this.f5455i.setText("0");
    }

    /* JADX INFO: renamed from: f */
    public void m6866f(final n1k0 n1k0Var) {
        xdl0.E0(this.f5453g, new View.OnClickListener() { // from class: l.wxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22033a.m6867g(n1k0Var, view);
            }
        });
        xdl0.E0(this.f5450d, new View.OnClickListener() { // from class: l.xxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22499a.m6868h(n1k0Var, view);
            }
        });
        xdl0.E0(this.f5447a, new View.OnClickListener() { // from class: l.yxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23140a.m6869i(n1k0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m6867g(n1k0 n1k0Var, View view) {
        n1k0Var.m18411d5(this.f5456j.get(2));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m6868h(n1k0 n1k0Var, View view) {
        n1k0Var.m18411d5(this.f5456j.get(1));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m6869i(n1k0 n1k0Var, View view) {
        n1k0Var.m18411d5(this.f5456j.get(0));
    }

    /* JADX INFO: renamed from: j */
    public void m6870j(y16 y16Var) {
        for (int i = 0; i < y16Var.m26294e().size(); i++) {
            m6871k(this.f5448b, this.f5449c, i, 0, y16Var);
            m6871k(this.f5451e, this.f5452f, i, 1, y16Var);
            m6871k(this.f5454h, this.f5455i, i, 2, y16Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m6871k(VDraweeView vDraweeView, VText vText, int i, int i2, y16 y16Var) {
        if (i != i2) {
            return;
        }
        mqv mqvVar = (mqv) y16Var.m26294e().get(i);
        this.f5456j.set(i, ((y16.C0904b) mqvVar.a).f22600a);
        dck0.m11738f(mqvVar, vDraweeView);
        vText.setText(((y16.C0904b) mqvVar.a).f22601b.amount);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6864d(this);
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5456j = vwb.f0(new String[]{"", "", ""});
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5456j = vwb.f0(new String[]{"", "", ""});
    }
}
