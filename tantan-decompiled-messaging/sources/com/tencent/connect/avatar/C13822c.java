package com.tencent.connect.avatar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/* JADX INFO: renamed from: com.tencent.connect.avatar.c */
/* JADX INFO: loaded from: classes13.dex */
public class C13822c extends ImageView {

    /* JADX INFO: renamed from: a */
    final String f57155a;

    /* JADX INFO: renamed from: b */
    public boolean f57156b;

    /* JADX INFO: renamed from: c */
    private Matrix f57157c;

    /* JADX INFO: renamed from: d */
    private Matrix f57158d;

    /* JADX INFO: renamed from: e */
    private int f57159e;

    /* JADX INFO: renamed from: f */
    private float f57160f;

    /* JADX INFO: renamed from: g */
    private float f57161g;

    /* JADX INFO: renamed from: h */
    private Bitmap f57162h;

    /* JADX INFO: renamed from: i */
    private boolean f57163i;

    /* JADX INFO: renamed from: j */
    private float f57164j;

    /* JADX INFO: renamed from: k */
    private float f57165k;

    /* JADX INFO: renamed from: l */
    private PointF f57166l;

    /* JADX INFO: renamed from: m */
    private PointF f57167m;

    /* JADX INFO: renamed from: n */
    private float f57168n;

    /* JADX INFO: renamed from: o */
    private float f57169o;

    /* JADX INFO: renamed from: p */
    private Rect f57170p;

    public C13822c(Context context) {
        super(context);
        this.f57157c = new Matrix();
        this.f57158d = new Matrix();
        this.f57159e = 0;
        this.f57160f = 1.0f;
        this.f57161g = 1.0f;
        this.f57163i = false;
        this.f57155a = "TouchView";
        this.f57166l = new PointF();
        this.f57167m = new PointF();
        this.f57168n = 1.0f;
        this.f57169o = 0.0f;
        this.f57156b = false;
        Rect rect = new Rect();
        this.f57170p = rect;
        getDrawingRect(rect);
        m82132a();
    }

