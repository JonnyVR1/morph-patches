package p153l;

import com.google.android.gms.internal.ads.C2269s5;
import com.google.android.gms.internal.ads.zzgyl;
import com.google.android.gms.internal.ads.zzhag;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class egx0 {
    /* JADX INFO: renamed from: a */
    public static int m120817a(byte[] bArr, int i, dgx0 dgx0Var) throws zzhag {
        int iM120824h = m120824h(bArr, i, dgx0Var);
        int i2 = dgx0Var.f88401a;
        if (i2 < 0) {
            throw zzhag.zzf();
        }
        if (i2 > bArr.length - iM120824h) {
            throw zzhag.zzj();
        }
        if (i2 == 0) {
            dgx0Var.f88403c = zzgyl.zzb;
            return iM120824h;
        }
        dgx0Var.f88403c = zzgyl.zzv(bArr, iM120824h, i2);
        return iM120824h + i2;
    }

    /* JADX INFO: renamed from: b */
    public static int m120818b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m120819c(ukx0 ukx0Var, byte[] bArr, int i, int i2, int i3, dgx0 dgx0Var) throws IOException {
        Object objZze = ukx0Var.zze();
        int iM120828l = m120828l(objZze, ukx0Var, bArr, i, i2, i3, dgx0Var);
        ukx0Var.mo13338a(objZze);
        dgx0Var.f88403c = objZze;
        return iM120828l;
    }

    /* JADX INFO: renamed from: d */
    public static int m120820d(ukx0 ukx0Var, byte[] bArr, int i, int i2, dgx0 dgx0Var) throws IOException {
        Object objZze = ukx0Var.zze();
        int iM120829m = m120829m(objZze, ukx0Var, bArr, i, i2, dgx0Var);
        ukx0Var.mo13338a(objZze);
        dgx0Var.f88403c = objZze;
        return iM120829m;
    }

    /* JADX INFO: renamed from: e */
    public static int m120821e(ukx0 ukx0Var, int i, byte[] bArr, int i2, int i3, fjx0 fjx0Var, dgx0 dgx0Var) throws IOException {
        int iM120820d = m120820d(ukx0Var, bArr, i2, i3, dgx0Var);
        fjx0Var.add(dgx0Var.f88403c);
        while (iM120820d < i3) {
            int iM120824h = m120824h(bArr, iM120820d, dgx0Var);
            if (i != dgx0Var.f88401a) {
                break;
            }
            iM120820d = m120820d(ukx0Var, bArr, iM120824h, i3, dgx0Var);
            fjx0Var.add(dgx0Var.f88403c);
        }
        return iM120820d;
    }

    /* JADX INFO: renamed from: f */
    public static int m120822f(byte[] bArr, int i, fjx0 fjx0Var, dgx0 dgx0Var) throws IOException {
        whx0 whx0Var = (whx0) fjx0Var;
        int iM120824h = m120824h(bArr, i, dgx0Var);
        int i2 = dgx0Var.f88401a + iM120824h;
        while (iM120824h < i2) {
            iM120824h = m120824h(bArr, iM120824h, dgx0Var);
            whx0Var.zzh(dgx0Var.f88401a);
        }
        if (iM120824h == i2) {
            return iM120824h;
        }
        throw zzhag.zzj();
    }

    /* JADX INFO: renamed from: g */
    public static int m120823g(int i, byte[] bArr, int i2, int i3, plx0 plx0Var, dgx0 dgx0Var) throws zzhag {
        if ((i >>> 3) == 0) {
            throw zzhag.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM120827k = m120827k(bArr, i2, dgx0Var);
            plx0Var.m172898j(i, Long.valueOf(dgx0Var.f88402b));
            return iM120827k;
        }
        if (i4 == 1) {
            plx0Var.m172898j(i, Long.valueOf(m120830n(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM120824h = m120824h(bArr, i2, dgx0Var);
            int i5 = dgx0Var.f88401a;
            if (i5 < 0) {
                throw zzhag.zzf();
            }
            if (i5 > bArr.length - iM120824h) {
                throw zzhag.zzj();
            }
            if (i5 == 0) {
                plx0Var.m172898j(i, zzgyl.zzb);
            } else {
                plx0Var.m172898j(i, zzgyl.zzv(bArr, iM120824h, i5));
            }
            return iM120824h + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzhag.zzc();
            }
            plx0Var.m172898j(i, Integer.valueOf(m120818b(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        plx0 plx0VarM172891f = plx0.m172891f();
        int i7 = 0;
        while (i2 < i3) {
            int iM120824h2 = m120824h(bArr, i2, dgx0Var);
            i7 = dgx0Var.f88401a;
            if (i7 == i6) {
                i2 = iM120824h2;
                break;
            }
            i2 = m120823g(i7, bArr, iM120824h2, i3, plx0VarM172891f, dgx0Var);
        }
        if (i2 > i3 || i7 != i6) {
            throw zzhag.zzg();
        }
        plx0Var.m172898j(i, plx0VarM172891f);
        return i2;
    }

    /* JADX INFO: renamed from: h */
    public static int m120824h(byte[] bArr, int i, dgx0 dgx0Var) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m120825i(b, bArr, i2, dgx0Var);
        }
        dgx0Var.f88401a = b;
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public static int m120825i(int i, byte[] bArr, int i2, dgx0 dgx0Var) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            dgx0Var.f88401a = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            dgx0Var.f88401a = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            dgx0Var.f88401a = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            dgx0Var.f88401a = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                dgx0Var.f88401a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m120826j(int i, byte[] bArr, int i2, int i3, fjx0 fjx0Var, dgx0 dgx0Var) {
        whx0 whx0Var = (whx0) fjx0Var;
        int iM120824h = m120824h(bArr, i2, dgx0Var);
        whx0Var.zzh(dgx0Var.f88401a);
        while (iM120824h < i3) {
            int iM120824h2 = m120824h(bArr, iM120824h, dgx0Var);
            if (i != dgx0Var.f88401a) {
                break;
            }
            iM120824h = m120824h(bArr, iM120824h2, dgx0Var);
            whx0Var.zzh(dgx0Var.f88401a);
        }
        return iM120824h;
    }

    /* JADX INFO: renamed from: k */
    public static int m120827k(byte[] bArr, int i, dgx0 dgx0Var) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            dgx0Var.f88402b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        dgx0Var.f88402b = j2;
        return i3;
    }

    /* JADX INFO: renamed from: l */
    public static int m120828l(Object obj, ukx0 ukx0Var, byte[] bArr, int i, int i2, int i3, dgx0 dgx0Var) throws IOException {
        int iM13329A = ((C2269s5) ukx0Var).m13329A(obj, bArr, i, i2, i3, dgx0Var);
        dgx0Var.f88403c = obj;
        return iM13329A;
    }

    /* JADX INFO: renamed from: m */
    public static int m120829m(Object obj, ukx0 ukx0Var, byte[] bArr, int i, int i2, dgx0 dgx0Var) throws IOException {
        int iM120825i = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM120825i = m120825i(i3, bArr, iM120825i, dgx0Var);
            i3 = dgx0Var.f88401a;
        }
        int i4 = iM120825i;
        if (i3 < 0 || i3 > i2 - i4) {
            throw zzhag.zzj();
        }
        int i5 = i4 + i3;
        ukx0Var.mo13341d(obj, bArr, i4, i5, dgx0Var);
        dgx0Var.f88403c = obj;
        return i5;
    }

    /* JADX INFO: renamed from: n */
    public static long m120830n(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}
