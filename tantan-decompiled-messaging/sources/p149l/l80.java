package p149l;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes12.dex */
public class l80<DATA> {

    /* JADX INFO: renamed from: a */
    public l80<DATA>.C18165b<l80<DATA>.C18164a> f126761a;

    /* JADX INFO: renamed from: b */
    public l80<DATA>.C18165b<l80<DATA>.C18164a> f126762b;

    /* JADX INFO: renamed from: d */
    public Handler f126764d;

    /* JADX INFO: renamed from: e */
    public boolean f126765e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f126766f;

    /* JADX INFO: renamed from: h */
    public View f126768h;

    /* JADX INFO: renamed from: c */
    public ArrayList<DATA> f126763c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int[] f126767g = new int[2];

    /* JADX INFO: renamed from: l.l80$a */
    public class C18164a {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f126769a;

        /* JADX INFO: renamed from: b */
        public long f126770b;

        /* JADX INFO: renamed from: c */
        public int f126771c;

        /* JADX INFO: renamed from: d */
        public int f126772d;

        /* JADX INFO: renamed from: e */
        public DATA f126773e;

        public C18164a() {
        }
    }

    /* JADX INFO: renamed from: l.l80$b */
    public class C18165b<TYPE> {

        /* JADX INFO: renamed from: a */
        public l80<DATA>.C18165b<TYPE> f126775a;

        /* JADX INFO: renamed from: b */
        public TYPE f126776b;

        public C18165b(TYPE type) {
            this.f126776b = type;
        }
    }

    /* JADX INFO: renamed from: l.l80$c */
    public static class RunnableC18166c implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<l80> f126778a;

