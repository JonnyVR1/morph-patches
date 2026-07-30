package tech.sud.p015a.p016a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Suddo implements Runnable {
    public final /* synthetic */ Sudif Suddo;

    public Suddo(Sudif sudif) {
        this.Suddo = sudif;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        while (!Thread.interrupted()) {
            try {
                try {
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) this.Suddo.f11135c.a.take();
                        this.Suddo.f11137e.write(byteBuffer.array(), 0, byteBuffer.limit());
                        this.Suddo.f11137e.flush();
                    } catch (InterruptedException unused) {
                        for (ByteBuffer byteBuffer2 : this.Suddo.f11135c.a) {
                            this.Suddo.f11137e.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                            this.Suddo.f11137e.flush();
                        }
                    }
                } catch (IOException e) {
                    Sudif.m9988a(this.Suddo, e);
                    Sudif.m9990c(this.Suddo);
                    this.Suddo.f11139g = null;
                    return;
                }
            } catch (Throwable th) {
                Sudif.m9990c(this.Suddo);
                this.Suddo.f11139g = null;
                throw th;
            }
        }
        Sudif.m9990c(this.Suddo);
        this.Suddo.f11139g = null;
    }
}
