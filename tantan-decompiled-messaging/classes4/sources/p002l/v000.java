package p002l;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.data.Message;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.mcr;
import l.mkd0;
import l.v9j;
import l.vwb;
import l.w9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class v000 extends coi0<xr2> implements w1m, swl {

    /* JADX INFO: renamed from: b */
    public o000 f20905b;

    /* JADX INFO: renamed from: c */
    public boolean f20906c = false;

    /* JADX INFO: renamed from: d */
    public int f20907d = 0;

    /* JADX INFO: renamed from: e */
    public b<View> f20908e = b.b();

    /* JADX INFO: renamed from: f */
    public View f20909f = null;

    /* JADX INFO: renamed from: g */
    public List<C0858a> f20910g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public List<C0858a> f20911h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public SparseArray<C0858a> f20912i = new SparseArray<>();

    /* JADX INFO: renamed from: l.v000$a */
    public class C0858a {

        /* JADX INFO: renamed from: a */
        public int f20913a;

        /* JADX INFO: renamed from: b */
        public View f20914b;

        /* JADX INFO: renamed from: c */
        public Message f20915c;

        public C0858a(int i, View view) {
            this.f20913a = i;
            this.f20914b = view;
            Message messageNew_ = Message.new_();
            this.f20915c = messageNew_;
            ((DbObject) messageNew_)._id = i > 0 ? -i : i;
            messageNew_.createdTime = -1.0d;
        }
    }

    /* JADX INFO: renamed from: l.v000$b */
    public class C0859b extends xr2 {
        public C0859b(View view) {
            super(view);
        }
    }

    public v000(o000 o000Var) {
        this.f20905b = o000Var;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ c m23699B(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: C */
    public int m23700C() {
        if (m23704G() || this.f20906c) {
            return this.f20911h.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: D */
    public int m23701D() {
        if (m23704G() || this.f20906c) {
            return this.f20910g.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public final Message m23702E(int i) {
        if (i < m23701D() || i >= m23701D() + this.f20905b.m19174d()) {
            return null;
        }
        return this.f20905b.m19176m(i - m23701D());
    }

    /* JADX INFO: renamed from: F */
    public int m23703F() {
        o000 o000Var = this.f20905b;
        if (o000Var == null) {
            return 0;
        }
        return o000Var.m19174d();
    }

    /* JADX INFO: renamed from: G */
    public final boolean m23704G() {
        if (NullChecker.a(this.f20905b)) {
            return this.f20905b.m23229f();
        }
        return false;
    }

    /* JADX INFO: renamed from: H */
    public void m23705H(int i) {
        if (i < m23701D() || i >= m23701D() + m23703F()) {
            return;
        }
        this.f20905b.m23228e(i - m23701D());
    }

    /* JADX INFO: renamed from: I */
    public final void m23706I(View view, List<C0858a> list) {
        if (view == null) {
            return;
        }
        if (!vwb.J(list)) {
            Iterator<C0858a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f20914b == view) {
                    it.remove();
                    break;
                }
            }
        }
        int size = this.f20912i.size();
        for (int i = 0; i < size; i++) {
            C0858a c0858aValueAt = this.f20912i.valueAt(i);
            if (c0858aValueAt != null && c0858aValueAt.f20914b == view) {
                this.f20912i.removeAt(i);
                return;
            }
        }
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: a */
    public void mo11199a(xr2 xr2Var, int i, int i2) {
        View view = xr2Var.f22421a;
        this.f20909f = view;
        if (i2 >= 11000 || i2 >= 10000) {
            return;
        }
        o000 o000Var = this.f20905b;
        o000Var.m19171a(view, o000Var.m19176m(i - m23701D()), i2, i - m23701D());
        m23705H(i);
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: b */
    public xr2 mo11200b(int i, ViewGroup viewGroup, int i2) {
        return new C0859b((i2 >= 11000 || i2 >= 10000) ? this.f20912i.get(i2).f20914b : this.f20905b.m19180w(viewGroup, i2));
    }

    /* JADX INFO: renamed from: c */
    public <V> c<V> m23707c(mcr mcrVar, c<V> cVar) {
        return m23708g(mcrVar, cVar, true);
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: d */
    public String mo11201d(int i) {
        if (!NullChecker.a(this.f20905b)) {
            return "invalid";
        }
        if (i < m23701D()) {
            return ((DbObject) this.f20910g.get(i).f20915c)._id + "";
        }
        if (i >= m23701D() + this.f20905b.m19174d()) {
            return ((DbObject) this.f20911h.get((i - m23701D()) - this.f20905b.m19174d()).f20915c)._id + "";
        }
        Message messageM23702E = m23702E(i);
        if (messageM23702E == null) {
            return "invalid";
        }
        return ((DbObject) messageM23702E)._id + "";
    }

    /* JADX INFO: renamed from: g */
    public <V> c<V> m23708g(mcr mcrVar, final c<V> cVar, boolean z) {
        final View view = this.f20909f;
        return mkd0.D(new v9j() { // from class: l.u000
            public final Object call() {
                return v000.m23699B(cVar);
            }
        }, mcrVar.lifecycle().compose(mkd0.E()).takeUntil(this.f20908e.filter(new w9j() { // from class: l.t000
            public final Object call(Object obj) {
                return Boolean.valueOf(((View) obj) == view);
            }
        })), z);
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: i */
    public void mo16916i(List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C0858a c0858a = new C0858a(this.f20907d + 11000, it.next());
            this.f20911h.add(c0858a);
            this.f20912i.put(c0858a.f20913a, c0858a);
            this.f20907d++;
        }
        m11204s();
    }

    @Override // p002l.w1m
    /* JADX INFO: renamed from: j */
    public void mo16917j(View view) {
        m23706I(view, this.f20910g);
        m11204s();
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: m */
    public int mo11202m() {
        return m23700C() + m23701D() + this.f20905b.m19174d();
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: n */
    public void mo16919n() {
        m11204s();
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: p */
    public int mo11203p(int i) {
        if (i < m23701D()) {
            return this.f20910g.get(i).f20913a;
        }
        return i >= m23701D() + m23703F() ? this.f20911h.get((i - m23701D()) - m23703F()).f20913a : this.f20905b.m19177p(i - m23701D());
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: r */
    public void mo16920r() {
        this.f20906c = true;
    }

    @Override // p002l.w1m
    /* JADX INFO: renamed from: t */
    public void mo16921t(View view) {
        C0858a c0858a = new C0858a(this.f20907d + 10000, view);
        this.f20910g.add(c0858a);
        this.f20912i.put(c0858a.f20913a, c0858a);
        this.f20907d++;
        m11204s();
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: u */
    public void mo16922u() {
        m11204s();
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: w */
    public void mo11205w(xr2 xr2Var) {
        View view = xr2Var.f22421a;
        if (view != null) {
            this.f20908e.onNext(view);
        }
        super.mo11205w(xr2Var);
    }

    @Override // p002l.swl
    /* JADX INFO: renamed from: x */
    public void mo16923x(List<View> list) {
        if (vwb.J(list)) {
            return;
        }
        Iterator<View> it = list.iterator();
        while (it.hasNext()) {
            C0858a c0858a = new C0858a(this.f20907d + 10000, it.next());
            this.f20910g.add(c0858a);
            this.f20912i.put(c0858a.f20913a, c0858a);
            this.f20907d++;
        }
        m11204s();
    }

    @Override // p002l.coi0
    /* JADX INFO: renamed from: z */
    public boolean mo11207z() {
        return true;
    }
}
