package com.wdullaer.materialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.R$string;
import p149l.e16;
import p149l.k1c0;

/* JADX INFO: loaded from: classes2.dex */
public class CircleView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f61348a;

    /* JADX INFO: renamed from: b */
    private boolean f61349b;

    /* JADX INFO: renamed from: c */
    private int f61350c;

    /* JADX INFO: renamed from: d */
    private int f61351d;

    /* JADX INFO: renamed from: e */
    private float f61352e;

    /* JADX INFO: renamed from: f */
    private float f61353f;

    /* JADX INFO: renamed from: g */
    private boolean f61354g;

    /* JADX INFO: renamed from: h */
    private boolean f61355h;

    /* JADX INFO: renamed from: i */
    private int f61356i;

    /* JADX INFO: renamed from: j */
    private int f61357j;

    /* JADX INFO: renamed from: k */
    private int f61358k;

    public CircleView(Context context) {
        super(context);
        this.f61348a = new Paint();
        this.f61354g = false;
    }

    /* JADX INFO: renamed from: a */
    public void m85161a(Context context, InterfaceC14690a interfaceC14690a) {
        if (this.f61354g) {
            Log.e("CircleView", "CircleView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        this.f61350c = e16.m114375c(context, interfaceC14690a.mo85232z() ? k1c0.f120563f : k1c0.f120564g);
        this.f61351d = interfaceC14690a.mo85229u();
        this.f61348a.setAntiAlias(true);
        boolean zMo85226f = interfaceC14690a.mo85226f();
        this.f61349b = zMo85226f;
        if (zMo85226f || interfaceC14690a.getVersion() != TimePickerDialog.Version.VERSION_1) {
            this.f61352e = Float.parseFloat(resources.getString(R$string.f61159d));
        } else {
            this.f61352e = Float.parseFloat(resources.getString(R$string.f61158c));
            this.f61353f = Float.parseFloat(resources.getString(R$string.f61156a));
        }
        this.f61354g = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f61354g) {
            return;
        }
        if (!this.f61355h) {
            this.f61356i = getWidth() / 2;
            int height = getHeight() / 2;
            this.f61357j = height;
            int iMin = (int) (Math.min(this.f61356i, height) * this.f61352e);
            this.f61358k = iMin;
            if (!this.f61349b) {
                this.f61357j = (int) (((double) this.f61357j) - (((double) ((int) (iMin * this.f61353f))) * 0.75d));
            }
            this.f61355h = true;
        }
        this.f61348a.setColor(this.f61350c);
        canvas.drawCircle(this.f61356i, this.f61357j, this.f61358k, this.f61348a);
        this.f61348a.setColor(this.f61351d);
        canvas.drawCircle(this.f61356i, this.f61357j, 8.0f, this.f61348a);
    }
}
