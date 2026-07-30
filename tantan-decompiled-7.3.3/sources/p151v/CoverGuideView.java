package p151v;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import p153l.gt0;

/* JADX INFO: loaded from: classes3.dex */
public class CoverGuideView extends RelativeLayout {

    /* JADX INFO: renamed from: d */
    public static final PaintFlagsDrawFilter f209872d = new PaintFlagsDrawFilter(0, 3);

    /* JADX INFO: renamed from: a */
    public boolean f209873a;

    /* JADX INFO: renamed from: b */
    public RectF f209874b;

    /* JADX INFO: renamed from: c */
    public RectF f209875c;

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
    public static class C22644a {
        /* JADX INFO: renamed from: a */
        public static /* bridge */ /* synthetic */ long m224140a(C22644a c22644a) {
            throw null;
        }

        /* JADX INFO: renamed from: b */
        public static /* bridge */ /* synthetic */ boolean m224141b(C22644a c22644a) {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public static /* bridge */ /* synthetic */ InterfaceC22645b m224142c(C22644a c22644a) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: v.CoverGuideView$b */
    public interface InterfaceC22645b {
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void m224139e() {
        ((FrameLayout) ((Activity) getContext()).getWindow().getDecorView()).removeView(this);
        C22644a.m224142c(null);
    }

    /* JADX INFO: renamed from: c */
    public void m224137c() {
        if (this.f209873a) {
            if (C22644a.m224141b(null)) {
                gt0.m132158d(this, C22644a.m224140a(null), gt0.m132162h(null, new Runnable() { // from class: l.tsb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f175971a.m224139e();
                    }
                }, null));
            } else {
                m224139e();
            }
            this.f209873a = false;
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m224138d() {
        return this.f209873a;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f209874b == null || this.f209875c == null) {
            return;
        }
        canvas.save();
        canvas.setDrawFilter(f209872d);
        throw null;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.f209875c = new RectF(i, i2, i3, i4);
            throw null;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        RectF rectF;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() != 1 || (rectF = this.f209874b) == null || x <= rectF.left || x >= rectF.right || y <= rectF.top || y >= rectF.bottom) {
            return super.onTouchEvent(motionEvent);
        }
        throw null;
    }
}
