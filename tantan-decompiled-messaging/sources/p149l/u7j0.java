package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class u7j0 implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<g9j0> mEndValuesList;
    private AbstractC20374f mEpicenterCallback;
    private e01<String, String> mNameOverrides;
    x8j0 mPropagation;
    private ArrayList<g9j0> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final va60 STRAIGHT_PATH_MOTION = new C20369a();
    private static ThreadLocal<e01<Animator, C20372d>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private h9j0 mStartValues = new h9j0();
    private h9j0 mEndValues = new h9j0();
    a9j0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<InterfaceC20375g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private va60 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: l.u7j0$a */
    public static class C20369a extends va60 {
        @Override // p149l.va60
        /* JADX INFO: renamed from: a */
        public Path mo192140a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: l.u7j0$b */
    public class C20370b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ e01 f175013a;

        public C20370b(e01 e01Var) {
            this.f175013a = e01Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f175013a.remove(animator);
            u7j0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            u7j0.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: renamed from: l.u7j0$c */
    public class C20371c extends AnimatorListenerAdapter {
        public C20371c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u7j0.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.u7j0$d */
    public static class C20372d {

        /* JADX INFO: renamed from: a */
        public View f175016a;

        /* JADX INFO: renamed from: b */
        public String f175017b;

        /* JADX INFO: renamed from: c */
        public g9j0 f175018c;

        /* JADX INFO: renamed from: d */
        public l6q0 f175019d;

        /* JADX INFO: renamed from: e */
        public u7j0 f175020e;

        public C20372d(View view, String str, u7j0 u7j0Var, l6q0 l6q0Var, g9j0 g9j0Var) {
            this.f175016a = view;
            this.f175017b = str;
            this.f175018c = g9j0Var;
            this.f175019d = l6q0Var;
            this.f175020e = u7j0Var;
        }
    }

    /* JADX INFO: renamed from: l.u7j0$e */
    public static class C20373e {
        /* JADX INFO: renamed from: a */
        public static <T> ArrayList<T> m192141a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public static <T> ArrayList<T> m192142b(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(t);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: l.u7j0$f */
    public static abstract class AbstractC20374f {
        /* JADX INFO: renamed from: a */
        public abstract Rect mo100096a(@NonNull u7j0 u7j0Var);
    }

    /* JADX INFO: renamed from: l.u7j0$g */
    public interface InterfaceC20375g {
        /* JADX INFO: renamed from: a */
        void mo95446a(@NonNull u7j0 u7j0Var);

        /* JADX INFO: renamed from: b */
        void mo100097b(@NonNull u7j0 u7j0Var);

        /* JADX INFO: renamed from: c */
        void mo95445c(@NonNull u7j0 u7j0Var);

        /* JADX INFO: renamed from: d */
        void mo100098d(@NonNull u7j0 u7j0Var);

        /* JADX INFO: renamed from: e */
        void mo100099e(@NonNull u7j0 u7j0Var);
    }

    @SuppressLint({"RestrictedApi"})
    public u7j0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q2g0.f152264c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM218349g = zej0.m218349g(typedArrayObtainStyledAttributes, xmlResourceParser, BLiveOperationTitleShowType.duration, 1, -1);
        if (jM218349g >= 0) {
            setDuration(jM218349g);
        }
        long jM218349g2 = zej0.m218349g(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM218349g2 > 0) {
            setStartDelay(jM218349g2);
        }
        int iM218350h = zej0.m218350h(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM218350h > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, iM218350h));
        }
        String strM218351i = zej0.m218351i(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM218351i != null) {
            setMatchOrder(parseMatchOrder(strM218351i));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addUnmatched(e01<View, g9j0> e01Var, e01<View, g9j0> e01Var2) {
        for (int i = 0; i < e01Var.size(); i++) {
            g9j0 g9j0VarM130827m = e01Var.m130827m(i);
            if (isValidTarget(g9j0VarM130827m.f101571b)) {
                this.mStartValuesList.add(g9j0VarM130827m);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < e01Var2.size(); i2++) {
            g9j0 g9j0VarM130827m2 = e01Var2.m130827m(i2);
            if (isValidTarget(g9j0VarM130827m2.f101571b)) {
                this.mEndValuesList.add(g9j0VarM130827m2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(h9j0 h9j0Var, View view, g9j0 g9j0Var) {
        h9j0Var.f106604a.put(view, g9j0Var);
        int id = view.getId();
        if (id >= 0) {
            int iIndexOfKey = h9j0Var.f106605b.indexOfKey(id);
            SparseArray<View> sparseArray = h9j0Var.f106605b;
            if (iIndexOfKey >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM125157F = gbl0.m125157F(view);
        if (strM125157F != null) {
            boolean zContainsKey = h9j0Var.f106607d.containsKey(strM125157F);
            e01<String, View> e01Var = h9j0Var.f106607d;
            if (zContainsKey) {
                e01Var.put(strM125157F, null);
            } else {
                e01Var.put(strM125157F, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (h9j0Var.f106606c.m148313j(itemIdAtPosition) < 0) {
                    gbl0.m125219s0(view, true);
                    h9j0Var.f106606c.m148316m(itemIdAtPosition, view);
                    return;
                }
                View viewM148311e = h9j0Var.f106606c.m148311e(itemIdAtPosition);
                if (viewM148311e != null) {
                    gbl0.m125219s0(viewM148311e, false);
                    h9j0Var.f106606c.m148316m(itemIdAtPosition, null);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    private void captureHierarchy(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    g9j0 g9j0Var = new g9j0(view);
                    if (z) {
                        captureStartValues(g9j0Var);
                    } else {
                        captureEndValues(g9j0Var);
                    }
                    g9j0Var.f101572c.add(this);
                    capturePropagationValues(g9j0Var);
                    if (z) {
                        addViewValues(this.mStartValues, view, g9j0Var);
                    } else {
                        addViewValues(this.mEndValues, view, g9j0Var);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.mTargetTypeChildExcludes.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                captureHierarchy(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private ArrayList<Integer> excludeId(ArrayList<Integer> arrayList, int i, boolean z) {
        if (i > 0) {
            return z ? C20373e.m192141a(arrayList, Integer.valueOf(i)) : C20373e.m192142b(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t != null) {
            return z ? C20373e.m192141a(arrayList, t) : C20373e.m192142b(arrayList, t);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls != null) {
            return z ? C20373e.m192141a(arrayList, cls) : C20373e.m192142b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view != null) {
            return z ? C20373e.m192141a(arrayList, view) : C20373e.m192142b(arrayList, view);
        }
        return arrayList;
    }

    private static e01<Animator, C20372d> getRunningAnimators() {
        e01<Animator, C20372d> e01Var = sRunningAnimators.get();
        if (e01Var != null) {
            return e01Var;
        }
        e01<Animator, C20372d> e01Var2 = new e01<>();
        sRunningAnimators.set(e01Var2);
        return e01Var2;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(g9j0 g9j0Var, g9j0 g9j0Var2, String str) {
        Object obj = g9j0Var.f101570a.get(str);
        Object obj2 = g9j0Var2.f101570a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(e01<View, g9j0> e01Var, e01<View, g9j0> e01Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                g9j0 g9j0Var = e01Var.get(viewValueAt);
                g9j0 g9j0Var2 = e01Var2.get(view);
                if (g9j0Var != null && g9j0Var2 != null) {
                    this.mStartValuesList.add(g9j0Var);
                    this.mEndValuesList.add(g9j0Var2);
                    e01Var.remove(viewValueAt);
                    e01Var2.remove(view);
                }
            }
        }
    }

    private void matchInstances(e01<View, g9j0> e01Var, e01<View, g9j0> e01Var2) {
        g9j0 g9j0VarRemove;
        for (int size = e01Var.size() - 1; size >= 0; size--) {
            View viewM130823i = e01Var.m130823i(size);
            if (viewM130823i != null && isValidTarget(viewM130823i) && (g9j0VarRemove = e01Var2.remove(viewM130823i)) != null && isValidTarget(g9j0VarRemove.f101571b)) {
                this.mStartValuesList.add(e01Var.mo130825k(size));
                this.mEndValuesList.add(g9j0VarRemove);
            }
        }
    }

    private void matchItemIds(e01<View, g9j0> e01Var, e01<View, g9j0> e01Var2, l2w<View> l2wVar, l2w<View> l2wVar2) {
        View viewM148311e;
        int iM148319p = l2wVar.m148319p();
        for (int i = 0; i < iM148319p; i++) {
            View viewM148320q = l2wVar.m148320q(i);
            if (viewM148320q != null && isValidTarget(viewM148320q) && (viewM148311e = l2wVar2.m148311e(l2wVar.m148315l(i))) != null && isValidTarget(viewM148311e)) {
                g9j0 g9j0Var = e01Var.get(viewM148320q);
                g9j0 g9j0Var2 = e01Var2.get(viewM148311e);
                if (g9j0Var != null && g9j0Var2 != null) {
                    this.mStartValuesList.add(g9j0Var);
                    this.mEndValuesList.add(g9j0Var2);
                    e01Var.remove(viewM148320q);
                    e01Var2.remove(viewM148311e);
                }
            }
        }
    }

    private void matchNames(e01<View, g9j0> e01Var, e01<View, g9j0> e01Var2, e01<String, View> e01Var3, e01<String, View> e01Var4) {
        View view;
        int size = e01Var3.size();
        for (int i = 0; i < size; i++) {
            View viewM130827m = e01Var3.m130827m(i);
            if (viewM130827m != null && isValidTarget(viewM130827m) && (view = e01Var4.get(e01Var3.m130823i(i))) != null && isValidTarget(view)) {
                g9j0 g9j0Var = e01Var.get(viewM130827m);
                g9j0 g9j0Var2 = e01Var2.get(view);
                if (g9j0Var != null && g9j0Var2 != null) {
                    this.mStartValuesList.add(g9j0Var);
                    this.mEndValuesList.add(g9j0Var2);
                    e01Var.remove(viewM130827m);
                    e01Var2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(h9j0 h9j0Var, h9j0 h9j0Var2) {
        e01<View, g9j0> e01Var = new e01<>(h9j0Var.f106604a);
        e01<View, g9j0> e01Var2 = new e01<>(h9j0Var2.f106604a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                addUnmatched(e01Var, e01Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                matchInstances(e01Var, e01Var2);
            } else if (i2 == 2) {
                matchNames(e01Var, e01Var2, h9j0Var.f106607d, h9j0Var2.f106607d);
            } else if (i2 == 3) {
                matchIds(e01Var, e01Var2, h9j0Var.f106605b, h9j0Var2.f106605b);
            } else if (i2 == 4) {
                matchItemIds(e01Var, e01Var2, h9j0Var.f106606c, h9j0Var2.f106606c);
            }
            i++;
        }
    }

    private static int[] parseMatchOrder(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, Constants.SEPARATOR_COMMA);
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String strTrim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(strTrim)) {
                iArr[i] = 3;
            } else if (MATCH_INSTANCE_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(strTrim)) {
                iArr[i] = 2;
            } else if (MATCH_ITEM_ID_STR.equalsIgnoreCase(strTrim)) {
                iArr[i] = 4;
            } else {
                if (!strTrim.isEmpty()) {
                    throw new InflateException("Unknown match type in matchOrder: '" + strTrim + "'");
                }
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            }
            i++;
        }
        return iArr;
    }

    private void runAnimator(Animator animator, e01<Animator, C20372d> e01Var) {
        if (animator != null) {
            animator.addListener(new C20370b(e01Var));
            animate(animator);
        }
    }

    @NonNull
    public u7j0 addListener(@NonNull InterfaceC20375g interfaceC20375g) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(interfaceC20375g);
        return this;
    }

    @NonNull
    public u7j0 addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void animate(Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(getStartDelay() + animator.getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new C20371c());
        animator.start();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<InterfaceC20375g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC20375g) arrayList2.get(i)).mo100099e(this);
        }
    }

    public abstract void captureEndValues(@NonNull g9j0 g9j0Var);

    public void capturePropagationValues(g9j0 g9j0Var) {
        String[] strArrM207419b;
        if (this.mPropagation == null || g9j0Var.f101570a.isEmpty() || (strArrM207419b = this.mPropagation.m207419b()) == null) {
            return;
        }
        for (String str : strArrM207419b) {
            if (!g9j0Var.f101570a.containsKey(str)) {
                this.mPropagation.m207418a(g9j0Var);
                return;
            }
        }
    }

    public abstract void captureStartValues(@NonNull g9j0 g9j0Var);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        e01<String, String> e01Var;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    g9j0 g9j0Var = new g9j0(viewFindViewById);
                    if (z) {
                        captureStartValues(g9j0Var);
                    } else {
                        captureEndValues(g9j0Var);
                    }
                    g9j0Var.f101572c.add(this);
                    capturePropagationValues(g9j0Var);
                    if (z) {
                        addViewValues(this.mStartValues, viewFindViewById, g9j0Var);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, g9j0Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                g9j0 g9j0Var2 = new g9j0(view);
                if (z) {
                    captureStartValues(g9j0Var2);
                } else {
                    captureEndValues(g9j0Var2);
                }
                g9j0Var2.f101572c.add(this);
                capturePropagationValues(g9j0Var2);
                if (z) {
                    addViewValues(this.mStartValues, view, g9j0Var2);
                } else {
                    addViewValues(this.mEndValues, view, g9j0Var2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (e01Var = this.mNameOverrides) == null) {
            return;
        }
        int size = e01Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.f106607d.remove(this.mNameOverrides.m130823i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f106607d.put(this.mNameOverrides.m130827m(i4), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f106604a.clear();
            this.mStartValues.f106605b.clear();
            this.mStartValues.f106606c.clear();
        } else {
            this.mEndValues.f106604a.clear();
            this.mEndValues.f106605b.clear();
            this.mEndValues.f106606c.clear();
        }
    }

    @Override // 
    public u7j0 clone() {
        try {
            u7j0 u7j0Var = (u7j0) super.clone();
            u7j0Var.mAnimators = new ArrayList<>();
            u7j0Var.mStartValues = new h9j0();
            u7j0Var.mEndValues = new h9j0();
            u7j0Var.mStartValuesList = null;
            u7j0Var.mEndValuesList = null;
            return u7j0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, h9j0 h9j0Var, h9j0 h9j0Var2, ArrayList<g9j0> arrayList, ArrayList<g9j0> arrayList2) {
        Animator animatorCreateAnimator;
        int i;
        int i2;
        View view;
        g9j0 g9j0Var;
        Animator animator;
        g9j0 g9j0Var2;
        int i3;
        e01<Animator, C20372d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            g9j0 g9j0Var3 = arrayList.get(i4);
            g9j0 g9j0Var4 = arrayList2.get(i4);
            if (g9j0Var3 != null && !g9j0Var3.f101572c.contains(this)) {
                g9j0Var3 = null;
            }
            if (g9j0Var4 != null && !g9j0Var4.f101572c.contains(this)) {
                g9j0Var4 = null;
            }
            if (!(g9j0Var3 == null && g9j0Var4 == null) && ((g9j0Var3 == null || g9j0Var4 == null || isTransitionRequired(g9j0Var3, g9j0Var4)) && (animatorCreateAnimator = createAnimator(viewGroup, g9j0Var3, g9j0Var4)) != null)) {
                if (g9j0Var4 != null) {
                    view = g9j0Var4.f101571b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        g9j0Var2 = new g9j0(view);
                        i = size;
                        i2 = i4;
                        g9j0 g9j0Var5 = h9j0Var2.f106604a.get(view);
                        if (g9j0Var5 != null) {
                            int i5 = 0;
                            while (i5 < transitionProperties.length) {
                                Map<String, Object> map = g9j0Var2.f101570a;
                                String[] strArr = transitionProperties;
                                String str = strArr[i5];
                                map.put(str, g9j0Var5.f101570a.get(str));
                                i5++;
                                transitionProperties = strArr;
                            }
                        }
                        int size2 = runningAnimators.size();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= size2) {
                                animator = animatorCreateAnimator;
                                break;
                            }
                            C20372d c20372d = runningAnimators.get(runningAnimators.m130823i(i6));
                            if (c20372d.f175018c != null && c20372d.f175016a == view) {
                                i3 = size2;
                                if (c20372d.f175017b.equals(getName()) && c20372d.f175018c.equals(g9j0Var2)) {
                                    animator = null;
                                    break;
                                }
                            } else {
                                i3 = size2;
                            }
                            i6++;
                            size2 = i3;
                        }
                    } else {
                        i = size;
                        i2 = i4;
                        animator = animatorCreateAnimator;
                        g9j0Var2 = null;
                    }
                    animatorCreateAnimator = animator;
                    g9j0Var = g9j0Var2;
                } else {
                    i = size;
                    i2 = i4;
                    view = g9j0Var3.f101571b;
                    g9j0Var = null;
                }
                if (animatorCreateAnimator != null) {
                    x8j0 x8j0Var = this.mPropagation;
                    if (x8j0Var != null) {
                        long jM207420c = x8j0Var.m207420c(viewGroup, this, g9j0Var3, g9j0Var4);
                        sparseIntArray.put(this.mAnimators.size(), (int) jM207420c);
                        jMin = Math.min(jM207420c, jMin);
                    }
                    runningAnimators.put(animatorCreateAnimator, new C20372d(view, getName(), this, del0.m111271d(viewGroup), g9j0Var));
                    this.mAnimators.add(animatorCreateAnimator);
                    jMin = jMin;
                }
            } else {
                i = size;
                i2 = i4;
            }
            i4 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator2 = this.mAnimators.get(sparseIntArray.keyAt(i7));
                animator2.setStartDelay((((long) sparseIntArray.valueAt(i7)) - jMin) + animator2.getStartDelay());
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void end() {
        int i = this.mNumInstances - 1;
        this.mNumInstances = i;
        if (i == 0) {
            ArrayList<InterfaceC20375g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC20375g) arrayList2.get(i2)).mo95445c(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.f106606c.m148319p(); i3++) {
                View viewM148320q = this.mStartValues.f106606c.m148320q(i3);
                if (viewM148320q != null) {
                    gbl0.m125219s0(viewM148320q, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f106606c.m148319p(); i4++) {
                View viewM148320q2 = this.mEndValues.f106606c.m148320q(i4);
                if (viewM148320q2 != null) {
                    gbl0.m125219s0(viewM148320q2, false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public u7j0 excludeChildren(@NonNull View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    @NonNull
    public u7j0 excludeTarget(@NonNull View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        e01<Animator, C20372d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        l6q0 l6q0VarM111271d = del0.m111271d(viewGroup);
        e01 e01Var = new e01(runningAnimators);
        runningAnimators.clear();
        for (int i = size - 1; i >= 0; i--) {
            C20372d c20372d = (C20372d) e01Var.m130827m(i);
            if (c20372d.f175016a != null && l6q0VarM111271d != null && l6q0VarM111271d.equals(c20372d.f175019d)) {
                ((Animator) e01Var.m130823i(i)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        AbstractC20374f abstractC20374f = this.mEpicenterCallback;
        if (abstractC20374f == null) {
            return null;
        }
        return abstractC20374f.mo100096a(this);
    }

    @Nullable
    public AbstractC20374f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public g9j0 getMatchedTransitionValues(View view, boolean z) {
        a9j0 a9j0Var = this.mParent;
        if (a9j0Var != null) {
            return a9j0Var.getMatchedTransitionValues(view, z);
        }
        ArrayList<g9j0> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            g9j0 g9j0Var = arrayList.get(i);
            if (g9j0Var == null) {
                return null;
            }
            if (g9j0Var.f101571b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (z ? this.mEndValuesList : this.mStartValuesList).get(i);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public va60 getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public x8j0 getPropagation() {
        return this.mPropagation;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public g9j0 getTransitionValues(@NonNull View view, boolean z) {
        a9j0 a9j0Var = this.mParent;
        if (a9j0Var != null) {
            return a9j0Var.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f106604a.get(view);
    }

    public boolean isTransitionRequired(@Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        if (g9j0Var != null && g9j0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(g9j0Var, g9j0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = g9j0Var.f101570a.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(g9j0Var, g9j0Var2, it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.mTargetTypeExcludes.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && gbl0.m125157F(view) != null && this.mTargetNameExcludes.contains(gbl0.m125157F(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(gbl0.m125157F(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i2 = 0; i2 < this.mTargetTypes.size(); i2++) {
                if (this.mTargetTypes.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void pause(View view) {
        if (this.mEnded) {
            return;
        }
        e01<Animator, C20372d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        l6q0 l6q0VarM111271d = del0.m111271d(view);
        for (int i = size - 1; i >= 0; i--) {
            C20372d c20372dM130827m = runningAnimators.m130827m(i);
            if (c20372dM130827m.f175016a != null && l6q0VarM111271d.equals(c20372dM130827m.f175019d)) {
                kr0.m146961b(runningAnimators.m130823i(i));
            }
        }
        ArrayList<InterfaceC20375g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC20375g) arrayList2.get(i2)).mo100097b(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        C20372d c20372d;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        e01<Animator, C20372d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        l6q0 l6q0VarM111271d = del0.m111271d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorM130823i = runningAnimators.m130823i(i);
            if (animatorM130823i != null && (c20372d = runningAnimators.get(animatorM130823i)) != null && c20372d.f175016a != null && l6q0VarM111271d.equals(c20372d.f175019d)) {
                g9j0 g9j0Var = c20372d.f175018c;
                View view = c20372d.f175016a;
                g9j0 transitionValues = getTransitionValues(view, true);
                g9j0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f106604a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && c20372d.f175020e.isTransitionRequired(g9j0Var, matchedTransitionValues)) {
                    if (animatorM130823i.isRunning() || animatorM130823i.isStarted()) {
                        animatorM130823i.cancel();
                    } else {
                        runningAnimators.remove(animatorM130823i);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    @NonNull
    public u7j0 removeListener(@NonNull InterfaceC20375g interfaceC20375g) {
        ArrayList<InterfaceC20375g> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(interfaceC20375g);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public u7j0 removeTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                e01<Animator, C20372d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                l6q0 l6q0VarM111271d = del0.m111271d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C20372d c20372dM130827m = runningAnimators.m130827m(i);
                    if (c20372dM130827m.f175016a != null && l6q0VarM111271d.equals(c20372dM130827m.f175019d)) {
                        kr0.m146962c(runningAnimators.m130823i(i));
                    }
                }
                ArrayList<InterfaceC20375g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC20375g) arrayList2.get(i2)).mo100098d(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        e01<Animator, C20372d> runningAnimators = getRunningAnimators();
        for (Animator animator : this.mAnimators) {
            if (runningAnimators.containsKey(animator)) {
                start();
                runAnimator(animator, runningAnimators);
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z) {
        this.mCanRemoveViews = z;
    }

    @NonNull
    public u7j0 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(@Nullable AbstractC20374f abstractC20374f) {
        this.mEpicenterCallback = abstractC20374f;
    }

    @NonNull
    public u7j0 setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i = 0; i < iArr.length; i++) {
            if (!isValidMatch(iArr[i])) {
                ig3.m135964a("matches contains invalid value");
                return;
            } else {
                if (alreadyContains(iArr, i)) {
                    ig3.m135964a("matches contains a duplicate value");
                    return;
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable va60 va60Var) {
        if (va60Var == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = va60Var;
        }
    }

    public void setPropagation(@Nullable x8j0 x8j0Var) {
        this.mPropagation = x8j0Var;
    }

    public u7j0 setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    @NonNull
    public u7j0 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<InterfaceC20375g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC20375g) arrayList2.get(i)).mo95446a(this);
                }
            }
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    public String toString(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.mDuration != -1) {
            str2 = str2 + "dur(" + this.mDuration + ") ";
        }
        if (this.mStartDelay != -1) {
            str2 = str2 + "dly(" + this.mStartDelay + ") ";
        }
        if (this.mInterpolator != null) {
            str2 = str2 + "interp(" + this.mInterpolator + ") ";
        }
        if (this.mTargetIds.size() <= 0 && this.mTargets.size() <= 0) {
            return str2;
        }
        String strConcat = str2.concat("tgts(");
        if (this.mTargetIds.size() > 0) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                if (i > 0) {
                    strConcat = strConcat.concat(", ");
                }
                strConcat = strConcat + this.mTargetIds.get(i);
            }
        }
        if (this.mTargets.size() > 0) {
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                if (i2 > 0) {
                    strConcat = strConcat.concat(", ");
                }
                strConcat = strConcat + this.mTargets.get(i2);
            }
        }
        return strConcat.concat(")");
    }

    @NonNull
    public u7j0 excludeChildren(@IdRes int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    @NonNull
    public u7j0 excludeTarget(@IdRes int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    @NonNull
    public u7j0 excludeChildren(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    @NonNull
    public u7j0 excludeTarget(@NonNull String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    @NonNull
    public u7j0 excludeTarget(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    @NonNull
    public u7j0 removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @NonNull
    public u7j0 removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public u7j0 removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public u7j0 addTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public u7j0 addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @NonNull
    public u7j0 addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public u7j0() {
    }

    public String toString() {
        return toString("");
    }
}
