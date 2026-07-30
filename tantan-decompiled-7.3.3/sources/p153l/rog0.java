package p153l;

import com.clevertap.android.sdk.Constants;
import java.nio.ByteBuffer;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudAiAgent;
import tech.sud.gip.core.ISudListenerAiAgent;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class rog0 implements ISudAiAgent {

    /* JADX INFO: renamed from: a */
    public final String f164194a = "SudGIP ".concat(rog0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public long f164195b;

    /* JADX INFO: renamed from: c */
    public String f164196c;

    /* JADX INFO: renamed from: d */
    public String f164197d;

    /* JADX INFO: renamed from: e */
    public String f164198e;

    /* JADX INFO: renamed from: f */
    public boolean f164199f;

    /* JADX INFO: renamed from: g */
    public String f164200g;

    /* JADX INFO: renamed from: h */
    public uwg0 f164201h;

    /* JADX INFO: renamed from: i */
    public pkg0 f164202i;

    /* JADX INFO: renamed from: j */
    public ISudListenerAiAgent f164203j;

    /* JADX INFO: renamed from: k */
    public boolean f164204k;

    /* JADX INFO: renamed from: l */
    public xkg0 f164205l;

    /* JADX INFO: renamed from: m */
    public boolean f164206m;

    /* JADX INFO: renamed from: n */
    public boolean f164207n;

    /* JADX INFO: renamed from: o */
    public hkg0 f164208o;

    /* JADX INFO: renamed from: a */
    public final synchronized void m182410a() {
        try {
            LogUtils.file("AiAgentImpl", "stopASR currentIsRunning:" + this.f164199f);
            SudLogger.m222811d(this.f164194a, "stopASR currentIsRunning:" + this.f164199f);
            if (this.f164199f) {
                this.f164199f = false;
                if (this.f164201h != null) {
                    pkg0 pkg0Var = this.f164202i;
                    if (pkg0Var != null) {
                        ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
                        if (byteArrayBlockingQueue != null) {
                            byteArrayBlockingQueue.offer((byte) 0);
                            pkg0Var.f152838a = null;
                        }
                        this.f164202i = null;
                    }
                    uwg0 uwg0Var = this.f164201h;
                    if (uwg0Var != null) {
                        uwg0Var.m198352b();
                        this.f164201h = null;
                        LogUtils.file("AiAgentImpl", "Continuous recognition stopped.");
                        SudLogger.m222811d(this.f164194a, "Continuous recognition stopped.");
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void pauseAudio() {
        oug0 oug0Var;
        uwg0 uwg0Var = this.f164201h;
        if (uwg0Var != null) {
            SudLogger.m222811d(uwg0Var.f181265a, "pauseRecognize");
            LogUtils.file("DoubaoAsrAsyncClient", "pauseRecognize");
            if (uwg0Var.f181267c == null || (oug0Var = uwg0Var.f181268d) == null) {
                return;
            }
            oug0Var.f149156g = true;
            pkg0 pkg0Var = oug0Var.f149150a.f81670f;
            ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
            if (byteArrayBlockingQueue != null) {
                byteArrayBlockingQueue.offer((byte) 0);
                pkg0Var.f152838a = null;
            }
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        if (this.f164206m) {
            synchronized (this) {
                if (byteBuffer != null && i != 0) {
                    try {
                        if (!this.f164199f && this.f164205l == null) {
                            xkg0 xkg0Var = new xkg0(this);
                            this.f164205l = xkg0Var;
                            if (this.f164204k) {
                                this.f164204k = false;
                                ThreadUtils.postDelayedUITask(xkg0Var, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                            } else {
                                ThreadUtils.postUITask(xkg0Var);
                            }
                        }
                        if (this.f164202i != null) {
                            try {
                                byte[] bArr = new byte[i];
                                byteBuffer.get(bArr, 0, i);
                                pkg0 pkg0Var = this.f164202i;
                                pkg0Var.getClass();
                                if (i != 0) {
                                    pkg0Var.f152838a.offerBuffer(bArr);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void sendText(String str) {
        if (this.f164207n) {
            long j = this.f164195b;
            String str2 = this.f164196c;
            String str3 = this.f164197d;
            String str4 = this.f164198e;
            String str5 = utg0.f180946a;
            dpg0 dpg0Var = new dpg0();
            dpg0Var.f90051a = j;
            dpg0Var.f90052b = str2;
            dpg0Var.f90053c = str3;
            dpg0Var.f90054d = str4;
            dpg0Var.f90055e = str;
            dpg0Var.f90056f = null;
            utg0.f180947b.m198649u(dpg0Var, new cog0());
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void setISudListenerAiAgent(ISudListenerAiAgent iSudListenerAiAgent) {
        this.f164203j = iSudListenerAiAgent;
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void stopAudio() {
        uwg0 uwg0Var = this.f164201h;
        if (uwg0Var != null) {
            uwg0Var.m198352b();
        }
    }
}
