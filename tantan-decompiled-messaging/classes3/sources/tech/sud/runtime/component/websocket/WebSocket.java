package tech.sud.runtime.component.websocket;

import Sudthrow.Sudbyte;
import java.nio.ByteBuffer;
import l.yqg0;
import org.eclipse.jetty.http.HttpHeaderValues;
import tech.sud.p015a.p016a.Sudif;
import tech.sud.runtime.component.p026h.C1228f;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class WebSocket {

    /* JADX INFO: renamed from: a */
    public final String f11461a = "SudNative WebSocket";

    /* JADX INFO: renamed from: b */
    private C1233a f11462b;

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
        C1228f.m10329c("SudNative WebSocket", HttpHeaderValues.CLOSE);
        this.f11462b.m10012g();
    }

    public void destroy() {
        this.f11462b.m10382j();
    }

    public void open(String str, long j) {
        C1228f.m10329c("SudNative WebSocket", "open uri:" + str + " cPtr:" + j);
        try {
            C1233a c1233a = new C1233a(str, j);
            this.f11462b = c1233a;
            c1233a.m10011f();
        } catch (Exception e) {
            e.printStackTrace();
            C1228f.m10328b("WebSocket", "cPtr:" + j + " open fail:", e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sudthrow.Sudbyte */
    public void send(String str) throws Sudbyte {
        this.f11462b.m9994a(str);
    }

    public void send(byte[] bArr) {
        this.f11462b.m10005a(bArr);
    }

    /* JADX INFO: renamed from: tech.sud.runtime.component.websocket.WebSocket$a */
    public static class C1233a extends Sudif {

        /* JADX INFO: renamed from: c */
        private long f11463c;

        public C1233a(String str, long j) {
            super(new C1234a(str));
            this.f11463c = j;
        }

        @Override // tech.sud.p015a.p016a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo9993a(Exception exc) {
            synchronized (this) {
                try {
                    if (exc != null) {
                        C1228f.m10331e("SudNative WebSocketClient", "J: WS: error (exception: " + exc.getMessage() + ")");
                        long j = this.f11463c;
                        if (j != 0) {
                            WebSocket.onerror(j, exc.getMessage());
                        }
                    } else {
                        C1228f.m10331e("SudNative WebSocketClient", "J: WS: error (unknown reason)");
                        long j2 = this.f11463c;
                        if (j2 != 0) {
                            WebSocket.onerror(j2, "");
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p015a.p016a.Sudif
        /* JADX INFO: renamed from: b */
        public void mo10007b(int i, String str, boolean z) {
            synchronized (this) {
                try {
                    long j = this.f11463c;
                    if (j != 0) {
                        WebSocket.onclose(j, i, str);
                    }
                    C1228f.m10327b("SudNative WebSocketClient", "J: WS: closed (code:" + i + "reason: " + str + ")");
                    this.f11463c = 0L;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p015a.p016a.Sudif
        /* JADX INFO: renamed from: c */
        public void mo10010c(String str) {
            synchronized (this) {
                try {
                    long j = this.f11463c;
                    if (j != 0) {
                        WebSocket.ontextmessage(j, str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: j */
        public void m10382j() {
            C1228f.m10329c("SudNative WebSocketClient", "destroy:" + this.f11463c);
            synchronized (this) {
                this.f11463c = 0L;
            }
            m10012g();
        }

        @Override // tech.sud.p015a.p016a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo9995a(ByteBuffer byteBuffer) {
            synchronized (this) {
                try {
                    long j = this.f11463c;
                    if (j != 0) {
                        WebSocket.onbinarymessage(j, byteBuffer.array());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // tech.sud.p015a.p016a.Sudif
        /* JADX INFO: renamed from: a */
        public void mo9997a(yqg0 yqg0Var) {
            C1228f.m10329c("SudNative WebSocketClient", "onOpen");
            synchronized (this) {
                try {
                    long j = this.f11463c;
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
