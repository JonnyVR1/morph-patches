package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1055c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p149l.h01;
import p149l.i600;
import p149l.kxq;
import p149l.l2e;
import p149l.p2e;
import p149l.p7j0;
import p149l.px50;
import p149l.qtc0;
import p149l.rvc0;
import p149l.rze;
import p149l.xoj0;
import p149l.zvc0;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.f */
/* JADX INFO: loaded from: classes.dex */
final class C1069f<Transcode> {

    /* JADX INFO: renamed from: a */
    private final List<i600.C17490a<?>> f4446a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<kxq> f4447b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private C1055c f4448c;

    /* JADX INFO: renamed from: d */
    private Object f4449d;

    /* JADX INFO: renamed from: e */
    private int f4450e;

    /* JADX INFO: renamed from: f */
    private int f4451f;

    /* JADX INFO: renamed from: g */
    private Class<?> f4452g;

    /* JADX INFO: renamed from: h */
    private DecodeJob.InterfaceC1061e f4453h;

    /* JADX INFO: renamed from: i */
    private px50 f4454i;

    /* JADX INFO: renamed from: j */
    private Map<Class<?>, p7j0<?>> f4455j;

    /* JADX INFO: renamed from: k */
    private Class<Transcode> f4456k;

    /* JADX INFO: renamed from: l */
    private boolean f4457l;

    /* JADX INFO: renamed from: m */
    private boolean f4458m;

    /* JADX INFO: renamed from: n */
    private kxq f4459n;

    /* JADX INFO: renamed from: o */
    private Priority f4460o;

    /* JADX INFO: renamed from: p */
    private p2e f4461p;

    /* JADX INFO: renamed from: q */
    private boolean f4462q;

    /* JADX INFO: renamed from: r */
    private boolean f4463r;

    /* JADX INFO: renamed from: a */
    public void m5410a() {
        this.f4448c = null;
        this.f4449d = null;
        this.f4459n = null;
        this.f4452g = null;
        this.f4456k = null;
        this.f4454i = null;
        this.f4460o = null;
        this.f4455j = null;
        this.f4461p = null;
        this.f4446a.clear();
        this.f4457l = false;
        this.f4447b.clear();
        this.f4458m = false;
    }

    /* JADX INFO: renamed from: b */
    public h01 m5411b() {
        return this.f4448c.m5334b();
    }

    /* JADX INFO: renamed from: c */
    public List<kxq> m5412c() {
        if (!this.f4458m) {
            this.f4458m = true;
            this.f4447b.clear();
            List<i600.C17490a<?>> listM5416g = m5416g();
            int size = listM5416g.size();
            for (int i = 0; i < size; i++) {
                i600.C17490a<?> c17490a = listM5416g.get(i);
                if (!this.f4447b.contains(c17490a.f111665a)) {
                    this.f4447b.add(c17490a.f111665a);
                }
                for (int i2 = 0; i2 < c17490a.f111666b.size(); i2++) {
                    if (!this.f4447b.contains(c17490a.f111666b.get(i2))) {
                        this.f4447b.add(c17490a.f111666b.get(i2));
                    }
                }
            }
        }
        return this.f4447b;
    }

    /* JADX INFO: renamed from: d */
    public l2e m5413d() {
        return this.f4453h.mo5391a();
    }

    /* JADX INFO: renamed from: e */
    public p2e m5414e() {
        return this.f4461p;
    }

    /* JADX INFO: renamed from: f */
    public int m5415f() {
        return this.f4451f;
    }

    /* JADX INFO: renamed from: g */
    public List<i600.C17490a<?>> m5416g() {
        if (!this.f4457l) {
            this.f4457l = true;
            this.f4446a.clear();
            List listM5298i = this.f4448c.m5340h().m5298i(this.f4449d);
            int size = listM5298i.size();
            for (int i = 0; i < size; i++) {
                i600.C17490a<?> c17490aMo103352a = ((i600) listM5298i.get(i)).mo103352a(this.f4449d, this.f4450e, this.f4451f, this.f4454i);
                if (c17490aMo103352a != null) {
                    this.f4446a.add(c17490aMo103352a);
                }
            }
        }
        return this.f4446a;
    }

