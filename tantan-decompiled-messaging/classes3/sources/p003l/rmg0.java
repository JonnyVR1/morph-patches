package p003l;

import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.TreeSet;
import l.axm;
import l.exc0;
import l.gxc0;
import l.hyx;
import l.oxk;
import l.stc0;
import l.utc0;
import l.wv5;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class rmg0 implements axm {

    /* JADX INFO: renamed from: d */
    public static boolean f6997d = false;

    /* JADX INFO: renamed from: a */
    public volatile TreeSet f6998a = new TreeSet();

    /* JADX INFO: renamed from: b */
    public final ugg0 f6999b = new ugg0();

    /* JADX INFO: renamed from: c */
    public volatile int f7000c = 1;

    /* JADX INFO: renamed from: a */
    public static boolean m7347a(Buffer buffer) {
        try {
            Buffer buffer2 = new Buffer();
            buffer.copyTo(buffer2, 0L, Math.min(buffer.size(), 64L));
            for (int i = 0; i < 16 && !buffer2.exhausted(); i++) {
                int utf8CodePoint = buffer2.readUtf8CodePoint();
                if (Character.isISOControl(utf8CodePoint) && !Character.isWhitespace(utf8CodePoint)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0441  */
    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    public final exc0 intercept(axm.a aVar) throws Exception {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        long j;
        int i = this.f7000c;
        stc0 stc0VarRequest = aVar.request();
        boolean z2 = true;
        if (i == 1) {
            return aVar.a(stc0VarRequest);
        }
        boolean z3 = i == 4;
        if (!z3 && i != 3) {
            z2 = false;
        }
        if (z3 && "sud_log_level_value_headers".equals(stc0VarRequest.c("sud_log_level_key"))) {
            stc0.a aVarH = stc0VarRequest.h();
            aVarH.n("sud_log_level_key");
            stc0VarRequest = aVarH.b();
            z3 = false;
        }
        utc0 utc0VarA = stc0VarRequest.a();
        wv5 wv5VarConnection = aVar.connection();
        String str5 = " ";
        String strConcat = ("--> " + stc0VarRequest.g()).concat(" ") + stc0VarRequest.k();
        if (wv5VarConnection != null) {
            strConcat = strConcat + wv5VarConnection.a();
        }
        if (!z2 && utc0VarA != null) {
            strConcat = strConcat.concat(" (requestBody.contentLength()").concat("-byte body)");
        }
        this.f6999b.m8143a(strConcat);
        String str6 = HttpHeaders.CONTENT_LENGTH;
        if (z2) {
            oxk oxkVarE = stc0VarRequest.e();
            if (utc0VarA != null) {
                if (utc0VarA.contentType() != null) {
                    z = z2;
                    if (oxkVarE.d(HttpHeaders.CONTENT_TYPE) == null) {
                        this.f6999b.m8143a("Content-Type: " + utc0VarA.contentType());
                    }
                    if (utc0VarA.contentLength() == -1 && oxkVarE.d(HttpHeaders.CONTENT_LENGTH) == null) {
                        this.f6999b.m8143a("Content-Length: " + utc0VarA.contentLength());
                    }
                } else {
                    z = z2;
                }
                if (utc0VarA.contentLength() == -1) {
                }
            } else {
                z = z2;
                z3 = z3;
                str5 = " ";
            }
            int i2 = 0;
            while (i2 < oxkVarE.k()) {
                this.f6999b.m8143a(oxkVarE.f(i2) + ": " + (this.f6998a.contains(oxkVarE.f(i2)) ? str5 : oxkVarE.m(i2)));
                i2++;
                str6 = str6;
            }
            str2 = str6;
            if (!z3 || utc0VarA == null) {
                str = r8;
                this.f6999b.m8143a("--> END " + stc0VarRequest.g());
            } else {
                String strD = stc0VarRequest.e().d(HttpHeaders.CONTENT_ENCODING);
                if (strD == null || strD.equalsIgnoreCase("identity") || strD.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                    Buffer buffer = new Buffer();
                    utc0VarA.writeTo(buffer);
                    hyx hyxVarContentType = utc0VarA.contentType();
                    Charset charset = StandardCharsets.UTF_8;
                    Charset charsetB = hyxVarContentType != null ? hyxVarContentType.b(charset) : null;
                    if (charsetB != null) {
                        charset = charsetB;
                    }
                    this.f6999b.m8143a("");
                    boolean zM7347a = m7347a(buffer);
                    ugg0 ugg0Var = this.f6999b;
                    if (zM7347a) {
                        ugg0Var.m8143a(buffer.readString(charset));
                        this.f6999b.m8143a("--> END " + stc0VarRequest.g() + " (" + utc0VarA.contentLength() + "-byte body)");
                    } else {
                        StringBuilder sb = new StringBuilder("--> END ");
                        sb.append(stc0VarRequest.g());
                        sb.append(" (binary ");
                        sb.append(utc0VarA.contentLength());
                        str = r8;
                        sb.append(str);
                        ugg0Var.m8143a(sb.toString());
                    }
                } else {
                    this.f6999b.m8143a("--> END " + stc0VarRequest.g() + " (encoded body omitted)");
                }
                str = "-byte body omitted)";
            }
        } else {
            z = z2;
            z3 = z3;
            str = "-byte body omitted)";
            str5 = " ";
            str2 = HttpHeaders.CONTENT_LENGTH;
        }
        long jNanoTime = System.nanoTime();
        try {
            exc0 exc0VarA = aVar.a(stc0VarRequest);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            gxc0 gxc0VarK = exc0VarA.k();
            if (gxc0VarK != null) {
                long jContentLength = gxc0VarK.contentLength();
                String str7 = jContentLength != -1 ? "$contentLength-byte" : "unknown-length";
                ugg0 ugg0Var2 = this.f6999b;
                Locale locale = Locale.getDefault();
                Integer numValueOf = Integer.valueOf(exc0VarA.q());
                if (exc0VarA.J().isEmpty()) {
                    str4 = "";
                    str3 = str5;
                } else {
                    str3 = str5;
                    str4 = str3 + exc0VarA.J();
                }
                String str8 = str3;
                ugg0Var2.m8143a(String.format(locale, "<-- %s%s %s (%dms%s)", numValueOf, str4, exc0VarA.Y().k(), Long.valueOf(jNanoTime2), z ? ")" : ", " + str7 + " body"));
                if (z) {
                    oxk oxkVarF = exc0VarA.F();
                    for (int i3 = 0; i3 < oxkVarF.k(); i3++) {
                        this.f6999b.m8143a(oxkVarF.f(i3) + ": " + (this.f6998a.contains(oxkVarF.f(i3)) ? str8 : oxkVarF.m(i3)));
                    }
                    if (!z3 || HttpMethods.HEAD.equals(exc0VarA.Y().g())) {
                        this.f6999b.m8143a("<-- END HTTP");
                    } else {
                        int iQ = exc0VarA.q();
                        if ((iQ >= 100 && iQ < 200) || iQ == 204 || iQ == 304) {
                            try {
                                j = Long.parseLong(exc0VarA.F().d(str2));
                            } catch (Exception e) {
                                e.printStackTrace();
                                j = -1;
                            }
                            if (j == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(exc0VarA.u(HttpHeaders.TRANSFER_ENCODING))) {
                                this.f6999b.m8143a("<-- END HTTP");
                            }
                        }
                        String strD2 = exc0VarA.F().d(HttpHeaders.CONTENT_ENCODING);
                        if (strD2 == null || strD2.equalsIgnoreCase("identity") || strD2.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                            BufferedSource bufferedSourceSource = gxc0VarK.source();
                            bufferedSourceSource.request(Long.MAX_VALUE);
                            Buffer buffer2 = bufferedSourceSource.buffer();
                            if (HttpHeaderValues.GZIP.equalsIgnoreCase(oxkVarF.d(HttpHeaders.CONTENT_ENCODING))) {
                                lValueOf = Long.valueOf(buffer2.size());
                                GzipSource gzipSource = new GzipSource(buffer2.clone());
                                try {
                                    buffer2 = new Buffer();
                                    buffer2.writeAll(gzipSource);
                                    gzipSource.close();
                                } catch (Throwable th) {
                                    try {
                                        gzipSource.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            } else {
                                lValueOf = null;
                            }
                            hyx hyxVarContentType2 = gxc0VarK.contentType();
                            Charset charset2 = StandardCharsets.UTF_8;
                            Charset charsetB2 = hyxVarContentType2 != null ? hyxVarContentType2.b(charset2) : null;
                            if (charsetB2 != null) {
                                charset2 = charsetB2;
                            }
                            if (!m7347a(buffer2)) {
                                this.f6999b.m8143a("");
                                this.f6999b.m8143a("<-- END HTTP (binary " + buffer2.size() + str);
                                return exc0VarA;
                            }
                            if (jContentLength != 0) {
                                this.f6999b.m8143a("");
                                this.f6999b.m8143a(buffer2.clone().readString(charset2));
                            }
                            ugg0 ugg0Var3 = this.f6999b;
                            if (lValueOf != null) {
                                ugg0Var3.m8143a(String.format(Locale.getDefault(), "<-- END HTTP (%d-byte, %d-gzipped-byte body)", Long.valueOf(buffer2.size()), lValueOf));
                            } else {
                                Locale.getDefault();
                                ugg0Var3.m8143a("<-- END HTTP (" + buffer2.size() + "-byte body)");
                            }
                        } else {
                            this.f6999b.m8143a("<-- END HTTP (encoded body omitted)");
                        }
                    }
                }
            }
            return exc0VarA;
        } catch (Exception e2) {
            this.f6999b.m8143a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
