package com.p051p1.mobile.putong.core.p058ui.secretcrush;

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
import com.p051p1.mobile.putong.data.BloodType;
import com.tantanapp.common.utils.NullChecker;
import p153l.c4s;
import p153l.c9c0;
import p153l.dbc0;
import p153l.lyh0;
import p153l.p7f;
import p153l.qa00;
import p153l.tu0;
import p153l.u1l0;
import p153l.wg3;

/* JADX INFO: loaded from: classes12.dex */
public class ScrollIndexView extends View {

    /* JADX INFO: renamed from: l */
    public static String f36606l = "HEART";

    /* JADX INFO: renamed from: m */
    public static String[] f36607m = {"HEART", "A", "B", c4s.C_ZONE, "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", BloodType.f39576O, "P", "Q", "R", p7f.LATITUDE_SOUTH, p7f.GPS_DIRECTION_TRUE, "U", p7f.GPS_MEASUREMENT_INTERRUPTED, "W", "X", "Y", "Z", "#"};

    /* JADX INFO: renamed from: n */
    public static int f36608n = qa00.m175859d(10.0f);

    /* JADX INFO: renamed from: a */
    public InterfaceC9005a f36609a;

    /* JADX INFO: renamed from: b */
    public int f36610b;

    /* JADX INFO: renamed from: c */
    public Paint f36611c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f36612d;

    /* JADX INFO: renamed from: e */
    public TextView f36613e;

    /* JADX INFO: renamed from: f */
    public ImageView f36614f;

    /* JADX INFO: renamed from: g */
    public Context f36615g;

    /* JADX INFO: renamed from: h */
    public float f36616h;

    /* JADX INFO: renamed from: i */
    public Typeface f36617i;

    /* JADX INFO: renamed from: j */
    public Bitmap f36618j;

    /* JADX INFO: renamed from: k */
    public RectF f36619k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.secretcrush.ScrollIndexView$a */
    public interface InterfaceC9005a {
        /* JADX INFO: renamed from: a */
        void mo56130a(String str);
    }

    public ScrollIndexView(Context context) {
        super(context);
        this.f36610b = -1;
        this.f36611c = new Paint();
        this.f36619k = new RectF();
        m56129b(context);
    }

    /* JADX INFO: renamed from: a */
    public static Bitmap m56128a(Context context, int i) {
        Drawable drawableM192702b = tu0.m192702b(context, i);
        if (drawableM192702b instanceof u1l0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableM192702b.getIntrinsicWidth(), drawableM192702b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableM192702b.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawableM192702b.draw(canvas);
            return bitmapCreateBitmap;
        }
        if (!(drawableM192702b instanceof VectorDrawable)) {
            wg3.m206174a("unsupported drawable type");
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(drawableM192702b.getIntrinsicWidth(), drawableM192702b.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        drawableM192702b.setBounds(0, 0, canvas2.getWidth(), canvas2.getHeight());
        drawableM192702b.draw(canvas2);
        return bitmapCreateBitmap2;
    }

    /* JADX INFO: renamed from: b */
    public void m56129b(Context context) {
        this.f36615g = context;
        this.f36617i = lyh0.m156283c(2);
        this.f36618j = m56128a(context, dbc0.f87395rs);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.f36610b;
        InterfaceC9005a interfaceC9005a = this.f36609a;
        float height = y / getHeight();
        String[] strArr = f36607m;
        int length = (int) (height * strArr.length);
        if (action == 1 || action == 3) {
            this.f36610b = -1;
            if (NullChecker.m82486a(this.f36612d)) {
                this.f36612d.setVisibility(4);
            }
        } else if (length >= 0 && length < strArr.length) {
            if (NullChecker.m82486a(interfaceC9005a) && i != length) {
                interfaceC9005a.mo56130a(f36607m[length]);
            }
            if (NullChecker.m82486a(this.f36612d)) {
                boolean zEquals = f36607m[length].equals(f36606l);
                ImageView imageView = this.f36614f;
                if (zEquals) {
                    imageView.setVisibility(0);
                    this.f36613e.setVisibility(4);
                } else {
                    imageView.setVisibility(4);
                    this.f36613e.setVisibility(0);
                    this.f36613e.setText(f36607m[length]);
                }
                this.f36612d.setVisibility(0);
                FrameLayout frameLayout = this.f36612d;
                float f = this.f36616h;
                frameLayout.setTranslationY(y < f * 2.0f ? 0.0f : y - (f * 2.0f));
            }
            this.f36610b = length;
        }
        return true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getHeight() < qa00.m175858c().heightPixels / 2) {
            return;
        }
        int height = getHeight();
        int width = getWidth();
        float f = height * 1.0f;
        String[] strArr = f36607m;
        float length = f / strArr.length;
        this.f36616h = length;
        this.f36616h = (f - (length / 2.0f)) / strArr.length;
        this.f36611c.setColor(this.f36615g.getResources().getColor(c9c0.f80341H1));
        this.f36611c.setAntiAlias(true);
        this.f36611c.setTextSize(qa00.m175859d(10.0f));
        int i = 0;
        while (true) {
            String[] strArr2 = f36607m;
            if (i >= strArr2.length) {
                return;
            }
            int i2 = width / 2;
            float fMeasureText = i2 - (this.f36611c.measureText(strArr2[i]) / 2.0f);
            float f2 = this.f36616h;
            float f3 = (i * f2) + f2;
            if (f36607m[i].equals(f36606l)) {
                RectF rectF = this.f36619k;
                int i3 = f36608n;
                float f4 = this.f36616h;
                rectF.set(i2 - (i3 / 2), f4 - i3, i2 + (i3 / 2), f4);
                canvas.drawBitmap(this.f36618j, (Rect) null, this.f36619k, this.f36611c);
            } else {
                this.f36611c.setTypeface(this.f36617i);
                canvas.drawText(f36607m[i], fMeasureText, f3, this.f36611c);
            }
            i++;
        }
    }

    public void setDialog(FrameLayout frameLayout) {
        this.f36612d = frameLayout;
        this.f36613e = (TextView) frameLayout.getChildAt(0);
        this.f36614f = (ImageView) frameLayout.getChildAt(1);
    }

    public void setOnTouchingLetterChangedListener(InterfaceC9005a interfaceC9005a) {
        this.f36609a = interfaceC9005a;
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36610b = -1;
        this.f36611c = new Paint();
        this.f36619k = new RectF();
        m56129b(context);
    }

    public ScrollIndexView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f36610b = -1;
        this.f36611c = new Paint();
        this.f36619k = new RectF();
        m56129b(context);
    }
}
