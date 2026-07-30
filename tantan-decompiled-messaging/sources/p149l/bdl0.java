package p149l;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
public final class bdl0 {

    /* JADX INFO: renamed from: l.bdl0$a */
    @RequiresApi(21)
    public static class C15838a {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static boolean m101193a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m101194b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m101195c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m101196d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m101197e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static boolean m101198f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static void m101199g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m101185a(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2, boolean z) {
        try {
            return C15838a.m101193a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m101186b(@NonNull ViewParent viewParent, @NonNull View view, float f, float f2) {
        try {
            return C15838a.m101194b(viewParent, view, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m101187c(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (viewParent instanceof u920) {
            ((u920) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            try {
                C15838a.m101195c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m101188d(@NonNull ViewParent viewParent, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        if (viewParent instanceof v920) {
            ((v920) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof u920) {
            ((u920) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            try {
                C15838a.m101196d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m101189e(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof u920) {
            ((u920) viewParent).onNestedScrollAccepted(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            try {
                C15838a.m101197e(viewParent, view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m101190f(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i, int i2) {
        if (viewParent instanceof u920) {
            return ((u920) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        try {
            return C15838a.m101198f(viewParent, view, view2, i);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m101191g(@NonNull ViewParent viewParent, @NonNull View view, int i) {
        if (viewParent instanceof u920) {
            ((u920) viewParent).onStopNestedScroll(view, i);
            return;
        }
        if (i == 0) {
            try {
                C15838a.m101199g(viewParent, view);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public static boolean m101192h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
