package p153l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class dks0 extends sks0 {

    /* JADX INFO: renamed from: i */
    public static final int f89432i;

    /* JADX INFO: renamed from: j */
    public static final int f89433j;

    /* JADX INFO: renamed from: k */
    public static final int f89434k;

    /* JADX INFO: renamed from: a */
    public final String f89435a;

    /* JADX INFO: renamed from: b */
    public final List f89436b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f89437c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final int f89438d;

    /* JADX INFO: renamed from: e */
    public final int f89439e;

    /* JADX INFO: renamed from: f */
    public final int f89440f;

    /* JADX INFO: renamed from: g */
    public final int f89441g;

    /* JADX INFO: renamed from: h */
    public final int f89442h;

    static {
        int iRgb = Color.rgb(12, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 206);
        f89432i = iRgb;
        f89433j = Color.rgb(204, 204, 204);
        f89434k = iRgb;
    }

    public dks0(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f89435a = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            fks0 fks0Var = (fks0) list.get(i3);
            this.f89436b.add(fks0Var);
            this.f89437c.add(fks0Var);
        }
        this.f89438d = num != null ? num.intValue() : f89433j;
        this.f89439e = num2 != null ? num2.intValue() : f89434k;
        this.f89440f = num3 != null ? num3.intValue() : 12;
        this.f89441g = i;
        this.f89442h = i2;
    }

    /* JADX INFO: renamed from: p8 */
    public final int m116673p8() {
        return this.f89440f;
    }

    /* JADX INFO: renamed from: q8 */
    public final List m116674q8() {
        return this.f89436b;
    }

    public final int zzb() {
        return this.f89441g;
    }

    public final int zzc() {
        return this.f89442h;
    }

    public final int zzd() {
        return this.f89438d;
    }

    public final int zze() {
        return this.f89439e;
    }

    @Override // p153l.tks0
    public final String zzg() {
        return this.f89435a;
    }

    @Override // p153l.tks0
    public final List zzh() {
        return this.f89437c;
    }
}
