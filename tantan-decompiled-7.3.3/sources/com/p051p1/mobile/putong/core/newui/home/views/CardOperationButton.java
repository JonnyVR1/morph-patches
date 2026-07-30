package com.p051p1.mobile.putong.core.newui.home.views;

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
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantanapp.common.utils.NullChecker;
import p151v.VFrame;
import p151v.VIcon;
import p153l.avl;
import p153l.kec0;
import p153l.khc0;

/* JADX INFO: loaded from: classes11.dex */
public class CardOperationButton extends VFrame implements avl {

    /* JADX INFO: renamed from: a */
    public View f24452a;

    /* JADX INFO: renamed from: b */
    public View f24453b;

    /* JADX INFO: renamed from: c */
    public VIcon f24454c;

    /* JADX INFO: renamed from: d */
    @DrawableRes
    public int f24455d;

    /* JADX INFO: renamed from: e */
    @ColorInt
    public int f24456e;

    /* JADX INFO: renamed from: f */
    public int f24457f;

    /* JADX INFO: renamed from: g */
    public float f24458g;

    /* JADX INFO: renamed from: h */
    public int f24459h;

    /* JADX INFO: renamed from: i */
    public Drawable f24460i;

    /* JADX INFO: renamed from: j */
    public Drawable f24461j;

    /* JADX INFO: renamed from: k */
    public View f24462k;

    /* JADX INFO: renamed from: l */
    public InterfaceC8200b f24463l;

    /* JADX INFO: renamed from: m */
    public boolean f24464m;

    /* JADX INFO: renamed from: n */
    public boolean f24465n;

    /* JADX INFO: renamed from: o */
    public Paint f24466o;

    /* JADX INFO: renamed from: p */
    public Path f24467p;

    /* JADX INFO: renamed from: q */
    public float f24468q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$a */
    public static class C8199a {
        /* JADX INFO: renamed from: b */
        public static void m40069b(CardOperationButton cardOperationButton, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            cardOperationButton.f24452a = viewGroup.getChildAt(0);
            cardOperationButton.f24453b = viewGroup.getChildAt(1);
            cardOperationButton.f24454c = (VIcon) viewGroup.getChildAt(2);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.views.CardOperationButton$b */
    public interface InterfaceC8200b {
        /* JADX INFO: renamed from: a */
        void mo38402a();

        /* JADX INFO: renamed from: b */
        void mo38403b();
    }

    public CardOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24459h = -1;
        this.f24464m = true;
        this.f24468q = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126727G);
        this.f24457f = typedArrayObtainStyledAttributes.getInt(khc0.f126730H, 3);
        this.f24455d = typedArrayObtainStyledAttributes.getResourceId(khc0.f126742L, -1);
        this.f24456e = typedArrayObtainStyledAttributes.getColor(khc0.f126733I, -1);
        float f = typedArrayObtainStyledAttributes.getFloat(khc0.f126739K, 1.5f);
        this.f24458g = f;
        this.f24458g = Math.min(Math.max(0.5f, f), 1.5f);
        this.f24459h = typedArrayObtainStyledAttributes.getResourceId(khc0.f126736J, -1);
        this.f24460i = typedArrayObtainStyledAttributes.getDrawable(khc0.f126745M);
        this.f24461j = typedArrayObtainStyledAttributes.getDrawable(khc0.f126748N);
        typedArrayObtainStyledAttributes.recycle();
        m40065z();
    }

