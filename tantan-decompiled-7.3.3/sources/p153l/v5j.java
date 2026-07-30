package p153l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class v5j {

    /* JADX INFO: renamed from: l.v5j$a */
    public class RunnableC20764a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f182542a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f182543b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f182544c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f182545d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ArrayList f182546e;

        public RunnableC20764a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f182542a = i;
            this.f182543b = arrayList;
            this.f182544c = arrayList2;
            this.f182545d = arrayList3;
            this.f182546e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f182542a; i++) {
                kkl0.m150115C0((View) this.f182543b.get(i), (String) this.f182544c.get(i));
                kkl0.m150115C0((View) this.f182545d.get(i), (String) this.f182546e.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: l.v5j$b */
    public class RunnableC20765b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f182548a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f182549b;

        public RunnableC20765b(ArrayList arrayList, Map map) {
            this.f182548a = arrayList;
            this.f182549b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f182548a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f182548a.get(i);
                String strM150120F = kkl0.m150120F(view);
                if (strM150120F != null) {
                    kkl0.m150115C0(view, v5j.m199879i(this.f182549b, strM150120F));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.v5j$c */
    public class RunnableC20766c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f182551a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f182552b;

        public RunnableC20766c(ArrayList arrayList, Map map) {
            this.f182551a = arrayList;
            this.f182552b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f182551a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f182551a.get(i);
                kkl0.m150115C0(view, (String) this.f182552b.get(kkl0.m150120F(view)));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m199877d(List<View> list, View view) {
        int size = list.size();
        if (m199878h(list, view, size)) {
            return;
        }
        list.add(view);
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m199878h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m199878h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static String m199879i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m199880l(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo194589A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: B */
    public abstract Object mo194590B(Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo194591a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo194592b(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo194593c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo194594e(Object obj);

    /* JADX INFO: renamed from: f */
    public void m199881f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (zkl0.m220115b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m199881f(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo194595g(Object obj);

    /* JADX INFO: renamed from: j */
    public void m199882j(Map<String, View> map, @NonNull View view) {
        if (view.getVisibility() == 0) {
            String strM150120F = kkl0.m150120F(view);
            if (strM150120F != null) {
                map.put(strM150120F, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m199882j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m199883k(View view, Rect rect) {
        if (kkl0.m150133O(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    /* JADX INFO: renamed from: m */
    public abstract Object mo194596m(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: n */
    public abstract Object mo194597n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: o */
    public ArrayList<String> m199884o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(kkl0.m150120F(view));
            kkl0.m150115C0(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo194598p(Object obj, View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo194599q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: r */
    public abstract void mo194600r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: s */
    public void m199885s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        eq50.m121892a(viewGroup, new RunnableC20766c(arrayList, map));
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo194601t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: u */
    public abstract void mo194602u(Object obj, Rect rect);

    /* JADX INFO: renamed from: v */
    public abstract void mo194603v(Object obj, View view);

    /* JADX INFO: renamed from: w */
    public void mo194604w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull fg4 fg4Var, @NonNull Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: renamed from: x */
    public void m199886x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        eq50.m121892a(view, new RunnableC20765b(arrayList, map));
    }

    /* JADX INFO: renamed from: y */
    public void m199887y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strM150120F = kkl0.m150120F(view2);
            arrayList4.add(strM150120F);
            if (strM150120F != null) {
                kkl0.m150115C0(view2, null);
                String str = map.get(strM150120F);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        kkl0.m150115C0(arrayList2.get(i2), strM150120F);
                        break;
                    }
                }
            }
        }
        eq50.m121892a(view, new RunnableC20764a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo194605z(Object obj, View view, ArrayList<View> arrayList);
}
