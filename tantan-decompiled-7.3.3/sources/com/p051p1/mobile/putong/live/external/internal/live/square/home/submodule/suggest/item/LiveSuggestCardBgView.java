package com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.suggest.item;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes9.dex */
public class LiveSuggestCardBgView extends View {

    /* JADX INFO: renamed from: a */
    public final Path f45874a;

    /* JADX INFO: renamed from: b */
    public final Path f45875b;

    /* JADX INFO: renamed from: c */
    public final Path f45876c;

    /* JADX INFO: renamed from: d */
    public Paint f45877d;

    public LiveSuggestCardBgView(Context context) {
        super(context);
        this.f45874a = new Path();
        this.f45875b = new Path();
        this.f45876c = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f45874a.moveTo(0.0f, getHeight() * 0.41f);
        float width = getWidth() / 3.0f;
        float width2 = (getWidth() * 2) / 3.0f;
        float width3 = getWidth();
        float height = getHeight();
        float f = height * 0.41f;
        float f2 = f - 120.0f;
        this.f45874a.cubicTo(width, f2, width2, f2, width3, f);
        canvas.drawPath(this.f45874a, this.f45877d);
        this.f45875b.moveTo(0.0f, getHeight() * 0.68f);
        float f3 = height * 0.68f;
        float f4 = f3 - 120.0f;
        this.f45875b.cubicTo(width, f4, width2, f4, width3, f3);
        canvas.drawPath(this.f45875b, this.f45877d);
        this.f45876c.moveTo(0.0f, getHeight() * 0.93f);
        float f5 = height * 0.93f;
        float f6 = f5 - 120.0f;
        this.f45876c.cubicTo(width, f6, width2, f6, width3, f5);
        canvas.drawPath(this.f45876c, this.f45877d);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Paint paint = new Paint();
        this.f45877d = paint;
        paint.setAntiAlias(true);
        this.f45877d.setStyle(Paint.Style.STROKE);
        this.f45877d.setStrokeWidth(qa00.f156316c);
        this.f45877d.setColor(Color.parseColor("#08000000"));
    }

    public LiveSuggestCardBgView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45874a = new Path();
        this.f45875b = new Path();
        this.f45876c = new Path();
    }

    public LiveSuggestCardBgView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45874a = new Path();
        this.f45875b = new Path();
        this.f45876c = new Path();
    }
}
