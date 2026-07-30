package p149l;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class xas0 extends mbs0 {

    /* JADX INFO: renamed from: i */
    public static final int f191804i;

    /* JADX INFO: renamed from: j */
    public static final int f191805j;

    /* JADX INFO: renamed from: k */
    public static final int f191806k;

    /* JADX INFO: renamed from: a */
    public final String f191807a;

    /* JADX INFO: renamed from: b */
    public final List f191808b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f191809c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final int f191810d;

    /* JADX INFO: renamed from: e */
    public final int f191811e;

    /* JADX INFO: renamed from: f */
    public final int f191812f;

    /* JADX INFO: renamed from: g */
    public final int f191813g;

    /* JADX INFO: renamed from: h */
    public final int f191814h;

    static {
        int iRgb = Color.rgb(12, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256, 206);
        f191804i = iRgb;
        f191805j = Color.rgb(204, 204, 204);
        f191806k = iRgb;
    }

    public xas0(String str, List list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.f191807a = str;
        for (int i3 = 0; i3 < list.size(); i3++) {
            zas0 zas0Var = (zas0) list.get(i3);
            this.f191808b.add(zas0Var);
            this.f191809c.add(zas0Var);
        }
        this.f191810d = num != null ? num.intValue() : f191805j;
        this.f191811e = num2 != null ? num2.intValue() : f191806k;
        this.f191812f = num3 != null ? num3.intValue() : 12;
        this.f191813g = i;
        this.f191814h = i2;
    }

    /* JADX INFO: renamed from: p8 */
    public final int m207668p8() {
        return this.f191812f;
    }

    /* JADX INFO: renamed from: q8 */
    public final List m207669q8() {
        return this.f191808b;
    }

    public final int zzb() {
        return this.f191813g;
    }

    public final int zzc() {
        return this.f191814h;
    }

    public final int zzd() {
        return this.f191810d;
    }

    public final int zze() {
        return this.f191811e;
    }

    @Override // p149l.nbs0
    public final String zzg() {
        return this.f191807a;
    }

    @Override // p149l.nbs0
    public final List zzh() {
        return this.f191809c;
    }
}
