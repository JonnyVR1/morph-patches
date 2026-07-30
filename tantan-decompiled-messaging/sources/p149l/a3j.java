package p149l;

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
public abstract class a3j {

    /* JADX INFO: renamed from: l.a3j$a */
    public class RunnableC15518a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f67372a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f67373b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ArrayList f67374c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f67375d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ArrayList f67376e;

        public RunnableC15518a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f67372a = i;
            this.f67373b = arrayList;
            this.f67374c = arrayList2;
            this.f67375d = arrayList3;
            this.f67376e = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f67372a; i++) {
                gbl0.m125152C0((View) this.f67373b.get(i), (String) this.f67374c.get(i));
                gbl0.m125152C0((View) this.f67375d.get(i), (String) this.f67376e.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: l.a3j$b */
    public class RunnableC15519b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f67378a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f67379b;

        public RunnableC15519b(ArrayList arrayList, Map map) {
            this.f67378a = arrayList;
            this.f67379b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f67378a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f67378a.get(i);
                String strM125157F = gbl0.m125157F(view);
                if (strM125157F != null) {
                    gbl0.m125152C0(view, a3j.m94694i(this.f67379b, strM125157F));
                }
            }
        }
    }

    /* JADX INFO: renamed from: l.a3j$c */
    public class RunnableC15520c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f67381a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f67382b;

        public RunnableC15520c(ArrayList arrayList, Map map) {
            this.f67381a = arrayList;
            this.f67382b = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f67381a.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f67381a.get(i);
                gbl0.m125152C0(view, (String) this.f67382b.get(gbl0.m125157F(view)));
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m94692d(List<View> list, View view) {
        int size = list.size();
        if (m94693h(list, view, size)) {
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
                    if (!m94693h(list, childAt, size)) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m94693h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static String m94694i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static boolean m94695l(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo94696A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: B */
    public abstract Object mo94697B(Object obj);

    /* JADX INFO: renamed from: a */
    public abstract void mo94698a(Object obj, View view);

    /* JADX INFO: renamed from: b */
    public abstract void mo94699b(Object obj, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: c */
    public abstract void mo94700c(ViewGroup viewGroup, Object obj);

    /* JADX INFO: renamed from: e */
    public abstract boolean mo94701e(Object obj);

    /* JADX INFO: renamed from: f */
    public void m94702f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (vbl0.m197723b(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                m94702f(arrayList, viewGroup.getChildAt(i));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo94703g(Object obj);

    /* JADX INFO: renamed from: j */
    public void m94704j(Map<String, View> map, @NonNull View view) {
        if (view.getVisibility() == 0) {
            String strM125157F = gbl0.m125157F(view);
            if (strM125157F != null) {
                map.put(strM125157F, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m94704j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m94705k(View view, Rect rect) {
        if (gbl0.m125170O(view)) {
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
    public abstract Object mo94706m(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: n */
    public abstract Object mo94707n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: renamed from: o */
    public ArrayList<String> m94708o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(gbl0.m125157F(view));
            gbl0.m125152C0(view, null);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo94709p(Object obj, View view);

    /* JADX INFO: renamed from: q */
    public abstract void mo94710q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* JADX INFO: renamed from: r */
    public abstract void mo94711r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: renamed from: s */
    public void m94712s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        yh50.m214787a(viewGroup, new RunnableC15520c(arrayList, map));
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo94713t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* JADX INFO: renamed from: u */
    public abstract void mo94714u(Object obj, Rect rect);

    /* JADX INFO: renamed from: v */
    public abstract void mo94715v(Object obj, View view);

    /* JADX INFO: renamed from: w */
    public void mo94716w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull gf4 gf4Var, @NonNull Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: renamed from: x */
    public void m94717x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        yh50.m214787a(view, new RunnableC15519b(arrayList, map));
    }

    /* JADX INFO: renamed from: y */
    public void m94718y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String strM125157F = gbl0.m125157F(view2);
            arrayList4.add(strM125157F);
            if (strM125157F != null) {
                gbl0.m125152C0(view2, null);
                String str = map.get(strM125157F);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        gbl0.m125152C0(arrayList2.get(i2), strM125157F);
                        break;
                    }
                }
            }
        }
        yh50.m214787a(view, new RunnableC15518a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* JADX INFO: renamed from: z */
    public abstract void mo94719z(Object obj, View view, ArrayList<View> arrayList);
}
