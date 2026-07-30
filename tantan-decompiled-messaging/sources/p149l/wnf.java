package p149l;

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
public abstract class wnf extends C17974kb {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final gti.InterfaceC17152a<C17055gc> NODE_ADAPTER = new C20921a();
    private static final gti.InterfaceC17153b<xmf0<C17055gc>, C17055gc> SPARSE_VALUES_ADAPTER = new C20922b();
    private final View mHost;
    private final AccessibilityManager mManager;
    private C20923c mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l.wnf$a */
    public static class C20921a implements gti.InterfaceC17152a<C17055gc> {
        @Override // p149l.gti.InterfaceC17152a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo127967a(C17055gc c17055gc, Rect rect) {
            c17055gc.m125422m(rect);
        }
    }

    /* JADX INFO: renamed from: l.wnf$b */
    public static class C20922b implements gti.InterfaceC17153b<xmf0<C17055gc>, C17055gc> {
        @Override // p149l.gti.InterfaceC17153b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public C17055gc mo127968a(xmf0<C17055gc> xmf0Var, int i) {
            return xmf0Var.m210135m(i);
        }

        @Override // p149l.gti.InterfaceC17153b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int mo127969b(xmf0<C17055gc> xmf0Var) {
            return xmf0Var.m210134l();
        }
    }

    /* JADX INFO: renamed from: l.wnf$c */
    public class C20923c extends C17267hc {
        public C20923c() {
        }

        @Override // p149l.C17267hc
        /* JADX INFO: renamed from: b */
        public C17055gc mo130361b(int i) {
            return C17055gc.m125354c0(wnf.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // p149l.C17267hc
        /* JADX INFO: renamed from: d */
        public C17055gc mo130363d(int i) {
            wnf wnfVar = wnf.this;
            int i2 = i == 2 ? wnfVar.mAccessibilityFocusedVirtualViewId : wnfVar.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo130361b(i2);
        }

        @Override // p149l.C17267hc
        /* JADX INFO: renamed from: f */
        public boolean mo130365f(int i, int i2, Bundle bundle) {
            return wnf.this.performAction(i, i2, bundle);
        }
    }

    public wnf(@NonNull View view) {
        if (view == null) {
            ig3.m135964a("View may not be null");
            throw null;
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (gbl0.m125224v(view) == 0) {
            gbl0.m125221t0(view, 1);
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
        C17055gc c17055gcObtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        accessibilityEventObtain.getText().add(c17055gcObtainAccessibilityNodeInfo.m125361C());
        accessibilityEventObtain.setContentDescription(c17055gcObtainAccessibilityNodeInfo.m125435t());
        accessibilityEventObtain.setScrollable(c17055gcObtainAccessibilityNodeInfo.m125397V());
        accessibilityEventObtain.setPassword(c17055gcObtainAccessibilityNodeInfo.m125396U());
        accessibilityEventObtain.setEnabled(c17055gcObtainAccessibilityNodeInfo.m125385O());
        accessibilityEventObtain.setChecked(c17055gcObtainAccessibilityNodeInfo.m125379L());
        onPopulateEventForVirtualView(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            upk0.m194883a("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain.setClassName(c17055gcObtainAccessibilityNodeInfo.m125430q());
        C17515ic.m135300c(accessibilityEventObtain, this.mHost, i);
        accessibilityEventObtain.setPackageName(this.mHost.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    @NonNull
    private C17055gc createNodeForChild(int i) {
        C17055gc c17055gcM125352a0 = C17055gc.m125352a0();
        c17055gcM125352a0.m125440v0(true);
        c17055gcM125352a0.m125444x0(true);
        c17055gcM125352a0.m125427o0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        c17055gcM125352a0.m125417j0(rect);
        c17055gcM125352a0.m125419k0(rect);
        c17055gcM125352a0.m125368F0(this.mHost);
        onPopulateNodeForVirtualView(i, c17055gcM125352a0);
        if (c17055gcM125352a0.m125361C() == null && c17055gcM125352a0.m125435t() == null) {
            upk0.m194883a("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        c17055gcM125352a0.m125422m(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            upk0.m194883a("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int iM125418k = c17055gcM125352a0.m125418k();
        if ((iM125418k & 64) != 0) {
            upk0.m194883a("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((iM125418k & 128) != 0) {
            upk0.m194883a("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        c17055gcM125352a0.m125364D0(this.mHost.getContext().getPackageName());
        c17055gcM125352a0.m125386O0(this.mHost, i);
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            c17055gcM125352a0.m125414h0(true);
            c17055gcM125352a0.m125402a(128);
        } else {
            c17055gcM125352a0.m125414h0(false);
            c17055gcM125352a0.m125402a(64);
        }
        boolean z = this.mKeyboardFocusedVirtualViewId == i;
        if (z) {
            c17055gcM125352a0.m125402a(2);
        } else if (c17055gcM125352a0.m125387P()) {
            c17055gcM125352a0.m125402a(1);
        }
        c17055gcM125352a0.m125446y0(z);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        c17055gcM125352a0.m125424n(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            c17055gcM125352a0.m125422m(this.mTempScreenRect);
            if (c17055gcM125352a0.f101926b != -1) {
                C17055gc c17055gcM125352a1 = C17055gc.m125352a0();
                for (int i2 = c17055gcM125352a0.f101926b; i2 != -1; i2 = c17055gcM125352a1.f101926b) {
                    c17055gcM125352a1.m125370G0(this.mHost, -1);
                    c17055gcM125352a1.m125417j0(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i2, c17055gcM125352a1);
                    c17055gcM125352a1.m125422m(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
                c17055gcM125352a1.m125408e0();
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                c17055gcM125352a0.m125419k0(this.mTempScreenRect);
                if (isVisibleToUser(this.mTempScreenRect)) {
                    c17055gcM125352a0.m125392R0(true);
                }
            }
        }
        return c17055gcM125352a0;
    }

    @NonNull
    private C17055gc createNodeForHost() {
        C17055gc c17055gcM125353b0 = C17055gc.m125353b0(this.mHost);
        gbl0.m125179X(this.mHost, c17055gcM125353b0);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (c17055gcM125353b0.m125428p() > 0 && arrayList.size() > 0) {
            upk0.m194883a("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c17055gcM125353b0.m125405d(this.mHost, ((Integer) arrayList.get(i)).intValue());
        }
        return c17055gcM125353b0;
    }

    private xmf0<C17055gc> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        xmf0<C17055gc> xmf0Var = new xmf0<>();
        for (int i = 0; i < arrayList.size(); i++) {
            xmf0Var.m210133k(i, createNodeForChild(i));
        }
        return xmf0Var;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).m125422m(rect);
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
        ig3.m135964a("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
        C17055gc c17055gc;
        xmf0<C17055gc> allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        C17055gc c17055gcM210129d = i2 == Integer.MIN_VALUE ? null : allNodes.m210129d(i2);
        if (i == 1 || i == 2) {
            c17055gc = (C17055gc) gti.m127955d(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c17055gcM210129d, i, gbl0.m125228x(this.mHost) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                ig3.m135964a("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
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
            c17055gc = (C17055gc) gti.m127954c(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, c17055gcM210129d, rect2, i);
        }
        return requestKeyboardFocusForVirtualView(c17055gc != null ? allNodes.m210132j(allNodes.m210131f(c17055gc)) : Integer.MIN_VALUE);
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
        return gbl0.m125181Z(this.mHost, i, bundle);
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

    @Override // p149l.C17974kb
    public C17267hc getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new C20923c();
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
        C18183lb.m149183b(accessibilityEventCreateEvent, i2);
        bdl0.m101192h(parent, this.mHost, accessibilityEventCreateEvent);
    }

    @NonNull
    public C17055gc obtainAccessibilityNodeInfo(int i) {
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

    @Override // p149l.C17974kb
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // p149l.C17974kb
    public void onInitializeAccessibilityNodeInfo(View view, C17055gc c17055gc) {
        super.onInitializeAccessibilityNodeInfo(view, c17055gc);
        onPopulateNodeForHost(c17055gc);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, @Nullable Bundle bundle);

    public abstract void onPopulateNodeForVirtualView(int i, @NonNull C17055gc c17055gc);

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
        return bdl0.m101192h(parent, this.mHost, createEvent(i, i2));
    }

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull C17055gc c17055gc) {
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public void onPopulateEventForVirtualView(int i, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }
}
