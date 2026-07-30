package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class oxc0 {

    /* JADX INFO: renamed from: a */
    public final String f146191a;

    /* JADX INFO: renamed from: b */
    public final byte[] f146192b;

    /* JADX INFO: renamed from: c */
    public final int f146193c;

    /* JADX INFO: renamed from: d */
    public pxc0[] f146194d;

    /* JADX INFO: renamed from: e */
    public final BarcodeFormat f146195e;

    /* JADX INFO: renamed from: f */
    public Map<ResultMetadataType, Object> f146196f;

    /* JADX INFO: renamed from: g */
    public final long f146197g;

    public oxc0(String str, byte[] bArr, pxc0[] pxc0VarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, pxc0VarArr, barcodeFormat, j);
    }

    /* JADX INFO: renamed from: a */
    public void m166527a(pxc0[] pxc0VarArr) {
        pxc0[] pxc0VarArr2 = this.f146194d;
        if (pxc0VarArr2 == null) {
            this.f146194d = pxc0VarArr;
            return;
        }
        if (pxc0VarArr == null || pxc0VarArr.length <= 0) {
            return;
        }
        pxc0[] pxc0VarArr3 = new pxc0[pxc0VarArr2.length + pxc0VarArr.length];
        System.arraycopy(pxc0VarArr2, 0, pxc0VarArr3, 0, pxc0VarArr2.length);
        System.arraycopy(pxc0VarArr, 0, pxc0VarArr3, pxc0VarArr2.length, pxc0VarArr.length);
        this.f146194d = pxc0VarArr3;
    }

    /* JADX INFO: renamed from: b */
    public BarcodeFormat m166528b() {
        return this.f146195e;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m166529c() {
        return this.f146192b;
    }

    /* JADX INFO: renamed from: d */
    public Map<ResultMetadataType, Object> m166530d() {
        return this.f146196f;
    }

    /* JADX INFO: renamed from: e */
    public pxc0[] m166531e() {
        return this.f146194d;
    }

    /* JADX INFO: renamed from: f */
    public String m166532f() {
        return this.f146191a;
    }

    /* JADX INFO: renamed from: g */
    public void m166533g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f146196f;
            if (map2 == null) {
                this.f146196f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m166534h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f146196f == null) {
            this.f146196f = new EnumMap(ResultMetadataType.class);
        }
        this.f146196f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f146191a;
    }

    public oxc0(String str, byte[] bArr, pxc0[] pxc0VarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, pxc0VarArr, barcodeFormat, System.currentTimeMillis());
    }

    public oxc0(String str, byte[] bArr, int i, pxc0[] pxc0VarArr, BarcodeFormat barcodeFormat, long j) {
        this.f146191a = str;
        this.f146192b = bArr;
        this.f146193c = i;
        this.f146194d = pxc0VarArr;
        this.f146195e = barcodeFormat;
        this.f146196f = null;
        this.f146197g = j;
    }
}
