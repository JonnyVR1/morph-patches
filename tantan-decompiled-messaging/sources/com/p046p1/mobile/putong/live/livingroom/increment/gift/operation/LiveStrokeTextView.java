package com.p046p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import p149l.h1c0;
import p149l.kvc0;
import p149l.t100;

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
        setTextColor(kvc0.m147352a(h1c0.f105305E0));
        paint.setStrokeWidth(t100.m186890d(2.0f));
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
