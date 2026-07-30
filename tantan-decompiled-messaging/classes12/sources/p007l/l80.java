package p007l;

import android.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class l80<DATA> {

    /* JADX INFO: renamed from: a */
    public l80<DATA>.C2415b<l80<DATA>.C2414a> f9921a;

    /* JADX INFO: renamed from: b */
    public l80<DATA>.C2415b<l80<DATA>.C2414a> f9922b;

    /* JADX INFO: renamed from: d */
    public Handler f9924d;

    /* JADX INFO: renamed from: e */
    public boolean f9925e;

    /* JADX INFO: renamed from: f */
    public ViewGroup f9926f;

    /* JADX INFO: renamed from: h */
    public View f9928h;

    /* JADX INFO: renamed from: c */
    public ArrayList<DATA> f9923c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int[] f9927g = new int[2];

    /* JADX INFO: renamed from: l.l80$a */
    public class C2414a {

        /* JADX INFO: renamed from: a */
        public WeakReference<View> f9929a;

        /* JADX INFO: renamed from: b */
        public long f9930b;

        /* JADX INFO: renamed from: c */
        public int f9931c;

        /* JADX INFO: renamed from: d */
        public int f9932d;

        /* JADX INFO: renamed from: e */
        public DATA f9933e;

        public C2414a() {
        }
    }

    /* JADX INFO: renamed from: l.l80$b */
    public class C2415b<TYPE> {

        /* JADX INFO: renamed from: a */
        public l80<DATA>.C2415b<TYPE> f9935a;

        /* JADX INFO: renamed from: b */
        public TYPE f9936b;

        public C2415b(TYPE type) {
            this.f9936b = type;
        }
    }

    /* JADX INFO: renamed from: l.l80$c */
    public static class RunnableC2416c implements Runnable {

        /* JADX INFO: renamed from: a */
        public WeakReference<l80> f9938a;

        public RunnableC2416c(l80 l80Var) {
            this.f9938a = new WeakReference<>(l80Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            l80 l80Var = this.f9938a.get();
            if (NullChecker.a(l80Var)) {
                l80Var.m11589b();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m11589b() {
        l80 l80Var;
        this.f9925e = false;
        C2415b c2415b = this.f9921a;
        C2415b c2415b2 = null;
        while (c2415b != null) {
            C2415b c2415b3 = c2415b.f9935a;
            if (this.m11592e((C2414a) c2415b.f9936b)) {
                l80Var = this;
            } else {
                TYPE type = c2415b.f9936b;
                if (((C2414a) type).f9931c == 1) {
                    ((C2414a) type).f9931c = 2;
                    long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    TYPE type2 = c2415b.f9936b;
                    long j = jCurrentAnimationTimeMillis - ((C2414a) type2).f9930b;
                    this.mo2867l(((C2414a) type2).f9933e, ((C2414a) type2).f9932d, j);
                    TYPE type3 = c2415b.f9936b;
                    l80<DATA> l80Var2 = this;
                    l80Var2.mo4978m(((C2414a) type3).f9933e, ((C2414a) type3).f9932d, j, ((C2414a) type3).f9929a == null ? null : ((C2414a) type3).f9929a.get());
                    l80Var = l80Var2;
                } else {
                    l80Var = this;
                }
            }
            TYPE type4 = c2415b.f9936b;
            if (((C2414a) type4).f9929a == null || ((C2414a) type4).f9929a.get() == null) {
                if (c2415b2 == null) {
                    l80Var.f9921a = c2415b3;
                } else {
                    c2415b2.f9935a = c2415b3;
                }
                c2415b.f9935a = null;
                l80Var.m11600r(c2415b);
            } else {
                c2415b2 = c2415b;
            }
            c2415b = c2415b3;
            this = (l80<DATA>) l80Var;
        }
        l80<DATA> l80Var3 = this;
        for (C2415b c2415b4 = l80Var3.f9921a; c2415b4 != null; c2415b4 = c2415b4.f9935a) {
            if (l80Var3.m11592e((C2414a) c2415b4.f9936b)) {
                TYPE type5 = c2415b4.f9936b;
                if (((C2414a) type5).f9930b <= 0) {
                    ((C2414a) type5).f9930b = AnimationUtils.currentAnimationTimeMillis();
                }
                TYPE type6 = c2415b4.f9936b;
                if (((C2414a) type6).f9931c != 1) {
                    ((C2414a) type6).f9931c = 1;
                    l80Var3.mo2866j(((C2414a) type6).f9933e, ((C2414a) type6).f9932d);
                    TYPE type7 = c2415b4.f9936b;
                    l80Var3.mo4975k(((C2414a) type7).f9933e, ((C2414a) type7).f9932d, ((C2414a) type7).f9929a == null ? null : ((C2414a) type7).f9929a.get());
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m11590c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj == obj2 || obj.equals(obj2);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m11591d(View view) {
        if (this.f9926f == null) {
            ViewGroup viewGroup = (ViewGroup) view.getRootView().findViewById(R.id.content);
            this.f9926f = viewGroup;
            if (viewGroup != null) {
                mo2865f(this.f9926f, (ViewGroup) view.getParent());
            }
        }
        ViewGroup viewGroup2 = this.f9926f;
        if (viewGroup2 == null) {
            return false;
        }
        viewGroup2.getLocationInWindow(this.f9927g);
        int measuredWidth = this.f9926f.getMeasuredWidth();
        int measuredHeight = this.f9926f.getMeasuredHeight();
        int[] iArr = this.f9927g;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int measuredWidth2 = view.getMeasuredWidth();
        int measuredHeight2 = view.getMeasuredHeight();
        int[] iArr2 = this.f9927g;
        int i3 = iArr2[0];
        int i4 = iArr2[1];
        return i4 < measuredHeight + i2 && i4 + measuredHeight2 > i2 && i3 < measuredWidth + i && i3 + measuredWidth2 > i;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11592e(l80<DATA>.C2414a c2414a) {
        WeakReference<View> weakReference = c2414a.f9929a;
        View view = weakReference != null ? weakReference.get() : null;
        if (view != null && view.isAttachedToWindow() && view.getRootView() != null) {
            View view2 = this.f9928h;
            if (view2 == null) {
                return m11591d(view);
            }
            if (m11591d(view2) && m11591d(view)) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public void m11593g(View view) {
        m11597o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public void m11594h(View view, DATA data, int i) {
        if (view == null || data == null) {
            return;
        }
        C2415b c2415b = this.f9921a;
        C2415b c2415b2 = null;
        while (c2415b != null && c2415b2 == null) {
            TYPE type = c2415b.f9936b;
            if (((C2414a) type).f9929a == null || ((C2414a) type).f9929a.get() != view) {
                c2415b = c2415b.f9935a;
            } else {
                c2415b2 = c2415b;
            }
        }
        if (NullChecker.a(c2415b2)) {
            if (m11590c(((C2414a) c2415b2.f9936b).f9933e, data)) {
                return;
            } else {
                ((C2414a) c2415b2.f9936b).f9929a = null;
            }
        }
        C2415b c2415b3 = this.f9921a;
        C2415b c2415b4 = null;
        while (c2415b3 != null && c2415b4 == null) {
            if (m11590c(((C2414a) c2415b3.f9936b).f9933e, data)) {
                c2415b4 = c2415b3;
            } else {
                c2415b3 = c2415b3.f9935a;
            }
        }
        if (c2415b4 == null) {
            l80<DATA>.C2415b<l80<DATA>.C2414a> c2415bM11596n = m11596n();
            c2415bM11596n.f9936b.f9929a = new WeakReference<>(view);
            l80<DATA>.C2414a c2414a = c2415bM11596n.f9936b;
            c2414a.f9931c = 0;
            c2414a.f9932d = i;
            c2414a.f9933e = data;
            c2414a.f9930b = 0L;
            m11599q(c2415bM11596n);
        } else {
            TYPE type2 = c2415b4.f9936b;
            if (((C2414a) type2).f9929a == null || ((C2414a) type2).f9929a.get() != view) {
                ((C2414a) c2415b4.f9936b).f9929a = new WeakReference<>(view);
            }
        }
        m11597o();
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public void m11595i(View view) {
        m11597o();
    }

    /* JADX INFO: renamed from: n */
    public final l80<DATA>.C2415b<l80<DATA>.C2414a> m11596n() {
        l80<DATA>.C2415b<l80<DATA>.C2414a> c2415b = this.f9922b;
        if (c2415b == null) {
            return new C2415b<>(new C2414a());
        }
        this.f9922b = c2415b.f9935a;
        c2415b.f9935a = null;
        return c2415b;
    }

    /* JADX INFO: renamed from: o */
    public void m11597o() {
        if (this.f9925e) {
            return;
        }
        this.f9925e = true;
        if (this.f9924d == null) {
            this.f9924d = new Handler(Looper.getMainLooper());
        }
        this.f9924d.post(new RunnableC2416c(this));
    }

    /* JADX INFO: renamed from: p */
    public void m11598p(View view) {
        this.f9928h = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public final void m11599q(l80<DATA>.C2415b<l80<DATA>.C2414a> c2415b) {
        C2415b c2415b2 = null;
        for (C2415b c2415b3 = this.f9921a; c2415b3 != null && ((C2414a) c2415b3.f9936b).f9932d < ((C2414a) c2415b.f9936b).f9932d; c2415b3 = c2415b3.f9935a) {
            c2415b2 = c2415b3;
        }
        if (c2415b2 == null) {
            c2415b.f9935a = this.f9921a;
            this.f9921a = c2415b;
        } else {
            c2415b.f9935a = c2415b2.f9935a;
            c2415b2.f9935a = c2415b;
        }
    }

    /* JADX INFO: renamed from: r */
    public final l80<DATA>.C2415b<l80<DATA>.C2414a> m11600r(l80<DATA>.C2415b<l80<DATA>.C2414a> c2415b) {
        l80<DATA>.C2414a c2414a = c2415b.f9936b;
        c2414a.f9931c = 0;
        c2414a.f9930b = 0L;
        c2414a.f9932d = -1;
        c2414a.f9929a = null;
        c2414a.f9933e = null;
        c2415b.f9935a = null;
        l80<DATA>.C2415b<l80<DATA>.C2414a> c2415b2 = this.f9922b;
        if (c2415b2 == 0) {
            this.f9922b = c2415b;
        } else {
            c2415b.f9935a = c2415b2;
            this.f9922b = c2415b;
        }
        return this.f9922b;
    }

    /* JADX INFO: renamed from: f */
    public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
    }

    /* JADX INFO: renamed from: j */
    public void mo2866j(DATA data, int i) {
    }

    /* JADX INFO: renamed from: k */
    public void mo4975k(DATA data, int i, View view) {
    }

    /* JADX INFO: renamed from: l */
    public void mo2867l(DATA data, int i, long j) {
    }

    /* JADX INFO: renamed from: m */
    public void mo4978m(DATA data, int i, long j, View view) {
    }
}
