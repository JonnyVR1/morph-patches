package p153l;

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
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes.dex */
public abstract class ygj0 implements Cloneable {
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
    private ArrayList<kij0> mEndValuesList;
    private AbstractC21592f mEpicenterCallback;
    private l01<String, String> mNameOverrides;
    bij0 mPropagation;
    private ArrayList<kij0> mStartValuesList;
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final aj60 STRAIGHT_PATH_MOTION = new C21587a();
    private static ThreadLocal<l01<Animator, C21590d>> sRunningAnimators = new ThreadLocal<>();
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
    private lij0 mStartValues = new lij0();
    private lij0 mEndValues = new lij0();
    eij0 mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    private ViewGroup mSceneRoot = null;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private int mNumInstances = 0;
    private boolean mPaused = false;
    private boolean mEnded = false;
    private ArrayList<InterfaceC21593g> mListeners = null;
    private ArrayList<Animator> mAnimators = new ArrayList<>();
    private aj60 mPathMotion = STRAIGHT_PATH_MOTION;

    /* JADX INFO: renamed from: l.ygj0$a */
    public static class C21587a extends aj60 {
        @Override // p153l.aj60
        /* JADX INFO: renamed from: a */
        public Path mo98352a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: renamed from: l.ygj0$b */
    public class C21588b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ l01 f199835a;

        public C21588b(l01 l01Var) {
            this.f199835a = l01Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f199835a.remove(animator);
            ygj0.this.mCurrentAnimators.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ygj0.this.mCurrentAnimators.add(animator);
        }
    }

    /* JADX INFO: renamed from: l.ygj0$c */
    public class C21589c extends AnimatorListenerAdapter {
        public C21589c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ygj0.this.end();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.ygj0$d */
    public static class C21590d {

        /* JADX INFO: renamed from: a */
        public View f199838a;

        /* JADX INFO: renamed from: b */
        public String f199839b;

        /* JADX INFO: renamed from: c */
        public kij0 f199840c;

        /* JADX INFO: renamed from: d */
        public qfq0 f199841d;

        /* JADX INFO: renamed from: e */
        public ygj0 f199842e;

        public C21590d(View view, String str, ygj0 ygj0Var, qfq0 qfq0Var, kij0 kij0Var) {
            this.f199838a = view;
            this.f199839b = str;
            this.f199840c = kij0Var;
            this.f199841d = qfq0Var;
            this.f199842e = ygj0Var;
        }
    }

