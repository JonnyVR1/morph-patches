package p153l;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class h80<DATA> {

    /* JADX INFO: renamed from: a */
    public h80<DATA>.C17418b<h80<DATA>.C17417a> f108184a;

    /* JADX INFO: renamed from: b */
    public h80<DATA>.C17418b<h80<DATA>.C17417a> f108185b;

    /* JADX INFO: renamed from: d */
    public Handler f108187d;

    /* JADX INFO: renamed from: e */
    public boolean f108188e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f108189f;

    /* JADX INFO: renamed from: h */
    public View f108191h;

    /* JADX INFO: renamed from: c */
    public ArrayList<DATA> f108186c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int[] f108190g = new int[2];

    /* JADX INFO: renamed from: l.h80$a */
    public class C17417a {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f108192a;

        /* JADX INFO: renamed from: b */
        public long f108193b;

        /* JADX INFO: renamed from: c */
        public int f108194c;

        /* JADX INFO: renamed from: d */
        public int f108195d;

        /* JADX INFO: renamed from: e */
        public DATA f108196e;

        public C17417a() {
        }
    }

    /* JADX INFO: renamed from: l.h80$b */
    public class C17418b<TYPE> {

        /* JADX INFO: renamed from: a */
        public h80<DATA>.C17418b<TYPE> f108198a;

        /* JADX INFO: renamed from: b */
        public TYPE f108199b;

        public C17418b(TYPE type) {
            this.f108199b = type;
        }
    }

    /* JADX INFO: renamed from: l.h80$c */
    public static class RunnableC17419c implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<h80> f108201a;

        public RunnableC17419c(h80 h80Var) {
            this.f108201a = new WeakReference<>(h80Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            h80 h80Var = this.f108201a.get();
            if (NullChecker.m82486a(h80Var)) {
                h80Var.m133876b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m133876b() {
        h80 h80Var;
        this.f108188e = false;
        C17418b c17418b = this.f108184a;
        C17418b c17418b2 = null;
        while (c17418b != null) {
            C17418b c17418b3 = c17418b.f108198a;
            if (this.m133879e((C17417a) c17418b.f108199b)) {
                h80Var = this;
            } else {
                TYPE type = c17418b.f108199b;
                if (((C17417a) type).f108194c == 1) {
                    ((C17417a) type).f108194c = 2;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    TYPE type2 = c17418b.f108199b;
                    long j = jCurrentAnimationTimeMillis - ((C17417a) type2).f108193b;
                    this.mo59141l(((C17417a) type2).f108196e, ((C17417a) type2).f108195d, j);
                    TYPE type3 = c17418b.f108199b;
                    h80<DATA> h80Var2 = this;
                    h80Var2.mo56879m(((C17417a) type3).f108196e, ((C17417a) type3).f108195d, j, ((C17417a) type3).f108192a == null ? null : ((C17417a) type3).f108192a.get());
                    h80Var = h80Var2;
                } else {
                    h80Var = this;
                }
            }
            TYPE type4 = c17418b.f108199b;
            if (((C17417a) type4).f108192a == null || ((C17417a) type4).f108192a.get() == null) {
                if (c17418b2 == null) {
                    h80Var.f108184a = c17418b3;
                } else {
                    c17418b2.f108198a = c17418b3;
                }
                c17418b.f108198a = null;
                h80Var.m133887r(c17418b);
            } else {
                c17418b2 = c17418b;
            }
            c17418b = c17418b3;
            this = (h80<DATA>) h80Var;
        }
        h80<DATA> h80Var3 = this;
        for (C17418b c17418b4 = h80Var3.f108184a; c17418b4 != null; c17418b4 = c17418b4.f108198a) {
            if (h80Var3.m133879e((C17417a) c17418b4.f108199b)) {
                TYPE type5 = c17418b4.f108199b;
                if (((C17417a) type5).f108193b <= 0) {
                    ((C17417a) type5).f108193b = AnimationUtils.currentAnimationTimeMillis();
                }
                TYPE type6 = c17418b4.f108199b;
                if (((C17417a) type6).f108194c != 1) {
                    ((C17417a) type6).f108194c = 1;
                    h80Var3.mo56878j(((C17417a) type6).f108196e, ((C17417a) type6).f108195d);
                    TYPE type7 = c17418b4.f108199b;
                    h80Var3.mo65120k(((C17417a) type7).f108196e, ((C17417a) type7).f108195d, ((C17417a) type7).f108192a == null ? null : ((C17417a) type7).f108192a.get());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m133877c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj == obj2 || obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m133878d(View view) {
        if (this.f108189f == null) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.content);
            this.f108189f = viewGroup;
            if (viewGroup != null) {
                mo56877f(this.f108189f, (ViewGroup) view.getParent());
            }
        }
        ViewGroup viewGroup2 = this.f108189f;
        if (viewGroup2 == null) {
            return false;
        }
        viewGroup2.getLocationInWindow(this.f108190g);
        int measuredWidth = this.f108189f.getMeasuredWidth();
        int measuredHeight = this.f108189f.getMeasuredHeight();
        int[] iArr = this.f108190g;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        int[] iArr2 = this.f108190g;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        return i4 < measuredHeight + i2 && i4 + measuredHeight2 > i2 && i3 < measuredWidth + i && i3 + measuredWidth2 > i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m133879e(h80<DATA>.C17417a c17417a) {
        WeakReference<View> weakReference = c17417a.f108192a;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && view.isAttachedToWindow() && view.getRootView() != null) {
            View view2 = this.f108191h;
            if (view2 == null) {
                return m133878d(view);
            }
            if (m133878d(view2) && m133878d(view)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void m133880g(View view) {
        m133884o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public void m133881h(View view, DATA data, int i) {
        if (view == null || data == null) {
            return;
        }
        C17418b c17418b = this.f108184a;
        C17418b c17418b2 = null;
        while (c17418b != null && c17418b2 == null) {
            TYPE type = c17418b.f108199b;
            if (((C17417a) type).f108192a == null || ((C17417a) type).f108192a.get() != view) {
                c17418b = c17418b.f108198a;
            } else {
                c17418b2 = c17418b;
            }
        }
        if (NullChecker.m82486a(c17418b2)) {
            if (m133877c(((C17417a) c17418b2.f108199b).f108196e, data)) {
                return;
            } else {
                ((C17417a) c17418b2.f108199b).f108192a = null;
            }
        }
        C17418b c17418b3 = this.f108184a;
        C17418b c17418b4 = null;
        while (c17418b3 != null && c17418b4 == null) {
            if (m133877c(((C17417a) c17418b3.f108199b).f108196e, data)) {
                c17418b4 = c17418b3;
            } else {
                c17418b3 = c17418b3.f108198a;
            }
        }
        if (c17418b4 == null) {
            h80<DATA>.C17418b<h80<DATA>.C17417a> c17418bM133883n = m133883n();
            c17418bM133883n.f108199b.f108192a = new WeakReference<>(view);
            h80<DATA>.C17417a c17417a = c17418bM133883n.f108199b;
            c17417a.f108194c = 0;
            c17417a.f108195d = i;
            c17417a.f108196e = data;
            c17417a.f108193b = 0L;
            m133886q(c17418bM133883n);
        } else {
            TYPE type2 = c17418b4.f108199b;
            if (((C17417a) type2).f108192a == null || ((C17417a) type2).f108192a.get() != view) {
                ((C17417a) c17418b4.f108199b).f108192a = new WeakReference<>(view);
            }
        }
        m133884o();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public void m133882i(View view) {
        m133884o();
    }

    /* JADX INFO: renamed from: n */
    public final h80<DATA>.C17418b<h80<DATA>.C17417a> m133883n() {
        h80<DATA>.C17418b<h80<DATA>.C17417a> c17418b = this.f108185b;
        if (c17418b == null) {
            return new C17418b<>(new C17417a());
        }
        this.f108185b = c17418b.f108198a;
        c17418b.f108198a = null;
        return c17418b;
    }

    /* JADX INFO: renamed from: o */
    public void m133884o() {
        if (this.f108188e) {
            return;
        }
        this.f108188e = true;
        if (this.f108187d == null) {
            this.f108187d = new Handler(Looper.getMainLooper());
        }
        this.f108187d.post(new RunnableC17419c(this));
    }

    /* JADX INFO: renamed from: p */
    public void m133885p(View view) {
        this.f108191h = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m133886q(h80<DATA>.C17418b<h80<DATA>.C17417a> c17418b) {
        C17418b c17418b2 = null;
        for (C17418b c17418b3 = this.f108184a; c17418b3 != null && ((C17417a) c17418b3.f108199b).f108195d < ((C17417a) c17418b.f108199b).f108195d; c17418b3 = c17418b3.f108198a) {
            c17418b2 = c17418b3;
        }
        if (c17418b2 == null) {
            c17418b.f108198a = this.f108184a;
            this.f108184a = c17418b;
        } else {
            c17418b.f108198a = c17418b2.f108198a;
            c17418b2.f108198a = c17418b;
        }
    }

    /* JADX INFO: renamed from: r */
    public final h80<DATA>.C17418b<h80<DATA>.C17417a> m133887r(h80<DATA>.C17418b<h80<DATA>.C17417a> c17418b) {
        h80<DATA>.C17417a c17417a = c17418b.f108199b;
        c17417a.f108194c = 0;
        c17417a.f108193b = 0L;
        c17417a.f108195d = -1;
        c17417a.f108192a = null;
        c17417a.f108196e = null;
        c17418b.f108198a = null;
        h80<DATA>.C17418b<h80<DATA>.C17417a> c17418b2 = this.f108185b;
        if (c17418b2 == 0) {
            this.f108185b = c17418b;
        } else {
            c17418b.f108198a = c17418b2;
            this.f108185b = c17418b;
        }
        return this.f108185b;
    }

    /* JADX INFO: renamed from: f */
    public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    /* JADX INFO: renamed from: j */
    public void mo56878j(DATA data, int i) {
    }

    /* JADX INFO: renamed from: k */
    public void mo65120k(DATA data, int i, View view) {
    }

    /* JADX INFO: renamed from: l */
    public void mo59141l(DATA data, int i, long j) {
    }

    /* JADX INFO: renamed from: m */
    public void mo56879m(DATA data, int i, long j, View view) {
    }
}
