package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
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
public final class mog0 {

    /* JADX INFO: renamed from: b */
    public boolean f134893b;

    /* JADX INFO: renamed from: c */
    public cjp0 f134894c;

    /* JADX INFO: renamed from: d */
    public gmg0 f134895d;

    /* JADX INFO: renamed from: e */
    public String f134896e;

    /* JADX INFO: renamed from: f */
    public hcg0 f134897f;

    /* JADX INFO: renamed from: g */
    public final Sudnew f134898g;

    /* JADX INFO: renamed from: h */
    public Sudint f134899h;

    /* JADX INFO: renamed from: i */
    public long f134900i;

    /* JADX INFO: renamed from: j */
    public String f134901j;

    /* JADX INFO: renamed from: k */
    public String f134902k;

    /* JADX INFO: renamed from: l */
    public long f134903l;

    /* JADX INFO: renamed from: a */
    public final String f134892a = "SudGIP ".concat(mog0.class.getSimpleName());

    /* JADX INFO: renamed from: m */
    public final LinkedBlockingQueue f134904m = new LinkedBlockingQueue();

    public mog0(Sudif sudif) {
        this.f134898g = sudif;
    }

    /* JADX INFO: renamed from: a */
    public static kcg0 m155678a(byte[] bArr) {
        if (bArr.length == 0) {
            return new kcg0();
        }
        kcg0 kcg0Var = new kcg0();
        int i = bArr[0] & 15;
        byte b = bArr[1];
        int i2 = (b >> 4) & 15;
        byte b2 = bArr[2];
        int i3 = (b2 >> 4) & 15;
        int i4 = b2 & 15;
        byte b3 = bArr[3];
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i * 4, bArr.length);
        if ((b & 1) != 0) {
            kcg0Var.f122380d = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        }
        if ((b & 2) != 0) {
            kcg0Var.f122379c = true;
        }
        if ((b & 4) != 0) {
            kcg0Var.f122378b = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        }
        if (i2 == 9) {
            kcg0Var.f122381e = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, 4, bArrCopyOfRange.length);
        } else if (i2 == 15) {
            kcg0Var.f122377a = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 0, 4));
            kcg0Var.f122381e = BytesUtils.bytesToInt(Arrays.copyOfRange(bArrCopyOfRange, 4, 8));
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
                kcg0Var.f122382f = new String(bArrCopyOfRange);
            }
        }
        return kcg0Var;
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m155679h(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m155680i(byte[] bArr, int i) {
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
    public final void m155682c(u7g0 u7g0Var, frg0 frg0Var) {
        if (this.f134893b) {
            return;
        }
        SudLogger.m221565d(this.f134892a, "startRecognize");
        LogUtils.file("DoubaoAsrAsyncClient", "startRecognize");
        this.f134893b = true;
        if (this.f134903l == 0) {
            this.f134903l = System.currentTimeMillis();
        }
        this.f134900i = u7g0Var.f175004i;
        this.f134901j = u7g0Var.f175005j;
        this.f134902k = u7g0Var.f175000e;
        this.f134897f = u7g0Var.f175001f;
        String str = u7g0Var.f174996a;
        try {
            stc0 stc0VarM185883b = new stc0.C20027a().m185898q(str).m185889h("X-Api-App-Key", u7g0Var.f174997b).m185889h("X-Api-Access-Key", u7g0Var.f174998c).m185889h("X-Api-Resource-Id", u7g0Var.f174999d).m185889h("X-Api-Connect-Id", UUID.randomUUID().toString()).m185883b();
            rmg0 rmg0Var = new rmg0();
            rmg0Var.f160096c = 3;
            rmg0Var.f160095b.f176392a = "DoubaoHttpLoggingInterceptor";
            k850.C17954b c17954b = new k850.C17954b();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            k850 k850VarM144882c = c17954b.m144895p(50L, timeUnit).m144880a(rmg0Var).m144899t(100L, timeUnit).m144903x(100L, timeUnit).m144882c();
            gmg0 gmg0Var = new gmg0(this, u7g0Var, frg0Var);
            this.f134895d = gmg0Var;
            this.f134894c = k850VarM144882c.m144868x(stc0VarM185883b, gmg0Var);
        } catch (Exception e) {
            LogUtils.file("DoubaoAsrAsyncClient", "发生了异常：" + LogUtils.getErrorInfo(e));
        }
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m155683d(kcg0 kcg0Var, frg0 frg0Var) {
        LogUtils.file("DoubaoAsrAsyncClient", "后端返回数据fail code:" + kcg0Var.f122377a + " msg:" + kcg0Var.f122382f);
        frg0Var.mo101634c(new RuntimeException("doubao error code:" + kcg0Var.f122377a + "  msg:" + kcg0Var.f122382f));
        m155681b();
    }

    /* JADX INFO: renamed from: e */
    public final void m155684e(final frg0 frg0Var) {
        while (true) {
            if (!this.f134893b && this.f134904m.isEmpty()) {
                return;
            }
            try {
                byte[] bArr = (byte[]) this.f134904m.poll(100L, TimeUnit.MILLISECONDS);
                if (bArr != null) {
                    final kcg0 kcg0VarM155678a = m155678a(bArr);
                    if (kcg0VarM155678a.f122377a != 0) {
                        ThreadUtils.postUITask(new Runnable() { // from class: l.png0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f150391a.m155683d(kcg0VarM155678a, frg0Var);
                            }
                        });
                        return;
                    }
                    if (kcg0VarM155678a.f122382f != null) {
                        SudLogger.m221565d(this.f134892a, "payloadMsg:" + kcg0VarM155678a.f122382f);
                        LogUtils.file("DoubaoAsrAsyncClient", "payloadMsg:" + kcg0VarM155678a.f122382f);
                        m155685f(frg0Var, kcg0VarM155678a.f122382f);
                    }
                    if (kcg0VarM155678a.f122379c) {
                        SudLogger.m221565d(this.f134892a, "服务器返回了最后一个包，关闭asr识别");
                        LogUtils.file("DoubaoAsrAsyncClient", "服务器返回了最后一个包，关闭asr识别");
                        ThreadUtils.postUITask(new Runnable() { // from class: l.rng0
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f160268a.m155681b();
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
    public final void m155685f(final frg0 frg0Var, String str) {
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
            if ((TextUtils.isEmpty(strOptString) || strOptString.equals(this.f134896e)) && !z) {
                return;
            }
            this.f134896e = strOptString;
            str2 = str;
            try {
                ThreadUtils.postUITask(new Runnable() { // from class: l.sng0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f165452a.m155686g(z, strOptString, str2, frg0Var);
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
    public final /* synthetic */ void m155686g(boolean z, String str, String str2, frg0 frg0Var) {
        LogUtils.file("DoubaoAsrAsyncClient", "===>onText definite:" + z + " text:" + str + " payloadStr:" + str2);
        long jCurrentTimeMillis = System.currentTimeMillis();
        frg0Var.mo101635d(z, str, str2, this.f134903l, jCurrentTimeMillis);
        this.f134903l = jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void m155688k() {
        Sudint sudint = this.f134899h;
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
        this.f134899h = null;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void m155681b() {
        if (this.f134893b) {
            SudLogger.m221565d(this.f134892a, "stopRecognize");
            LogUtils.file("DoubaoAsrAsyncClient", "stopRecognize");
            ThreadUtils.postUITask(new Runnable() { // from class: l.nng0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139728a.m155688k();
                }
            });
            this.f134893b = false;
            cjp0 cjp0Var = this.f134894c;
            if (cjp0Var != null) {
                cjp0Var.close(1000, "stopRecognize");
                this.f134894c = null;
            }
            hcg0 hcg0Var = this.f134897f;
            if (hcg0Var != null) {
                ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
                if (byteArrayBlockingQueue != null) {
                    byteArrayBlockingQueue.offer((byte) 0);
                    hcg0Var.f107048a = null;
                }
                this.f134897f = null;
            }
            this.f134896e = null;
            this.f134903l = 0L;
        }
    }
}
