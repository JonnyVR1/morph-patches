package p147v;

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
import p149l.t100;

/* JADX INFO: loaded from: classes3.dex */
public class VList_ViewBuffer extends VList {

    /* JADX INFO: renamed from: g */
    public static Field f209198g;

    /* JADX INFO: renamed from: h */
    public static Field f209199h;

    /* JADX INFO: renamed from: f */
    public boolean f209200f;

    /* JADX INFO: renamed from: v.VList_ViewBuffer$a */
    public final class C22552a extends EdgeEffect {

        /* JADX INFO: renamed from: a */
        public final int f209201a;

        /* JADX INFO: renamed from: b */
        public final Rect f209202b;

        public C22552a(Context context, int i, Rect rect) {
            super(context);
            this.f209201a = i;
            this.f209202b = rect;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m223125b(ValueAnimator valueAnimator) {
            VList_ViewBuffer.this.invalidate();
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            canvas.translate(0.0f, -this.f209201a);
            boolean zDraw = super.draw(canvas);
            canvas.translate(0.0f, this.f209201a);
            return zDraw;
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.mpk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f135068a.m223125b(valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.start();
            super.onRelease();
        }
    }

    public VList_ViewBuffer(Context context) {
        super(context);
        this.f209200f = false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    @SuppressLint({"SoonBlockedPrivateApi"})
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT < 29 && getMeasuredHeight() > 1 && !this.f209200f) {
            this.f209200f = true;
            try {
                if (f209198g == null) {
                    Field declaredField = AbsListView.class.getDeclaredField("mEdgeGlowTop");
                    f209198g = declaredField;
                    declaredField.setAccessible(true);
                }
                int iM186890d = t100.m186890d(100.0f);
                f209198g.set(this, new C22552a(getContext(), getPaddingTop(), new Rect(0, getPaddingTop(), getMeasuredWidth(), getPaddingTop() + iM186890d)));
                if (f209199h == null) {
                    Field declaredField2 = AbsListView.class.getDeclaredField("mEdgeGlowBottom");
                    f209199h = declaredField2;
                    declaredField2.setAccessible(true);
                }
                f209199h.set(this, new C22552a(getContext(), -getPaddingBottom(), new Rect(0, (getMeasuredHeight() - getPaddingBottom()) - iM186890d, getMeasuredWidth(), getMeasuredHeight() - getPaddingBottom())));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
            } catch (NoSuchFieldException e2) {
                CrashHelper.m81296c(e2);
            }
        }
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f209200f = false;
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f209200f = false;
    }
}
