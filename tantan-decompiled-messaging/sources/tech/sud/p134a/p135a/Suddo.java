package tech.sud.p134a.p135a;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class Suddo implements Runnable {

    /* JADX INFO: renamed from: Suddo, reason: collision with root package name */
    public final /* synthetic */ Sudif f210119Suddo;

    public Suddo(Sudif sudif) {
        this.f210119Suddo = sudif;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
        while (!Thread.interrupted()) {
            try {
                try {
                    try {
                        ByteBuffer byteBuffer = (ByteBuffer) this.f210119Suddo.f207510c.f124001a.take();
                        this.f210119Suddo.f207512e.write(byteBuffer.array(), 0, byteBuffer.limit());
                        this.f210119Suddo.f207512e.flush();
                    } catch (InterruptedException unused) {
                        for (ByteBuffer byteBuffer2 : this.f210119Suddo.f207510c.f124001a) {
                            this.f210119Suddo.f207512e.write(byteBuffer2.array(), 0, byteBuffer2.limit());
                            this.f210119Suddo.f207512e.flush();
                        }
                    }
                } catch (IOException e) {
                    Sudif.m221531a(this.f210119Suddo, e);
                    Sudif.m221533c(this.f210119Suddo);
                    this.f210119Suddo.f207514g = null;
                    return;
                }
            } catch (Throwable th) {
                Sudif.m221533c(this.f210119Suddo);
                this.f210119Suddo.f207514g = null;
                throw th;
            }
        }
        Sudif.m221533c(this.f210119Suddo);
        this.f210119Suddo.f207514g = null;
    }
}
