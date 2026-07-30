package com.tencent.liteav.network.p103a.p104a;

import com.tencent.liteav.network.p103a.C14304b;
import com.tencent.liteav.network.p103a.C14307d;
import com.tencent.liteav.network.p103a.C14308e;
import com.tencent.liteav.network.p103a.InterfaceC14306c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p153l.zpg0;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14301a {
    /* JADX INFO: renamed from: a */
    public static InetAddress[] m84856a() {
        String hostAddress;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            ArrayList arrayList = new ArrayList(5);
            while (true) {
                String line = lineNumberReader.readLine();
                if (line == null) {
                    break;
                }
                int iIndexOf = line.indexOf("]: [");
                if (iIndexOf != -1) {
                    String strSubstring = line.substring(1, iIndexOf);
                    String strSubstring2 = line.substring(iIndexOf + 4, line.length() - 1);
                    if (strSubstring.endsWith(".dns") || strSubstring.endsWith(".dns1") || strSubstring.endsWith(".dns2") || strSubstring.endsWith(".dns3") || strSubstring.endsWith(".dns4")) {
                        InetAddress byName = InetAddress.getByName(strSubstring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            arrayList.add(byName);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
            return null;
        } catch (IOException e) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InetAddress[] m84857b() {
        InetAddress byName;
        String hostAddress;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i = 0; i < 4; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (str != null && str.length() != 0 && (byName = InetAddress.getByName(str)) != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0 && !arrayList.contains(byName)) {
                    arrayList.add(byName);
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
        } catch (Exception e) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByReflection", (Throwable) e);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC14306c m84858c() {
        return new InterfaceC14306c() { // from class: com.tencent.liteav.network.a.a.a.1
            @Override // com.tencent.liteav.network.p103a.InterfaceC14306c
            /* JADX INFO: renamed from: a */
            public C14308e[] mo84859a(C14304b c14304b, C14307d c14307d) throws IOException {
                InetAddress[] inetAddressArrM84857b = C14301a.m84857b();
                if (inetAddressArrM84857b == null) {
                    inetAddressArrM84857b = C14301a.m84856a();
                }
                if (inetAddressArrM84857b != null) {
                    return new C14303c(inetAddressArrM84857b[0]).mo84859a(c14304b, c14307d);
                }
                zpg0.m220844a("cant get local dns server");
                return null;
            }
        };
    }
}
