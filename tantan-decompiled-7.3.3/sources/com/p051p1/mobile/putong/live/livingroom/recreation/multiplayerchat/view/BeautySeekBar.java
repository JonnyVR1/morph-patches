package com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import p153l.vhc0;

/* JADX INFO: loaded from: classes5.dex */
public class BeautySeekBar extends View {

    /* JADX INFO: renamed from: a */
    public AbstractC13066b f52301a;

    /* JADX INFO: renamed from: b */
    public boolean f52302b;

    public enum Style {
        NORMAL,
        CENTER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$a */
    public static class C13065a extends AbstractC13066b {

        /* JADX INFO: renamed from: i */
        public int f52303i;

        /* JADX INFO: renamed from: j */
        public int f52304j;

        public C13065a(TypedArray typedArray) {
            super(typedArray);
            this.f52303i = typedArray.getInt(vhc0.f184102M, -50);
            this.f52304j = typedArray.getInt(vhc0.f184104O, 50);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: c */
        public int mo77071c() {
            return this.f52305a.getIntrinsicHeight();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: e */
        public void mo77072e(Canvas canvas, int i, int i2, int i3, int i4) {
            int intrinsicHeight = this.f52306b.getIntrinsicHeight();
            int i5 = ((i4 - i2) - intrinsicHeight) / 2;
            this.f52306b.setBounds(0, i5, i3, intrinsicHeight + i5);
            this.f52306b.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: f */
        public void mo77073f(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = this.f52310f;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f52303i;
            if (i5 < i6) {
                this.f52310f = i6;
            } else {
                int i7 = this.f52304j;
                if (i5 > i7) {
                    this.f52310f = i7;
                }
            }
            int i8 = i4 - i2;
            int intrinsicHeight = this.f52307c.getIntrinsicHeight();
            int i9 = (i8 - intrinsicHeight) / 2;
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f52310f) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f52303i) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            int i10 = this.f52310f;
            Drawable drawable = this.f52307c;
            if (i10 < 0) {
                drawable.setBounds(iAbs2 - iAbs, i9, iAbs2, intrinsicHeight + i9);
            } else {
                drawable.setBounds(iAbs2, i9, iAbs + iAbs2, intrinsicHeight + i9);
            }
            this.f52307c.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: g */
        public void mo77074g(Canvas canvas, int i, int i2, int i3, int i4) {
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f52310f) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f52303i) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            int i5 = i4 - i2;
            int intrinsicHeight = this.f52305a.getIntrinsicHeight();
            int i6 = (i5 - intrinsicHeight) / 2;
            int intrinsicWidth = this.f52305a.getIntrinsicWidth();
            int i7 = this.f52310f;
            Drawable drawable = this.f52305a;
            if (i7 < 0) {
                int i8 = iAbs2 - iAbs;
                int i9 = intrinsicWidth / 2;
                drawable.setBounds(i8 - i9, i6, i8 + i9, intrinsicHeight + i6);
            } else {
                int i10 = iAbs2 + iAbs;
                int i11 = intrinsicWidth / 2;
                drawable.setBounds(i10 - i11, i6, i10 + i11, intrinsicHeight + i6);
            }
            this.f52305a.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: h */
        public void mo77075h(Canvas canvas, int i, int i2, int i3, int i4) {
            String strValueOf = String.valueOf(this.f52310f);
            float fMeasureText = this.f52311g.measureText(strValueOf);
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f52310f) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f52303i) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j)) * f);
            canvas.drawText(strValueOf, (this.f52310f < 0 ? iAbs2 - iAbs : iAbs2 + iAbs) - (fMeasureText / 2.0f), -this.f52311g.getFontMetrics().descent, this.f52311g);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: j */
        public void mo77076j(float f, int i) {
            int iAbs;
            int i2;
            float fAbs = (f / i) - ((Math.abs(this.f52303i) * 1.0f) / (Math.abs(this.f52303i) + this.f52304j));
            int i3 = this.f52303i;
            if (fAbs < 0.0f) {
                iAbs = Math.abs(i3);
                i2 = this.f52304j;
            } else {
                iAbs = Math.abs(i3);
                i2 = this.f52304j;
            }
            int i4 = (int) (fAbs * (iAbs + i2));
            if (i4 != this.f52310f) {
                m77081k(i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$b */
    public static abstract class AbstractC13066b {

        /* JADX INFO: renamed from: a */
        public Drawable f52305a;

        /* JADX INFO: renamed from: b */
        public Drawable f52306b;

        /* JADX INFO: renamed from: c */
        public Drawable f52307c;

        /* JADX INFO: renamed from: d */
        public int f52308d;

        /* JADX INFO: renamed from: e */
        public int f52309e;

        /* JADX INFO: renamed from: f */
        public int f52310f = 50;

        /* JADX INFO: renamed from: g */
        public Paint f52311g;

        /* JADX INFO: renamed from: h */
        public boolean f52312h;

        public AbstractC13066b(TypedArray typedArray) {
            this.f52305a = typedArray.getDrawable(vhc0.f184105P);
            this.f52306b = typedArray.getDrawable(vhc0.f184100K);
            this.f52307c = typedArray.getDrawable(vhc0.f184101L);
            this.f52308d = typedArray.getDimensionPixelSize(vhc0.f184108S, 0);
            this.f52309e = typedArray.getColor(vhc0.f184107R, 0);
            Paint paint = new Paint();
            this.f52311g = paint;
            paint.setAntiAlias(true);
            this.f52311g.setColor(this.f52309e);
            this.f52311g.setTextSize(this.f52308d);
        }

        /* JADX INFO: renamed from: b */
        public final void m77078b(Canvas canvas, int i, int i2, int i3, int i4) {
            mo77072e(canvas, i, i2, i3, i4);
            mo77073f(canvas, i, i2, i3, i4);
            mo77074g(canvas, i, i2, i3, i4);
            if (this.f52312h) {
                mo77075h(canvas, i, i2, i3, i4);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract int mo77071c();

        /* JADX INFO: renamed from: d */
        public int m77079d() {
            return this.f52310f;
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo77072e(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: f */
        public abstract void mo77073f(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: g */
        public abstract void mo77074g(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: h */
        public abstract void mo77075h(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: i */
        public void m77080i(boolean z) {
            this.f52312h = z;
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo77076j(float f, int i);

        /* JADX INFO: renamed from: k */
        public void m77081k(int i) {
            this.f52310f = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$c */
    public static class C13067c extends AbstractC13066b {

        /* JADX INFO: renamed from: i */
        public int f52313i;

        public C13067c(TypedArray typedArray) {
            super(typedArray);
            this.f52313i = typedArray.getInt(vhc0.f184103N, 100);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: c */
        public int mo77071c() {
            return this.f52305a.getIntrinsicHeight();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: e */
        public void mo77072e(Canvas canvas, int i, int i2, int i3, int i4) {
            int intrinsicHeight = this.f52306b.getIntrinsicHeight();
            int i5 = ((i4 - i2) - intrinsicHeight) / 2;
            this.f52306b.setBounds(0, i5, i3, intrinsicHeight + i5);
            this.f52306b.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: f */
        public void mo77073f(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = this.f52310f;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.f52313i;
            if (i5 > i6) {
                this.f52310f = i6;
            }
            int i7 = i4 - i2;
            int intrinsicHeight = this.f52307c.getIntrinsicHeight();
            int i8 = (i7 - intrinsicHeight) / 2;
            this.f52307c.setBounds(0, i8, (int) (((Math.abs(this.f52310f) * 1.0f) / this.f52313i) * (i3 - i)), intrinsicHeight + i8);
            this.f52307c.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: g */
        public void mo77074g(Canvas canvas, int i, int i2, int i3, int i4) {
            int iAbs = (int) (((Math.abs(this.f52310f) * 1.0f) / this.f52313i) * ((i3 - i) - this.f52305a.getIntrinsicWidth()));
            int i5 = i4 - i2;
            int intrinsicHeight = this.f52305a.getIntrinsicHeight();
            int i6 = (i5 - intrinsicHeight) / 2;
            this.f52305a.setBounds(iAbs, i6, this.f52305a.getIntrinsicWidth() + iAbs, intrinsicHeight + i6);
            this.f52305a.draw(canvas);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: h */
        public void mo77075h(Canvas canvas, int i, int i2, int i3, int i4) {
            String strValueOf = String.valueOf(this.f52310f);
            canvas.drawText(strValueOf, ((int) (((Math.abs(this.f52310f) * 1.0f) / this.f52313i) * (i3 - i))) - (this.f52311g.measureText(strValueOf) / 2.0f), -this.f52311g.getFontMetrics().descent, this.f52311g);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC13066b
        /* JADX INFO: renamed from: j */
        public void mo77076j(float f, int i) {
            int intrinsicWidth = (int) ((f / (i - this.f52305a.getIntrinsicWidth())) * 100.0f);
            int i2 = this.f52313i;
            if (intrinsicWidth > i2) {
                intrinsicWidth = i2;
            }
            if (intrinsicWidth != this.f52310f) {
                m77081k(intrinsicWidth);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$d */
    public interface InterfaceC13068d {
    }

    public BeautySeekBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184099J);
        Style style = Style.values()[typedArrayObtainStyledAttributes.getInt(vhc0.f184106Q, 0)];
        if (style == Style.NORMAL) {
            this.f52301a = new C13067c(typedArrayObtainStyledAttributes);
        } else if (style == Style.CENTER) {
            this.f52301a = new C13065a(typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m77070a(float f, int i) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = i;
        if (f > f2) {
            f = f2;
        }
        int iM77079d = this.f52301a.m77079d();
        this.f52301a.mo77076j(f, i);
        if (iM77079d != this.f52301a.m77079d()) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f52301a.m77078b(canvas, 0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = (ViewGroup) getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, View.resolveSizeAndState(this.f52301a.mo77071c() + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f52301a.m77080i(this.f52302b);
            m77070a(motionEvent.getX(), getWidth());
        } else if (action == 1) {
            this.f52301a.m77080i(this.f52302b);
            invalidate();
        } else if (action == 2) {
            m77070a(motionEvent.getX(), getWidth());
        } else if (action == 3) {
            this.f52301a.m77080i(this.f52302b);
            invalidate();
        }
        return true;
    }

    public void setDrawText(boolean z) {
        this.f52302b = z;
    }

    public void setOnSeekBarChangeListener(InterfaceC13068d interfaceC13068d) {
    }

    public void setProgress(int i) {
        this.f52301a.m77081k(i);
        invalidate();
    }

    public BeautySeekBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautySeekBar(Context context) {
        this(context, null);
    }
}