        public RunnableC18166c(l80 l80Var) {
            this.f126778a = new WeakReference<>(l80Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            l80 l80Var = this.f126778a.get();
            if (NullChecker.m81303a(l80Var)) {
                l80Var.m148834b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m148834b() {
        l80 l80Var;
        this.f126765e = false;
        C18165b c18165b = this.f126761a;
        C18165b c18165b2 = null;
        while (c18165b != null) {
            C18165b c18165b3 = c18165b.f126775a;
            if (this.m148837e((C18164a) c18165b.f126776b)) {
                l80Var = this;
            } else {
                TYPE type = c18165b.f126776b;
                if (((C18164a) type).f126771c == 1) {
                    ((C18164a) type).f126771c = 2;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    TYPE type2 = c18165b.f126776b;
                    long j = jCurrentAnimationTimeMillis - ((C18164a) type2).f126770b;
                    this.mo57958l(((C18164a) type2).f126773e, ((C18164a) type2).f126772d, j);
                    TYPE type3 = c18165b.f126776b;
                    l80<DATA> l80Var2 = this;
                    l80Var2.mo55696m(((C18164a) type3).f126773e, ((C18164a) type3).f126772d, j, ((C18164a) type3).f126769a == null ? null : ((C18164a) type3).f126769a.get());
                    l80Var = l80Var2;
                } else {
                    l80Var = this;
                }
            }
            TYPE type4 = c18165b.f126776b;
            if (((C18164a) type4).f126769a == null || ((C18164a) type4).f126769a.get() == null) {
                if (c18165b2 == null) {
                    l80Var.f126761a = c18165b3;
                } else {
                    c18165b2.f126775a = c18165b3;
                }
                c18165b.f126775a = null;
                l80Var.m148845r(c18165b);
            } else {
                c18165b2 = c18165b;
            }
            c18165b = c18165b3;
            this = (l80<DATA>) l80Var;
        }
        l80<DATA> l80Var3 = this;
        for (C18165b c18165b4 = l80Var3.f126761a; c18165b4 != null; c18165b4 = c18165b4.f126775a) {
            if (l80Var3.m148837e((C18164a) c18165b4.f126776b)) {
                TYPE type5 = c18165b4.f126776b;
                if (((C18164a) type5).f126770b <= 0) {
                    ((C18164a) type5).f126770b = AnimationUtils.currentAnimationTimeMillis();
                }
                TYPE type6 = c18165b4.f126776b;
                if (((C18164a) type6).f126771c != 1) {
                    ((C18164a) type6).f126771c = 1;
                    l80Var3.mo55695j(((C18164a) type6).f126773e, ((C18164a) type6).f126772d);
                    TYPE type7 = c18165b4.f126776b;
                    l80Var3.mo63937k(((C18164a) type7).f126773e, ((C18164a) type7).f126772d, ((C18164a) type7).f126769a == null ? null : ((C18164a) type7).f126769a.get());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m148835c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj == obj2 || obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m148836d(View view) {
        if (this.f126766f == null) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.content);
            this.f126766f = viewGroup;
            if (viewGroup != null) {
                mo55694f(this.f126766f, (ViewGroup) view.getParent());
            }
        }
        ViewGroup viewGroup2 = this.f126766f;
        if (viewGroup2 == null) {
            return false;
        }
        viewGroup2.getLocationInWindow(this.f126767g);
        int measuredWidth = this.f126766f.getMeasuredWidth();
        int measuredHeight = this.f126766f.getMeasuredHeight();
        int[] iArr = this.f126767g;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        int[] iArr2 = this.f126767g;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        return i4 < measuredHeight + i2 && i4 + measuredHeight2 > i2 && i3 < measuredWidth + i && i3 + measuredWidth2 > i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m148837e(l80<DATA>.C18164a c18164a) {
        WeakReference<View> weakReference = c18164a.f126769a;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && view.isAttachedToWindow() && view.getRootView() != null) {
            View view2 = this.f126768h;
            if (view2 == null) {
                return m148836d(view);
            }
            if (m148836d(view2) && m148836d(view)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void m148838g(View view) {
        m148842o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public void m148839h(View view, DATA data, int i) {
        if (view == null || data == null) {
            return;
        }
        C18165b c18165b = this.f126761a;
        C18165b c18165b2 = null;
        while (c18165b != null && c18165b2 == null) {
            TYPE type = c18165b.f126776b;
            if (((C18164a) type).f126769a == null || ((C18164a) type).f126769a.get() != view) {
                c18165b = c18165b.f126775a;
            } else {
                c18165b2 = c18165b;
            }
        }
        if (NullChecker.m81303a(c18165b2)) {
            if (m148835c(((C18164a) c18165b2.f126776b).f126773e, data)) {
                return;
            } else {
                ((C18164a) c18165b2.f126776b).f126769a = null;
            }
        }
        C18165b c18165b3 = this.f126761a;
        C18165b c18165b4 = null;
        while (c18165b3 != null && c18165b4 == null) {
            if (m148835c(((C18164a) c18165b3.f126776b).f126773e, data)) {
                c18165b4 = c18165b3;
            } else {
                c18165b3 = c18165b3.f126775a;
            }
        }
        if (c18165b4 == null) {
            l80<DATA>.C18165b<l80<DATA>.C18164a> c18165bM148841n = m148841n();
            c18165bM148841n.f126776b.f126769a = new WeakReference<>(view);
            l80<DATA>.C18164a c18164a = c18165bM148841n.f126776b;
            c18164a.f126771c = 0;
            c18164a.f126772d = i;
            c18164a.f126773e = data;
            c18164a.f126770b = 0L;
            m148844q(c18165bM148841n);
        } else {
            TYPE type2 = c18165b4.f126776b;
            if (((C18164a) type2).f126769a == null || ((C18164a) type2).f126769a.get() != view) {
                ((C18164a) c18165b4.f126776b).f126769a = new WeakReference<>(view);
            }
        }
        m148842o();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public void m148840i(View view) {
        m148842o();
    }

    /* JADX INFO: renamed from: n */
    public final l80<DATA>.C18165b<l80<DATA>.C18164a> m148841n() {
        l80<DATA>.C18165b<l80<DATA>.C18164a> c18165b = this.f126762b;
        if (c18165b == null) {
            return new C18165b<>(new C18164a());
        }
        this.f126762b = c18165b.f126775a;
        c18165b.f126775a = null;
        return c18165b;
    }

    /* JADX INFO: renamed from: o */
    public void m148842o() {
        if (this.f126765e) {
            return;
        }
        this.f126765e = true;
        if (this.f126764d == null) {
            this.f126764d = new Handler(Looper.getMainLooper());
        }
        this.f126764d.post(new RunnableC18166c(this));
    }

    /* JADX INFO: renamed from: p */
    public void m148843p(View view) {
        this.f126768h = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m148844q(l80<DATA>.C18165b<l80<DATA>.C18164a> c18165b) {
        C18165b c18165b2 = null;
        for (C18165b c18165b3 = this.f126761a; c18165b3 != null && ((C18164a) c18165b3.f126776b).f126772d < ((C18164a) c18165b.f126776b).f126772d; c18165b3 = c18165b3.f126775a) {
            c18165b2 = c18165b3;
        }
        if (c18165b2 == null) {
            c18165b.f126775a = this.f126761a;
            this.f126761a = c18165b;
        } else {
            c18165b.f126775a = c18165b2.f126775a;
            c18165b2.f126775a = c18165b;
        }
    }

    /* JADX INFO: renamed from: r */
    public final l80<DATA>.C18165b<l80<DATA>.C18164a> m148845r(l80<DATA>.C18165b<l80<DATA>.C18164a> c18165b) {
        l80<DATA>.C18164a c18164a = c18165b.f126776b;
        c18164a.f126771c = 0;
        c18164a.f126770b = 0L;
        c18164a.f126772d = -1;
        c18164a.f126769a = null;
        c18164a.f126773e = null;
        c18165b.f126775a = null;
        l80<DATA>.C18165b<l80<DATA>.C18164a> c18165b2 = this.f126762b;
        if (c18165b2 == 0) {
            this.f126762b = c18165b;
        } else {
            c18165b.f126775a = c18165b2;
            this.f126762b = c18165b;
        }
        return this.f126762b;
    }

    /* JADX INFO: renamed from: f */
    public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    /* JADX INFO: renamed from: j */
    public void mo55695j(DATA data, int i) {
    }

    /* JADX INFO: renamed from: k */
    public void mo63937k(DATA data, int i, View view) {
    }

    /* JADX INFO: renamed from: l */
    public void mo57958l(DATA data, int i, long j) {
    }

    /* JADX INFO: renamed from: m */
    public void mo55696m(DATA data, int i, long j, View view) {
    }
}
