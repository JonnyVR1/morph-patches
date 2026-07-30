package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.xiaomi.push.C14909h;
import com.xiaomi.push.C14928i;
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
import p153l.ezq0;
import p153l.j6r0;
import p153l.ouq0;
import p153l.uwq0;

/* JADX INFO: renamed from: com.xiaomi.push.service.z */
/* JADX INFO: loaded from: classes2.dex */
public class C15033z {

    /* JADX INFO: renamed from: a */
    private static final Pattern f64004a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* JADX INFO: renamed from: a */
    private static long f64002a = 0;

    /* JADX INFO: renamed from: a */
    private static ThreadPoolExecutor f64003a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: a */
    public static void m88076a() {
        ezq0 ezq0VarM87754a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((f64003a.getActiveCount() <= 0 || jCurrentTimeMillis - f64002a >= 1800000) && C14909h.m87046f().m87053k() && (ezq0VarM87754a = C15001ax.m87742a().m87754a()) != null && ezq0VarM87754a.m123415y() > 0) {
            f64002a = jCurrentTimeMillis;
            m88077a(ezq0VarM87754a.m123402j(), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static boolean m88080b(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            ouq0.m169393m("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(uwq0.m198387c(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            ouq0.m169393m("ConnectivityTest: connect to " + str + " in " + (System.currentTimeMillis() - jCurrentTimeMillis));
            socket.close();
            return true;
        } catch (Throwable th) {
            ouq0.m169378B("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m88077a(final List<String> list, final boolean z) {
        f64003a.execute(new Runnable() { // from class: com.xiaomi.push.service.z.1
            @Override // java.lang.Runnable
            public void run() {
                boolean zM88080b = C15033z.m88080b("www.baidu.com:80");
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    zM88080b = zM88080b || C15033z.m88080b((String) it.next());
                    if (zM88080b && !z) {
                        break;
                    }
                }
                C14928i.m87415b(zM88080b ? 1 : 2);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private static String m88075a(String str) throws Throwable {
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
                        j6r0.m143691b(bufferedReader);
                        return string;
                    }
                }
            } catch (Exception unused) {
                j6r0.m143691b(bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                j6r0.m143691b(bufferedReader);
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
    public static void m88079b() throws Throwable {
        String strM88075a = m88075a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(strM88075a)) {
            ouq0.m169393m("dump tcp for uid = " + Process.myUid());
            ouq0.m169393m(strM88075a);
        }
        String strM88075a2 = m88075a("/proc/self/net/tcp6");
        if (TextUtils.isEmpty(strM88075a2)) {
            return;
        }
        ouq0.m169393m("dump tcp6 for uid = " + Process.myUid());
        ouq0.m169393m(strM88075a2);
    }
}
