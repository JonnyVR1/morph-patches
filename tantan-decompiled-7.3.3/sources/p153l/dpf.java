package p153l;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class dpf extends C16932fb {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final cwi.InterfaceC16383a<C15967bc> NODE_ADAPTER = new C16596a();
    private static final cwi.InterfaceC16384b<gvf0<C15967bc>, C15967bc> SPARSE_VALUES_ADAPTER = new C16597b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private C16598c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l.dpf$a */
    public static class C16596a implements cwi.InterfaceC16383a<C15967bc> {
        @Override // p153l.cwi.InterfaceC16383a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo112919a(C15967bc c15967bc, Rect rect) {
            c15967bc.m103426m(rect);
        }
    }

    /* JADX INFO: renamed from: l.dpf$b */
    public static class C16597b implements cwi.InterfaceC16384b<gvf0<C15967bc>, C15967bc> {
        @Override // p153l.cwi.InterfaceC16384b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C15967bc mo112920a(gvf0<C15967bc> gvf0Var, int i) {
            return gvf0Var.m132555m(i);
        }

        @Override // p153l.cwi.InterfaceC16384b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo112921b(gvf0<C15967bc> gvf0Var) {
            return gvf0Var.m132554l();
        }
    }

    /* JADX INFO: renamed from: l.dpf$c */
    public class C16598c extends C16226cc {
        public C16598c() {
        }

        @Override // p153l.C16226cc
        /* JADX INFO: renamed from: b */
        public C15967bc mo108693b(int i) {
            return C15967bc.m103358c0(dpf.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // p153l.C16226cc
        /* JADX INFO: renamed from: d */
        public C15967bc mo108695d(int i) {
            dpf dpfVar = dpf.this;
            int i2 = i == 2 ? dpfVar.mAccessibilityFocusedVirtualViewId : dpfVar.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo108693b(i2);
        }

        @Override // p153l.C16226cc
        /* JADX INFO: renamed from: f */
        public boolean mo108697f(int i, int i2, Bundle bundle) {
            return dpf.this.performAction(i, i2, bundle);
        }
    }

    public dpf(@NonNull View view) {
        if (view == null) {
            wg3.m206174a("View may not be null");
            throw null;
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (kkl0.m150187v(view) == 0) {
            kkl0.m150184t0(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId != i) {
            return false;
        }
        this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 65536);
        return true;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        C15967bc c15967bcObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c15967bcObtainAccessibilityNodeInfo.m103365C());
        accessibilityEventObtain.setContentDescription(c15967bcObtainAccessibilityNodeInfo.m103439t());
        accessibilityEventObtain.setScrollable(c15967bcObtainAccessibilityNodeInfo.m103401V());
        accessibilityEventObtain.setPassword(c15967bcObtainAccessibilityNodeInfo.m103400U());
        accessibilityEventObtain.setEnabled(c15967bcObtainAccessibilityNodeInfo.m103389O());
        accessibilityEventObtain.setChecked(c15967bcObtainAccessibilityNodeInfo.m103383L());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            azk0.m101074a("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain.setClassName(c15967bcObtainAccessibilityNodeInfo.m103434q());
        C16495dc.m115181c(accessibilityEventObtain, this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    private C15967bc createNodeForChild(int i) {
        C15967bc c15967bcM103356a0 = C15967bc.m103356a0();
        c15967bcM103356a0.m103444v0(true);
        c15967bcM103356a0.m103448x0(true);
        c15967bcM103356a0.m103431o0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        c15967bcM103356a0.m103421j0(rect);
        c15967bcM103356a0.m103423k0(rect);
        c15967bcM103356a0.m103372F0(this.mHost);
        onPopulateNodeForVirtualView(i, c15967bcM103356a0);
        if (c15967bcM103356a0.m103365C() == null && c15967bcM103356a0.m103439t() == null) {
            azk0.m101074a("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        c15967bcM103356a0.m103426m(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            azk0.m101074a("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int iM103422k = c15967bcM103356a0.m103422k();
        if ((iM103422k & 64) != 0) {
            azk0.m101074a("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((iM103422k & 128) != 0) {
            azk0.m101074a("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        c15967bcM103356a0.m103368D0(this.mHost.getContext().getPackageName());
        c15967bcM103356a0.m103390O0(this.mHost, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c15967bcM103356a0.m103418h0(true);
            c15967bcM103356a0.m103406a(128);
        } else {
            c15967bcM103356a0.m103418h0(false);
            c15967bcM103356a0.m103406a(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c15967bcM103356a0.m103406a(2);
        } else if (c15967bcM103356a0.m103391P()) {
            c15967bcM103356a0.m103406a(1);
        }
        c15967bcM103356a0.m103450y0(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c15967bcM103356a0.m103428n(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c15967bcM103356a0.m103426m(this.mTempScreenRect);
            if (c15967bcM103356a0.f76032b != -1) {
                C15967bc c15967bcM103356a1 = C15967bc.m103356a0();
                for (int i2 = c15967bcM103356a0.f76032b; i2 != -1; i2 = c15967bcM103356a1.f76032b) {
                    c15967bcM103356a1.m103374G0(this.mHost, -1);
                    c15967bcM103356a1.m103421j0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i2, c15967bcM103356a1);
                    c15967bcM103356a1.m103426m(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                c15967bcM103356a1.m103412e0();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c15967bcM103356a0.m103423k0(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    c15967bcM103356a0.m103396R0(true);
                }
            }
        }
        return c15967bcM103356a0;
    }

    @NonNull
    private C15967bc createNodeForHost() {
        C15967bc c15967bcM103357b0 = C15967bc.m103357b0(this.mHost);
        kkl0.m150142X(this.mHost, c15967bcM103357b0);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c15967bcM103357b0.m103432p() > 0 && arrayList.size() > 0) {
            azk0.m101074a("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c15967bcM103357b0.m103409d(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return c15967bcM103357b0;
    }

    private gvf0<C15967bc> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        gvf0<C15967bc> gvf0Var = new gvf0<>();
        for (int i = 0; i < arrayList.size(); i++) {
            gvf0Var.m132553k(i, createNodeForChild(i));
        }
        return gvf0Var;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m103426m(rect);
    }

    private static Rect guessPreviouslyFocusedRect(@NonNull View view, int i, @NonNull Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i == 130) {
            rect.set(0, -1, width, -1);
            return rect;
        }
        wg3.m206174a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        return null;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.mHost.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int keyToDirection(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean moveFocus(int i, @Nullable Rect rect) {
        C15967bc c15967bc;
        gvf0<C15967bc> allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        C15967bc c15967bcM132549d = i2 == Integer.MIN_VALUE ? null : allNodes.m132549d(i2);
        if (i == 1 || i == 2) {
            c15967bc = (C15967bc) cwi.m112907d(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c15967bcM132549d, i, kkl0.m150191x(this.mHost) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                wg3.m206174a("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i3 = this.mKeyboardFocusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                getBoundsInParent(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            c15967bc = (C15967bc) cwi.m112906c(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c15967bcM132549d, rect2, i);
        }
        return requestKeyboardFocusForVirtualView(c15967bc != null ? allNodes.m132552j(allNodes.m132551f(c15967bc)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return requestKeyboardFocusForVirtualView(i);
        }
        if (i2 == 2) {
            return clearKeyboardFocusForVirtualView(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i);
        }
        return requestAccessibilityFocus(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return kkl0.m150144Z(this.mHost, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled() || (i2 = this.mAccessibilityFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearAccessibilityFocus(i2);
        }
        this.mAccessibilityFocusedVirtualViewId = i;
        this.mHost.invalidate();
        sendEventForVirtualView(i, 32768);
        return true;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.mHoveredVirtualViewId == Integer.MIN_VALUE) {
                    return false;
                }
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            }
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            updateHoveredVirtualView(virtualViewAt);
            if (virtualViewAt != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iKeyToDirection = keyToDirection(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i < repeatCount && moveFocus(iKeyToDirection, null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                clickKeyboardFocusedVirtualView();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    clickKeyboardFocusedVirtualView();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return moveFocus(1, null);
                }
            }
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // p153l.C16932fb
    public C16226cc getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C16598c();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(i, 2048);
        C17188gb.m129753b(accessibilityEventCreateEvent, i2);
        fml0.m126265h(parent, this.mHost, accessibilityEventCreateEvent);
    }

    @NonNull
    public C15967bc obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, @Nullable Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // p153l.C16932fb
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // p153l.C16932fb
    public void onInitializeAccessibilityNodeInfo(View view, C15967bc c15967bc) {
        super.onInitializeAccessibilityNodeInfo(view, c15967bc);
        onPopulateNodeForHost(c15967bc);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, @Nullable Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i, @NonNull C15967bc c15967bc);

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i2 = this.mKeyboardFocusedVirtualViewId) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        this.mKeyboardFocusedVirtualViewId = i;
        onVirtualViewKeyboardFocusChanged(i, true);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return fml0.m126265h(parent, this.mHost, createEvent(i, i2));
    }

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull C15967bc c15967bc) {
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public void onPopulateEventForVirtualView(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }
}
