package p149l;

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
public final class v060 implements ydc0 {
    /* JADX INFO: renamed from: b */
    public static oxc0[] m196472b(nx2 nx2Var, Map<DecodeHintType, ?> map, boolean z) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        s060 s060VarM138810c = ixd.m138810c(nx2Var, map, z);
        for (pxc0[] pxc0VarArr : s060VarM138810c.m181850b()) {
            ghd ghdVarM206590i = x060.m206590i(s060VarM138810c.m181849a(), pxc0VarArr[4], pxc0VarArr[5], pxc0VarArr[6], pxc0VarArr[7], m196475e(pxc0VarArr), m196473c(pxc0VarArr));
            oxc0 oxc0Var = new oxc0(ghdVarM206590i.m126171h(), ghdVarM206590i.m126168e(), pxc0VarArr, BarcodeFormat.PDF_417);
            oxc0Var.m166534h(ResultMetadataType.ERROR_CORRECTION_LEVEL, ghdVarM206590i.m126165b());
            w060 w060Var = (w060) ghdVarM206590i.m126167d();
            if (w060Var != null) {
                oxc0Var.m166534h(ResultMetadataType.PDF417_EXTRA_METADATA, w060Var);
            }
            arrayList.add(oxc0Var);
        }
        return (oxc0[]) arrayList.toArray(new oxc0[arrayList.size()]);
    }

    /* JADX INFO: renamed from: c */
    public static int m196473c(pxc0[] pxc0VarArr) {
        return Math.max(Math.max(m196474d(pxc0VarArr[0], pxc0VarArr[4]), (m196474d(pxc0VarArr[6], pxc0VarArr[2]) * 17) / 18), Math.max(m196474d(pxc0VarArr[1], pxc0VarArr[5]), (m196474d(pxc0VarArr[7], pxc0VarArr[3]) * 17) / 18));
    }

    /* JADX INFO: renamed from: d */
    public static int m196474d(pxc0 pxc0Var, pxc0 pxc0Var2) {
        if (pxc0Var == null || pxc0Var2 == null) {
            return 0;
        }
        return (int) Math.abs(pxc0Var.m171831c() - pxc0Var2.m171831c());
    }

    /* JADX INFO: renamed from: e */
    public static int m196475e(pxc0[] pxc0VarArr) {
        return Math.min(Math.min(m196476f(pxc0VarArr[0], pxc0VarArr[4]), (m196476f(pxc0VarArr[6], pxc0VarArr[2]) * 17) / 18), Math.min(m196476f(pxc0VarArr[1], pxc0VarArr[5]), (m196476f(pxc0VarArr[7], pxc0VarArr[3]) * 17) / 18));
    }

    /* JADX INFO: renamed from: f */
    public static int m196476f(pxc0 pxc0Var, pxc0 pxc0Var2) {
        return (pxc0Var == null || pxc0Var2 == null) ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) Math.abs(pxc0Var.m171831c() - pxc0Var2.m171831c());
    }

    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        oxc0 oxc0Var;
        oxc0[] oxc0VarArrM196472b = m196472b(nx2Var, map, false);
        if (oxc0VarArrM196472b == null || oxc0VarArrM196472b.length == 0 || (oxc0Var = oxc0VarArrM196472b[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return oxc0Var;
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
