package p149l;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import io.agora.rtc2.internal.AudioRoutingController;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.gc */
/* JADX INFO: loaded from: classes.dex */
public class C17055gc {

    /* JADX INFO: renamed from: d */
    public static int f101924d;

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f101925a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f101926b = -1;

    /* JADX INFO: renamed from: c */
    public int f101927c = -1;

    /* JADX INFO: renamed from: l.gc$b */
    @RequiresApi(30)
    public static class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m125453a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m125454b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: l.gc$c */
    @RequiresApi(33)
    public static class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static String m125455a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m125456b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: l.gc$d */
    @RequiresApi(34)
    public static class d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m125457a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m125458b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static CharSequence m125459c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static boolean m125460d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: renamed from: l.gc$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final Object f101976a;

        public e(Object obj) {
            this.f101976a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static e m125461a(int i, int i2, boolean z) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* JADX INFO: renamed from: b */
        public static e m125462b(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* JADX INFO: renamed from: l.gc$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Object f101977a;

        public f(Object obj) {
            this.f101977a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m125463a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* JADX INFO: renamed from: l.gc$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f101978a;

        public g(Object obj) {
            this.f101978a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m125464a(int i, float f, float f2, float f3) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public C17055gc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f101925a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: T0 */
    public static C17055gc m125351T0(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C17055gc(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: a0 */
    public static C17055gc m125352a0() {
        return m125351T0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: b0 */
    public static C17055gc m125353b0(View view) {
        return m125351T0(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: c0 */
    public static C17055gc m125354c0(C17055gc c17055gc) {
        return m125351T0(AccessibilityNodeInfo.obtain(c17055gc.f101925a));
    }

    /* JADX INFO: renamed from: j */
    public static String m125355j(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: r */
    public static ClickableSpan[] m125356r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final SparseArray<WeakReference<ClickableSpan>> m125357A(View view) {
        return (SparseArray) view.getTag(e5c0.f89384W);
    }

    /* JADX INFO: renamed from: A0 */
    public void m125358A0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public CharSequence m125359B() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        return i >= 30 ? b.m125453a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: B0 */
    public void m125360B0(boolean z) {
        this.f101925a.setLongClickable(z);
    }

    /* JADX INFO: renamed from: C */
    public CharSequence m125361C() {
        if (!m125369G()) {
            return this.f101925a.getText();
        }
        List<Integer> listM125413h = m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM125413h2 = m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM125413h3 = m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM125413h4 = m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f101925a.getText(), 0, this.f101925a.getText().length()));
        for (int i = 0; i < listM125413h.size(); i++) {
            spannableString.setSpan(new C17736jb(listM125413h4.get(i).intValue(), this, m125439v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM125413h.get(i).intValue(), listM125413h2.get(i).intValue(), listM125413h3.get(i).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: C0 */
    public void m125362C0(int i) {
        this.f101925a.setMovementGranularities(i);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public CharSequence m125363D() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        return i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: D0 */
    public void m125364D0(CharSequence charSequence) {
        this.f101925a.setPackageName(charSequence);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public String m125365E() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        return i >= 33 ? c.m125455a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: E0 */
    public void m125366E0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: F */
    public String m125367F() {
        return this.f101925a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: F0 */
    public void m125368F0(View view) {
        this.f101926b = -1;
        this.f101925a.setParent(view);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m125369G() {
        return !m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: G0 */
    public void m125370G0(View view, int i) {
        this.f101926b = i;
        this.f101925a.setParent(view, i);
    }

    /* JADX INFO: renamed from: H */
    public final int m125371H(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f101924d;
        f101924d = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: H0 */
    public void m125372H0(g gVar) {
        this.f101925a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f101978a);
    }

    /* JADX INFO: renamed from: I */
    public boolean m125373I() {
        return Build.VERSION.SDK_INT >= 34 ? d.m125460d(this.f101925a) : m125420l(64);
    }

    /* JADX INFO: renamed from: I0 */
    public void m125374I0(@Nullable CharSequence charSequence) {
        this.f101925a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: J */
    public boolean m125375J() {
        return this.f101925a.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: J0 */
    public void m125376J0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f101925a.setScreenReaderFocusable(z);
        } else {
            m125416i0(1, z);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m125377K() {
        return this.f101925a.isCheckable();
    }

    /* JADX INFO: renamed from: K0 */
    public void m125378K0(boolean z) {
        this.f101925a.setScrollable(z);
    }

    /* JADX INFO: renamed from: L */
    public boolean m125379L() {
        return this.f101925a.isChecked();
    }

    /* JADX INFO: renamed from: L0 */
    public void m125380L0(boolean z) {
        this.f101925a.setSelected(z);
    }

    /* JADX INFO: renamed from: M */
    public boolean m125381M() {
        return this.f101925a.isClickable();
    }

    /* JADX INFO: renamed from: M0 */
    public void m125382M0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f101925a.setShowingHintText(z);
        } else {
            m125416i0(4, z);
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m125383N() {
        return this.f101925a.isContextClickable();
    }

    /* JADX INFO: renamed from: N0 */
    public void m125384N0(View view) {
        this.f101927c = -1;
        this.f101925a.setSource(view);
    }

    /* JADX INFO: renamed from: O */
    public boolean m125385O() {
        return this.f101925a.isEnabled();
    }

    /* JADX INFO: renamed from: O0 */
    public void m125386O0(View view, int i) {
        this.f101927c = i;
        this.f101925a.setSource(view, i);
    }

    /* JADX INFO: renamed from: P */
    public boolean m125387P() {
        return this.f101925a.isFocusable();
    }

    /* JADX INFO: renamed from: P0 */
    public void m125388P0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        if (i >= 30) {
            b.m125454b(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m125389Q() {
        return this.f101925a.isFocused();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m125390Q0(CharSequence charSequence) {
        this.f101925a.setText(charSequence);
    }

    /* JADX INFO: renamed from: R */
    public boolean m125391R() {
        return m125420l(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: R0 */
    public void m125392R0(boolean z) {
        this.f101925a.setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: S */
    public boolean m125393S() {
        return this.f101925a.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: S0 */
    public AccessibilityNodeInfo m125394S0() {
        return this.f101925a;
    }

    /* JADX INFO: renamed from: T */
    public boolean m125395T() {
        return this.f101925a.isLongClickable();
    }

    /* JADX INFO: renamed from: U */
    public boolean m125396U() {
        return this.f101925a.isPassword();
    }

    /* JADX INFO: renamed from: V */
    public boolean m125397V() {
        return this.f101925a.isScrollable();
    }

    /* JADX INFO: renamed from: W */
    public boolean m125398W() {
        return this.f101925a.isSelected();
    }

    /* JADX INFO: renamed from: X */
    public boolean m125399X() {
        return Build.VERSION.SDK_INT >= 26 ? this.f101925a.isShowingHintText() : m125420l(4);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m125400Y() {
        return Build.VERSION.SDK_INT >= 33 ? c.m125456b(this.f101925a) : m125420l(8388608);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m125401Z() {
        return this.f101925a.isVisibleToUser();
    }

    /* JADX INFO: renamed from: a */
    public void m125402a(int i) {
        this.f101925a.addAction(i);
    }

    /* JADX INFO: renamed from: b */
    public void m125403b(a aVar) {
        this.f101925a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f101972a);
    }

    /* JADX INFO: renamed from: c */
    public void m125404c(View view) {
        this.f101925a.addChild(view);
    }

    /* JADX INFO: renamed from: d */
    public void m125405d(View view, int i) {
        this.f101925a.addChild(view, i);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m125406d0(int i, Bundle bundle) {
        return this.f101925a.performAction(i, bundle);
    }

    /* JADX INFO: renamed from: e */
    public final void m125407e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m125413h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C17055gc)) {
            return false;
        }
        C17055gc c17055gc = (C17055gc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = c17055gc.f101925a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return this.f101927c == c17055gc.f101927c && this.f101926b == c17055gc.f101926b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: f */
    public void m125409f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m125411g();
            m125412g0(view);
            ClickableSpan[] clickableSpanArrM125356r = m125356r(charSequence);
            if (clickableSpanArrM125356r == null || clickableSpanArrM125356r.length <= 0) {
                return;
            }
            m125439v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", e5c0.f89388a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayM125445y = m125445y(view);
            for (int i = 0; i < clickableSpanArrM125356r.length; i++) {
                int iM125371H = m125371H(clickableSpanArrM125356r[i], sparseArrayM125445y);
                sparseArrayM125445y.put(iM125371H, new WeakReference<>(clickableSpanArrM125356r[i]));
                m125407e(clickableSpanArrM125356r[i], (Spanned) charSequence, iM125371H);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m125410f0(a aVar) {
        return this.f101925a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f101972a);
    }

    /* JADX INFO: renamed from: g */
    public final void m125411g() {
        this.f101925a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f101925a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f101925a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f101925a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m125412g0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM125357A = m125357A(view);
        if (sparseArrayM125357A != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayM125357A.size(); i++) {
                if (sparseArrayM125357A.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayM125357A.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<Integer> m125413h(String str) {
        ArrayList<Integer> integerArrayList = this.f101925a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f101925a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public void m125414h0(boolean z) {
        this.f101925a.setAccessibilityFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List<a> m125415i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f101925a.getActionList();
        if (actionList == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new a(actionList.get(i)));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m125416i0(int i, boolean z) {
        Bundle bundleM125439v = m125439v();
        if (bundleM125439v != null) {
            int i2 = bundleM125439v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM125439v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: j0 */
    public void m125417j0(Rect rect) {
        this.f101925a.setBoundsInParent(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public int m125418k() {
        return this.f101925a.getActions();
    }

    /* JADX INFO: renamed from: k0 */
    public void m125419k0(Rect rect) {
        this.f101925a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m125420l(int i) {
        Bundle bundleM125439v = m125439v();
        return bundleM125439v != null && (bundleM125439v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* JADX INFO: renamed from: l0 */
    public void m125421l0(boolean z) {
        this.f101925a.setCanOpenPopup(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public void m125422m(Rect rect) {
        this.f101925a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: m0 */
    public void m125423m0(boolean z) {
        this.f101925a.setCheckable(z);
    }

    /* JADX INFO: renamed from: n */
    public void m125424n(Rect rect) {
        this.f101925a.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: n0 */
    public void m125425n0(boolean z) {
        this.f101925a.setChecked(z);
    }

    /* JADX INFO: renamed from: o */
    public void m125426o(@NonNull Rect rect) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        if (i >= 34) {
            d.m125458b(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m125427o0(CharSequence charSequence) {
        this.f101925a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public int m125428p() {
        return this.f101925a.getChildCount();
    }

    /* JADX INFO: renamed from: p0 */
    public void m125429p0(boolean z) {
        this.f101925a.setClickable(z);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m125430q() {
        return this.f101925a.getClassName();
    }

    /* JADX INFO: renamed from: q0 */
    public void m125431q0(Object obj) {
        this.f101925a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f101976a);
    }

    /* JADX INFO: renamed from: r0 */
    public void m125432r0(Object obj) {
        this.f101925a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f101977a);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public CharSequence m125433s() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f101925a;
        return i >= 34 ? d.m125459c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: s0 */
    public void m125434s0(CharSequence charSequence) {
        this.f101925a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public CharSequence m125435t() {
        return this.f101925a.getContentDescription();
    }

    /* JADX INFO: renamed from: t0 */
    public void m125436t0(boolean z) {
        this.f101925a.setContentInvalid(z);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m125422m(rect);
        sb.append("; boundsInParent: " + rect);
        m125424n(rect);
        sb.append("; boundsInScreen: " + rect);
        m125426o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m125447z());
        sb.append("; className: ");
        sb.append(m125430q());
        sb.append("; text: ");
        sb.append(m125361C());
        sb.append("; error: ");
        sb.append(m125437u());
        sb.append("; maxTextLength: ");
        sb.append(m125441w());
        sb.append("; stateDescription: ");
        sb.append(m125359B());
        sb.append("; contentDescription: ");
        sb.append(m125435t());
        sb.append("; tooltipText: ");
        sb.append(m125363D());
        sb.append("; viewIdResName: ");
        sb.append(m125367F());
        sb.append("; uniqueId: ");
        sb.append(m125365E());
        sb.append("; checkable: ");
        sb.append(m125377K());
        sb.append("; checked: ");
        sb.append(m125379L());
        sb.append("; focusable: ");
        sb.append(m125387P());
        sb.append("; focused: ");
        sb.append(m125389Q());
        sb.append("; selected: ");
        sb.append(m125398W());
        sb.append("; clickable: ");
        sb.append(m125381M());
        sb.append("; longClickable: ");
        sb.append(m125395T());
        sb.append("; contextClickable: ");
        sb.append(m125383N());
        sb.append("; enabled: ");
        sb.append(m125385O());
        sb.append("; password: ");
        sb.append(m125396U());
        sb.append("; scrollable: " + m125397V());
        sb.append("; containerTitle: ");
        sb.append(m125433s());
        sb.append("; granularScrollingSupported: ");
        sb.append(m125391R());
        sb.append("; importantForAccessibility: ");
        sb.append(m125393S());
        sb.append("; visible: ");
        sb.append(m125401Z());
        sb.append("; isTextSelectable: ");
        sb.append(m125400Y());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m125373I());
        sb.append("; [");
        List<a> listM125415i = m125415i();
        for (int i = 0; i < listM125415i.size(); i++) {
            a aVar = listM125415i.get(i);
            String strM125355j = m125355j(aVar.m125450b());
            if (strM125355j.equals("ACTION_UNKNOWN") && aVar.m125451c() != null) {
                strM125355j = aVar.m125451c().toString();
            }
            sb.append(strM125355j);
            if (i != listM125415i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m125437u() {
        return this.f101925a.getError();
    }

    /* JADX INFO: renamed from: u0 */
    public void m125438u0(boolean z) {
        this.f101925a.setDismissable(z);
    }

    /* JADX INFO: renamed from: v */
    public Bundle m125439v() {
        return this.f101925a.getExtras();
    }

    /* JADX INFO: renamed from: v0 */
    public void m125440v0(boolean z) {
        this.f101925a.setEnabled(z);
    }

    /* JADX INFO: renamed from: w */
    public int m125441w() {
        return this.f101925a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: w0 */
    public void m125442w0(CharSequence charSequence) {
        this.f101925a.setError(charSequence);
    }

    /* JADX INFO: renamed from: x */
    public int m125443x() {
        return this.f101925a.getMovementGranularities();
    }

    /* JADX INFO: renamed from: x0 */
    public void m125444x0(boolean z) {
        this.f101925a.setFocusable(z);
    }

    /* JADX INFO: renamed from: y */
    public final SparseArray<WeakReference<ClickableSpan>> m125445y(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM125357A = m125357A(view);
        if (sparseArrayM125357A != null) {
            return sparseArrayM125357A;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(e5c0.f89384W, sparseArray);
        return sparseArray;
    }

    /* JADX INFO: renamed from: y0 */
    public void m125446y0(boolean z) {
        this.f101925a.setFocused(z);
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m125447z() {
        return this.f101925a.getPackageName();
    }

    /* JADX INFO: renamed from: z0 */
    public void m125448z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f101925a.setHeading(z);
        } else {
            m125416i0(2, z);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e0 */
    public void m125408e0() {
    }

    /* JADX INFO: renamed from: l.gc$a */
    public static class a {

        /* JADX INFO: renamed from: G */
        @NonNull
        public static final a f101934G;

        /* JADX INFO: renamed from: H */
        @NonNull
        public static final a f101935H;

        /* JADX INFO: renamed from: I */
        @NonNull
        public static final a f101936I;

        /* JADX INFO: renamed from: J */
        @NonNull
        public static final a f101937J;

        /* JADX INFO: renamed from: K */
        public static final a f101938K;

        /* JADX INFO: renamed from: L */
        public static final a f101939L;

        /* JADX INFO: renamed from: M */
        public static final a f101940M;

        /* JADX INFO: renamed from: N */
        public static final a f101941N;

        /* JADX INFO: renamed from: O */
        public static final a f101942O;

        /* JADX INFO: renamed from: P */
        @NonNull
        public static final a f101943P;

        /* JADX INFO: renamed from: Q */
        @NonNull
        public static final a f101944Q;

        /* JADX INFO: renamed from: R */
        @NonNull
        public static final a f101945R;

        /* JADX INFO: renamed from: S */
        @NonNull
        public static final a f101946S;

        /* JADX INFO: renamed from: T */
        @NonNull
        public static final a f101947T;

        /* JADX INFO: renamed from: U */
        @NonNull
        public static final a f101948U;

        /* JADX INFO: renamed from: V */
        @NonNull
        public static final a f101949V;

        /* JADX INFO: renamed from: a */
        public final Object f101972a;

        /* JADX INFO: renamed from: b */
        public final int f101973b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC17741jc.a> f101974c;

        /* JADX INFO: renamed from: d */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InterfaceC17741jc f101975d;

        /* JADX INFO: renamed from: e */
        public static final a f101950e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f101951f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f101952g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f101953h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f101954i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f101955j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f101956k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f101957l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f101958m = new a(256, null, InterfaceC17741jc.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f101959n = new a(512, null, InterfaceC17741jc.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f101960o = new a(1024, null, InterfaceC17741jc.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f101961p = new a(2048, null, InterfaceC17741jc.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f101962q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f101963r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f101964s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f101965t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f101966u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f101967v = new a(131072, null, InterfaceC17741jc.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f101968w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f101969x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f101970y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f101971z = new a(2097152, null, InterfaceC17741jc.h.class);

        /* JADX INFO: renamed from: A */
        public static final a f101928A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);

        /* JADX INFO: renamed from: B */
        public static final a f101929B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC17741jc.e.class);

        /* JADX INFO: renamed from: C */
        public static final a f101930C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);

        /* JADX INFO: renamed from: D */
        public static final a f101931D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);

        /* JADX INFO: renamed from: E */
        public static final a f101932E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);

        /* JADX INFO: renamed from: F */
        public static final a f101933F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            int i = Build.VERSION.SDK_INT;
            f101934G = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f101935H = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f101936I = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f101937J = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f101938K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f101939L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC17741jc.f.class);
            f101940M = new a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC17741jc.d.class);
            f101941N = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f101942O = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f101943P = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f101944Q = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f101945R = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f101946S = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f101947T = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f101948U = new a(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f101949V = new a(i >= 34 ? d.m125457a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(Object obj, int i, CharSequence charSequence, InterfaceC17741jc interfaceC17741jc, Class<? extends InterfaceC17741jc.a> cls) {
            this.f101973b = i;
            this.f101975d = interfaceC17741jc;
            if (obj == null) {
                this.f101972a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f101972a = obj;
            }
            this.f101974c = cls;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: a */
        public a m125449a(CharSequence charSequence, InterfaceC17741jc interfaceC17741jc) {
            return new a(null, this.f101973b, charSequence, interfaceC17741jc, this.f101974c);
        }

        /* JADX INFO: renamed from: b */
        public int m125450b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f101972a).getId();
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m125451c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f101972a).getLabel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: d */
        public boolean m125452d(View view, Bundle bundle) {
            if (this.f101975d == null) {
                return false;
            }
            Class<? extends InterfaceC17741jc.a> cls = this.f101974c;
            InterfaceC17741jc.a aVar = null;
            if (cls != null) {
                try {
                    InterfaceC17741jc.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.m140837a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e) {
                        e = e;
                        aVar = aVarNewInstance;
                        Class<? extends InterfaceC17741jc.a> cls2 = this.f101974c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return this.f101975d.perform(view, aVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f101972a;
            Object obj3 = ((a) obj).f101972a;
            if (obj2 == null) {
                return obj3 == null;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f101972a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strM125355j = C17055gc.m125355j(this.f101973b);
            if (strM125355j.equals("ACTION_UNKNOWN") && m125451c() != null) {
                strM125355j = m125451c().toString();
            }
            sb.append(strM125355j);
            return sb.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i, CharSequence charSequence, Class<? extends InterfaceC17741jc.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }
    }
}
