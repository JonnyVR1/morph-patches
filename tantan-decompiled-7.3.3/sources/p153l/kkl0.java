package p153l;

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
public class kkl0 {

    /* JADX INFO: renamed from: a */
    public static WeakHashMap<View, hml0> f127212a = null;

    /* JADX INFO: renamed from: b */
    public static Field f127213b = null;

    /* JADX INFO: renamed from: c */
    public static boolean f127214c = false;

    /* JADX INFO: renamed from: d */
    public static final int[] f127215d = {kdc0.f125190b, kdc0.f125192c, kdc0.f125210n, kdc0.f125221y, kdc0.f125163B, kdc0.f125164C, kdc0.f125165D, kdc0.f125166E, kdc0.f125167F, kdc0.f125168G, kdc0.f125194d, kdc0.f125196e, kdc0.f125198f, kdc0.f125200g, kdc0.f125202h, kdc0.f125204i, kdc0.f125206j, kdc0.f125207k, kdc0.f125208l, kdc0.f125209m, kdc0.f125211o, kdc0.f125212p, kdc0.f125213q, kdc0.f125214r, kdc0.f125215s, kdc0.f125216t, kdc0.f125217u, kdc0.f125218v, kdc0.f125219w, kdc0.f125220x, kdc0.f125222z, kdc0.f125162A};

    /* JADX INFO: renamed from: e */
    public static final fn50 f127216e = new fn50() { // from class: l.jkl0
    };

