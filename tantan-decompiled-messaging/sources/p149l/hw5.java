package p149l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import okhttp3.C21832a;

/* JADX INFO: loaded from: classes2.dex */
public final class hw5 {

    /* JADX INFO: renamed from: a */
    public final List<C21832a> f109722a;

    /* JADX INFO: renamed from: b */
    public int f109723b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f109724c;

    /* JADX INFO: renamed from: d */
    public boolean f109725d;

    public hw5(List<C21832a> list) {
        this.f109722a = list;
    }

    /* JADX INFO: renamed from: a */
    public C21832a m133234a(SSLSocket sSLSocket) throws IOException {
        C21832a c21832a;
        int i = this.f109723b;
        int size = this.f109722a.size();
        while (true) {
            if (i >= size) {
                c21832a = null;
                break;
            }
            c21832a = this.f109722a.get(i);
            if (c21832a.m221032c(sSLSocket)) {
                this.f109723b = i + 1;
                break;
            }
            i++;
        }
        if (c21832a != null) {
            this.f109724c = m133236c(sSLSocket);
            kxm.f125142a.mo144873c(c21832a, sSLSocket, this.f109725d);
            return c21832a;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f109725d);
        sb.append(", modes=");
        sb.append(this.f109722a);
        String string = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public boolean m133235b(IOException iOException) {
        this.f109725d = true;
        if (!this.f109724c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m133236c(SSLSocket sSLSocket) {
        for (int i = this.f109723b; i < this.f109722a.size(); i++) {
            if (this.f109722a.get(i).m221032c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
