package p149l;

import com.clevertap.android.sdk.Constants;
import java.nio.ByteBuffer;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudAiAgent;
import tech.sud.gip.core.ISudListenerAiAgent;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jgg0 implements ISudAiAgent {

    /* JADX INFO: renamed from: a */
    public final String f117776a = "SudGIP ".concat(jgg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public long f117777b;

    /* JADX INFO: renamed from: c */
    public String f117778c;

    /* JADX INFO: renamed from: d */
    public String f117779d;

    /* JADX INFO: renamed from: e */
    public String f117780e;

    /* JADX INFO: renamed from: f */
    public boolean f117781f;

    /* JADX INFO: renamed from: g */
    public String f117782g;

    /* JADX INFO: renamed from: h */
    public mog0 f117783h;

    /* JADX INFO: renamed from: i */
    public hcg0 f117784i;

    /* JADX INFO: renamed from: j */
    public ISudListenerAiAgent f117785j;

    /* JADX INFO: renamed from: k */
    public boolean f117786k;

    /* JADX INFO: renamed from: l */
    public pcg0 f117787l;

    /* JADX INFO: renamed from: m */
    public boolean f117788m;

    /* JADX INFO: renamed from: n */
    public boolean f117789n;

    /* JADX INFO: renamed from: o */
    public zbg0 f117790o;

    /* JADX INFO: renamed from: a */
    public final synchronized void m141290a() {
        try {
            LogUtils.file("AiAgentImpl", "stopASR currentIsRunning:" + this.f117781f);
            SudLogger.m221565d(this.f117776a, "stopASR currentIsRunning:" + this.f117781f);
            if (this.f117781f) {
                this.f117781f = false;
                if (this.f117783h != null) {
                    hcg0 hcg0Var = this.f117784i;
                    if (hcg0Var != null) {
                        ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
                        if (byteArrayBlockingQueue != null) {
                            byteArrayBlockingQueue.offer((byte) 0);
                            hcg0Var.f107048a = null;
                        }
                        this.f117784i = null;
                    }
                    mog0 mog0Var = this.f117783h;
                    if (mog0Var != null) {
                        mog0Var.m155681b();
                        this.f117783h = null;
                        LogUtils.file("AiAgentImpl", "Continuous recognition stopped.");
                        SudLogger.m221565d(this.f117776a, "Continuous recognition stopped.");
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void pauseAudio() {
        gmg0 gmg0Var;
        mog0 mog0Var = this.f117783h;
        if (mog0Var != null) {
            SudLogger.m221565d(mog0Var.f134892a, "pauseRecognize");
            LogUtils.file("DoubaoAsrAsyncClient", "pauseRecognize");
            if (mog0Var.f134894c == null || (gmg0Var = mog0Var.f134895d) == null) {
                return;
            }
            gmg0Var.f103471g = true;
            hcg0 hcg0Var = gmg0Var.f103465a.f175001f;
            ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
            if (byteArrayBlockingQueue != null) {
                byteArrayBlockingQueue.offer((byte) 0);
                hcg0Var.f107048a = null;
            }
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        if (this.f117788m) {
            synchronized (this) {
                if (byteBuffer != null && i != 0) {
                    try {
                        if (!this.f117781f && this.f117787l == null) {
                            pcg0 pcg0Var = new pcg0(this);
                            this.f117787l = pcg0Var;
                            if (this.f117786k) {
                                this.f117786k = false;
                                ThreadUtils.postDelayedUITask(pcg0Var, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                            } else {
                                ThreadUtils.postUITask(pcg0Var);
                            }
                        }
                        if (this.f117784i != null) {
                            try {
                                byte[] bArr = new byte[i];
                                byteBuffer.get(bArr, 0, i);
                                hcg0 hcg0Var = this.f117784i;
                                hcg0Var.getClass();
                                if (i != 0) {
                                    hcg0Var.f107048a.offerBuffer(bArr);
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
        if (this.f117789n) {
            long j = this.f117777b;
            String str2 = this.f117778c;
            String str3 = this.f117779d;
            String str4 = this.f117780e;
            String str5 = mlg0.f134426a;
            vgg0 vgg0Var = new vgg0();
            vgg0Var.f181366a = j;
            vgg0Var.f181367b = str2;
            vgg0Var.f181368c = str3;
            vgg0Var.f181369d = str4;
            vgg0Var.f181370e = str;
            vgg0Var.f181371f = null;
            mlg0.f134427b.m155916u(vgg0Var, new ufg0());
        }
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void setISudListenerAiAgent(ISudListenerAiAgent iSudListenerAiAgent) {
        this.f117785j = iSudListenerAiAgent;
    }

    @Override // tech.sud.gip.core.ISudAiAgent
    public final void stopAudio() {
        mog0 mog0Var = this.f117783h;
        if (mog0Var != null) {
            mog0Var.m155681b();
        }
    }
}
