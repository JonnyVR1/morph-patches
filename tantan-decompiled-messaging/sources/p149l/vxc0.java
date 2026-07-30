package p149l;

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
public final class vxc0 implements axm {

    /* JADX INFO: renamed from: a */
    public final k850 f183440a;

    public vxc0(k850 k850Var) {
        this.f183440a = k850Var;
    }

    /* JADX INFO: renamed from: a */
    public final stc0 m200542a(exc0 exc0Var, kfd0 kfd0Var) throws IOException {
        String strM118611u;
        cll cllVarM107513H;
        if (exc0Var == null) {
            ohg0.m164364a();
            return null;
        }
        int iM118609q = exc0Var.m118609q();
        String strM185877g = exc0Var.m118604Y().m185877g();
        if (iM118609q == 307 || iM118609q == 308) {
            if (!strM185877g.equals("GET") && !strM185877g.equals(HttpMethods.HEAD)) {
                return null;
            }
        } else {
            if (iM118609q == 401) {
                return this.f183440a.m144850b().mo193113b(kfd0Var, exc0Var);
            }
            if (iM118609q == 503) {
                if ((exc0Var.m118601Q() == null || exc0Var.m118601Q().m118609q() != 503) && m200546e(exc0Var, Api.BaseClientBuilder.API_PRIORITY_OTHER) == 0) {
                    return exc0Var.m118604Y();
                }
                return null;
            }
            if (iM118609q == 407) {
                if ((kfd0Var != null ? kfd0Var.m145832b() : this.f183440a.m144841A()).type() == Proxy.Type.HTTP) {
                    return this.f183440a.m144842B().mo193113b(kfd0Var, exc0Var);
                }
                aza0.m99642a("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                return null;
            }
            if (iM118609q == 408) {
                if (!this.f183440a.m144845E()) {
                    return null;
                }
                utc0 utc0VarM185871a = exc0Var.m118604Y().m185871a();
                if (utc0VarM185871a != null && utc0VarM185871a.isOneShot()) {
                    return null;
                }
                if ((exc0Var.m118601Q() == null || exc0Var.m118601Q().m118609q() != 408) && m200546e(exc0Var, 0) <= 0) {
                    return exc0Var.m118604Y();
                }
                return null;
            }
            switch (iM118609q) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f183440a.m144861p() || (strM118611u = exc0Var.m118611u("Location")) == null || (cllVarM107513H = exc0Var.m118604Y().m185881k().m107513H(strM118611u)) == null) {
            return null;
        }
        if (!cllVarM107513H.m107514I().equals(exc0Var.m118604Y().m185881k().m107514I()) && !this.f183440a.m144862q()) {
            return null;
        }
        stc0.C20027a c20027aM185878h = exc0Var.m118604Y().m185878h();
        if (lkl.m150370b(strM185877g)) {
            boolean zM150372d = lkl.m150372d(strM185877g);
            if (lkl.m150371c(strM185877g)) {
                c20027aM185878h.m185891j("GET", null);
            } else {
                c20027aM185878h.m185891j(strM185877g, zM150372d ? exc0Var.m118604Y().m185871a() : null);
            }
            if (!zM150372d) {
                c20027aM185878h.m185895n(HttpHeaders.TRANSFER_ENCODING);
                c20027aM185878h.m185895n("Content-Length");
                c20027aM185878h.m185895n("Content-Type");
            }
        }
        if (!tck0.m187991D(exc0Var.m118604Y().m185881k(), cllVarM107513H)) {
            c20027aM185878h.m185895n("Authorization");
        }
        return c20027aM185878h.m185900s(cllVarM107513H).m185883b();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m200543b(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m200544c(IOException iOException, k9j0 k9j0Var, boolean z, stc0 stc0Var) {
        if (this.f183440a.m144845E()) {
            return !(z && m200545d(iOException, stc0Var)) && m200543b(iOException, z) && k9j0Var.m145086c();
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m200545d(IOException iOException, stc0 stc0Var) {
        utc0 utc0VarM185871a = stc0Var.m185871a();
        return (utc0VarM185871a != null && utc0VarM185871a.isOneShot()) || (iOException instanceof FileNotFoundException);
    }

    /* JADX INFO: renamed from: e */
    public final int m200546e(exc0 exc0Var, int i) {
        String strM118611u = exc0Var.m118611u(HttpHeaders.RETRY_AFTER);
        if (strM118611u == null) {
            return i;
        }
        return strM118611u.matches("\\d+") ? Integer.valueOf(strM118611u).intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p149l.axm
    public exc0 intercept(axm.InterfaceC15754a interfaceC15754a) throws IOException {
        stc0 stc0VarRequest = interfaceC15754a.request();
        mec0 mec0Var = (mec0) interfaceC15754a;
        k9j0 k9j0VarM154179d = mec0Var.m154179d();
        int i = 0;
        exc0 exc0Var = null;
        while (true) {
            k9j0VarM154179d.m145096m(stc0VarRequest);
            if (k9j0VarM154179d.m145092i()) {
                rhg0.m179353a("Canceled");
                return null;
            }
            try {
                try {
                    exc0 exc0VarM154178c = mec0Var.m154178c(stc0VarRequest, k9j0VarM154179d, null);
                    if (exc0Var != null) {
                        exc0VarM154178c = exc0VarM154178c.m118600N().m118626n(exc0Var.m118600N().m118614b(null).m118615c()).m118615c();
                    }
                    exc0Var = exc0VarM154178c;
                    j5f j5fVarMo144876f = kxm.f125142a.mo144876f(exc0Var);
                    stc0 stc0VarM200542a = m200542a(exc0Var, j5fVarMo144876f != null ? j5fVarMo144876f.m139846c().mo101330b() : null);
                    if (stc0VarM200542a != null) {
                        utc0 utc0VarM185871a = stc0VarM200542a.m185871a();
                        if (utc0VarM185871a == null || !utc0VarM185871a.isOneShot()) {
                            tck0.m188006g(exc0Var.m118606k());
                            if (k9j0VarM154179d.m145091h()) {
                                j5fVarMo144876f.m139848e();
                            }
                            i++;
                            if (i > 20) {
                                bza0.m104561a("Too many follow-up requests: ", i);
                                return null;
                            }
                            stc0VarRequest = stc0VarM200542a;
                        }
                    } else if (j5fVarMo144876f != null && j5fVarMo144876f.m139851h()) {
                        k9j0VarM154179d.m145098o();
                    }
                    return exc0Var;
                } catch (IOException e) {
                    if (!m200544c(e, k9j0VarM154179d, !(e instanceof ConnectionShutdownException), stc0VarRequest)) {
                        throw e;
                    }
                    k9j0VarM154179d.m145089f();
                } catch (RouteException e2) {
                    if (!m200544c(e2.getLastConnectException(), k9j0VarM154179d, false, stc0VarRequest)) {
                        throw e2.getFirstConnectException();
                    }
                    k9j0VarM154179d.m145089f();
                }
            } catch (Throwable th) {
                k9j0VarM154179d.m145089f();
                throw th;
            }
        }
    }
}
