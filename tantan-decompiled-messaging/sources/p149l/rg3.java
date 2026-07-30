package p149l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes4.dex */
public class rg3 {
    /* JADX INFO: renamed from: a */
    public synchronized s460 m179155a(lec0 lec0Var) throws Exception {
        s460 s460VarMo156766b;
        lec0Var.m149499m().mo216485a("start read buffer");
        BufferedSource bufferedSourceM118441L = lec0Var.m149492f().m118441L();
        wkf0 wkf0VarMo156765a = lec0Var.m149502p().mo156765a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[wkf0VarMo156765a.mo152009d()]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferWrap.order(byteOrder).array();
        bufferedSourceM118441L.readFully(bArrArray);
        Buffer buffer = new Buffer();
        buffer.write(bArrArray);
        wkf0VarMo156765a.mo152006a(buffer, lec0Var);
        if (wkf0VarMo156765a.mo152008c() > 10485760) {
            throw new IllegalArgumentException("body is too long");
        }
        byte[] bArrArray2 = ByteBuffer.wrap(new byte[wkf0VarMo156765a.mo152008c()]).order(byteOrder).array();
        bufferedSourceM118441L.readFully(bArrArray2);
        s460VarMo156766b = lec0Var.m149502p().mo156766b();
        s460VarMo156766b.m182212e(wkf0VarMo156765a);
        s460VarMo156766b.m182211d(bArrArray2);
        return s460VarMo156766b;
    }
}
