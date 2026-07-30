package p147v;

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
import p149l.b6c0;
import p149l.b9c0;
import p149l.d43;
import p149l.p4c0;
import p149l.t0c0;
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VTag extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VIcon f209408a;

    /* JADX INFO: renamed from: b */
    public TextView f209409b;

    /* JADX INFO: renamed from: c */
    public VIcon f209410c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f209411d;

    /* JADX INFO: renamed from: e */
    public View f209412e;

    /* JADX INFO: renamed from: f */
    @ColorInt
    public int f209413f;

    /* JADX INFO: renamed from: g */
    public float f209414g;

    /* JADX INFO: renamed from: h */
    @ColorInt
    public int f209415h;

    /* JADX INFO: renamed from: i */
    public String f209416i;

    /* JADX INFO: renamed from: j */
    public int f209417j;

    /* JADX INFO: renamed from: k */
    @DrawableRes
    public int f209418k;

    /* JADX INFO: renamed from: l */
    @DrawableRes
    public int f209419l;

    /* JADX INFO: renamed from: m */
    @ColorInt
    public int f209420m;

    /* JADX INFO: renamed from: n */
    public int f209421n;

    /* JADX INFO: renamed from: o */
    public int f209422o;

    /* JADX INFO: renamed from: p */
    public int f209423p;

    /* JADX INFO: renamed from: q */
    public int f209424q;

    /* JADX INFO: renamed from: r */
    public int f209425r;

    /* JADX INFO: renamed from: s */
    public int f209426s;

    /* JADX INFO: renamed from: v.VTag$a */
    public class RunnableC22576a implements Runnable {
        public RunnableC22576a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f209411d;
            linearLayout.setBackground(vTag.m223241c(linearLayout.getWidth(), VTag.this.f209411d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$b */
    public class RunnableC22577b implements Runnable {
        public RunnableC22577b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f209411d;
            linearLayout.setBackground(vTag.m223241c(linearLayout.getWidth(), VTag.this.f209411d.getHeight()));
        }
    }

    /* JADX INFO: renamed from: v.VTag$c */
    public class RunnableC22578c implements Runnable {
        public RunnableC22578c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VTag vTag = VTag.this;
            LinearLayout linearLayout = vTag.f209411d;
            linearLayout.setBackground(vTag.m223241c(linearLayout.getWidth(), VTag.this.f209411d.getHeight()));
        }
    }

    public VTag(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223247i(context, attributeSet);
        m223246h(context);
    }

    /* JADX INFO: renamed from: a */
    public final Bitmap m223239a(Bitmap bitmap, float f) {
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
    public final Bitmap m223240b(Bitmap bitmap, int i, int i2) {
        Bitmap bitmapM109969a = d43.m109969a(bitmap, i2, true);
        new Canvas(bitmapM109969a).drawColor(i);
        return bitmapM109969a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public Drawable m223241c(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(m223239a(m223240b(bitmapCreateBitmap, this.f209415h, 14), this.f209425r));
        bitmapCreateBitmap.recycle();
        return bitmapDrawable;
    }

    /* JADX INFO: renamed from: d */
    public Drawable m223242d(float f, @ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(t100.m186890d(f));
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: e */
    public Drawable m223243e(float f, @ColorRes int i, float f2, @ColorRes int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i3 = this.f209415h;
        if (i3 != Integer.MAX_VALUE) {
            gradientDrawable.setColor(i3);
        } else {
            gradientDrawable.setColor(getResources().getColor(i));
        }
        gradientDrawable.setCornerRadius(t100.m186890d(f));
        gradientDrawable.setStroke(t100.m186890d(f2), getResources().getColor(i2));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: f */
    public final Drawable m223244f(float f, GradientDrawable.Orientation orientation, @ColorInt int i, @ColorInt int i2, float f2, int i3) {
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{i, i2});
        gradientDrawable.setCornerRadius(t100.m186890d(f));
        gradientDrawable.setStroke(t100.m186890d(f2), getResources().getColor(i3));
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: g */
    public final void m223245g(int i) {
        switch (i) {
            case 1:
                m223257s();
                break;
            case 2:
                m223258t();
                break;
            case 3:
                m223259u();
                break;
            case 4:
                m223249k();
                break;
            case 5:
                m223250l();
                break;
            case 6:
                m223251m();
                break;
            case 7:
                m223252n();
                break;
            case 8:
                m223253o();
                break;
            case 9:
                m223254p();
                break;
            case 10:
                m223255q();
                break;
            case 11:
                m223256r();
                break;
            default:
                m223249k();
                break;
        }
    }

    public LinearLayout getContainer() {
        return this.f209411d;
    }

    public TextView getContent() {
        return this.f209409b;
    }

    public ImageView getIvLeft() {
        return this.f209408a;
    }

    public ImageView getIvRight() {
        return this.f209410c;
    }

    /* JADX INFO: renamed from: h */
    public final void m223246h(Context context) {
        LayoutInflater.from(context).inflate(b6c0.f73797w, this);
        this.f209408a = (VIcon) findViewById(p4c0.f147086P0);
        this.f209409b = (TextView) findViewById(p4c0.f147082N0);
        this.f209410c = (VIcon) findViewById(p4c0.f147088Q0);
        this.f209411d = (LinearLayout) findViewById(p4c0.f147080M0);
        this.f209412e = findViewById(p4c0.f147084O0);
        this.f209409b.setText(this.f209416i);
        if (this.f209418k != 0) {
            this.f209408a.setVisibility(0);
            this.f209408a.setImageResource(this.f209418k);
        }
        if (this.f209419l != 0) {
            this.f209410c.setVisibility(0);
            this.f209410c.setImageResource(this.f209419l);
        }
        m223245g(this.f209417j);
        int i = this.f209413f;
        if (i != 1) {
            this.f209409b.setTextColor(i);
        }
        float f = this.f209414g;
        if (f != -1.0f) {
            this.f209409b.setTextSize(0, f);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m223247i(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74384Z4);
        this.f209416i = typedArrayObtainStyledAttributes.getString(b9c0.f74405c5);
        this.f209417j = typedArrayObtainStyledAttributes.getInt(b9c0.f74440h5, 0);
        this.f209413f = typedArrayObtainStyledAttributes.getColor(b9c0.f74398b5, 1);
        this.f209414g = typedArrayObtainStyledAttributes.getDimension(b9c0.f74391a5, -1.0f);
        this.f209415h = typedArrayObtainStyledAttributes.getColor(b9c0.f74412d5, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.f209418k = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74426f5, 0);
        this.f209419l = typedArrayObtainStyledAttributes.getResourceId(b9c0.f74433g5, 0);
        this.f209420m = typedArrayObtainStyledAttributes.getColor(b9c0.f74419e5, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: j */
    public void m223248j(VIcon vIcon, int i) {
        if (vIcon == this.f209408a || vIcon == this.f209410c) {
            vIcon.setIconStyle(i);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m223249k() {
        this.f209421n = 40;
        this.f209422o = 12;
        this.f209423p = 12;
        this.f209424q = 12;
        this.f209425r = 16;
        this.f209426s = 3;
        setContainerHeight(40);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167152d));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223243e(this.f209425r, t0c0.f167171w, this.f209426s, t0c0.f167167s));
    }

    /* JADX INFO: renamed from: l */
    public final void m223250l() {
        this.f209421n = 40;
        this.f209424q = 12;
        this.f209425r = 16;
        this.f209426s = 3;
        setContainerHeight(40);
        m223260v(this.f209408a, 10, 4);
        m223260v(this.f209409b, 0, 12);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167152d));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223243e(this.f209425r, t0c0.f167171w, this.f209426s, t0c0.f167167s));
    }

    /* JADX INFO: renamed from: m */
    public final void m223251m() {
        this.f209421n = 28;
        this.f209422o = 10;
        this.f209423p = 10;
        this.f209424q = 12;
        this.f209425r = 12;
        this.f209426s = 2;
        setContainerHeight(28);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167152d));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223243e(this.f209425r, t0c0.f167171w, this.f209426s, t0c0.f167167s));
    }

    /* JADX INFO: renamed from: n */
    public final void m223252n() {
        this.f209421n = 28;
        this.f209424q = 12;
        this.f209425r = 12;
        this.f209426s = 2;
        setContainerHeight(28);
        m223260v(this.f209408a, 8, 4);
        m223260v(this.f209409b, 0, 10);
        m223248j(this.f209408a, 1);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167152d));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223243e(this.f209425r, t0c0.f167171w, this.f209426s, t0c0.f167167s));
    }

    /* JADX INFO: renamed from: o */
    public final void m223253o() {
        this.f209421n = 24;
        this.f209422o = 8;
        this.f209423p = 8;
        this.f209424q = 12;
        this.f209425r = 6;
        this.f209426s = 0;
        setContainerHeight(24);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167171w));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223244f(this.f209425r, GradientDrawable.Orientation.LEFT_RIGHT, getResources().getColor(t0c0.f167168t), getResources().getColor(t0c0.f167169u), this.f209426s, t0c0.f167167s));
    }

    /* JADX INFO: renamed from: p */
    public final void m223254p() {
        this.f209421n = 24;
        this.f209422o = 8;
        this.f209423p = 8;
        this.f209424q = 12;
        this.f209425r = 6;
        setContainerHeight(24);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167171w));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.post(new RunnableC22576a());
    }

    /* JADX INFO: renamed from: q */
    public final void m223255q() {
        this.f209421n = 24;
        this.f209424q = 12;
        this.f209425r = 6;
        setContainerHeight(24);
        this.f209412e.setVisibility(0);
        this.f209412e.setBackground(m223242d(3.0f, this.f209420m));
        m223260v(this.f209412e, 6, 3);
        m223260v(this.f209409b, 0, 8);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167171w));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.post(new RunnableC22577b());
    }

    /* JADX INFO: renamed from: r */
    public final void m223256r() {
        this.f209421n = 24;
        this.f209424q = 12;
        this.f209425r = 6;
        setContainerHeight(24);
        m223260v(this.f209408a, 6, 4);
        m223260v(this.f209409b, 0, 8);
        m223248j(this.f209408a, 1);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167171w));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.post(new RunnableC22578c());
    }

    /* JADX INFO: renamed from: s */
    public final void m223257s() {
        this.f209421n = 44;
        this.f209422o = 16;
        this.f209423p = 16;
        this.f209424q = 14;
        this.f209425r = 16;
        this.f209426s = 3;
        setContainerHeight(44);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167152d));
        this.f209409b.setTextSize(this.f209424q);
        this.f209411d.setBackground(m223243e(this.f209425r, t0c0.f167171w, this.f209426s, t0c0.f167167s));
    }

    public void setBgColor(@ColorRes int i) {
        Drawable drawableMutate = this.f209411d.getBackground().mutate();
        if (drawableMutate instanceof GradientDrawable) {
            ((GradientDrawable) drawableMutate).setColor(getResources().getColor(i));
            this.f209411d.setBackground(drawableMutate);
        }
    }

    public void setContainerHeight(float f) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f209411d.getLayoutParams();
        layoutParams.height = t100.m186890d(f);
        this.f209411d.setLayoutParams(layoutParams);
    }

    public void setText(String str) {
        this.f209409b.setText(str);
    }

    public void setTextColor(@ColorRes int i) {
        this.f209409b.setTextColor(getResources().getColor(i));
    }

    /* JADX INFO: renamed from: t */
    public final void m223258t() {
        this.f209421n = 44;
        this.f209422o = 16;
        this.f209423p = 16;
        this.f209424q = 14;
        this.f209425r = 16;
        this.f209426s = 0;
        setContainerHeight(44);
        m223260v(this.f209409b, this.f209422o, this.f209423p);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167171w));
        this.f209409b.setTextSize(this.f209424q);
        LinearLayout linearLayout = this.f209411d;
        float f = this.f209425r;
        int i = t0c0.f167168t;
        linearLayout.setBackground(m223243e(f, i, this.f209426s, i));
    }

    /* JADX INFO: renamed from: u */
    public final void m223259u() {
        this.f209421n = 44;
        this.f209425r = 16;
        this.f209424q = 14;
        this.f209426s = 0;
        setContainerHeight(44);
        m223260v(this.f209409b, 16, 6);
        m223260v(this.f209410c, 0, 12);
        this.f209409b.setTextColor(getResources().getColor(t0c0.f167148F));
        this.f209409b.setTextSize(this.f209424q);
        LinearLayout linearLayout = this.f209411d;
        float f = this.f209425r;
        int i = t0c0.f167168t;
        linearLayout.setBackground(m223243e(f, i, this.f209426s, i));
    }

    /* JADX INFO: renamed from: v */
    public void m223260v(View view, int i, int i2) {
        if (view == this.f209408a || view == this.f209409b || view == this.f209410c || view == this.f209412e) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.setMarginStart(t100.m186890d(i));
            layoutParams.setMarginEnd(t100.m186890d(i2));
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
