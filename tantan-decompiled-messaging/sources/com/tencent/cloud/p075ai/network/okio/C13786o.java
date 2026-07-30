package com.tencent.cloud.p075ai.network.okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.o */
/* JADX INFO: loaded from: classes13.dex */
public class C13786o extends C13774c {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Socket f56996k;

    public C13786o(Socket socket) {
        this.f56996k = socket;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13774c
    /* JADX INFO: renamed from: a */
    public IOException mo81768a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.tencent.cloud.p075ai.network.okio.C13774c
    /* JADX INFO: renamed from: j */
    public void mo81685j() {
        try {
            this.f56996k.close();
        } catch (AssertionError e) {
            if (!C13785n.m81965a(e)) {
                throw e;
            }
            C13785n.f56993a.log(Level.WARNING, "Failed to close timed out socket " + this.f56996k, (Throwable) e);
        } catch (Exception e2) {
            C13785n.f56993a.log(Level.WARNING, "Failed to close timed out socket " + this.f56996k, (Throwable) e2);
        }
    }
}
