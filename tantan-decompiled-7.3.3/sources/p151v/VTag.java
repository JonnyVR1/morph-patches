package p151v;

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
import com.google.android.gms.common.api.Api;
import p153l.gec0;
import p153l.hhc0;
import p153l.qa00;
import p153l.t43;
import p153l.vcc0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VTag extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f210330a;

    /* JADX INFO: renamed from: b */
    public TextView f210331b;

    /* JADX INFO: renamed from: c */
    public VIcon f210332c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f210333d;

    /* JADX INFO: renamed from: e */
    public View f210334e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f210335f;

    /* JADX INFO: renamed from: g */
    public float f210336g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f210337h;

    /* JADX INFO: renamed from: i */
    public String f210338i;

    /* JADX INFO: renamed from: j */
    public int f210339j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f210340k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f210341l;

    /* JADX INFO: renamed from: m */
    @ColorInt
    public int f210342m;

    /* JADX INFO: renamed from: n */
    public int f210343n;

    /* JADX INFO: renamed from: o */
    public int f210344o;

    /* JADX INFO: renamed from: p */
    public int f210345p;

    /* JADX INFO: renamed from: q */
    public int f210346q;

    /* JADX INFO: renamed from: r */
    public int f210347r;

    /* JADX INFO: renamed from: s */
    public int f210348s;

    /* JADX INFO: renamed from: v.VTag$a */
    public class RunnableC22691a implements Runnable {
        public RunnableC22691a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f210333d;
            linearLayout.setBackground(vTag.m224487c(linearLayout.getWidth(), VTag.this.f210333d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$b */
    public class RunnableC22692b implements Runnable {
        public RunnableC22692b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f210333d;
            linearLayout.setBackground(vTag.m224487c(linearLayout.getWidth(), VTag.this.f210333d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$c */
    public class RunnableC22693c implements Runnable {
        public RunnableC22693c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f210333d;
            linearLayout.setBackground(vTag.m224487c(linearLayout.getWidth(), VTag.this.f210333d.getHeight()));
        }
    }

    public VTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224493i(context, attributeSet);
        m224492h(context);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m224485a(Bitmap bitmap, float f) {
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
    public final Bitmap m224486b(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM189143a = t43.m189143a(bitmap, i2, true);
        new Canvas(bitmapM189143a).drawColor(i);
        return bitmapM189143a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Drawable m224487c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(m224485a(m224486b(bitmapCreateBitmap, this.f210337h, 14), this.f210347r));
        bitmapCreateBitmap.recycle();
        return bitmapDrawable;
    }

    /* JADX INFO: renamed from: d */
    public Drawable m224488d(float f, @ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(qa00.m175859d(f));
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m224489e(float f, @ColorRes int i, float f2, @ColorRes int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = this.f210337h;
        if (i3 != Integer.MAX_VALUE) {
            gradientDrawable.setColor(i3);
        } else {
            gradientDrawable.setColor(getResources().getColor(i));
        }
        gradientDrawable.setCornerRadius(qa00.m175859d(f));
        gradientDrawable.setStroke(qa00.m175859d(f2), getResources().getColor(i2));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m224490f(float f, GradientDrawable.Orientation orientation, @ColorInt int i, @ColorInt int i2, float f2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i2});
        gradientDrawable.setCornerRadius(qa00.m175859d(f));
        gradientDrawable.setStroke(qa00.m175859d(f2), getResources().getColor(i3));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    public final void m224491g(int i) {
        switch (i) {
            case 1:
                m224503s();
                break;
            case 2:
                m224504t();
                break;
            case 3:
                m224505u();
                break;
            case 4:
                m224495k();
                break;
            case 5:
                m224496l();
                break;
            case 6:
                m224497m();
                break;
            case 7:
                m224498n();
                break;
            case 8:
                m224499o();
                break;
            case 9:
                m224500p();
                break;
            case 10:
                m224501q();
                break;
            case 11:
                m224502r();
                break;
            default:
                m224495k();
                break;
        }
    }

    public LinearLayout getContainer() {
        return this.f210333d;
    }

    public TextView getContent() {
        return this.f210331b;
    }

    public ImageView getIvLeft() {
        return this.f210330a;
    }

    public ImageView getIvRight() {
        return this.f210332c;
    }

    /* JADX INFO: renamed from: h */
    public final void m224492h(Context context) {
        LayoutInflater.from(context).inflate(gec0.f103810w, this);
        this.f210330a = (VIcon) findViewById(vcc0.f183386P0);
        this.f210331b = (TextView) findViewById(vcc0.f183382N0);
        this.f210332c = (VIcon) findViewById(vcc0.f183388Q0);
        this.f210333d = (LinearLayout) findViewById(vcc0.f183380M0);
        this.f210334e = findViewById(vcc0.f183384O0);
        this.f210331b.setText(this.f210338i);
        if (this.f210340k != 0) {
            this.f210330a.setVisibility(0);
            this.f210330a.setImageResource(this.f210340k);
        }
        if (this.f210341l != 0) {
            this.f210332c.setVisibility(0);
            this.f210332c.setImageResource(this.f210341l);
        }
        m224491g(this.f210339j);
        int i = this.f210335f;
        if (i != 1) {
            this.f210331b.setTextColor(i);
        }
        float f = this.f210336g;
        if (f != -1.0f) {
            this.f210331b.setTextSize(0, f);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m224493i(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109693Z4);
        this.f210338i = typedArrayObtainStyledAttributes.getString(hhc0.f109714c5);
        this.f210339j = typedArrayObtainStyledAttributes.getInt(hhc0.f109749h5, 0);
        this.f210335f = typedArrayObtainStyledAttributes.getColor(hhc0.f109707b5, 1);
        this.f210336g = typedArrayObtainStyledAttributes.getDimension(hhc0.f109700a5, -1.0f);
        this.f210337h = typedArrayObtainStyledAttributes.getColor(hhc0.f109721d5, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f210340k = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109735f5, 0);
        this.f210341l = typedArrayObtainStyledAttributes.getResourceId(hhc0.f109742g5, 0);
        this.f210342m = typedArrayObtainStyledAttributes.getColor(hhc0.f109728e5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: j */
    public void m224494j(VIcon vIcon, int i) {
        if (vIcon == this.f210330a || vIcon == this.f210332c) {
            vIcon.setIconStyle(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m224495k() {
        this.f210343n = 40;
        this.f210344o = 12;
        this.f210345p = 12;
        this.f210346q = 12;
        this.f210347r = 16;
        this.f210348s = 3;
        setContainerHeight(40);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203343d));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224489e(this.f210347r, z8c0.f203362w, this.f210348s, z8c0.f203358s));
    }

    /* JADX INFO: renamed from: l */
    public final void m224496l() {
        this.f210343n = 40;
        this.f210346q = 12;
        this.f210347r = 16;
        this.f210348s = 3;
        setContainerHeight(40);
        m224506v(this.f210330a, 10, 4);
        m224506v(this.f210331b, 0, 12);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203343d));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224489e(this.f210347r, z8c0.f203362w, this.f210348s, z8c0.f203358s));
    }

    /* JADX INFO: renamed from: m */
    public final void m224497m() {
        this.f210343n = 28;
        this.f210344o = 10;
        this.f210345p = 10;
        this.f210346q = 12;
        this.f210347r = 12;
        this.f210348s = 2;
        setContainerHeight(28);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203343d));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224489e(this.f210347r, z8c0.f203362w, this.f210348s, z8c0.f203358s));
    }

    /* JADX INFO: renamed from: n */
    public final void m224498n() {
        this.f210343n = 28;
        this.f210346q = 12;
        this.f210347r = 12;
        this.f210348s = 2;
        setContainerHeight(28);
        m224506v(this.f210330a, 8, 4);
        m224506v(this.f210331b, 0, 10);
        m224494j(this.f210330a, 1);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203343d));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224489e(this.f210347r, z8c0.f203362w, this.f210348s, z8c0.f203358s));
    }

    /* JADX INFO: renamed from: o */
    public final void m224499o() {
        this.f210343n = 24;
        this.f210344o = 8;
        this.f210345p = 8;
        this.f210346q = 12;
        this.f210347r = 6;
        this.f210348s = 0;
        setContainerHeight(24);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203362w));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224490f(this.f210347r, GradientDrawable.Orientation.LEFT_RIGHT, getResources().getColor(z8c0.f203359t), getResources().getColor(z8c0.f203360u), this.f210348s, z8c0.f203358s));
    }

    /* JADX INFO: renamed from: p */
    public final void m224500p() {
        this.f210343n = 24;
        this.f210344o = 8;
        this.f210345p = 8;
        this.f210346q = 12;
        this.f210347r = 6;
        setContainerHeight(24);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203362w));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.post(new RunnableC22691a());
    }

    /* JADX INFO: renamed from: q */
    public final void m224501q() {
        this.f210343n = 24;
        this.f210346q = 12;
        this.f210347r = 6;
        setContainerHeight(24);
        this.f210334e.setVisibility(0);
        this.f210334e.setBackground(m224488d(3.0f, this.f210342m));
        m224506v(this.f210334e, 6, 3);
        m224506v(this.f210331b, 0, 8);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203362w));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.post(new RunnableC22692b());
    }

    /* JADX INFO: renamed from: r */
    public final void m224502r() {
        this.f210343n = 24;
        this.f210346q = 12;
        this.f210347r = 6;
        setContainerHeight(24);
        m224506v(this.f210330a, 6, 4);
        m224506v(this.f210331b, 0, 8);
        m224494j(this.f210330a, 1);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203362w));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.post(new RunnableC22693c());
    }

    /* JADX INFO: renamed from: s */
    public final void m224503s() {
        this.f210343n = 44;
        this.f210344o = 16;
        this.f210345p = 16;
        this.f210346q = 14;
        this.f210347r = 16;
        this.f210348s = 3;
        setContainerHeight(44);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203343d));
        this.f210331b.setTextSize(this.f210346q);
        this.f210333d.setBackground(m224489e(this.f210347r, z8c0.f203362w, this.f210348s, z8c0.f203358s));
    }

    public void setBgColor(@ColorRes int i) {
        Drawable drawableMutate = this.f210333d.getBackground().mutate();
        if (drawableMutate instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate).setColor(getResources().getColor(i));
            this.f210333d.setBackground(drawableMutate);
        }
    }

    public void setContainerHeight(float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f210333d.getLayoutParams();
        layoutParams.height = qa00.m175859d(f);
        this.f210333d.setLayoutParams(layoutParams);
    }

    public void setText(String str) {
        this.f210331b.setText(str);
    }

    public void setTextColor(@ColorRes int i) {
        this.f210331b.setTextColor(getResources().getColor(i));
    }

    /* JADX INFO: renamed from: t */
    public final void m224504t() {
        this.f210343n = 44;
        this.f210344o = 16;
        this.f210345p = 16;
        this.f210346q = 14;
        this.f210347r = 16;
        this.f210348s = 0;
        setContainerHeight(44);
        m224506v(this.f210331b, this.f210344o, this.f210345p);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203362w));
        this.f210331b.setTextSize(this.f210346q);
        LinearLayout linearLayout = this.f210333d;
        float f = this.f210347r;
        int i = z8c0.f203359t;
        linearLayout.setBackground(m224489e(f, i, this.f210348s, i));
    }

    /* JADX INFO: renamed from: u */
    public final void m224505u() {
        this.f210343n = 44;
        this.f210347r = 16;
        this.f210346q = 14;
        this.f210348s = 0;
        setContainerHeight(44);
        m224506v(this.f210331b, 16, 6);
        m224506v(this.f210332c, 0, 12);
        this.f210331b.setTextColor(getResources().getColor(z8c0.f203339F));
        this.f210331b.setTextSize(this.f210346q);
        LinearLayout linearLayout = this.f210333d;
        float f = this.f210347r;
        int i = z8c0.f203359t;
        linearLayout.setBackground(m224489e(f, i, this.f210348s, i));
    }

    /* JADX INFO: renamed from: v */
    public void m224506v(View view, int i, int i2) {
        if (view == this.f210330a || view == this.f210331b || view == this.f210332c || view == this.f210334e) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMarginStart(qa00.m175859d(i));
            layoutParams.setMarginEnd(qa00.m175859d(i2));
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
