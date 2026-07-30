package com.p000p1.mobile.putong.feed.newui.photoalbum;

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

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FlingBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a */
    public boolean f2352a;

    /* JADX INFO: renamed from: b */
    public OverScroller f2353b;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4144b(context);
    }

    /* JADX INFO: renamed from: b */
    private void m4144b(Context context) {
        if (NullChecker.a(this.f2353b)) {
            return;
        }
        this.f2353b = new OverScroller(context);
        try {
            Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, this.f2353b);
        } catch (IllegalAccessException e) {
            CrashHelper.c(e);
        } catch (NoSuchFieldException unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        if ((f2 > 0.0f && !this.f2352a) || (f2 < 0.0f && this.f2352a)) {
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

    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super/*com.google.android.material.appbar.AppBarLayout.BaseBehavior*/.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (NullChecker.a(this.f2353b) && this.f2353b.computeScrollOffset()) {
            this.f2353b.abortAnimation();
        }
        if (i3 == 1 && getTopAndBottomOffset() == 0) {
            gbl0.I0(view, i3);
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        this.f2352a = i2 > 0;
    }

    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super/*com.google.android.material.appbar.AppBarLayout.BaseBehavior*/.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FlingBehavior() {
    }
}
