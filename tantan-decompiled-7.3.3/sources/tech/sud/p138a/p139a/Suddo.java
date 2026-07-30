package tech.sud.p138a.p139a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Suddo implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ Sudif f211040Suddo;

    public Suddo(Sudif sudif) {
        this.f211040Suddo = sudif;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        while (!Thread.interrupted()) {
            try {
                try {
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) this.f211040Suddo.f208432c.f170963a.take();
                        this.f211040Suddo.f208434e.write(byteBuffer.array(), 0, byteBuffer.limit());
                        this.f211040Suddo.f208434e.flush();
                    } catch (InterruptedException unused) {
                        for (ByteBuffer byteBuffer2 : this.f211040Suddo.f208432c.f170963a) {
                            this.f211040Suddo.f208434e.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                            this.f211040Suddo.f208434e.flush();
                        }
                    }
                } catch (IOException e) {
                    Sudif.m222777a(this.f211040Suddo, e);
                    Sudif.m222779c(this.f211040Suddo);
                    this.f211040Suddo.f208436g = null;
                    return;
                }
            } catch (Throwable th) {
                Sudif.m222779c(this.f211040Suddo);
                this.f211040Suddo.f208436g = null;
                throw th;
            }
        }
        Sudif.m222779c(this.f211040Suddo);
        this.f211040Suddo.f208436g = null;
    }
}
