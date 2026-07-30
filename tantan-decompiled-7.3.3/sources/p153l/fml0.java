package p153l;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class fml0 {

    /* JADX INFO: renamed from: l.fml0$a */
    @RequiresApi(21)
    public static class C17016a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m126266a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m126267b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m126268c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m126269d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m126270e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static boolean m126271f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static void m126272g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m126258a(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2, boolean z) {
        try {
            return C17016a.m126266a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m126259b(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2) {
        try {
            return C17016a.m126267b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m126260c(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (viewParent instanceof ci20) {
            ((ci20) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                C17016a.m126268c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m126261d(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (viewParent instanceof di20) {
            ((di20) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof ci20) {
            ((ci20) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                C17016a.m126269d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m126262e(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof ci20) {
            ((ci20) viewParent).onNestedScrollAccepted(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                C17016a.m126270e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m126263f(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof ci20) {
            return ((ci20) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C17016a.m126271f(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m126264g(@NonNull ViewParent viewParent, @NonNull View view, int i) {
        if (viewParent instanceof ci20) {
            ((ci20) viewParent).onStopNestedScroll(view, i);
            return;
        }
        if (i == 0) {
            try {
                C17016a.m126272g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static boolean m126265h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