    /* JADX INFO: renamed from: l.ygj0$e */
    public static class C21591e {
        /* JADX INFO: renamed from: a */
        public static <T> ArrayList<T> m215844a(ArrayList<T> arrayList, T t) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (!arrayList.contains(t)) {
                arrayList.add(t);
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: b */
        public static <T> ArrayList<T> m215845b(ArrayList<T> arrayList, T t) {
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

    /* JADX INFO: renamed from: l.ygj0$f */
    public static abstract class AbstractC21592f {
        /* JADX INFO: renamed from: a */
        public abstract Rect mo204980a(@NonNull ygj0 ygj0Var);
    }

    /* JADX INFO: renamed from: l.ygj0$g */
    public interface InterfaceC21593g {
        /* JADX INFO: renamed from: a */
        void mo120913a(@NonNull ygj0 ygj0Var);

        /* JADX INFO: renamed from: b */
        void mo106210b(@NonNull ygj0 ygj0Var);

        /* JADX INFO: renamed from: c */
        void mo106211c(@NonNull ygj0 ygj0Var);

        /* JADX INFO: renamed from: d */
        void mo106212d(@NonNull ygj0 ygj0Var);

        /* JADX INFO: renamed from: e */
        void mo106213e(@NonNull ygj0 ygj0Var);
    }

    @SuppressLint({"RestrictedApi"})
    public ygj0(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xag0.f193032c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long jM117300g = doj0.m117300g(typedArrayObtainStyledAttributes, xmlResourceParser, BLiveOperationTitleShowType.duration, 1, -1);
        if (jM117300g >= 0) {
            setDuration(jM117300g);
        }
        long jM117300g2 = doj0.m117300g(typedArrayObtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (jM117300g2 > 0) {
            setStartDelay(jM117300g2);
        }
        int iM117301h = doj0.m117301h(typedArrayObtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (iM117301h > 0) {
            setInterpolator(AnimationUtils.loadInterpolator(context, iM117301h));
        }
        String strM117302i = doj0.m117302i(typedArrayObtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (strM117302i != null) {
            setMatchOrder(parseMatchOrder(strM117302i));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void addUnmatched(l01<View, kij0> l01Var, l01<View, kij0> l01Var2) {
        for (int i = 0; i < l01Var.size(); i++) {
            kij0 kij0VarM168583m = l01Var.m168583m(i);
            if (isValidTarget(kij0VarM168583m.f127001b)) {
                this.mStartValuesList.add(kij0VarM168583m);
                this.mEndValuesList.add(null);
            }
        }
        for (int i2 = 0; i2 < l01Var2.size(); i2++) {
            kij0 kij0VarM168583m2 = l01Var2.m168583m(i2);
            if (isValidTarget(kij0VarM168583m2.f127001b)) {
                this.mEndValuesList.add(kij0VarM168583m2);
                this.mStartValuesList.add(null);
            }
        }
    }

    private static void addViewValues(lij0 lij0Var, View view, kij0 kij0Var) {
        lij0Var.f132228a.put(view, kij0Var);
        int id = view.getId();
        if (id >= 0) {
            int iIndexOfKey = lij0Var.f132229b.indexOfKey(id);
            SparseArray<View> sparseArray = lij0Var.f132229b;
            if (iIndexOfKey >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String strM150120F = kkl0.m150120F(view);
        if (strM150120F != null) {
            boolean zContainsKey = lij0Var.f132231d.containsKey(strM150120F);
            l01<String, View> l01Var = lij0Var.f132231d;
            if (zContainsKey) {
                l01Var.put(strM150120F, null);
            } else {
                l01Var.put(strM150120F, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (lij0Var.f132230c.m143461j(itemIdAtPosition) < 0) {
                    kkl0.m150182s0(view, true);
                    lij0Var.f132230c.m143464m(itemIdAtPosition, view);
                    return;
                }
                View viewM143459e = lij0Var.f132230c.m143459e(itemIdAtPosition);
                if (viewM143459e != null) {
                    kkl0.m150182s0(viewM143459e, false);
                    lij0Var.f132230c.m143464m(itemIdAtPosition, null);
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
                    kij0 kij0Var = new kij0(view);
                    if (z) {
                        captureStartValues(kij0Var);
                    } else {
                        captureEndValues(kij0Var);
                    }
                    kij0Var.f127002c.add(this);
                    capturePropagationValues(kij0Var);
                    if (z) {
                        addViewValues(this.mStartValues, view, kij0Var);
                    } else {
                        addViewValues(this.mEndValues, view, kij0Var);
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
            return z ? C21591e.m215844a(arrayList, Integer.valueOf(i)) : C21591e.m215845b(arrayList, Integer.valueOf(i));
        }
        return arrayList;
    }

    private static <T> ArrayList<T> excludeObject(ArrayList<T> arrayList, T t, boolean z) {
        if (t != null) {
            return z ? C21591e.m215844a(arrayList, t) : C21591e.m215845b(arrayList, t);
        }
        return arrayList;
    }

    private ArrayList<Class<?>> excludeType(ArrayList<Class<?>> arrayList, Class<?> cls, boolean z) {
        if (cls != null) {
            return z ? C21591e.m215844a(arrayList, cls) : C21591e.m215845b(arrayList, cls);
        }
        return arrayList;
    }

    private ArrayList<View> excludeView(ArrayList<View> arrayList, View view, boolean z) {
        if (view != null) {
            return z ? C21591e.m215844a(arrayList, view) : C21591e.m215845b(arrayList, view);
        }
        return arrayList;
    }

    private static l01<Animator, C21590d> getRunningAnimators() {
        l01<Animator, C21590d> l01Var = sRunningAnimators.get();
        if (l01Var != null) {
            return l01Var;
        }
        l01<Animator, C21590d> l01Var2 = new l01<>();
        sRunningAnimators.set(l01Var2);
        return l01Var2;
    }

    private static boolean isValidMatch(int i) {
        return i >= 1 && i <= 4;
    }

    private static boolean isValueChanged(kij0 kij0Var, kij0 kij0Var2, String str) {
        Object obj = kij0Var.f127000a.get(str);
        Object obj2 = kij0Var2.f127000a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    private void matchIds(l01<View, kij0> l01Var, l01<View, kij0> l01Var2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && isValidTarget(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && isValidTarget(view)) {
                kij0 kij0Var = l01Var.get(viewValueAt);
                kij0 kij0Var2 = l01Var2.get(view);
                if (kij0Var != null && kij0Var2 != null) {
                    this.mStartValuesList.add(kij0Var);
                    this.mEndValuesList.add(kij0Var2);
                    l01Var.remove(viewValueAt);
                    l01Var2.remove(view);
                }
            }
        }
    }

    private void matchInstances(l01<View, kij0> l01Var, l01<View, kij0> l01Var2) {
        kij0 kij0VarRemove;
        for (int size = l01Var.size() - 1; size >= 0; size--) {
            View viewM168582i = l01Var.m168582i(size);
            if (viewM168582i != null && isValidTarget(viewM168582i) && (kij0VarRemove = l01Var2.remove(viewM168582i)) != null && isValidTarget(kij0VarRemove.f127001b)) {
                this.mStartValuesList.add(l01Var.mo147463k(size));
                this.mEndValuesList.add(kij0VarRemove);
            }
        }
    }

    private void matchItemIds(l01<View, kij0> l01Var, l01<View, kij0> l01Var2, j4w<View> j4wVar, j4w<View> j4wVar2) {
        View viewM143459e;
        int iM143467p = j4wVar.m143467p();
        for (int i = 0; i < iM143467p; i++) {
            View viewM143468q = j4wVar.m143468q(i);
            if (viewM143468q != null && isValidTarget(viewM143468q) && (viewM143459e = j4wVar2.m143459e(j4wVar.m143463l(i))) != null && isValidTarget(viewM143459e)) {
                kij0 kij0Var = l01Var.get(viewM143468q);
                kij0 kij0Var2 = l01Var2.get(viewM143459e);
                if (kij0Var != null && kij0Var2 != null) {
                    this.mStartValuesList.add(kij0Var);
                    this.mEndValuesList.add(kij0Var2);
                    l01Var.remove(viewM143468q);
                    l01Var2.remove(viewM143459e);
                }
            }
        }
    }

    private void matchNames(l01<View, kij0> l01Var, l01<View, kij0> l01Var2, l01<String, View> l01Var3, l01<String, View> l01Var4) {
        View view;
        int size = l01Var3.size();
        for (int i = 0; i < size; i++) {
            View viewM168583m = l01Var3.m168583m(i);
            if (viewM168583m != null && isValidTarget(viewM168583m) && (view = l01Var4.get(l01Var3.m168582i(i))) != null && isValidTarget(view)) {
                kij0 kij0Var = l01Var.get(viewM168583m);
                kij0 kij0Var2 = l01Var2.get(view);
                if (kij0Var != null && kij0Var2 != null) {
                    this.mStartValuesList.add(kij0Var);
                    this.mEndValuesList.add(kij0Var2);
                    l01Var.remove(viewM168583m);
                    l01Var2.remove(view);
                }
            }
        }
    }

    private void matchStartAndEnd(lij0 lij0Var, lij0 lij0Var2) {
        l01<View, kij0> l01Var = new l01<>(lij0Var.f132228a);
        l01<View, kij0> l01Var2 = new l01<>(lij0Var2.f132228a);
        int i = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i >= iArr.length) {
                addUnmatched(l01Var, l01Var2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                matchInstances(l01Var, l01Var2);
            } else if (i2 == 2) {
                matchNames(l01Var, l01Var2, lij0Var.f132231d, lij0Var2.f132231d);
            } else if (i2 == 3) {
                matchIds(l01Var, l01Var2, lij0Var.f132229b, lij0Var2.f132229b);
            } else if (i2 == 4) {
                matchItemIds(l01Var, l01Var2, lij0Var.f132230c, lij0Var2.f132230c);
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

    private void runAnimator(Animator animator, l01<Animator, C21590d> l01Var) {
        if (animator != null) {
            animator.addListener(new C21588b(l01Var));
            animate(animator);
        }
    }

    @NonNull
    public ygj0 addListener(@NonNull InterfaceC21593g interfaceC21593g) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(interfaceC21593g);
        return this;
    }

    @NonNull
    public ygj0 addTarget(@NonNull String str) {
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
        animator.addListener(new C21589c());
        animator.start();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        for (int size = this.mCurrentAnimators.size() - 1; size >= 0; size--) {
            this.mCurrentAnimators.get(size).cancel();
        }
        ArrayList<InterfaceC21593g> arrayList = this.mListeners;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((InterfaceC21593g) arrayList2.get(i)).mo106213e(this);
        }
    }

    public abstract void captureEndValues(@NonNull kij0 kij0Var);

    public void capturePropagationValues(kij0 kij0Var) {
        String[] strArrM104465b;
        if (this.mPropagation == null || kij0Var.f127000a.isEmpty() || (strArrM104465b = this.mPropagation.m104465b()) == null) {
            return;
        }
        for (String str : strArrM104465b) {
            if (!kij0Var.f127000a.containsKey(str)) {
                this.mPropagation.m104464a(kij0Var);
                return;
            }
        }
    }

    public abstract void captureStartValues(@NonNull kij0 kij0Var);

    public void captureValues(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        l01<String, String> l01Var;
        clearValues(z);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.mTargetIds.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.mTargetIds.get(i).intValue());
                if (viewFindViewById != null) {
                    kij0 kij0Var = new kij0(viewFindViewById);
                    if (z) {
                        captureStartValues(kij0Var);
                    } else {
                        captureEndValues(kij0Var);
                    }
                    kij0Var.f127002c.add(this);
                    capturePropagationValues(kij0Var);
                    if (z) {
                        addViewValues(this.mStartValues, viewFindViewById, kij0Var);
                    } else {
                        addViewValues(this.mEndValues, viewFindViewById, kij0Var);
                    }
                }
            }
            for (int i2 = 0; i2 < this.mTargets.size(); i2++) {
                View view = this.mTargets.get(i2);
                kij0 kij0Var2 = new kij0(view);
                if (z) {
                    captureStartValues(kij0Var2);
                } else {
                    captureEndValues(kij0Var2);
                }
                kij0Var2.f127002c.add(this);
                capturePropagationValues(kij0Var2);
                if (z) {
                    addViewValues(this.mStartValues, view, kij0Var2);
                } else {
                    addViewValues(this.mEndValues, view, kij0Var2);
                }
            }
        } else {
            captureHierarchy(viewGroup, z);
        }
        if (z || (l01Var = this.mNameOverrides) == null) {
            return;
        }
        int size = l01Var.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.mStartValues.f132231d.remove(this.mNameOverrides.m168582i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.mStartValues.f132231d.put(this.mNameOverrides.m168583m(i4), view2);
            }
        }
    }

    public void clearValues(boolean z) {
        if (z) {
            this.mStartValues.f132228a.clear();
            this.mStartValues.f132229b.clear();
            this.mStartValues.f132230c.clear();
        } else {
            this.mEndValues.f132228a.clear();
            this.mEndValues.f132229b.clear();
            this.mEndValues.f132230c.clear();
        }
    }

    @Override // 
    public ygj0 clone() {
        try {
            ygj0 ygj0Var = (ygj0) super.clone();
            ygj0Var.mAnimators = new ArrayList<>();
            ygj0Var.mStartValues = new lij0();
            ygj0Var.mEndValues = new lij0();
            ygj0Var.mStartValuesList = null;
            ygj0Var.mEndValuesList = null;
            return ygj0Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable kij0 kij0Var, @Nullable kij0 kij0Var2) {
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void createAnimators(ViewGroup viewGroup, lij0 lij0Var, lij0 lij0Var2, ArrayList<kij0> arrayList, ArrayList<kij0> arrayList2) {
        Animator animatorCreateAnimator;
        int i;
        int i2;
        View view;
        kij0 kij0Var;
        Animator animator;
        kij0 kij0Var2;
        int i3;
        l01<Animator, C21590d> runningAnimators = getRunningAnimators();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long jMin = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            kij0 kij0Var3 = arrayList.get(i4);
            kij0 kij0Var4 = arrayList2.get(i4);
            if (kij0Var3 != null && !kij0Var3.f127002c.contains(this)) {
                kij0Var3 = null;
            }
            if (kij0Var4 != null && !kij0Var4.f127002c.contains(this)) {
                kij0Var4 = null;
            }
            if (!(kij0Var3 == null && kij0Var4 == null) && ((kij0Var3 == null || kij0Var4 == null || isTransitionRequired(kij0Var3, kij0Var4)) && (animatorCreateAnimator = createAnimator(viewGroup, kij0Var3, kij0Var4)) != null)) {
                if (kij0Var4 != null) {
                    view = kij0Var4.f127001b;
                    String[] transitionProperties = getTransitionProperties();
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        kij0Var2 = new kij0(view);
                        i = size;
                        i2 = i4;
                        kij0 kij0Var5 = lij0Var2.f132228a.get(view);
                        if (kij0Var5 != null) {
                            int i5 = 0;
                            while (i5 < transitionProperties.length) {
                                Map<String, Object> map = kij0Var2.f127000a;
                                String[] strArr = transitionProperties;
                                String str = strArr[i5];
                                map.put(str, kij0Var5.f127000a.get(str));
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
                            C21590d c21590d = runningAnimators.get(runningAnimators.m168582i(i6));
                            if (c21590d.f199840c != null && c21590d.f199838a == view) {
                                i3 = size2;
                                if (c21590d.f199839b.equals(getName()) && c21590d.f199840c.equals(kij0Var2)) {
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
                        kij0Var2 = null;
                    }
                    animatorCreateAnimator = animator;
                    kij0Var = kij0Var2;
                } else {
                    i = size;
                    i2 = i4;
                    view = kij0Var3.f127001b;
                    kij0Var = null;
                }
                if (animatorCreateAnimator != null) {
                    bij0 bij0Var = this.mPropagation;
                    if (bij0Var != null) {
                        long jM104466c = bij0Var.m104466c(viewGroup, this, kij0Var3, kij0Var4);
                        sparseIntArray.put(this.mAnimators.size(), (int) jM104466c);
                        jMin = Math.min(jM104466c, jMin);
                    }
                    runningAnimators.put(animatorCreateAnimator, new C21590d(view, getName(), this, hnl0.m136150d(viewGroup), kij0Var));
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
            ArrayList<InterfaceC21593g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC21593g) arrayList2.get(i2)).mo106211c(this);
                }
            }
            for (int i3 = 0; i3 < this.mStartValues.f132230c.m143467p(); i3++) {
                View viewM143468q = this.mStartValues.f132230c.m143468q(i3);
                if (viewM143468q != null) {
                    kkl0.m150182s0(viewM143468q, false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f132230c.m143467p(); i4++) {
                View viewM143468q2 = this.mEndValues.f132230c.m143468q(i4);
                if (viewM143468q2 != null) {
                    kkl0.m150182s0(viewM143468q2, false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public ygj0 excludeChildren(@NonNull View view, boolean z) {
        this.mTargetChildExcludes = excludeView(this.mTargetChildExcludes, view, z);
        return this;
    }

    @NonNull
    public ygj0 excludeTarget(@NonNull View view, boolean z) {
        this.mTargetExcludes = excludeView(this.mTargetExcludes, view, z);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void forceToEnd(ViewGroup viewGroup) {
        l01<Animator, C21590d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        qfq0 qfq0VarM136150d = hnl0.m136150d(viewGroup);
        l01 l01Var = new l01(runningAnimators);
        runningAnimators.clear();
        for (int i = size - 1; i >= 0; i--) {
            C21590d c21590d = (C21590d) l01Var.m168583m(i);
            if (c21590d.f199838a != null && qfq0VarM136150d != null && qfq0VarM136150d.equals(c21590d.f199841d)) {
                ((Animator) l01Var.m168582i(i)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        AbstractC21592f abstractC21592f = this.mEpicenterCallback;
        if (abstractC21592f == null) {
            return null;
        }
        return abstractC21592f.mo204980a(this);
    }

    @Nullable
    public AbstractC21592f getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public kij0 getMatchedTransitionValues(View view, boolean z) {
        eij0 eij0Var = this.mParent;
        if (eij0Var != null) {
            return eij0Var.getMatchedTransitionValues(view, z);
        }
        ArrayList<kij0> arrayList = z ? this.mStartValuesList : this.mEndValuesList;
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
            kij0 kij0Var = arrayList.get(i);
            if (kij0Var == null) {
                return null;
            }
            if (kij0Var.f127001b == view) {
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
    public aj60 getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public bij0 getPropagation() {
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
    public kij0 getTransitionValues(@NonNull View view, boolean z) {
        eij0 eij0Var = this.mParent;
        if (eij0Var != null) {
            return eij0Var.getTransitionValues(view, z);
        }
        return (z ? this.mStartValues : this.mEndValues).f132228a.get(view);
    }

    public boolean isTransitionRequired(@Nullable kij0 kij0Var, @Nullable kij0 kij0Var2) {
        if (kij0Var != null && kij0Var2 != null) {
            String[] transitionProperties = getTransitionProperties();
            if (transitionProperties != null) {
                for (String str : transitionProperties) {
                    if (isValueChanged(kij0Var, kij0Var2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator<String> it = kij0Var.f127000a.keySet().iterator();
                while (it.hasNext()) {
                    if (isValueChanged(kij0Var, kij0Var2, it.next())) {
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
        if (this.mTargetNameExcludes != null && kkl0.m150120F(view) != null && this.mTargetNameExcludes.contains(kkl0.m150120F(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(kkl0.m150120F(view))) {
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
        l01<Animator, C21590d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        qfq0 qfq0VarM136150d = hnl0.m136150d(view);
        for (int i = size - 1; i >= 0; i--) {
            C21590d c21590dM168583m = runningAnimators.m168583m(i);
            if (c21590dM168583m.f199838a != null && qfq0VarM136150d.equals(c21590dM168583m.f199841d)) {
                pr0.m173424b(runningAnimators.m168582i(i));
            }
        }
        ArrayList<InterfaceC21593g> arrayList = this.mListeners;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((InterfaceC21593g) arrayList2.get(i2)).mo106210b(this);
            }
        }
        this.mPaused = true;
    }

    public void playTransition(ViewGroup viewGroup) {
        C21590d c21590d;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        matchStartAndEnd(this.mStartValues, this.mEndValues);
        l01<Animator, C21590d> runningAnimators = getRunningAnimators();
        int size = runningAnimators.size();
        qfq0 qfq0VarM136150d = hnl0.m136150d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorM168582i = runningAnimators.m168582i(i);
            if (animatorM168582i != null && (c21590d = runningAnimators.get(animatorM168582i)) != null && c21590d.f199838a != null && qfq0VarM136150d.equals(c21590d.f199841d)) {
                kij0 kij0Var = c21590d.f199840c;
                View view = c21590d.f199838a;
                kij0 transitionValues = getTransitionValues(view, true);
                kij0 matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues == null && matchedTransitionValues == null) {
                    matchedTransitionValues = this.mEndValues.f132228a.get(view);
                }
                if ((transitionValues != null || matchedTransitionValues != null) && c21590d.f199842e.isTransitionRequired(kij0Var, matchedTransitionValues)) {
                    if (animatorM168582i.isRunning() || animatorM168582i.isStarted()) {
                        animatorM168582i.cancel();
                    } else {
                        runningAnimators.remove(animatorM168582i);
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        runAnimators();
    }

    @NonNull
    public ygj0 removeListener(@NonNull InterfaceC21593g interfaceC21593g) {
        ArrayList<InterfaceC21593g> arrayList = this.mListeners;
        if (arrayList != null) {
            arrayList.remove(interfaceC21593g);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
        return this;
    }

    @NonNull
    public ygj0 removeTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.remove(Integer.valueOf(i));
        }
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void resume(View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                l01<Animator, C21590d> runningAnimators = getRunningAnimators();
                int size = runningAnimators.size();
                qfq0 qfq0VarM136150d = hnl0.m136150d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C21590d c21590dM168583m = runningAnimators.m168583m(i);
                    if (c21590dM168583m.f199838a != null && qfq0VarM136150d.equals(c21590dM168583m.f199841d)) {
                        pr0.m173425c(runningAnimators.m168582i(i));
                    }
                }
                ArrayList<InterfaceC21593g> arrayList = this.mListeners;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC21593g) arrayList2.get(i2)).mo106212d(this);
                    }
                }
            }
            this.mPaused = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void runAnimators() {
        start();
        l01<Animator, C21590d> runningAnimators = getRunningAnimators();
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
    public ygj0 setDuration(long j) {
        this.mDuration = j;
        return this;
    }

    public void setEpicenterCallback(@Nullable AbstractC21592f abstractC21592f) {
        this.mEpicenterCallback = abstractC21592f;
    }

    @NonNull
    public ygj0 setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
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
                wg3.m206174a("matches contains invalid value");
                return;
            } else {
                if (alreadyContains(iArr, i)) {
                    wg3.m206174a("matches contains a duplicate value");
                    return;
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable aj60 aj60Var) {
        if (aj60Var == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = aj60Var;
        }
    }

    public void setPropagation(@Nullable bij0 bij0Var) {
        this.mPropagation = bij0Var;
    }

    public ygj0 setSceneRoot(ViewGroup viewGroup) {
        this.mSceneRoot = viewGroup;
        return this;
    }

    @NonNull
    public ygj0 setStartDelay(long j) {
        this.mStartDelay = j;
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void start() {
        if (this.mNumInstances == 0) {
            ArrayList<InterfaceC21593g> arrayList = this.mListeners;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.mListeners.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC21593g) arrayList2.get(i)).mo120913a(this);
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
    public ygj0 excludeChildren(@IdRes int i, boolean z) {
        this.mTargetIdChildExcludes = excludeId(this.mTargetIdChildExcludes, i, z);
        return this;
    }

    @NonNull
    public ygj0 excludeTarget(@IdRes int i, boolean z) {
        this.mTargetIdExcludes = excludeId(this.mTargetIdExcludes, i, z);
        return this;
    }

    @NonNull
    public ygj0 excludeChildren(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeChildExcludes = excludeType(this.mTargetTypeChildExcludes, cls, z);
        return this;
    }

    @NonNull
    public ygj0 excludeTarget(@NonNull String str, boolean z) {
        this.mTargetNameExcludes = excludeObject(this.mTargetNameExcludes, str, z);
        return this;
    }

    @NonNull
    public ygj0 excludeTarget(@NonNull Class<?> cls, boolean z) {
        this.mTargetTypeExcludes = excludeType(this.mTargetTypeExcludes, cls, z);
        return this;
    }

    @NonNull
    public ygj0 removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @NonNull
    public ygj0 removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public ygj0 removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public ygj0 addTarget(@IdRes int i) {
        if (i != 0) {
            this.mTargetIds.add(Integer.valueOf(i));
        }
        return this;
    }

    @NonNull
    public ygj0 addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @NonNull
    public ygj0 addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    public ygj0() {
    }

    public String toString() {
        return toString("");
    }
}
