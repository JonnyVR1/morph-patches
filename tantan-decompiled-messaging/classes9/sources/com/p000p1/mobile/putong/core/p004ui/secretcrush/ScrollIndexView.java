package com.p000p1.mobile.putong.core.p004ui.secretcrush;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.ig3;
import l.nu0;
import l.osk0;
import l.t100;
import p006l.w0c0;
import p006l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ScrollIndexView extends View {

    /* JADX INFO: renamed from: l */
    public static String f5539l = "HEART";

    /* JADX INFO: renamed from: m */
    public static String[] f5540m = {"HEART", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: n */
    public static int f5541n = t100.d(10.0f);

    /* JADX INFO: renamed from: a */
    public InterfaceC0278a f5542a;

    /* JADX INFO: renamed from: b */
    public int f5543b;

    /* JADX INFO: renamed from: c */
    public Paint f5544c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f5545d;

    /* JADX INFO: renamed from: e */
    public TextView f5546e;

    /* JADX INFO: renamed from: f */
    public ImageView f5547f;

    /* JADX INFO: renamed from: g */
    public Context f5548g;

    /* JADX INFO: renamed from: h */
    public float f5549h;

    /* JADX INFO: renamed from: i */
    public Typeface f5550i;

    /* JADX INFO: renamed from: j */
    public Bitmap f5551j;

    /* JADX INFO: renamed from: k */
    public RectF f5552k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.secretcrush.ScrollIndexView$a */
    public interface InterfaceC0278a {
        /* JADX INFO: renamed from: a */
        void m8311a(String str);
    }

    public ScrollIndexView(Context context) {
        super(context);
        this.f5543b = -1;
        this.f5544c = new Paint();
        this.f5552k = new RectF();
        m8310b(context);
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m8309a(Context context, int i) {
        Drawable drawableB = nu0.b(context, i);
        if (drawableB instanceof osk0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableB.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableB.draw(canvas);
            return bitmapCreateBitmap;
        }
        if (!(drawableB instanceof VectorDrawable)) {
            ig3.a("unsupported drawable type");
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableB.getIntrinsicWidth(), drawableB.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        drawableB.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        drawableB.draw(canvas2);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public void m8310b(Context context) {
        this.f5548g = context;
        this.f5550i = eqh0.c(2);
        this.f5551j = m8309a(context, x2c0.f25813Dr);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f5543b;
        InterfaceC0278a interfaceC0278a = this.f5542a;
        float height = y / getHeight();
        String[] strArr = f5540m;
        int length = (int) (height * strArr.length);
        if (action == 1 || action == 3) {
            this.f5543b = -1;
            if (NullChecker.a(this.f5545d)) {
                this.f5545d.setVisibility(4);
            }
        } else if (length >= 0 && length < strArr.length) {
            if (NullChecker.a(interfaceC0278a) && i != length) {
                interfaceC0278a.m8311a(f5540m[length]);
            }
            if (NullChecker.a(this.f5545d)) {
                boolean zEquals = f5540m[length].equals(f5539l);
                ImageView imageView = this.f5547f;
                if (zEquals) {
                    imageView.setVisibility(0);
                    this.f5546e.setVisibility(4);
                } else {
                    imageView.setVisibility(4);
                    this.f5546e.setVisibility(0);
                    this.f5546e.setText(f5540m[length]);
                }
                this.f5545d.setVisibility(0);
                FrameLayout frameLayout = this.f5545d;
                float f = this.f5549h;
                frameLayout.setTranslationY(y < f * 2.0f ? 0.0f : y - (f * 2.0f));
            }
            this.f5543b = length;
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getHeight() < t100.c().heightPixels / 2) {
            return;
        }
        int height = getHeight();
        int width = getWidth();
        float f = height * 1.0f;
        String[] strArr = f5540m;
        float length = f / strArr.length;
        this.f5549h = length;
        this.f5549h = (f - (length / 2.0f)) / strArr.length;
        this.f5544c.setColor(this.f5548g.getResources().getColor(w0c0.f24609G1));
        this.f5544c.setAntiAlias(true);
        this.f5544c.setTextSize(t100.d(10.0f));
        int i = 0;
        while (true) {
            String[] strArr2 = f5540m;
            if (i >= strArr2.length) {
                return;
            }
            int i2 = width / 2;
            float fMeasureText = i2 - (this.f5544c.measureText(strArr2[i]) / 2.0f);
            float f2 = this.f5549h;
            float f3 = (i * f2) + f2;
            if (f5540m[i].equals(f5539l)) {
                RectF rectF = this.f5552k;
                int i3 = f5541n;
                float f4 = this.f5549h;
                rectF.set(i2 - (i3 / 2), f4 - i3, i2 + (i3 / 2), f4);
                canvas.drawBitmap(this.f5551j, (Rect) null, this.f5552k, this.f5544c);
            } else {
                this.f5544c.setTypeface(this.f5550i);
                canvas.drawText(f5540m[i], fMeasureText, f3, this.f5544c);
            }
            i++;
        }
    }

    public void setDialog(FrameLayout frameLayout) {
        this.f5545d = frameLayout;
        this.f5546e = (TextView) frameLayout.getChildAt(0);
        this.f5547f = (ImageView) frameLayout.getChildAt(1);
    }

    public void setOnTouchingLetterChangedListener(InterfaceC0278a interfaceC0278a) {
        this.f5542a = interfaceC0278a;
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5543b = -1;
        this.f5544c = new Paint();
        this.f5552k = new RectF();
        m8310b(context);
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5543b = -1;
        this.f5544c = new Paint();
        this.f5552k = new RectF();
        m8310b(context);
    }
}
