package com.p000p1.mobile.putong.core.newui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.lang.reflect.Field;
import l.gbl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FlingBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a */
    public boolean f5691a;

    /* JADX INFO: renamed from: b */
    public OverScroller f5692b;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7972b(context);
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        if ((f2 > 0.0f && !this.f5691a) || (f2 < 0.0f && this.f5691a)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if ((view instanceof RecyclerView) && f3 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view;
            if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && recyclerView.getLayoutManager().findFirstCompletelyVisibleItemPosition() == 0) {
                z = false;
            }
        }
        return super/*androidx.coordinatorlayout.widget.CoordinatorLayout.c*/.onNestedFling(coordinatorLayout, appBarLayout, view, f, f3, z);
    }

    /* JADX INFO: renamed from: b */
    public final void m7972b(Context context) {
        if (NullChecker.a(this.f5692b)) {
            return;
        }
        this.f5692b = new OverScroller(context);
        try {
            Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, this.f5692b);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        } catch (NoSuchFieldException unused) {
        }
    }

    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super/*com.google.android.material.appbar.AppBarLayout.BaseBehavior*/.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (NullChecker.a(this.f5692b) && this.f5692b.computeScrollOffset()) {
            this.f5692b.abortAnimation();
        }
        if (i3 == 1 && getTopAndBottomOffset() == 0) {
            gbl0.I0(view, i3);
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        this.f5691a = i2 > 0;
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super/*com.google.android.material.appbar.AppBarLayout.BaseBehavior*/.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FlingBehavior() {
    }
}
