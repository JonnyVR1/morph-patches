package p153l;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.C3459a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class fid {

    /* JADX INFO: renamed from: a */
    public final fuc0 f99178a = new fuc0(zlj.f204933l);

    /* JADX INFO: renamed from: a */
    public final void m125677a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f99178a.m127454a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: b */
    public final mid m125678b(C3459a c3459a, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        o9l0 o9l0VarM17422e = c3459a.m17422e();
        ErrorCorrectionLevel errorCorrectionLevelM174891d = c3459a.m17421d().m174891d();
        m5c[] m5cVarArrM157097b = m5c.m157097b(c3459a.m17420c(), o9l0VarM17422e, errorCorrectionLevelM174891d);
        int iM157099c = 0;
        for (m5c m5cVar : m5cVarArrM157097b) {
            iM157099c += m5cVar.m157099c();
        }
        byte[] bArr = new byte[iM157099c];
        int i = 0;
        for (m5c m5cVar2 : m5cVarArrM157097b) {
            byte[] bArrM157098a = m5cVar2.m157098a();
            int iM157099c2 = m5cVar2.m157099c();
            m125677a(bArrM157098a, iM157099c2);
            int i2 = 0;
            while (i2 < iM157099c2) {
                bArr[i] = bArrM157098a[i2];
                i2++;
                i++;
            }
        }
        return vhd.m201278a(bArr, o9l0VarM17422e, errorCorrectionLevelM174891d, map);
    }

    /* JADX INFO: renamed from: c */
    public mid m125679c(d13 d13Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e;
        C3459a c3459a = new C3459a(d13Var);
        FormatException formatException = null;
        try {
            return m125678b(c3459a, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c3459a.m17423f();
                c3459a.m17424g(true);
                c3459a.m17422e();
                c3459a.m17421d();
                c3459a.m17419b();
                mid midVarM125678b = m125678b(c3459a, map);
                midVarM125678b.m158499m(new jvb0(true));
                return midVarM125678b;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            c3459a.m17423f();
            c3459a.m17424g(true);
            c3459a.m17422e();
            c3459a.m17421d();
            c3459a.m17419b();
            mid midVarM125678b2 = m125678b(c3459a, map);
            midVarM125678b2.m158499m(new jvb0(true));
            return midVarM125678b2;
        }
    }
}
