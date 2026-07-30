package p149l;

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
public class crq0 {

    /* JADX INFO: renamed from: i */
    private static final Pattern f82289i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: j */
    private static final Pattern f82290j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: k */
    private static final Pattern f82291k = Pattern.compile("^Abort message: (.*)$");

    /* JADX INFO: renamed from: l */
    private static final Pattern f82292l = Pattern.compile("^Crash message: (.*)$");

    /* JADX INFO: renamed from: m */
    private static final Pattern f82293m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* JADX INFO: renamed from: a */
    private String f82294a;

    /* JADX INFO: renamed from: b */
    private String f82295b;

    /* JADX INFO: renamed from: c */
    private String f82296c;

    /* JADX INFO: renamed from: d */
    private String f82297d;

    /* JADX INFO: renamed from: e */
    private String f82298e;

    /* JADX INFO: renamed from: f */
    private String f82299f;

    /* JADX INFO: renamed from: g */
    private String f82300g;

    /* JADX INFO: renamed from: h */
    private Map<String, String> f82301h = new HashMap();

    public crq0(File file) {
        m108450e(dwq0.m113921i(file));
    }

    /* JADX INFO: renamed from: e */
    private void m108450e(File file) {
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
                    if (this.f82294a == null && line.startsWith("pid: ")) {
                        Matcher matcher = f82289i.matcher(line);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            this.f82294a = matcher.group(1);
                            this.f82295b = matcher.group(2);
                            this.f82297d = matcher.group(3);
                            this.f82296c = matcher.group(4);
                        }
                    } else if (this.f82298e == null && line.startsWith("signal ")) {
                        Matcher matcher2 = f82290j.matcher(line);
                        if (matcher2.find() && matcher2.groupCount() == 3) {
                            String strReplace = matcher2.group(1).replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
                            String strReplace2 = matcher2.group(2).replace(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "");
                            int iIndexOf = strReplace2.indexOf("frompid");
                            if (iIndexOf > 0) {
                                strReplace2 = strReplace2.substring(0, iIndexOf) + ")";
                            }
                            this.f82298e = "Signal " + strReplace + ", Code " + strReplace2 + SignParameters.NEW_LINE;
                        }
                    } else if (this.f82299f == null && line.startsWith("Abort ")) {
                        Matcher matcher3 = f82291k.matcher(line);
                        if (matcher3.find() && matcher3.groupCount() == 1) {
                            sb = new StringBuilder();
                            sb.append("abort message: ");
                            sb.append(matcher3.group(1));
                            sb.append(SignParameters.NEW_LINE);
                            this.f82299f = sb.toString();
                        }
                    } else if (this.f82299f == null && line.startsWith("Crash ")) {
                        Matcher matcher4 = f82292l.matcher(line);
                        if (matcher4.find() && matcher4.groupCount() == 1) {
                            sb = new StringBuilder();
                            sb.append("crash message: ");
                            sb.append(matcher4.group(1));
                            sb.append(SignParameters.NEW_LINE);
                            this.f82299f = sb.toString();
                        }
                    } else if (this.f82300g != null || !line.startsWith("backtrace:")) {
                        if (this.f82301h.isEmpty() && line.startsWith("build id:")) {
                            while (true) {
                                String line2 = bufferedReader2.readLine();
                                if (line2 == null || !line2.contains("BuildId:")) {
                                    break;
                                    break;
                                }
                                Matcher matcher5 = f82293m.matcher(line2);
                                if (matcher5.find()) {
                                    String strGroup = matcher5.group(1);
                                    String strGroup2 = matcher5.group(2);
                                    String strGroup3 = matcher5.group(3);
                                    if (strGroup.equals("data")) {
                                        this.f82301h.put(strGroup2, strGroup3);
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
                        this.f82300g = sb2.toString();
                    }
                    i++;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    try {
                        jnq0.m142383a();
                        jnq0.m142384b("NPTH_CATCH", th);
                        return;
                    } finally {
                        gvq0.m128290a(bufferedReader);
                    }
                }
            }
            gvq0.m128290a(bufferedReader2);
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public String m108451a() {
        return this.f82300g;
    }

    /* JADX INFO: renamed from: b */
    public void m108452b(File file) {
        File fileM113921i = dwq0.m113921i(file);
        if (fileM113921i.exists()) {
            fileM113921i.renameTo(new File(fileM113921i.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m5170r(file);
        m108450e(dwq0.m113921i(file));
    }

    /* JADX INFO: renamed from: c */
    public Map<String, String> m108453c() {
        return this.f82301h;
    }

    /* JADX INFO: renamed from: d */
    public String m108454d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f82298e;
        if (str != null) {
            sb.append(str);
        }
        String str2 = this.f82299f;
        if (str2 != null) {
            sb.append(str2);
        }
        String str3 = this.f82300g;
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }
}
