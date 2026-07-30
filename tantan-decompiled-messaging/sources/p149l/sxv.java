package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes13.dex */
public class sxv {

    /* JADX INFO: renamed from: a */
    public static final Object f166830a = new Object();

    /* JADX INFO: renamed from: a */
    public static void m186544a(StringBuilder sb, String str) {
        String str2 = String.format("logcat -d -v threadtime -t 3000 -b %s *:V", str);
        vx00.m200472b(str2, new Object[0]);
        sb.append("------------> ");
        sb.append(str2);
        sb.append(SignParameters.NEW_LINE);
        m186545b(sb, str2);
        sb.append(SignParameters.NEW_LINE);
        sb.append(SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: b */
    public static void m186545b(StringBuilder sb, String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec(str).getInputStream()));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null || line.equals("null")) {
                        break;
                    }
                    sb.append(line);
                    sb.append(SignParameters.NEW_LINE);
                } catch (Throwable th) {
                    try {
                        sb.append("Exception: " + th.getMessage() + "\n   at read cmd : " + str);
                        return;
                    } finally {
                        ryl.m181666a(bufferedReader);
                    }
                }
            }
            ryl.m181666a(bufferedReader);
        } catch (Throwable th2) {
            sb.append("Exception: " + th2.getMessage() + "\n   at execute cmd : " + str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m186546c() {
        StringBuilder sb = new StringBuilder();
        m186544a(sb, BLiveTraceServerLocation.main);
        m186544a(sb, "system");
        m186544a(sb, "events");
        return sb.toString();
    }
}
