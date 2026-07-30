package p149l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface a5e {

    /* JADX INFO: renamed from: a */
    public static final a5e f67705a = new a5e() { // from class: l.y4e
        @Override // p149l.a5e
        public final List lookup(String str) {
            return a5e.m95020a(str);
        }
    };

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m95020a(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("hostname == null");
        }
        try {
            return Arrays.asList(InetAddress.getAllByName(str));
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }

    List<InetAddress> lookup(String str) throws UnknownHostException;
}