    /* JADX INFO: renamed from: h */
    public <Data> C1078o<Data, ?, Transcode> m5417h(Class<Data> cls) {
        return this.f4448c.m5340h().m5297h(cls, this.f4452g, this.f4456k);
    }

    /* JADX INFO: renamed from: i */
    public Class<?> m5418i() {
        return this.f4449d.getClass();
    }

    /* JADX INFO: renamed from: j */
    public List<i600<File, ?>> m5419j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f4448c.m5340h().m5298i(file);
    }

    /* JADX INFO: renamed from: k */
    public px50 m5420k() {
        return this.f4454i;
    }

    /* JADX INFO: renamed from: l */
    public Priority m5421l() {
        return this.f4460o;
    }

    /* JADX INFO: renamed from: m */
    public List<Class<?>> m5422m() {
        return this.f4448c.m5340h().m5299j(this.f4449d.getClass(), this.f4452g, this.f4456k);
    }

    /* JADX INFO: renamed from: n */
    public <Z> zvc0<Z> m5423n(rvc0<Z> rvc0Var) {
        return this.f4448c.m5340h().m5300k(rvc0Var);
    }

    /* JADX INFO: renamed from: o */
    public kxq m5424o() {
        return this.f4459n;
    }

    /* JADX INFO: renamed from: p */
    public <X> rze<X> m5425p(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f4448c.m5340h().m5302m(x);
    }

    /* JADX INFO: renamed from: q */
    public Class<?> m5426q() {
        return this.f4456k;
    }

    /* JADX INFO: renamed from: r */
    public <Z> p7j0<Z> m5427r(Class<Z> cls) {
        p7j0<Z> p7j0Var = (p7j0) this.f4455j.get(cls);
        if (p7j0Var == null) {
            for (Map.Entry<Class<?>, p7j0<?>> entry : this.f4455j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    p7j0Var = (p7j0) entry.getValue();
                    break;
                }
            }
        }
        if (p7j0Var != null) {
            return p7j0Var;
        }
        if (!this.f4455j.isEmpty() || !this.f4462q) {
            return xoj0.m210432c();
        }
        qtc0.m176411a("Missing transformation for ", cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX INFO: renamed from: s */
    public int m5428s() {
        return this.f4450e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public boolean m5429t(Class<?> cls) {
        return m5417h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public <R> void m5430u(C1055c c1055c, Object obj, kxq kxqVar, int i, int i2, p2e p2eVar, Class<?> cls, Class<R> cls2, Priority priority, px50 px50Var, Map<Class<?>, p7j0<?>> map, boolean z, boolean z2, DecodeJob.InterfaceC1061e interfaceC1061e) {
        this.f4448c = c1055c;
        this.f4449d = obj;
        this.f4459n = kxqVar;
        this.f4450e = i;
        this.f4451f = i2;
        this.f4461p = p2eVar;
        this.f4452g = cls;
        this.f4453h = interfaceC1061e;
        this.f4456k = cls2;
        this.f4460o = priority;
        this.f4454i = px50Var;
        this.f4455j = map;
        this.f4462q = z;
        this.f4463r = z2;
    }

    /* JADX INFO: renamed from: v */
    public boolean m5431v(rvc0<?> rvc0Var) {
        return this.f4448c.m5340h().m5303n(rvc0Var);
    }

    /* JADX INFO: renamed from: w */
    public boolean m5432w() {
        return this.f4463r;
    }

    /* JADX INFO: renamed from: x */
    public boolean m5433x(kxq kxqVar) {
        List<i600.C17490a<?>> listM5416g = m5416g();
        int size = listM5416g.size();
        for (int i = 0; i < size; i++) {
            if (listM5416g.get(i).f111665a.equals(kxqVar)) {
                return true;
            }
        }
        return false;
    }
}
