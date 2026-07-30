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
import p153l.p9c0;
import p153l.s5d0;
import p153l.ubc0;
import p153l.w5e;
import p153l.x94;
import p153l.yhc0;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewfinderView extends View {

    /* JADX INFO: renamed from: a */
    private final Paint f61723a;

    /* JADX INFO: renamed from: b */
    private Bitmap f61724b;

    /* JADX INFO: renamed from: c */
    private final int f61725c;

    /* JADX INFO: renamed from: d */
    private final int f61726d;

    /* JADX INFO: renamed from: e */
    private final int f61727e;

    /* JADX INFO: renamed from: f */
    private Collection<s5d0> f61728f;

    /* JADX INFO: renamed from: g */
    private Collection<s5d0> f61729g;

    /* JADX INFO: renamed from: h */
    private int f61730h;

    /* JADX INFO: renamed from: i */
    private int f61731i;

    /* JADX INFO: renamed from: j */
    private Bitmap f61732j;

    /* JADX INFO: renamed from: k */
    private boolean f61733k;

    /* JADX INFO: renamed from: l */
    private int f61734l;

    /* JADX INFO: renamed from: m */
    private int f61735m;

    /* JADX INFO: renamed from: n */
    private int f61736n;

    public ViewfinderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f61723a = new Paint();
        Resources resources = getResources();
        this.f61725c = resources.getColor(p9c0.f151140c);
        this.f61726d = resources.getColor(p9c0.f151139b);
        this.f61727e = resources.getColor(p9c0.f151138a);
        this.f61728f = new HashSet(5);
        this.f61732j = BitmapFactory.decodeResource(resources, ubc0.f178300a);
        m85878e(context, attributeSet);
    }

    /* JADX INFO: renamed from: b */
    private void m85876b(Canvas canvas, Rect rect) {
        this.f61723a.setColor(this.f61734l);
        this.f61723a.setStyle(Paint.Style.FILL);
        int i = this.f61736n;
        int i2 = this.f61735m;
        int i3 = rect.left;
        int i4 = rect.top;
        canvas.drawRect(i3, i4, i3 + i, i4 + i2, this.f61723a);
        int i5 = rect.left;
        int i6 = rect.top;
        canvas.drawRect(i5, i6, i5 + i2, i6 + i, this.f61723a);
        int i7 = rect.right;
        int i8 = rect.top;
        canvas.drawRect(i7 - i, i8, i7, i8 + i2, this.f61723a);
        int i9 = rect.right;
        int i10 = rect.top;
        canvas.drawRect(i9 - i2, i10, i9, i10 + i, this.f61723a);
        int i11 = rect.left;
        int i12 = rect.bottom;
        canvas.drawRect(i11, i12 - i2, i11 + i, i12, this.f61723a);
        int i13 = rect.left;
        int i14 = rect.bottom;
        canvas.drawRect(i13, i14 - i, i13 + i2, i14, this.f61723a);
        int i15 = rect.right;
        int i16 = rect.bottom;
        canvas.drawRect(i15 - i, i16 - i2, i15, i16, this.f61723a);
        int i17 = rect.right;
        int i18 = rect.bottom;
        canvas.drawRect(i17 - i2, i18 - i, i17, i18, this.f61723a);
    }

    /* JADX INFO: renamed from: c */
    private void m85877c(Canvas canvas, Rect rect) {
        if (this.f61730h == 0) {
            this.f61730h = rect.top;
        }
        int i = this.f61730h;
        if (i >= rect.bottom - 30) {
            this.f61730h = rect.top;
        } else {
            this.f61730h = i + this.f61731i;
        }
        int i2 = rect.left;
        int i3 = this.f61730h;
        canvas.drawBitmap(this.f61732j, (Rect) null, new Rect(i2, i3, rect.right, i3 + 30), this.f61723a);
    }

    /* JADX INFO: renamed from: e */
    private void m85878e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yhc0.f199921a);
        float dimension = typedArrayObtainStyledAttributes.getDimension(yhc0.f199926f, -1.0f);
        if (dimension != -1.0f) {
            x94.f192900m = (int) dimension;
        }
        x94.f192898k = (int) typedArrayObtainStyledAttributes.getDimension(yhc0.f199930j, w5e.f187496a / 2);
        x94.f192899l = (int) typedArrayObtainStyledAttributes.getDimension(yhc0.f199925e, w5e.f187496a / 2);
        this.f61734l = typedArrayObtainStyledAttributes.getColor(yhc0.f199922b, Color.parseColor("#45DDDD"));
        this.f61735m = (int) typedArrayObtainStyledAttributes.getDimension(yhc0.f199923c, 65.0f);
        this.f61736n = (int) typedArrayObtainStyledAttributes.getDimension(yhc0.f199924d, 15.0f);
        typedArrayObtainStyledAttributes.getDrawable(yhc0.f199927g);
        this.f61732j = BitmapFactory.decodeResource(getResources(), typedArrayObtainStyledAttributes.getResourceId(yhc0.f199927g, ubc0.f178300a));
        this.f61731i = typedArrayObtainStyledAttributes.getInt(yhc0.f199929i, 5);
        this.f61733k = typedArrayObtainStyledAttributes.getBoolean(yhc0.f199928h, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: a */
    public void m85879a(s5d0 s5d0Var) {
        this.f61728f.add(s5d0Var);
    }

    /* JADX INFO: renamed from: d */
    public void m85880d() {
        this.f61724b = null;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Rect rectM209769f = x94.m209763c().m209769f();
        if (rectM209769f == null) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f61723a.setColor(this.f61724b != null ? this.f61726d : this.f61725c);
        float f = width;
        canvas.drawRect(0.0f, 0.0f, f, rectM209769f.top, this.f61723a);
        canvas.drawRect(0.0f, rectM209769f.top, rectM209769f.left, rectM209769f.bottom + 1, this.f61723a);
        canvas.drawRect(rectM209769f.right + 1, rectM209769f.top, f, rectM209769f.bottom + 1, this.f61723a);
        canvas.drawRect(0.0f, rectM209769f.bottom + 1, f, height, this.f61723a);
        if (this.f61724b != null) {
            this.f61723a.setAlpha(255);
            canvas.drawBitmap(this.f61724b, rectM209769f.left, rectM209769f.top, this.f61723a);
            return;
        }
        m85876b(canvas, rectM209769f);
        m85877c(canvas, rectM209769f);
        Collection<s5d0> collection = this.f61728f;
        Collection<s5d0> collection2 = this.f61729g;
        if (collection.isEmpty()) {
            this.f61729g = null;
        } else {
            this.f61728f = new HashSet(5);
            this.f61729g = collection;
            this.f61723a.setAlpha(255);
            this.f61723a.setColor(this.f61727e);
            if (this.f61733k) {
                for (s5d0 s5d0Var : collection) {
                    canvas.drawCircle(rectM209769f.left + s5d0Var.m184657c(), rectM209769f.top + s5d0Var.m184658d(), 6.0f, this.f61723a);
                }
            }
        }
        if (collection2 != null) {
            this.f61723a.setAlpha(127);
            this.f61723a.setColor(this.f61727e);
            if (this.f61733k) {
                for (s5d0 s5d0Var2 : collection2) {
                    canvas.drawCircle(rectM209769f.left + s5d0Var2.m184657c(), rectM209769f.top + s5d0Var2.m184658d(), 3.0f, this.f61723a);
                }
            }
        }
        postInvalidateDelayed(100L, rectM209769f.left, rectM209769f.top, rectM209769f.right, rectM209769f.bottom);
    }

    public ViewfinderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public ViewfinderView(Context context) {
        this(context, null);
    }
}
