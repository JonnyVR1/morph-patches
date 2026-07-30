package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedGuideBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public Paint f23327a;

    /* JADX INFO: renamed from: b */
    public Path f23328b;

    /* JADX INFO: renamed from: c */
    public float f23329c;

    /* JADX INFO: renamed from: d */
    public float f23330d;

    /* JADX INFO: renamed from: e */
    public float f23331e;

    /* JADX INFO: renamed from: f */
    public int f23332f;

    /* JADX INFO: renamed from: g */
    public int f23333g;

    public ExpandedGuideBgView(@NonNull Context context) {
        super(context);
        this.f23331e = 5.0f;
        this.f23332f = -1308622848;
        this.f23333g = -1;
        m39318a();
    }

    /* JADX INFO: renamed from: a */
    public final void m39318a() {
        Paint paint = new Paint();
        this.f23327a = paint;
        paint.setAntiAlias(true);
        this.f23327a.setStyle(Paint.Style.FILL);
        this.f23329c = qa00.f156328o;
        this.f23330d = qa00.m175859d(12.0f);
        this.f23328b = new Path();
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int i = this.f23332f;
        if (i != 0) {
            this.f23327a.setColor(i);
            float width = getWidth();
            float height = getHeight();
            float f = this.f23329c;
            canvas2 = canvas;
            canvas2.drawRoundRect(0.0f, 0.0f, width, height, f, f, this.f23327a);
        } else {
            canvas2 = canvas;
        }
        if (this.f23330d != 0.0f) {
            this.f23328b.reset();
            this.f23328b.moveTo(-this.f23331e, (getHeight() - this.f23329c) - this.f23330d);
            this.f23328b.lineTo(0.0f, (getHeight() - this.f23329c) - this.f23330d);
            Path path = this.f23328b;
            float height2 = getHeight() - this.f23330d;
            float f2 = this.f23329c;
            path.arcTo(0.0f, height2 - (f2 * 2.0f), f2 * 2.0f, getHeight() - this.f23330d, 180.0f, -90.0f, false);
            this.f23328b.lineTo(getWidth() - this.f23329c, getHeight() - this.f23330d);
            this.f23328b.arcTo(getWidth() - (this.f23329c * 2.0f), (getHeight() - this.f23330d) - (this.f23329c * 2.0f), getWidth(), getHeight() - this.f23330d, 90.0f, -90.0f, false);
            this.f23328b.lineTo(getWidth() + this.f23331e, (getHeight() - this.f23330d) - this.f23329c);
            this.f23328b.lineTo(getWidth() + this.f23331e, getHeight());
            this.f23328b.lineTo(-this.f23331e, getHeight());
            this.f23328b.lineTo(-this.f23331e, (getHeight() - this.f23329c) - this.f23330d);
            this.f23328b.close();
            this.f23327a.setColor(this.f23333g);
            canvas2.drawPath(this.f23328b, this.f23327a);
        }
    }

    public void setBottomSize(int i) {
        this.f23330d = i;
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23331e = 5.0f;
        this.f23332f = -1308622848;
        this.f23333g = -1;
        m39318a();
    }

    public ExpandedGuideBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23331e = 5.0f;
        this.f23332f = -1308622848;
        this.f23333g = -1;
        m39318a();
    }
}
