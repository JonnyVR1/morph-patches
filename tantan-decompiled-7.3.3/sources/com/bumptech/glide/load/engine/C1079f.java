package com.bumptech.glide.load.engine;

import com.bumptech.glide.C1059c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.data.InterfaceC1064a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p153l.ayj0;
import p153l.c4d0;
import p153l.d4e;
import p153l.kzq;
import p153l.o01;
import p153l.re00;
import p153l.tgj0;
import p153l.u3d0;
import p153l.u560;
import p153l.v0f;
import p153l.v1d0;
import p153l.z3e;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.f */
/* JADX INFO: loaded from: classes.dex */
final class C1079f<Transcode> {

    /* JADX INFO: renamed from: a */
    private final List<re00.C19812a<?>> f4457a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final List<kzq> f4458b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private C1059c f4459c;

    /* JADX INFO: renamed from: d */
    private Object f4460d;

    /* JADX INFO: renamed from: e */
    private int f4461e;

    /* JADX INFO: renamed from: f */
    private int f4462f;

    /* JADX INFO: renamed from: g */
    private Class<?> f4463g;

    /* JADX INFO: renamed from: h */
    private DecodeJob.InterfaceC1071e f4464h;

    /* JADX INFO: renamed from: i */
    private u560 f4465i;

    /* JADX INFO: renamed from: j */
    private Map<Class<?>, tgj0<?>> f4466j;

    /* JADX INFO: renamed from: k */
    private Class<Transcode> f4467k;

    /* JADX INFO: renamed from: l */
    private boolean f4468l;

    /* JADX INFO: renamed from: m */
    private boolean f4469m;

    /* JADX INFO: renamed from: n */
    private kzq f4470n;

    /* JADX INFO: renamed from: o */
    private Priority f4471o;

    /* JADX INFO: renamed from: p */
    private d4e f4472p;

    /* JADX INFO: renamed from: q */
    private boolean f4473q;

    /* JADX INFO: renamed from: r */
    private boolean f4474r;

    /* JADX INFO: renamed from: a */
    public void m5435a() {
        this.f4459c = null;
        this.f4460d = null;
        this.f4470n = null;
        this.f4463g = null;
        this.f4467k = null;
        this.f4465i = null;
        this.f4471o = null;
        this.f4466j = null;
        this.f4472p = null;
        this.f4457a.clear();
        this.f4468l = false;
        this.f4458b.clear();
        this.f4469m = false;
    }

    /* JADX INFO: renamed from: b */
    public o01 m5436b() {
        return this.f4459c.m5343b();
    }

    /* JADX INFO: renamed from: c */
    public List<kzq> m5437c() {
        if (!this.f4469m) {
            this.f4469m = true;
            this.f4458b.clear();
            List<re00.C19812a<?>> listM5441g = m5441g();
            int size = listM5441g.size();
            for (int i = 0; i < size; i++) {
                re00.C19812a<?> c19812a = listM5441g.get(i);
                if (!this.f4458b.contains(c19812a.f162369a)) {
                    this.f4458b.add(c19812a.f162369a);
                }
                for (int i2 = 0; i2 < c19812a.f162370b.size(); i2++) {
                    if (!this.f4458b.contains(c19812a.f162370b.get(i2))) {
                        this.f4458b.add(c19812a.f162370b.get(i2));
                    }
                }
            }
        }
        return this.f4458b;
    }

    /* JADX INFO: renamed from: d */
    public z3e m5438d() {
        return this.f4464h.mo5416a();
    }

    /* JADX INFO: renamed from: e */
    public d4e m5439e() {
        return this.f4472p;
    }

    /* JADX INFO: renamed from: f */
    public int m5440f() {
        return this.f4462f;
    }

    /* JADX INFO: renamed from: g */
    public List<re00.C19812a<?>> m5441g() {
        if (!this.f4468l) {
            this.f4468l = true;
            this.f4457a.clear();
            List listM5308i = this.f4459c.m5350i().m5308i(this.f4460d);
            int size = listM5308i.size();
            for (int i = 0; i < size; i++) {
                re00.C19812a<?> c19812aMo101565a = ((re00) listM5308i.get(i)).mo101565a(this.f4460d, this.f4461e, this.f4462f, this.f4465i);
                if (c19812aMo101565a != null) {
                    this.f4457a.add(c19812aMo101565a);
                }
            }
        }
        return this.f4457a;
    }

