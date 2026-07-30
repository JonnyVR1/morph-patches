package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.android.exoplayer2.audio.C1841a;
import p153l.bmk0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1841a implements InterfaceC1886e {

    /* JADX INFO: renamed from: g */
    public static final C1841a f7179g = new e().m9589a();

    /* JADX INFO: renamed from: h */
    public static final String f7180h = bmk0.m105181z0(0);

    /* JADX INFO: renamed from: i */
    public static final String f7181i = bmk0.m105181z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f7182j = bmk0.m105181z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f7183k = bmk0.m105181z0(3);

    /* JADX INFO: renamed from: l */
    public static final String f7184l = bmk0.m105181z0(4);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC1886e.a<C1841a> f7185m = new InterfaceC1886e.a() { // from class: l.da1
        @Override // com.google.android.exoplayer2.InterfaceC1886e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1886e mo10034a(Bundle bundle) {
            return C1841a.m9585a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f7186a;

    /* JADX INFO: renamed from: b */
    public final int f7187b;

    /* JADX INFO: renamed from: c */
    public final int f7188c;

    /* JADX INFO: renamed from: d */
    public final int f7189d;

    /* JADX INFO: renamed from: e */
    public final int f7190e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d f7191f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$b */
    @RequiresApi(29)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9587a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$c */
    @RequiresApi(32)
    public static final class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9588a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$d */
    @RequiresApi(21)
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f7192a;

        public d(C1841a c1841a) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1841a.f7186a).setFlags(c1841a.f7187b).setUsage(c1841a.f7188c);
            int i = bmk0.f77313a;
            if (i >= 29) {
                b.m9587a(usage, c1841a.f7189d);
            }
            if (i >= 32) {
                c.m9588a(usage, c1841a.f7190e);
            }
            this.f7192a = usage.build();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public int f7193a = 0;

        /* JADX INFO: renamed from: b */
        public int f7194b = 0;

        /* JADX INFO: renamed from: c */
        public int f7195c = 1;

        /* JADX INFO: renamed from: d */
        public int f7196d = 1;

        /* JADX INFO: renamed from: e */
        public int f7197e = 0;

        /* JADX INFO: renamed from: a */
        public C1841a m9589a() {
            return new C1841a(this.f7193a, this.f7194b, this.f7195c, this.f7196d, this.f7197e);
        }

        /* JADX INFO: renamed from: b */
        public e m9590b(int i) {
            this.f7196d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public e m9591c(int i) {
            this.f7193a = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public e m9592d(int i) {
            this.f7194b = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public e m9593e(int i) {
            this.f7197e = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public e m9594f(int i) {
            this.f7195c = i;
            return this;
        }
    }

    public C1841a(int i, int i2, int i3, int i4, int i5) {
        this.f7186a = i;
        this.f7187b = i2;
        this.f7188c = i3;
        this.f7189d = i4;
        this.f7190e = i5;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1841a m9585a(Bundle bundle) {
        e eVar = new e();
        String str = f7180h;
        if (bundle.containsKey(str)) {
            eVar.m9591c(bundle.getInt(str));
        }
        String str2 = f7181i;
        if (bundle.containsKey(str2)) {
            eVar.m9592d(bundle.getInt(str2));
        }
        String str3 = f7182j;
        if (bundle.containsKey(str3)) {
            eVar.m9594f(bundle.getInt(str3));
        }
        String str4 = f7183k;
        if (bundle.containsKey(str4)) {
            eVar.m9590b(bundle.getInt(str4));
        }
        String str5 = f7184l;
        if (bundle.containsKey(str5)) {
            eVar.m9593e(bundle.getInt(str5));
        }
        return eVar.m9589a();
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: b */
    public d m9586b() {
        if (this.f7191f == null) {
            this.f7191f = new d();
        }
        return this.f7191f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1841a.class == obj.getClass()) {
            C1841a c1841a = (C1841a) obj;
            if (this.f7186a == c1841a.f7186a && this.f7187b == c1841a.f7187b && this.f7188c == c1841a.f7188c && this.f7189d == c1841a.f7189d && this.f7190e == c1841a.f7190e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f7186a) * 31) + this.f7187b) * 31) + this.f7188c) * 31) + this.f7189d) * 31) + this.f7190e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1886e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f7180h, this.f7186a);
        bundle.putInt(f7181i, this.f7187b);
        bundle.putInt(f7182j, this.f7188c);
        bundle.putInt(f7183k, this.f7189d);
        bundle.putInt(f7184l, this.f7190e);
        return bundle;
    }
}
