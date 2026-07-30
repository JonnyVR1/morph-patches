package com.google.android.exoplayer2.p031ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p153l.myb;
import p153l.sg4;
import p153l.tdg0;
import p153l.wdg0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class CanvasSubtitleOutput extends View implements SubtitleView.InterfaceC2054a {

    /* JADX INFO: renamed from: a */
    public final List<tdg0> f9175a;

    /* JADX INFO: renamed from: b */
    public List<myb> f9176b;

    /* JADX INFO: renamed from: c */
    public int f9177c;

    /* JADX INFO: renamed from: d */
    public float f9178d;

    /* JADX INFO: renamed from: e */
    public sg4 f9179e;

    /* JADX INFO: renamed from: f */
    public float f9180f;

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9175a = new ArrayList();
        this.f9176b = Collections.EMPTY_LIST;
        this.f9177c = 0;
        this.f9178d = 0.0533f;
        this.f9179e = sg4.f167788g;
        this.f9180f = 0.08f;
    }

    /* JADX INFO: renamed from: b */
    public static myb m11860b(myb mybVar) {
        myb.C18746b c18746bM160769p = mybVar.m160753b().m160764k(-3.4028235E38f).m160765l(Integer.MIN_VALUE).m160769p(null);
        int i = mybVar.f139372f;
        float f = mybVar.f139371e;
        if (i == 0) {
            c18746bM160769p.m160761h(1.0f - f, 0);
        } else {
            c18746bM160769p.m160761h((-f) - 1.0f, 1);
        }
        int i2 = mybVar.f139373g;
        if (i2 == 0) {
            c18746bM160769p.m160762i(2);
        } else if (i2 == 2) {
            c18746bM160769p.m160762i(0);
        }
        return c18746bM160769p.m160754a();
    }

    @Override // com.google.android.exoplayer2.p031ui.SubtitleView.InterfaceC2054a
    /* JADX INFO: renamed from: a */
    public void mo11861a(List<myb> list, sg4 sg4Var, float f, int i, float f2) {
        this.f9176b = list;
        this.f9179e = sg4Var;
        this.f9178d = f;
        this.f9177c = i;
        this.f9180f = f2;
        while (this.f9175a.size() < list.size()) {
            this.f9175a.add(new tdg0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<myb> list = this.f9176b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i = paddingBottom - paddingTop;
        float fM205884f = wdg0.m205884f(this.f9177c, this.f9178d, height, i);
        if (fM205884f <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            myb mybVarM11860b = list.get(i2);
            if (mybVarM11860b.f139382p != Integer.MIN_VALUE) {
                mybVarM11860b = m11860b(mybVarM11860b);
            }
            this.f9175a.get(i2).m190624b(mybVarM11860b, this.f9179e, fM205884f, wdg0.m205884f(mybVarM11860b.f139380n, mybVarM11860b.f139381o, height, i), this.f9180f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
