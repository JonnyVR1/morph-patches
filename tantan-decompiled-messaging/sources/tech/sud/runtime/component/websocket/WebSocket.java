package tech.sud.runtime.component.websocket;

import java.nio.ByteBuffer;
import p149l.yqg0;
import tech.sud.p134a.p135a.Sudif;
import tech.sud.runtime.component.p145h.C22435f;

/* JADX INFO: loaded from: classes3.dex */
public class WebSocket {

    /* JADX INFO: renamed from: a */
    public final String f207836a = "SudNative WebSocket";

    /* JADX INFO: renamed from: b */
    private C22440a f207837b;

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
        C22435f.m221858c("SudNative WebSocket", "close");
        this.f207837b.m221545g();
    }

    public void destroy() {
        this.f207837b.m221911j();
    }

    public void open(String str, long j) {
        C22435f.m221858c("SudNative WebSocket", "open uri:" + str + " cPtr:" + j);
        try {
            C22440a c22440a = new C22440a(str, j);
            this.f207837b = c22440a;
            c22440a.m221544f();
        } catch (Exception e) {
            e.printStackTrace();
            C22435f.m221857b("WebSocket", "cPtr:" + j + " open fail:", e);
        }
    }

    public void send(String str) {
        this.f207837b.m221537a(str);
    }

    public void send(byte[] bArr) {
        this.f207837b.m221540a(bArr);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.websocket.WebSocket$a */
    public static class C22440a extends Sudif {

        /* JADX INFO: renamed from: c */
        private long f207838c;

        public C22440a(String str, long j) {
            super(new C22441a(str));
            this.f207838c = j;
        }

        @Override // tech.sud.p134a.p135a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo221536a(Exception exc) {
            synchronized (this) {
                try {
                    if (exc != null) {
                        C22435f.m221860e("SudNative WebSocketClient", "J: WS: error (exception: " + exc.getMessage() + ")");
                        long j = this.f207838c;
                        if (j != 0) {
                            WebSocket.onerror(j, exc.getMessage());
                        }
                    } else {
                        C22435f.m221860e("SudNative WebSocketClient", "J: WS: error (unknown reason)");
                        long j2 = this.f207838c;
                        if (j2 != 0) {
                            WebSocket.onerror(j2, "");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p134a.p135a.Sudif
        /* JADX INFO: renamed from: b */
        public void mo221542b(int i, String str, boolean z) {
            synchronized (this) {
                try {
                    long j = this.f207838c;
                    if (j != 0) {
                        WebSocket.onclose(j, i, str);
                    }
                    C22435f.m221856b("SudNative WebSocketClient", "J: WS: closed (code:" + i + "reason: " + str + ")");
                    this.f207838c = 0L;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p134a.p135a.Sudif
        /* JADX INFO: renamed from: c */
        public void mo221543c(String str) {
            synchronized (this) {
                try {
                    long j = this.f207838c;
                    if (j != 0) {
                        WebSocket.ontextmessage(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m221911j() {
            C22435f.m221858c("SudNative WebSocketClient", "destroy:" + this.f207838c);
            synchronized (this) {
                this.f207838c = 0L;
            }
            m221545g();
        }

        @Override // tech.sud.p134a.p135a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo221538a(ByteBuffer byteBuffer) {
            synchronized (this) {
                try {
                    long j = this.f207838c;
                    if (j != 0) {
                        WebSocket.onbinarymessage(j, byteBuffer.array());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p134a.p135a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo221539a(yqg0 yqg0Var) {
            C22435f.m221858c("SudNative WebSocketClient", "onOpen");
            synchronized (this) {
                try {
                    long j = this.f207838c;
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