    /* JADX INFO: renamed from: a */
    private void m82133a(PointF pointF) {
        if (this.f57162h == null) {
            return;
        }
        float[] fArr = new float[9];
        this.f57157c.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        float f3 = fArr[0];
        float width = this.f57162h.getWidth() * f3;
        float height = this.f57162h.getHeight() * f3;
        Rect rect = this.f57170p;
        float f4 = rect.left - f;
        if (f4 <= 1.0f) {
            f4 = 1.0f;
        }
        float f5 = (f + width) - rect.right;
        if (f5 <= 1.0f) {
            f5 = 1.0f;
        }
        float fWidth = (rect.width() * f4) / (f5 + f4);
        Rect rect2 = this.f57170p;
        float f6 = fWidth + rect2.left;
        float f7 = rect2.top - f2;
        float f8 = (f2 + height) - rect2.bottom;
        if (f7 <= 1.0f) {
            f7 = 1.0f;
        }
        pointF.set(f6, ((rect2.height() * f7) / ((f8 > 1.0f ? f8 : 1.0f) + f7)) + this.f57170p.top);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m82136b() {
        Animation translateAnimation;
        if (this.f57162h == null) {
            return;
        }
        float fWidth = this.f57170p.width();
        float fHeight = this.f57170p.height();
        float[] fArr = new float[9];
        this.f57157c.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[5];
        boolean z = false;
        float f3 = fArr[0];
        float f4 = this.f57160f;
        if (f3 > f4) {
            float f5 = f4 / f3;
            this.f57169o = f5;
            Matrix matrix = this.f57157c;
            PointF pointF = this.f57167m;
            matrix.postScale(f5, f5, pointF.x, pointF.y);
            setImageMatrix(this.f57157c);
            float f6 = this.f57169o;
            float f7 = 1.0f / f6;
            float f8 = 1.0f / f6;
            PointF pointF2 = this.f57167m;
            translateAnimation = new ScaleAnimation(f7, 1.0f, f8, 1.0f, pointF2.x, pointF2.y);
        } else {
            float f9 = this.f57161g;
            if (f3 < f9) {
                float f10 = f9 / f3;
                this.f57169o = f10;
                Matrix matrix2 = this.f57157c;
                PointF pointF3 = this.f57167m;
                matrix2.postScale(f10, f10, pointF3.x, pointF3.y);
                float f11 = this.f57169o;
                PointF pointF4 = this.f57167m;
                translateAnimation = new ScaleAnimation(1.0f, f11, 1.0f, f11, pointF4.x, pointF4.y);
            } else {
                float width = this.f57162h.getWidth() * f3;
                float height = this.f57162h.getHeight() * f3;
                Rect rect = this.f57170p;
                int i = rect.left;
                float f12 = i - f;
                int i2 = rect.top;
                float f13 = i2 - f2;
                if (f12 < 0.0f) {
                    f = i;
                    z = true;
                }
                if (f13 < 0.0f) {
                    f2 = i2;
                    z = true;
                }
                float f14 = height - f13;
                if (width - f12 < fWidth) {
                    f = i - (width - fWidth);
                    z = true;
                }
                if (f14 < fHeight) {
                    f2 = i2 - (height - fHeight);
                    z = true;
                }
                if (z) {
                    float f15 = fArr[2] - f;
                    float f16 = fArr[5] - f2;
                    fArr[2] = f;
                    fArr[5] = f2;
                    this.f57157c.setValues(fArr);
                    setImageMatrix(this.f57157c);
                    translateAnimation = new TranslateAnimation(f15, 0.0f, f16, 0.0f);
                } else {
                    setImageMatrix(this.f57157c);
                    translateAnimation = null;
                }
            }
        }
        if (translateAnimation != null) {
            this.f57163i = true;
            translateAnimation.setDuration(300L);
            startAnimation(translateAnimation);
            new Thread(new Runnable() { // from class: com.tencent.connect.avatar.c.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Thread.sleep(300L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    C13822c.this.post(new Runnable() { // from class: com.tencent.connect.avatar.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            C13822c.this.clearAnimation();
                            C13822c.this.m82136b();
                        }
                    });
                    C13822c.this.f57163i = false;
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m82137c() {
        if (this.f57162h == null) {
            return;
        }
        float[] fArr = {fMax, 0.0f, this.f57164j, 0.0f, fMax, height, 0.0f, 0.0f, 0.0f};
        this.f57157c.getValues(fArr);
        float fMax = Math.max(this.f57170p.width() / this.f57162h.getWidth(), this.f57170p.height() / this.f57162h.getHeight());
        this.f57164j = this.f57170p.left - (((this.f57162h.getWidth() * fMax) - this.f57170p.width()) / 2.0f);
        float height = this.f57170p.top - (((this.f57162h.getHeight() * fMax) - this.f57170p.height()) / 2.0f);
        this.f57165k = height;
        this.f57157c.setValues(fArr);
        float fMin = Math.min(2048.0f / this.f57162h.getWidth(), 2048.0f / this.f57162h.getHeight());
        this.f57160f = fMin;
        this.f57161g = fMax;
        if (fMin < fMax) {
            this.f57160f = fMax;
        }
        setImageMatrix(this.f57157c);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0089  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f57163i) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f57157c.set(getImageMatrix());
            this.f57158d.set(this.f57157c);
            this.f57166l.set(motionEvent.getX(), motionEvent.getY());
            this.f57159e = 1;
        } else if (action == 1) {
            m82136b();
            this.f57159e = 0;
        } else if (action == 2) {
            int i = this.f57159e;
            if (i == 1) {
                this.f57157c.set(this.f57158d);
                this.f57157c.postTranslate(motionEvent.getX() - this.f57166l.x, motionEvent.getY() - this.f57166l.y);
                setImageMatrix(this.f57157c);
            } else if (i == 2) {
                Matrix matrix = this.f57157c;
                matrix.set(matrix);
                float fM82131a = m82131a(motionEvent);
                if (fM82131a > 10.0f) {
                    this.f57157c.set(this.f57158d);
                    float f = fM82131a / this.f57168n;
                    Matrix matrix2 = this.f57157c;
                    PointF pointF = this.f57167m;
                    matrix2.postScale(f, f, pointF.x, pointF.y);
                }
                setImageMatrix(this.f57157c);
            }
        } else if (action == 5) {
            float fM82131a2 = m82131a(motionEvent);
            this.f57168n = fM82131a2;
            if (fM82131a2 > 10.0f) {
                this.f57158d.set(this.f57157c);
                m82133a(this.f57167m);
                this.f57159e = 2;
            }
        } else if (action == 6) {
            m82136b();
            this.f57159e = 0;
        }
        this.f57156b = true;
        return true;
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        this.f57162h = bitmap;
        if (bitmap != null) {
            this.f57162h = bitmap;
        }
    }

    /* JADX INFO: renamed from: a */
    private float m82131a(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x * x) + (y * y));
    }

    /* JADX INFO: renamed from: a */
    public void m82138a(Rect rect) {
        this.f57170p = rect;
        if (this.f57162h != null) {
            m82137c();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m82132a() {
    }
}
