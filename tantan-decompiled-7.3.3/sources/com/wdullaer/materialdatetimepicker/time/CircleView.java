package com.wdullaer.materialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.R$string;
import p153l.j26;
import p153l.q9c0;

/* JADX INFO: loaded from: classes2.dex */
public class CircleView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f62195a;

    /* JADX INFO: renamed from: b */
    private boolean f62196b;

    /* JADX INFO: renamed from: c */
    private int f62197c;

    /* JADX INFO: renamed from: d */
    private int f62198d;

    /* JADX INFO: renamed from: e */
    private float f62199e;

    /* JADX INFO: renamed from: f */
    private float f62200f;

    /* JADX INFO: renamed from: g */
    private boolean f62201g;

    /* JADX INFO: renamed from: h */
    private boolean f62202h;

    /* JADX INFO: renamed from: i */
    private int f62203i;

    /* JADX INFO: renamed from: j */
    private int f62204j;

    /* JADX INFO: renamed from: k */
    private int f62205k;

    public CircleView(Context context) {
        super(context);
        this.f62195a = new Paint();
        this.f62201g = false;
    }

    /* JADX INFO: renamed from: a */
    public void m86332a(Context context, InterfaceC14838a interfaceC14838a) {
        if (this.f62201g) {
            Log.e("CircleView", "CircleView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f62197c = j26.m143190c(context, interfaceC14838a.mo86403z() ? q9c0.f156221f : q9c0.f156222g);
        this.f62198d = interfaceC14838a.mo86400u();
        this.f62195a.setAntiAlias(true);
        boolean zMo86397f = interfaceC14838a.mo86397f();
        this.f62196b = zMo86397f;
        if (zMo86397f || interfaceC14838a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f62199e = Float.parseFloat(resources.getString(R$string.f62006d));
        } else {
            this.f62199e = Float.parseFloat(resources.getString(R$string.f62005c));
            this.f62200f = Float.parseFloat(resources.getString(R$string.f62003a));
        }
        this.f62201g = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f62201g) {
            return;
        }
        if (!this.f62202h) {
            this.f62203i = getWidth() / 2;
            int height = getHeight() / 2;
            this.f62204j = height;
            int iMin = (int) (Math.min(this.f62203i, height) * this.f62199e);
            this.f62205k = iMin;
            if (!this.f62196b) {
                this.f62204j = (int) (((double) this.f62204j) - (((double) ((int) (iMin * this.f62200f))) * 0.75d));
            }
            this.f62202h = true;
        }
        this.f62195a.setColor(this.f62197c);
        canvas.drawCircle(this.f62203i, this.f62204j, this.f62205k, this.f62195a);
        this.f62195a.setColor(this.f62198d);
        canvas.drawCircle(this.f62203i, this.f62204j, 8.0f, this.f62195a);
    }
}
