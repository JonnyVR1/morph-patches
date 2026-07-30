package tech.sud.runtime.component.websocket;

import java.nio.ByteBuffer;
import p153l.gzg0;
import tech.sud.p138a.p139a.Sudif;
import tech.sud.runtime.component.p149h.C22550f;

/* JADX INFO: loaded from: classes3.dex */
public class WebSocket {

    /* JADX INFO: renamed from: a */
    public final String f208758a = "SudNative WebSocket";

    /* JADX INFO: renamed from: b */
    private C22555a f208759b;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onbinarymessage(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onclose(long j, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onerror(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void onopen(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void ontextmessage(long j, String str);

    public void close() {
        C22550f.m223104c("SudNative WebSocket", "close");
        this.f208759b.m222791g();
    }

    public void destroy() {
        this.f208759b.m223157j();
    }

    public void open(String str, long j) {
        C22550f.m223104c("SudNative WebSocket", "open uri:" + str + " cPtr:" + j);
        try {
            C22555a c22555a = new C22555a(str, j);
            this.f208759b = c22555a;
            c22555a.m222790f();
        } catch (Exception e) {
            e.printStackTrace();
            C22550f.m223103b("WebSocket", "cPtr:" + j + " open fail:", e);
        }
    }

    public void send(String str) {
        this.f208759b.m222783a(str);
    }

    public void send(byte[] bArr) {
        this.f208759b.m222786a(bArr);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.websocket.WebSocket$a */
    public static class C22555a extends Sudif {

        /* JADX INFO: renamed from: c */
        private long f208760c;

        public C22555a(String str, long j) {
            super(new C22556a(str));
            this.f208760c = j;
        }

        @Override // tech.sud.p138a.p139a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo222782a(Exception exc) {
            synchronized (this) {
                try {
                    if (exc != null) {
                        C22550f.m223106e("SudNative WebSocketClient", "J: WS: error (exception: " + exc.getMessage() + ")");
                        long j = this.f208760c;
                        if (j != 0) {
                            WebSocket.onerror(j, exc.getMessage());
                        }
                    } else {
                        C22550f.m223106e("SudNative WebSocketClient", "J: WS: error (unknown reason)");
                        long j2 = this.f208760c;
                        if (j2 != 0) {
                            WebSocket.onerror(j2, "");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p138a.p139a.Sudif
        /* JADX INFO: renamed from: b */
        public void mo222788b(int i, String str, boolean z) {
            synchronized (this) {
                try {
                    long j = this.f208760c;
                    if (j != 0) {
                        WebSocket.onclose(j, i, str);
                    }
                    C22550f.m223102b("SudNative WebSocketClient", "J: WS: closed (code:" + i + "reason: " + str + ")");
                    this.f208760c = 0L;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p138a.p139a.Sudif
        /* JADX INFO: renamed from: c */
        public void mo222789c(String str) {
            synchronized (this) {
                try {
                    long j = this.f208760c;
                    if (j != 0) {
                        WebSocket.ontextmessage(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m223157j() {
            C22550f.m223104c("SudNative WebSocketClient", "destroy:" + this.f208760c);
            synchronized (this) {
                this.f208760c = 0L;
            }
            m222791g();
        }

        @Override // tech.sud.p138a.p139a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo222784a(ByteBuffer byteBuffer) {
            synchronized (this) {
                try {
                    long j = this.f208760c;
                    if (j != 0) {
                        WebSocket.onbinarymessage(j, byteBuffer.array());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p138a.p139a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo222785a(gzg0 gzg0Var) {
            C22550f.m223104c("SudNative WebSocketClient", "onOpen");
            synchronized (this) {
                try {
                    long j = this.f208760c;
                    if (j != 0) {
                        WebSocket.onopen(j);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
