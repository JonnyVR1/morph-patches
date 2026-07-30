package p149l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes4.dex */
public class v000 extends coi0<xr2> implements w1m, swl {

    /* JADX INFO: renamed from: b */
    public o000 f179048b;

    /* JADX INFO: renamed from: c */
    public boolean f179049c = false;

    /* JADX INFO: renamed from: d */
    public int f179050d = 0;

    /* JADX INFO: renamed from: e */
    public C22393b<View> f179051e = C22393b.m221521b();

    /* JADX INFO: renamed from: f */
    public View f179052f = null;

    /* JADX INFO: renamed from: g */
    public List<C20551a> f179053g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<C20551a> f179054h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public SparseArray<C20551a> f179055i = new SparseArray<>();

    /* JADX INFO: renamed from: l.v000$a */
    public class C20551a {

        /* JADX INFO: renamed from: a */
        public int f179056a;

        /* JADX INFO: renamed from: b */
        public View f179057b;

        /* JADX INFO: renamed from: c */
        public Message f179058c;

        public C20551a(int i, View view) {
            this.f179056a = i;
            this.f179057b = view;
            Message messageNew_ = Message.new_();
            this.f179058c = messageNew_;
            messageNew_._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    /* JADX INFO: renamed from: l.v000$b */
    public class C20552b extends xr2 {
        public C20552b(View view) {
            super(view);
        }
    }

    public v000(o000 o000Var) {
        this.f179048b = o000Var;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22306c m196459B(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: C */
    public int m196460C() {
        if (m196464G() || this.f179049c) {
            return this.f179054h.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public int m196461D() {
        if (m196464G() || this.f179049c) {
            return this.f179053g.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final Message m196462E(int i) {
        if (i < m196461D() || i >= m196461D() + this.f179048b.mo139112d()) {
            return null;
        }
        return this.f179048b.mo139119m(i - m196461D());
    }

    /* JADX INFO: renamed from: F */
    public int m196463F() {
        o000 o000Var = this.f179048b;
        if (o000Var == null) {
            return 0;
        }
        return o000Var.mo139112d();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m196464G() {
        if (NullChecker.m81303a(this.f179048b)) {
            return this.f179048b.m190861f();
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public void m196465H(int i) {
        if (i < m196461D() || i >= m196461D() + m196463F()) {
            return;
        }
        this.f179048b.mo139114e(i - m196461D());
    }

    /* JADX INFO: renamed from: I */
    public final void m196466I(View view, List<C20551a> list) {
        if (view == null) {
            return;
        }
        if (!vwb.m200296J(list)) {
            Iterator<C20551a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f179057b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f179055i.size();
        for (int i = 0; i < size; i++) {
            C20551a c20551aValueAt = this.f179055i.valueAt(i);
            if (c20551aValueAt != null && c20551aValueAt.f179057b == view) {
                this.f179055i.removeAt(i);
                return;
            }
        }
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: a */
    public void mo108010a(xr2 xr2Var, int i, int i2) {
        View view = xr2Var.f194078a;
        this.f179052f = view;
        if (i2 >= 11000 || i2 >= 10000) {
            return;
        }
        o000 o000Var = this.f179048b;
        o000Var.mo139108a(view, o000Var.mo139119m(i - m196461D()), i2, i - m196461D());
        m196465H(i);
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: b */
    public xr2 mo108011b(int i, ViewGroup viewGroup, int i2) {
        return new C20552b((i2 >= 11000 || i2 >= 10000) ? this.f179055i.get(i2).f179057b : this.f179048b.mo139122w(viewGroup, i2));
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: c */
    public <V> C22306c<V> mo67374c(mcr mcrVar, C22306c<V> c22306c) {
        return mo67378g(mcrVar, c22306c, true);
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: d */
    public String mo108012d(int i) {
        if (!NullChecker.m81303a(this.f179048b)) {
            return "invalid";
        }
        if (i < m196461D()) {
            return this.f179053g.get(i).f179058c._id + "";
        }
        if (i >= m196461D() + this.f179048b.mo139112d()) {
            return this.f179054h.get((i - m196461D()) - this.f179048b.mo139112d()).f179058c._id + "";
        }
        Message messageM196462E = m196462E(i);
        if (messageM196462E == null) {
            return "invalid";
        }
        return messageM196462E._id + "";
    }

    @Override // p149l.dml
    /* JADX INFO: renamed from: g */
    public <V> C22306c<V> mo67378g(mcr mcrVar, final C22306c<V> c22306c, boolean z) {
        final View view = this.f179052f;
        return mkd0.m154952D(new v9j() { // from class: l.u000
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return v000.m196459B(c22306c);
            }
        }, mcrVar.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f179051e.filter(new w9j() { // from class: l.t000
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: i */
    public void mo147982i(List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C20551a c20551a = new C20551a(this.f179050d + 11000, it.next());
            this.f179054h.add(c20551a);
            this.f179055i.put(c20551a.f179056a, c20551a);
            this.f179050d++;
        }
        m108015s();
    }

    @Override // p149l.w1m
    /* JADX INFO: renamed from: j */
    public void mo147983j(View view) {
        m196466I(view, this.f179053g);
        m108015s();
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: m */
    public int mo108013m() {
        return m196460C() + m196461D() + this.f179048b.mo139112d();
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: n */
    public void mo147985n() {
        m108015s();
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: p */
    public int mo108014p(int i) {
        if (i < m196461D()) {
            return this.f179053g.get(i).f179056a;
        }
        return i >= m196461D() + m196463F() ? this.f179054h.get((i - m196461D()) - m196463F()).f179056a : this.f179048b.mo139120p(i - m196461D());
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: r */
    public void mo147986r() {
        this.f179049c = true;
    }

    @Override // p149l.w1m
    /* JADX INFO: renamed from: t */
    public void mo147987t(View view) {
        C20551a c20551a = new C20551a(this.f179050d + 10000, view);
        this.f179053g.add(c20551a);
        this.f179055i.put(c20551a.f179056a, c20551a);
        this.f179050d++;
        m108015s();
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: u */
    public void mo147988u() {
        m108015s();
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: w */
    public void mo108016w(xr2 xr2Var) {
        View view = xr2Var.f194078a;
        if (view != null) {
            this.f179051e.onNext(view);
        }
        super.mo108016w(xr2Var);
    }

    @Override // p149l.swl
    /* JADX INFO: renamed from: x */
    public void mo147989x(List<View> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C20551a c20551a = new C20551a(this.f179050d + 10000, it.next());
            this.f179053g.add(c20551a);
            this.f179055i.put(c20551a.f179056a, c20551a);
            this.f179050d++;
        }
        m108015s();
    }

    @Override // p149l.coi0
    /* JADX INFO: renamed from: z */
    public boolean mo108018z() {
        return true;
    }
}
