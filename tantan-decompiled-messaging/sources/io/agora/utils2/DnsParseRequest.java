package io.agora.utils2;

import io.agora.base.internal.CalledByNative;
import java.net.InetAddress;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class DnsParseRequest {
    private Thread parseThread = null;

    @CalledByNative
    public DnsParseRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeResolveDoneCallback(long j, boolean z, Object obj, long j2);

    @CalledByNative
    public boolean makeRequest(final long j, final String str) {
        if (str.isEmpty()) {
            return false;
        }
        Thread thread = this.parseThread;
        if (thread != null && thread.isAlive()) {
            return false;
        }
        Thread thread2 = new Thread(new Runnable() { // from class: io.agora.utils2.DnsParseRequest.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(str);
                    ArrayList arrayList = new ArrayList();
                    for (InetAddress inetAddress : allByName) {
                        arrayList.add(inetAddress.getHostAddress());
                    }
                    DnsParseRequest.nativeResolveDoneCallback(j, true, arrayList, arrayList.size());
                } catch (Exception unused) {
                    DnsParseRequest.nativeResolveDoneCallback(j, false, null, 0L);
                }
            }
        });
        this.parseThread = thread2;
        thread2.start();
        return true;
    }
}
