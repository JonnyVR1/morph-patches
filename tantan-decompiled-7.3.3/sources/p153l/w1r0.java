package p153l;

import com.alibaba.fastjson.asm.Opcodes;
import com.xiaomi.push.C14885fi;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes2.dex */
public class w1r0 {
    /* JADX INFO: renamed from: a */
    public static int m204469a(Throwable th) {
        boolean z = th instanceof C14885fi;
        if (z) {
            C14885fi c14885fi = (C14885fi) th;
            if (c14885fi.m86745a() != null) {
                th = c14885fi.m86745a();
            }
        }
        String message = th.getMessage();
        if (th.getCause() != null) {
            message = th.getCause().getMessage();
        }
        if (th instanceof SocketTimeoutException) {
            return 105;
        }
        if (!(th instanceof SocketException)) {
            if (th instanceof UnknownHostException) {
                return 107;
            }
            return z ? 399 : 0;
        }
        if (message.indexOf("Network is unreachable") != -1) {
            return 102;
        }
        if (message.indexOf("Connection refused") != -1) {
            return 103;
        }
        if (message.indexOf("Connection timed out") != -1) {
            return 105;
        }
        if (message.endsWith("EACCES (Permission denied)")) {
            return 101;
        }
        if (message.indexOf("Connection reset by peer") != -1) {
            return 109;
        }
        if (message.indexOf("Broken pipe") != -1) {
            return 110;
        }
        if (message.indexOf("No route to host") != -1) {
            return 104;
        }
        if (message.endsWith("EINVAL (Invalid argument)")) {
            return 106;
        }
        return Opcodes.IFNONNULL;
    }
}
