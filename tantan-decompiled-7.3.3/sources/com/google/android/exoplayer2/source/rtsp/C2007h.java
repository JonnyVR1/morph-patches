package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jetty.http.HttpMethods;
import org.eclipse.jetty.http.HttpTokens;
import p153l.bmk0;
import p153l.fig0;
import p153l.gyj0;
import p153l.qqd0;
import p153l.r8g0;
import p153l.rqd0;
import p153l.upq;
import p153l.w11;
import p153l.wpg0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2007h {

    /* JADX INFO: renamed from: a */
    public static final Pattern f8955a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b */
    public static final Pattern f8956b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f8957c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f8958d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e */
    public static final Pattern f8959e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f */
    public static final Pattern f8960f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g */
    public static final String f8961g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h */
    public static final String f8962h = new String(new byte[]{HttpTokens.CARRIAGE_RETURN, 10});

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f8963a;

        /* JADX INFO: renamed from: b */
        public final String f8964b;

        public a(String str, String str2) {
            this.f8963a = str;
            this.f8964b = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f8965a;

        /* JADX INFO: renamed from: b */
        public final long f8966b;

        public b(String str, long j) {
            this.f8965a = str;
            this.f8966b = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11703a(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedManifest(str, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m11704b(List<String> list) {
        return upq.m197175h(f8962h).m197179d(list).getBytes(C2006g.f8936g);
    }

    /* JADX INFO: renamed from: c */
    public static String m11705c(int i) {
        if (i == 200) {
            return "OK";
        }
        if (i == 461) {
            return "Unsupported Transport";
        }
        if (i == 500) {
            return "Internal Server Error";
        }
        if (i == 505) {
            return "RTSP Version Not Supported";
        }
        if (i == 301) {
            return "Move Permanently";
        }
        if (i == 302) {
            return "Move Temporarily";
        }
        if (i == 400) {
            return "Bad Request";
        }
        if (i == 401) {
            return "Unauthorized";
        }
        if (i == 404) {
            return "Not Found";
        }
        if (i == 405) {
            return "Method Not Allowed";
        }
        switch (i) {
            case 454:
                return "Session Not Found";
            case 455:
                return "Method Not Valid In This State";
            case 456:
                return "Header Field Not Valid";
            case 457:
                return "Invalid Range";
            default:
                fig0.m125680a();
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m11706d(String str) {
        return str.getBytes(C2006g.f8936g);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11707e(List<String> list) {
        return f8956b.matcher(list.get(0)).matches();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11708f(String str) {
        return f8955a.matcher(str).matches() || f8956b.matcher(str).matches();
    }

    /* JADX INFO: renamed from: g */
    public static long m11709g(String str) throws ParserException {
        try {
            Matcher matcher = f8957c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) w11.m204369e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m11710h(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m11711i(String str) {
        str.getClass();
        switch (str) {
            case "RECORD":
                return 8;
            case "TEARDOWN":
                return 12;
            case "GET_PARAMETER":
                return 3;
            case "OPTIONS":
                return 4;
            case "PLAY_NOTIFY":
                return 7;
            case "PLAY":
                return 6;
            case "REDIRECT":
                return 9;
            case "SET_PARAMETER":
                return 11;
            case "PAUSE":
                return 5;
            case "SETUP":
                return 10;
            case "ANNOUNCE":
                return 1;
            case "DESCRIBE":
                return 2;
            default:
                fig0.m125680a();
                return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static ImmutableList<Integer> m11712j(@Nullable String str) {
        if (str == null) {
            return ImmutableList.m15739of();
        }
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        for (String str2 : bmk0.m105119a1(str, ",\\s?")) {
            c2804a.mo15737a(Integer.valueOf(m11711i(str2)));
        }
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: k */
    public static qqd0 m11713k(List<String> list) {
        Matcher matcher = f8955a.matcher(list.get(0));
        w11.m204365a(matcher.matches());
        int iM11711i = m11711i((String) w11.m204369e(matcher.group(1)));
        Uri uri = Uri.parse((String) w11.m204369e(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        w11.m204365a(iIndexOf > 0);
        return new qqd0(uri, iM11711i, new C2004e.b().m11617c(list.subList(1, iIndexOf)).m11619e(), upq.m197175h(f8962h).m197179d(list.subList(iIndexOf + 1, list.size())));
    }

    /* JADX INFO: renamed from: l */
    public static rqd0 m11714l(List<String> list) {
        Matcher matcher = f8956b.matcher(list.get(0));
        w11.m204365a(matcher.matches());
        int i = Integer.parseInt((String) w11.m204369e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        w11.m204365a(iIndexOf > 0);
        return new rqd0(i, new C2004e.b().m11617c(list.subList(1, iIndexOf)).m11619e(), upq.m197175h(f8962h).m197179d(list.subList(iIndexOf + 1, list.size())));
    }

    /* JADX INFO: renamed from: m */
    public static b m11715m(String str) throws ParserException {
        long j;
        Matcher matcher = f8958d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(str, null);
        }
        String str2 = (String) w11.m204369e(matcher.group(1));
        String strGroup = matcher.group(2);
        if (strGroup != null) {
            try {
                j = ((long) Integer.parseInt(strGroup)) * 1000;
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(str, e);
            }
        } else {
            j = Constants.ONE_MIN_IN_MILLIS;
        }
        return new b(str2, j);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public static a m11716n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrM105122b1 = bmk0.m105122b1(userInfo, ":");
        return new a(strArrM105122b1[0], strArrM105122b1[1]);
    }

    /* JADX INFO: renamed from: o */
    public static C2002c m11717o(String str) throws ParserException {
        Matcher matcher = f8959e.matcher(str);
        if (matcher.find()) {
            return new C2002c(2, (String) w11.m204369e(matcher.group(1)), (String) w11.m204369e(matcher.group(3)), r8g0.m180206e(matcher.group(4)));
        }
        Matcher matcher2 = f8960f.matcher(str);
        if (matcher2.matches()) {
            return new C2002c(1, (String) w11.m204369e(matcher2.group(1)), "", "");
        }
        throw ParserException.createForMalformedManifest("Invalid WWW-Authenticate header " + str, null);
    }

    /* JADX INFO: renamed from: p */
    public static Uri m11718p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) w11.m204369e(uri.getAuthority());
        w11.m204365a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(bmk0.m105119a1(str, "@")[1]).build();
    }

    /* JADX INFO: renamed from: q */
    public static ImmutableList<String> m11719q(qqd0 qqd0Var) {
        w11.m204365a(qqd0Var.f158993c.m11613d("CSeq") != null);
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        c2804a.mo15737a(bmk0.m105071D("%s %s %s", m11722t(qqd0Var.f158992b), qqd0Var.f158991a, "RTSP/1.0"));
        ImmutableListMultimap<String, String> immutableListMultimapM11612b = qqd0Var.f158993c.m11612b();
        gyj0<String> it = immutableListMultimapM11612b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapM11612b.get(next);
            for (int i = 0; i < immutableList.size(); i++) {
                c2804a.mo15737a(bmk0.m105071D("%s: %s", next, immutableList.get(i)));
            }
        }
        c2804a.mo15737a("");
        c2804a.mo15737a(qqd0Var.f158994d);
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: r */
    public static ImmutableList<String> m11720r(rqd0 rqd0Var) {
        w11.m204365a(rqd0Var.f164472b.m11613d("CSeq") != null);
        ImmutableList.C2804a c2804a = new ImmutableList.C2804a();
        c2804a.mo15737a(bmk0.m105071D("%s %s %s", "RTSP/1.0", Integer.valueOf(rqd0Var.f164471a), m11705c(rqd0Var.f164471a)));
        ImmutableListMultimap<String, String> immutableListMultimapM11612b = rqd0Var.f164472b.m11612b();
        gyj0<String> it = immutableListMultimapM11612b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapM11612b.get(next);
            for (int i = 0; i < immutableList.size(); i++) {
                c2804a.mo15737a(bmk0.m105071D("%s: %s", next, immutableList.get(i)));
            }
        }
        c2804a.mo15737a("");
        c2804a.mo15737a(rqd0Var.f164473c);
        return c2804a.m15756m();
    }

    /* JADX INFO: renamed from: s */
    public static String[] m11721s(String str) {
        String str2 = f8962h;
        if (!str.contains(str2)) {
            str2 = f8961g;
        }
        return bmk0.m105119a1(str, str2);
    }

    /* JADX INFO: renamed from: t */
    public static String m11722t(int i) {
        switch (i) {
            case 1:
                return "ANNOUNCE";
            case 2:
                return "DESCRIBE";
            case 3:
                return "GET_PARAMETER";
            case 4:
                return HttpMethods.OPTIONS;
            case 5:
                return "PAUSE";
            case 6:
                return "PLAY";
            case 7:
                return "PLAY_NOTIFY";
            case 8:
                return "RECORD";
            case 9:
                return "REDIRECT";
            case 10:
                return "SETUP";
            case 11:
                return "SET_PARAMETER";
            case 12:
                return "TEARDOWN";
            default:
                wpg0.m207458a();
                return null;
        }
    }
}
