package com.p000p1.mobile.putong.core.newui.home.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import l.e9c0;
import l.f6c0;
import p009l.nsl;
import v.VFrame;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CardOperationButton extends VFrame implements nsl {

    /* JADX INFO: renamed from: a */
    public View f2488a;

    /* JADX INFO: renamed from: b */
    public View f2489b;

    /* JADX INFO: renamed from: c */
    public VIcon f2490c;

    /* JADX INFO: renamed from: d */
    @DrawableRes
    public int f2491d;

    /* JADX INFO: renamed from: e */
    @ColorInt
    public int f2492e;

    /* JADX INFO: renamed from: f */
    public int f2493f;

    /* JADX INFO: renamed from: g */
    public float f2494g;

    /* JADX INFO: renamed from: h */
    public int f2495h;

    /* JADX INFO: renamed from: i */
    public Drawable f2496i;

    /* JADX INFO: renamed from: j */
    public Drawable f2497j;

    /* JADX INFO: renamed from: k */
    public View f2498k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0213b f2499l;

    /* JADX INFO: renamed from: m */
    public boolean f2500m;

    /* JADX INFO: renamed from: n */
    public boolean f2501n;

    /* JADX INFO: renamed from: o */
    public Paint f2502o;

    /* JADX INFO: renamed from: p */
    public Path f2503p;

    /* JADX INFO: renamed from: q */
    public float f2504q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$a */
    public static class C0212a {
        /* JADX INFO: renamed from: b */
        public static void m3073b(CardOperationButton cardOperationButton, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            cardOperationButton.f2488a = viewGroup.getChildAt(0);
            cardOperationButton.f2489b = viewGroup.getChildAt(1);
            cardOperationButton.f2490c = viewGroup.getChildAt(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$b */
    public interface InterfaceC0213b {
        /* JADX INFO: renamed from: a */
        void mo1370a();

        /* JADX INFO: renamed from: b */
        void mo1371b();
    }

    public CardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2495h = -1;
        this.f2500m = true;
        this.f2504q = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.G);
        this.f2493f = typedArrayObtainStyledAttributes.getInt(e9c0.H, 3);
        this.f2491d = typedArrayObtainStyledAttributes.getResourceId(e9c0.L, -1);
        this.f2492e = typedArrayObtainStyledAttributes.getColor(e9c0.I, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.K, 1.5f);
        this.f2494g = f;
        this.f2494g = Math.min(Math.max(0.5f, f), 1.5f);
        this.f2495h = typedArrayObtainStyledAttributes.getResourceId(e9c0.J, -1);
        this.f2496i = typedArrayObtainStyledAttributes.getDrawable(e9c0.M);
        this.f2497j = typedArrayObtainStyledAttributes.getDrawable(e9c0.N);
        typedArrayObtainStyledAttributes.recycle();
        m3069z();
    }

    /* JADX INFO: renamed from: z */
    private void m3069z() {
        Paint paint = new Paint();
        this.f2502o = paint;
        paint.setColor(0);
        this.f2503p = new Path();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ boolean m3070B(View view) {
        this.f2501n = true;
        InterfaceC0213b interfaceC0213b = this.f2499l;
        if (interfaceC0213b != null) {
            interfaceC0213b.mo1370a();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.nsl
    /* JADX INFO: renamed from: a */
    public void mo2399a(float f, CardProgressAction cardProgressAction) {
        if (this.f2500m) {
            float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
            View view = this.f2489b;
            if (fMax > 0.0f) {
                view.setAlpha(fMax);
                this.f2490c.setColorFilter(this.f2492e);
            } else {
                view.setAlpha(0.0f);
                this.f2490c.clearColorFilter();
            }
            float f2 = ((this.f2494g - 1.0f) * fMax) + 1.0f;
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: c */
    public void mo2400c(CardProgressAction cardProgressAction) {
        if (this.f2500m) {
            mo2337j(0.0f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f2504q > 0.0f) {
            this.f2503p.reset();
            this.f2503p.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, Path.Direction.CCW);
            this.f2503p.close();
            this.f2502o.setShadowLayer(this.f2504q, 0.0f, 0.0f, 419430400);
            canvas.drawPath(this.f2503p, this.f2502o);
        }
        super/*android.view.View*/.dispatchDraw(canvas);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.nsl
    public View getRealView() {
        return this;
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: i */
    public void mo2336i() {
        if (this.f2500m) {
            reset();
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: j */
    public void mo2337j(float f) {
        mo2399a(f, CardProgressAction.UNKNOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        if (this.f2500m) {
            View viewInflate = View.inflate(getContext(), f6c0.P0, null);
            m3071w(viewInflate);
            addView(viewInflate);
            this.f2490c.setIconStyle(this.f2493f);
            if (this.f2495h != -1) {
                this.f2490c.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f2495h));
            }
            int i = this.f2491d;
            if (i != -1) {
                this.f2490c.setImageResource(i);
            }
            setNormalStateLayerBackground(this.f2496i);
            setPressedStateLayerBackground(this.f2497j);
            this.f2489b.setAlpha(0.0f);
        }
    }

    @Override // p009l.nsl
    public void reset() {
        mo2400c(CardProgressAction.UNKNOWN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setActivated(boolean z) {
        super/*android.view.View*/.setActivated(z);
        if (this.f2500m) {
            this.f2490c.setPressed(z);
            if (NullChecker.a(this.f2498k)) {
                this.f2498k.setPressed(z);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setHovered(boolean z) {
        super/*android.view.View*/.setHovered(z);
        if (this.f2500m) {
            this.f2490c.setHovered(z);
            if (NullChecker.a(this.f2498k)) {
                this.f2498k.setPressed(z);
            }
        }
    }

    public void setIconAlpha(float f) {
        if (this.f2500m) {
            this.f2490c.setAlpha(f);
        }
    }

    public void setIconPressStateColor(@ColorInt int i) {
        if (this.f2500m) {
            this.f2492e = i;
        }
    }

    public void setNormalStateIcon(int i) {
        if (this.f2500m) {
            this.f2490c.setImageResource(i);
        }
    }

    @Override // p009l.nsl
    public void setNormalStateLayerBackground(Drawable drawable) {
        if (this.f2500m) {
            this.f2488a.setBackground(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.nsl
    public void setOnLongPressListener(InterfaceC0213b interfaceC0213b) {
        this.f2499l = interfaceC0213b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.il4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f14685a.m3070B(view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setPressed(boolean z) {
        InterfaceC0213b interfaceC0213b;
        super/*android.view.View*/.setPressed(z);
        if (!z) {
            if (this.f2501n && (interfaceC0213b = this.f2499l) != null) {
                interfaceC0213b.mo1371b();
            }
            this.f2501n = false;
        }
        if (this.f2500m) {
            this.f2490c.setPressed(z);
            if (NullChecker.a(this.f2498k)) {
                this.f2498k.setPressed(z);
            }
            View view = this.f2489b;
            if (z) {
                view.setAlpha(1.0f);
                this.f2490c.setColorFilter(this.f2492e);
            } else {
                view.setAlpha(0.0f);
                this.f2490c.clearColorFilter();
            }
        }
    }

    @Override // p009l.nsl
    public void setPressedStateLayerBackground(Drawable drawable) {
        if (this.f2500m) {
            this.f2489b.setBackground(drawable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setShadowSize(float f) {
        this.f2504q = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m3071w(View view) {
        C0212a.m3073b(this, view);
    }

    public CardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardOperationButton(Context context) {
        this(context, null);
    }
}
