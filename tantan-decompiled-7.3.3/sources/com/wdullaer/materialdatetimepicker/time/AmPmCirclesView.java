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
import p153l.j26;
import p153l.q9c0;
import p153l.tnk0;

/* JADX INFO: loaded from: classes2.dex */
public class AmPmCirclesView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f62173a;

    /* JADX INFO: renamed from: b */
    private int f62174b;

    /* JADX INFO: renamed from: c */
    private int f62175c;

    /* JADX INFO: renamed from: d */
    private int f62176d;

    /* JADX INFO: renamed from: e */
    private int f62177e;

    /* JADX INFO: renamed from: f */
    private int f62178f;

    /* JADX INFO: renamed from: g */
    private int f62179g;

    /* JADX INFO: renamed from: h */
    private int f62180h;

    /* JADX INFO: renamed from: i */
    private float f62181i;

    /* JADX INFO: renamed from: j */
    private float f62182j;

    /* JADX INFO: renamed from: k */
    private String f62183k;

    /* JADX INFO: renamed from: l */
    private String f62184l;

    /* JADX INFO: renamed from: m */
    private boolean f62185m;

    /* JADX INFO: renamed from: n */
    private boolean f62186n;

    /* JADX INFO: renamed from: o */
    private boolean f62187o;

    /* JADX INFO: renamed from: p */
    private boolean f62188p;

    /* JADX INFO: renamed from: q */
    private int f62189q;

    /* JADX INFO: renamed from: r */
    private int f62190r;

    /* JADX INFO: renamed from: s */
    private int f62191s;

    /* JADX INFO: renamed from: t */
    private int f62192t;

    /* JADX INFO: renamed from: u */
    private int f62193u;

    /* JADX INFO: renamed from: v */
    private int f62194v;

    public AmPmCirclesView(Context context) {
        super(context);
        this.f62173a = new Paint();
        this.f62187o = false;
    }

    /* JADX INFO: renamed from: a */
    public int m86330a(float f, float f2) {
        if (!this.f62188p) {
            return -1;
        }
        int i = this.f62192t;
        int i2 = (int) ((f2 - i) * (f2 - i));
        int i3 = this.f62190r;
        float f3 = i2;
        if (((int) Math.sqrt(((f - i3) * (f - i3)) + f3)) <= this.f62189q && !this.f62185m) {
            return 0;
        }
        int i4 = this.f62191s;
        return (((int) Math.sqrt((double) (((f - ((float) i4)) * (f - ((float) i4))) + f3))) > this.f62189q || this.f62186n) ? -1 : 1;
    }

    /* JADX INFO: renamed from: b */
    public void m86331b(Context context, InterfaceC14838a interfaceC14838a, int i) {
        if (this.f62187o) {
            Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
            return;
        }
        Resources resources = context.getResources();
        if (interfaceC14838a.mo86403z()) {
            this.f62176d = j26.m143190c(context, q9c0.f156221f);
            this.f62177e = j26.m143190c(context, q9c0.f156236u);
            this.f62179g = j26.m143190c(context, q9c0.f156226k);
            this.f62174b = 255;
        } else {
            this.f62176d = j26.m143190c(context, q9c0.f156236u);
            this.f62177e = j26.m143190c(context, q9c0.f156218c);
            this.f62179g = j26.m143190c(context, q9c0.f156225j);
            this.f62174b = 255;
        }
        int iMo86400u = interfaceC14838a.mo86400u();
        this.f62180h = iMo86400u;
        this.f62175c = tnk0.m191941a(iMo86400u);
        this.f62178f = j26.m143190c(context, q9c0.f156236u);
        this.f62173a.setTypeface(Typeface.create(resources.getString(R$string.f62018p), 0));
        this.f62173a.setAntiAlias(true);
        this.f62173a.setTextAlign(Paint.Align.CENTER);
        this.f62181i = Float.parseFloat(resources.getString(R$string.f62005c));
        this.f62182j = Float.parseFloat(resources.getString(R$string.f62003a));
        String[] amPmStrings = new DateFormatSymbols().getAmPmStrings();
        this.f62183k = amPmStrings[0];
        this.f62184l = amPmStrings[1];
        this.f62185m = interfaceC14838a.mo86395a();
        this.f62186n = interfaceC14838a.mo86398g();
        setAmOrPm(i);
        this.f62194v = -1;
        this.f62187o = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (getWidth() == 0 || !this.f62187o) {
            return;
        }
        if (!this.f62188p) {
            int width = getWidth() / 2;
            int height = getHeight() / 2;
            int iMin = (int) (Math.min(width, height) * this.f62181i);
            int i6 = (int) (iMin * this.f62182j);
            this.f62189q = i6;
            int i7 = (int) (((double) height) + (((double) i6) * 0.75d));
            this.f62173a.setTextSize((i6 * 3) / 4);
            int i8 = this.f62189q;
            this.f62192t = (i7 - (i8 / 2)) + iMin;
            this.f62190r = (width - iMin) + i8;
            this.f62191s = (width + iMin) - i8;
            this.f62188p = true;
        }
        int i9 = this.f62176d;
        int i10 = this.f62177e;
        int i11 = this.f62193u;
        if (i11 == 0) {
            i = this.f62180h;
            i3 = this.f62174b;
            i2 = i10;
            i10 = this.f62178f;
            i4 = 255;
            i5 = i9;
        } else if (i11 == 1) {
            int i12 = this.f62180h;
            int i13 = this.f62174b;
            i2 = this.f62178f;
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
        int i14 = this.f62194v;
        if (i14 == 0) {
            i = this.f62175c;
            i3 = this.f62174b;
        } else if (i14 == 1) {
            i5 = this.f62175c;
            i4 = this.f62174b;
        }
        if (this.f62185m) {
            i10 = this.f62179g;
            i = i9;
        }
        if (this.f62186n) {
            i2 = this.f62179g;
        } else {
            i9 = i5;
        }
        this.f62173a.setColor(i);
        this.f62173a.setAlpha(i3);
        canvas.drawCircle(this.f62190r, this.f62192t, this.f62189q, this.f62173a);
        this.f62173a.setColor(i9);
        this.f62173a.setAlpha(i4);
        canvas.drawCircle(this.f62191s, this.f62192t, this.f62189q, this.f62173a);
        this.f62173a.setColor(i10);
        float fDescent = this.f62192t - (((int) (this.f62173a.descent() + this.f62173a.ascent())) / 2);
        canvas.drawText(this.f62183k, this.f62190r, fDescent, this.f62173a);
        this.f62173a.setColor(i2);
        canvas.drawText(this.f62184l, this.f62191s, fDescent, this.f62173a);
    }

    public void setAmOrPm(int i) {
        this.f62193u = i;
    }

    public void setAmOrPmPressed(int i) {
        this.f62194v = i;
    }
}
