package com.tencent.liteav.network.p098a;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C14145e {

    /* JADX INFO: renamed from: a */
    public final String f59490a;

    /* JADX INFO: renamed from: b */
    public final int f59491b;

    /* JADX INFO: renamed from: c */
    public final int f59492c;

    /* JADX INFO: renamed from: d */
    public final long f59493d;

    public C14145e(String str, int i, int i2, long j) {
        this.f59490a = str;
        this.f59491b = i;
        this.f59492c = i2 < 600 ? 600 : i2;
        this.f59493d = j;
    }

    /* JADX INFO: renamed from: a */
    public boolean m83689a() {
        return this.f59491b == 5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C14145e)) {
            C14145e c14145e = (C14145e) obj;
            if (this.f59490a.equals(c14145e.f59490a) && this.f59491b == c14145e.f59491b && this.f59492c == c14145e.f59492c && this.f59493d == c14145e.f59493d) {
                return true;
            }
        }
        return false;
    }
}
