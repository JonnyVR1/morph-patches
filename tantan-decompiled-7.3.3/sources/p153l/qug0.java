package p153l;

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
public final class qug0 {

    /* JADX INFO: renamed from: b */
    public final String f159574b;

    /* JADX INFO: renamed from: c */
    public final String f159575c;

    /* JADX INFO: renamed from: d */
    public final long f159576d;

    /* JADX INFO: renamed from: e */
    public final zfg0 f159577e;

    /* JADX INFO: renamed from: h */
    public hsp0 f159580h;

    /* JADX INFO: renamed from: a */
    public final String f159573a = "SudGIP ".concat(qug0.class.getSimpleName());

    /* JADX INFO: renamed from: f */
    public final AtomicBoolean f159578f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g */
    public final Handler f159579g = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: i */
    public final yog0 f159581i = new yog0(this);

    public qug0(String str, String str2, String str3, long j, zfg0 zfg0Var) {
        this.f159574b = str;
        this.f159575c = str3;
        this.f159576d = j;
        this.f159577e = zfg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m178149a() {
        SudLogger.m222811d(this.f159573a, "getGateToken curIsRunning:" + this.f159578f.get());
        LogUtils.file("SudGIPWebSocket", "getGateToken curIsRunning:" + this.f159578f.get());
        if (this.f159578f.get()) {
            ylg0 ylg0Var = new ylg0();
            ylg0Var.f200552a = this.f159574b;
            utg0.f180947b.m198648t(ylg0Var, new flg0(this));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m178150b(long j) {
        SudLogger.m222811d(this.f159573a, "delayGetGateToken curIsRunning:" + this.f159578f.get());
        LogUtils.file("SudGIPWebSocket", "delayGetGateToken curIsRunning:" + this.f159578f.get());
        if (this.f159578f.get()) {
            this.f159579g.removeCallbacks(this.f159581i);
            this.f159579g.postDelayed(this.f159581i, j);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m178151c(byte[] bArr) {
        rog0 rog0Var;
        if (bArr == null || bArr.length == 0) {
            SudLogger.m222811d(this.f159573a, "WebSocket后端发的数组为空");
            LogUtils.file("SudGIPWebSocket", "WebSocket后端发的数组为空");
            return;
        }
        if (bArr.length < 12) {
            SudLogger.m222811d(this.f159573a, "WebSocket后端发的数组长度不对,length:" + bArr.length);
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
        SudLogger.m222811d(this.f159573a, str);
        LogUtils.file("SudGIPWebSocket", str);
        if (sBytesToShort2 == 1001) {
            if (bArr.length <= 12) {
                SudLogger.m222811d(this.f159573a, "WebSocket后端发的数组长度不对,length:" + bArr.length);
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
            zfg0 zfg0Var = this.f159577e;
            if (zfg0Var == null || (rog0Var = zfg0Var.f204134a.f88497B) == null || rog0Var.f164203j == null) {
                return;
            }
            SudLogger.m222811d(rog0Var.f164194a, "onRoomChatMessage:".concat(str2));
            LogUtils.file("AiAgentImpl", "onRoomChatMessage:".concat(str2));
            rog0Var.f164203j.onRoomChatMessage(str2);
        }
    }
}
