package com.p000p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import l.e30;
import l.eto0;
import l.h1c0;
import l.kvc0;
import l.t100;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceSweetTabView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7193a;

    /* JADX INFO: renamed from: b */
    public VText f7194b;

    /* JADX INFO: renamed from: c */
    public e30 f7195c;

    public VoiceSweetTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m8765c(View view) {
        eto0.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m8766d(View view) {
        m8768f(0);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m8767e(View view) {
        m8768f(1);
    }

    /* JADX INFO: renamed from: f */
    public void m8768f(int i) {
        VText vText = this.f7193a;
        if (i == 0) {
            vText.setTextColor(kvc0.a(h1c0.e1));
            this.f7194b.setTextColor(kvc0.a(h1c0.m1));
        } else {
            vText.setTextColor(kvc0.a(h1c0.m1));
            this.f7194b.setTextColor(kvc0.a(h1c0.e1));
        }
        e30 e30Var = this.f7195c;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8769g(int i, int i2) {
        this.f7193a.setText(kvc0.d(i));
        this.f7194b.setText(kvc0.d(i2));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8765c(this);
        m8768f(0);
        xdl0.E0(this.f7193a, new View.OnClickListener() { // from class: l.cto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10767a.m8766d(view);
            }
        });
        xdl0.E0(this.f7194b, new View.OnClickListener() { // from class: l.dto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11996a.m8767e(view);
            }
        });
    }

    public void setMargin(boolean z) {
        xdl0.V(this.f7194b, z ? -t100.o : 0);
    }

    public void setOnTabSelectedListener(e30<Integer> e30Var) {
        this.f7195c = e30Var;
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
