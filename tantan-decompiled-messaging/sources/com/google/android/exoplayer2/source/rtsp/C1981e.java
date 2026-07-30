package com.google.android.exoplayer2.source.rtsp;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import java.util.List;
import java.util.Map;
import org.eclipse.jetty.http.HttpHeaders;
import p149l.aiq;
import p149l.b11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.e */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1981e {

    /* JADX INFO: renamed from: b */
    public static final C1981e f8861b = new b().m11565e();

    /* JADX INFO: renamed from: a */
    public final ImmutableListMultimap<String, String> f8862a;

    public C1981e(b bVar) {
        this.f8862a = bVar.f8863a.m15711f();
    }

    /* JADX INFO: renamed from: c */
    public static String m11557c(String str) {
        if (b11.m99800a(str, "Accept")) {
            return "Accept";
        }
        if (b11.m99800a(str, HttpHeaders.ALLOW)) {
            return HttpHeaders.ALLOW;
        }
        if (b11.m99800a(str, "Authorization")) {
            return "Authorization";
        }
        if (b11.m99800a(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (b11.m99800a(str, "Blocksize")) {
            return "Blocksize";
        }
        if (b11.m99800a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (b11.m99800a(str, "Connection")) {
            return "Connection";
        }
        if (b11.m99800a(str, "Content-Base")) {
            return "Content-Base";
        }
        if (b11.m99800a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (b11.m99800a(str, HttpHeaders.CONTENT_LANGUAGE)) {
            return HttpHeaders.CONTENT_LANGUAGE;
        }
        if (b11.m99800a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (b11.m99800a(str, HttpHeaders.CONTENT_LOCATION)) {
            return HttpHeaders.CONTENT_LOCATION;
        }
        if (b11.m99800a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (b11.m99800a(str, "CSeq")) {
            return "CSeq";
        }
        if (b11.m99800a(str, "Date")) {
            return "Date";
        }
        if (b11.m99800a(str, "Expires")) {
            return "Expires";
        }
        if (b11.m99800a(str, "Location")) {
            return "Location";
        }
        if (b11.m99800a(str, HttpHeaders.PROXY_AUTHENTICATE)) {
            return HttpHeaders.PROXY_AUTHENTICATE;
        }
        if (b11.m99800a(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (b11.m99800a(str, "Public")) {
            return "Public";
        }
        if (b11.m99800a(str, "Range")) {
            return "Range";
        }
        if (b11.m99800a(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (b11.m99800a(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (b11.m99800a(str, "Scale")) {
            return "Scale";
        }
        if (b11.m99800a(str, "Session")) {
            return "Session";
        }
        if (b11.m99800a(str, "Speed")) {
            return "Speed";
        }
        if (b11.m99800a(str, "Supported")) {
            return "Supported";
        }
        if (b11.m99800a(str, "Timestamp")) {
            return "Timestamp";
        }
        if (b11.m99800a(str, "Transport")) {
            return "Transport";
        }
        if (b11.m99800a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (b11.m99800a(str, HttpHeaders.VIA)) {
            return HttpHeaders.VIA;
        }
        return b11.m99800a(str, HttpHeaders.WWW_AUTHENTICATE) ? HttpHeaders.WWW_AUTHENTICATE : str;
    }

    /* JADX INFO: renamed from: b */
    public ImmutableListMultimap<String, String> m11558b() {
        return this.f8862a;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public String m11559d(String str) {
        ImmutableList<String> immutableListM11560e = m11560e(str);
        if (immutableListM11560e.isEmpty()) {
            return null;
        }
        return (String) aiq.m96881g(immutableListM11560e);
    }

    /* JADX INFO: renamed from: e */
    public ImmutableList<String> m11560e(String str) {
        return this.f8862a.get(m11557c(str));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1981e) {
            return this.f8862a.equals(((C1981e) obj).f8862a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8862a.hashCode();
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final ImmutableListMultimap.C2783a<String, String> f8863a;

        public b(String str, @Nullable String str2, int i) {
            this();
            m11562b("User-Agent", str);
            m11562b("CSeq", String.valueOf(i));
            if (str2 != null) {
                m11562b("Session", str2);
            }
        }

        /* JADX INFO: renamed from: b */
        public b m11562b(String str, String str2) {
            this.f8863a.mo15709c(C1981e.m11557c(str.trim()), str2.trim());
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m11563c(List<String> list) {
            for (int i = 0; i < list.size(); i++) {
                String[] strArrM197844b1 = vck0.m197844b1(list.get(i), ":\\s?");
                if (strArrM197844b1.length == 2) {
                    m11562b(strArrM197844b1[0], strArrM197844b1[1]);
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m11564d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                m11562b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1981e m11565e() {
            return new C1981e(this);
        }

        public b() {
            this.f8863a = new ImmutableListMultimap.C2783a<>();
        }
    }
}
