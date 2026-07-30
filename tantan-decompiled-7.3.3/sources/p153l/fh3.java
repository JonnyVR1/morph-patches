package p153l;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes5.dex */
public class fh3 {
    /* JADX INFO: renamed from: a */
    public synchronized yc60 m125551a(smc0 smc0Var) throws Exception {
        yc60 yc60VarMo122440b;
        smc0Var.m186795m().mo204126a("start read buffer");
        BufferedSource bufferedSourceM147313L = smc0Var.m186788f().m147313L();
        ftf0 ftf0VarMo122439a = smc0Var.m186798p().mo122439a();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[ftf0VarMo122439a.mo127316d()]);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        byte[] bArrArray = byteBufferWrap.order(byteOrder).array();
        bufferedSourceM147313L.readFully(bArrArray);
        Buffer buffer = new Buffer();
        buffer.write(bArrArray);
        ftf0VarMo122439a.mo127313a(buffer, smc0Var);
        if (ftf0VarMo122439a.mo127315c() > 10485760) {
            throw new IllegalArgumentException("body is too long");
        }
        byte[] bArrArray2 = ByteBuffer.wrap(new byte[ftf0VarMo122439a.mo127315c()]).order(byteOrder).array();
        bufferedSourceM147313L.readFully(bArrArray2);
        yc60VarMo122440b = smc0Var.m186798p().mo122440b();
        yc60VarMo122440b.m215139e(ftf0VarMo122439a);
        yc60VarMo122440b.m215138d(bArrArray2);
        return yc60VarMo122440b;
    }
}
