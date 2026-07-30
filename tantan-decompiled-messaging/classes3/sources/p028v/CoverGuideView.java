package p028v;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import l.bt0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoverGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final PaintFlagsDrawFilter f12575d = new PaintFlagsDrawFilter(0, 3);

    /* JADX INFO: renamed from: a */
    public boolean f12576a;

    /* JADX INFO: renamed from: b */
    public RectF f12577b;

    /* JADX INFO: renamed from: c */
    public RectF f12578c;

    public enum GuideViewLocation {
        Left,
        LeftBottom,
        LeftTop,
        Top,
        TopAlignRight,
        TopRight,
        Right,
        RightBottom,
        Bottom,
        BottomAlignRight
    }

    public enum ShapeType {
        Circle,
        Rect,
        RoundRect
    }

    /* JADX INFO: renamed from: v.CoverGuideView$a */
    public static class C1322a {
        /* JADX INFO: renamed from: a */
        public static /* bridge */ /* synthetic */ long m11366a(C1322a c1322a) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public static /* bridge */ /* synthetic */ boolean m11367b(C1322a c1322a) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public static /* bridge */ /* synthetic */ InterfaceC1323b m11368c(C1322a c1322a) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: v.CoverGuideView$b */
    public interface InterfaceC1323b {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m11365e() {
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
        C1322a.m11368c(null);
    }

    /* JADX INFO: renamed from: c */
    public void m11363c() {
        if (this.f12576a) {
            if (C1322a.m11367b(null)) {
                bt0.d(this, C1322a.m11366a(null), bt0.h((Runnable) null, new Runnable() { // from class: l.frb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f3687a.m11365e();
                    }
                }, (Runnable) null));
            } else {
                m11365e();
            }
            this.f12576a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m11364d() {
        return this.f12576a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f12577b == null || this.f12578c == null) {
            return;
        }
        canvas.save();
        canvas.setDrawFilter(f12575d);
        throw null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f12578c = new RectF(i, i2, i3, i4);
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 1 || (rectF = this.f12577b) == null || x <= rectF.left || x >= rectF.right || y <= rectF.top || y >= rectF.bottom) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }
}