    /* JADX INFO: renamed from: h */
    public <Data> C1088o<Data, ?, Transcode> m5442h(Class<Data> cls) {
        return this.f4459c.m5350i().m5307h(cls, this.f4463g, this.f4467k);
    }

    /* JADX INFO: renamed from: i */
    public Class<?> m5443i() {
        return this.f4460d.getClass();
    }

    /* JADX INFO: renamed from: j */
    public List<re00<File, ?>> m5444j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f4459c.m5350i().m5308i(file);
    }

    /* JADX INFO: renamed from: k */
    public u560 m5445k() {
        return this.f4465i;
    }

    /* JADX INFO: renamed from: l */
    public Priority m5446l() {
        return this.f4471o;
    }

    /* JADX INFO: renamed from: m */
    public List<Class<?>> m5447m() {
        return this.f4459c.m5350i().m5309j(this.f4460d.getClass(), this.f4463g, this.f4467k);
    }

    /* JADX INFO: renamed from: n */
    public <Z> c4d0<Z> m5448n(u3d0<Z> u3d0Var) {
        return this.f4459c.m5350i().m5310k(u3d0Var);
    }

    /* JADX INFO: renamed from: o */
    public <T> InterfaceC1064a<T> m5449o(T t) {
        return this.f4459c.m5350i().m5311l(t);
    }

    /* JADX INFO: renamed from: p */
    public kzq m5450p() {
        return this.f4470n;
    }

    /* JADX INFO: renamed from: q */
    public <X> v0f<X> m5451q(X x) throws Registry.NoSourceEncoderAvailableException {
        return this.f4459c.m5350i().m5312m(x);
    }

    /* JADX INFO: renamed from: r */
    public Class<?> m5452r() {
        return this.f4467k;
    }

    /* JADX INFO: renamed from: s */
    public <Z> tgj0<Z> m5453s(Class<Z> cls) {
        tgj0<Z> tgj0Var = (tgj0) this.f4466j.get(cls);
        if (tgj0Var == null) {
            for (Map.Entry<Class<?>, tgj0<?>> entry : this.f4466j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    tgj0Var = (tgj0) entry.getValue();
                    break;
                }
            }
        }
        if (tgj0Var != null) {
            return tgj0Var;
        }
        if (!this.f4466j.isEmpty() || !this.f4473q) {
            return ayj0.m100876c();
        }
        v1d0.m199002a("Missing transformation for ", cls, ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public int m5454t() {
        return this.f4461e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public boolean m5455u(Class<?> cls) {
        return m5442h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v */
    public <R> void m5456v(C1059c c1059c, Object obj, kzq kzqVar, int i, int i2, d4e d4eVar, Class<?> cls, Class<R> cls2, Priority priority, u560 u560Var, Map<Class<?>, tgj0<?>> map, boolean z, boolean z2, DecodeJob.InterfaceC1071e interfaceC1071e) {
        this.f4459c = c1059c;
        this.f4460d = obj;
        this.f4470n = kzqVar;
        this.f4461e = i;
        this.f4462f = i2;
        this.f4472p = d4eVar;
        this.f4463g = cls;
        this.f4464h = interfaceC1071e;
        this.f4467k = cls2;
        this.f4471o = priority;
        this.f4465i = u560Var;
        this.f4466j = map;
        this.f4473q = z;
        this.f4474r = z2;
    }

    /* JADX INFO: renamed from: w */
    public boolean m5457w(u3d0<?> u3d0Var) {
        return this.f4459c.m5350i().m5313n(u3d0Var);
    }

    /* JADX INFO: renamed from: x */
    public boolean m5458x() {
        return this.f4474r;
    }

    /* JADX INFO: renamed from: y */
    public boolean m5459y(kzq kzqVar) {
        List<re00.C19812a<?>> listM5441g = m5441g();
        int size = listM5441g.size();
        for (int i = 0; i < size; i++) {
            if (listM5441g.get(i).f162369a.equals(kzqVar)) {
                return true;
            }
        }
        return false;
    }
}
