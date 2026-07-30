package p153l;

import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import org.eclipse.jetty.http.HttpVersions;

/* JADX INFO: loaded from: classes2.dex */
public final class r4g0 {

    /* JADX INFO: renamed from: a */
    public final Protocol f161201a;

    /* JADX INFO: renamed from: b */
    public final int f161202b;

    /* JADX INFO: renamed from: c */
    public final String f161203c;

    public r4g0(Protocol protocol, int i, String str) {
        this.f161201a = protocol;
        this.f161202b = i;
        this.f161203c = str;
    }

    /* JADX INFO: renamed from: a */
    public static r4g0 m179760a(String str) throws IOException {
        Protocol protocol;
        int i;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                protocol = Protocol.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            protocol = Protocol.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int i3 = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                strSubstring = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i + 4);
            }
            return new r4g0(protocol, i3, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f161201a == Protocol.HTTP_1_0 ? HttpVersions.HTTP_1_0 : HttpVersions.HTTP_1_1);
        sb.append(' ');
        sb.append(this.f161202b);
        if (this.f161203c != null) {
            sb.append(' ');
            sb.append(this.f161203c);
        }
        return sb.toString();
    }
}
