package com.tencent.liteav.network.p103a;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14308e {

    /* JADX INFO: renamed from: a */
    public final String f60338a;

    /* JADX INFO: renamed from: b */
    public final int f60339b;

    /* JADX INFO: renamed from: c */
    public final int f60340c;

    /* JADX INFO: renamed from: d */
    public final long f60341d;

    public C14308e(String str, int i, int i2, long j) {
        this.f60338a = str;
        this.f60339b = i;
        this.f60340c = i2 < 600 ? 600 : i2;
        this.f60341d = j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m84872a() {
        return this.f60339b == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C14308e)) {
            C14308e c14308e = (C14308e) obj;
            if (this.f60338a.equals(c14308e.f60338a) && this.f60339b == c14308e.f60339b && this.f60340c == c14308e.f60340c && this.f60341d == c14308e.f60341d) {
                return true;
            }
        }
        return false;
    }
}
