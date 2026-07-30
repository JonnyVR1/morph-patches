package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleMonthView extends MonthView {
    public SimpleMonthView(Context context, AttributeSet attributeSet, InterfaceC14668a interfaceC14668a) {
        super(context, attributeSet, interfaceC14668a);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.MonthView
    /* JADX INFO: renamed from: c */
    public void mo85126c(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.f61293s == i3) {
            canvas.drawCircle(i4, i5 - (MonthView.f61257Q / 3), MonthView.f61261U, this.f61281g);
        }
        boolean zM85134l = m85134l(i, i2, i3);
        Paint paint = this.f61279e;
        if (zM85134l) {
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        } else {
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
        if (this.f61275a.mo85096e0(i, i2, i3)) {
            this.f61279e.setColor(this.f61272K);
        } else if (this.f61293s == i3) {
            this.f61279e.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.f61279e.setColor(this.f61268G);
        } else if (this.f61292r && this.f61294t == i3) {
            this.f61279e.setColor(this.f61270I);
        } else {
            this.f61279e.setColor(m85134l(i, i2, i3) ? this.f61271J : this.f61267F);
        }
        canvas.drawText(String.format("%d", Integer.valueOf(i3)), i4, i5, this.f61279e);
    }
}
