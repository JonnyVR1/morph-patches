package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.xiaomi.push.C14761h;
import com.xiaomi.push.C14780i;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p149l.dxq0;
import p149l.ilq0;
import p149l.onq0;
import p149l.ypq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.z */
/* JADX INFO: loaded from: classes2.dex */
public class C14885z {

    /* JADX INFO: renamed from: a */
    private static final Pattern f63157a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* JADX INFO: renamed from: a */
    private static long f63155a = 0;

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f63156a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: a */
    public static void m86905a() {
        ypq0 ypq0VarM86583a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((f63156a.getActiveCount() <= 0 || jCurrentTimeMillis - f63155a >= 1800000) && C14761h.m85875f().m85882k() && (ypq0VarM86583a = C14853ax.m86571a().m86583a()) != null && ypq0VarM86583a.m215665y() > 0) {
            f63155a = jCurrentTimeMillis;
            m86906a(ypq0VarM86583a.m215652j(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m86909b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ilq0.m137040m("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(onq0.m165224c(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            ilq0.m137040m("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            ilq0.m137025B("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m86906a(final List<String> list, final boolean z) {
        f63156a.execute(new Runnable() { // from class: com.xiaomi.push.service.z.1
            @Override // java.lang.Runnable
            public void run() {
                boolean zM86909b = C14885z.m86909b("www.baidu.com:80");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zM86909b = zM86909b || C14885z.m86909b((String) it.next());
                    if (zM86909b && !z) {
                        break;
                    }
                }
                C14780i.m86244b(zM86909b ? 1 : 2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static String m86904a(String str) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        sb.append(SignParameters.NEW_LINE);
                        sb.append(line);
                    } else {
                        String string = sb.toString();
                        dxq0.m114018b(bufferedReader);
                        return string;
                    }
                }
            } catch (Exception unused) {
                dxq0.m114018b(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                dxq0.m114018b(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m86908b() throws Throwable {
        String strM86904a = m86904a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(strM86904a)) {
            ilq0.m137040m("dump tcp for uid = " + Process.myUid());
            ilq0.m137040m(strM86904a);
        }
        String strM86904a2 = m86904a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(strM86904a2)) {
            return;
        }
        ilq0.m137040m("dump tcp6 for uid = " + Process.myUid());
        ilq0.m137040m(strM86904a2);
    }
}
