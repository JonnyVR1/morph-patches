package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import p153l.akq;
import p153l.bmk0;
import p153l.i11;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2004e {

    /* JADX INFO: renamed from: b */
    public static final C2004e f8898b = new b().m11619e();

    /* JADX INFO: renamed from: a */
    public final ImmutableListMultimap<String, String> f8899a;

    public C2004e(b bVar) {
        this.f8899a = bVar.f8900a.m15765f();
    }

    /* JADX INFO: renamed from: c */
    public static String m11611c(String str) {
        if (i11.m138047a(str, HttpHeaders.ACCEPT)) {
            return HttpHeaders.ACCEPT;
        }
        if (i11.m138047a(str, HttpHeaders.ALLOW)) {
            return HttpHeaders.ALLOW;
        }
        if (i11.m138047a(str, "Authorization")) {
            return "Authorization";
        }
        if (i11.m138047a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (i11.m138047a(str, "Blocksize")) {
            return "Blocksize";
        }
        if (i11.m138047a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (i11.m138047a(str, HttpHeaders.CONNECTION)) {
            return HttpHeaders.CONNECTION;
        }
        if (i11.m138047a(str, "Content-Base")) {
            return "Content-Base";
        }
        if (i11.m138047a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (i11.m138047a(str, HttpHeaders.CONTENT_LANGUAGE)) {
            return HttpHeaders.CONTENT_LANGUAGE;
        }
        if (i11.m138047a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (i11.m138047a(str, HttpHeaders.CONTENT_LOCATION)) {
            return HttpHeaders.CONTENT_LOCATION;
        }
        if (i11.m138047a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (i11.m138047a(str, "CSeq")) {
            return "CSeq";
        }
        if (i11.m138047a(str, "Date")) {
            return "Date";
        }
        if (i11.m138047a(str, "Expires")) {
            return "Expires";
        }
        if (i11.m138047a(str, "Location")) {
            return "Location";
        }
        if (i11.m138047a(str, HttpHeaders.PROXY_AUTHENTICATE)) {
            return HttpHeaders.PROXY_AUTHENTICATE;
        }
        if (i11.m138047a(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (i11.m138047a(str, "Public")) {
            return "Public";
        }
        if (i11.m138047a(str, "Range")) {
            return "Range";
        }
        if (i11.m138047a(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (i11.m138047a(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (i11.m138047a(str, "Scale")) {
            return "Scale";
        }
        if (i11.m138047a(str, "Session")) {
            return "Session";
        }
        if (i11.m138047a(str, "Speed")) {
            return "Speed";
        }
        if (i11.m138047a(str, "Supported")) {
            return "Supported";
        }
        if (i11.m138047a(str, "Timestamp")) {
            return "Timestamp";
        }
        if (i11.m138047a(str, "Transport")) {
            return "Transport";
        }
        if (i11.m138047a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (i11.m138047a(str, HttpHeaders.VIA)) {
            return HttpHeaders.VIA;
        }
        return i11.m138047a(str, HttpHeaders.WWW_AUTHENTICATE) ? HttpHeaders.WWW_AUTHENTICATE : str;
    }

    /* JADX INFO: renamed from: b */
    public ImmutableListMultimap<String, String> m11612b() {
        return this.f8899a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m11613d(String str) {
        ImmutableList<String> immutableListM11614e = m11614e(str);
        if (immutableListM11614e.isEmpty()) {
            return null;
        }
        return (String) akq.m98599g(immutableListM11614e);
    }

    /* JADX INFO: renamed from: e */
    public ImmutableList<String> m11614e(String str) {
        return this.f8899a.get(m11611c(str));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2004e) {
            return this.f8899a.equals(((C2004e) obj).f8899a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8899a.hashCode();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ImmutableListMultimap.C2806a<String, String> f8900a;

        public b(String str, @Nullable String str2, int i) {
            this();
            m11616b("User-Agent", str);
            m11616b("CSeq", String.valueOf(i));
            if (str2 != null) {
                m11616b("Session", str2);
            }
        }

        /* JADX INFO: renamed from: b */
        public b m11616b(String str, String str2) {
            this.f8900a.mo15763c(C2004e.m11611c(str.trim()), str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m11617c(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrM105122b1 = bmk0.m105122b1(list.get(i), ":\\s?");
                if (strArrM105122b1.length == 2) {
                    m11616b(strArrM105122b1[0], strArrM105122b1[1]);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m11618d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m11616b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2004e m11619e() {
            return new C2004e(this);
        }

        public b() {
            this.f8900a = new ImmutableListMultimap.C2806a<>();
        }
    }
}
