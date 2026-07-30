package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ResultMetadataType;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class r5d0 {

    /* JADX INFO: renamed from: a */
    public final String f161339a;

    /* JADX INFO: renamed from: b */
    public final byte[] f161340b;

    /* JADX INFO: renamed from: c */
    public final int f161341c;

    /* JADX INFO: renamed from: d */
    public s5d0[] f161342d;

    /* JADX INFO: renamed from: e */
    public final BarcodeFormat f161343e;

    /* JADX INFO: renamed from: f */
    public Map<ResultMetadataType, Object> f161344f;

    /* JADX INFO: renamed from: g */
    public final long f161345g;

    public r5d0(String str, byte[] bArr, s5d0[] s5d0VarArr, BarcodeFormat barcodeFormat, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, s5d0VarArr, barcodeFormat, j);
    }

    /* JADX INFO: renamed from: a */
    public void m179852a(s5d0[] s5d0VarArr) {
        s5d0[] s5d0VarArr2 = this.f161342d;
        if (s5d0VarArr2 == null) {
            this.f161342d = s5d0VarArr;
            return;
        }
        if (s5d0VarArr == null || s5d0VarArr.length <= 0) {
            return;
        }
        s5d0[] s5d0VarArr3 = new s5d0[s5d0VarArr2.length + s5d0VarArr.length];
        System.arraycopy(s5d0VarArr2, 0, s5d0VarArr3, 0, s5d0VarArr2.length);
        System.arraycopy(s5d0VarArr, 0, s5d0VarArr3, s5d0VarArr2.length, s5d0VarArr.length);
        this.f161342d = s5d0VarArr3;
    }

    /* JADX INFO: renamed from: b */
    public BarcodeFormat m179853b() {
        return this.f161343e;
    }

    /* JADX INFO: renamed from: c */
    public byte[] m179854c() {
        return this.f161340b;
    }

    /* JADX INFO: renamed from: d */
    public Map<ResultMetadataType, Object> m179855d() {
        return this.f161344f;
    }

    /* JADX INFO: renamed from: e */
    public s5d0[] m179856e() {
        return this.f161342d;
    }

    /* JADX INFO: renamed from: f */
    public String m179857f() {
        return this.f161339a;
    }

    /* JADX INFO: renamed from: g */
    public void m179858g(Map<ResultMetadataType, Object> map) {
        if (map != null) {
            Map<ResultMetadataType, Object> map2 = this.f161344f;
            if (map2 == null) {
                this.f161344f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m179859h(ResultMetadataType resultMetadataType, Object obj) {
        if (this.f161344f == null) {
            this.f161344f = new EnumMap(ResultMetadataType.class);
        }
        this.f161344f.put(resultMetadataType, obj);
    }

    public String toString() {
        return this.f161339a;
    }

    public r5d0(String str, byte[] bArr, s5d0[] s5d0VarArr, BarcodeFormat barcodeFormat) {
        this(str, bArr, s5d0VarArr, barcodeFormat, System.currentTimeMillis());
    }

    public r5d0(String str, byte[] bArr, int i, s5d0[] s5d0VarArr, BarcodeFormat barcodeFormat, long j) {
        this.f161339a = str;
        this.f161340b = bArr;
        this.f161341c = i;
        this.f161342d = s5d0VarArr;
        this.f161343e = barcodeFormat;
        this.f161344f = null;
        this.f161345g = j;
    }
}
