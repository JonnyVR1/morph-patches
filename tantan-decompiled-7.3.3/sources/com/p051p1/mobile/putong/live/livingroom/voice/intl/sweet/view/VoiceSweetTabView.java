package com.p051p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p151v.VText;
import p153l.bnl0;
import p153l.i2p0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceSweetTabView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f54435a;

    /* JADX INFO: renamed from: b */
    public VText f54436b;

    /* JADX INFO: renamed from: c */
    public y20 f54437c;

    public VoiceSweetTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m79735c(View view) {
        i2p0.m138232a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m79736d(View view) {
        m79738f(0);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m79737e(View view) {
        m79738f(1);
    }

    /* JADX INFO: renamed from: f */
    public void m79738f(int i) {
        VText vText = this.f54435a;
        if (i == 0) {
            vText.setTextColor(n3d0.m161277a(n9c0.f140823e1));
            this.f54436b.setTextColor(n3d0.m161277a(n9c0.f140847m1));
        } else {
            vText.setTextColor(n3d0.m161277a(n9c0.f140847m1));
            this.f54436b.setTextColor(n3d0.m161277a(n9c0.f140823e1));
        }
        y20 y20Var = this.f54437c;
        if (y20Var != null) {
            y20Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m79739g(int i, int i2) {
        this.f54435a.setText(n3d0.m161280d(i));
        this.f54436b.setText(n3d0.m161280d(i2));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79735c(this);
        m79738f(0);
        bnl0.m105509E0(this.f54435a, new View.OnClickListener() { // from class: l.g2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101865a.m79736d(view);
            }
        });
        bnl0.m105509E0(this.f54436b, new View.OnClickListener() { // from class: l.h2p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107577a.m79737e(view);
            }
        });
    }

    public void setMargin(boolean z) {
        bnl0.m105538V(this.f54436b, z ? -qa00.f156328o : 0);
    }

    public void setOnTabSelectedListener(y20<Integer> y20Var) {
        this.f54437c = y20Var;
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
