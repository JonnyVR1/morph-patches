package com.tencent.liteav.network.p098a.p099a;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.liteav.network.p098a.C14137a;
import com.tencent.liteav.network.p098a.C14141b;
import com.tencent.liteav.network.p098a.C14144d;
import com.tencent.liteav.network.p098a.C14145e;
import com.tencent.liteav.network.p098a.InterfaceC14143c;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14140c implements InterfaceC14143c {

    /* JADX INFO: renamed from: b */
    private static final Random f59474b = new Random();

    /* JADX INFO: renamed from: a */
    final InetAddress f59475a;

    /* JADX INFO: renamed from: c */
    private final int f59476c;

    public C14140c(InetAddress inetAddress, int i) {
        this.f59475a = inetAddress;
        this.f59476c = i;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m83686a(byte[] bArr) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.f59475a, 53);
                datagramSocket2.setSoTimeout(this.f59476c * 1000);
                datagramSocket2.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED], ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED);
                datagramSocket2.receive(datagramPacket2);
                byte[] data = datagramPacket2.getData();
                datagramSocket2.close();
                return data;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C14140c(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    @Override // com.tencent.liteav.network.p098a.InterfaceC14143c
    /* JADX INFO: renamed from: a */
    public C14145e[] mo83676a(C14141b c14141b, C14144d c14144d) throws Throwable {
        int iNextInt;
        Random random = f59474b;
        synchronized (random) {
            iNextInt = random.nextInt() & 255;
        }
        byte[] bArrM83686a = m83686a(C14139b.m83681a(c14141b.f59477a, iNextInt));
        String str = c14141b.f59477a;
        if (bArrM83686a != null) {
            return C14139b.m83682a(bArrM83686a, iNextInt, str);
        }
        throw new C14137a(str, "cant get answer");
    }
}
