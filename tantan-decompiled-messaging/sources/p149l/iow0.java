package p149l;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class iow0 {

    /* JADX INFO: renamed from: a */
    public final Object f114207a;

    /* JADX INFO: renamed from: b */
    public final Object f114208b;

    /* JADX INFO: renamed from: c */
    public final byte[] f114209c;

    /* JADX INFO: renamed from: d */
    public final zzgvz f114210d;

    /* JADX INFO: renamed from: e */
    public final int f114211e;

    /* JADX INFO: renamed from: f */
    public final String f114212f;

    /* JADX INFO: renamed from: g */
    public final rnw0 f114213g;

    /* JADX INFO: renamed from: h */
    public final int f114214h;

    public iow0(Object obj, Object obj2, byte[] bArr, int i, zzgvz zzgvzVar, int i2, String str, rnw0 rnw0Var) {
        this.f114207a = obj;
        this.f114208b = obj2;
        this.f114209c = Arrays.copyOf(bArr, bArr.length);
        this.f114214h = i;
        this.f114210d = zzgvzVar;
        this.f114211e = i2;
        this.f114212f = str;
        this.f114213g = rnw0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m137391a() {
        return this.f114211e;
    }

    /* JADX INFO: renamed from: b */
    public final rnw0 m137392b() {
        return this.f114213g;
    }

    /* JADX INFO: renamed from: c */
    public final zzgvz m137393c() {
        return this.f114210d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m137394d() {
        return this.f114207a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m137395e() {
        return this.f114208b;
    }

    /* JADX INFO: renamed from: f */
    public final String m137396f() {
        return this.f114212f;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m137397g() {
        byte[] bArr = this.f114209c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public final int m137398h() {
        return this.f114214h;
    }
}
