package p151v;

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
import p153l.qa00;

/* JADX INFO: loaded from: classes3.dex */
public class VList_ViewBuffer extends VList {

    /* JADX INFO: renamed from: g */
    public static Field f210120g;

    /* JADX INFO: renamed from: h */
    public static Field f210121h;

    /* JADX INFO: renamed from: f */
    public boolean f210122f;

    /* JADX INFO: renamed from: v.VList_ViewBuffer$a */
    public final class C22667a extends EdgeEffect {

        /* JADX INFO: renamed from: a */
        public final int f210123a;

        /* JADX INFO: renamed from: b */
        public final Rect f210124b;

        public C22667a(Context context, int i, Rect rect) {
            super(context);
            this.f210123a = i;
            this.f210124b = rect;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m224371b(ValueAnimator valueAnimator) {
            VList_ViewBuffer.this.invalidate();
        }

        @Override // android.widget.EdgeEffect
        public boolean draw(Canvas canvas) {
            canvas.translate(0.0f, -this.f210123a);
            boolean zDraw = super.draw(canvas);
            canvas.translate(0.0f, this.f210123a);
            return zDraw;
        }

        @Override // android.widget.EdgeEffect
        public void onRelease() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.syk0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f171272a.m224371b(valueAnimator);
                }
            });
            valueAnimatorOfFloat.setDuration(1000L);
            valueAnimatorOfFloat.start();
            super.onRelease();
        }
    }

    public VList_ViewBuffer(Context context) {
        super(context);
        this.f210122f = false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    @SuppressLint({"SoonBlockedPrivateApi"})
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (Build.VERSION.SDK_INT < 29 && getMeasuredHeight() > 1 && !this.f210122f) {
            this.f210122f = true;
            try {
                if (f210120g == null) {
                    Field declaredField = AbsListView.class.getDeclaredField("mEdgeGlowTop");
                    f210120g = declaredField;
                    declaredField.setAccessible(true);
                }
                int iM175859d = qa00.m175859d(100.0f);
                f210120g.set(this, new C22667a(getContext(), getPaddingTop(), new Rect(0, getPaddingTop(), getMeasuredWidth(), getPaddingTop() + iM175859d)));
                if (f210121h == null) {
                    Field declaredField2 = AbsListView.class.getDeclaredField("mEdgeGlowBottom");
                    f210121h = declaredField2;
                    declaredField2.setAccessible(true);
                }
                f210121h.set(this, new C22667a(getContext(), -getPaddingBottom(), new Rect(0, (getMeasuredHeight() - getPaddingBottom()) - iM175859d, getMeasuredWidth(), getMeasuredHeight() - getPaddingBottom())));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
            } catch (NoSuchFieldException e2) {
                CrashHelper.m82479c(e2);
            }
        }
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f210122f = false;
    }

    public VList_ViewBuffer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f210122f = false;
    }
}
