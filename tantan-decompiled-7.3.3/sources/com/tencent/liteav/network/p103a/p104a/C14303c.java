package com.tencent.liteav.network.p103a.p104a;

import com.google.android.gms.common.ConnectionResult;
import com.tencent.liteav.network.p103a.C14300a;
import com.tencent.liteav.network.p103a.C14304b;
import com.tencent.liteav.network.p103a.C14307d;
import com.tencent.liteav.network.p103a.C14308e;
import com.tencent.liteav.network.p103a.InterfaceC14306c;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.a.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C14303c implements InterfaceC14306c {

    /* JADX INFO: renamed from: b */
    private static final Random f60322b = new Random();

    /* JADX INFO: renamed from: a */
    final InetAddress f60323a;

    /* JADX INFO: renamed from: c */
    private final int f60324c;

    public C14303c(InetAddress inetAddress, int i) {
        this.f60323a = inetAddress;
        this.f60324c = i;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m84869a(byte[] bArr) throws Throwable {
        DatagramSocket datagramSocket = null;
        try {
            DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, this.f60323a, 53);
                datagramSocket2.setSoTimeout(this.f60324c * 1000);
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

    public C14303c(InetAddress inetAddress) {
        this(inetAddress, 10);
    }

    @Override // com.tencent.liteav.network.p103a.InterfaceC14306c
    /* JADX INFO: renamed from: a */
    public C14308e[] mo84859a(C14304b c14304b, C14307d c14307d) throws Throwable {
        int iNextInt;
        Random random = f60322b;
        synchronized (random) {
            iNextInt = random.nextInt() & 255;
        }
        byte[] bArrM84869a = m84869a(C14302b.m84864a(c14304b.f60325a, iNextInt));
        String str = c14304b.f60325a;
        if (bArrM84869a != null) {
            return C14302b.m84865a(bArrM84869a, iNextInt, str);
        }
        throw new C14300a(str, "cant get answer");
    }
}
