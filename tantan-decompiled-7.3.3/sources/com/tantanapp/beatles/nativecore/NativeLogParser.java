package com.tantanapp.beatles.nativecore;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p153l.p7f;

/* JADX INFO: loaded from: classes11.dex */
public class NativeLogParser {

    /* JADX INFO: renamed from: a */
    public static final Pattern f56811a = Pattern.compile("^(.*):\\s'(.*?)'$");

    /* JADX INFO: renamed from: b */
    public static final Pattern f56812b = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: c */
    public static final Pattern f56813c = Pattern.compile("^pid:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* JADX INFO: renamed from: d */
    public static final Pattern f56814d = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* JADX INFO: renamed from: e */
    public static final Pattern f56815e = Pattern.compile("^(\\d{20})_(.*)__(.*)$");

    /* JADX INFO: renamed from: f */
    public static final Pattern f56816f = Pattern.compile("\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*");

    /* JADX INFO: renamed from: g */
    public static final Set<String> f56817g = new HashSet(Arrays.asList("Tombstone maker", "Crash type", "Start time", "Crash time", "App ID", "App version", "Rooted", "API level", "OS version", "Kernel version", "ABI list", "Manufacturer", "Brand", p7f.TAG_MODEL, "Build fingerprint", "ABI", "Abort message"));

    /* JADX INFO: renamed from: h */
    public static final Set<String> f56818h = new HashSet(Arrays.asList("backtrace", "build id", "stack", "memory map", "logcat", "open files", "java stacktrace", "xcrash error", "xcrash error debug"));

    public enum Status {
        UNKNOWN,
        HEAD,
        SECTION
    }

    /* JADX INFO: renamed from: com.tantanapp.beatles.nativecore.NativeLogParser$a */
    public static /* synthetic */ class C13719a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f56819a;

        static {
            int[] iArr = new int[Status.values().length];
            f56819a = iArr;
            try {
                iArr[Status.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f56819a[Status.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f56819a[Status.SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static long m82351a(String str, String str2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        try {
            return simpleDateFormat.parse(str2).getTime() - simpleDateFormat.parse(str).getTime();
        } catch (Exception unused) {
            return -1L;
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m82352b(String str) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").parse(str).getTime();
        } catch (Exception unused) {
            return 0L;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Map<String, String> m82353c(File file) throws IOException {
        return m82354d(file.getAbsolutePath(), null);
    }

    /* JADX INFO: renamed from: d */
    public static Map<String, String> m82354d(String str, String str2) throws IOException {
        HashMap map = new HashMap();
        if (str != null) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            m82356f(map, bufferedReader, true);
            bufferedReader.close();
        }
        if (str2 != null) {
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(str2));
            m82356f(map, bufferedReader2, false);
            bufferedReader2.close();
        }
        m82355e(map, str);
        String str3 = (String) map.get("App version");
        if (TextUtils.isEmpty(str3)) {
            str3 = "unknown";
        }
        map.put("App version", str3);
        return map;
    }

    /* JADX INFO: renamed from: e */
    public static void m82355e(Map<String, String> map, String str) {
        String strSubstring;
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(map.get("Crash time"))) {
            map.put("Crash time", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(new File(str).lastModified())));
        }
        String str2 = map.get("Start time");
        String str3 = map.get("App version");
        String str4 = map.get("pname");
        String str5 = map.get("Crash type");
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            String strSubstring2 = str.substring(str.lastIndexOf(47) + 1);
            if (!strSubstring2.isEmpty() && strSubstring2.startsWith("tombstone_")) {
                String strSubstring3 = strSubstring2.substring(10);
                if (strSubstring3.endsWith(".java.xcrash")) {
                    if (TextUtils.isEmpty(str5)) {
                        map.put("Crash type", "java");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 12);
                } else if (strSubstring3.endsWith(".native.xcrash")) {
                    if (TextUtils.isEmpty(str5)) {
                        map.put("Crash type", "native");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 14);
                } else {
                    if (!strSubstring3.endsWith(".anr.xcrash")) {
                        return;
                    }
                    if (TextUtils.isEmpty(str5)) {
                        map.put("Crash type", "anr");
                    }
                    strSubstring = strSubstring3.substring(0, strSubstring3.length() - 11);
                }
                if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    Matcher matcher = f56815e.matcher(strSubstring);
                    if (matcher.find() && matcher.groupCount() == 3) {
                        if (TextUtils.isEmpty(str2)) {
                            map.put("Start time", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(Long.parseLong(matcher.group(1), 10) / 1000)));
                        }
                        if (TextUtils.isEmpty(str3)) {
                            map.put("App version", matcher.group(2));
                        }
                        if (TextUtils.isEmpty(str4)) {
                            map.put("pname", matcher.group(3));
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m82356f(Map<String, String> map, BufferedReader bufferedReader, boolean z) throws IOException {
        StringBuilder sb;
        int i;
        Status status;
        Status status2;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        Status status3 = Status.UNKNOWN;
        String strM82359i = z ? m82359i(bufferedReader) : bufferedReader.readLine();
        int i2 = 1;
        int i3 = strM82359i == null ? 1 : 0;
        String strSubstring = null;
        String str = "";
        boolean z2 = false;
        boolean zEquals = false;
        boolean z3 = false;
        while (i3 == 0) {
            String strM82359i2 = z ? m82359i(bufferedReader) : bufferedReader.readLine();
            int i4 = strM82359i2 == null ? i2 : 0;
            int i5 = C13719a.f56819a[status3.ordinal()];
            Status status4 = status3;
            if (i5 != i2) {
                if (i5 == 2) {
                    if (strM82359i.startsWith("pid: ")) {
                        Matcher matcher = f56812b.matcher(strM82359i);
                        if (matcher.find()) {
                            sb = sb3;
                            if (matcher.groupCount() == 4) {
                                m82357g(map, "pid", matcher.group(1));
                                m82357g(map, "tid", matcher.group(2));
                                m82357g(map, "tname", matcher.group(3));
                                m82357g(map, "pname", matcher.group(4));
                            }
                        } else {
                            sb = sb3;
                        }
                        Matcher matcher2 = f56813c.matcher(strM82359i);
                        if (matcher2.find() && matcher2.groupCount() == 2) {
                            m82357g(map, "pid", matcher2.group(1));
                            m82357g(map, "pname", matcher2.group(2));
                        }
                    } else {
                        sb = sb3;
                        if (strM82359i.startsWith("signal ")) {
                            Matcher matcher3 = f56814d.matcher(strM82359i);
                            if (matcher3.find() && matcher3.groupCount() == 3) {
                                m82357g(map, "signal", matcher3.group(1));
                                m82357g(map, "code", matcher3.group(2));
                                m82357g(map, "fault addr", matcher3.group(3));
                            }
                        } else {
                            Matcher matcher4 = f56811a.matcher(strM82359i);
                            if (matcher4.find() && matcher4.groupCount() == 2 && f56817g.contains(matcher4.group(1))) {
                                m82357g(map, matcher4.group(1), matcher4.group(2));
                            }
                        }
                    }
                    if (strM82359i2 == null || !(strM82359i2.startsWith("    r0 ") || strM82359i2.startsWith("    x0 ") || strM82359i2.startsWith("    eax ") || strM82359i2.startsWith("    rax "))) {
                        status3 = status4;
                    } else {
                        status3 = Status.SECTION;
                        strSubstring = "registers";
                        str = "";
                        z2 = true;
                        zEquals = false;
                    }
                    if (strM82359i2 == null || strM82359i2.isEmpty()) {
                        status2 = Status.UNKNOWN;
                        status3 = status2;
                    }
                } else if (i5 != 3) {
                    sb = sb3;
                    i = 1;
                    status3 = status4;
                } else if (strM82359i.equals(str) || i4 != 0) {
                    m82358h(map, strSubstring, sb2.toString(), zEquals);
                    sb2.setLength(0);
                    status3 = Status.UNKNOWN;
                    sb = sb3;
                } else {
                    if (!z2) {
                        Matcher matcher5 = f56816f.matcher(strM82359i);
                        if (matcher5.find() && strM82359i.contains("\"main\"")) {
                            sb3.append(strM82359i);
                            sb3.append(SignParameters.NEW_LINE);
                            z3 = true;
                        } else if (z3) {
                            if (matcher5.find()) {
                                m82357g(map, "mainThread", sb3.toString());
                            } else {
                                sb3.append(strM82359i);
                                sb3.append(SignParameters.NEW_LINE);
                                if (TextUtils.isEmpty(strM82359i.trim())) {
                                    m82357g(map, "mainThread", sb3.toString());
                                }
                            }
                            z3 = false;
                        }
                    } else if (strSubstring.equals("java stacktrace") && strM82359i.startsWith(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR)) {
                        strM82359i = strM82359i.trim();
                    } else if (strM82359i.startsWith("    ")) {
                        strM82359i = strM82359i.substring(4);
                    }
                    sb2.append(strM82359i);
                    sb2.append('\n');
                    sb = sb3;
                    status3 = status4;
                }
                i = 1;
            } else {
                sb = sb3;
                if (strM82359i.equals("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***")) {
                    status2 = Status.HEAD;
                    status3 = status2;
                    i = 1;
                } else {
                    if (strM82359i.equals("--- --- --- --- --- --- --- --- --- --- --- --- --- --- --- ---")) {
                        status = Status.SECTION;
                        sb2.append(strM82359i);
                        sb2.append('\n');
                        str = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";
                        strSubstring = "other threads";
                        z2 = false;
                        zEquals = false;
                        i = 1;
                    } else {
                        i = 1;
                        if (strM82359i.length() <= 1 || !strM82359i.endsWith(":")) {
                            status3 = status4;
                        } else {
                            status = Status.SECTION;
                            strSubstring = strM82359i.substring(0, strM82359i.length() - 1);
                            if (f56818h.contains(strSubstring)) {
                                z2 = strSubstring.equals("backtrace") || strSubstring.equals("build id") || strSubstring.equals("stack") || strSubstring.equals("memory map") || strSubstring.equals("open files") || strSubstring.equals("java stacktrace") || strSubstring.equals("xcrash error debug");
                                zEquals = strSubstring.equals("xcrash error");
                            } else {
                                if (!strSubstring.equals("memory info")) {
                                    if (strSubstring.startsWith("memory near ")) {
                                        sb2.append(strM82359i);
                                        sb2.append('\n');
                                        strSubstring = "memory near";
                                    } else {
                                        z2 = false;
                                        zEquals = false;
                                    }
                                }
                                strSubstring = strSubstring;
                                z2 = false;
                                str = "";
                                zEquals = true;
                            }
                            str = "";
                        }
                    }
                    status3 = status;
                }
            }
            strM82359i = strM82359i2;
            i3 = i4;
            i2 = i;
            sb3 = sb;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m82357g(Map<String, String> map, String str, String str2) {
        m82358h(map, str, str2, false);
    }

    /* JADX INFO: renamed from: h */
    public static void m82358h(Map<String, String> map, String str, String str2, boolean z) {
        if (str == null || str.isEmpty() || str2 == null) {
            return;
        }
        String str3 = map.get(str);
        if (z) {
            if (str3 != null) {
                str2 = str3.concat(str2);
            }
            map.put(str, str2);
        } else if (str3 == null || (str3.isEmpty() && !str2.isEmpty())) {
            map.put(str, str2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m82359i(BufferedReader bufferedReader) throws IOException {
        try {
            bufferedReader.mark(2);
            for (int i = 0; i < 2; i++) {
                try {
                    int i2 = bufferedReader.read();
                    if (i2 == -1) {
                        bufferedReader.reset();
                        return null;
                    }
                    if (i2 > 0) {
                        bufferedReader.reset();
                        return bufferedReader.readLine();
                    }
                } catch (Exception unused) {
                    bufferedReader.reset();
                    return bufferedReader.readLine();
                }
            }
            bufferedReader.reset();
            return null;
        } catch (Exception unused2) {
            return bufferedReader.readLine();
        }
    }
}
