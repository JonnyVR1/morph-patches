package p153l;

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
import okhttp3.C21953a;

/* JADX INFO: loaded from: classes2.dex */
public final class mx5 {

    /* JADX INFO: renamed from: a */
    public final List<C21953a> f139197a;

    /* JADX INFO: renamed from: b */
    public int f139198b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f139199c;

    /* JADX INFO: renamed from: d */
    public boolean f139200d;

    public mx5(List<C21953a> list) {
        this.f139197a = list;
    }

    /* JADX INFO: renamed from: a */
    public C21953a m160641a(SSLSocket sSLSocket) throws IOException {
        C21953a c21953a;
        int i = this.f139198b;
        int size = this.f139197a.size();
        while (true) {
            if (i >= size) {
                c21953a = null;
                break;
            }
            c21953a = this.f139197a.get(i);
            if (c21953a.m222299c(sSLSocket)) {
                this.f139198b = i + 1;
                break;
            }
            i++;
        }
        if (c21953a != null) {
            this.f139199c = m160643c(sSLSocket);
            kzm.f129436a.mo152194c(c21953a, sSLSocket, this.f139200d);
            return c21953a;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f139200d);
        sb.append(", modes=");
        sb.append(this.f139197a);
        String string = Arrays.toString(sSLSocket.getEnabledProtocols());
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    /* JADX INFO: renamed from: b */
    public boolean m160642b(IOException iOException) {
        this.f139200d = true;
        if (!this.f139199c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        return iOException instanceof SSLException;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m160643c(SSLSocket sSLSocket) {
        for (int i = this.f139198b; i < this.f139197a.size(); i++) {
            if (this.f139197a.get(i).m222299c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }
}
