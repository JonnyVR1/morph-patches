package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.List;
import p153l.d4k;
import p153l.kzq;
import p153l.re00;
import p153l.t5c;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.q */
/* JADX INFO: loaded from: classes.dex */
class C1090q implements InterfaceC1078e, t5c.InterfaceC20239a<Object> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1078e.a f4566a;

    /* JADX INFO: renamed from: b */
    private final C1079f<?> f4567b;

    /* JADX INFO: renamed from: c */
    private int f4568c;

    /* JADX INFO: renamed from: d */
    private int f4569d = -1;

    /* JADX INFO: renamed from: e */
    private kzq f4570e;

    /* JADX INFO: renamed from: f */
    private List<re00<File, ?>> f4571f;

    /* JADX INFO: renamed from: g */
    private int f4572g;

    /* JADX INFO: renamed from: h */
    private volatile re00.C19812a<?> f4573h;

    /* JADX INFO: renamed from: i */
    private File f4574i;

    /* JADX INFO: renamed from: j */
    private C1091r f4575j;

    public C1090q(C1079f<?> c1079f, InterfaceC1078e.a aVar) {
        this.f4567b = c1079f;
        this.f4566a = aVar;
    }

    /* JADX INFO: renamed from: d */
    private boolean m5517d() {
        return this.f4572g < this.f4571f.size();
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    /* JADX INFO: renamed from: a */
    public boolean mo5431a() {
        d4k.m114200a("ResourceCacheGenerator.startNext");
        try {
            List<kzq> listM5437c = this.f4567b.m5437c();
            boolean z = false;
            if (listM5437c.isEmpty()) {
                d4k.m114204e();
                return false;
            }
            List<Class<?>> listM5447m = this.f4567b.m5447m();
            if (listM5447m.isEmpty()) {
                if (File.class.equals(this.f4567b.m5452r())) {
                    d4k.m114204e();
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.f4567b.m5443i() + " to " + this.f4567b.m5452r());
            }
            while (true) {
                if (this.f4571f != null && m5517d()) {
                    this.f4573h = null;
                    while (!z && m5517d()) {
                        List<re00<File, ?>> list = this.f4571f;
                        int i = this.f4572g;
                        this.f4572g = i + 1;
                        this.f4573h = list.get(i).mo101565a(this.f4574i, this.f4567b.m5454t(), this.f4567b.m5440f(), this.f4567b.m5445k());
                        if (this.f4573h != null && this.f4567b.m5455u(this.f4573h.f162371c.mo106029a())) {
                            this.f4573h.f162371c.mo95590d(this.f4567b.m5446l(), this);
                            z = true;
                        }
                    }
                    d4k.m114204e();
                    return z;
                }
                int i2 = this.f4569d + 1;
                this.f4569d = i2;
                if (i2 >= listM5447m.size()) {
                    int i3 = this.f4568c + 1;
                    this.f4568c = i3;
                    if (i3 >= listM5437c.size()) {
                        d4k.m114204e();
                        return false;
                    }
                    this.f4569d = 0;
                }
                kzq kzqVar = listM5437c.get(this.f4568c);
                Class<?> cls = listM5447m.get(this.f4569d);
                this.f4575j = new C1091r(this.f4567b.m5436b(), kzqVar, this.f4567b.m5450p(), this.f4567b.m5454t(), this.f4567b.m5440f(), this.f4567b.m5453s(cls), cls, this.f4567b.m5445k());
                File fileMo95914a = this.f4567b.m5438d().mo95914a(this.f4575j);
                this.f4574i = fileMo95914a;
                if (fileMo95914a != null) {
                    this.f4570e = kzqVar;
                    this.f4571f = this.f4567b.m5444j(fileMo95914a);
                    this.f4572g = 0;
                }
            }
        } catch (Throwable th) {
            d4k.m114204e();
            throw th;
        }
    }

    @Override // p153l.t5c.InterfaceC20239a
    /* JADX INFO: renamed from: b */
    public void mo5432b(Object obj) {
        this.f4566a.mo5405h(this.f4570e, obj, this.f4573h.f162371c, DataSource.RESOURCE_DISK_CACHE, this.f4575j);
    }

    @Override // p153l.t5c.InterfaceC20239a
    /* JADX INFO: renamed from: c */
    public void mo5433c(@NonNull Exception exc) {
        this.f4566a.mo5403f(this.f4575j, exc, this.f4573h.f162371c, DataSource.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC1078e
    public void cancel() {
        re00.C19812a<?> c19812a = this.f4573h;
        if (c19812a != null) {
            c19812a.f162371c.cancel();
        }
    }
}
