package com.wdullaer.materialdatetimepicker.time;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.wdullaer.materialdatetimepicker.R$string;
import java.text.DateFormatSymbols;
import p149l.e16;
import p149l.k1c0;
import p149l.nek0;

/* JADX INFO: loaded from: classes2.dex */
public class AmPmCirclesView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f61326a;

    /* JADX INFO: renamed from: b */
    private int f61327b;

    /* JADX INFO: renamed from: c */
    private int f61328c;

    /* JADX INFO: renamed from: d */
    private int f61329d;

    /* JADX INFO: renamed from: e */
    private int f61330e;

    /* JADX INFO: renamed from: f */
    private int f61331f;

    /* JADX INFO: renamed from: g */
    private int f61332g;

    /* JADX INFO: renamed from: h */
    private int f61333h;

    /* JADX INFO: renamed from: i */
    private float f61334i;

    /* JADX INFO: renamed from: j */
    private float f61335j;

    /* JADX INFO: renamed from: k */
    private String f61336k;

    /* JADX INFO: renamed from: l */
    private String f61337l;

    /* JADX INFO: renamed from: m */
    private boolean f61338m;

    /* JADX INFO: renamed from: n */
    private boolean f61339n;

    /* JADX INFO: renamed from: o */
    private boolean f61340o;

    /* JADX INFO: renamed from: p */
    private boolean f61341p;

    /* JADX INFO: renamed from: q */
    private int f61342q;

    /* JADX INFO: renamed from: r */
    private int f61343r;

    /* JADX INFO: renamed from: s */
    private int f61344s;

    /* JADX INFO: renamed from: t */
    private int f61345t;

    /* JADX INFO: renamed from: u */
    private int f61346u;

    /* JADX INFO: renamed from: v */
    private int f61347v;

    public AmPmCirclesView(Context context) {
        super(context);
        this.f61326a = new Paint();
        this.f61340o = false;
    }

    /* JADX INFO: renamed from: a */
    public int m85159a(float f, float f2) {
        if (!this.f61341p) {
            return -1;
        }
        int i = this.f61345t;
        int i2 = (int) ((f2 - i) * (f2 - i));
        int i3 = this.f61343r;
        float f3 = i2;
        if (((int) Math.sqrt(((f - i3) * (f - i3)) + f3)) <= this.f61342q && !this.f61338m) {
            return 0;
        }
        int i4 = this.f61344s;
        return (((int) Math.sqrt((double) (((f - ((float) i4)) * (f - ((float) i4))) + f3))) > this.f61342q || this.f61339n) ? -1 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void m85160b(Context context, InterfaceC14690a interfaceC14690a, int i) {
        if (this.f61340o) {
            Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        if (interfaceC14690a.mo85232z()) {
            this.f61329d = e16.m114375c(context, k1c0.f120563f);
            this.f61330e = e16.m114375c(context, k1c0.f120578u);
            this.f61332g = e16.m114375c(context, k1c0.f120568k);
            this.f61327b = 255;
        } else {
            this.f61329d = e16.m114375c(context, k1c0.f120578u);
            this.f61330e = e16.m114375c(context, k1c0.f120560c);
            this.f61332g = e16.m114375c(context, k1c0.f120567j);
            this.f61327b = 255;
        }
        int iMo85229u = interfaceC14690a.mo85229u();
        this.f61333h = iMo85229u;
        this.f61328c = nek0.m159111a(iMo85229u);
        this.f61331f = e16.m114375c(context, k1c0.f120578u);
        this.f61326a.setTypeface(Typeface.create(resources.getString(R$string.f61171p), 0));
        this.f61326a.setAntiAlias(true);
        this.f61326a.setTextAlign(Paint.Align.CENTER);
        this.f61334i = Float.parseFloat(resources.getString(R$string.f61158c));
        this.f61335j = Float.parseFloat(resources.getString(R$string.f61156a));
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f61336k = amPmStrings[0];
        this.f61337l = amPmStrings[1];
        this.f61338m = interfaceC14690a.mo85224a();
        this.f61339n = interfaceC14690a.mo85227g();
        setAmOrPm(i);
        this.f61347v = -1;
        this.f61340o = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (getWidth() == 0 || !this.f61340o) {
            return;
        }
        if (!this.f61341p) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int iMin = (int) (Math.min(width, height) * this.f61334i);
            int i6 = (int) (iMin * this.f61335j);
            this.f61342q = i6;
            int i7 = (int) (((double) height) + (((double) i6) * 0.75d));
            this.f61326a.setTextSize((i6 * 3) / 4);
            int i8 = this.f61342q;
            this.f61345t = (i7 - (i8 / 2)) + iMin;
            this.f61343r = (width - iMin) + i8;
            this.f61344s = (width + iMin) - i8;
            this.f61341p = true;
        }
        int i9 = this.f61329d;
        int i10 = this.f61330e;
        int i11 = this.f61346u;
        if (i11 == 0) {
            i = this.f61333h;
            i3 = this.f61327b;
            i2 = i10;
            i10 = this.f61331f;
            i4 = 255;
            i5 = i9;
        } else if (i11 == 1) {
            int i12 = this.f61333h;
            int i13 = this.f61327b;
            i2 = this.f61331f;
            i4 = i13;
            i3 = 255;
            i5 = i12;
            i = i9;
        } else {
            i = i9;
            i2 = i10;
            i3 = 255;
            i4 = 255;
            i5 = i;
        }
        int i14 = this.f61347v;
        if (i14 == 0) {
            i = this.f61328c;
            i3 = this.f61327b;
        } else if (i14 == 1) {
            i5 = this.f61328c;
            i4 = this.f61327b;
        }
        if (this.f61338m) {
            i10 = this.f61332g;
            i = i9;
        }
        if (this.f61339n) {
            i2 = this.f61332g;
        } else {
            i9 = i5;
        }
        this.f61326a.setColor(i);
        this.f61326a.setAlpha(i3);
        canvas.drawCircle(this.f61343r, this.f61345t, this.f61342q, this.f61326a);
        this.f61326a.setColor(i9);
        this.f61326a.setAlpha(i4);
        canvas.drawCircle(this.f61344s, this.f61345t, this.f61342q, this.f61326a);
        this.f61326a.setColor(i10);
        float fDescent = this.f61345t - (((int) (this.f61326a.descent() + this.f61326a.ascent())) / 2);
        canvas.drawText(this.f61336k, this.f61343r, fDescent, this.f61326a);
        this.f61326a.setColor(i2);
        canvas.drawText(this.f61337l, this.f61344s, fDescent, this.f61326a);
    }

    public void setAmOrPm(int i) {
        this.f61346u = i;
    }

    public void setAmOrPmPressed(int i) {
        this.f61347v = i;
    }
}
