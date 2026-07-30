package p153l;

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

/* JADX INFO: renamed from: l.bc */
/* JADX INFO: loaded from: classes.dex */
public class C15967bc {

    /* JADX INFO: renamed from: d */
    public static int f76030d;

    /* JADX INFO: renamed from: a */
    public final AccessibilityNodeInfo f76031a;

    /* JADX INFO: renamed from: b */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int f76032b = -1;

    /* JADX INFO: renamed from: c */
    public int f76033c = -1;

    /* JADX INFO: renamed from: l.bc$b */
    @RequiresApi(30)
    public static class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static CharSequence m103457a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m103458b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: renamed from: l.bc$c */
    @RequiresApi(33)
    public static class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static String m103459a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static boolean m103460b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    /* JADX INFO: renamed from: l.bc$d */
    @RequiresApi(34)
    public static class d {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static AccessibilityNodeInfo.AccessibilityAction m103461a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m103462b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static CharSequence m103463c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static boolean m103464d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    /* JADX INFO: renamed from: l.bc$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final Object f76082a;

        public e(Object obj) {
            this.f76082a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static e m103465a(int i, int i2, boolean z) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        /* JADX INFO: renamed from: b */
        public static e m103466b(int i, int i2, boolean z, int i3) {
            return new e(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* JADX INFO: renamed from: l.bc$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public final Object f76083a;

        public f(Object obj) {
            this.f76083a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static f m103467a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    /* JADX INFO: renamed from: l.bc$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public final Object f76084a;

        public g(Object obj) {
            this.f76084a = obj;
        }

        /* JADX INFO: renamed from: a */
        public static g m103468a(int i, float f, float f2, float f3) {
            return new g(AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }
    }

    public C15967bc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f76031a = accessibilityNodeInfo;
    }

    /* JADX INFO: renamed from: T0 */
    public static C15967bc m103355T0(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C15967bc(accessibilityNodeInfo);
    }

    /* JADX INFO: renamed from: a0 */
    public static C15967bc m103356a0() {
        return m103355T0(AccessibilityNodeInfo.obtain());
    }

    /* JADX INFO: renamed from: b0 */
    public static C15967bc m103357b0(View view) {
        return m103355T0(AccessibilityNodeInfo.obtain(view));
    }

    /* JADX INFO: renamed from: c0 */
    public static C15967bc m103358c0(C15967bc c15967bc) {
        return m103355T0(AccessibilityNodeInfo.obtain(c15967bc.f76031a));
    }

    /* JADX INFO: renamed from: j */
    public static String m103359j(int i) {
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
    public static ClickableSpan[] m103360r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* JADX INFO: renamed from: A */
    public final SparseArray<WeakReference<ClickableSpan>> m103361A(View view) {
        return (SparseArray) view.getTag(kdc0.f125184W);
    }

    /* JADX INFO: renamed from: A0 */
    public void m103362A0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: B */
    public CharSequence m103363B() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        return i >= 30 ? b.m103457a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    /* JADX INFO: renamed from: B0 */
    public void m103364B0(boolean z) {
        this.f76031a.setLongClickable(z);
    }

    /* JADX INFO: renamed from: C */
    public CharSequence m103365C() {
        if (!m103373G()) {
            return this.f76031a.getText();
        }
        List<Integer> listM103417h = m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listM103417h2 = m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listM103417h3 = m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listM103417h4 = m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f76031a.getText(), 0, this.f76031a.getText().length()));
        for (int i = 0; i < listM103417h.size(); i++) {
            spannableString.setSpan(new C16746eb(listM103417h4.get(i).intValue(), this, m103443v().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listM103417h.get(i).intValue(), listM103417h2.get(i).intValue(), listM103417h3.get(i).intValue());
        }
        return spannableString;
    }

    /* JADX INFO: renamed from: C0 */
    public void m103366C0(int i) {
        this.f76031a.setMovementGranularities(i);
    }

    @Nullable
    /* JADX INFO: renamed from: D */
    public CharSequence m103367D() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        return i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    /* JADX INFO: renamed from: D0 */
    public void m103368D0(CharSequence charSequence) {
        this.f76031a.setPackageName(charSequence);
    }

    @Nullable
    /* JADX INFO: renamed from: E */
    public String m103369E() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        return i >= 33 ? c.m103459a(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    /* JADX INFO: renamed from: E0 */
    public void m103370E0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: F */
    public String m103371F() {
        return this.f76031a.getViewIdResourceName();
    }

    /* JADX INFO: renamed from: F0 */
    public void m103372F0(View view) {
        this.f76032b = -1;
        this.f76031a.setParent(view);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m103373G() {
        return !m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* JADX INFO: renamed from: G0 */
    public void m103374G0(View view, int i) {
        this.f76032b = i;
        this.f76031a.setParent(view, i);
    }

    /* JADX INFO: renamed from: H */
    public final int m103375H(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                if (clickableSpan.equals(sparseArray.valueAt(i).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        int i2 = f76030d;
        f76030d = i2 + 1;
        return i2;
    }

    /* JADX INFO: renamed from: H0 */
    public void m103376H0(g gVar) {
        this.f76031a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) gVar.f76084a);
    }

    /* JADX INFO: renamed from: I */
    public boolean m103377I() {
        return Build.VERSION.SDK_INT >= 34 ? d.m103464d(this.f76031a) : m103424l(64);
    }

    /* JADX INFO: renamed from: I0 */
    public void m103378I0(@Nullable CharSequence charSequence) {
        this.f76031a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    /* JADX INFO: renamed from: J */
    public boolean m103379J() {
        return this.f76031a.isAccessibilityFocused();
    }

    /* JADX INFO: renamed from: J0 */
    public void m103380J0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f76031a.setScreenReaderFocusable(z);
        } else {
            m103420i0(1, z);
        }
    }

    /* JADX INFO: renamed from: K */
    public boolean m103381K() {
        return this.f76031a.isCheckable();
    }

    /* JADX INFO: renamed from: K0 */
    public void m103382K0(boolean z) {
        this.f76031a.setScrollable(z);
    }

    /* JADX INFO: renamed from: L */
    public boolean m103383L() {
        return this.f76031a.isChecked();
    }

    /* JADX INFO: renamed from: L0 */
    public void m103384L0(boolean z) {
        this.f76031a.setSelected(z);
    }

    /* JADX INFO: renamed from: M */
    public boolean m103385M() {
        return this.f76031a.isClickable();
    }

    /* JADX INFO: renamed from: M0 */
    public void m103386M0(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f76031a.setShowingHintText(z);
        } else {
            m103420i0(4, z);
        }
    }

    /* JADX INFO: renamed from: N */
    public boolean m103387N() {
        return this.f76031a.isContextClickable();
    }

    /* JADX INFO: renamed from: N0 */
    public void m103388N0(View view) {
        this.f76033c = -1;
        this.f76031a.setSource(view);
    }

    /* JADX INFO: renamed from: O */
    public boolean m103389O() {
        return this.f76031a.isEnabled();
    }

    /* JADX INFO: renamed from: O0 */
    public void m103390O0(View view, int i) {
        this.f76033c = i;
        this.f76031a.setSource(view, i);
    }

    /* JADX INFO: renamed from: P */
    public boolean m103391P() {
        return this.f76031a.isFocusable();
    }

    /* JADX INFO: renamed from: P0 */
    public void m103392P0(@Nullable CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        if (i >= 30) {
            b.m103458b(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* JADX INFO: renamed from: Q */
    public boolean m103393Q() {
        return this.f76031a.isFocused();
    }

    /* JADX INFO: renamed from: Q0 */
    public void m103394Q0(CharSequence charSequence) {
        this.f76031a.setText(charSequence);
    }

    /* JADX INFO: renamed from: R */
    public boolean m103395R() {
        return m103424l(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
    }

    /* JADX INFO: renamed from: R0 */
    public void m103396R0(boolean z) {
        this.f76031a.setVisibleToUser(z);
    }

    /* JADX INFO: renamed from: S */
    public boolean m103397S() {
        return this.f76031a.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: S0 */
    public AccessibilityNodeInfo m103398S0() {
        return this.f76031a;
    }

    /* JADX INFO: renamed from: T */
    public boolean m103399T() {
        return this.f76031a.isLongClickable();
    }

    /* JADX INFO: renamed from: U */
    public boolean m103400U() {
        return this.f76031a.isPassword();
    }

    /* JADX INFO: renamed from: V */
    public boolean m103401V() {
        return this.f76031a.isScrollable();
    }

    /* JADX INFO: renamed from: W */
    public boolean m103402W() {
        return this.f76031a.isSelected();
    }

    /* JADX INFO: renamed from: X */
    public boolean m103403X() {
        return Build.VERSION.SDK_INT >= 26 ? this.f76031a.isShowingHintText() : m103424l(4);
    }

    /* JADX INFO: renamed from: Y */
    public boolean m103404Y() {
        return Build.VERSION.SDK_INT >= 33 ? c.m103460b(this.f76031a) : m103424l(8388608);
    }

    /* JADX INFO: renamed from: Z */
    public boolean m103405Z() {
        return this.f76031a.isVisibleToUser();
    }

    /* JADX INFO: renamed from: a */
    public void m103406a(int i) {
        this.f76031a.addAction(i);
    }

    /* JADX INFO: renamed from: b */
    public void m103407b(a aVar) {
        this.f76031a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f76078a);
    }

    /* JADX INFO: renamed from: c */
    public void m103408c(View view) {
        this.f76031a.addChild(view);
    }

    /* JADX INFO: renamed from: d */
    public void m103409d(View view, int i) {
        this.f76031a.addChild(view, i);
    }

    /* JADX INFO: renamed from: d0 */
    public boolean m103410d0(int i, Bundle bundle) {
        return this.f76031a.performAction(i, bundle);
    }

    /* JADX INFO: renamed from: e */
    public final void m103411e(ClickableSpan clickableSpan, Spanned spanned, int i) {
        m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m103417h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C15967bc)) {
            return false;
        }
        C15967bc c15967bc = (C15967bc) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        AccessibilityNodeInfo accessibilityNodeInfo2 = c15967bc.f76031a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfo2 != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
            return false;
        }
        return this.f76033c == c15967bc.f76033c && this.f76032b == c15967bc.f76032b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: f */
    public void m103413f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m103415g();
            m103416g0(view);
            ClickableSpan[] clickableSpanArrM103360r = m103360r(charSequence);
            if (clickableSpanArrM103360r == null || clickableSpanArrM103360r.length <= 0) {
                return;
            }
            m103443v().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", kdc0.f125188a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayM103449y = m103449y(view);
            for (int i = 0; i < clickableSpanArrM103360r.length; i++) {
                int iM103375H = m103375H(clickableSpanArrM103360r[i], sparseArrayM103449y);
                sparseArrayM103449y.put(iM103375H, new WeakReference<>(clickableSpanArrM103360r[i]));
                m103411e(clickableSpanArrM103360r[i], (Spanned) charSequence, iM103375H);
            }
        }
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m103414f0(a aVar) {
        return this.f76031a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f76078a);
    }

    /* JADX INFO: renamed from: g */
    public final void m103415g() {
        this.f76031a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f76031a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f76031a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f76031a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* JADX INFO: renamed from: g0 */
    public final void m103416g0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM103361A = m103361A(view);
        if (sparseArrayM103361A != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < sparseArrayM103361A.size(); i++) {
                if (sparseArrayM103361A.valueAt(i).get() == null) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                sparseArrayM103361A.remove(((Integer) arrayList.get(i2)).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final List<Integer> m103417h(String str) {
        ArrayList<Integer> integerArrayList = this.f76031a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f76031a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h0 */
    public void m103418h0(boolean z) {
        this.f76031a.setAccessibilityFocused(z);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public List<a> m103419i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f76031a.getActionList();
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
    public final void m103420i0(int i, boolean z) {
        Bundle bundleM103443v = m103443v();
        if (bundleM103443v != null) {
            int i2 = bundleM103443v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            bundleM103443v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: j0 */
    public void m103421j0(Rect rect) {
        this.f76031a.setBoundsInParent(rect);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public int m103422k() {
        return this.f76031a.getActions();
    }

    /* JADX INFO: renamed from: k0 */
    public void m103423k0(Rect rect) {
        this.f76031a.setBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m103424l(int i) {
        Bundle bundleM103443v = m103443v();
        return bundleM103443v != null && (bundleM103443v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    /* JADX INFO: renamed from: l0 */
    public void m103425l0(boolean z) {
        this.f76031a.setCanOpenPopup(z);
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public void m103426m(Rect rect) {
        this.f76031a.getBoundsInParent(rect);
    }

    /* JADX INFO: renamed from: m0 */
    public void m103427m0(boolean z) {
        this.f76031a.setCheckable(z);
    }

    /* JADX INFO: renamed from: n */
    public void m103428n(Rect rect) {
        this.f76031a.getBoundsInScreen(rect);
    }

    /* JADX INFO: renamed from: n0 */
    public void m103429n0(boolean z) {
        this.f76031a.setChecked(z);
    }

    /* JADX INFO: renamed from: o */
    public void m103430o(@NonNull Rect rect) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        if (i >= 34) {
            d.m103462b(accessibilityNodeInfo, rect);
            return;
        }
        Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m103431o0(CharSequence charSequence) {
        this.f76031a.setClassName(charSequence);
    }

    /* JADX INFO: renamed from: p */
    public int m103432p() {
        return this.f76031a.getChildCount();
    }

    /* JADX INFO: renamed from: p0 */
    public void m103433p0(boolean z) {
        this.f76031a.setClickable(z);
    }

    /* JADX INFO: renamed from: q */
    public CharSequence m103434q() {
        return this.f76031a.getClassName();
    }

    /* JADX INFO: renamed from: q0 */
    public void m103435q0(Object obj) {
        this.f76031a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((e) obj).f76082a);
    }

    /* JADX INFO: renamed from: r0 */
    public void m103436r0(Object obj) {
        this.f76031a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((f) obj).f76083a);
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    public CharSequence m103437s() {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f76031a;
        return i >= 34 ? d.m103463c(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    /* JADX INFO: renamed from: s0 */
    public void m103438s0(CharSequence charSequence) {
        this.f76031a.setContentDescription(charSequence);
    }

    /* JADX INFO: renamed from: t */
    public CharSequence m103439t() {
        return this.f76031a.getContentDescription();
    }

    /* JADX INFO: renamed from: t0 */
    public void m103440t0(boolean z) {
        this.f76031a.setContentInvalid(z);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m103426m(rect);
        sb.append("; boundsInParent: " + rect);
        m103428n(rect);
        sb.append("; boundsInScreen: " + rect);
        m103430o(rect);
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(m103451z());
        sb.append("; className: ");
        sb.append(m103434q());
        sb.append("; text: ");
        sb.append(m103365C());
        sb.append("; error: ");
        sb.append(m103441u());
        sb.append("; maxTextLength: ");
        sb.append(m103445w());
        sb.append("; stateDescription: ");
        sb.append(m103363B());
        sb.append("; contentDescription: ");
        sb.append(m103439t());
        sb.append("; tooltipText: ");
        sb.append(m103367D());
        sb.append("; viewIdResName: ");
        sb.append(m103371F());
        sb.append("; uniqueId: ");
        sb.append(m103369E());
        sb.append("; checkable: ");
        sb.append(m103381K());
        sb.append("; checked: ");
        sb.append(m103383L());
        sb.append("; focusable: ");
        sb.append(m103391P());
        sb.append("; focused: ");
        sb.append(m103393Q());
        sb.append("; selected: ");
        sb.append(m103402W());
        sb.append("; clickable: ");
        sb.append(m103385M());
        sb.append("; longClickable: ");
        sb.append(m103399T());
        sb.append("; contextClickable: ");
        sb.append(m103387N());
        sb.append("; enabled: ");
        sb.append(m103389O());
        sb.append("; password: ");
        sb.append(m103400U());
        sb.append("; scrollable: " + m103401V());
        sb.append("; containerTitle: ");
        sb.append(m103437s());
        sb.append("; granularScrollingSupported: ");
        sb.append(m103395R());
        sb.append("; importantForAccessibility: ");
        sb.append(m103397S());
        sb.append("; visible: ");
        sb.append(m103405Z());
        sb.append("; isTextSelectable: ");
        sb.append(m103404Y());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(m103377I());
        sb.append("; [");
        List<a> listM103419i = m103419i();
        for (int i = 0; i < listM103419i.size(); i++) {
            a aVar = listM103419i.get(i);
            String strM103359j = m103359j(aVar.m103454b());
            if (strM103359j.equals("ACTION_UNKNOWN") && aVar.m103455c() != null) {
                strM103359j = aVar.m103455c().toString();
            }
            sb.append(strM103359j);
            if (i != listM103419i.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(Constants.AES_SUFFIX);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public CharSequence m103441u() {
        return this.f76031a.getError();
    }

    /* JADX INFO: renamed from: u0 */
    public void m103442u0(boolean z) {
        this.f76031a.setDismissable(z);
    }

    /* JADX INFO: renamed from: v */
    public Bundle m103443v() {
        return this.f76031a.getExtras();
    }

    /* JADX INFO: renamed from: v0 */
    public void m103444v0(boolean z) {
        this.f76031a.setEnabled(z);
    }

    /* JADX INFO: renamed from: w */
    public int m103445w() {
        return this.f76031a.getMaxTextLength();
    }

    /* JADX INFO: renamed from: w0 */
    public void m103446w0(CharSequence charSequence) {
        this.f76031a.setError(charSequence);
    }

    /* JADX INFO: renamed from: x */
    public int m103447x() {
        return this.f76031a.getMovementGranularities();
    }

    /* JADX INFO: renamed from: x0 */
    public void m103448x0(boolean z) {
        this.f76031a.setFocusable(z);
    }

    /* JADX INFO: renamed from: y */
    public final SparseArray<WeakReference<ClickableSpan>> m103449y(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayM103361A = m103361A(view);
        if (sparseArrayM103361A != null) {
            return sparseArrayM103361A;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(kdc0.f125184W, sparseArray);
        return sparseArray;
    }

    /* JADX INFO: renamed from: y0 */
    public void m103450y0(boolean z) {
        this.f76031a.setFocused(z);
    }

    /* JADX INFO: renamed from: z */
    public CharSequence m103451z() {
        return this.f76031a.getPackageName();
    }

    /* JADX INFO: renamed from: z0 */
    public void m103452z0(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f76031a.setHeading(z);
        } else {
            m103420i0(2, z);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: e0 */
    public void m103412e0() {
    }

    /* JADX INFO: renamed from: l.bc$a */
    public static class a {

        /* JADX INFO: renamed from: G */
        @NonNull
        public static final a f76040G;

        /* JADX INFO: renamed from: H */
        @NonNull
        public static final a f76041H;

        /* JADX INFO: renamed from: I */
        @NonNull
        public static final a f76042I;

        /* JADX INFO: renamed from: J */
        @NonNull
        public static final a f76043J;

        /* JADX INFO: renamed from: K */
        public static final a f76044K;

        /* JADX INFO: renamed from: L */
        public static final a f76045L;

        /* JADX INFO: renamed from: M */
        public static final a f76046M;

        /* JADX INFO: renamed from: N */
        public static final a f76047N;

        /* JADX INFO: renamed from: O */
        public static final a f76048O;

        /* JADX INFO: renamed from: P */
        @NonNull
        public static final a f76049P;

        /* JADX INFO: renamed from: Q */
        @NonNull
        public static final a f76050Q;

        /* JADX INFO: renamed from: R */
        @NonNull
        public static final a f76051R;

        /* JADX INFO: renamed from: S */
        @NonNull
        public static final a f76052S;

        /* JADX INFO: renamed from: T */
        @NonNull
        public static final a f76053T;

        /* JADX INFO: renamed from: U */
        @NonNull
        public static final a f76054U;

        /* JADX INFO: renamed from: V */
        @NonNull
        public static final a f76055V;

        /* JADX INFO: renamed from: a */
        public final Object f76078a;

        /* JADX INFO: renamed from: b */
        public final int f76079b;

        /* JADX INFO: renamed from: c */
        public final Class<? extends InterfaceC16750ec.a> f76080c;

        /* JADX INFO: renamed from: d */
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public final InterfaceC16750ec f76081d;

        /* JADX INFO: renamed from: e */
        public static final a f76056e = new a(1, null);

        /* JADX INFO: renamed from: f */
        public static final a f76057f = new a(2, null);

        /* JADX INFO: renamed from: g */
        public static final a f76058g = new a(4, null);

        /* JADX INFO: renamed from: h */
        public static final a f76059h = new a(8, null);

        /* JADX INFO: renamed from: i */
        public static final a f76060i = new a(16, null);

        /* JADX INFO: renamed from: j */
        public static final a f76061j = new a(32, null);

        /* JADX INFO: renamed from: k */
        public static final a f76062k = new a(64, null);

        /* JADX INFO: renamed from: l */
        public static final a f76063l = new a(128, null);

        /* JADX INFO: renamed from: m */
        public static final a f76064m = new a(256, null, InterfaceC16750ec.b.class);

        /* JADX INFO: renamed from: n */
        public static final a f76065n = new a(512, null, InterfaceC16750ec.b.class);

        /* JADX INFO: renamed from: o */
        public static final a f76066o = new a(1024, null, InterfaceC16750ec.c.class);

        /* JADX INFO: renamed from: p */
        public static final a f76067p = new a(2048, null, InterfaceC16750ec.c.class);

        /* JADX INFO: renamed from: q */
        public static final a f76068q = new a(4096, null);

        /* JADX INFO: renamed from: r */
        public static final a f76069r = new a(8192, null);

        /* JADX INFO: renamed from: s */
        public static final a f76070s = new a(16384, null);

        /* JADX INFO: renamed from: t */
        public static final a f76071t = new a(32768, null);

        /* JADX INFO: renamed from: u */
        public static final a f76072u = new a(65536, null);

        /* JADX INFO: renamed from: v */
        public static final a f76073v = new a(131072, null, InterfaceC16750ec.g.class);

        /* JADX INFO: renamed from: w */
        public static final a f76074w = new a(262144, null);

        /* JADX INFO: renamed from: x */
        public static final a f76075x = new a(524288, null);

        /* JADX INFO: renamed from: y */
        public static final a f76076y = new a(1048576, null);

        /* JADX INFO: renamed from: z */
        public static final a f76077z = new a(2097152, null, InterfaceC16750ec.h.class);

        /* JADX INFO: renamed from: A */
        public static final a f76034A = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);

        /* JADX INFO: renamed from: B */
        public static final a f76035B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC16750ec.e.class);

        /* JADX INFO: renamed from: C */
        public static final a f76036C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);

        /* JADX INFO: renamed from: D */
        public static final a f76037D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);

        /* JADX INFO: renamed from: E */
        public static final a f76038E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);

        /* JADX INFO: renamed from: F */
        public static final a f76039F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);

        static {
            int i = Build.VERSION.SDK_INT;
            f76040G = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            f76041H = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            f76042I = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            f76043J = new a(i >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            f76044K = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            f76045L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, InterfaceC16750ec.f.class);
            f76046M = new a(i >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, InterfaceC16750ec.d.class);
            f76047N = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            f76048O = new a(i >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            f76049P = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            f76050Q = new a(i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            f76051R = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            f76052S = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            f76053T = new a(i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            f76054U = new a(i >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            f76055V = new a(i >= 34 ? d.m103461a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(Object obj, int i, CharSequence charSequence, InterfaceC16750ec interfaceC16750ec, Class<? extends InterfaceC16750ec.a> cls) {
            this.f76079b = i;
            this.f76081d = interfaceC16750ec;
            if (obj == null) {
                this.f76078a = new AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.f76078a = obj;
            }
            this.f76080c = cls;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: a */
        public a m103453a(CharSequence charSequence, InterfaceC16750ec interfaceC16750ec) {
            return new a(null, this.f76079b, charSequence, interfaceC16750ec, this.f76080c);
        }

        /* JADX INFO: renamed from: b */
        public int m103454b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f76078a).getId();
        }

        /* JADX INFO: renamed from: c */
        public CharSequence m103455c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f76078a).getLabel();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: d */
        public boolean m103456d(View view, Bundle bundle) {
            if (this.f76081d == null) {
                return false;
            }
            Class<? extends InterfaceC16750ec.a> cls = this.f76080c;
            InterfaceC16750ec.a aVar = null;
            if (cls != null) {
                try {
                    InterfaceC16750ec.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.m120289a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e) {
                        e = e;
                        aVar = aVarNewInstance;
                        Class<? extends InterfaceC16750ec.a> cls2 = this.f76080c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls2 == null ? "null" : cls2.getName()), e);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
            return this.f76081d.perform(view, aVar);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f76078a;
            Object obj3 = ((a) obj).f76078a;
            if (obj2 == null) {
                return obj3 == null;
            }
            return obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f76078a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        @NonNull
        public String toString() {
            StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
            String strM103359j = C15967bc.m103359j(this.f76079b);
            if (strM103359j.equals("ACTION_UNKNOWN") && m103455c() != null) {
                strM103359j = m103455c().toString();
            }
            sb.append(strM103359j);
            return sb.toString();
        }

        public a(Object obj) {
            this(obj, 0, null, null, null);
        }

        public a(int i, CharSequence charSequence, Class<? extends InterfaceC16750ec.a> cls) {
            this(null, i, charSequence, null, cls);
        }

        public a(int i, CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }
    }
}
