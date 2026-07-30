package com.wdullaer.materialdatetimepicker.date;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.AttributeSet;

/* JADX INFO: loaded from: classes2.dex */
public class SimpleMonthView extends MonthView {
    public SimpleMonthView(Context context, AttributeSet attributeSet, InterfaceC14816a interfaceC14816a) {
        super(context, attributeSet, interfaceC14816a);
    }

    @Override // com.wdullaer.materialdatetimepicker.date.MonthView
    /* JADX INFO: renamed from: c */
    public void mo86297c(Canvas canvas, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        if (this.f62140s == i3) {
            canvas.drawCircle(i4, i5 - (MonthView.f62104Q / 3), MonthView.f62108U, this.f62128g);
        }
        boolean zM86305l = m86305l(i, i2, i3);
        Paint paint = this.f62126e;
        if (zM86305l) {
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        } else {
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
        }
        if (this.f62122a.mo86267e0(i, i2, i3)) {
            this.f62126e.setColor(this.f62119K);
        } else if (this.f62140s == i3) {
            this.f62126e.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.f62126e.setColor(this.f62115G);
        } else if (this.f62139r && this.f62141t == i3) {
            this.f62126e.setColor(this.f62117I);
        } else {
            this.f62126e.setColor(m86305l(i, i2, i3) ? this.f62118J : this.f62114F);
        }
        canvas.drawText(String.format("%d", Integer.valueOf(i3)), i4, i5, this.f62126e);
    }
}
