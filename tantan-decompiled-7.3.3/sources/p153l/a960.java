package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a960 implements fmc0 {
    /* JADX INFO: renamed from: b */
    public static r5d0[] m96534b(cy2 cy2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        x860 x860VarM208611c = wyd.m208611c(cy2Var, map, z);
        for (s5d0[] s5d0VarArr : x860VarM208611c.m209690b()) {
            mid midVarM108422i = c960.m108422i(x860VarM208611c.m209689a(), s5d0VarArr[4], s5d0VarArr[5], s5d0VarArr[6], s5d0VarArr[7], m96537e(s5d0VarArr), m96535c(s5d0VarArr));
            r5d0 r5d0Var = new r5d0(midVarM108422i.m158494h(), midVarM108422i.m158491e(), s5d0VarArr, BarcodeFormat.PDF_417);
            r5d0Var.m179859h(ResultMetadataType.ERROR_CORRECTION_LEVEL, midVarM108422i.m158488b());
            b960 b960Var = (b960) midVarM108422i.m158490d();
            if (b960Var != null) {
                r5d0Var.m179859h(ResultMetadataType.PDF417_EXTRA_METADATA, b960Var);
            }
            arrayList.add(r5d0Var);
        }
        return (r5d0[]) arrayList.toArray(new r5d0[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c */
    public static int m96535c(s5d0[] s5d0VarArr) {
        return Math.max(Math.max(m96536d(s5d0VarArr[0], s5d0VarArr[4]), (m96536d(s5d0VarArr[6], s5d0VarArr[2]) * 17) / 18), Math.max(m96536d(s5d0VarArr[1], s5d0VarArr[5]), (m96536d(s5d0VarArr[7], s5d0VarArr[3]) * 17) / 18));
    }

    /* JADX INFO: renamed from: d */
    public static int m96536d(s5d0 s5d0Var, s5d0 s5d0Var2) {
        if (s5d0Var == null || s5d0Var2 == null) {
            return 0;
        }
        return (int) Math.abs(s5d0Var.m184657c() - s5d0Var2.m184657c());
    }

    /* JADX INFO: renamed from: e */
    public static int m96537e(s5d0[] s5d0VarArr) {
        return Math.min(Math.min(m96538f(s5d0VarArr[0], s5d0VarArr[4]), (m96538f(s5d0VarArr[6], s5d0VarArr[2]) * 17) / 18), Math.min(m96538f(s5d0VarArr[1], s5d0VarArr[5]), (m96538f(s5d0VarArr[7], s5d0VarArr[3]) * 17) / 18));
    }

    /* JADX INFO: renamed from: f */
    public static int m96538f(s5d0 s5d0Var, s5d0 s5d0Var2) {
        return (s5d0Var == null || s5d0Var2 == null) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) Math.abs(s5d0Var.m184657c() - s5d0Var2.m184657c());
    }

    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        r5d0 r5d0Var;
        r5d0[] r5d0VarArrM96534b = m96534b(cy2Var, map, false);
        if (r5d0VarArrM96534b == null || r5d0VarArrM96534b.length == 0 || (r5d0Var = r5d0VarArrM96534b[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return r5d0Var;
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
