package p153l;

import com.google.android.gms.common.api.Api;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import org.eclipse.jetty.http.HttpHeaders;
import org.eclipse.jetty.http.HttpMethods;

/* JADX INFO: loaded from: classes2.dex */
public final class y5d0 implements azm {

    /* JADX INFO: renamed from: a */
    public final rg50 f197553a;

    public y5d0(rg50 rg50Var) {
        this.f197553a = rg50Var;
    }

    /* JADX INFO: renamed from: a */
    public final x1d0 m214290a(i5d0 i5d0Var, nnd0 nnd0Var) throws IOException {
        String strM138675u;
        rnl rnlVarM182277H;
        if (i5d0Var == null) {
            wpg0.m207458a();
            return null;
        }
        int iM138673q = i5d0Var.m138673q();
        String strM209022g = i5d0Var.m138668Z().m209022g();
        if (iM138673q == 307 || iM138673q == 308) {
            if (!strM209022g.equals("GET") && !strM209022g.equals(HttpMethods.HEAD)) {
                return null;
            }
        } else {
            if (iM138673q == 401) {
                return this.f197553a.m181342b().mo103679b(nnd0Var, i5d0Var);
            }
            if (iM138673q == 503) {
                if ((i5d0Var.m138665Q() == null || i5d0Var.m138665Q().m138673q() != 503) && m214294e(i5d0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return i5d0Var.m138668Z();
                }
                return null;
            }
            if (iM138673q == 407) {
                if ((nnd0Var != null ? nnd0Var.m163862b() : this.f197553a.m181333A()).type() == Proxy.Type.HTTP) {
                    return this.f197553a.m181334B().mo103679b(nnd0Var, i5d0Var);
                }
                e7b0.m119688a("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                return null;
            }
            if (iM138673q == 408) {
                if (!this.f197553a.m181337E()) {
                    return null;
                }
                z1d0 z1d0VarM209016a = i5d0Var.m138668Z().m209016a();
                if (z1d0VarM209016a != null && z1d0VarM209016a.isOneShot()) {
                    return null;
                }
                if ((i5d0Var.m138665Q() == null || i5d0Var.m138665Q().m138673q() != 408) && m214294e(i5d0Var, 0) <= 0) {
                    return i5d0Var.m138668Z();
                }
                return null;
            }
            switch (iM138673q) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f197553a.m181353p() || (strM138675u = i5d0Var.m138675u("Location")) == null || (rnlVarM182277H = i5d0Var.m138668Z().m209026k().m182277H(strM138675u)) == null) {
            return null;
        }
        if (!rnlVarM182277H.m182278I().equals(i5d0Var.m138668Z().m209026k().m182278I()) && !this.f197553a.m181354q()) {
            return null;
        }
        x1d0.C21228a c21228aM209023h = i5d0Var.m138668Z().m209023h();
        if (zml.m220393b(strM209022g)) {
            boolean zM220395d = zml.m220395d(strM209022g);
            if (zml.m220394c(strM209022g)) {
                c21228aM209023h.m209036j("GET", null);
            } else {
                c21228aM209023h.m209036j(strM209022g, zM220395d ? i5d0Var.m138668Z().m209016a() : null);
            }
            if (!zM220395d) {
                c21228aM209023h.m209040n(HttpHeaders.TRANSFER_ENCODING);
                c21228aM209023h.m209040n("Content-Length");
                c21228aM209023h.m209040n("Content-Type");
            }
        }
        if (!zlk0.m220230D(i5d0Var.m138668Z().m209026k(), rnlVarM182277H)) {
            c21228aM209023h.m209040n("Authorization");
        }
        return c21228aM209023h.m209045s(rnlVarM182277H).m209028b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m214291b(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m214292c(IOException iOException, oij0 oij0Var, boolean z, x1d0 x1d0Var) {
        if (this.f197553a.m181337E()) {
            return !(z && m214293d(iOException, x1d0Var)) && m214291b(iOException, z) && oij0Var.m167778c();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m214293d(IOException iOException, x1d0 x1d0Var) {
        z1d0 z1d0VarM209016a = x1d0Var.m209016a();
        return (z1d0VarM209016a != null && z1d0VarM209016a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: e */
    public final int m214294e(i5d0 i5d0Var, int i) {
        String strM138675u = i5d0Var.m138675u(HttpHeaders.RETRY_AFTER);
        if (strM138675u == null) {
            return i;
        }
        return strM138675u.matches("\\d+") ? Integer.valueOf(strM138675u).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p153l.azm
    public i5d0 intercept(azm.InterfaceC15867a interfaceC15867a) throws IOException {
        x1d0 x1d0VarRequest = interfaceC15867a.request();
        tmc0 tmc0Var = (tmc0) interfaceC15867a;
        oij0 oij0VarM191726d = tmc0Var.m191726d();
        int i = 0;
        i5d0 i5d0Var = null;
        while (true) {
            oij0VarM191726d.m167788m(x1d0VarRequest);
            if (oij0VarM191726d.m167784i()) {
                zpg0.m220844a("Canceled");
                return null;
            }
            try {
                try {
                    i5d0 i5d0VarM191725c = tmc0Var.m191725c(x1d0VarRequest, oij0VarM191726d, null);
                    if (i5d0Var != null) {
                        i5d0VarM191725c = i5d0VarM191725c.m138664N().m138690n(i5d0Var.m138664N().m138678b(null).m138679c()).m138679c();
                    }
                    i5d0Var = i5d0VarM191725c;
                    n6f n6fVarMo152197f = kzm.f129436a.mo152197f(i5d0Var);
                    x1d0 x1d0VarM214290a = m214290a(i5d0Var, n6fVarMo152197f != null ? n6fVarMo152197f.m161766c().mo106825b() : null);
                    if (x1d0VarM214290a != null) {
                        z1d0 z1d0VarM209016a = x1d0VarM214290a.m209016a();
                        if (z1d0VarM209016a == null || !z1d0VarM209016a.isOneShot()) {
                            zlk0.m220245g(i5d0Var.m138670k());
                            if (oij0VarM191726d.m167783h()) {
                                n6fVarMo152197f.m161768e();
                            }
                            i++;
                            if (i > 20) {
                                f7b0.m124433a("Too many follow-up requests: ", i);
                                return null;
                            }
                            x1d0VarRequest = x1d0VarM214290a;
                        }
                    } else if (n6fVarMo152197f != null && n6fVarMo152197f.m161771h()) {
                        oij0VarM191726d.m167790o();
                    }
                    return i5d0Var;
                } catch (IOException e) {
                    if (!m214292c(e, oij0VarM191726d, !(e instanceof ConnectionShutdownException), x1d0VarRequest)) {
                        throw e;
                    }
                    oij0VarM191726d.m167781f();
                } catch (RouteException e2) {
                    if (!m214292c(e2.getLastConnectException(), oij0VarM191726d, false, x1d0VarRequest)) {
                        throw e2.getFirstConnectException();
                    }
                    oij0VarM191726d.m167781f();
                }
            } catch (Throwable th) {
                oij0VarM191726d.m167781f();
                throw th;
            }
        }
    }
}
