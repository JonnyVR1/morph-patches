package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p149l.i600;
import p149l.kxq;
import p149l.l4c;
import p149l.q2j;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.q */
/* JADX INFO: loaded from: classes.dex */
class C1080q implements InterfaceC1068e, l4c.InterfaceC18148a<Object> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1068e.a f4554a;

    /* JADX INFO: renamed from: b */
    private final C1069f<?> f4555b;

    /* JADX INFO: renamed from: c */
    private int f4556c;

    /* JADX INFO: renamed from: d */
    private int f4557d = -1;

    /* JADX INFO: renamed from: e */
    private kxq f4558e;

    /* JADX INFO: renamed from: f */
    private List<i600<File, ?>> f4559f;

    /* JADX INFO: renamed from: g */
    private int f4560g;

    /* JADX INFO: renamed from: h */
    private volatile i600.C17490a<?> f4561h;

    /* JADX INFO: renamed from: i */
    private File f4562i;

    /* JADX INFO: renamed from: j */
    private C1081r f4563j;

    public C1080q(C1069f<?> c1069f, InterfaceC1068e.a aVar) {
        this.f4555b = c1069f;
        this.f4554a = aVar;
    }

    /* JADX INFO: renamed from: d */
    private boolean m5491d() {
        return this.f4560g < this.f4559f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    /* JADX INFO: renamed from: a */
    public boolean mo5406a() {
        List<kxq> listM5412c = this.f4555b.m5412c();
        boolean z = false;
        if (listM5412c.isEmpty()) {
            return false;
        }
        List<Class<?>> listM5422m = this.f4555b.m5422m();
        if (listM5422m.isEmpty()) {
            if (File.class.equals(this.f4555b.m5426q())) {
                return false;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.f4555b.m5418i());
            q2j.m172469a(sb, " to ", this.f4555b.m5426q());
            return false;
        }
        while (true) {
            if (this.f4559f != null && m5491d()) {
                this.f4561h = null;
                while (!z && m5491d()) {
                    List<i600<File, ?>> list = this.f4559f;
                    int i = this.f4560g;
                    this.f4560g = i + 1;
                    this.f4561h = list.get(i).mo103352a(this.f4562i, this.f4555b.m5428s(), this.f4555b.m5415f(), this.f4555b.m5420k());
                    if (this.f4561h != null && this.f4555b.m5429t(this.f4561h.f111667c.mo103356a())) {
                        this.f4561h.f111667c.mo99210d(this.f4555b.m5421l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f4557d + 1;
            this.f4557d = i2;
            if (i2 >= listM5422m.size()) {
                int i3 = this.f4556c + 1;
                this.f4556c = i3;
                if (i3 >= listM5412c.size()) {
                    return false;
                }
                this.f4557d = 0;
            }
            kxq kxqVar = listM5412c.get(this.f4556c);
            Class<?> cls = listM5422m.get(this.f4557d);
            this.f4563j = new C1081r(this.f4555b.m5411b(), kxqVar, this.f4555b.m5424o(), this.f4555b.m5428s(), this.f4555b.m5415f(), this.f4555b.m5427r(cls), cls, this.f4555b.m5420k());
            File fileMo148280a = this.f4555b.m5413d().mo148280a(this.f4563j);
            this.f4562i = fileMo148280a;
            if (fileMo148280a != null) {
                this.f4558e = kxqVar;
                this.f4559f = this.f4555b.m5419j(fileMo148280a);
                this.f4560g = 0;
            }
        }
    }

    @Override // p149l.l4c.InterfaceC18148a
    /* JADX INFO: renamed from: b */
    public void mo5407b(Object obj) {
        this.f4554a.mo5379g(this.f4558e, obj, this.f4561h.f111667c, DataSource.RESOURCE_DISK_CACHE, this.f4563j);
    }

    @Override // p149l.l4c.InterfaceC18148a
    /* JADX INFO: renamed from: c */
    public void mo5408c(@NonNull Exception exc) {
        this.f4554a.mo5377b(this.f4563j, exc, this.f4561h.f111667c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    public void cancel() {
        i600.C17490a<?> c17490a = this.f4561h;
        if (c17490a != null) {
            c17490a.f111667c.cancel();
        }
    }
}
