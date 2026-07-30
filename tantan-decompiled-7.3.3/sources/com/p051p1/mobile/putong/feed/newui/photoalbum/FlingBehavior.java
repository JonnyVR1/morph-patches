package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import p153l.kkl0;

/* JADX INFO: loaded from: classes13.dex */
public class FlingBehavior extends AppBarLayout.Behavior {

    /* JADX INFO: renamed from: a */
    public boolean f41739a;

    /* JADX INFO: renamed from: b */
    public OverScroller f41740b;

    public FlingBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64311b(context);
    }

    /* JADX INFO: renamed from: b */
    private void m64311b(Context context) {
        if (NullChecker.m82486a(this.f41740b)) {
            return;
        }
        this.f41740b = new OverScroller(context);
        try {
            Field declaredField = getClass().getSuperclass().getSuperclass().getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(this, this.f41740b);
        } catch (IllegalAccessException e) {
            CrashHelper.m82479c(e);
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onNestedFling(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, float f, float f2, boolean z) {
        if ((f2 > 0.0f && !this.f41739a) || (f2 < 0.0f && this.f41739a)) {
            f2 *= -1.0f;
        }
        float f3 = f2;
        if ((view instanceof RecyclerView) && f3 < 0.0f) {
            RecyclerView recyclerView = (RecyclerView) view;
            if ((recyclerView.getLayoutManager() instanceof LinearLayoutManager) && ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition() == 0) {
                z = false;
            }
        }
        return super.onNestedFling(coordinatorLayout, appBarLayout, view, f, f3, z);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public /* bridge */ /* synthetic */ boolean onInterceptTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
        if (NullChecker.m82486a(this.f41740b) && this.f41740b.computeScrollOffset()) {
            this.f41740b.abortAnimation();
        }
        if (i3 == 1 && getTopAndBottomOffset() == 0) {
            kkl0.m150127I0(view, i3);
        }
        super.onNestedPreScroll(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        this.f41739a = i2 > 0;
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0227c
    public /* bridge */ /* synthetic */ boolean onTouchEvent(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull MotionEvent motionEvent) {
        return super.onTouchEvent(coordinatorLayout, view, motionEvent);
    }

    public FlingBehavior() {
    }
}
