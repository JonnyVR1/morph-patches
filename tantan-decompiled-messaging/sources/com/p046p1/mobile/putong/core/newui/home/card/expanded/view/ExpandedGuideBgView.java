package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedGuideBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f22585a;

    /* JADX INFO: renamed from: b */
    public Path f22586b;

    /* JADX INFO: renamed from: c */
    public float f22587c;

    /* JADX INFO: renamed from: d */
    public float f22588d;

    /* JADX INFO: renamed from: e */
    public float f22589e;

    /* JADX INFO: renamed from: f */
    public int f22590f;

    /* JADX INFO: renamed from: g */
    public int f22591g;

    public ExpandedGuideBgView(@NonNull Context context) {
        super(context);
        this.f22589e = 5.0f;
        this.f22590f = -1308622848;
        this.f22591g = -1;
        m38315a();
    }

    /* JADX INFO: renamed from: a */
    public final void m38315a() {
        Paint paint = new Paint();
        this.f22585a = paint;
        paint.setAntiAlias(true);
        this.f22585a.setStyle(Paint.Style.FILL);
        this.f22587c = t100.f167266o;
        this.f22588d = t100.m186890d(12.0f);
        this.f22586b = new Path();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int i = this.f22590f;
        if (i != 0) {
            this.f22585a.setColor(i);
            float width = getWidth();
            float height = getHeight();
            float f = this.f22587c;
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f22585a);
        } else {
            canvas2 = canvas;
        }
        if (this.f22588d != 0.0f) {
            this.f22586b.reset();
            this.f22586b.moveTo(-this.f22589e, (getHeight() - this.f22587c) - this.f22588d);
            this.f22586b.lineTo(0.0f, (getHeight() - this.f22587c) - this.f22588d);
            Path path = this.f22586b;
            float height2 = getHeight() - this.f22588d;
            float f2 = this.f22587c;
            path.arcTo(0.0f, height2 - (f2 * 2.0f), f2 * 2.0f, getHeight() - this.f22588d, 180.0f, -90.0f, false);
            this.f22586b.lineTo(getWidth() - this.f22587c, getHeight() - this.f22588d);
            this.f22586b.arcTo(getWidth() - (this.f22587c * 2.0f), (getHeight() - this.f22588d) - (this.f22587c * 2.0f), getWidth(), getHeight() - this.f22588d, 90.0f, -90.0f, false);
            this.f22586b.lineTo(getWidth() + this.f22589e, (getHeight() - this.f22588d) - this.f22587c);
            this.f22586b.lineTo(getWidth() + this.f22589e, getHeight());
            this.f22586b.lineTo(-this.f22589e, getHeight());
            this.f22586b.lineTo(-this.f22589e, (getHeight() - this.f22587c) - this.f22588d);
            this.f22586b.close();
            this.f22585a.setColor(this.f22591g);
            canvas2.drawPath(this.f22586b, this.f22585a);
        }
    }

    public void setBottomSize(int i) {
        this.f22588d = i;
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22589e = 5.0f;
        this.f22590f = -1308622848;
        this.f22591g = -1;
        m38315a();
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22589e = 5.0f;
        this.f22590f = -1308622848;
        this.f22591g = -1;
        m38315a();
    }
}