    /* JADX INFO: renamed from: z */
    private void m40065z() {
        Paint paint = new Paint();
        this.f24466o = paint;
        paint.setColor(0);
        this.f24467p = new Path();
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ boolean m40066B(View view) {
        this.f24465n = true;
        InterfaceC8200b interfaceC8200b = this.f24463l;
        if (interfaceC8200b != null) {
            interfaceC8200b.mo38402a();
        }
        return true;
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: a */
    public void mo39424a(float f, CardProgressAction cardProgressAction) {
        if (this.f24464m) {
            float fMax = Math.max(Math.min(f, 1.0f), 0.0f);
            View view = this.f24453b;
            if (fMax > 0.0f) {
                view.setAlpha(fMax);
                this.f24454c.setColorFilter(this.f24456e);
            } else {
                view.setAlpha(0.0f);
                this.f24454c.clearColorFilter();
            }
            float f2 = ((this.f24458g - 1.0f) * fMax) + 1.0f;
            setScaleX(f2);
            setScaleY(f2);
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: c */
    public void mo39425c(CardProgressAction cardProgressAction) {
        if (this.f24464m) {
            mo39362j(0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        if (this.f24468q > 0.0f) {
            this.f24467p.reset();
            this.f24467p.addCircle(getWidth() / 2, getHeight() / 2, getWidth() / 2, Path.Direction.CCW);
            this.f24467p.close();
            this.f24466o.setShadowLayer(this.f24468q, 0.0f, 0.0f, 419430400);
            canvas.drawPath(this.f24467p, this.f24466o);
        }
        super.dispatchDraw(canvas);
    }

    @Override // p153l.avl
    public View getRealView() {
        return this;
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: i */
    public void mo39361i() {
        if (this.f24464m) {
            reset();
        }
    }

    @Override // p153l.avl
    /* JADX INFO: renamed from: j */
    public void mo39362j(float f) {
        mo39424a(f, CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f24464m) {
            View viewInflate = View.inflate(getContext(), kec0.f125561P0, null);
            m40067w(viewInflate);
            addView(viewInflate);
            this.f24454c.setIconStyle(this.f24457f);
            if (this.f24459h != -1) {
                this.f24454c.setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), this.f24459h));
            }
            int i = this.f24455d;
            if (i != -1) {
                this.f24454c.setImageResource(i);
            }
            setNormalStateLayerBackground(this.f24460i);
            setPressedStateLayerBackground(this.f24461j);
            this.f24453b.setAlpha(0.0f);
        }
    }

    @Override // p153l.avl
    public void reset() {
        mo39425c(CardProgressAction.UNKNOWN);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f24464m) {
            this.f24454c.setPressed(z);
            if (NullChecker.m82486a(this.f24462k)) {
                this.f24462k.setPressed(z);
            }
        }
    }

    @Override // android.view.View
    public void setHovered(boolean z) {
        super.setHovered(z);
        if (this.f24464m) {
            this.f24454c.setHovered(z);
            if (NullChecker.m82486a(this.f24462k)) {
                this.f24462k.setPressed(z);
            }
        }
    }

    public void setIconAlpha(float f) {
        if (this.f24464m) {
            this.f24454c.setAlpha(f);
        }
    }

    public void setIconPressStateColor(@ColorInt int i) {
        if (this.f24464m) {
            this.f24456e = i;
        }
    }

    public void setNormalStateIcon(int i) {
        if (this.f24464m) {
            this.f24454c.setImageResource(i);
        }
    }

    @Override // p153l.avl
    public void setNormalStateLayerBackground(Drawable drawable) {
        if (this.f24464m) {
            this.f24452a.setBackground(drawable);
        }
    }

    @Override // p153l.avl
    public void setOnLongPressListener(InterfaceC8200b interfaceC8200b) {
        this.f24463l = interfaceC8200b;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hm4
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f110593a.m40066B(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC8200b interfaceC8200b;
        super.setPressed(z);
        if (!z) {
            if (this.f24465n && (interfaceC8200b = this.f24463l) != null) {
                interfaceC8200b.mo38403b();
            }
            this.f24465n = false;
        }
        if (this.f24464m) {
            this.f24454c.setPressed(z);
            if (NullChecker.m82486a(this.f24462k)) {
                this.f24462k.setPressed(z);
            }
            View view = this.f24453b;
            if (z) {
                view.setAlpha(1.0f);
                this.f24454c.setColorFilter(this.f24456e);
            } else {
                view.setAlpha(0.0f);
                this.f24454c.clearColorFilter();
            }
        }
    }

    @Override // p153l.avl
    public void setPressedStateLayerBackground(Drawable drawable) {
        if (this.f24464m) {
            this.f24453b.setBackground(drawable);
        }
    }

    public void setShadowSize(float f) {
        this.f24468q = f;
        invalidate();
    }

    /* JADX INFO: renamed from: w */
    public final void m40067w(View view) {
        C8199a.m40069b(this, view);
    }

    public CardOperationButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardOperationButton(Context context) {
        this(context, null);
    }
}
