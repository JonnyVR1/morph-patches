package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.apm.lite.nativecrash.NativeImpl;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class i0r0 {

    /* JADX INFO: renamed from: i */
    private static final Pattern f112434i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j */
    private static final Pattern f112435j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k */
    private static final Pattern f112436k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l */
    private static final Pattern f112437l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m */
    private static final Pattern f112438m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a */
    private String f112439a;

    /* JADX INFO: renamed from: b */
    private String f112440b;

    /* JADX INFO: renamed from: c */
    private String f112441c;

    /* JADX INFO: renamed from: d */
    private String f112442d;

    /* JADX INFO: renamed from: e */
    private String f112443e;

    /* JADX INFO: renamed from: f */
    private String f112444f;

    /* JADX INFO: renamed from: g */
    private String f112445g;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f112446h = new HashMap();

    public i0r0(File file) {
        m138036e(j5r0.m143573i(file));
    }

    /* JADX INFO: renamed from: e */
    private void m138036e(File file) {
        StringBuilder sb;
        if (!file.exists() || file.length() == 0) {
            return;
        }
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
            int i = 0;
            while (true) {
                try {
                    String line = bufferedReader2.readLine();
                    if (line == null || i >= 64) {
                        break;
                    }
                    if (this.f112439a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f112434i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f112439a = matcher.group(1);
                            this.f112440b = matcher.group(2);
                            this.f112442d = matcher.group(3);
                            this.f112441c = matcher.group(4);
                        }
                    } else if (this.f112443e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f112435j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
                            String strReplace2 = matcher2.group(2).replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f112443e = "Signal " + strReplace + ", Code " + strReplace2 + SignParameters.NEW_LINE;
                        }
                    } else if (this.f112444f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f112436k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            sb = new StringBuilder();
                            sb.append("abort message: ");
                            sb.append(matcher3.group(1));
                            sb.append(SignParameters.NEW_LINE);
                            this.f112444f = sb.toString();
                        }
                    } else if (this.f112444f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f112437l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            sb = new StringBuilder();
                            sb.append("crash message: ");
                            sb.append(matcher4.group(1));
                            sb.append(SignParameters.NEW_LINE);
                            this.f112444f = sb.toString();
                        }
                    } else if (this.f112445g != null || !line.startsWith("backtrace:")) {
                        if (this.f112446h.isEmpty() && line.startsWith("build id:")) {
                            while (true) {
                                String line2 = bufferedReader2.readLine();
                                if (line2 == null || !line2.contains("BuildId:")) {
                                    break;
                                    break;
                                }
                                Matcher matcher5 = f112438m.matcher(line2);
                                if (matcher5.find()) {
                                    String strGroup = matcher5.group(1);
                                    String strGroup2 = matcher5.group(2);
                                    String strGroup3 = matcher5.group(3);
                                    if (strGroup.equals("data")) {
                                        this.f112446h.put(strGroup2, strGroup3);
                                    }
                                }
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            String line3 = bufferedReader2.readLine();
                            if (line3 == null || !line3.startsWith("    #")) {
                                break;
                            }
                            sb2.append(line3.substring(4));
                            sb2.append('\n');
                        }
                        i++;
                        this.f112445g = sb2.toString();
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        pwq0.m174074a();
                        pwq0.m174075b("NPTH_CATCH", th);
                        return;
                    } finally {
                        m4r0.m157051a(bufferedReader);
                    }
                }
            }
            m4r0.m157051a(bufferedReader2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m138037a() {
        return this.f112445g;
    }

    /* JADX INFO: renamed from: b */
    public void m138038b(File file) {
        File fileM143573i = j5r0.m143573i(file);
        if (fileM143573i.exists()) {
            fileM143573i.renameTo(new File(fileM143573i.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m5180r(file);
        m138036e(j5r0.m143573i(file));
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m138039c() {
        return this.f112446h;
    }

    /* JADX INFO: renamed from: d */
    public String m138040d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f112443e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f112444f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f112445g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
