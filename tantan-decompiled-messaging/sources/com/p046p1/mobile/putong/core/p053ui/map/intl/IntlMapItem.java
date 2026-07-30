package com.p046p1.mobile.putong.core.p053ui.map.intl;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.i0g0;
import p149l.muw;
import p149l.u4c0;
import p149l.w0c0;
import p149l.ytw;

/* JADX INFO: loaded from: classes3.dex */
public class IntlMapItem extends VLinear {

    /* JADX INFO: renamed from: c */
    public LinearLayout f30380c;

    /* JADX INFO: renamed from: d */
    public VText f30381d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f30382e;

    /* JADX INFO: renamed from: f */
    public VText f30383f;

    /* JADX INFO: renamed from: g */
    public VText f30384g;

    /* JADX INFO: renamed from: h */
    public VImage f30385h;

    /* JADX INFO: renamed from: i */
    public VText f30386i;

    /* JADX INFO: renamed from: j */
    public int f30387j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.map.intl.IntlMapItem$a */
    public static class C8441a {
        /* JADX INFO: renamed from: b */
        public static void m47397b(IntlMapItem intlMapItem, View view) {
            intlMapItem.f30380c = (LinearLayout) ((ViewGroup) view).getChildAt(0);
            intlMapItem.f30381d = (VText) view.findViewById(u4c0.f173861I8);
            ViewGroup viewGroup = (ViewGroup) view;
            intlMapItem.f30382e = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            intlMapItem.f30383f = (VText) view.findViewById(u4c0.f174476t2);
            intlMapItem.f30384g = (VText) view.findViewById(u4c0.f174408p2);
            intlMapItem.f30385h = (VImage) view.findViewById(u4c0.f174238f1);
            intlMapItem.f30386i = (VText) viewGroup.getChildAt(2);
        }
    }

    public IntlMapItem(Context context) {
        super(context);
        this.f30387j = -1;
    }

    /* JADX INFO: renamed from: Y */
    public final void m47392Y(View view) {
        C8441a.m47397b(this, view);
    }

    /* JADX INFO: renamed from: Z */
    public IntlMapBaseAct m47393Z() {
        return (IntlMapBaseAct) getContext();
    }

    /* JADX INFO: renamed from: a0 */
    public void m47394a0(ytw ytwVar, int i, int i2, boolean z) {
        this.f30381d.setText(ytwVar.m216093f());
        if (i2 == -1) {
            this.f30384g.setText(ytwVar.m216090c());
            this.f30381d.setTextColor(m47393Z().getResources().getColor(w0c0.f183898w1));
            this.f30383f.setText("");
        } else {
            this.f30381d.setTextColor(-11447983);
            this.f30383f.setText(i >= 0 ? i0g0.m133876p(i, false) : null);
            this.f30384g.setText(ytwVar.m216090c());
        }
        this.f30385h.setVisibility(z ? 0 : 4);
        this.f30387j = i2 % 2 != 0 ? -263173 : -1;
    }

    /* JADX INFO: renamed from: b0 */
    public void m47395b0(final muw muwVar, final e30<muw> e30Var) {
        this.f30381d.setText(muwVar.m156454d());
        this.f30384g.setText(muwVar.m156452b());
        this.f30382e.setVisibility(0);
        setOnClickListener(new View.OnClickListener() { // from class: l.aao
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(muwVar);
            }
        });
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.drawColor(this.f30387j);
        super.draw(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47392Y(this);
    }

    public IntlMapItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30387j = -1;
    }

    public IntlMapItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30387j = -1;
    }
}
