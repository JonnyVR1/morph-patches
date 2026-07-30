package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.base.utils.BytesUtils;
import tech.sud.gip.asr.base.Sudif;
import tech.sud.gip.asr.base.Sudint;
import tech.sud.gip.asr.base.Sudnew;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class uwg0 {

    /* JADX INFO: renamed from: b */
    public boolean f181266b;

    /* JADX INFO: renamed from: c */
    public hsp0 f181267c;

    /* JADX INFO: renamed from: d */
    public oug0 f181268d;

    /* JADX INFO: renamed from: e */
    public String f181269e;

    /* JADX INFO: renamed from: f */
    public pkg0 f181270f;

    /* JADX INFO: renamed from: g */
    public final Sudnew f181271g;

    /* JADX INFO: renamed from: h */
    public Sudint f181272h;

    /* JADX INFO: renamed from: i */
    public long f181273i;

    /* JADX INFO: renamed from: j */
    public String f181274j;

    /* JADX INFO: renamed from: k */
    public String f181275k;

    /* JADX INFO: renamed from: l */
    public long f181276l;

    /* JADX INFO: renamed from: a */
    public final String f181265a = "SudGIP ".concat(uwg0.class.getSimpleName());

    /* JADX INFO: renamed from: m */
    public final LinkedBlockingQueue f181277m = new LinkedBlockingQueue();

    public uwg0(Sudif sudif) {
        this.f181271g = sudif;
    }

    /* JADX INFO: renamed from: a */
    public static skg0 m198349a(byte[] bArr) {
        if (bArr.length == 0) {
            return new skg0();
        }
        skg0 skg0Var = new skg0();
        int i = bArr[0] & 15;
        byte b = bArr[1];
        int i2 = (b >> 4) & 15;
        byte b2 = bArr[2];
        int i3 = (b2 >> 4) & 15;
        int i4 = b2 & 15;
        byte b3 = bArr[3];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i * 4, bArr.length);
        if ((b & 1) != 0) {
            skg0Var.f169280d = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        }
        if ((b & 2) != 0) {
            skg0Var.f169279c = true;
        }
        if ((b & 4) != 0) {
            skg0Var.f169278b = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        }
        if (i2 == 9) {
            skg0Var.f169281e = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        } else if (i2 == 15) {
            skg0Var.f169277a = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            skg0Var.f169281e = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 4, 8));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 8, bArrCopyOfRange.length);
        }
        if (bArrCopyOfRange.length != 0) {
            if (i4 == 1) {
                if (bArrCopyOfRange.length == 0) {
                    bArrCopyOfRange = null;
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArrCopyOfRange));
                        try {
                            byte[] bArr2 = new byte[256];
                            while (true) {
                                int i5 = gZIPInputStream.read(bArr2);
                                if (i5 <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i5);
                                e.printStackTrace();
                                bArrCopyOfRange = null;
                            }
                            gZIPInputStream.close();
                            bArrCopyOfRange = byteArrayOutputStream.toByteArray();
                        } catch (Throwable th) {
                            try {
                                gZIPInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (i3 == 1 && bArrCopyOfRange != null) {
                skg0Var.f169282f = new String(bArrCopyOfRange);
            }
        }
        return skg0Var;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m198350h(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m198351i(byte[] bArr, int i) {
        if (i == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr, 0, i);
                gZIPOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new byte[0];
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m198353c(cgg0 cgg0Var, nzg0 nzg0Var) {
        if (this.f181266b) {
            return;
        }
        SudLogger.m222811d(this.f181265a, "startRecognize");
        LogUtils.file("DoubaoAsrAsyncClient", "startRecognize");
        this.f181266b = true;
        if (this.f181276l == 0) {
            this.f181276l = System.currentTimeMillis();
        }
        this.f181273i = cgg0Var.f81673i;
        this.f181274j = cgg0Var.f81674j;
        this.f181275k = cgg0Var.f81669e;
        this.f181270f = cgg0Var.f81670f;
        String str = cgg0Var.f81665a;
        try {
            x1d0 x1d0VarM209028b = new x1d0.C21228a().m209043q(str).m209034h("X-Api-App-Key", cgg0Var.f81666b).m209034h("X-Api-Access-Key", cgg0Var.f81667c).m209034h("X-Api-Resource-Id", cgg0Var.f81668d).m209034h("X-Api-Connect-Id", UUID.randomUUID().toString()).m209028b();
            zug0 zug0Var = new zug0();
            zug0Var.f206126c = 3;
            zug0Var.f206125b.f82998a = "DoubaoHttpLoggingInterceptor";
            rg50.C19837b c19837b = new rg50.C19837b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            rg50 rg50VarM181365c = c19837b.m181379q(50L, timeUnit).m181363a(zug0Var).m181383u(100L, timeUnit).m181387y(100L, timeUnit).m181365c();
            oug0 oug0Var = new oug0(this, cgg0Var, nzg0Var);
            this.f181268d = oug0Var;
            this.f181267c = rg50VarM181365c.m181360x(x1d0VarM209028b, oug0Var);
        } catch (Exception e) {
            LogUtils.file("DoubaoAsrAsyncClient", "发生了异常：" + LogUtils.getErrorInfo(e));
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m198354d(skg0 skg0Var, nzg0 nzg0Var) {
        LogUtils.file("DoubaoAsrAsyncClient", "后端返回数据fail code:" + skg0Var.f169277a + " msg:" + skg0Var.f169282f);
        nzg0Var.mo122355c(new RuntimeException("doubao error code:" + skg0Var.f169277a + "  msg:" + skg0Var.f169282f));
        m198352b();
    }

    /* JADX INFO: renamed from: e */
    public final void m198355e(final nzg0 nzg0Var) {
        while (true) {
            if (!this.f181266b && this.f181277m.isEmpty()) {
                return;
            }
            try {
                byte[] bArr = (byte[]) this.f181277m.poll(100L, TimeUnit.MILLISECONDS);
                if (bArr != null) {
                    final skg0 skg0VarM198349a = m198349a(bArr);
                    if (skg0VarM198349a.f169277a != 0) {
                        ThreadUtils.postUITask(new Runnable() { // from class: l.xvg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f196397a.m198354d(skg0VarM198349a, nzg0Var);
                            }
                        });
                        return;
                    }
                    if (skg0VarM198349a.f169282f != null) {
                        SudLogger.m222811d(this.f181265a, "payloadMsg:" + skg0VarM198349a.f169282f);
                        LogUtils.file("DoubaoAsrAsyncClient", "payloadMsg:" + skg0VarM198349a.f169282f);
                        m198356f(nzg0Var, skg0VarM198349a.f169282f);
                    }
                    if (skg0VarM198349a.f169279c) {
                        SudLogger.m222811d(this.f181265a, "服务器返回了最后一个包，关闭asr识别");
                        LogUtils.file("DoubaoAsrAsyncClient", "服务器返回了最后一个包，关闭asr识别");
                        ThreadUtils.postUITask(new Runnable() { // from class: l.zvg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f206217a.m198352b();
                            }
                        });
                        return;
                    }
                } else {
                    continue;
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e) {
                LogUtils.file("DoubaoAsrAsyncClient", "处理响应时发生了异常：" + LogUtils.getErrorInfo(e));
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m198356f(final nzg0 nzg0Var, String str) {
        final String str2;
        Exception exc;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject(LovePlanetStage.result);
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            final String strOptString = jSONObjectOptJSONObject.optString("text");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("utterances");
            boolean zOptBoolean = false;
            if (jSONArrayOptJSONArray != null) {
                try {
                    if (jSONArrayOptJSONArray.length() > 0) {
                        zOptBoolean = jSONArrayOptJSONArray.getJSONObject(0).optBoolean("definite");
                    }
                } catch (Exception e) {
                    exc = e;
                    str2 = str;
                }
            }
            final boolean z = zOptBoolean;
            if ((TextUtils.isEmpty(strOptString) || strOptString.equals(this.f181269e)) && !z) {
                return;
            }
            this.f181269e = strOptString;
            str2 = str;
            try {
                ThreadUtils.postUITask(new Runnable() { // from class: l.awg0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f73729a.m198357g(z, strOptString, str2, nzg0Var);
                    }
                });
                return;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            str2 = str;
        }
        exc = e;
        LogUtils.file("DoubaoAsrAsyncClient", "parserResponse json:" + str2 + " error:" + LogUtils.getErrorInfo(exc));
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m198357g(boolean z, String str, String str2, nzg0 nzg0Var) {
        LogUtils.file("DoubaoAsrAsyncClient", "===>onText definite:" + z + " text:" + str + " payloadStr:" + str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        nzg0Var.mo122356d(z, str, str2, this.f181276l, jCurrentTimeMillis);
        this.f181276l = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m198359k() {
        Sudint sudint = this.f181272h;
        if (sudint == null) {
            return;
        }
        synchronized (sudint) {
            if (sudint.Sudcase) {
                sudint.Sudcase = false;
                sudint.Sudgoto.removeCallbacks(sudint.Sudelse);
                sudint.Suddo();
            }
        }
        this.f181272h = null;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m198352b() {
        if (this.f181266b) {
            SudLogger.m222811d(this.f181265a, "stopRecognize");
            LogUtils.file("DoubaoAsrAsyncClient", "stopRecognize");
            ThreadUtils.postUITask(new Runnable() { // from class: l.vvg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185930a.m198359k();
                }
            });
            this.f181266b = false;
            hsp0 hsp0Var = this.f181267c;
            if (hsp0Var != null) {
                hsp0Var.close(1000, "stopRecognize");
                this.f181267c = null;
            }
            pkg0 pkg0Var = this.f181270f;
            if (pkg0Var != null) {
                ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
                if (byteArrayBlockingQueue != null) {
                    byteArrayBlockingQueue.offer((byte) 0);
                    pkg0Var.f152838a = null;
                }
                this.f181270f = null;
            }
            this.f181269e = null;
            this.f181276l = 0L;
        }
    }
}
