package p028v;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.EdgeEffect;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VList_ViewBuffer extends VList {

    /* JADX INFO: renamed from: g */
    public static Field f12823g;

    /* JADX INFO: renamed from: h */
    public static Field f12824h;

    /* JADX INFO: renamed from: f */
    public boolean f12825f;

    /* JADX INFO: renamed from: v.VList_ViewBuffer$a */
    public final class C1345a extends EdgeEffect {

        /* JADX INFO: renamed from: a */
        public final int f12826a;

        /* JADX INFO: renamed from: b */
        public final Rect f12827b;

        public C1345a(Context context, int i, Rect rect) {
            super(context);
            this.f12826a = i;
            this.f12827b = rect;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m11606b(ValueAnimator valueAnimator) {
            VList_ViewBuffer.this.invalidate();
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            canvas.translate(0.0f, -this.f12826a);
            boolean zDraw = super.draw(canvas);
            canvas.translate(0.0f, this.f12826a);
            return zDraw;
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mpk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f5714a.m11606b(valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.start();
            super.onRelease();
        }
    }

    public VList_ViewBuffer(Context context) {
        super(context);
        this.f12825f = false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    @SuppressLint({"SoonBlockedPrivateApi"})
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT < 29 && getMeasuredHeight() > 1 && !this.f12825f) {
            this.f12825f = true;
            try {
                if (f12823g == null) {
                    Field declaredField = AbsListView.class.getDeclaredField("mEdgeGlowTop");
                    f12823g = declaredField;
                    declaredField.setAccessible(true);
                }
                int iD = t100.d(100.0f);
                f12823g.set(this, new C1345a(getContext(), getPaddingTop(), new Rect(0, getPaddingTop(), getMeasuredWidth(), getPaddingTop() + iD)));
                if (f12824h == null) {
                    Field declaredField2 = AbsListView.class.getDeclaredField("mEdgeGlowBottom");
                    f12824h = declaredField2;
                    declaredField2.setAccessible(true);
                }
                f12824h.set(this, new C1345a(getContext(), -getPaddingBottom(), new Rect(0, (getMeasuredHeight() - getPaddingBottom()) - iD, getMeasuredWidth(), getMeasuredHeight() - getPaddingBottom())));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
            } catch (NoSuchFieldException e2) {
                CrashHelper.c(e2);
            }
        }
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12825f = false;
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12825f = false;
    }
}
