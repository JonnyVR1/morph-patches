package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p153l.d4k;
import p153l.kzq;
import p153l.re00;
import p153l.t5c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.b */
/* JADX INFO: loaded from: classes.dex */
class C1075b implements InterfaceC1078e, t5c.InterfaceC20239a<Object> {

    /* JADX INFO: renamed from: a */
    private final List<kzq> f4443a;

    /* JADX INFO: renamed from: b */
    private final C1079f<?> f4444b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC1078e.a f4445c;

    /* JADX INFO: renamed from: d */
    private int f4446d;

    /* JADX INFO: renamed from: e */
    private kzq f4447e;

    /* JADX INFO: renamed from: f */
    private List<re00<File, ?>> f4448f;

    /* JADX INFO: renamed from: g */
    private int f4449g;

    /* JADX INFO: renamed from: h */
    private volatile re00.C19812a<?> f4450h;

    /* JADX INFO: renamed from: i */
    private File f4451i;

    public C1075b(List<kzq> list, C1079f<?> c1079f, InterfaceC1078e.a aVar) {
        this.f4446d = -1;
        this.f4443a = list;
        this.f4444b = c1079f;
        this.f4445c = aVar;
    }

    /* JADX INFO: renamed from: d */
    private boolean m5430d() {
        return this.f4449g < this.f4448f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    /* JADX INFO: renamed from: a */
    public boolean mo5431a() {
        d4k.m114200a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.f4448f != null && m5430d()) {
                    this.f4450h = null;
                    while (!z && m5430d()) {
                        List<re00<File, ?>> list = this.f4448f;
                        int i = this.f4449g;
                        this.f4449g = i + 1;
                        this.f4450h = list.get(i).mo101565a(this.f4451i, this.f4444b.m5454t(), this.f4444b.m5440f(), this.f4444b.m5445k());
                        if (this.f4450h != null && this.f4444b.m5455u(this.f4450h.f162371c.mo106029a())) {
                            this.f4450h.f162371c.mo95590d(this.f4444b.m5446l(), this);
                            z = true;
                        }
                    }
                    d4k.m114204e();
                    return z;
                }
                int i2 = this.f4446d + 1;
                this.f4446d = i2;
                if (i2 >= this.f4443a.size()) {
                    d4k.m114204e();
                    return false;
                }
                kzq kzqVar = this.f4443a.get(this.f4446d);
                File fileMo95914a = this.f4444b.m5438d().mo95914a(new C1076c(kzqVar, this.f4444b.m5450p()));
                this.f4451i = fileMo95914a;
                if (fileMo95914a != null) {
                    this.f4447e = kzqVar;
                    this.f4448f = this.f4444b.m5444j(fileMo95914a);
                    this.f4449g = 0;
                }
            } catch (Throwable th) {
                d4k.m114204e();
                throw th;
            }
        }
    }

    @Override // p153l.t5c.InterfaceC20239a
    /* JADX INFO: renamed from: b */
    public void mo5432b(Object obj) {
        this.f4445c.mo5405h(this.f4447e, obj, this.f4450h.f162371c, DataSource.DATA_DISK_CACHE, this.f4447e);
    }

    @Override // p153l.t5c.InterfaceC20239a
    /* JADX INFO: renamed from: c */
    public void mo5433c(@NonNull Exception exc) {
        this.f4445c.mo5403f(this.f4447e, exc, this.f4450h.f162371c, DataSource.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    public void cancel() {
        re00.C19812a<?> c19812a = this.f4450h;
        if (c19812a != null) {
            c19812a.f162371c.cancel();
        }
    }

    public C1075b(C1079f<?> c1079f, InterfaceC1078e.a aVar) {
        this(c1079f.m5437c(), c1079f, aVar);
    }
}
