package com.tencent.liteav.network.p098a.p099a;

import com.tencent.liteav.network.p098a.C14141b;
import com.tencent.liteav.network.p098a.C14144d;
import com.tencent.liteav.network.p098a.C14145e;
import com.tencent.liteav.network.p098a.InterfaceC14143c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.rhg0;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.a.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C14138a {
    /* JADX INFO: renamed from: a */
    public static InetAddress[] m83673a() {
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
    public static InetAddress[] m83674b() {
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
    public static InterfaceC14143c m83675c() {
        return new InterfaceC14143c() { // from class: com.tencent.liteav.network.a.a.a.1
            @Override // com.tencent.liteav.network.p098a.InterfaceC14143c
            /* JADX INFO: renamed from: a */
            public C14145e[] mo83676a(C14141b c14141b, C14144d c14144d) throws IOException {
                InetAddress[] inetAddressArrM83674b = C14138a.m83674b();
                if (inetAddressArrM83674b == null) {
                    inetAddressArrM83674b = C14138a.m83673a();
                }
                if (inetAddressArrM83674b != null) {
                    return new C14140c(inetAddressArrM83674b[0]).mo83676a(c14141b, c14144d);
                }
                rhg0.m179353a("cant get local dns server");
                return null;
            }
        };
    }
}
