package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1868h;
import com.google.android.exoplayer2.InterfaceC1863e;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1868h implements InterfaceC1863e {

    /* JADX INFO: renamed from: e */
    public static final C1868h f7526e = new b(0).m10008e();

    /* JADX INFO: renamed from: f */
    public static final String f7527f = vck0.m197903z0(0);

    /* JADX INFO: renamed from: g */
    public static final String f7528g = vck0.m197903z0(1);

    /* JADX INFO: renamed from: h */
    public static final String f7529h = vck0.m197903z0(2);

    /* JADX INFO: renamed from: i */
    public static final String f7530i = vck0.m197903z0(3);

    /* JADX INFO: renamed from: j */
    public static final InterfaceC1863e.a<C1868h> f7531j = new InterfaceC1863e.a() { // from class: l.fyd
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1868h.m10003a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f7532a;

    /* JADX INFO: renamed from: b */
    @IntRange(from = 0)
    public final int f7533b;

    /* JADX INFO: renamed from: c */
    @IntRange(from = 0)
    public final int f7534c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public final String f7535d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f7536a;

        /* JADX INFO: renamed from: b */
        public int f7537b;

        /* JADX INFO: renamed from: c */
        public int f7538c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public String f7539d;

        public b(int i) {
            this.f7536a = i;
        }

        /* JADX INFO: renamed from: e */
        public C1868h m10008e() {
            p11.m167007a(this.f7537b <= this.f7538c);
            return new C1868h(this);
        }

        /* JADX INFO: renamed from: f */
        public b m10009f(@IntRange(from = 0) int i) {
            this.f7538c = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public b m10010g(@IntRange(from = 0) int i) {
            this.f7537b = i;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public b m10011h(@Nullable String str) {
            p11.m167007a(this.f7536a != 0 || str == null);
            this.f7539d = str;
            return this;
        }
    }

    public C1868h(b bVar) {
        this.f7532a = bVar.f7536a;
        this.f7533b = bVar.f7537b;
        this.f7534c = bVar.f7538c;
        this.f7535d = bVar.f7539d;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1868h m10003a(Bundle bundle) {
        int i = bundle.getInt(f7527f, 0);
        int i2 = bundle.getInt(f7528g, 0);
        int i3 = bundle.getInt(f7529h, 0);
        return new b(i).m10010g(i2).m10009f(i3).m10011h(bundle.getString(f7530i)).m10008e();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1868h)) {
            return false;
        }
        C1868h c1868h = (C1868h) obj;
        return this.f7532a == c1868h.f7532a && this.f7533b == c1868h.f7533b && this.f7534c == c1868h.f7534c && vck0.m197845c(this.f7535d, c1868h.f7535d);
    }

    public int hashCode() {
        int i = (((((527 + this.f7532a) * 31) + this.f7533b) * 31) + this.f7534c) * 31;
        String str = this.f7535d;
        return i + (str == null ? 0 : str.hashCode());
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.f7532a;
        if (i != 0) {
            bundle.putInt(f7527f, i);
        }
        int i2 = this.f7533b;
        if (i2 != 0) {
            bundle.putInt(f7528g, i2);
        }
        int i3 = this.f7534c;
        if (i3 != 0) {
            bundle.putInt(f7529h, i3);
        }
        String str = this.f7535d;
        if (str != null) {
            bundle.putString(f7530i, str);
        }
        return bundle;
    }
}
