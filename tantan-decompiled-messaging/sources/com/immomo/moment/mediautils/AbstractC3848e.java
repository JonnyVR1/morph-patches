package com.immomo.moment.mediautils;

import java.security.InvalidParameterException;
import p149l.u460;

/* JADX INFO: renamed from: com.immomo.moment.mediautils.e */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC3848e {

    /* JADX INFO: renamed from: a */
    a f13302a;

    /* JADX INFO: renamed from: b */
    b f13303b;

    /* JADX INFO: renamed from: c */
    int f13304c;

    /* JADX INFO: renamed from: d */
    int f13305d;

    /* JADX INFO: renamed from: e */
    int f13306e;

    /* JADX INFO: renamed from: f */
    int f13307f;

    /* JADX INFO: renamed from: g */
    int f13308g;

    /* JADX INFO: renamed from: h */
    int f13309h;

    /* JADX INFO: renamed from: i */
    int f13310i;

    /* JADX INFO: renamed from: j */
    int f13311j;

    /* JADX INFO: renamed from: k */
    int f13312k;

    /* JADX INFO: renamed from: l */
    int f13313l;

    /* JADX INFO: renamed from: m */
    protected boolean f13314m = false;

    /* JADX INFO: renamed from: n */
    String f13315n = null;

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.e$a */
    public interface a {
    }

    /* JADX INFO: renamed from: com.immomo.moment.mediautils.e$b */
    public interface b {
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo18741a();

    /* JADX INFO: renamed from: b */
    public abstract void mo18742b(u460 u460Var);

    /* JADX INFO: renamed from: c */
    public abstract void mo18743c(u460 u460Var);

    /* JADX INFO: renamed from: d */
    public void m18744d(int i, int i2, int i3) {
        this.f13311j = i;
        this.f13312k = i2;
        this.f13313l = i3;
    }

    /* JADX INFO: renamed from: e */
    public void m18745e(boolean z) {
        this.f13314m = z;
    }

    /* JADX INFO: renamed from: f */
    public void m18746f(a aVar) {
        this.f13302a = aVar;
    }

    /* JADX INFO: renamed from: g */
    public void m18747g(b bVar) {
        this.f13303b = bVar;
    }

    /* JADX INFO: renamed from: h */
    public void m18748h(String str) {
        this.f13315n = str;
        if (str == null) {
            throw new InvalidParameterException("SetMediaOutputUrl parameter is null");
        }
    }

    /* JADX INFO: renamed from: i */
    public void m18749i(int i) {
        this.f13310i = i;
    }

    /* JADX INFO: renamed from: j */
    public void m18750j(int i) {
        this.f13308g = i;
    }

    /* JADX INFO: renamed from: k */
    public void m18751k(int i) {
        this.f13309h = i;
    }

    /* JADX INFO: renamed from: l */
    public void mo18752l(int i, int i2, int i3, int i4) {
        this.f13304c = i;
        this.f13305d = i2;
        this.f13306e = i3;
        this.f13307f = i4;
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo18753m();

    /* JADX INFO: renamed from: n */
    public abstract void mo18754n();
}
