package p153l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Message;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class s900 extends dxi0<ns2> implements p4m, kzl {

    /* JADX INFO: renamed from: b */
    public l900 f166876b;

    /* JADX INFO: renamed from: c */
    public boolean f166877c = false;

    /* JADX INFO: renamed from: d */
    public int f166878d = 0;

    /* JADX INFO: renamed from: e */
    public C22508b<View> f166879e = C22508b.m222767b();

    /* JADX INFO: renamed from: f */
    public View f166880f = null;

    /* JADX INFO: renamed from: g */
    public List<C20009a> f166881g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<C20009a> f166882h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public SparseArray<C20009a> f166883i = new SparseArray<>();

    /* JADX INFO: renamed from: l.s900$a */
    public class C20009a {

        /* JADX INFO: renamed from: a */
        public int f166884a;

        /* JADX INFO: renamed from: b */
        public View f166885b;

        /* JADX INFO: renamed from: c */
        public Message f166886c;

        public C20009a(int i, View view) {
            this.f166884a = i;
            this.f166885b = view;
            Message messageNew_ = Message.new_();
            this.f166886c = messageNew_;
            messageNew_._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    /* JADX INFO: renamed from: l.s900$b */
    public class C20010b extends ns2 {
        public C20010b(View view) {
            super(view);
        }
    }

    public s900(l900 l900Var) {
        this.f166876b = l900Var;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ C22421c m185118B(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: C */
    public int m185119C() {
        if (m185123G() || this.f166877c) {
            return this.f166882h.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public int m185120D() {
        if (m185123G() || this.f166877c) {
            return this.f166881g.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final Message m185121E(int i) {
        if (i < m185120D() || i >= m185120D() + this.f166876b.mo129499d()) {
            return null;
        }
        return this.f166876b.mo129506m(i - m185120D());
    }

    /* JADX INFO: renamed from: F */
    public int m185122F() {
        l900 l900Var = this.f166876b;
        if (l900Var == null) {
            return 0;
        }
        return l900Var.mo129499d();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m185123G() {
        if (NullChecker.m82486a(this.f166876b)) {
            return this.f166876b.m156442f();
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public void m185124H(int i) {
        if (i < m185120D() || i >= m185120D() + m185122F()) {
            return;
        }
        this.f166876b.mo129501e(i - m185120D());
    }

    /* JADX INFO: renamed from: I */
    public final void m185125I(View view, List<C20009a> list) {
        if (view == null) {
            return;
        }
        if (!jyb.m147479J(list)) {
            Iterator<C20009a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f166885b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f166883i.size();
        for (int i = 0; i < size; i++) {
            C20009a c20009aValueAt = this.f166883i.valueAt(i);
            if (c20009aValueAt != null && c20009aValueAt.f166885b == view) {
                this.f166883i.removeAt(i);
                return;
            }
        }
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: a */
    public void mo118494a(ns2 ns2Var, int i, int i2) {
        View view = ns2Var.f143454a;
        this.f166880f = view;
        if (i2 >= 11000 || i2 >= 10000) {
            return;
        }
        l900 l900Var = this.f166876b;
        l900Var.mo129495a(view, l900Var.mo129506m(i - m185120D()), i2, i - m185120D());
        m185124H(i);
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: b */
    public ns2 mo118495b(int i, ViewGroup viewGroup, int i2) {
        return new C20010b((i2 >= 11000 || i2 >= 10000) ? this.f166883i.get(i2).f166885b : this.f166876b.mo129509w(viewGroup, i2));
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: c */
    public <V> C22421c<V> mo68557c(ner nerVar, C22421c<V> c22421c) {
        return mo68561g(nerVar, c22421c, true);
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: d */
    public String mo118496d(int i) {
        if (!NullChecker.m82486a(this.f166876b)) {
            return "invalid";
        }
        if (i < m185120D()) {
            return this.f166881g.get(i).f166886c._id + "";
        }
        if (i >= m185120D() + this.f166876b.mo129499d()) {
            return this.f166882h.get((i - m185120D()) - this.f166876b.mo129499d()).f166886c._id + "";
        }
        Message messageM185121E = m185121E(i);
        if (messageM185121E == null) {
            return "invalid";
        }
        return messageM185121E._id + "";
    }

    @Override // p153l.pol
    /* JADX INFO: renamed from: g */
    public <V> C22421c<V> mo68561g(ner nerVar, final C22421c<V> c22421c, boolean z) {
        final View view = this.f166880f;
        return psd0.m173593D(new pcj() { // from class: l.r900
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return s900.m185118B(c22421c);
            }
        }, nerVar.lifecycle().compose(psd0.m173594E()).takeUntil(this.f166879e.filter(new qcj() { // from class: l.q900
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: i */
    public void mo139055i(List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C20009a c20009a = new C20009a(this.f166878d + 11000, it.next());
            this.f166882h.add(c20009a);
            this.f166883i.put(c20009a.f166884a, c20009a);
            this.f166878d++;
        }
        m118499s();
    }

    @Override // p153l.p4m
    /* JADX INFO: renamed from: j */
    public void mo139056j(View view) {
        m185125I(view, this.f166881g);
        m118499s();
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: m */
    public int mo118497m() {
        return m185119C() + m185120D() + this.f166876b.mo129499d();
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: n */
    public void mo139058n() {
        m118499s();
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: p */
    public int mo118498p(int i) {
        if (i < m185120D()) {
            return this.f166881g.get(i).f166884a;
        }
        return i >= m185120D() + m185122F() ? this.f166882h.get((i - m185120D()) - m185122F()).f166884a : this.f166876b.mo129507p(i - m185120D());
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: r */
    public void mo139059r() {
        this.f166877c = true;
    }

    @Override // p153l.p4m
    /* JADX INFO: renamed from: t */
    public void mo139060t(View view) {
        C20009a c20009a = new C20009a(this.f166878d + 10000, view);
        this.f166881g.add(c20009a);
        this.f166883i.put(c20009a.f166884a, c20009a);
        this.f166878d++;
        m118499s();
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: u */
    public void mo139061u() {
        m118499s();
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: w */
    public void mo118500w(ns2 ns2Var) {
        View view = ns2Var.f143454a;
        if (view != null) {
            this.f166879e.onNext(view);
        }
        super.mo118500w(ns2Var);
    }

    @Override // p153l.kzl
    /* JADX INFO: renamed from: x */
    public void mo139062x(List<View> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C20009a c20009a = new C20009a(this.f166878d + 10000, it.next());
            this.f166881g.add(c20009a);
            this.f166883i.put(c20009a.f166884a, c20009a);
            this.f166878d++;
        }
        m118499s();
    }

    @Override // p153l.dxi0
    /* JADX INFO: renamed from: z */
    public boolean mo118502z() {
        return true;
    }
}
