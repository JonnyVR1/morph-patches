package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1891h;
import com.google.android.exoplayer2.InterfaceC1886e;
import p153l.bmk0;
import p153l.w11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1891h implements InterfaceC1886e {

    /* JADX INFO: renamed from: e */
    public static final C1891h f7563e = new b(0).m10062e();

    /* JADX INFO: renamed from: f */
    public static final String f7564f = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f7565g = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: h */
    public static final String f7566h = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: i */
    public static final String f7567i = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1886e.a<C1891h> f7568j = new InterfaceC1886e.a() { // from class: l.szd
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1891h.m10057a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f7569a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f7570b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0)
    public final int f7571c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f7572d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f7573a;

        /* JADX INFO: renamed from: b */
        public int f7574b;

        /* JADX INFO: renamed from: c */
        public int f7575c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f7576d;

        public b(int i) {
            this.f7573a = i;
        }

        /* JADX INFO: renamed from: e */
        public C1891h m10062e() {
            w11.m204365a(this.f7574b <= this.f7575c);
            return new C1891h(this);
        }

        /* JADX INFO: renamed from: f */
        public b m10063f(@IntRange(from = 0) int i) {
            this.f7575c = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m10064g(@IntRange(from = 0) int i) {
            this.f7574b = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m10065h(@Nullable String str) {
            w11.m204365a(this.f7573a != 0 || str == null);
            this.f7576d = str;
            return this;
        }
    }

    public C1891h(b bVar) {
        this.f7569a = bVar.f7573a;
        this.f7570b = bVar.f7574b;
        this.f7571c = bVar.f7575c;
        this.f7572d = bVar.f7576d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1891h m10057a(Bundle bundle) {
        int i = bundle.getInt(f7564f, 0);
        int i2 = bundle.getInt(f7565g, 0);
        int i3 = bundle.getInt(f7566h, 0);
        return new b(i).m10064g(i2).m10063f(i3).m10065h(bundle.getString(f7567i)).m10062e();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1891h)) {
            return false;
        }
        C1891h c1891h = (C1891h) obj;
        return this.f7569a == c1891h.f7569a && this.f7570b == c1891h.f7570b && this.f7571c == c1891h.f7571c && bmk0.m105123c(this.f7572d, c1891h.f7572d);
    }

    public int hashCode() {
        int i = (((((527 + this.f7569a) * 31) + this.f7570b) * 31) + this.f7571c) * 31;
        String str = this.f7572d;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f7569a;
        if (i != 0) {
            bundle.putInt(f7564f, i);
        }
        int i2 = this.f7570b;
        if (i2 != 0) {
            bundle.putInt(f7565g, i2);
        }
        int i3 = this.f7571c;
        if (i3 != 0) {
            bundle.putInt(f7566h, i3);
        }
        String str = this.f7572d;
        if (str != null) {
            bundle.putString(f7567i, str);
        }
        return bundle;
    }
}
