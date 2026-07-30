package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.nio.ByteBuffer;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class emg0 extends BaseRealSudASRImpl {

    /* JADX INFO: renamed from: a */
    public final String f92210a;

    /* JADX INFO: renamed from: b */
    public boolean f92211b;

    /* JADX INFO: renamed from: c */
    public mog0 f92212c;

    /* JADX INFO: renamed from: d */
    public hcg0 f92213d;

    /* JADX INFO: renamed from: e */
    public final VolcCfg f92214e;

    /* JADX INFO: renamed from: f */
    public boolean f92215f;

    /* JADX INFO: renamed from: g */
    public pjg0 f92216g;

    /* JADX INFO: renamed from: h */
    public boolean f92217h;

    public emg0(InitASRParamModel initASRParamModel, VolcCfg volcCfg) {
        super(initASRParamModel);
        String strConcat = "SudGIP ".concat(emg0.class.getSimpleName());
        this.f92210a = strConcat;
        this.f92214e = volcCfg;
        LogUtils.file("DoubaoRealSudASRImpl", "db asr init:");
        SudLogger.m221565d(strConcat, "db asr init:");
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl, tech.sud.gip.asr.base.Sudtry
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null || i <= 0) {
            return;
        }
        if (!this.f92211b && this.isIntentRunning) {
            this.f92215f = true;
            if (this.f92216g == null) {
                pjg0 pjg0Var = new pjg0(this);
                this.f92216g = pjg0Var;
                if (this.f92217h) {
                    this.f92217h = false;
                    ThreadUtils.postDelayedUITask(pjg0Var, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                } else {
                    ThreadUtils.postUITask(pjg0Var);
                }
            }
        }
        if (this.f92213d != null) {
            try {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr, 0, i);
                hcg0 hcg0Var = this.f92213d;
                hcg0Var.getClass();
                if (i == 0) {
                    return;
                }
                hcg0Var.f107048a.offerBuffer(bArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl
    public final void startASR(String str) {
        super.startASR(str);
        String str2 = "startASR:" + str + " currentIsRunning:" + this.f92211b + " isHavePcmData:" + this.f92215f;
        LogUtils.file("DoubaoRealSudASRImpl", str2);
        SudLogger.m221565d(this.f92210a, str2);
        if (this.f92211b || !this.f92215f) {
            return;
        }
        this.f92211b = true;
        VolcCfg volcCfg = this.f92214e;
        if (volcCfg == null) {
            SudLogger.m221565d(this.f92210a, "mDoubaoRtssCfg can not be empty");
            LogUtils.file("DoubaoRealSudASRImpl", "mDoubaoRtssCfg can not be empty");
            return;
        }
        if (TextUtils.isEmpty(volcCfg.url) || TextUtils.isEmpty(this.f92214e.app_key) || TextUtils.isEmpty(this.f92214e.access_key)) {
            SudLogger.m221565d(this.f92210a, "url and app_key and access_key can not be empty");
            LogUtils.file("DoubaoRealSudASRImpl", "url and app_key and access_key can not be empty");
            return;
        }
        mog0 mog0Var = this.f92212c;
        if (mog0Var != null) {
            mog0Var.m155681b();
        }
        this.f92212c = new mog0(null);
        z6g0 z6g0Var = new z6g0();
        VolcCfg volcCfg2 = this.f92214e;
        if (volcCfg2 != null) {
            z6g0Var.f201913a = volcCfg2.async_url;
            z6g0Var.f201914b = volcCfg2.app_key;
            z6g0Var.f201915c = volcCfg2.access_key;
            z6g0Var.f201916d = volcCfg2.resource_id;
            z6g0Var.f201920h = volcCfg2.model_name;
            z6g0Var.f201923k = volcCfg2.request_config;
        }
        z6g0Var.f201917e = this._paramModel.userId;
        z6g0Var.f201919g = str;
        hcg0 hcg0Var = this.f92213d;
        if (hcg0Var != null) {
            ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
            if (byteArrayBlockingQueue != null) {
                byteArrayBlockingQueue.offer((byte) 0);
                hcg0Var.f107048a = null;
            }
            this.f92213d = null;
        }
        hcg0 hcg0Var2 = new hcg0();
        this.f92213d = hcg0Var2;
        z6g0Var.f201918f = hcg0Var2;
        InitASRParamModel initASRParamModel = this._paramModel;
        z6g0Var.f201921i = initASRParamModel.mgId;
        z6g0Var.f201922j = initASRParamModel.roomId;
        this.f92212c.m155682c(new u7g0(z6g0Var), new bgg0(this));
        LogUtils.file("DoubaoRealSudASRImpl", "startAudioRecognize success ");
        SudLogger.m221565d(this.f92210a, "startAudioRecognize success ");
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl, tech.sud.gip.asr.base.Sudtry
    public final void stopASR(boolean z) {
        super.stopASR(z);
        this.f92215f = false;
        LogUtils.file("DoubaoRealSudASRImpl", "stopASR currentIsRunning:" + this.f92211b);
        SudLogger.m221565d(this.f92210a, "stopASR currentIsRunning:" + this.f92211b);
        if (this.f92211b) {
            this.f92211b = false;
            if (this.f92212c != null) {
                hcg0 hcg0Var = this.f92213d;
                if (hcg0Var != null) {
                    ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
                    if (byteArrayBlockingQueue != null) {
                        byteArrayBlockingQueue.offer((byte) 0);
                        hcg0Var.f107048a = null;
                    }
                    this.f92213d = null;
                }
                mog0 mog0Var = this.f92212c;
                if (mog0Var != null) {
                    mog0Var.m155681b();
                    this.f92212c = null;
                    LogUtils.file("DoubaoRealSudASRImpl", "Continuous recognition stopped.");
                    SudLogger.m221565d(this.f92210a, "Continuous recognition stopped.");
                }
            }
        }
    }
}
