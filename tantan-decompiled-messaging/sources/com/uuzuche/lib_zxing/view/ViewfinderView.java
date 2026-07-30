package com.uuzuche.lib_zxing.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.Collection;
import java.util.HashSet;
import p149l.i4e;
import p149l.j1c0;
import p149l.o3c0;
import p149l.pxc0;
import p149l.s9c0;
import p149l.y84;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewfinderView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f60876a;

    /* JADX INFO: renamed from: b */
    private Bitmap f60877b;

    /* JADX INFO: renamed from: c */
    private final int f60878c;

    /* JADX INFO: renamed from: d */
    private final int f60879d;

    /* JADX INFO: renamed from: e */
    private final int f60880e;

    /* JADX INFO: renamed from: f */
    private Collection<pxc0> f60881f;

    /* JADX INFO: renamed from: g */
    private Collection<pxc0> f60882g;

    /* JADX INFO: renamed from: h */
    private int f60883h;

    /* JADX INFO: renamed from: i */
    private int f60884i;

    /* JADX INFO: renamed from: j */
    private Bitmap f60885j;

    /* JADX INFO: renamed from: k */
    private boolean f60886k;

    /* JADX INFO: renamed from: l */
    private int f60887l;

    /* JADX INFO: renamed from: m */
    private int f60888m;

    /* JADX INFO: renamed from: n */
    private int f60889n;

    public ViewfinderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f60876a = new Paint();
        Resources resources = getResources();
        this.f60878c = resources.getColor(j1c0.f115785c);
        this.f60879d = resources.getColor(j1c0.f115784b);
        this.f60880e = resources.getColor(j1c0.f115783a);
        this.f60881f = new HashSet(5);
        this.f60885j = BitmapFactory.decodeResource(resources, o3c0.f141656a);
        m84707e(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    private void m84705b(Canvas canvas, Rect rect) {
        this.f60876a.setColor(this.f60887l);
        this.f60876a.setStyle(Paint.Style.FILL);
        int i = this.f60889n;
        int i2 = this.f60888m;
        int i3 = rect.left;
        int i4 = rect.top;
        canvas.drawRect(i3, i4, i3 + i, i4 + i2, this.f60876a);
        int i5 = rect.left;
        int i6 = rect.top;
        canvas.drawRect(i5, i6, i5 + i2, i6 + i, this.f60876a);
        int i7 = rect.right;
        int i8 = rect.top;
        canvas.drawRect(i7 - i, i8, i7, i8 + i2, this.f60876a);
        int i9 = rect.right;
        int i10 = rect.top;
        canvas.drawRect(i9 - i2, i10, i9, i10 + i, this.f60876a);
        int i11 = rect.left;
        int i12 = rect.bottom;
        canvas.drawRect(i11, i12 - i2, i11 + i, i12, this.f60876a);
        int i13 = rect.left;
        int i14 = rect.bottom;
        canvas.drawRect(i13, i14 - i, i13 + i2, i14, this.f60876a);
        int i15 = rect.right;
        int i16 = rect.bottom;
        canvas.drawRect(i15 - i, i16 - i2, i15, i16, this.f60876a);
        int i17 = rect.right;
        int i18 = rect.bottom;
        canvas.drawRect(i17 - i2, i18 - i, i17, i18, this.f60876a);
    }

    /* JADX INFO: renamed from: c */
    private void m84706c(Canvas canvas, Rect rect) {
        if (this.f60883h == 0) {
            this.f60883h = rect.top;
        }
        int i = this.f60883h;
        if (i >= rect.bottom - 30) {
            this.f60883h = rect.top;
        } else {
            this.f60883h = i + this.f60884i;
        }
        int i2 = rect.left;
        int i3 = this.f60883h;
        canvas.drawBitmap(this.f60885j, (Rect) null, new Rect(i2, i3, rect.right, i3 + 30), this.f60876a);
    }

    /* JADX INFO: renamed from: e */
    private void m84707e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s9c0.f163166a);
        float dimension = typedArrayObtainStyledAttributes.getDimension(s9c0.f163171f, -1.0f);
        if (dimension != -1.0f) {
            y84.f196764m = (int) dimension;
        }
        y84.f196762k = (int) typedArrayObtainStyledAttributes.getDimension(s9c0.f163175j, i4e.f111429a / 2);
        y84.f196763l = (int) typedArrayObtainStyledAttributes.getDimension(s9c0.f163170e, i4e.f111429a / 2);
        this.f60887l = typedArrayObtainStyledAttributes.getColor(s9c0.f163167b, Color.parseColor("#45DDDD"));
        this.f60888m = (int) typedArrayObtainStyledAttributes.getDimension(s9c0.f163168c, 65.0f);
        this.f60889n = (int) typedArrayObtainStyledAttributes.getDimension(s9c0.f163169d, 15.0f);
        typedArrayObtainStyledAttributes.getDrawable(s9c0.f163172g);
        this.f60885j = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(s9c0.f163172g, o3c0.f141656a));
        this.f60884i = typedArrayObtainStyledAttributes.getInt(s9c0.f163174i, 5);
        this.f60886k = typedArrayObtainStyledAttributes.getBoolean(s9c0.f163173h, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m84708a(pxc0 pxc0Var) {
        this.f60881f.add(pxc0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m84709d() {
        this.f60877b = null;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rectM213350f = y84.m213344c().m213350f();
        if (rectM213350f == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f60876a.setColor(this.f60877b != null ? this.f60879d : this.f60878c);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rectM213350f.top, this.f60876a);
        canvas.drawRect(0.0f, rectM213350f.top, rectM213350f.left, rectM213350f.bottom + 1, this.f60876a);
        canvas.drawRect(rectM213350f.right + 1, rectM213350f.top, f, rectM213350f.bottom + 1, this.f60876a);
        canvas.drawRect(0.0f, rectM213350f.bottom + 1, f, height, this.f60876a);
        if (this.f60877b != null) {
            this.f60876a.setAlpha(255);
            canvas.drawBitmap(this.f60877b, rectM213350f.left, rectM213350f.top, this.f60876a);
            return;
        }
        m84705b(canvas, rectM213350f);
        m84706c(canvas, rectM213350f);
        Collection<pxc0> collection = this.f60881f;
        Collection<pxc0> collection2 = this.f60882g;
        if (collection.isEmpty()) {
            this.f60882g = null;
        } else {
            this.f60881f = new HashSet(5);
            this.f60882g = collection;
            this.f60876a.setAlpha(255);
            this.f60876a.setColor(this.f60880e);
            if (this.f60886k) {
                for (pxc0 pxc0Var : collection) {
                    canvas.drawCircle(rectM213350f.left + pxc0Var.m171831c(), rectM213350f.top + pxc0Var.m171832d(), 6.0f, this.f60876a);
                }
            }
        }
        if (collection2 != null) {
            this.f60876a.setAlpha(127);
            this.f60876a.setColor(this.f60880e);
            if (this.f60886k) {
                for (pxc0 pxc0Var2 : collection2) {
                    canvas.drawCircle(rectM213350f.left + pxc0Var2.m171831c(), rectM213350f.top + pxc0Var2.m171832d(), 3.0f, this.f60876a);
                }
            }
        }
        postInvalidateDelayed(100L, rectM213350f.left, rectM213350f.top, rectM213350f.right, rectM213350f.bottom);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }
}
