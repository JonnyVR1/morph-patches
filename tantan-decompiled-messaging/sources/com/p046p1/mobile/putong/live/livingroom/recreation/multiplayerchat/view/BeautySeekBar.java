package com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view;

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
import p149l.p9c0;

/* JADX INFO: loaded from: classes5.dex */
public class BeautySeekBar extends View {

    /* JADX INFO: renamed from: a */
    public AbstractC12903b f51453a;

    /* JADX INFO: renamed from: b */
    public boolean f51454b;

    public enum Style {
        NORMAL,
        CENTER
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$a */
    public static class C12902a extends AbstractC12903b {

        /* JADX INFO: renamed from: i */
        public int f51455i;

        /* JADX INFO: renamed from: j */
        public int f51456j;

        public C12902a(TypedArray typedArray) {
            super(typedArray);
            this.f51455i = typedArray.getInt(p9c0.f147703M, -50);
            this.f51456j = typedArray.getInt(p9c0.f147705O, 50);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: c */
        public int mo75888c() {
            return this.f51457a.getIntrinsicHeight();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: e */
        public void mo75889e(Canvas canvas, int i, int i2, int i3, int i4) {
            int intrinsicHeight = this.f51458b.getIntrinsicHeight();
            int i5 = ((i4 - i2) - intrinsicHeight) / 2;
            this.f51458b.setBounds(0, i5, i3, intrinsicHeight + i5);
            this.f51458b.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: f */
        public void mo75890f(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = this.f51462f;
            if (i5 == 0) {
                return;
            }
            int i6 = this.f51455i;
            if (i5 < i6) {
                this.f51462f = i6;
            } else {
                int i7 = this.f51456j;
                if (i5 > i7) {
                    this.f51462f = i7;
                }
            }
            int i8 = i4 - i2;
            int intrinsicHeight = this.f51459c.getIntrinsicHeight();
            int i9 = (i8 - intrinsicHeight) / 2;
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f51462f) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f51455i) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            int i10 = this.f51462f;
            Drawable drawable = this.f51459c;
            if (i10 < 0) {
                drawable.setBounds(iAbs2 - iAbs, i9, iAbs2, intrinsicHeight + i9);
            } else {
                drawable.setBounds(iAbs2, i9, iAbs + iAbs2, intrinsicHeight + i9);
            }
            this.f51459c.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: g */
        public void mo75891g(Canvas canvas, int i, int i2, int i3, int i4) {
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f51462f) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f51455i) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            int i5 = i4 - i2;
            int intrinsicHeight = this.f51457a.getIntrinsicHeight();
            int i6 = (i5 - intrinsicHeight) / 2;
            int intrinsicWidth = this.f51457a.getIntrinsicWidth();
            int i7 = this.f51462f;
            Drawable drawable = this.f51457a;
            if (i7 < 0) {
                int i8 = iAbs2 - iAbs;
                int i9 = intrinsicWidth / 2;
                drawable.setBounds(i8 - i9, i6, i8 + i9, intrinsicHeight + i6);
            } else {
                int i10 = iAbs2 + iAbs;
                int i11 = intrinsicWidth / 2;
                drawable.setBounds(i10 - i11, i6, i10 + i11, intrinsicHeight + i6);
            }
            this.f51457a.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: h */
        public void mo75892h(Canvas canvas, int i, int i2, int i3, int i4) {
            String strValueOf = String.valueOf(this.f51462f);
            float fMeasureText = this.f51463g.measureText(strValueOf);
            float f = i3 - i;
            int iAbs = (int) (((Math.abs(this.f51462f) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            int iAbs2 = (int) (((Math.abs(this.f51455i) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j)) * f);
            canvas.drawText(strValueOf, (this.f51462f < 0 ? iAbs2 - iAbs : iAbs2 + iAbs) - (fMeasureText / 2.0f), -this.f51463g.getFontMetrics().descent, this.f51463g);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: j */
        public void mo75893j(float f, int i) {
            int iAbs;
            int i2;
            float fAbs = (f / i) - ((Math.abs(this.f51455i) * 1.0f) / (Math.abs(this.f51455i) + this.f51456j));
            int i3 = this.f51455i;
            if (fAbs < 0.0f) {
                iAbs = Math.abs(i3);
                i2 = this.f51456j;
            } else {
                iAbs = Math.abs(i3);
                i2 = this.f51456j;
            }
            int i4 = (int) (fAbs * (iAbs + i2));
            if (i4 != this.f51462f) {
                m75898k(i4);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$b */
    public static abstract class AbstractC12903b {

        /* JADX INFO: renamed from: a */
        public Drawable f51457a;

        /* JADX INFO: renamed from: b */
        public Drawable f51458b;

        /* JADX INFO: renamed from: c */
        public Drawable f51459c;

        /* JADX INFO: renamed from: d */
        public int f51460d;

        /* JADX INFO: renamed from: e */
        public int f51461e;

        /* JADX INFO: renamed from: f */
        public int f51462f = 50;

        /* JADX INFO: renamed from: g */
        public Paint f51463g;

        /* JADX INFO: renamed from: h */
        public boolean f51464h;

        public AbstractC12903b(TypedArray typedArray) {
            this.f51457a = typedArray.getDrawable(p9c0.f147706P);
            this.f51458b = typedArray.getDrawable(p9c0.f147701K);
            this.f51459c = typedArray.getDrawable(p9c0.f147702L);
            this.f51460d = typedArray.getDimensionPixelSize(p9c0.f147709S, 0);
            this.f51461e = typedArray.getColor(p9c0.f147708R, 0);
            Paint paint = new Paint();
            this.f51463g = paint;
            paint.setAntiAlias(true);
            this.f51463g.setColor(this.f51461e);
            this.f51463g.setTextSize(this.f51460d);
        }

        /* JADX INFO: renamed from: b */
        public final void m75895b(Canvas canvas, int i, int i2, int i3, int i4) {
            mo75889e(canvas, i, i2, i3, i4);
            mo75890f(canvas, i, i2, i3, i4);
            mo75891g(canvas, i, i2, i3, i4);
            if (this.f51464h) {
                mo75892h(canvas, i, i2, i3, i4);
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract int mo75888c();

        /* JADX INFO: renamed from: d */
        public int m75896d() {
            return this.f51462f;
        }

        /* JADX INFO: renamed from: e */
        public abstract void mo75889e(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: f */
        public abstract void mo75890f(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: g */
        public abstract void mo75891g(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: h */
        public abstract void mo75892h(Canvas canvas, int i, int i2, int i3, int i4);

        /* JADX INFO: renamed from: i */
        public void m75897i(boolean z) {
            this.f51464h = z;
        }

        /* JADX INFO: renamed from: j */
        public abstract void mo75893j(float f, int i);

        /* JADX INFO: renamed from: k */
        public void m75898k(int i) {
            this.f51462f = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$c */
    public static class C12904c extends AbstractC12903b {

        /* JADX INFO: renamed from: i */
        public int f51465i;

        public C12904c(TypedArray typedArray) {
            super(typedArray);
            this.f51465i = typedArray.getInt(p9c0.f147704N, 100);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: c */
        public int mo75888c() {
            return this.f51457a.getIntrinsicHeight();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: e */
        public void mo75889e(Canvas canvas, int i, int i2, int i3, int i4) {
            int intrinsicHeight = this.f51458b.getIntrinsicHeight();
            int i5 = ((i4 - i2) - intrinsicHeight) / 2;
            this.f51458b.setBounds(0, i5, i3, intrinsicHeight + i5);
            this.f51458b.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: f */
        public void mo75890f(Canvas canvas, int i, int i2, int i3, int i4) {
            int i5 = this.f51462f;
            if (i5 <= 0) {
                return;
            }
            int i6 = this.f51465i;
            if (i5 > i6) {
                this.f51462f = i6;
            }
            int i7 = i4 - i2;
            int intrinsicHeight = this.f51459c.getIntrinsicHeight();
            int i8 = (i7 - intrinsicHeight) / 2;
            this.f51459c.setBounds(0, i8, (int) (((Math.abs(this.f51462f) * 1.0f) / this.f51465i) * (i3 - i)), intrinsicHeight + i8);
            this.f51459c.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: g */
        public void mo75891g(Canvas canvas, int i, int i2, int i3, int i4) {
            int iAbs = (int) (((Math.abs(this.f51462f) * 1.0f) / this.f51465i) * ((i3 - i) - this.f51457a.getIntrinsicWidth()));
            int i5 = i4 - i2;
            int intrinsicHeight = this.f51457a.getIntrinsicHeight();
            int i6 = (i5 - intrinsicHeight) / 2;
            this.f51457a.setBounds(iAbs, i6, this.f51457a.getIntrinsicWidth() + iAbs, intrinsicHeight + i6);
            this.f51457a.draw(canvas);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: h */
        public void mo75892h(Canvas canvas, int i, int i2, int i3, int i4) {
            String strValueOf = String.valueOf(this.f51462f);
            canvas.drawText(strValueOf, ((int) (((Math.abs(this.f51462f) * 1.0f) / this.f51465i) * (i3 - i))) - (this.f51463g.measureText(strValueOf) / 2.0f), -this.f51463g.getFontMetrics().descent, this.f51463g);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar.AbstractC12903b
        /* JADX INFO: renamed from: j */
        public void mo75893j(float f, int i) {
            int intrinsicWidth = (int) ((f / (i - this.f51457a.getIntrinsicWidth())) * 100.0f);
            int i2 = this.f51465i;
            if (intrinsicWidth > i2) {
                intrinsicWidth = i2;
            }
            if (intrinsicWidth != this.f51462f) {
                m75898k(intrinsicWidth);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.BeautySeekBar$d */
    public interface InterfaceC12905d {
    }

    public BeautySeekBar(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147700J);
        Style style = Style.values()[typedArrayObtainStyledAttributes.getInt(p9c0.f147707Q, 0)];
        if (style == Style.NORMAL) {
            this.f51453a = new C12904c(typedArrayObtainStyledAttributes);
        } else if (style == Style.CENTER) {
            this.f51453a = new C12902a(typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public final void m75887a(float f, int i) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = i;
        if (f > f2) {
            f = f2;
        }
        int iM75896d = this.f51453a.m75896d();
        this.f51453a.mo75893j(f, i);
        if (iM75896d != this.f51453a.m75896d()) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        this.f51453a.m75895b(canvas, 0, 0, getWidth(), getHeight());
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
        setMeasuredDimension(i, View.resolveSizeAndState(this.f51453a.mo75888c() + getPaddingTop() + getPaddingBottom(), i2, 0));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f51453a.m75897i(this.f51454b);
            m75887a(motionEvent.getX(), getWidth());
        } else if (action == 1) {
            this.f51453a.m75897i(this.f51454b);
            invalidate();
        } else if (action == 2) {
            m75887a(motionEvent.getX(), getWidth());
        } else if (action == 3) {
            this.f51453a.m75897i(this.f51454b);
            invalidate();
        }
        return true;
    }

    public void setDrawText(boolean z) {
        this.f51454b = z;
    }

    public void setOnSeekBarChangeListener(InterfaceC12905d interfaceC12905d) {
    }

    public void setProgress(int i) {
        this.f51453a.m75898k(i);
        invalidate();
    }

    public BeautySeekBar(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BeautySeekBar(Context context) {
        this(context, null);
    }
}
