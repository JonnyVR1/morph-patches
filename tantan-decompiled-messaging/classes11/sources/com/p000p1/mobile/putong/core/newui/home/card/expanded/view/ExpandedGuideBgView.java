package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedGuideBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f1363a;

    /* JADX INFO: renamed from: b */
    public Path f1364b;

    /* JADX INFO: renamed from: c */
    public float f1365c;

    /* JADX INFO: renamed from: d */
    public float f1366d;

    /* JADX INFO: renamed from: e */
    public float f1367e;

    /* JADX INFO: renamed from: f */
    public int f1368f;

    /* JADX INFO: renamed from: g */
    public int f1369g;

    public ExpandedGuideBgView(@NonNull Context context) {
        super(context);
        this.f1367e = 5.0f;
        this.f1368f = -1308622848;
        this.f1369g = -1;
        m2293a();
    }

    /* JADX INFO: renamed from: a */
    public final void m2293a() {
        Paint paint = new Paint();
        this.f1363a = paint;
        paint.setAntiAlias(true);
        this.f1363a.setStyle(Paint.Style.FILL);
        this.f1365c = t100.o;
        this.f1366d = t100.d(12.0f);
        this.f1364b = new Path();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int i = this.f1368f;
        if (i != 0) {
            this.f1363a.setColor(i);
            float width = getWidth();
            float height = getHeight();
            float f = this.f1365c;
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f1363a);
        } else {
            canvas2 = canvas;
        }
        if (this.f1366d != 0.0f) {
            this.f1364b.reset();
            this.f1364b.moveTo(-this.f1367e, (getHeight() - this.f1365c) - this.f1366d);
            this.f1364b.lineTo(0.0f, (getHeight() - this.f1365c) - this.f1366d);
            Path path = this.f1364b;
            float height2 = getHeight() - this.f1366d;
            float f2 = this.f1365c;
            path.arcTo(0.0f, height2 - (f2 * 2.0f), f2 * 2.0f, getHeight() - this.f1366d, 180.0f, -90.0f, false);
            this.f1364b.lineTo(getWidth() - this.f1365c, getHeight() - this.f1366d);
            this.f1364b.arcTo(getWidth() - (this.f1365c * 2.0f), (getHeight() - this.f1366d) - (this.f1365c * 2.0f), getWidth(), getHeight() - this.f1366d, 90.0f, -90.0f, false);
            this.f1364b.lineTo(getWidth() + this.f1367e, (getHeight() - this.f1366d) - this.f1365c);
            this.f1364b.lineTo(getWidth() + this.f1367e, getHeight());
            this.f1364b.lineTo(-this.f1367e, getHeight());
            this.f1364b.lineTo(-this.f1367e, (getHeight() - this.f1365c) - this.f1366d);
            this.f1364b.close();
            this.f1363a.setColor(this.f1369g);
            canvas2.drawPath(this.f1364b, this.f1363a);
        }
    }

    public void setBottomSize(int i) {
        this.f1366d = i;
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1367e = 5.0f;
        this.f1368f = -1308622848;
        this.f1369g = -1;
        m2293a();
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1367e = 5.0f;
        this.f1368f = -1308622848;
        this.f1369g = -1;
        m2293a();
    }
}
