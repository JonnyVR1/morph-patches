package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.b6c0;
import l.b9c0;
import l.d43;
import l.p4c0;
import l.t0c0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VTag extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f13033a;

    /* JADX INFO: renamed from: b */
    public TextView f13034b;

    /* JADX INFO: renamed from: c */
    public VIcon f13035c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f13036d;

    /* JADX INFO: renamed from: e */
    public View f13037e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f13038f;

    /* JADX INFO: renamed from: g */
    public float f13039g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f13040h;

    /* JADX INFO: renamed from: i */
    public String f13041i;

    /* JADX INFO: renamed from: j */
    public int f13042j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f13043k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f13044l;

    /* JADX INFO: renamed from: m */
    @ColorInt
    public int f13045m;

    /* JADX INFO: renamed from: n */
    public int f13046n;

    /* JADX INFO: renamed from: o */
    public int f13047o;

    /* JADX INFO: renamed from: p */
    public int f13048p;

    /* JADX INFO: renamed from: q */
    public int f13049q;

    /* JADX INFO: renamed from: r */
    public int f13050r;

    /* JADX INFO: renamed from: s */
    public int f13051s;

    /* JADX INFO: renamed from: v.VTag$a */
    public class RunnableC1369a implements Runnable {
        public RunnableC1369a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f13036d;
            linearLayout.setBackground(vTag.m11727c(linearLayout.getWidth(), VTag.this.f13036d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$b */
    public class RunnableC1370b implements Runnable {
        public RunnableC1370b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f13036d;
            linearLayout.setBackground(vTag.m11727c(linearLayout.getWidth(), VTag.this.f13036d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$c */
    public class RunnableC1371c implements Runnable {
        public RunnableC1371c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f13036d;
            linearLayout.setBackground(vTag.m11727c(linearLayout.getWidth(), VTag.this.f13036d.getHeight()));
        }
    }

    public VTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11733i(context, attributeSet);
        m11732h(context);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m11725a(Bitmap bitmap, float f) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(rect);
        canvas.drawARGB(0, 0, 0, 0);
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect, rect, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m11726b(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapA = d43.a(bitmap, i2, true);
        new Canvas(bitmapA).drawColor(i);
        return bitmapA;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Drawable m11727c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(m11725a(m11726b(bitmapCreateBitmap, this.f13040h, 14), this.f13050r));
        bitmapCreateBitmap.recycle();
        return bitmapDrawable;
    }

    /* JADX INFO: renamed from: d */
    public Drawable m11728d(float f, @ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.d(f));
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m11729e(float f, @ColorRes int i, float f2, @ColorRes int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = this.f13040h;
        if (i3 != Integer.MAX_VALUE) {
            gradientDrawable.setColor(i3);
        } else {
            gradientDrawable.setColor(getResources().getColor(i));
        }
        gradientDrawable.setCornerRadius(t100.d(f));
        gradientDrawable.setStroke(t100.d(f2), getResources().getColor(i2));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m11730f(float f, GradientDrawable.Orientation orientation, @ColorInt int i, @ColorInt int i2, float f2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i2});
        gradientDrawable.setCornerRadius(t100.d(f));
        gradientDrawable.setStroke(t100.d(f2), getResources().getColor(i3));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    public final void m11731g(int i) {
        switch (i) {
            case 1:
                m11743s();
                break;
            case 2:
                m11744t();
                break;
            case 3:
                m11745u();
                break;
            case 4:
                m11735k();
                break;
            case 5:
                m11736l();
                break;
            case 6:
                m11737m();
                break;
            case 7:
                m11738n();
                break;
            case 8:
                m11739o();
                break;
            case 9:
                m11740p();
                break;
            case 10:
                m11741q();
                break;
            case 11:
                m11742r();
                break;
            default:
                m11735k();
                break;
        }
    }

    public LinearLayout getContainer() {
        return this.f13036d;
    }

    public TextView getContent() {
        return this.f13034b;
    }

    public ImageView getIvLeft() {
        return this.f13033a;
    }

    public ImageView getIvRight() {
        return this.f13035c;
    }

    /* JADX INFO: renamed from: h */
    public final void m11732h(Context context) {
        LayoutInflater.from(context).inflate(b6c0.w, this);
        this.f13033a = (VIcon) findViewById(p4c0.P0);
        this.f13034b = (TextView) findViewById(p4c0.N0);
        this.f13035c = (VIcon) findViewById(p4c0.Q0);
        this.f13036d = (LinearLayout) findViewById(p4c0.M0);
        this.f13037e = findViewById(p4c0.O0);
        this.f13034b.setText(this.f13041i);
        if (this.f13043k != 0) {
            this.f13033a.setVisibility(0);
            this.f13033a.setImageResource(this.f13043k);
        }
        if (this.f13044l != 0) {
            this.f13035c.setVisibility(0);
            this.f13035c.setImageResource(this.f13044l);
        }
        m11731g(this.f13042j);
        int i = this.f13038f;
        if (i != 1) {
            this.f13034b.setTextColor(i);
        }
        float f = this.f13039g;
        if (f != -1.0f) {
            this.f13034b.setTextSize(0, f);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m11733i(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.Z4);
        this.f13041i = typedArrayObtainStyledAttributes.getString(b9c0.c5);
        this.f13042j = typedArrayObtainStyledAttributes.getInt(b9c0.h5, 0);
        this.f13038f = typedArrayObtainStyledAttributes.getColor(b9c0.b5, 1);
        this.f13039g = typedArrayObtainStyledAttributes.getDimension(b9c0.a5, -1.0f);
        this.f13040h = typedArrayObtainStyledAttributes.getColor(b9c0.d5, Integer.MAX_VALUE);
        this.f13043k = typedArrayObtainStyledAttributes.getResourceId(b9c0.f5, 0);
        this.f13044l = typedArrayObtainStyledAttributes.getResourceId(b9c0.g5, 0);
        this.f13045m = typedArrayObtainStyledAttributes.getColor(b9c0.e5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: j */
    public void m11734j(VIcon vIcon, int i) {
        if (vIcon == this.f13033a || vIcon == this.f13035c) {
            vIcon.setIconStyle(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m11735k() {
        this.f13046n = 40;
        this.f13047o = 12;
        this.f13048p = 12;
        this.f13049q = 12;
        this.f13050r = 16;
        this.f13051s = 3;
        setContainerHeight(40);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.d));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11729e(this.f13050r, t0c0.w, this.f13051s, t0c0.s));
    }

    /* JADX INFO: renamed from: l */
    public final void m11736l() {
        this.f13046n = 40;
        this.f13049q = 12;
        this.f13050r = 16;
        this.f13051s = 3;
        setContainerHeight(40);
        m11746v(this.f13033a, 10, 4);
        m11746v(this.f13034b, 0, 12);
        this.f13034b.setTextColor(getResources().getColor(t0c0.d));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11729e(this.f13050r, t0c0.w, this.f13051s, t0c0.s));
    }

    /* JADX INFO: renamed from: m */
    public final void m11737m() {
        this.f13046n = 28;
        this.f13047o = 10;
        this.f13048p = 10;
        this.f13049q = 12;
        this.f13050r = 12;
        this.f13051s = 2;
        setContainerHeight(28);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.d));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11729e(this.f13050r, t0c0.w, this.f13051s, t0c0.s));
    }

    /* JADX INFO: renamed from: n */
    public final void m11738n() {
        this.f13046n = 28;
        this.f13049q = 12;
        this.f13050r = 12;
        this.f13051s = 2;
        setContainerHeight(28);
        m11746v(this.f13033a, 8, 4);
        m11746v(this.f13034b, 0, 10);
        m11734j(this.f13033a, 1);
        this.f13034b.setTextColor(getResources().getColor(t0c0.d));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11729e(this.f13050r, t0c0.w, this.f13051s, t0c0.s));
    }

    /* JADX INFO: renamed from: o */
    public final void m11739o() {
        this.f13046n = 24;
        this.f13047o = 8;
        this.f13048p = 8;
        this.f13049q = 12;
        this.f13050r = 6;
        this.f13051s = 0;
        setContainerHeight(24);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.w));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11730f(this.f13050r, GradientDrawable.Orientation.LEFT_RIGHT, getResources().getColor(t0c0.t), getResources().getColor(t0c0.u), this.f13051s, t0c0.s));
    }

    /* JADX INFO: renamed from: p */
    public final void m11740p() {
        this.f13046n = 24;
        this.f13047o = 8;
        this.f13048p = 8;
        this.f13049q = 12;
        this.f13050r = 6;
        setContainerHeight(24);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.w));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.post(new RunnableC1369a());
    }

    /* JADX INFO: renamed from: q */
    public final void m11741q() {
        this.f13046n = 24;
        this.f13049q = 12;
        this.f13050r = 6;
        setContainerHeight(24);
        this.f13037e.setVisibility(0);
        this.f13037e.setBackground(m11728d(3.0f, this.f13045m));
        m11746v(this.f13037e, 6, 3);
        m11746v(this.f13034b, 0, 8);
        this.f13034b.setTextColor(getResources().getColor(t0c0.w));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.post(new RunnableC1370b());
    }

    /* JADX INFO: renamed from: r */
    public final void m11742r() {
        this.f13046n = 24;
        this.f13049q = 12;
        this.f13050r = 6;
        setContainerHeight(24);
        m11746v(this.f13033a, 6, 4);
        m11746v(this.f13034b, 0, 8);
        m11734j(this.f13033a, 1);
        this.f13034b.setTextColor(getResources().getColor(t0c0.w));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.post(new RunnableC1371c());
    }

    /* JADX INFO: renamed from: s */
    public final void m11743s() {
        this.f13046n = 44;
        this.f13047o = 16;
        this.f13048p = 16;
        this.f13049q = 14;
        this.f13050r = 16;
        this.f13051s = 3;
        setContainerHeight(44);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.d));
        this.f13034b.setTextSize(this.f13049q);
        this.f13036d.setBackground(m11729e(this.f13050r, t0c0.w, this.f13051s, t0c0.s));
    }

    public void setBgColor(@ColorRes int i) {
        Drawable drawableMutate = this.f13036d.getBackground().mutate();
        if (drawableMutate instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate).setColor(getResources().getColor(i));
            this.f13036d.setBackground(drawableMutate);
        }
    }

    public void setContainerHeight(float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f13036d.getLayoutParams();
        layoutParams.height = t100.d(f);
        this.f13036d.setLayoutParams(layoutParams);
    }

    public void setText(String str) {
        this.f13034b.setText(str);
    }

    public void setTextColor(@ColorRes int i) {
        this.f13034b.setTextColor(getResources().getColor(i));
    }

    /* JADX INFO: renamed from: t */
    public final void m11744t() {
        this.f13046n = 44;
        this.f13047o = 16;
        this.f13048p = 16;
        this.f13049q = 14;
        this.f13050r = 16;
        this.f13051s = 0;
        setContainerHeight(44);
        m11746v(this.f13034b, this.f13047o, this.f13048p);
        this.f13034b.setTextColor(getResources().getColor(t0c0.w));
        this.f13034b.setTextSize(this.f13049q);
        LinearLayout linearLayout = this.f13036d;
        float f = this.f13050r;
        int i = t0c0.t;
        linearLayout.setBackground(m11729e(f, i, this.f13051s, i));
    }

    /* JADX INFO: renamed from: u */
    public final void m11745u() {
        this.f13046n = 44;
        this.f13050r = 16;
        this.f13049q = 14;
        this.f13051s = 0;
        setContainerHeight(44);
        m11746v(this.f13034b, 16, 6);
        m11746v(this.f13035c, 0, 12);
        this.f13034b.setTextColor(getResources().getColor(t0c0.F));
        this.f13034b.setTextSize(this.f13049q);
        LinearLayout linearLayout = this.f13036d;
        float f = this.f13050r;
        int i = t0c0.t;
        linearLayout.setBackground(m11729e(f, i, this.f13051s, i));
    }

    /* JADX INFO: renamed from: v */
    public void m11746v(View view, int i, int i2) {
        if (view == this.f13033a || view == this.f13034b || view == this.f13035c || view == this.f13037e) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMarginStart(t100.d(i));
            layoutParams.setMarginEnd(t100.d(i2));
            view.setLayoutParams(layoutParams);
        }
    }

    public VTag(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VTag(@NonNull Context context) {
        this(context, null);
    }
}
