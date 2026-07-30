package p149l;

import android.os.Handler;
import android.os.Looper;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import tech.sud.base.utils.BytesUtils;
import tech.sud.base.utils.CrcChecker;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class img0 {

    /* JADX INFO: renamed from: b */
    public final String f113928b;

    /* JADX INFO: renamed from: c */
    public final String f113929c;

    /* JADX INFO: renamed from: d */
    public final long f113930d;

    /* JADX INFO: renamed from: e */
    public final r7g0 f113931e;

    /* JADX INFO: renamed from: h */
    public cjp0 f113934h;

    /* JADX INFO: renamed from: a */
    public final String f113927a = "SudGIP ".concat(img0.class.getSimpleName());

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f113932f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final Handler f113933g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public final qgg0 f113935i = new qgg0(this);

    public img0(String str, String str2, String str3, long j, r7g0 r7g0Var) {
        this.f113928b = str;
        this.f113929c = str3;
        this.f113930d = j;
        this.f113931e = r7g0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m137076a() {
        SudLogger.m221565d(this.f113927a, "getGateToken curIsRunning:" + this.f113932f.get());
        LogUtils.file("SudGIPWebSocket", "getGateToken curIsRunning:" + this.f113932f.get());
        if (this.f113932f.get()) {
            qdg0 qdg0Var = new qdg0();
            qdg0Var.f153930a = this.f113928b;
            mlg0.f134427b.m155915t(qdg0Var, new xcg0(this));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m137077b(long j) {
        SudLogger.m221565d(this.f113927a, "delayGetGateToken curIsRunning:" + this.f113932f.get());
        LogUtils.file("SudGIPWebSocket", "delayGetGateToken curIsRunning:" + this.f113932f.get());
        if (this.f113932f.get()) {
            this.f113933g.removeCallbacks(this.f113935i);
            this.f113933g.postDelayed(this.f113935i, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m137078c(byte[] bArr) {
        jgg0 jgg0Var;
        if (bArr == null || bArr.length == 0) {
            SudLogger.m221565d(this.f113927a, "WebSocket后端发的数组为空");
            LogUtils.file("SudGIPWebSocket", "WebSocket后端发的数组为空");
            return;
        }
        if (bArr.length < 12) {
            SudLogger.m221565d(this.f113927a, "WebSocket后端发的数组长度不对,length:" + bArr.length);
            LogUtils.file("SudGIPWebSocket", "WebSocket后端发的数组长度不对,length:" + bArr.length);
            return;
        }
        byte[] bArr2 = new byte[4];
        System.arraycopy(bArr, 0, bArr2, 0, 4);
        int iBytesToInt = BytesUtils.bytesToInt(bArr2);
        byte[] bArr3 = new byte[2];
        System.arraycopy(bArr, 4, bArr3, 0, 2);
        short sBytesToShort = BytesUtils.bytesToShort(bArr3);
        byte[] bArr4 = new byte[2];
        System.arraycopy(bArr, 6, bArr4, 0, 2);
        short sBytesToShort2 = BytesUtils.bytesToShort(bArr4);
        Locale locale = Locale.US;
        String str = "parseWebSocketMessage magic:" + iBytesToInt + " version:" + ((int) sBytesToShort) + " cmd:" + ((int) sBytesToShort2);
        SudLogger.m221565d(this.f113927a, str);
        LogUtils.file("SudGIPWebSocket", str);
        if (sBytesToShort2 == 1001) {
            if (bArr.length <= 12) {
                SudLogger.m221565d(this.f113927a, "WebSocket后端发的数组长度不对,length:" + bArr.length);
                LogUtils.file("SudGIPWebSocket", "WebSocket后端发的数组长度不对,length:" + bArr.length);
                return;
            }
            byte[] bArr5 = new byte[4];
            System.arraycopy(bArr, 8, bArr5, 0, 4);
            int length = bArr.length - 12;
            byte[] bArr6 = new byte[length];
            System.arraycopy(bArr, 12, bArr6, 0, length);
            CrcChecker.check(bArr5, bArr6);
            String str2 = new String(bArr6, StandardCharsets.UTF_8);
            r7g0 r7g0Var = this.f113931e;
            if (r7g0Var == null || (jgg0Var = r7g0Var.f158027a.f180495B) == null || jgg0Var.f117785j == null) {
                return;
            }
            SudLogger.m221565d(jgg0Var.f117776a, "onRoomChatMessage:".concat(str2));
            LogUtils.file("AiAgentImpl", "onRoomChatMessage:".concat(str2));
            jgg0Var.f117785j.onRoomChatMessage(str2);
        }
    }
}
