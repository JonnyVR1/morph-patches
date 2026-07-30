package com.p046p1.mobile.putong.live.livingroom.common.usercard.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VText;
import p149l.dck0;
import p149l.mqv;
import p149l.n1k0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y16;
import p149l.zxj0;

/* JADX INFO: loaded from: classes4.dex */
public class UserCardContributionView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f49405a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49406b;

    /* JADX INFO: renamed from: c */
    public VText f49407c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f49408d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49409e;

    /* JADX INFO: renamed from: f */
    public VText f49410f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f49411g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f49412h;

    /* JADX INFO: renamed from: i */
    public VText f49413i;

    /* JADX INFO: renamed from: j */
    public ArrayList<String> f49414j;

    public UserCardContributionView(Context context) {
        super(context);
        this.f49414j = vwb.m200324f0("", "", "");
    }

    /* JADX INFO: renamed from: d */
    public final void m73328d(View view) {
        zxj0.m220838a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public void m73329e() {
        this.f49414j = vwb.m200324f0("", "", "");
        this.f49406b.setController(null);
        this.f49407c.setText("0");
        this.f49409e.setController(null);
        this.f49410f.setText("0");
        this.f49412h.setController(null);
        this.f49413i.setText("0");
    }

    /* JADX INFO: renamed from: f */
    public void m73330f(final n1k0 n1k0Var) {
        xdl0.m208329E0(this.f49411g, new View.OnClickListener() { // from class: l.wxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188488a.m73331g(n1k0Var, view);
            }
        });
        xdl0.m208329E0(this.f49408d, new View.OnClickListener() { // from class: l.xxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194875a.m73332h(n1k0Var, view);
            }
        });
        xdl0.m208329E0(this.f49405a, new View.OnClickListener() { // from class: l.yxj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200629a.m73333i(n1k0Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m73331g(n1k0 n1k0Var, View view) {
        n1k0Var.m157423d5(this.f49414j.get(2));
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m73332h(n1k0 n1k0Var, View view) {
        n1k0Var.m157423d5(this.f49414j.get(1));
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73333i(n1k0 n1k0Var, View view) {
        n1k0Var.m157423d5(this.f49414j.get(0));
    }

    /* JADX INFO: renamed from: j */
    public void m73334j(y16 y16Var) {
        for (int i = 0; i < y16Var.m212134e().size(); i++) {
            m73335k(this.f49406b, this.f49407c, i, 0, y16Var);
            m73335k(this.f49409e, this.f49410f, i, 1, y16Var);
            m73335k(this.f49412h, this.f49413i, i, 2, y16Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final void m73335k(VDraweeView vDraweeView, VText vText, int i, int i2, y16 y16Var) {
        if (i != i2) {
            return;
        }
        mqv mqvVar = y16Var.m212134e().get(i);
        this.f49414j.set(i, ((y16.C21278b) mqvVar.f135304a).f195387a);
        dck0.m110721f(mqvVar, vDraweeView);
        vText.setText(((y16.C21278b) mqvVar.f135304a).f195388b.amount);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73328d(this);
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49414j = vwb.m200324f0("", "", "");
    }

    public UserCardContributionView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49414j = vwb.m200324f0("", "", "");
    }
}
