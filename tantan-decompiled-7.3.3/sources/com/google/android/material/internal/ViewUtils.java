package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import p153l.dgq0;
import p153l.il50;
import p153l.kkl0;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class ViewUtils {

    public interface OnApplyWindowInsetsListener {
        dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var, RelativePadding relativePadding);
    }

    private ViewUtils() {
    }

    public static void doOnApplyWindowInsets(@NonNull View view, @NonNull final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(kkl0.m150112B(view), view.getPaddingTop(), kkl0.m150110A(view), view.getPaddingBottom());
        kkl0.m150194y0(view, new il50() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // p153l.il50
            public dgq0 onApplyWindowInsets(View view2, dgq0 dgq0Var) {
                return onApplyWindowInsetsListener.onApplyWindowInsets(view2, dgq0Var, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static float dpToPx(@NonNull Context context, @Dimension(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float getParentAbsoluteElevation(@NonNull View view) {
        float fM150183t = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fM150183t += kkl0.m150183t((View) parent);
        }
        return fM150183t;
    }

    public static boolean isLayoutRtl(View view) {
        return kkl0.m150191x(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void requestApplyInsetsWhenAttached(@NonNull View view) {
        if (kkl0.m150133O(view)) {
            kkl0.m150158g0(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.3
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NonNull View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    kkl0.m150158g0(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(@NonNull final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }

    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(@NonNull RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            kkl0.m150196z0(view, this.start, this.top, this.end, this.bottom);
        }

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }
    }
}
