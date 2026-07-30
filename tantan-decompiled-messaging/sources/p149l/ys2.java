package p149l;

import android.os.SystemClock;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ys2 implements cb20 {

    /* JADX INFO: renamed from: a */
    @Deprecated
    protected final xkl f199740a;

    /* JADX INFO: renamed from: b */
    private final em2 f199741b;

    /* JADX INFO: renamed from: c */
    protected final vp3 f199742c;

    public ys2(em2 em2Var) {
        this(em2Var, new vp3(4096));
    }

    @Override // p149l.cb20
    /* JADX INFO: renamed from: a */
    public sc20 mo105963a(Request<?> request) throws VolleyError {
        IOException iOException;
        okl oklVarMo117198a;
        byte[] bArr;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            try {
                oklVarMo117198a = this.f199741b.mo117198a(request, jkl.m141886c(request.getCacheEntry()));
                try {
                    int iM164864d = oklVarMo117198a.m164864d();
                    List<ixk> listM164863c = oklVarMo117198a.m164863c();
                    if (iM164864d == 304) {
                        return id20.m135386b(request, SystemClock.elapsedRealtime() - jElapsedRealtime, listM164863c);
                    }
                    InputStream inputStreamM164861a = oklVarMo117198a.m164861a();
                    byte[] bArrM135387c = inputStreamM164861a != null ? id20.m135387c(inputStreamM164861a, oklVarMo117198a.m164862b(), this.f199742c) : new byte[0];
                    try {
                        id20.m135388d(SystemClock.elapsedRealtime() - jElapsedRealtime, request, bArrM135387c, iM164864d);
                        if (iM164864d < 200 || iM164864d > 299) {
                            throw new IOException();
                        }
                        return new sc20(iM164864d, bArrM135387c, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listM164863c);
                    } catch (IOException e) {
                        e = e;
                        bArr = bArrM135387c;
                        iOException = e;
                        id20.m135385a(request, id20.m135389e(request, iOException, jElapsedRealtime, oklVarMo117198a, bArr));
                        request = request;
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                }
            } catch (IOException e3) {
                iOException = e3;
                oklVarMo117198a = null;
                bArr = null;
                request = request;
            }
            id20.m135385a(request, id20.m135389e(request, iOException, jElapsedRealtime, oklVarMo117198a, bArr));
            request = request;
        }
    }

    public ys2(em2 em2Var, vp3 vp3Var) {
        this.f199741b = em2Var;
        this.f199740a = em2Var;
        this.f199742c = vp3Var;
    }
}
