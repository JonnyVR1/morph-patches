package p149l;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.decoder.Decoder;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class sp1 implements ydc0 {
    @Override // p149l.ydc0
    /* JADX INFO: renamed from: a */
    public oxc0 mo131886a(nx2 nx2Var, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        pxc0[] pxc0VarArrM171834b;
        NotFoundException notFoundException;
        pxc0[] pxc0VarArrM171834b2;
        FormatException formatException;
        qxc0 qxc0Var;
        hxd hxdVar = new hxd(nx2Var.m161925a());
        ghd ghdVarM17322c = null;
        try {
            rp1 rp1VarM133326a = hxdVar.m133326a(false);
            pxc0VarArrM171834b = rp1VarM133326a.m171834b();
            try {
                formatException = null;
                ghdVarM17322c = new Decoder().m17322c(rp1VarM133326a);
                pxc0VarArrM171834b2 = pxc0VarArrM171834b;
                notFoundException = null;
            } catch (FormatException e) {
                e = e;
                formatException = e;
                pxc0VarArrM171834b2 = pxc0VarArrM171834b;
                notFoundException = null;
            } catch (NotFoundException e2) {
                e = e2;
                pxc0[] pxc0VarArr = pxc0VarArrM171834b;
                notFoundException = e;
                pxc0VarArrM171834b2 = pxc0VarArr;
                formatException = null;
            }
        } catch (FormatException e3) {
            e = e3;
            pxc0VarArrM171834b = null;
        } catch (NotFoundException e4) {
            e = e4;
            pxc0VarArrM171834b = null;
        }
        if (ghdVarM17322c == null) {
            try {
                rp1 rp1VarM133326a2 = hxdVar.m133326a(true);
                pxc0VarArrM171834b2 = rp1VarM133326a2.m171834b();
                ghdVarM17322c = new Decoder().m17322c(rp1VarM133326a2);
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
        pxc0[] pxc0VarArr2 = pxc0VarArrM171834b2;
        if (map != null && (qxc0Var = (qxc0) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (pxc0 pxc0Var : pxc0VarArr2) {
                qxc0Var.mo176992a(pxc0Var);
            }
        }
        oxc0 oxc0Var = new oxc0(ghdVarM17322c.m126171h(), ghdVarM17322c.m126168e(), ghdVarM17322c.m126166c(), pxc0VarArr2, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> listM126164a = ghdVarM17322c.m126164a();
        if (listM126164a != null) {
            oxc0Var.m166534h(ResultMetadataType.BYTE_SEGMENTS, listM126164a);
        }
        String strM126165b = ghdVarM17322c.m126165b();
        if (strM126165b != null) {
            oxc0Var.m166534h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strM126165b);
        }
        return oxc0Var;
    }

    @Override // p149l.ydc0
    public void reset() {
    }
}
