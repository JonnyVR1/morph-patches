package p153l;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ot2 implements lj20 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    protected final nnl f148917a;

    /* JADX INFO: renamed from: b */
    private final mm2 f148918b;

    /* JADX INFO: renamed from: c */
    protected final vq3 f148919c;

    public ot2(mm2 mm2Var) {
        this(mm2Var, new vq3(4096));
    }

    @Override // p153l.lj20
    /* JADX INFO: renamed from: a */
    public cl20 mo154456a(Request<?> request) throws VolleyError {
        IOException iOException;
        bnl bnlVarMo141341a;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                bnlVarMo141341a = this.f148918b.mo141341a(request, xml.m211734c(request.getCacheEntry()));
                try {
                    int iM105499d = bnlVarMo141341a.m105499d();
                    List<yzk> listM105498c = bnlVarMo141341a.m105498c();
                    if (iM105499d == 304) {
                        return sl20.m186553b(request, SystemClock.elapsedRealtime() - jElapsedRealtime, listM105498c);
                    }
                    InputStream inputStreamM105496a = bnlVarMo141341a.m105496a();
                    byte[] bArrM186554c = inputStreamM105496a != null ? sl20.m186554c(inputStreamM105496a, bnlVarMo141341a.m105497b(), this.f148919c) : new byte[0];
                    try {
                        sl20.m186555d(SystemClock.elapsedRealtime() - jElapsedRealtime, request, bArrM186554c, iM105499d);
                        if (iM105499d < 200 || iM105499d > 299) {
                            throw new IOException();
                        }
                        return new cl20(iM105499d, bArrM186554c, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listM105498c);
                    } catch (IOException e) {
                        e = e;
                        bArr = bArrM186554c;
                        iOException = e;
                        sl20.m186552a(request, sl20.m186556e(request, iOException, jElapsedRealtime, bnlVarMo141341a, bArr));
                        request = request;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                }
            } catch (IOException e3) {
                iOException = e3;
                bnlVarMo141341a = null;
                bArr = null;
                request = request;
            }
            sl20.m186552a(request, sl20.m186556e(request, iOException, jElapsedRealtime, bnlVarMo141341a, bArr));
            request = request;
        }
    }

    public ot2(mm2 mm2Var, vq3 vq3Var) {
        this.f148918b = mm2Var;
        this.f148917a = mm2Var;
        this.f148919c = vq3Var;
    }
}
