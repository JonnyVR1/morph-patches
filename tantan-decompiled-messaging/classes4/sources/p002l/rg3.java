package p002l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rg3 {
    /* JADX INFO: renamed from: a */
    public synchronized s460 m21919a(lec0 lec0Var) throws Exception {
        s460 s460VarMo18305b;
        lec0Var.m17157m().mo26978a("start read buffer");
        BufferedSource bufferedSourceM12776L = lec0Var.m17150f().m12776L();
        wkf0 wkf0VarMo18304a = lec0Var.m17160p().mo18304a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[wkf0VarMo18304a.mo17498d()]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferWrap.order(byteOrder).array();
        bufferedSourceM12776L.readFully(bArrArray);
        Buffer buffer = new Buffer();
        buffer.write(bArrArray);
        wkf0VarMo18304a.mo17495a(buffer, lec0Var);
        if (wkf0VarMo18304a.mo17497c() > 10485760) {
            throw new IllegalArgumentException("body is too long");
        }
        byte[] bArrArray2 = ByteBuffer.wrap(new byte[wkf0VarMo18304a.mo17497c()]).order(byteOrder).array();
        bufferedSourceM12776L.readFully(bArrArray2);
        s460VarMo18305b = lec0Var.m17160p().mo18305b();
        s460VarMo18305b.m22197e(wkf0VarMo18304a);
        s460VarMo18305b.m22196d(bArrArray2);
        return s460VarMo18305b;
    }
}
