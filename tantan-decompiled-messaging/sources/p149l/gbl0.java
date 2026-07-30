package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"PrivateConstructorForUtilityClass"})
public class gbl0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, ddl0> f101862a = null;

    /* JADX INFO: renamed from: b */
    public static Field f101863b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f101864c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f101865d = {e5c0.f89390b, e5c0.f89392c, e5c0.f89410n, e5c0.f89421y, e5c0.f89363B, e5c0.f89364C, e5c0.f89365D, e5c0.f89366E, e5c0.f89367F, e5c0.f89368G, e5c0.f89394d, e5c0.f89396e, e5c0.f89398f, e5c0.f89400g, e5c0.f89402h, e5c0.f89404i, e5c0.f89406j, e5c0.f89407k, e5c0.f89408l, e5c0.f89409m, e5c0.f89411o, e5c0.f89412p, e5c0.f89413q, e5c0.f89414r, e5c0.f89415s, e5c0.f89416t, e5c0.f89417u, e5c0.f89418v, e5c0.f89419w, e5c0.f89420x, e5c0.f89422z, e5c0.f89362A};

    /* JADX INFO: renamed from: e */
    public static final ye50 f101866e = new ye50() { // from class: l.fbl0
    };

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC17039e f101867f = new ViewTreeObserverOnGlobalLayoutListenerC17039e();

    /* JADX INFO: renamed from: l.gbl0$a */
    public class C17035a extends AbstractC17040f<Boolean> {
        public C17035a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo125234c(@NonNull View view) {
            return Boolean.valueOf(C17046l.m125281c(view));
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo125235d(@NonNull View view, Boolean bool) {
            C17046l.m125284f(view, bool.booleanValue());
        }

        @Override // p149l.gbl0.AbstractC17040f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo125236g(Boolean bool, Boolean bool2) {
            return !m125251a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$b */
    public class C17036b extends AbstractC17040f<CharSequence> {
        public C17036b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo125234c(View view) {
            return C17046l.m125279a(view);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo125235d(View view, CharSequence charSequence) {
            C17046l.m125283e(view, charSequence);
        }

        @Override // p149l.gbl0.AbstractC17040f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo125236g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$c */
    public class C17037c extends AbstractC17040f<CharSequence> {
        public C17037c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo125234c(View view) {
            return C17048n.m125287a(view);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo125235d(View view, CharSequence charSequence) {
            C17048n.m125289c(view, charSequence);
        }

        @Override // p149l.gbl0.AbstractC17040f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo125236g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$d */
    public class C17038d extends AbstractC17040f<Boolean> {
        public C17038d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo125234c(View view) {
            return Boolean.valueOf(C17046l.m125280b(view));
        }

        @Override // p149l.gbl0.AbstractC17040f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo125235d(View view, Boolean bool) {
            C17046l.m125282d(view, bool.booleanValue());
        }

        @Override // p149l.gbl0.AbstractC17040f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo125236g(Boolean bool, Boolean bool2) {
            return !m125251a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$g */
    @RequiresApi(20)
    public static class C17041g {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static WindowInsets m125255a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static WindowInsets m125256b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m125257c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: l.gbl0$h */
    @RequiresApi(21)
    public static class C17042h {

        /* JADX INFO: renamed from: l.gbl0$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public y6q0 f101873a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f101874b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ bd50 f101875c;

            public a(View view, bd50 bd50Var) {
                this.f101874b = view;
                this.f101875c = bd50Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                y6q0 y6q0VarM213173x = y6q0.m213173x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C17042h.m125258a(windowInsets, this.f101874b);
                    if (y6q0VarM213173x.equals(this.f101873a)) {
                        return this.f101875c.onApplyWindowInsets(view, y6q0VarM213173x).m213194v();
                    }
                }
                this.f101873a = y6q0VarM213173x;
                y6q0 y6q0VarOnApplyWindowInsets = this.f101875c.onApplyWindowInsets(view, y6q0VarM213173x);
                if (i >= 30) {
                    return y6q0VarOnApplyWindowInsets.m213194v();
                }
                gbl0.m125195g0(view);
                return y6q0VarOnApplyWindowInsets.m213194v();
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m125258a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(e5c0.f89397e0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ColorStateList m125259b(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static PorterDuff.Mode m125260c(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static float m125261d(View view) {
            return view.getElevation();
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static String m125262e(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static float m125263f(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static float m125264g(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static boolean m125265h(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static void m125266i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: j */
        public static void m125267j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: k */
        public static void m125268k(View view, float f) {
            view.setElevation(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: l */
        public static void m125269l(@NonNull View view, @Nullable bd50 bd50Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(e5c0.f89387Z, bd50Var);
            }
            if (bd50Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(e5c0.f89397e0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, bd50Var));
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: m */
        public static void m125270m(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: n */
        public static void m125271n(View view, float f) {
            view.setTranslationZ(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: o */
        public static void m125272o(@NonNull View view, float f) {
            view.setZ(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: p */
        public static void m125273p(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: l.gbl0$i */
    @RequiresApi(23)
    public static class C17043i {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static y6q0 m125274a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            y6q0 y6q0VarM213172w = y6q0.m213172w(rootWindowInsets);
            y6q0VarM213172w.m213192t(y6q0VarM213172w);
            y6q0VarM213172w.m213177d(view.getRootView());
            return y6q0VarM213172w;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m125275b(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$j */
    @RequiresApi(24)
    public static class C17044j {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m125276a(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$k */
    @RequiresApi(26)
    public static class C17045k {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m125277a(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m125278b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$l */
    @RequiresApi(28)
    public static class C17046l {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m125279a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m125280b(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static boolean m125281c(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m125282d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m125283e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m125284f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$m */
    @RequiresApi(29)
    public static class C17047m {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m125285a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m125286b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$n */
    @RequiresApi(30)
    public static class C17048n {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m125287a(View view) {
            return view.getStateDescription();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static w7q0 m125288b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return w7q0.m202059c(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m125289c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$o */
    public interface InterfaceC17049o {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: l.gbl0$p */
    public static class C17050p {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f101876d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        @Nullable
        public WeakHashMap<View, Boolean> f101877a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f101878b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f101879c = null;

        /* JADX INFO: renamed from: a */
        public static C17050p m125290a(View view) {
            C17050p c17050p = (C17050p) view.getTag(e5c0.f89393c0);
            if (c17050p != null) {
                return c17050p;
            }
            C17050p c17050p2 = new C17050p();
            view.setTag(e5c0.f89393c0, c17050p2);
            return c17050p2;
        }

        /* JADX INFO: renamed from: b */
        public boolean m125291b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m125296g();
            }
            View viewM125292c = m125292c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM125292c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m125293d().put(keyCode, new WeakReference<>(viewM125292c));
                }
            }
            return viewM125292c != null;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final View m125292c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f101877a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM125292c = m125292c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM125292c != null) {
                            return viewM125292c;
                        }
                    }
                }
                if (m125294e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final SparseArray<WeakReference<View>> m125293d() {
            if (this.f101878b == null) {
                this.f101878b = new SparseArray<>();
            }
            return this.f101878b;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m125294e(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(e5c0.f89395d0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC17049o) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m125295f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f101879c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f101879c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayM125293d = m125293d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM125293d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayM125293d.valueAt(iIndexOfKey);
                sparseArrayM125293d.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM125293d.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                m125294e(view, keyEvent);
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m125296g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f101877a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f101876d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f101877a == null) {
                        this.f101877a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f101876d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f101877a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f101877a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Px
    @Deprecated
    /* JADX INFO: renamed from: A */
    public static int m125147A(@NonNull View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m125148A0(@NonNull View view, @Nullable ha80 ha80Var) {
        C17044j.m125276a(view, (PointerIcon) (ha80Var != null ? ha80Var.m130071a() : null));
    }

    @Px
    @Deprecated
    /* JADX INFO: renamed from: B */
    public static int m125149B(@NonNull View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: B0 */
    public static void m125150B0(@NonNull View view, int i, int i2) {
        C17043i.m125275b(view, i, i2);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: C */
    public static ViewParent m125151C(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m125152C0(@NonNull View view, @Nullable String str) {
        C17042h.m125270m(view, str);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static y6q0 m125153D(@NonNull View view) {
        return C17043i.m125274a(view);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m125154D0(@NonNull View view, float f) {
        C17042h.m125271n(view, f);
    }

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: E */
    public static CharSequence m125155E(@NonNull View view) {
        return m125160G0().m125253e(view);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m125156E0(@NonNull View view, @Nullable m6q0.AbstractC18406b abstractC18406b) {
        m6q0.m153264c(view, abstractC18406b);
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static String m125157F(@NonNull View view) {
        return C17042h.m125262e(view);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m125158F0(@NonNull View view, float f) {
        C17042h.m125272o(view, f);
    }

    /* JADX INFO: renamed from: G */
    public static float m125159G(@NonNull View view) {
        return C17042h.m125263f(view);
    }

    /* JADX INFO: renamed from: G0 */
    public static AbstractC17040f<CharSequence> m125160G0() {
        return new C17037c(e5c0.f89391b0, CharSequence.class, 64, 30);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: H */
    public static w7q0 m125161H(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C17048n.m125288b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return i6q0.m134630a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static void m125162H0(@NonNull View view) {
        C17042h.m125273p(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public static int m125163I(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public static void m125164I0(@NonNull View view, int i) {
        if (view instanceof r920) {
            ((r920) view).stopNestedScroll(i);
        } else if (i == 0) {
            m125162H0(view);
        }
    }

    /* JADX INFO: renamed from: J */
    public static float m125165J(@NonNull View view) {
        return C17042h.m125264g(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    public static boolean m125166K(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    /* JADX INFO: renamed from: L */
    public static boolean m125167L(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    /* JADX INFO: renamed from: M */
    public static boolean m125168M(@NonNull View view) {
        return view.hasTransientState();
    }

    @UiThread
    /* JADX INFO: renamed from: N */
    public static boolean m125169N(@NonNull View view) {
        Boolean boolM125253e = m125182a().m125253e(view);
        return boolM125253e != null && boolM125253e.booleanValue();
    }

    @Deprecated
    /* JADX INFO: renamed from: O */
    public static boolean m125170O(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    /* JADX INFO: renamed from: P */
    public static boolean m125171P(@NonNull View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m125172Q(@NonNull View view) {
        return C17042h.m125265h(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: R */
    public static boolean m125173R(@NonNull View view) {
        return view.isPaddingRelative();
    }

    @UiThread
    /* JADX INFO: renamed from: S */
    public static boolean m125174S(@NonNull View view) {
        Boolean boolM125253e = m125199i0().m125253e(view);
        return boolM125253e != null && boolM125253e.booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static void m125175T(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m125208n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m125208n(view));
                    m125223u0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m125208n(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m125176U(@NonNull View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* JADX INFO: renamed from: V */
    public static void m125177V(@NonNull View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static y6q0 m125178W(@NonNull View view, @NonNull y6q0 y6q0Var) {
        WindowInsets windowInsetsM213194v = y6q0Var.m213194v();
        if (windowInsetsM213194v != null) {
            WindowInsets windowInsetsM125256b = C17041g.m125256b(view, windowInsetsM213194v);
            if (!windowInsetsM125256b.equals(windowInsetsM213194v)) {
                return y6q0.m213173x(windowInsetsM125256b, view);
            }
        }
        return y6q0Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: X */
    public static void m125179X(@NonNull View view, @NonNull C17055gc c17055gc) {
        view.onInitializeAccessibilityNodeInfo(c17055gc.m125394S0());
    }

    /* JADX INFO: renamed from: Y */
    public static AbstractC17040f<CharSequence> m125180Y() {
        return new C17036b(e5c0.f89386Y, CharSequence.class, 8, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: Z */
    public static boolean m125181Z(@NonNull View view, int i, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC17040f<Boolean> m125182a() {
        return new C17038d(e5c0.f89385X, Boolean.class, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: a0 */
    public static void m125183a0(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: b */
    public static void m125184b(@NonNull View view, @NonNull C17055gc.a aVar) {
        m125196h(view);
        m125191e0(aVar.m125450b(), view);
        m125210o(view).add(aVar);
        m125175T(view, 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: b0 */
    public static void m125185b0(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static ddl0 m125186c(@NonNull View view) {
        if (f101862a == null) {
            f101862a = new WeakHashMap<>();
        }
        ddl0 ddl0Var = f101862a.get(view);
        if (ddl0Var != null) {
            return ddl0Var;
        }
        ddl0 ddl0Var2 = new ddl0(view);
        f101862a.put(view, ddl0Var2);
        return ddl0Var2;
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    /* JADX INFO: renamed from: c0 */
    public static void m125187c0(@NonNull View view, @NonNull Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static boolean m125188d(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m125189d0(@NonNull View view, int i) {
        m125191e0(i, view);
        m125175T(view, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static y6q0 m125190e(@NonNull View view, @NonNull y6q0 y6q0Var) {
        WindowInsets windowInsetsM213194v = y6q0Var.m213194v();
        if (windowInsetsM213194v != null) {
            WindowInsets windowInsetsM125255a = C17041g.m125255a(view, windowInsetsM213194v);
            if (!windowInsetsM125255a.equals(windowInsetsM213194v)) {
                return y6q0.m213173x(windowInsetsM125255a, view);
            }
        }
        return y6q0Var;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m125191e0(int i, View view) {
        List<C17055gc.a> listM125210o = m125210o(view);
        for (int i2 = 0; i2 < listM125210o.size(); i2++) {
            if (listM125210o.get(i2).m125450b() == i) {
                listM125210o.remove(i2);
                return;
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public static boolean m125192f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C17050p.m125290a(view).m125291b(view, keyEvent);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m125193f0(@NonNull View view, @NonNull C17055gc.a aVar, @Nullable CharSequence charSequence, @Nullable InterfaceC17741jc interfaceC17741jc) {
        if (interfaceC17741jc == null && charSequence == null) {
            m125189d0(view, aVar.m125450b());
        } else {
            m125184b(view, aVar.m125449a(charSequence, interfaceC17741jc));
        }
    }

    @UiThread
    /* JADX INFO: renamed from: g */
    public static boolean m125194g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C17050p.m125290a(view).m125295f(keyEvent);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m125195g0(@NonNull View view) {
        C17041g.m125257c(view);
    }

    /* JADX INFO: renamed from: h */
    public static void m125196h(@NonNull View view) {
        C17974kb c17974kbM125200j = m125200j(view);
        if (c17974kbM125200j == null) {
            c17974kbM125200j = new C17974kb();
        }
        m125201j0(view, c17974kbM125200j);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m125197h0(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C17047m.m125286b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static int m125198i() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: i0 */
    public static AbstractC17040f<Boolean> m125199i0() {
        return new C17035a(e5c0.f89389a0, Boolean.class, 28);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static C17974kb m125200j(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateM125202k = m125202k(view);
        if (accessibilityDelegateM125202k == null) {
            return null;
        }
        return accessibilityDelegateM125202k instanceof C17974kb.a ? ((C17974kb.a) accessibilityDelegateM125202k).f122163a : new C17974kb(accessibilityDelegateM125202k);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m125201j0(@NonNull View view, @Nullable C17974kb c17974kb) {
        if (c17974kb == null && (m125202k(view) instanceof C17974kb.a)) {
            c17974kb = new C17974kb();
        }
        m125223u0(view);
        view.setAccessibilityDelegate(c17974kb == null ? null : c17974kb.getBridge());
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static View.AccessibilityDelegate m125202k(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? C17047m.m125285a(view) : m125204l(view);
    }

    @UiThread
    /* JADX INFO: renamed from: k0 */
    public static void m125203k0(@NonNull View view, boolean z) {
        m125182a().m125254f(view, Boolean.valueOf(z));
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static View.AccessibilityDelegate m125204l(@NonNull View view) {
        if (f101864c) {
            return null;
        }
        if (f101863b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f101863b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f101864c = true;
                return null;
            }
        }
        try {
            Object obj = f101863b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f101864c = true;
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: l0 */
    public static void m125205l0(@NonNull View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static int m125206m(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @Deprecated
    /* JADX INFO: renamed from: m0 */
    public static void m125207m0(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: n */
    public static CharSequence m125208n(@NonNull View view) {
        return m125180Y().m125253e(view);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m125209n0(@NonNull View view, @Nullable ColorStateList colorStateList) {
        C17042h.m125266i(view, colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public static List<C17055gc.a> m125210o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(e5c0.f89383V);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(e5c0.f89383V, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m125211o0(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        C17042h.m125267j(view, mode);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static ColorStateList m125212p(@NonNull View view) {
        return C17042h.m125259b(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: p0 */
    public static void m125213p0(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static PorterDuff.Mode m125214q(@NonNull View view) {
        return C17042h.m125260c(view);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m125215q0(@NonNull View view, float f) {
        C17042h.m125268k(view, f);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: r */
    public static Rect m125216r(@NonNull View view) {
        return view.getClipBounds();
    }

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public static void m125217r0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static Display m125218s(@NonNull View view) {
        return view.getDisplay();
    }

    @Deprecated
    /* JADX INFO: renamed from: s0 */
    public static void m125219s0(@NonNull View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: renamed from: t */
    public static float m125220t(@NonNull View view) {
        return C17042h.m125261d(view);
    }

    @UiThread
    @Deprecated
    /* JADX INFO: renamed from: t0 */
    public static void m125221t0(@NonNull View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static boolean m125222u(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: u0 */
    public static void m125223u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public static int m125224v(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: v0 */
    public static void m125225v0(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C17045k.m125278b(view, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: w */
    public static int m125226w(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C17045k.m125277a(view);
        }
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: w0 */
    public static void m125227w0(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static int m125228x(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    /* JADX INFO: renamed from: x0 */
    public static void m125229x0(@NonNull View view, int i) {
        view.setLayoutDirection(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m125230y(@NonNull View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m125231y0(@NonNull View view, @Nullable bd50 bd50Var) {
        C17042h.m125269l(view, bd50Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static int m125232z(@NonNull View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public static void m125233z0(@NonNull View view, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: l.gbl0$f */
    public static abstract class AbstractC17040f<T> {

        /* JADX INFO: renamed from: a */
        public final int f101869a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f101870b;

        /* JADX INFO: renamed from: c */
        public final int f101871c;

        /* JADX INFO: renamed from: d */
        public final int f101872d;

        public AbstractC17040f(int i, Class<T> cls, int i2, int i3) {
            this.f101869a = i;
            this.f101870b = cls;
            this.f101872d = i2;
            this.f101871c = i3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m125251a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m125252b() {
            return Build.VERSION.SDK_INT >= this.f101871c;
        }

        /* JADX INFO: renamed from: c */
        public abstract T mo125234c(View view);

        /* JADX INFO: renamed from: d */
        public abstract void mo125235d(View view, T t);

        /* JADX INFO: renamed from: e */
        public T m125253e(View view) {
            if (m125252b()) {
                return mo125234c(view);
            }
            T t = (T) view.getTag(this.f101869a);
            if (this.f101870b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public void m125254f(View view, T t) {
            if (m125252b()) {
                mo125235d(view, t);
            } else if (mo125236g(m125253e(view), t)) {
                gbl0.m125196h(view);
                view.setTag(this.f101869a, t);
                gbl0.m125175T(view, this.f101872d);
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo125236g(T t, T t2);

        public AbstractC17040f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }
    }

    /* JADX INFO: renamed from: l.gbl0$e */
    public static class ViewTreeObserverOnGlobalLayoutListenerC17039e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f101868a = new WeakHashMap<>();

        /* JADX INFO: renamed from: a */
        public final void m125249a(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                gbl0.m125175T(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m125250b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f101868a.entrySet().iterator();
                while (it.hasNext()) {
                    m125249a(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m125250b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
