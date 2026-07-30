package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.TreeSet;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.eclipse.jetty.http.HttpHeaderValues;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes3.dex */
public final class rmg0 implements axm {

    /* JADX INFO: renamed from: d */
    public static boolean f160093d = false;

    /* JADX INFO: renamed from: a */
    public volatile TreeSet f160094a = new TreeSet();

    /* JADX INFO: renamed from: b */
    public final ugg0 f160095b = new ugg0();

    /* JADX INFO: renamed from: c */
    public volatile int f160096c = 1;

    /* JADX INFO: renamed from: a */
    public static boolean m179981a(Buffer buffer) {
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
    @Override // p149l.axm
    public final exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws Exception {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        long j;
        int i = this.f160096c;
        stc0 stc0VarRequest = interfaceC15754a.request();
        boolean z2 = true;
        if (i == 1) {
            return interfaceC15754a.mo99454a(stc0VarRequest);
        }
        boolean z3 = i == 4;
        if (!z3 && i != 3) {
            z2 = false;
        }
        if (z3 && "sud_log_level_value_headers".equals(stc0VarRequest.m185873c("sud_log_level_key"))) {
            stc0.C20027a c20027aM185878h = stc0VarRequest.m185878h();
            c20027aM185878h.m185895n("sud_log_level_key");
            stc0VarRequest = c20027aM185878h.m185883b();
            z3 = false;
        }
        utc0 utc0VarM185871a = stc0VarRequest.m185871a();
        wv5 wv5VarConnection = interfaceC15754a.connection();
        String str5 = "--> " + stc0VarRequest.m185877g();
        String str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        String strConcat = str5.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) + stc0VarRequest.m185881k();
        if (wv5VarConnection != null) {
            strConcat = strConcat + wv5VarConnection.mo101329a();
        }
        if (!z2 && utc0VarM185871a != null) {
            strConcat = strConcat.concat(" (requestBody.contentLength()").concat("-byte body)");
        }
        this.f160095b.m193562a(strConcat);
        String str7 = "Content-Length";
        if (z2) {
            oxk oxkVarM185875e = stc0VarRequest.m185875e();
            if (utc0VarM185871a != null) {
                if (utc0VarM185871a.contentType() != null) {
                    z = z2;
                    if (oxkVarM185875e.m166555d("Content-Type") == null) {
                        this.f160095b.m193562a("Content-Type: " + utc0VarM185871a.contentType());
                    }
                    if (utc0VarM185871a.contentLength() == -1 && oxkVarM185875e.m166555d("Content-Length") == null) {
                        this.f160095b.m193562a("Content-Length: " + utc0VarM185871a.contentLength());
                    }
                } else {
                    z = z2;
                }
                if (utc0VarM185871a.contentLength() == -1) {
                }
            } else {
                z = z2;
                z3 = z3;
                str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            int i2 = 0;
            while (i2 < oxkVarM185875e.m166559k()) {
                this.f160095b.m193562a(oxkVarM185875e.m166556f(i2) + ": " + (this.f160094a.contains(oxkVarM185875e.m166556f(i2)) ? str6 : oxkVarM185875e.m166561m(i2)));
                i2++;
                str7 = str7;
            }
            str2 = str7;
            if (!z3 || utc0VarM185871a == null) {
                str = r8;
                this.f160095b.m193562a("--> END " + stc0VarRequest.m185877g());
            } else {
                String strM166555d = stc0VarRequest.m185875e().m166555d("Content-Encoding");
                if (strM166555d == null || strM166555d.equalsIgnoreCase("identity") || strM166555d.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                    Buffer buffer = new Buffer();
                    utc0VarM185871a.writeTo(buffer);
                    hyx hyxVarContentType = utc0VarM185871a.contentType();
                    Charset charset = StandardCharsets.UTF_8;
                    Charset charsetM133630b = hyxVarContentType != null ? hyxVarContentType.m133630b(charset) : null;
                    if (charsetM133630b != null) {
                        charset = charsetM133630b;
                    }
                    this.f160095b.m193562a("");
                    boolean zM179981a = m179981a(buffer);
                    ugg0 ugg0Var = this.f160095b;
                    if (zM179981a) {
                        ugg0Var.m193562a(buffer.readString(charset));
                        this.f160095b.m193562a("--> END " + stc0VarRequest.m185877g() + " (" + utc0VarM185871a.contentLength() + "-byte body)");
                    } else {
                        StringBuilder sb = new StringBuilder("--> END ");
                        sb.append(stc0VarRequest.m185877g());
                        sb.append(" (binary ");
                        sb.append(utc0VarM185871a.contentLength());
                        str = r8;
                        sb.append(str);
                        ugg0Var.m193562a(sb.toString());
                    }
                } else {
                    this.f160095b.m193562a("--> END " + stc0VarRequest.m185877g() + " (encoded body omitted)");
                }
                str = "-byte body omitted)";
            }
        } else {
            z = z2;
            z3 = z3;
            str = "-byte body omitted)";
            str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            str2 = "Content-Length";
        }
        long jNanoTime = System.nanoTime();
        try {
            exc0 exc0VarMo99454a = interfaceC15754a.mo99454a(stc0VarRequest);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            gxc0 gxc0VarM118606k = exc0VarMo99454a.m118606k();
            if (gxc0VarM118606k != null) {
                long jContentLength = gxc0VarM118606k.contentLength();
                String str8 = jContentLength != -1 ? "$contentLength-byte" : "unknown-length";
                ugg0 ugg0Var2 = this.f160095b;
                Locale locale = Locale.getDefault();
                Integer numValueOf = Integer.valueOf(exc0VarMo99454a.m118609q());
                if (exc0VarMo99454a.m118598J().isEmpty()) {
                    str4 = "";
                    str3 = str6;
                } else {
                    str3 = str6;
                    str4 = str3 + exc0VarMo99454a.m118598J();
                }
                String str9 = str3;
                ugg0Var2.m193562a(String.format(locale, "<-- %s%s %s (%dms%s)", numValueOf, str4, exc0VarMo99454a.m118604Y().m185881k(), Long.valueOf(jNanoTime2), z ? ")" : ", " + str8 + " body"));
                if (z) {
                    oxk oxkVarM118595F = exc0VarMo99454a.m118595F();
                    for (int i3 = 0; i3 < oxkVarM118595F.m166559k(); i3++) {
                        this.f160095b.m193562a(oxkVarM118595F.m166556f(i3) + ": " + (this.f160094a.contains(oxkVarM118595F.m166556f(i3)) ? str9 : oxkVarM118595F.m166561m(i3)));
                    }
                    if (!z3 || HttpMethods.HEAD.equals(exc0VarMo99454a.m118604Y().m185877g())) {
                        this.f160095b.m193562a("<-- END HTTP");
                    } else {
                        int iM118609q = exc0VarMo99454a.m118609q();
                        if ((iM118609q >= 100 && iM118609q < 200) || iM118609q == 204 || iM118609q == 304) {
                            try {
                                j = Long.parseLong(exc0VarMo99454a.m118595F().m166555d(str2));
                            } catch (Exception e) {
                                e.printStackTrace();
                                j = -1;
                            }
                            if (j == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(exc0VarMo99454a.m118611u(HttpHeaders.TRANSFER_ENCODING))) {
                                this.f160095b.m193562a("<-- END HTTP");
                            }
                        }
                        String strM166555d2 = exc0VarMo99454a.m118595F().m166555d("Content-Encoding");
                        if (strM166555d2 == null || strM166555d2.equalsIgnoreCase("identity") || strM166555d2.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                            BufferedSource bufferedSourceSource = gxc0VarM118606k.source();
                            bufferedSourceSource.request(Long.MAX_VALUE);
                            Buffer bufferField = bufferedSourceSource.getBufferField();
                            if (HttpHeaderValues.GZIP.equalsIgnoreCase(oxkVarM118595F.m166555d("Content-Encoding"))) {
                                lValueOf = Long.valueOf(bufferField.size());
                                GzipSource gzipSource = new GzipSource(bufferField.clone());
                                try {
                                    bufferField = new Buffer();
                                    bufferField.writeAll(gzipSource);
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
                            hyx hyxVarContentType2 = gxc0VarM118606k.contentType();
                            Charset charset2 = StandardCharsets.UTF_8;
                            Charset charsetM133630b2 = hyxVarContentType2 != null ? hyxVarContentType2.m133630b(charset2) : null;
                            if (charsetM133630b2 != null) {
                                charset2 = charsetM133630b2;
                            }
                            if (!m179981a(bufferField)) {
                                this.f160095b.m193562a("");
                                this.f160095b.m193562a("<-- END HTTP (binary " + bufferField.size() + str);
                                return exc0VarMo99454a;
                            }
                            if (jContentLength != 0) {
                                this.f160095b.m193562a("");
                                this.f160095b.m193562a(bufferField.clone().readString(charset2));
                            }
                            ugg0 ugg0Var3 = this.f160095b;
                            if (lValueOf != null) {
                                ugg0Var3.m193562a(String.format(Locale.getDefault(), "<-- END HTTP (%d-byte, %d-gzipped-byte body)", Long.valueOf(bufferField.size()), lValueOf));
                            } else {
                                Locale.getDefault();
                                ugg0Var3.m193562a("<-- END HTTP (" + bufferField.size() + "-byte body)");
                            }
                        } else {
                            this.f160095b.m193562a("<-- END HTTP (encoded body omitted)");
                        }
                    }
                }
            }
            return exc0VarMo99454a;
        } catch (Exception e2) {
            this.f160095b.m193562a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
