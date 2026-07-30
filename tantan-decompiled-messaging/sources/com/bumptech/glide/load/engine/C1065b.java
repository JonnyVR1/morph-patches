package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p149l.i600;
import p149l.kxq;
import p149l.l4c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.b */
/* JADX INFO: loaded from: classes.dex */
class C1065b implements InterfaceC1068e, l4c.InterfaceC18148a<Object> {

    /* JADX INFO: renamed from: a */
    private final List<kxq> f4432a;

    /* JADX INFO: renamed from: b */
    private final C1069f<?> f4433b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1068e.a f4434c;

    /* JADX INFO: renamed from: d */
    private int f4435d;

    /* JADX INFO: renamed from: e */
    private kxq f4436e;

    /* JADX INFO: renamed from: f */
    private List<i600<File, ?>> f4437f;

    /* JADX INFO: renamed from: g */
    private int f4438g;

    /* JADX INFO: renamed from: h */
    private volatile i600.C17490a<?> f4439h;

    /* JADX INFO: renamed from: i */
    private File f4440i;

    public C1065b(List<kxq> list, C1069f<?> c1069f, InterfaceC1068e.a aVar) {
        this.f4435d = -1;
        this.f4432a = list;
        this.f4433b = c1069f;
        this.f4434c = aVar;
    }

    /* JADX INFO: renamed from: d */
    private boolean m5405d() {
        return this.f4438g < this.f4437f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    /* JADX INFO: renamed from: a */
    public boolean mo5406a() {
        while (true) {
            boolean z = false;
            if (this.f4437f != null && m5405d()) {
                this.f4439h = null;
                while (!z && m5405d()) {
                    List<i600<File, ?>> list = this.f4437f;
                    int i = this.f4438g;
                    this.f4438g = i + 1;
                    this.f4439h = list.get(i).mo103352a(this.f4440i, this.f4433b.m5428s(), this.f4433b.m5415f(), this.f4433b.m5420k());
                    if (this.f4439h != null && this.f4433b.m5429t(this.f4439h.f111667c.mo103356a())) {
                        this.f4439h.f111667c.mo99210d(this.f4433b.m5421l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f4435d + 1;
            this.f4435d = i2;
            if (i2 >= this.f4432a.size()) {
                return false;
            }
            kxq kxqVar = this.f4432a.get(this.f4435d);
            File fileMo148280a = this.f4433b.m5413d().mo148280a(new C1066c(kxqVar, this.f4433b.m5424o()));
            this.f4440i = fileMo148280a;
            if (fileMo148280a != null) {
                this.f4436e = kxqVar;
                this.f4437f = this.f4433b.m5419j(fileMo148280a);
                this.f4438g = 0;
            }
        }
    }

    @Override // p149l.l4c.InterfaceC18148a
    /* JADX INFO: renamed from: b */
    public void mo5407b(Object obj) {
        this.f4434c.mo5379g(this.f4436e, obj, this.f4439h.f111667c, DataSource.DATA_DISK_CACHE, this.f4436e);
    }

    @Override // p149l.l4c.InterfaceC18148a
    /* JADX INFO: renamed from: c */
    public void mo5408c(@NonNull Exception exc) {
        this.f4434c.mo5377b(this.f4436e, exc, this.f4439h.f111667c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1068e
    public void cancel() {
        i600.C17490a<?> c17490a = this.f4439h;
        if (c17490a != null) {
            c17490a.f111667c.cancel();
        }
    }

    public C1065b(C1069f<?> c1069f, InterfaceC1068e.a aVar) {
        this(c1069f.m5412c(), c1069f, aVar);
    }
}
