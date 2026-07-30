package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes11.dex */
public class pzv {

    /* JADX INFO: renamed from: a */
    public static final Object f154980a = new Object();

    /* JADX INFO: renamed from: a */
    public static void m174622a(StringBuilder sb, String str) {
        String str2 = String.format("logcat -d -v threadtime -t 3000 -b %s *:V", str);
        f610.m124264b(str2, new Object[0]);
        sb.append("------------> ");
        sb.append(str2);
        sb.append(SignParameters.NEW_LINE);
        m174623b(sb, str2);
        sb.append(SignParameters.NEW_LINE);
        sb.append(SignParameters.NEW_LINE);
    }

    /* JADX INFO: renamed from: b */
    public static void m174623b(StringBuilder sb, String str) {
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
                        m1m.m156698a(bufferedReader);
                    }
                }
            }
            m1m.m156698a(bufferedReader);
        } catch (Throwable th2) {
            sb.append("Exception: " + th2.getMessage() + "\n   at execute cmd : " + str);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m174624c() {
        StringBuilder sb = new StringBuilder();
        m174622a(sb, BLiveTraceServerLocation.main);
        m174622a(sb, "system");
        m174622a(sb, "events");
        return sb.toString();
    }
}
