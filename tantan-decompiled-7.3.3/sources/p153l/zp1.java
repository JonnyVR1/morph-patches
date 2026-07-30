package p153l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.decoder.Decoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class zp1 implements fmc0 {
    @Override // p153l.fmc0
    /* JADX INFO: renamed from: a */
    public r5d0 mo96539a(cy2 cy2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        s5d0[] s5d0VarArrM118739b;
        NotFoundException notFoundException;
        s5d0[] s5d0VarArrM118739b2;
        FormatException formatException;
        t5d0 t5d0Var;
        vyd vydVar = new vyd(cy2Var.m113086a());
        mid midVarM17377c = null;
        try {
            yp1 yp1VarM203974a = vydVar.m203974a(false);
            s5d0VarArrM118739b = yp1VarM203974a.m118739b();
            try {
                formatException = null;
                midVarM17377c = new Decoder().m17377c(yp1VarM203974a);
                s5d0VarArrM118739b2 = s5d0VarArrM118739b;
                notFoundException = null;
            } catch (FormatException e) {
                e = e;
                formatException = e;
                s5d0VarArrM118739b2 = s5d0VarArrM118739b;
                notFoundException = null;
            } catch (NotFoundException e2) {
                e = e2;
                s5d0[] s5d0VarArr = s5d0VarArrM118739b;
                notFoundException = e;
                s5d0VarArrM118739b2 = s5d0VarArr;
                formatException = null;
            }
        } catch (FormatException e3) {
            e = e3;
            s5d0VarArrM118739b = null;
        } catch (NotFoundException e4) {
            e = e4;
            s5d0VarArrM118739b = null;
        }
        if (midVarM17377c == null) {
            try {
                yp1 yp1VarM203974a2 = vydVar.m203974a(true);
                s5d0VarArrM118739b2 = yp1VarM203974a2.m118739b();
                midVarM17377c = new Decoder().m17377c(yp1VarM203974a2);
            } catch (FormatException | NotFoundException e5) {
                if (notFoundException != null) {
                    throw notFoundException;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e5;
            }
        }
        s5d0[] s5d0VarArr2 = s5d0VarArrM118739b2;
        if (map != null && (t5d0Var = (t5d0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (s5d0 s5d0Var : s5d0VarArr2) {
                t5d0Var.mo189379a(s5d0Var);
            }
        }
        r5d0 r5d0Var = new r5d0(midVarM17377c.m158494h(), midVarM17377c.m158491e(), midVarM17377c.m158489c(), s5d0VarArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> listM158487a = midVarM17377c.m158487a();
        if (listM158487a != null) {
            r5d0Var.m179859h(ResultMetadataType.BYTE_SEGMENTS, listM158487a);
        }
        String strM158488b = midVarM17377c.m158488b();
        if (strM158488b != null) {
            r5d0Var.m179859h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM158488b);
        }
        return r5d0Var;
    }

    @Override // p153l.fmc0
    public void reset() {
    }
}
