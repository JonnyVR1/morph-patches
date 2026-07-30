package p147v;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import p149l.bt0;

/* JADX INFO: loaded from: classes3.dex */
public class CoverGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final PaintFlagsDrawFilter f208950d = new PaintFlagsDrawFilter(0, 3);

    /* JADX INFO: renamed from: a */
    public boolean f208951a;

    /* JADX INFO: renamed from: b */
    public RectF f208952b;

    /* JADX INFO: renamed from: c */
    public RectF f208953c;

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
    public static class C22529a {
        /* JADX INFO: renamed from: a */
        public static /* bridge */ /* synthetic */ long m222894a(C22529a c22529a) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public static /* bridge */ /* synthetic */ boolean m222895b(C22529a c22529a) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public static /* bridge */ /* synthetic */ InterfaceC22530b m222896c(C22529a c22529a) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: v.CoverGuideView$b */
    public interface InterfaceC22530b {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m222893e() {
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
        C22529a.m222896c(null);
    }

    /* JADX INFO: renamed from: c */
    public void m222891c() {
        if (this.f208951a) {
            if (C22529a.m222895b(null)) {
                bt0.m103731d(this, C22529a.m222894a(null), bt0.m103735h(null, new Runnable() { // from class: l.frb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f98916a.m222893e();
                    }
                }, null));
            } else {
                m222893e();
            }
            this.f208951a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m222892d() {
        return this.f208951a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f208952b == null || this.f208953c == null) {
            return;
        }
        canvas.save();
        canvas.setDrawFilter(f208950d);
        throw null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f208953c = new RectF(i, i2, i3, i4);
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 1 || (rectF = this.f208952b) == null || x <= rectF.left || x >= rectF.right || y <= rectF.top || y >= rectF.bottom) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }
}
