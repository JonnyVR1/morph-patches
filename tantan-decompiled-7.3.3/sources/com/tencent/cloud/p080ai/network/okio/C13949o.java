package com.tencent.cloud.p080ai.network.okio;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: renamed from: com.tencent.cloud.ai.network.okio.o */
/* JADX INFO: loaded from: classes12.dex */
public class C13949o extends C13937c {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Socket f57844k;

    public C13949o(Socket socket) {
        this.f57844k = socket;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13937c
    /* JADX INFO: renamed from: a */
    public IOException mo82951a(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.tencent.cloud.p080ai.network.okio.C13937c
    /* JADX INFO: renamed from: j */
    public void mo82868j() {
        try {
            this.f57844k.close();
        } catch (AssertionError e) {
            if (!C13948n.m83148a(e)) {
                throw e;
            }
            C13948n.f57841a.log(Level.WARNING, "Failed to close timed out socket " + this.f57844k, (Throwable) e);
        } catch (Exception e2) {
            C13948n.f57841a.log(Level.WARNING, "Failed to close timed out socket " + this.f57844k, (Throwable) e2);
        }
    }
}
