package p153l;

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
public final class zug0 implements azm {

    /* JADX INFO: renamed from: d */
    public static boolean f206123d = false;

    /* JADX INFO: renamed from: a */
    public volatile TreeSet f206124a = new TreeSet();

    /* JADX INFO: renamed from: b */
    public final cpg0 f206125b = new cpg0();

    /* JADX INFO: renamed from: c */
    public volatile int f206126c = 1;

    /* JADX INFO: renamed from: a */
    public static boolean m221645a(Buffer buffer) {
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
    @Override // p153l.azm
    public final i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws Exception {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        Long lValueOf;
        long j;
        int i = this.f206126c;
        x1d0 x1d0VarRequest = interfaceC15867a.request();
        boolean z2 = true;
        if (i == 1) {
            return interfaceC15867a.mo101076a(x1d0VarRequest);
        }
        boolean z3 = i == 4;
        if (!z3 && i != 3) {
            z2 = false;
        }
        if (z3 && "sud_log_level_value_headers".equals(x1d0VarRequest.m209018c("sud_log_level_key"))) {
            x1d0.C21228a c21228aM209023h = x1d0VarRequest.m209023h();
            c21228aM209023h.m209040n("sud_log_level_key");
            x1d0VarRequest = c21228aM209023h.m209028b();
            z3 = false;
        }
        z1d0 z1d0VarM209016a = x1d0VarRequest.m209016a();
        bx5 bx5VarConnection = interfaceC15867a.connection();
        String str5 = "--> " + x1d0VarRequest.m209022g();
        String str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
        String strConcat = str5.concat(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR) + x1d0VarRequest.m209026k();
        if (bx5VarConnection != null) {
            strConcat = strConcat + bx5VarConnection.mo106824a();
        }
        if (!z2 && z1d0VarM209016a != null) {
            strConcat = strConcat.concat(" (requestBody.contentLength()").concat("-byte body)");
        }
        this.f206125b.m111758a(strConcat);
        String str7 = "Content-Length";
        if (z2) {
            e0l e0lVarM209020e = x1d0VarRequest.m209020e();
            if (z1d0VarM209016a != null) {
                if (z1d0VarM209016a.contentType() != null) {
                    z = z2;
                    if (e0lVarM209020e.m118874d("Content-Type") == null) {
                        this.f206125b.m111758a("Content-Type: " + z1d0VarM209016a.contentType());
                    }
                    if (z1d0VarM209016a.contentLength() == -1 && e0lVarM209020e.m118874d("Content-Length") == null) {
                        this.f206125b.m111758a("Content-Length: " + z1d0VarM209016a.contentLength());
                    }
                } else {
                    z = z2;
                }
                if (z1d0VarM209016a.contentLength() == -1) {
                }
            } else {
                z = z2;
                z3 = z3;
                str6 = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            }
            int i2 = 0;
            while (i2 < e0lVarM209020e.m118878k()) {
                this.f206125b.m111758a(e0lVarM209020e.m118875f(i2) + ": " + (this.f206124a.contains(e0lVarM209020e.m118875f(i2)) ? str6 : e0lVarM209020e.m118880m(i2)));
                i2++;
                str7 = str7;
            }
            str2 = str7;
            if (!z3 || z1d0VarM209016a == null) {
                str = r8;
                this.f206125b.m111758a("--> END " + x1d0VarRequest.m209022g());
            } else {
                String strM118874d = x1d0VarRequest.m209020e().m118874d("Content-Encoding");
                if (strM118874d == null || strM118874d.equalsIgnoreCase("identity") || strM118874d.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                    Buffer buffer = new Buffer();
                    z1d0VarM209016a.writeTo(buffer);
                    e7y e7yVarContentType = z1d0VarM209016a.contentType();
                    Charset charset = StandardCharsets.UTF_8;
                    Charset charsetM119775b = e7yVarContentType != null ? e7yVarContentType.m119775b(charset) : null;
                    if (charsetM119775b != null) {
                        charset = charsetM119775b;
                    }
                    this.f206125b.m111758a("");
                    boolean zM221645a = m221645a(buffer);
                    cpg0 cpg0Var = this.f206125b;
                    if (zM221645a) {
                        cpg0Var.m111758a(buffer.readString(charset));
                        this.f206125b.m111758a("--> END " + x1d0VarRequest.m209022g() + " (" + z1d0VarM209016a.contentLength() + "-byte body)");
                    } else {
                        StringBuilder sb = new StringBuilder("--> END ");
                        sb.append(x1d0VarRequest.m209022g());
                        sb.append(" (binary ");
                        sb.append(z1d0VarM209016a.contentLength());
                        str = r8;
                        sb.append(str);
                        cpg0Var.m111758a(sb.toString());
                    }
                } else {
                    this.f206125b.m111758a("--> END " + x1d0VarRequest.m209022g() + " (encoded body omitted)");
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
            i5d0 i5d0VarMo101076a = interfaceC15867a.mo101076a(x1d0VarRequest);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            k5d0 k5d0VarM138670k = i5d0VarMo101076a.m138670k();
            if (k5d0VarM138670k != null) {
                long jContentLength = k5d0VarM138670k.contentLength();
                String str8 = jContentLength != -1 ? "$contentLength-byte" : "unknown-length";
                cpg0 cpg0Var2 = this.f206125b;
                Locale locale = Locale.getDefault();
                Integer numValueOf = Integer.valueOf(i5d0VarMo101076a.m138673q());
                if (i5d0VarMo101076a.m138662J().isEmpty()) {
                    str4 = "";
                    str3 = str6;
                } else {
                    str3 = str6;
                    str4 = str3 + i5d0VarMo101076a.m138662J();
                }
                String str9 = str3;
                cpg0Var2.m111758a(String.format(locale, "<-- %s%s %s (%dms%s)", numValueOf, str4, i5d0VarMo101076a.m138668Z().m209026k(), Long.valueOf(jNanoTime2), z ? ")" : ", " + str8 + " body"));
                if (z) {
                    e0l e0lVarM138659F = i5d0VarMo101076a.m138659F();
                    for (int i3 = 0; i3 < e0lVarM138659F.m118878k(); i3++) {
                        this.f206125b.m111758a(e0lVarM138659F.m118875f(i3) + ": " + (this.f206124a.contains(e0lVarM138659F.m118875f(i3)) ? str9 : e0lVarM138659F.m118880m(i3)));
                    }
                    if (!z3 || HttpMethods.HEAD.equals(i5d0VarMo101076a.m138668Z().m209022g())) {
                        this.f206125b.m111758a("<-- END HTTP");
                    } else {
                        int iM138673q = i5d0VarMo101076a.m138673q();
                        if ((iM138673q >= 100 && iM138673q < 200) || iM138673q == 204 || iM138673q == 304) {
                            try {
                                j = Long.parseLong(i5d0VarMo101076a.m138659F().m118874d(str2));
                            } catch (Exception e) {
                                e.printStackTrace();
                                j = -1;
                            }
                            if (j == -1 && !HttpHeaderValues.CHUNKED.equalsIgnoreCase(i5d0VarMo101076a.m138675u(HttpHeaders.TRANSFER_ENCODING))) {
                                this.f206125b.m111758a("<-- END HTTP");
                            }
                        }
                        String strM118874d2 = i5d0VarMo101076a.m138659F().m118874d("Content-Encoding");
                        if (strM118874d2 == null || strM118874d2.equalsIgnoreCase("identity") || strM118874d2.equalsIgnoreCase(HttpHeaderValues.GZIP)) {
                            BufferedSource bufferedSourceSource = k5d0VarM138670k.source();
                            bufferedSourceSource.request(Long.MAX_VALUE);
                            Buffer bufferField = bufferedSourceSource.getBufferField();
                            if (HttpHeaderValues.GZIP.equalsIgnoreCase(e0lVarM138659F.m118874d("Content-Encoding"))) {
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
                            e7y e7yVarContentType2 = k5d0VarM138670k.contentType();
                            Charset charset2 = StandardCharsets.UTF_8;
                            Charset charsetM119775b2 = e7yVarContentType2 != null ? e7yVarContentType2.m119775b(charset2) : null;
                            if (charsetM119775b2 != null) {
                                charset2 = charsetM119775b2;
                            }
                            if (!m221645a(bufferField)) {
                                this.f206125b.m111758a("");
                                this.f206125b.m111758a("<-- END HTTP (binary " + bufferField.size() + str);
                                return i5d0VarMo101076a;
                            }
                            if (jContentLength != 0) {
                                this.f206125b.m111758a("");
                                this.f206125b.m111758a(bufferField.clone().readString(charset2));
                            }
                            cpg0 cpg0Var3 = this.f206125b;
                            if (lValueOf != null) {
                                cpg0Var3.m111758a(String.format(Locale.getDefault(), "<-- END HTTP (%d-byte, %d-gzipped-byte body)", Long.valueOf(bufferField.size()), lValueOf));
                            } else {
                                Locale.getDefault();
                                cpg0Var3.m111758a("<-- END HTTP (" + bufferField.size() + "-byte body)");
                            }
                        } else {
                            this.f206125b.m111758a("<-- END HTTP (encoded body omitted)");
                        }
                    }
                }
            }
            return i5d0VarMo101076a;
        } catch (Exception e2) {
            this.f206125b.m111758a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }
}
