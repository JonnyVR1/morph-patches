package p153l;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface o6e {

    /* JADX INFO: renamed from: a */
    public static final o6e f145159a = new o6e() { // from class: l.m6e
        @Override // p153l.o6e
        public final List lookup(String str) {
            return o6e.m166225a(str);
        }
    };

    /* JADX INFO: renamed from: a */
    static /* synthetic */ List m166225a(String str) throws UnknownHostException {
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
