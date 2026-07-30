package p153l;

import com.google.android.gms.internal.ads.zzgvz;
import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class oxw0 {

    /* JADX INFO: renamed from: a */
    public final Object f149692a;

    /* JADX INFO: renamed from: b */
    public final Object f149693b;

    /* JADX INFO: renamed from: c */
    public final byte[] f149694c;

    /* JADX INFO: renamed from: d */
    public final zzgvz f149695d;

    /* JADX INFO: renamed from: e */
    public final int f149696e;

    /* JADX INFO: renamed from: f */
    public final String f149697f;

    /* JADX INFO: renamed from: g */
    public final xww0 f149698g;

    /* JADX INFO: renamed from: h */
    public final int f149699h;

    public oxw0(Object obj, Object obj2, byte[] bArr, int i, zzgvz zzgvzVar, int i2, String str, xww0 xww0Var) {
        this.f149692a = obj;
        this.f149693b = obj2;
        this.f149694c = Arrays.copyOf(bArr, bArr.length);
        this.f149699h = i;
        this.f149695d = zzgvzVar;
        this.f149696e = i2;
        this.f149697f = str;
        this.f149698g = xww0Var;
    }

    /* JADX INFO: renamed from: a */
    public final int m169738a() {
        return this.f149696e;
    }

    /* JADX INFO: renamed from: b */
    public final xww0 m169739b() {
        return this.f149698g;
    }

    /* JADX INFO: renamed from: c */
    public final zzgvz m169740c() {
        return this.f149695d;
    }

    /* JADX INFO: renamed from: d */
    public final Object m169741d() {
        return this.f149692a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m169742e() {
        return this.f149693b;
    }

    /* JADX INFO: renamed from: f */
    public final String m169743f() {
        return this.f149697f;
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m169744g() {
        byte[] bArr = this.f149694c;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public final int m169745h() {
        return this.f149699h;
    }
}
