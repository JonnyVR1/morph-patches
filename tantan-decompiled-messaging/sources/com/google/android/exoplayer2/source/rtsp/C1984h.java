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
import p149l.dpj0;
import p149l.k0g0;
import p149l.nid0;
import p149l.ohg0;
import p149l.oid0;
import p149l.p11;
import p149l.vck0;
import p149l.vnq;
import p149l.x9g0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1984h {

    /* JADX INFO: renamed from: a */
    public static final Pattern f8918a = Pattern.compile("([A-Z_]+) (.*) RTSP/1\\.0");

    /* JADX INFO: renamed from: b */
    public static final Pattern f8919b = Pattern.compile("RTSP/1\\.0 (\\d+) (.+)");

    /* JADX INFO: renamed from: c */
    public static final Pattern f8920c = Pattern.compile("Content-Length:\\s?(\\d+)", 2);

    /* JADX INFO: renamed from: d */
    public static final Pattern f8921d = Pattern.compile("([\\w$\\-_.+]+)(?:;\\s?timeout=(\\d+))?");

    /* JADX INFO: renamed from: e */
    public static final Pattern f8922e = Pattern.compile("Digest realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\",\\s?(?:domain=\"(.+)\",\\s?)?nonce=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"(?:,\\s?opaque=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\")?");

    /* JADX INFO: renamed from: f */
    public static final Pattern f8923f = Pattern.compile("Basic realm=\"([^\"\\x00-\\x08\\x0A-\\x1f\\x7f]+)\"");

    /* JADX INFO: renamed from: g */
    public static final String f8924g = new String(new byte[]{10});

    /* JADX INFO: renamed from: h */
    public static final String f8925h = new String(new byte[]{HttpTokens.CARRIAGE_RETURN, 10});

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f8926a;

        /* JADX INFO: renamed from: b */
        public final String f8927b;

        public a(String str, String str2) {
            this.f8926a = str;
            this.f8927b = str2;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.h$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f8928a;

        /* JADX INFO: renamed from: b */
        public final long f8929b;

        public b(String str, long j) {
            this.f8928a = str;
            this.f8929b = j;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m11649a(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.createForMalformedManifest(str, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m11650b(List<String> list) {
        return vnq.m199040h(f8925h).m199044d(list).getBytes(C1983g.f8899g);
    }

    /* JADX INFO: renamed from: c */
    public static String m11651c(int i) {
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
                x9g0.m207497a();
                return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m11652d(String str) {
        return str.getBytes(C1983g.f8899g);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11653e(List<String> list) {
        return f8919b.matcher(list.get(0)).matches();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m11654f(String str) {
        return f8918a.matcher(str).matches() || f8919b.matcher(str).matches();
    }

    /* JADX INFO: renamed from: g */
    public static long m11655g(String str) throws ParserException {
        try {
            Matcher matcher = f8920c.matcher(str);
            if (matcher.find()) {
                return Long.parseLong((String) p11.m167011e(matcher.group(1)));
            }
            return -1L;
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m11656h(String str) throws ParserException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw ParserException.createForMalformedManifest(str, e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m11657i(String str) {
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
                x9g0.m207497a();
                return 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public static ImmutableList<Integer> m11658j(@Nullable String str) {
        if (str == null) {
            return ImmutableList.m15685of();
        }
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        for (String str2 : vck0.m197841a1(str, ",\\s?")) {
            c2781a.mo15683a(Integer.valueOf(m11657i(str2)));
        }
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: k */
    public static nid0 m11659k(List<String> list) {
        Matcher matcher = f8918a.matcher(list.get(0));
        p11.m167007a(matcher.matches());
        int iM11657i = m11657i((String) p11.m167011e(matcher.group(1)));
        Uri uri = Uri.parse((String) p11.m167011e(matcher.group(2)));
        int iIndexOf = list.indexOf("");
        p11.m167007a(iIndexOf > 0);
        return new nid0(uri, iM11657i, new C1981e.b().m11563c(list.subList(1, iIndexOf)).m11565e(), vnq.m199040h(f8925h).m199044d(list.subList(iIndexOf + 1, list.size())));
    }

    /* JADX INFO: renamed from: l */
    public static oid0 m11660l(List<String> list) {
        Matcher matcher = f8919b.matcher(list.get(0));
        p11.m167007a(matcher.matches());
        int i = Integer.parseInt((String) p11.m167011e(matcher.group(1)));
        int iIndexOf = list.indexOf("");
        p11.m167007a(iIndexOf > 0);
        return new oid0(i, new C1981e.b().m11563c(list.subList(1, iIndexOf)).m11565e(), vnq.m199040h(f8925h).m199044d(list.subList(iIndexOf + 1, list.size())));
    }

    /* JADX INFO: renamed from: m */
    public static b m11661m(String str) throws ParserException {
        long j;
        Matcher matcher = f8921d.matcher(str);
        if (!matcher.matches()) {
            throw ParserException.createForMalformedManifest(str, null);
        }
        String str2 = (String) p11.m167011e(matcher.group(1));
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
    public static a m11662n(Uri uri) {
        String userInfo = uri.getUserInfo();
        if (userInfo == null || !userInfo.contains(":")) {
            return null;
        }
        String[] strArrM197844b1 = vck0.m197844b1(userInfo, ":");
        return new a(strArrM197844b1[0], strArrM197844b1[1]);
    }

    /* JADX INFO: renamed from: o */
    public static C1979c m11663o(String str) throws ParserException {
        Matcher matcher = f8922e.matcher(str);
        if (matcher.find()) {
            return new C1979c(2, (String) p11.m167011e(matcher.group(1)), (String) p11.m167011e(matcher.group(3)), k0g0.m144051e(matcher.group(4)));
        }
        Matcher matcher2 = f8923f.matcher(str);
        if (matcher2.matches()) {
            return new C1979c(1, (String) p11.m167011e(matcher2.group(1)), "", "");
        }
        throw ParserException.createForMalformedManifest("Invalid WWW-Authenticate header " + str, null);
    }

    /* JADX INFO: renamed from: p */
    public static Uri m11664p(Uri uri) {
        if (uri.getUserInfo() == null) {
            return uri;
        }
        String str = (String) p11.m167011e(uri.getAuthority());
        p11.m167007a(str.contains("@"));
        return uri.buildUpon().encodedAuthority(vck0.m197841a1(str, "@")[1]).build();
    }

    /* JADX INFO: renamed from: q */
    public static ImmutableList<String> m11665q(nid0 nid0Var) {
        p11.m167007a(nid0Var.f139083c.m11559d("CSeq") != null);
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        c2781a.mo15683a(vck0.m197793D("%s %s %s", m11668t(nid0Var.f139082b), nid0Var.f139081a, "RTSP/1.0"));
        ImmutableListMultimap<String, String> immutableListMultimapM11558b = nid0Var.f139083c.m11558b();
        dpj0<String> it = immutableListMultimapM11558b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapM11558b.get(next);
            for (int i = 0; i < immutableList.size(); i++) {
                c2781a.mo15683a(vck0.m197793D("%s: %s", next, immutableList.get(i)));
            }
        }
        c2781a.mo15683a("");
        c2781a.mo15683a(nid0Var.f139084d);
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: r */
    public static ImmutableList<String> m11666r(oid0 oid0Var) {
        p11.m167007a(oid0Var.f144108b.m11559d("CSeq") != null);
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        c2781a.mo15683a(vck0.m197793D("%s %s %s", "RTSP/1.0", Integer.valueOf(oid0Var.f144107a), m11651c(oid0Var.f144107a)));
        ImmutableListMultimap<String, String> immutableListMultimapM11558b = oid0Var.f144108b.m11558b();
        dpj0<String> it = immutableListMultimapM11558b.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            ImmutableList<String> immutableList = immutableListMultimapM11558b.get(next);
            for (int i = 0; i < immutableList.size(); i++) {
                c2781a.mo15683a(vck0.m197793D("%s: %s", next, immutableList.get(i)));
            }
        }
        c2781a.mo15683a("");
        c2781a.mo15683a(oid0Var.f144109c);
        return c2781a.m15702m();
    }

    /* JADX INFO: renamed from: s */
    public static String[] m11667s(String str) {
        String str2 = f8925h;
        if (!str.contains(str2)) {
            str2 = f8924g;
        }
        return vck0.m197841a1(str, str2);
    }

    /* JADX INFO: renamed from: t */
    public static String m11668t(int i) {
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
                ohg0.m164364a();
                return null;
        }
    }
}
