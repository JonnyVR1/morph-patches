package p149l;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class zrg0 implements a5e {

    /* JADX INFO: renamed from: b */
    public final String f204513b;

    public zrg0() {
        this.f204513b = "Ipv4PreferredDns";
    }

    @Override // p149l.a5e
    public final List lookup(String str) throws UnknownHostException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        InetAddress[] allByName = InetAddress.getAllByName(str);
        if (allByName != null) {
            for (int i = 0; i < allByName.length; i++) {
                InetAddress inetAddress = allByName[i];
                if (i == 0) {
                    LogUtils.file(this.f204513b, "okhttp dns 原本应该连的地址:" + inetAddress.toString());
                }
                if (inetAddress instanceof Inet4Address) {
                    arrayList2.add(inetAddress);
                } else {
                    arrayList3.add(inetAddress);
                }
            }
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
        if (arrayList.isEmpty()) {
            throw new UnknownHostException("No IP addresses found for " + str);
        }
        LogUtils.file(this.f204513b, "okhttp dns 调整后要连接的地址:" + ((InetAddress) arrayList.get(0)).toString());
        return arrayList;
    }

    public zrg0(String str) {
        this.f204513b = str;
    }
}
