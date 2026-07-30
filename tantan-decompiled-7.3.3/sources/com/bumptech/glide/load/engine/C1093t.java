package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC1064a;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p153l.d4e;
import p153l.izv;
import p153l.kzq;
import p153l.re00;
import p153l.t5c;
import p153l.v0f;
import p153l.z3e;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.t */
/* JADX INFO: loaded from: classes.dex */
class C1093t implements InterfaceC1078e, InterfaceC1078e.a {

    /* JADX INFO: renamed from: a */
    private final C1079f<?> f4587a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1078e.a f4588b;

    /* JADX INFO: renamed from: c */
    private volatile int f4589c;

    /* JADX INFO: renamed from: d */
    private volatile C1075b f4590d;

    /* JADX INFO: renamed from: e */
    private volatile Object f4591e;

    /* JADX INFO: renamed from: f */
    private volatile re00.C19812a<?> f4592f;

    /* JADX INFO: renamed from: g */
    private volatile C1076c f4593g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.t$a */
    public class a implements t5c.InterfaceC20239a<Object> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ re00.C19812a f4594a;

        public a(re00.C19812a c19812a) {
            this.f4594a = c19812a;
        }

        @Override // p153l.t5c.InterfaceC20239a
        /* JADX INFO: renamed from: b */
        public void mo5432b(@Nullable Object obj) {
            if (C1093t.this.m5523d(this.f4594a)) {
                C1093t.this.m5524e(this.f4594a, obj);
            }
        }

        @Override // p153l.t5c.InterfaceC20239a
        /* JADX INFO: renamed from: c */
        public void mo5433c(@NonNull Exception exc) {
            if (C1093t.this.m5523d(this.f4594a)) {
                C1093t.this.m5525i(this.f4594a, exc);
            }
        }
    }

    public C1093t(C1079f<?> c1079f, InterfaceC1078e.a aVar) {
        this.f4587a = c1079f;
        this.f4588b = aVar;
    }

    /* JADX INFO: renamed from: b */
    private boolean m5520b(Object obj) throws Throwable {
        Throwable th;
        long jM142879b = izv.m142879b();
        boolean z = false;
        try {
            InterfaceC1064a<T> interfaceC1064aM5449o = this.f4587a.m5449o(obj);
            Object objMo5369a = interfaceC1064aM5449o.mo5369a();
            v0f<X> v0fVarM5451q = this.f4587a.m5451q(objMo5369a);
            C1077d c1077d = new C1077d(v0fVarM5451q, objMo5369a, this.f4587a.m5445k());
            C1076c c1076c = new C1076c(this.f4592f.f162369a, this.f4587a.m5450p());
            z3e z3eVarM5438d = this.f4587a.m5438d();
            z3eVarM5438d.mo95915b(c1076c, c1077d);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c1076c.toString();
                Objects.toString(obj);
                Objects.toString(v0fVarM5451q);
                izv.m142878a(jM142879b);
            }
            if (z3eVarM5438d.mo95914a(c1076c) != null) {
                this.f4593g = c1076c;
                this.f4590d = new C1075b(Collections.singletonList(this.f4592f.f162369a), this.f4587a, this);
                this.f4592f.f162371c.cleanup();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.f4593g);
                Objects.toString(obj);
            }
            try {
                this.f4588b.mo5405h(this.f4592f.f162369a, interfaceC1064aM5449o.mo5369a(), this.f4592f.f162371c, this.f4592f.f162371c.getDataSource(), this.f4592f.f162369a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.f4592f.f162371c.cleanup();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m5521c() {
        return this.f4589c < this.f4587a.m5441g().size();
    }

    /* JADX INFO: renamed from: j */
    private void m5522j(re00.C19812a<?> c19812a) {
        this.f4592f.f162371c.mo95590d(this.f4587a.m5446l(), new a(c19812a));
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    /* JADX INFO: renamed from: a */
    public boolean mo5431a() {
        if (this.f4591e != null) {
            Object obj = this.f4591e;
            this.f4591e = null;
            try {
                if (!m5520b(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f4590d != null && this.f4590d.mo5431a()) {
            return true;
        }
        this.f4590d = null;
        this.f4592f = null;
        boolean z = false;
        while (!z && m5521c()) {
            List<re00.C19812a<?>> listM5441g = this.f4587a.m5441g();
            int i = this.f4589c;
            this.f4589c = i + 1;
            this.f4592f = listM5441g.get(i);
            if (this.f4592f != null && (this.f4587a.m5439e().mo114182c(this.f4592f.f162371c.getDataSource()) || this.f4587a.m5455u(this.f4592f.f162371c.mo106029a()))) {
                m5522j(this.f4592f);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    public void cancel() {
        re00.C19812a<?> c19812a = this.f4592f;
        if (c19812a != null) {
            c19812a.f162371c.cancel();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m5523d(re00.C19812a<?> c19812a) {
        re00.C19812a<?> c19812a2 = this.f4592f;
        return c19812a2 != null && c19812a2 == c19812a;
    }

    /* JADX INFO: renamed from: e */
    public void m5524e(re00.C19812a<?> c19812a, Object obj) {
        d4e d4eVarM5439e = this.f4587a.m5439e();
        if (obj != null && d4eVarM5439e.mo114182c(c19812a.f162371c.getDataSource())) {
            this.f4591e = obj;
            this.f4588b.mo5404g();
        } else {
            InterfaceC1078e.a aVar = this.f4588b;
            kzq kzqVar = c19812a.f162369a;
            t5c<?> t5cVar = c19812a.f162371c;
            aVar.mo5405h(kzqVar, obj, t5cVar, t5cVar.getDataSource(), this.f4593g);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: f */
    public void mo5403f(kzq kzqVar, Exception exc, t5c<?> t5cVar, DataSource dataSource) {
        this.f4588b.mo5403f(kzqVar, exc, t5cVar, this.f4592f.f162371c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: g */
    public void mo5404g() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e.a
    /* JADX INFO: renamed from: h */
    public void mo5405h(kzq kzqVar, Object obj, t5c<?> t5cVar, DataSource dataSource, kzq kzqVar2) {
        this.f4588b.mo5405h(kzqVar, obj, t5cVar, this.f4592f.f162371c.getDataSource(), kzqVar);
    }

    /* JADX INFO: renamed from: i */
    public void m5525i(re00.C19812a<?> c19812a, @NonNull Exception exc) {
        InterfaceC1078e.a aVar = this.f4588b;
        C1076c c1076c = this.f4593g;
        t5c<?> t5cVar = c19812a.f162371c;
        aVar.mo5403f(c1076c, exc, t5cVar, t5cVar.getDataSource());
    }
}