    /* JADX INFO: renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC18183e f127217f = new ViewTreeObserverOnGlobalLayoutListenerC18183e();

    /* JADX INFO: renamed from: l.kkl0$a */
    public class C18179a extends AbstractC18184f<Boolean> {
        public C18179a(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo150197c(@NonNull View view) {
            return Boolean.valueOf(C18190l.m150244c(view));
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo150198d(@NonNull View view, Boolean bool) {
            C18190l.m150247f(view, bool.booleanValue());
        }

        @Override // p153l.kkl0.AbstractC18184f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo150199g(Boolean bool, Boolean bool2) {
            return !m150214a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$b */
    public class C18180b extends AbstractC18184f<CharSequence> {
        public C18180b(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo150197c(View view) {
            return C18190l.m150242a(view);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo150198d(View view, CharSequence charSequence) {
            C18190l.m150246e(view, charSequence);
        }

        @Override // p153l.kkl0.AbstractC18184f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo150199g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$c */
    public class C18181c extends AbstractC18184f<CharSequence> {
        public C18181c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(30)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence mo150197c(View view) {
            return C18192n.m150250a(view);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(30)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo150198d(View view, CharSequence charSequence) {
            C18192n.m150252c(view, charSequence);
        }

        @Override // p153l.kkl0.AbstractC18184f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo150199g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$d */
    public class C18182d extends AbstractC18184f<Boolean> {
        public C18182d(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean mo150197c(View view) {
            return Boolean.valueOf(C18190l.m150243b(view));
        }

        @Override // p153l.kkl0.AbstractC18184f
        @RequiresApi(28)
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo150198d(View view, Boolean bool) {
            C18190l.m150245d(view, bool.booleanValue());
        }

        @Override // p153l.kkl0.AbstractC18184f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean mo150199g(Boolean bool, Boolean bool2) {
            return !m150214a(bool, bool2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$g */
    @RequiresApi(20)
    public static class C18185g {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static WindowInsets m150218a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static WindowInsets m150219b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m150220c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: renamed from: l.kkl0$h */
    @RequiresApi(21)
    public static class C18186h {

        /* JADX INFO: renamed from: l.kkl0$h$a */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public dgq0 f127223a = null;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ View f127224b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ il50 f127225c;

            public a(View view, il50 il50Var) {
                this.f127224b = view;
                this.f127225c = il50Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                dgq0 dgq0VarM115674x = dgq0.m115674x(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    C18186h.m150221a(windowInsets, this.f127224b);
                    if (dgq0VarM115674x.equals(this.f127223a)) {
                        return this.f127225c.onApplyWindowInsets(view, dgq0VarM115674x).m115695v();
                    }
                }
                this.f127223a = dgq0VarM115674x;
                dgq0 dgq0VarOnApplyWindowInsets = this.f127225c.onApplyWindowInsets(view, dgq0VarM115674x);
                if (i >= 30) {
                    return dgq0VarOnApplyWindowInsets.m115695v();
                }
                kkl0.m150158g0(view);
                return dgq0VarOnApplyWindowInsets.m115695v();
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m150221a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(kdc0.f125197e0);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static ColorStateList m150222b(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static PorterDuff.Mode m150223c(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static float m150224d(View view) {
            return view.getElevation();
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static String m150225e(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static float m150226f(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static float m150227g(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static boolean m150228h(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static void m150229i(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        /* JADX INFO: renamed from: j */
        public static void m150230j(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        /* JADX INFO: renamed from: k */
        public static void m150231k(View view, float f) {
            view.setElevation(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: l */
        public static void m150232l(@NonNull View view, @Nullable il50 il50Var) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(kdc0.f125187Z, il50Var);
            }
            if (il50Var == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(kdc0.f125197e0));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, il50Var));
            }
        }

        @DoNotInline
        /* JADX INFO: renamed from: m */
        public static void m150233m(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: n */
        public static void m150234n(View view, float f) {
            view.setTranslationZ(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: o */
        public static void m150235o(@NonNull View view, float f) {
            view.setZ(f);
        }

        @DoNotInline
        /* JADX INFO: renamed from: p */
        public static void m150236p(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: renamed from: l.kkl0$i */
    @RequiresApi(23)
    public static class C18187i {
        @Nullable
        /* JADX INFO: renamed from: a */
        public static dgq0 m150237a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            dgq0 dgq0VarM115673w = dgq0.m115673w(rootWindowInsets);
            dgq0VarM115673w.m115693t(dgq0VarM115673w);
            dgq0VarM115673w.m115678d(view.getRootView());
            return dgq0VarM115673w;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m150238b(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$j */
    @RequiresApi(24)
    public static class C18188j {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m150239a(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$k */
    @RequiresApi(26)
    public static class C18189k {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static int m150240a(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m150241b(View view, int i) {
            view.setImportantForAutofill(i);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$l */
    @RequiresApi(28)
    public static class C18190l {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m150242a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m150243b(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static boolean m150244c(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static void m150245d(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static void m150246e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static void m150247f(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$m */
    @RequiresApi(29)
    public static class C18191m {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static View.AccessibilityDelegate m150248a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m150249b(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$n */
    @RequiresApi(30)
    public static class C18192n {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m150250a(View view) {
            return view.getStateDescription();
        }

        @Nullable
        /* JADX INFO: renamed from: b */
        public static bhq0 m150251b(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return bhq0.m104354c(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static void m150252c(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$o */
    public interface InterfaceC18193o {
        boolean onUnhandledKeyEvent(@NonNull View view, @NonNull KeyEvent keyEvent);
    }

    /* JADX INFO: renamed from: l.kkl0$p */
    public static class C18194p {

        /* JADX INFO: renamed from: d */
        public static final ArrayList<WeakReference<View>> f127226d = new ArrayList<>();

        /* JADX INFO: renamed from: a */
        @Nullable
        public WeakHashMap<View, Boolean> f127227a = null;

        /* JADX INFO: renamed from: b */
        public SparseArray<WeakReference<View>> f127228b = null;

        /* JADX INFO: renamed from: c */
        public WeakReference<KeyEvent> f127229c = null;

        /* JADX INFO: renamed from: a */
        public static C18194p m150253a(View view) {
            C18194p c18194p = (C18194p) view.getTag(kdc0.f125193c0);
            if (c18194p != null) {
                return c18194p;
            }
            C18194p c18194p2 = new C18194p();
            view.setTag(kdc0.f125193c0, c18194p2);
            return c18194p2;
        }

        /* JADX INFO: renamed from: b */
        public boolean m150254b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m150259g();
            }
            View viewM150255c = m150255c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewM150255c != null && !KeyEvent.isModifierKey(keyCode)) {
                    m150256d().put(keyCode, new WeakReference<>(viewM150255c));
                }
            }
            return viewM150255c != null;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final View m150255c(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f127227a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewM150255c = m150255c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewM150255c != null) {
                            return viewM150255c;
                        }
                    }
                }
                if (m150257e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: d */
        public final SparseArray<WeakReference<View>> m150256d() {
            if (this.f127228b == null) {
                this.f127228b = new SparseArray<>();
            }
            return this.f127228b;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m150257e(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(kdc0.f125195d0);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((InterfaceC18193o) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m150258f(KeyEvent keyEvent) {
            WeakReference<View> weakReferenceValueAt;
            int iIndexOfKey;
            WeakReference<KeyEvent> weakReference = this.f127229c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.f127229c = new WeakReference<>(keyEvent);
            SparseArray<WeakReference<View>> sparseArrayM150256d = m150256d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayM150256d.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReferenceValueAt = null;
            } else {
                weakReferenceValueAt = sparseArrayM150256d.valueAt(iIndexOfKey);
                sparseArrayM150256d.removeAt(iIndexOfKey);
            }
            if (weakReferenceValueAt == null) {
                weakReferenceValueAt = sparseArrayM150256d.get(keyEvent.getKeyCode());
            }
            if (weakReferenceValueAt == null) {
                return false;
            }
            View view = weakReferenceValueAt.get();
            if (view != null && view.isAttachedToWindow()) {
                m150257e(view, keyEvent);
            }
            return true;
        }

        /* JADX INFO: renamed from: g */
        public final void m150259g() {
            WeakHashMap<View, Boolean> weakHashMap = this.f127227a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f127226d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f127227a == null) {
                        this.f127227a = new WeakHashMap<>();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList<WeakReference<View>> arrayList2 = f127226d;
                        View view = arrayList2.get(size).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f127227a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f127227a.put((View) parent, Boolean.TRUE);
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
    public static int m150110A(@NonNull View view) {
        return view.getPaddingEnd();
    }

    /* JADX INFO: renamed from: A0 */
    public static void m150111A0(@NonNull View view, @Nullable ni80 ni80Var) {
        C18188j.m150239a(view, (PointerIcon) (ni80Var != null ? ni80Var.m163269a() : null));
    }

    @Px
    @Deprecated
    /* JADX INFO: renamed from: B */
    public static int m150112B(@NonNull View view) {
        return view.getPaddingStart();
    }

    /* JADX INFO: renamed from: B0 */
    public static void m150113B0(@NonNull View view, int i, int i2) {
        C18187i.m150238b(view, i, i2);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: C */
    public static ViewParent m150114C(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    /* JADX INFO: renamed from: C0 */
    public static void m150115C0(@NonNull View view, @Nullable String str) {
        C18186h.m150233m(view, str);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public static dgq0 m150116D(@NonNull View view) {
        return C18187i.m150237a(view);
    }

    /* JADX INFO: renamed from: D0 */
    public static void m150117D0(@NonNull View view, float f) {
        C18186h.m150234n(view, f);
    }

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: E */
    public static CharSequence m150118E(@NonNull View view) {
        return m150123G0().m150216e(view);
    }

    /* JADX INFO: renamed from: E0 */
    public static void m150119E0(@NonNull View view, @Nullable rfq0.AbstractC19828b abstractC19828b) {
        rfq0.m181249c(view, abstractC19828b);
    }

    @Nullable
    /* JADX INFO: renamed from: F */
    public static String m150120F(@NonNull View view) {
        return C18186h.m150225e(view);
    }

    /* JADX INFO: renamed from: F0 */
    public static void m150121F0(@NonNull View view, float f) {
        C18186h.m150235o(view, f);
    }

    /* JADX INFO: renamed from: G */
    public static float m150122G(@NonNull View view) {
        return C18186h.m150226f(view);
    }

    /* JADX INFO: renamed from: G0 */
    public static AbstractC18184f<CharSequence> m150123G0() {
        return new C18181c(kdc0.f125191b0, CharSequence.class, 64, 30);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: H */
    public static bhq0 m150124H(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C18192n.m150251b(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return nfq0.m162935a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: H0 */
    public static void m150125H0(@NonNull View view) {
        C18186h.m150236p(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: I */
    public static int m150126I(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public static void m150127I0(@NonNull View view, int i) {
        if (view instanceof zh20) {
            ((zh20) view).stopNestedScroll(i);
        } else if (i == 0) {
            m150125H0(view);
        }
    }

    /* JADX INFO: renamed from: J */
    public static float m150128J(@NonNull View view) {
        return C18186h.m150227g(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: K */
    public static boolean m150129K(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    /* JADX INFO: renamed from: L */
    public static boolean m150130L(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    /* JADX INFO: renamed from: M */
    public static boolean m150131M(@NonNull View view) {
        return view.hasTransientState();
    }

    @UiThread
    /* JADX INFO: renamed from: N */
    public static boolean m150132N(@NonNull View view) {
        Boolean boolM150216e = m150145a().m150216e(view);
        return boolM150216e != null && boolM150216e.booleanValue();
    }

    @Deprecated
    /* JADX INFO: renamed from: O */
    public static boolean m150133O(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    @Deprecated
    /* JADX INFO: renamed from: P */
    public static boolean m150134P(@NonNull View view) {
        return view.isLaidOut();
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m150135Q(@NonNull View view) {
        return C18186h.m150228h(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: R */
    public static boolean m150136R(@NonNull View view) {
        return view.isPaddingRelative();
    }

    @UiThread
    /* JADX INFO: renamed from: S */
    public static boolean m150137S(@NonNull View view) {
        Boolean boolM150216e = m150162i0().m150216e(view);
        return boolM150216e != null && boolM150216e.booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public static void m150138T(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = m150171n(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(m150171n(view));
                    m150186u0(view);
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
            accessibilityEventObtain2.getText().add(m150171n(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX INFO: renamed from: U */
    public static void m150139U(@NonNull View view, int i) {
        view.offsetLeftAndRight(i);
    }

    /* JADX INFO: renamed from: V */
    public static void m150140V(@NonNull View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @NonNull
    /* JADX INFO: renamed from: W */
    public static dgq0 m150141W(@NonNull View view, @NonNull dgq0 dgq0Var) {
        WindowInsets windowInsetsM115695v = dgq0Var.m115695v();
        if (windowInsetsM115695v != null) {
            WindowInsets windowInsetsM150219b = C18185g.m150219b(view, windowInsetsM115695v);
            if (!windowInsetsM150219b.equals(windowInsetsM115695v)) {
                return dgq0.m115674x(windowInsetsM150219b, view);
            }
        }
        return dgq0Var;
    }

    @Deprecated
    /* JADX INFO: renamed from: X */
    public static void m150142X(@NonNull View view, @NonNull C15967bc c15967bc) {
        view.onInitializeAccessibilityNodeInfo(c15967bc.m103398S0());
    }

    /* JADX INFO: renamed from: Y */
    public static AbstractC18184f<CharSequence> m150143Y() {
        return new C18180b(kdc0.f125186Y, CharSequence.class, 8, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: Z */
    public static boolean m150144Z(@NonNull View view, int i, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC18184f<Boolean> m150145a() {
        return new C18182d(kdc0.f125185X, Boolean.class, 28);
    }

    @Deprecated
    /* JADX INFO: renamed from: a0 */
    public static void m150146a0(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: b */
    public static void m150147b(@NonNull View view, @NonNull C15967bc.a aVar) {
        m150159h(view);
        m150154e0(aVar.m103454b(), view);
        m150173o(view).add(aVar);
        m150138T(view, 0);
    }

    @Deprecated
    /* JADX INFO: renamed from: b0 */
    public static void m150148b0(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @NonNull
    @Deprecated
    /* JADX INFO: renamed from: c */
    public static hml0 m150149c(@NonNull View view) {
        if (f127212a == null) {
            f127212a = new WeakHashMap<>();
        }
        hml0 hml0Var = f127212a.get(view);
        if (hml0Var != null) {
            return hml0Var;
        }
        hml0 hml0Var2 = new hml0(view);
        f127212a.put(view, hml0Var2);
        return hml0Var2;
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    /* JADX INFO: renamed from: c0 */
    public static void m150150c0(@NonNull View view, @NonNull Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public static boolean m150151d(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* JADX INFO: renamed from: d0 */
    public static void m150152d0(@NonNull View view, int i) {
        m150154e0(i, view);
        m150138T(view, 0);
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static dgq0 m150153e(@NonNull View view, @NonNull dgq0 dgq0Var) {
        WindowInsets windowInsetsM115695v = dgq0Var.m115695v();
        if (windowInsetsM115695v != null) {
            WindowInsets windowInsetsM150218a = C18185g.m150218a(view, windowInsetsM115695v);
            if (!windowInsetsM150218a.equals(windowInsetsM115695v)) {
                return dgq0.m115674x(windowInsetsM150218a, view);
            }
        }
        return dgq0Var;
    }

    /* JADX INFO: renamed from: e0 */
    public static void m150154e0(int i, View view) {
        List<C15967bc.a> listM150173o = m150173o(view);
        for (int i2 = 0; i2 < listM150173o.size(); i2++) {
            if (listM150173o.get(i2).m103454b() == i) {
                listM150173o.remove(i2);
                return;
            }
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public static boolean m150155f(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C18194p.m150253a(view).m150254b(view, keyEvent);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m150156f0(@NonNull View view, @NonNull C15967bc.a aVar, @Nullable CharSequence charSequence, @Nullable InterfaceC16750ec interfaceC16750ec) {
        if (interfaceC16750ec == null && charSequence == null) {
            m150152d0(view, aVar.m103454b());
        } else {
            m150147b(view, aVar.m103453a(charSequence, interfaceC16750ec));
        }
    }

    @UiThread
    /* JADX INFO: renamed from: g */
    public static boolean m150157g(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return C18194p.m150253a(view).m150258f(keyEvent);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m150158g0(@NonNull View view) {
        C18185g.m150220c(view);
    }

    /* JADX INFO: renamed from: h */
    public static void m150159h(@NonNull View view) {
        C16932fb c16932fbM150163j = m150163j(view);
        if (c16932fbM150163j == null) {
            c16932fbM150163j = new C16932fb();
        }
        m150164j0(view, c16932fbM150163j);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m150160h0(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            C18191m.m150249b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public static int m150161i() {
        return View.generateViewId();
    }

    /* JADX INFO: renamed from: i0 */
    public static AbstractC18184f<Boolean> m150162i0() {
        return new C18179a(kdc0.f125189a0, Boolean.class, 28);
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public static C16932fb m150163j(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateM150165k = m150165k(view);
        if (accessibilityDelegateM150165k == null) {
            return null;
        }
        return accessibilityDelegateM150165k instanceof C16932fb.a ? ((C16932fb.a) accessibilityDelegateM150165k).f98026a : new C16932fb(accessibilityDelegateM150165k);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m150164j0(@NonNull View view, @Nullable C16932fb c16932fb) {
        if (c16932fb == null && (m150165k(view) instanceof C16932fb.a)) {
            c16932fb = new C16932fb();
        }
        m150186u0(view);
        view.setAccessibilityDelegate(c16932fb == null ? null : c16932fb.getBridge());
    }

    @Nullable
    /* JADX INFO: renamed from: k */
    public static View.AccessibilityDelegate m150165k(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 29 ? C18191m.m150248a(view) : m150167l(view);
    }

    @UiThread
    /* JADX INFO: renamed from: k0 */
    public static void m150166k0(@NonNull View view, boolean z) {
        m150145a().m150217f(view, Boolean.valueOf(z));
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public static View.AccessibilityDelegate m150167l(@NonNull View view) {
        if (f127214c) {
            return null;
        }
        if (f127213b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f127213b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f127214c = true;
                return null;
            }
        }
        try {
            Object obj = f127213b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f127214c = true;
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: l0 */
    public static void m150168l0(@NonNull View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public static int m150169m(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @Deprecated
    /* JADX INFO: renamed from: m0 */
    public static void m150170m0(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    @Nullable
    @UiThread
    /* JADX INFO: renamed from: n */
    public static CharSequence m150171n(@NonNull View view) {
        return m150143Y().m150216e(view);
    }

    /* JADX INFO: renamed from: n0 */
    public static void m150172n0(@NonNull View view, @Nullable ColorStateList colorStateList) {
        C18186h.m150229i(view, colorStateList);
    }

    /* JADX INFO: renamed from: o */
    public static List<C15967bc.a> m150173o(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(kdc0.f125183V);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(kdc0.f125183V, arrayList2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: o0 */
    public static void m150174o0(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        C18186h.m150230j(view, mode);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public static ColorStateList m150175p(@NonNull View view) {
        return C18186h.m150222b(view);
    }

    @Deprecated
    /* JADX INFO: renamed from: p0 */
    public static void m150176p0(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public static PorterDuff.Mode m150177q(@NonNull View view) {
        return C18186h.m150223c(view);
    }

    /* JADX INFO: renamed from: q0 */
    public static void m150178q0(@NonNull View view, float f) {
        C18186h.m150231k(view, f);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: r */
    public static Rect m150179r(@NonNull View view) {
        return view.getClipBounds();
    }

    @Deprecated
    /* JADX INFO: renamed from: r0 */
    public static void m150180r0(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @Nullable
    @Deprecated
    /* JADX INFO: renamed from: s */
    public static Display m150181s(@NonNull View view) {
        return view.getDisplay();
    }

    @Deprecated
    /* JADX INFO: renamed from: s0 */
    public static void m150182s0(@NonNull View view, boolean z) {
        view.setHasTransientState(z);
    }

    /* JADX INFO: renamed from: t */
    public static float m150183t(@NonNull View view) {
        return C18186h.m150224d(view);
    }

    @UiThread
    @Deprecated
    /* JADX INFO: renamed from: t0 */
    public static void m150184t0(@NonNull View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: u */
    public static boolean m150185u(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    /* JADX INFO: renamed from: u0 */
    public static void m150186u0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: v */
    public static int m150187v(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    /* JADX INFO: renamed from: v0 */
    public static void m150188v0(@NonNull View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            C18189k.m150241b(view, i);
        }
    }

    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: w */
    public static int m150189w(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C18189k.m150240a(view);
        }
        return 0;
    }

    @Deprecated
    /* JADX INFO: renamed from: w0 */
    public static void m150190w0(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    /* JADX INFO: renamed from: x */
    public static int m150191x(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @Deprecated
    /* JADX INFO: renamed from: x0 */
    public static void m150192x0(@NonNull View view, int i) {
        view.setLayoutDirection(i);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static int m150193y(@NonNull View view) {
        return view.getMinimumHeight();
    }

    /* JADX INFO: renamed from: y0 */
    public static void m150194y0(@NonNull View view, @Nullable il50 il50Var) {
        C18186h.m150232l(view, il50Var);
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public static int m150195z(@NonNull View view) {
        return view.getMinimumWidth();
    }

    @Deprecated
    /* JADX INFO: renamed from: z0 */
    public static void m150196z0(@NonNull View view, @Px int i, @Px int i2, @Px int i3, @Px int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: l.kkl0$f */
    public static abstract class AbstractC18184f<T> {

        /* JADX INFO: renamed from: a */
        public final int f127219a;

        /* JADX INFO: renamed from: b */
        public final Class<T> f127220b;

        /* JADX INFO: renamed from: c */
        public final int f127221c;

        /* JADX INFO: renamed from: d */
        public final int f127222d;

        public AbstractC18184f(int i, Class<T> cls, int i2, int i3) {
            this.f127219a = i;
            this.f127220b = cls;
            this.f127222d = i2;
            this.f127221c = i3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m150214a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* JADX INFO: renamed from: b */
        public final boolean m150215b() {
            return Build.VERSION.SDK_INT >= this.f127221c;
        }

        /* JADX INFO: renamed from: c */
        public abstract T mo150197c(View view);

        /* JADX INFO: renamed from: d */
        public abstract void mo150198d(View view, T t);

        /* JADX INFO: renamed from: e */
        public T m150216e(View view) {
            if (m150215b()) {
                return mo150197c(view);
            }
            T t = (T) view.getTag(this.f127219a);
            if (this.f127220b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public void m150217f(View view, T t) {
            if (m150215b()) {
                mo150198d(view, t);
            } else if (mo150199g(m150216e(view), t)) {
                kkl0.m150159h(view);
                view.setTag(this.f127219a, t);
                kkl0.m150138T(view, this.f127222d);
            }
        }

        /* JADX INFO: renamed from: g */
        public abstract boolean mo150199g(T t, T t2);

        public AbstractC18184f(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }
    }

    /* JADX INFO: renamed from: l.kkl0$e */
    public static class ViewTreeObserverOnGlobalLayoutListenerC18183e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public final WeakHashMap<View, Boolean> f127218a = new WeakHashMap<>();

        /* JADX INFO: renamed from: a */
        public final void m150212a(Map.Entry<View, Boolean> entry) {
            View key = entry.getKey();
            boolean zBooleanValue = entry.getValue().booleanValue();
            boolean z = key.isShown() && key.getWindowVisibility() == 0;
            if (zBooleanValue != z) {
                kkl0.m150138T(key, z ? 16 : 32);
                entry.setValue(Boolean.valueOf(z));
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m150213b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator<Map.Entry<View, Boolean>> it = this.f127218a.entrySet().iterator();
                while (it.hasNext()) {
                    m150212a(it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            m150213b(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
