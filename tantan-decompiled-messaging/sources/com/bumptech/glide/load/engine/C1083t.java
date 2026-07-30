package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p149l.i600;
import p149l.kxq;
import p149l.kxv;
import p149l.l4c;
import p149l.p2e;
import p149l.rze;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.t */
/* JADX INFO: loaded from: classes.dex */
class C1083t implements InterfaceC1068e, InterfaceC1068e.a {

    /* JADX INFO: renamed from: a */
    private final C1069f<?> f4575a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1068e.a f4576b;

    /* JADX INFO: renamed from: c */
    private int f4577c;

    /* JADX INFO: renamed from: d */
    private C1065b f4578d;

    /* JADX INFO: renamed from: e */
    private Object f4579e;

    /* JADX INFO: renamed from: f */
    private volatile i600.C17490a<?> f4580f;

    /* JADX INFO: renamed from: g */
    private C1066c f4581g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.t$a */
    public class a implements l4c.InterfaceC18148a<Object> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i600.C17490a f4582a;

        public a(i600.C17490a c17490a) {
            this.f4582a = c17490a;
        }

        @Override // p149l.l4c.InterfaceC18148a
        /* JADX INFO: renamed from: b */
        public void mo5407b(@Nullable Object obj) {
            if (C1083t.this.m5497e(this.f4582a)) {
                C1083t.this.m5498h(this.f4582a, obj);
            }
        }

        @Override // p149l.l4c.InterfaceC18148a
        /* JADX INFO: renamed from: c */
        public void mo5408c(@NonNull Exception exc) {
            if (C1083t.this.m5497e(this.f4582a)) {
                C1083t.this.m5499i(this.f4582a, exc);
            }
        }
    }

    public C1083t(C1069f<?> c1069f, InterfaceC1068e.a aVar) {
        this.f4575a = c1069f;
        this.f4576b = aVar;
    }

    /* JADX INFO: renamed from: c */
    private void m5494c(Object obj) {
        long jM147808b = kxv.m147808b();
        try {
            rze<X> rzeVarM5425p = this.f4575a.m5425p(obj);
            C1067d c1067d = new C1067d(rzeVarM5425p, obj, this.f4575a.m5420k());
            this.f4581g = new C1066c(this.f4580f.f111665a, this.f4575a.m5424o());
            this.f4575a.m5413d().mo148281b(this.f4581g, c1067d);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Objects.toString(this.f4581g);
                Objects.toString(obj);
                Objects.toString(rzeVarM5425p);
                kxv.m147807a(jM147808b);
            }
            this.f4580f.f111667c.cleanup();
            this.f4578d = new C1065b(Collections.singletonList(this.f4580f.f111665a), this.f4575a, this);
        } catch (Throwable th) {
            this.f4580f.f111667c.cleanup();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    private boolean m5495d() {
        return this.f4577c < this.f4575a.m5416g().size();
    }

    /* JADX INFO: renamed from: j */
    private void m5496j(i600.C17490a<?> c17490a) {
        this.f4580f.f111667c.mo99210d(this.f4575a.m5421l(), new a(c17490a));
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    /* JADX INFO: renamed from: a */
    public boolean mo5406a() {
        Object obj = this.f4579e;
        if (obj != null) {
            this.f4579e = null;
            m5494c(obj);
        }
        C1065b c1065b = this.f4578d;
        if (c1065b != null && c1065b.mo5406a()) {
            return true;
        }
        this.f4578d = null;
        this.f4580f = null;
        boolean z = false;
        while (!z && m5495d()) {
            List<i600.C17490a<?>> listM5416g = this.f4575a.m5416g();
            int i = this.f4577c;
            this.f4577c = i + 1;
            this.f4580f = listM5416g.get(i);
            if (this.f4580f != null && (this.f4575a.m5414e().mo167160c(this.f4580f.f111667c.getDataSource()) || this.f4575a.m5429t(this.f4580f.f111667c.mo103356a()))) {
                m5496j(this.f4580f);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: b */
    public void mo5377b(kxq kxqVar, Exception exc, l4c<?> l4cVar, DataSource dataSource) {
        this.f4576b.mo5377b(kxqVar, exc, l4cVar, this.f4580f.f111667c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    public void cancel() {
        i600.C17490a<?> c17490a = this.f4580f;
        if (c17490a != null) {
            c17490a.f111667c.cancel();
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m5497e(i600.C17490a<?> c17490a) {
        i600.C17490a<?> c17490a2 = this.f4580f;
        return c17490a2 != null && c17490a2 == c17490a;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: f */
    public void mo5378f() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e.a
    /* JADX INFO: renamed from: g */
    public void mo5379g(kxq kxqVar, Object obj, l4c<?> l4cVar, DataSource dataSource, kxq kxqVar2) {
        this.f4576b.mo5379g(kxqVar, obj, l4cVar, this.f4580f.f111667c.getDataSource(), kxqVar);
    }

    /* JADX INFO: renamed from: h */
    public void m5498h(i600.C17490a<?> c17490a, Object obj) {
        p2e p2eVarM5414e = this.f4575a.m5414e();
        if (obj != null && p2eVarM5414e.mo167160c(c17490a.f111667c.getDataSource())) {
            this.f4579e = obj;
            this.f4576b.mo5378f();
        } else {
            InterfaceC1068e.a aVar = this.f4576b;
            kxq kxqVar = c17490a.f111665a;
            l4c<?> l4cVar = c17490a.f111667c;
            aVar.mo5379g(kxqVar, obj, l4cVar, l4cVar.getDataSource(), this.f4581g);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m5499i(i600.C17490a<?> c17490a, @NonNull Exception exc) {
        InterfaceC1068e.a aVar = this.f4576b;
        C1066c c1066c = this.f4581g;
        l4c<?> l4cVar = c17490a.f111667c;
        aVar.mo5377b(c1066c, exc, l4cVar, l4cVar.getDataSource());
    }
}
