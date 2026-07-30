package com.p046p1.mobile.putong.core.p053ui.secretcrush;

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
import com.p046p1.mobile.putong.data.BloodType;
import com.tantanapp.common.utils.NullChecker;
import p149l.b2s;
import p149l.eqh0;
import p149l.ig3;
import p149l.j6f;
import p149l.nu0;
import p149l.osk0;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
public class ScrollIndexView extends View {

    /* JADX INFO: renamed from: l */
    public static String f35758l = "HEART";

    /* JADX INFO: renamed from: m */
    public static String[] f35759m = {"HEART", "A", "B", b2s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f38728O, "P", "Q", "R", j6f.LATITUDE_SOUTH, j6f.GPS_DIRECTION_TRUE, "U", j6f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: n */
    public static int f35760n = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: a */
    public InterfaceC8842a f35761a;

    /* JADX INFO: renamed from: b */
    public int f35762b;

    /* JADX INFO: renamed from: c */
    public Paint f35763c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f35764d;

    /* JADX INFO: renamed from: e */
    public TextView f35765e;

    /* JADX INFO: renamed from: f */
    public ImageView f35766f;

    /* JADX INFO: renamed from: g */
    public Context f35767g;

    /* JADX INFO: renamed from: h */
    public float f35768h;

    /* JADX INFO: renamed from: i */
    public Typeface f35769i;

    /* JADX INFO: renamed from: j */
    public Bitmap f35770j;

    /* JADX INFO: renamed from: k */
    public RectF f35771k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.secretcrush.ScrollIndexView$a */
    public interface InterfaceC8842a {
        /* JADX INFO: renamed from: a */
        void mo54947a(String str);
    }

    public ScrollIndexView(Context context) {
        super(context);
        this.f35762b = -1;
        this.f35763c = new Paint();
        this.f35771k = new RectF();
        m54946b(context);
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m54945a(Context context, int i) {
        Drawable drawableM161424b = nu0.m161424b(context, i);
        if (drawableM161424b instanceof osk0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM161424b.getIntrinsicWidth(), drawableM161424b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM161424b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM161424b.draw(canvas);
            return bitmapCreateBitmap;
        }
        if (!(drawableM161424b instanceof VectorDrawable)) {
            ig3.m135964a("unsupported drawable type");
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableM161424b.getIntrinsicWidth(), drawableM161424b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        drawableM161424b.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        drawableM161424b.draw(canvas2);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public void m54946b(Context context) {
        this.f35767g = context;
        this.f35769i = eqh0.m117752c(2);
        this.f35770j = m54945a(context, x2c0.f189277Dr);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f35762b;
        InterfaceC8842a interfaceC8842a = this.f35761a;
        float height = y / getHeight();
        String[] strArr = f35759m;
        int length = (int) (height * strArr.length);
        if (action == 1 || action == 3) {
            this.f35762b = -1;
            if (NullChecker.m81303a(this.f35764d)) {
                this.f35764d.setVisibility(4);
            }
        } else if (length >= 0 && length < strArr.length) {
            if (NullChecker.m81303a(interfaceC8842a) && i != length) {
                interfaceC8842a.mo54947a(f35759m[length]);
            }
            if (NullChecker.m81303a(this.f35764d)) {
                boolean zEquals = f35759m[length].equals(f35758l);
                ImageView imageView = this.f35766f;
                if (zEquals) {
                    imageView.setVisibility(0);
                    this.f35765e.setVisibility(4);
                } else {
                    imageView.setVisibility(4);
                    this.f35765e.setVisibility(0);
                    this.f35765e.setText(f35759m[length]);
                }
                this.f35764d.setVisibility(0);
                FrameLayout frameLayout = this.f35764d;
                float f = this.f35768h;
                frameLayout.setTranslationY(y < f * 2.0f ? 0.0f : y - (f * 2.0f));
            }
            this.f35762b = length;
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getHeight() < t100.m186889c().heightPixels / 2) {
            return;
        }
        int height = getHeight();
        int width = getWidth();
        float f = height * 1.0f;
        String[] strArr = f35759m;
        float length = f / strArr.length;
        this.f35768h = length;
        this.f35768h = (f - (length / 2.0f)) / strArr.length;
        this.f35763c.setColor(this.f35767g.getResources().getColor(w0c0.f183769G1));
        this.f35763c.setAntiAlias(true);
        this.f35763c.setTextSize(t100.m186890d(10.0f));
        int i = 0;
        while (true) {
            String[] strArr2 = f35759m;
            if (i >= strArr2.length) {
                return;
            }
            int i2 = width / 2;
            float fMeasureText = i2 - (this.f35763c.measureText(strArr2[i]) / 2.0f);
            float f2 = this.f35768h;
            float f3 = (i * f2) + f2;
            if (f35759m[i].equals(f35758l)) {
                RectF rectF = this.f35771k;
                int i3 = f35760n;
                float f4 = this.f35768h;
                rectF.set(i2 - (i3 / 2), f4 - i3, i2 + (i3 / 2), f4);
                canvas.drawBitmap(this.f35770j, (Rect) null, this.f35771k, this.f35763c);
            } else {
                this.f35763c.setTypeface(this.f35769i);
                canvas.drawText(f35759m[i], fMeasureText, f3, this.f35763c);
            }
            i++;
        }
    }

    public void setDialog(FrameLayout frameLayout) {
        this.f35764d = frameLayout;
        this.f35765e = (TextView) frameLayout.getChildAt(0);
        this.f35766f = (ImageView) frameLayout.getChildAt(1);
    }

    public void setOnTouchingLetterChangedListener(InterfaceC8842a interfaceC8842a) {
        this.f35761a = interfaceC8842a;
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35762b = -1;
        this.f35763c = new Paint();
        this.f35771k = new RectF();
        m54946b(context);
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35762b = -1;
        this.f35763c = new Paint();
        this.f35771k = new RectF();
        m54946b(context);
    }
}
