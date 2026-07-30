package com.p046p1.mobile.putong.core.newui.home.views;

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
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import p147v.VFrame;
import p147v.VIcon;
import p149l.e9c0;
import p149l.f6c0;
import p149l.nsl;

/* JADX INFO: loaded from: classes11.dex */
public class CardOperationButton extends VFrame implements nsl {

    /* JADX INFO: renamed from: a */
    public View f23710a;

    /* JADX INFO: renamed from: b */
    public View f23711b;

    /* JADX INFO: renamed from: c */
    public VIcon f23712c;

    /* JADX INFO: renamed from: d */
    @DrawableRes
    public int f23713d;

    /* JADX INFO: renamed from: e */
    @ColorInt
    public int f23714e;

    /* JADX INFO: renamed from: f */
    public int f23715f;

    /* JADX INFO: renamed from: g */
    public float f23716g;

    /* JADX INFO: renamed from: h */
    public int f23717h;

    /* JADX INFO: renamed from: i */
    public Drawable f23718i;

    /* JADX INFO: renamed from: j */
    public Drawable f23719j;

    /* JADX INFO: renamed from: k */
    public View f23720k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8049b f23721l;

    /* JADX INFO: renamed from: m */
    public boolean f23722m;

    /* JADX INFO: renamed from: n */
    public boolean f23723n;

    /* JADX INFO: renamed from: o */
    public Paint f23724o;

    /* JADX INFO: renamed from: p */
    public Path f23725p;

    /* JADX INFO: renamed from: q */
    public float f23726q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$a */
    public static class C8048a {
        /* JADX INFO: renamed from: b */
        public static void m39066b(CardOperationButton cardOperationButton, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            cardOperationButton.f23710a = viewGroup.getChildAt(0);
            cardOperationButton.f23711b = viewGroup.getChildAt(1);
            cardOperationButton.f23712c = (VIcon) viewGroup.getChildAt(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$b */
    public interface InterfaceC8049b {
        /* JADX INFO: renamed from: a */
        void mo37399a();

        /* JADX INFO: renamed from: b */
        void mo37400b();
    }

    public CardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23717h = -1;
        this.f23722m = true;
        this.f23726q = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e9c0.f89957G);
        this.f23715f = typedArrayObtainStyledAttributes.getInt(e9c0.f89960H, 3);
        this.f23713d = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89972L, -1);
        this.f23714e = typedArrayObtainStyledAttributes.getColor(e9c0.f89963I, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(e9c0.f89969K, 1.5f);
        this.f23716g = f;
        this.f23716g = Math.min(Math.max(0.5f, f), 1.5f);
        this.f23717h = typedArrayObtainStyledAttributes.getResourceId(e9c0.f89966J, -1);
        this.f23718i = typedArrayObtainStyledAttributes.getDrawable(e9c0.f89975M);
        this.f23719j = typedArrayObtainStyledAttributes.getDrawable(e9c0.f89978N);
        typedArrayObtainStyledAttributes.recycle();
        m39062z();
    }

    /* JADX INFO: renamed from: z */
    private void m39062z() {
        Paint paint = new Paint();
        this.f23724o = paint;
        paint.setColor(0);
        this.f23725p = new Path();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ boolean m39063B(View view) {
        this.f23723n = true;
        InterfaceC8049b interfaceC8049b = this.f23721l;
        if (interfaceC8049b != null) {
            interfaceC8049b.mo37399a();
        }
        return true;
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: a */
    public void mo38421a(float f, CardProgressAction cardProgressAction) {
        if (this.f23722m) {
            float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
            View view = this.f23711b;
            if (fMax > 0.0f) {
                view.setAlpha(fMax);
                this.f23712c.setColorFilter(this.f23714e);
            } else {
                view.setAlpha(0.0f);
                this.f23712c.clearColorFilter();
            }
            float f2 = ((this.f23716g - 1.0f) * fMax) + 1.0f;
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: c */
    public void mo38422c(CardProgressAction cardProgressAction) {
        if (this.f23722m) {
            mo38359j(0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f23726q > 0.0f) {
            this.f23725p.reset();
            this.f23725p.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, Path.Direction.CCW);
            this.f23725p.close();
            this.f23724o.setShadowLayer(this.f23726q, 0.0f, 0.0f, 419430400);
            canvas.drawPath(this.f23725p, this.f23724o);
        }
        super.dispatchDraw(canvas);
    }

    @Override // p149l.nsl
    public View getRealView() {
        return this;
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: i */
    public void mo38358i() {
        if (this.f23722m) {
            reset();
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: j */
    public void mo38359j(float f) {
        mo38421a(f, CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f23722m) {
            View viewInflate = View.inflate(getContext(), f6c0.f95507P0, null);
            m39064w(viewInflate);
            addView(viewInflate);
            this.f23712c.setIconStyle(this.f23715f);
            if (this.f23717h != -1) {
                this.f23712c.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f23717h));
            }
            int i = this.f23713d;
            if (i != -1) {
                this.f23712c.setImageResource(i);
            }
            setNormalStateLayerBackground(this.f23718i);
            setPressedStateLayerBackground(this.f23719j);
            this.f23711b.setAlpha(0.0f);
        }
    }

    @Override // p149l.nsl
    public void reset() {
        mo38422c(CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f23722m) {
            this.f23712c.setPressed(z);
            if (NullChecker.m81303a(this.f23720k)) {
                this.f23720k.setPressed(z);
            }
        }
    }

    @Override // android.view.View
    public void setHovered(boolean z) {
        super.setHovered(z);
        if (this.f23722m) {
            this.f23712c.setHovered(z);
            if (NullChecker.m81303a(this.f23720k)) {
                this.f23720k.setPressed(z);
            }
        }
    }

    public void setIconAlpha(float f) {
        if (this.f23722m) {
            this.f23712c.setAlpha(f);
        }
    }

    public void setIconPressStateColor(@ColorInt int i) {
        if (this.f23722m) {
            this.f23714e = i;
        }
    }

    public void setNormalStateIcon(int i) {
        if (this.f23722m) {
            this.f23712c.setImageResource(i);
        }
    }

    @Override // p149l.nsl
    public void setNormalStateLayerBackground(Drawable drawable) {
        if (this.f23722m) {
            this.f23710a.setBackground(drawable);
        }
    }

    @Override // p149l.nsl
    public void setOnLongPressListener(InterfaceC8049b interfaceC8049b) {
        this.f23721l = interfaceC8049b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.il4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f113768a.m39063B(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC8049b interfaceC8049b;
        super.setPressed(z);
        if (!z) {
            if (this.f23723n && (interfaceC8049b = this.f23721l) != null) {
                interfaceC8049b.mo37400b();
            }
            this.f23723n = false;
        }
        if (this.f23722m) {
            this.f23712c.setPressed(z);
            if (NullChecker.m81303a(this.f23720k)) {
                this.f23720k.setPressed(z);
            }
            View view = this.f23711b;
            if (z) {
                view.setAlpha(1.0f);
                this.f23712c.setColorFilter(this.f23714e);
            } else {
                view.setAlpha(0.0f);
                this.f23712c.clearColorFilter();
            }
        }
    }

    @Override // p149l.nsl
    public void setPressedStateLayerBackground(Drawable drawable) {
        if (this.f23722m) {
            this.f23711b.setBackground(drawable);
        }
    }

    public void setShadowSize(float f) {
        this.f23726q = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m39064w(View view) {
        C8048a.m39066b(this, view);
    }

    public CardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardOperationButton(Context context) {
        this(context, null);
    }
}
