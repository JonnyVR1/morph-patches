package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.android.exoplayer2.audio.C1818a;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1818a implements InterfaceC1863e {

    /* JADX INFO: renamed from: g */
    public static final C1818a f7142g = new e().m9535a();

    /* JADX INFO: renamed from: h */
    public static final String f7143h = vck0.m197903z0(0);

    /* JADX INFO: renamed from: i */
    public static final String f7144i = vck0.m197903z0(1);

    /* JADX INFO: renamed from: j */
    public static final String f7145j = vck0.m197903z0(2);

    /* JADX INFO: renamed from: k */
    public static final String f7146k = vck0.m197903z0(3);

    /* JADX INFO: renamed from: l */
    public static final String f7147l = vck0.m197903z0(4);

    /* JADX INFO: renamed from: m */
    public static final InterfaceC1863e.a<C1818a> f7148m = new InterfaceC1863e.a() { // from class: l.w91
        @Override // com.google.android.exoplayer2.InterfaceC1863e.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC1863e mo9980a(Bundle bundle) {
            return C1818a.m9531a(bundle);
        }
    };

    /* JADX INFO: renamed from: a */
    public final int f7149a;

    /* JADX INFO: renamed from: b */
    public final int f7150b;

    /* JADX INFO: renamed from: c */
    public final int f7151c;

    /* JADX INFO: renamed from: d */
    public final int f7152d;

    /* JADX INFO: renamed from: e */
    public final int f7153e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public d f7154f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$b */
    @RequiresApi(29)
    public static final class b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9533a(AudioAttributes.Builder builder, int i) {
            builder.setAllowedCapturePolicy(i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$c */
    @RequiresApi(32)
    public static final class c {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static void m9534a(AudioAttributes.Builder builder, int i) {
            builder.setSpatializationBehavior(i);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$d */
    @RequiresApi(21)
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final AudioAttributes f7155a;

        public d(C1818a c1818a) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1818a.f7149a).setFlags(c1818a.f7150b).setUsage(c1818a.f7151c);
            int i = vck0.f180948a;
            if (i >= 29) {
                b.m9533a(usage, c1818a.f7152d);
            }
            if (i >= 32) {
                c.m9534a(usage, c1818a.f7153e);
            }
            this.f7155a = usage.build();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.audio.a$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public int f7156a = 0;

        /* JADX INFO: renamed from: b */
        public int f7157b = 0;

        /* JADX INFO: renamed from: c */
        public int f7158c = 1;

        /* JADX INFO: renamed from: d */
        public int f7159d = 1;

        /* JADX INFO: renamed from: e */
        public int f7160e = 0;

        /* JADX INFO: renamed from: a */
        public C1818a m9535a() {
            return new C1818a(this.f7156a, this.f7157b, this.f7158c, this.f7159d, this.f7160e);
        }

        /* JADX INFO: renamed from: b */
        public e m9536b(int i) {
            this.f7159d = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public e m9537c(int i) {
            this.f7156a = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public e m9538d(int i) {
            this.f7157b = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public e m9539e(int i) {
            this.f7160e = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public e m9540f(int i) {
            this.f7158c = i;
            return this;
        }
    }

    public C1818a(int i, int i2, int i3, int i4, int i5) {
        this.f7149a = i;
        this.f7150b = i2;
        this.f7151c = i3;
        this.f7152d = i4;
        this.f7153e = i5;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C1818a m9531a(Bundle bundle) {
        e eVar = new e();
        String str = f7143h;
        if (bundle.containsKey(str)) {
            eVar.m9537c(bundle.getInt(str));
        }
        String str2 = f7144i;
        if (bundle.containsKey(str2)) {
            eVar.m9538d(bundle.getInt(str2));
        }
        String str3 = f7145j;
        if (bundle.containsKey(str3)) {
            eVar.m9540f(bundle.getInt(str3));
        }
        String str4 = f7146k;
        if (bundle.containsKey(str4)) {
            eVar.m9536b(bundle.getInt(str4));
        }
        String str5 = f7147l;
        if (bundle.containsKey(str5)) {
            eVar.m9539e(bundle.getInt(str5));
        }
        return eVar.m9535a();
    }

    @RequiresApi(21)
    /* JADX INFO: renamed from: b */
    public d m9532b() {
        if (this.f7154f == null) {
            this.f7154f = new d();
        }
        return this.f7154f;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1818a.class == obj.getClass()) {
            C1818a c1818a = (C1818a) obj;
            if (this.f7149a == c1818a.f7149a && this.f7150b == c1818a.f7150b && this.f7151c == c1818a.f7151c && this.f7152d == c1818a.f7152d && this.f7153e == c1818a.f7153e) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f7149a) * 31) + this.f7150b) * 31) + this.f7151c) * 31) + this.f7152d) * 31) + this.f7153e;
    }

    @Override // com.google.android.exoplayer2.InterfaceC1863e
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f7143h, this.f7149a);
        bundle.putInt(f7144i, this.f7150b);
        bundle.putInt(f7145j, this.f7151c);
        bundle.putInt(f7146k, this.f7152d);
        bundle.putInt(f7147l, this.f7153e);
        return bundle;
    }
}
