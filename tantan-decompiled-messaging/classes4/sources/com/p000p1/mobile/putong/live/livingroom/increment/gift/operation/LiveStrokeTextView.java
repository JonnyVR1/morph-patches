package com.p000p1.mobile.putong.live.livingroom.increment.gift.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import l.kvc0;
import l.t100;
import p002l.h1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveStrokeTextView extends AppCompatTextView {
    public LiveStrokeTextView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        TextPaint paint = getPaint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeMiter(10.0f);
        setTextColor(kvc0.a(h1c0.f11725E0));
        paint.setStrokeWidth(t100.d(2.0f));
        super/*android.view.View*/.onDraw(canvas);
        paint.setStyle(Paint.Style.FILL);
        setTextColor(-1);
        super/*android.view.View*/.onDraw(canvas);
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveStrokeTextView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
