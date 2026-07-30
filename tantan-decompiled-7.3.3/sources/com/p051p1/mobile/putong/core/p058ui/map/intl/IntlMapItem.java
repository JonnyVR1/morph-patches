package com.p051p1.mobile.putong.core.p058ui.map.intl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.c9c0;
import p153l.lxw;
import p153l.q8g0;
import p153l.xww;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class IntlMapItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f31228c;

    /* JADX INFO: renamed from: d */
    public VText f31229d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f31230e;

    /* JADX INFO: renamed from: f */
    public VText f31231f;

    /* JADX INFO: renamed from: g */
    public VText f31232g;

    /* JADX INFO: renamed from: h */
    public VImage f31233h;

    /* JADX INFO: renamed from: i */
    public VText f31234i;

    /* JADX INFO: renamed from: j */
    public int f31235j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.map.intl.IntlMapItem$a */
    public static class C8604a {
        /* JADX INFO: renamed from: b */
        public static void m48580b(IntlMapItem intlMapItem, View view) {
            intlMapItem.f31228c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
            intlMapItem.f31229d = (VText) view.findViewById(adc0.f69983K8);
            ViewGroup viewGroup = (ViewGroup) view;
            intlMapItem.f31230e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            intlMapItem.f31231f = (VText) view.findViewById(adc0.f70601v2);
            intlMapItem.f31232g = (VText) view.findViewById(adc0.f70533r2);
            intlMapItem.f31233h = (VImage) view.findViewById(adc0.f70329f1);
            intlMapItem.f31234i = (VText) viewGroup.getChildAt(2);
        }
    }

    public IntlMapItem(Context context) {
        super(context);
        this.f31235j = -1;
    }

    /* JADX INFO: renamed from: Y */
    public final void m48575Y(View view) {
        C8604a.m48580b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public IntlMapBaseAct m48576Z() {
        return (IntlMapBaseAct) getContext();
    }

    /* JADX INFO: renamed from: a0 */
    public void m48577a0(xww xwwVar, int i, int i2, boolean z) {
        this.f31229d.setText(xwwVar.m213451f());
        if (i2 == -1) {
            this.f31232g.setText(xwwVar.m213448c());
            this.f31229d.setTextColor(m48576Z().getResources().getColor(c9c0.f80471x1));
            this.f31231f.setText("");
        } else {
            this.f31229d.setTextColor(-11447983);
            this.f31231f.setText(i >= 0 ? q8g0.m175811p(i, false) : null);
            this.f31232g.setText(xwwVar.m213448c());
        }
        this.f31233h.setVisibility(z ? 0 : 4);
        this.f31235j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m48578b0(final lxw lxwVar, final y20<lxw> y20Var) {
        this.f31229d.setText(lxwVar.m156253d());
        this.f31232g.setText(lxwVar.m156251b());
        this.f31230e.setVisibility(0);
        setOnClickListener(new View.OnClickListener() { // from class: l.aco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(lxwVar);
            }
        });
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f31235j);
        super.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48575Y(this);
    }

    public IntlMapItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31235j = -1;
    }

    public IntlMapItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31235j = -1;
    }
}
