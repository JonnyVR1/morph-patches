package com.immomo.moment.mediautils;

import java.security.InvalidParameterException;
import p153l.ad60;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3991e {

    /* JADX INFO: renamed from: a */
    a f13996a;

    /* JADX INFO: renamed from: b */
    b f13997b;

    /* JADX INFO: renamed from: c */
    int f13998c;

    /* JADX INFO: renamed from: d */
    int f13999d;

    /* JADX INFO: renamed from: e */
    int f14000e;

    /* JADX INFO: renamed from: f */
    int f14001f;

    /* JADX INFO: renamed from: g */
    int f14002g;

    /* JADX INFO: renamed from: h */
    int f14003h;

    /* JADX INFO: renamed from: i */
    int f14004i;

    /* JADX INFO: renamed from: j */
    int f14005j;

    /* JADX INFO: renamed from: k */
    int f14006k;

    /* JADX INFO: renamed from: l */
    int f14007l;

    /* JADX INFO: renamed from: m */
    protected boolean f14008m = false;

    /* JADX INFO: renamed from: n */
    String f14009n = null;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.e$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.e$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo19721a();

    /* JADX INFO: renamed from: b */
    public abstract void mo19722b(ad60 ad60Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo19723c(ad60 ad60Var);

    /* JADX INFO: renamed from: d */
    public void m19724d(int i, int i2, int i3) {
        this.f14005j = i;
        this.f14006k = i2;
        this.f14007l = i3;
    }

    /* JADX INFO: renamed from: e */
    public void m19725e(boolean z) {
        this.f14008m = z;
    }

    /* JADX INFO: renamed from: f */
    public void m19726f(a aVar) {
        this.f13996a = aVar;
    }

    /* JADX INFO: renamed from: g */
    public void m19727g(b bVar) {
        this.f13997b = bVar;
    }

    /* JADX INFO: renamed from: h */
    public void m19728h(String str) {
        this.f14009n = str;
        if (str == null) {
            throw new InvalidParameterException("SetMediaOutputUrl parameter is null");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m19729i(int i) {
        this.f14004i = i;
    }

    /* JADX INFO: renamed from: j */
    public void m19730j(int i) {
        this.f14002g = i;
    }

    /* JADX INFO: renamed from: k */
    public void m19731k(int i) {
        this.f14003h = i;
    }

    /* JADX INFO: renamed from: l */
    public void mo19732l(int i, int i2, int i3, int i4) {
        this.f13998c = i;
        this.f13999d = i2;
        this.f14000e = i3;
        this.f14001f = i4;
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo19733m();

    /* JADX INFO: renamed from: n */
    public abstract void mo19734n();
}
