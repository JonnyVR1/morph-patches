package p149l;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.C3436a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zgd {

    /* JADX INFO: renamed from: a */
    public final ylc0 f203034a = new ylc0(gjj.f103074l);

    /* JADX INFO: renamed from: a */
    public final void m218640a(byte[] bArr, int i) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        try {
            this.f203034a.m215261a(iArr, bArr.length - i);
            for (int i3 = 0; i3 < i; i3++) {
                bArr[i3] = (byte) iArr[i3];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    /* JADX INFO: renamed from: b */
    public final ghd m218641b(C3436a c3436a, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        j0l0 j0l0VarM17367e = c3436a.m17367e();
        ErrorCorrectionLevel errorCorrectionLevelM200655d = c3436a.m17366d().m200655d();
        e4c[] e4cVarArrM114669b = e4c.m114669b(c3436a.m17365c(), j0l0VarM17367e, errorCorrectionLevelM200655d);
        int iM114671c = 0;
        for (e4c e4cVar : e4cVarArrM114669b) {
            iM114671c += e4cVar.m114671c();
        }
        byte[] bArr = new byte[iM114671c];
        int i = 0;
        for (e4c e4cVar2 : e4cVarArrM114669b) {
            byte[] bArrM114670a = e4cVar2.m114670a();
            int iM114671c2 = e4cVar2.m114671c();
            m218640a(bArrM114670a, iM114671c2);
            int i2 = 0;
            while (i2 < iM114671c2) {
                bArr[i] = bArrM114670a[i2];
                i2++;
                i++;
            }
        }
        return pgd.m168667a(bArr, j0l0VarM17367e, errorCorrectionLevelM200655d, map);
    }

    /* JADX INFO: renamed from: c */
    public ghd m218642c(o03 o03Var, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e;
        C3436a c3436a = new C3436a(o03Var);
        FormatException formatException = null;
        try {
            return m218641b(c3436a, map);
        } catch (ChecksumException e2) {
            e = e2;
            try {
                c3436a.m17368f();
                c3436a.m17369g(true);
                c3436a.m17367e();
                c3436a.m17366d();
                c3436a.m17364b();
                ghd ghdVarM218641b = m218641b(c3436a, map);
                ghdVarM218641b.m126176m(new fnb0(true));
                return ghdVarM218641b;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e;
            }
        } catch (FormatException e3) {
            e = null;
            formatException = e3;
            c3436a.m17368f();
            c3436a.m17369g(true);
            c3436a.m17367e();
            c3436a.m17366d();
            c3436a.m17364b();
            ghd ghdVarM218641b2 = m218641b(c3436a, map);
            ghdVarM218641b2.m126176m(new fnb0(true));
            return ghdVarM218641b2;
        }
    }
}
