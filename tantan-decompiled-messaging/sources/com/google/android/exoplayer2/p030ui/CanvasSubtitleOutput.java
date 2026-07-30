package com.google.android.exoplayer2.p030ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p149l.l5g0;
import p149l.o5g0;
import p149l.tf4;
import p149l.ywb;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
final class CanvasSubtitleOutput extends View implements SubtitleView.InterfaceC2031a {

    /* JADX INFO: renamed from: a */
    public final List<l5g0> f9138a;

    /* JADX INFO: renamed from: b */
    public List<ywb> f9139b;

    /* JADX INFO: renamed from: c */
    public int f9140c;

    /* JADX INFO: renamed from: d */
    public float f9141d;

    /* JADX INFO: renamed from: e */
    public tf4 f9142e;

    /* JADX INFO: renamed from: f */
    public float f9143f;

    public CanvasSubtitleOutput(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9138a = new ArrayList();
        this.f9139b = Collections.EMPTY_LIST;
        this.f9140c = 0;
        this.f9141d = 0.0533f;
        this.f9142e = tf4.f169938g;
        this.f9143f = 0.08f;
    }

    /* JADX INFO: renamed from: b */
    public static ywb m11806b(ywb ywbVar) {
        ywb.C21557b c21557bM216326p = ywbVar.m216310b().m216321k(-3.4028235E38f).m216322l(Integer.MIN_VALUE).m216326p(null);
        int i = ywbVar.f200436f;
        float f = ywbVar.f200435e;
        if (i == 0) {
            c21557bM216326p.m216318h(1.0f - f, 0);
        } else {
            c21557bM216326p.m216318h((-f) - 1.0f, 1);
        }
        int i2 = ywbVar.f200437g;
        if (i2 == 0) {
            c21557bM216326p.m216319i(2);
        } else if (i2 == 2) {
            c21557bM216326p.m216319i(0);
        }
        return c21557bM216326p.m216311a();
    }

    @Override // com.google.android.exoplayer2.p030ui.SubtitleView.InterfaceC2031a
    /* JADX INFO: renamed from: a */
    public void mo11807a(List<ywb> list, tf4 tf4Var, float f, int i, float f2) {
        this.f9139b = list;
        this.f9142e = tf4Var;
        this.f9141d = f;
        this.f9140c = i;
        this.f9143f = f2;
        while (this.f9138a.size() < list.size()) {
            this.f9138a.add(new l5g0(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<ywb> list = this.f9139b;
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
        float fM162786f = o5g0.m162786f(this.f9140c, this.f9141d, height, i);
        if (fM162786f <= 0.0f) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ywb ywbVarM11806b = list.get(i2);
            if (ywbVarM11806b.f200446p != Integer.MIN_VALUE) {
                ywbVarM11806b = m11806b(ywbVarM11806b);
            }
            this.f9138a.get(i2).m148637b(ywbVarM11806b, this.f9142e, fM162786f, o5g0.m162786f(ywbVarM11806b.f200444n, ywbVarM11806b.f200445o, height, i), this.f9143f, canvas, paddingLeft, paddingTop, width, paddingBottom);
        }
    }

    public CanvasSubtitleOutput(Context context) {
        this(context, null);
    }
}
