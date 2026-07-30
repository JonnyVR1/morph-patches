package com.p051p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p153l.n3d0;
import p153l.n9c0;
import p153l.qa00;

/* JADX INFO: loaded from: classes4.dex */
public class LiveStrokeTextView extends AppCompatTextView {
    public LiveStrokeTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(10.0f);
        setTextColor(n3d0.m161277a(n9c0.f140766E0));
        paint.setStrokeWidth(qa00.m175859d(2.0f));
        super.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        setTextColor(-1);
        super.onDraw(canvas);
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
