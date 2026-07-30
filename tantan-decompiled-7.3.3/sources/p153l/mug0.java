package p153l;

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
public final class mug0 extends BaseRealSudASRImpl {

    /* JADX INFO: renamed from: a */
    public final String f138812a;

    /* JADX INFO: renamed from: b */
    public boolean f138813b;

    /* JADX INFO: renamed from: c */
    public uwg0 f138814c;

    /* JADX INFO: renamed from: d */
    public pkg0 f138815d;

    /* JADX INFO: renamed from: e */
    public final VolcCfg f138816e;

    /* JADX INFO: renamed from: f */
    public boolean f138817f;

    /* JADX INFO: renamed from: g */
    public xrg0 f138818g;

    /* JADX INFO: renamed from: h */
    public boolean f138819h;

    public mug0(InitASRParamModel initASRParamModel, VolcCfg volcCfg) {
        super(initASRParamModel);
        String strConcat = "SudGIP ".concat(mug0.class.getSimpleName());
        this.f138812a = strConcat;
        this.f138816e = volcCfg;
        LogUtils.file("DoubaoRealSudASRImpl", "db asr init:");
        SudLogger.m222811d(strConcat, "db asr init:");
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl, tech.sud.gip.asr.base.Sudtry
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        if (byteBuffer == null || i <= 0) {
            return;
        }
        if (!this.f138813b && this.isIntentRunning) {
            this.f138817f = true;
            if (this.f138818g == null) {
                xrg0 xrg0Var = new xrg0(this);
                this.f138818g = xrg0Var;
                if (this.f138819h) {
                    this.f138819h = false;
                    ThreadUtils.postDelayedUITask(xrg0Var, Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
                } else {
                    ThreadUtils.postUITask(xrg0Var);
                }
            }
        }
        if (this.f138815d != null) {
            try {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr, 0, i);
                pkg0 pkg0Var = this.f138815d;
                pkg0Var.getClass();
                if (i == 0) {
                    return;
                }
                pkg0Var.f152838a.offerBuffer(bArr);
            } catch (Exception unused) {
            }
        }
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl
    public final void startASR(String str) {
        super.startASR(str);
        String str2 = "startASR:" + str + " currentIsRunning:" + this.f138813b + " isHavePcmData:" + this.f138817f;
        LogUtils.file("DoubaoRealSudASRImpl", str2);
        SudLogger.m222811d(this.f138812a, str2);
        if (this.f138813b || !this.f138817f) {
            return;
        }
        this.f138813b = true;
        VolcCfg volcCfg = this.f138816e;
        if (volcCfg == null) {
            SudLogger.m222811d(this.f138812a, "mDoubaoRtssCfg can not be empty");
            LogUtils.file("DoubaoRealSudASRImpl", "mDoubaoRtssCfg can not be empty");
            return;
        }
        if (TextUtils.isEmpty(volcCfg.url) || TextUtils.isEmpty(this.f138816e.app_key) || TextUtils.isEmpty(this.f138816e.access_key)) {
            SudLogger.m222811d(this.f138812a, "url and app_key and access_key can not be empty");
            LogUtils.file("DoubaoRealSudASRImpl", "url and app_key and access_key can not be empty");
            return;
        }
        uwg0 uwg0Var = this.f138814c;
        if (uwg0Var != null) {
            uwg0Var.m198352b();
        }
        this.f138814c = new uwg0(null);
        hfg0 hfg0Var = new hfg0();
        VolcCfg volcCfg2 = this.f138816e;
        if (volcCfg2 != null) {
            hfg0Var.f109284a = volcCfg2.async_url;
            hfg0Var.f109285b = volcCfg2.app_key;
            hfg0Var.f109286c = volcCfg2.access_key;
            hfg0Var.f109287d = volcCfg2.resource_id;
            hfg0Var.f109291h = volcCfg2.model_name;
            hfg0Var.f109294k = volcCfg2.request_config;
        }
        hfg0Var.f109288e = this._paramModel.userId;
        hfg0Var.f109290g = str;
        pkg0 pkg0Var = this.f138815d;
        if (pkg0Var != null) {
            ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
            if (byteArrayBlockingQueue != null) {
                byteArrayBlockingQueue.offer((byte) 0);
                pkg0Var.f152838a = null;
            }
            this.f138815d = null;
        }
        pkg0 pkg0Var2 = new pkg0();
        this.f138815d = pkg0Var2;
        hfg0Var.f109289f = pkg0Var2;
        InitASRParamModel initASRParamModel = this._paramModel;
        hfg0Var.f109292i = initASRParamModel.mgId;
        hfg0Var.f109293j = initASRParamModel.roomId;
        this.f138814c.m198353c(new cgg0(hfg0Var), new jog0(this));
        LogUtils.file("DoubaoRealSudASRImpl", "startAudioRecognize success ");
        SudLogger.m222811d(this.f138812a, "startAudioRecognize success ");
    }

    @Override // tech.sud.gip.asr.base.BaseRealSudASRImpl, tech.sud.gip.asr.base.Sudtry
    public final void stopASR(boolean z) {
        super.stopASR(z);
        this.f138817f = false;
        LogUtils.file("DoubaoRealSudASRImpl", "stopASR currentIsRunning:" + this.f138813b);
        SudLogger.m222811d(this.f138812a, "stopASR currentIsRunning:" + this.f138813b);
        if (this.f138813b) {
            this.f138813b = false;
            if (this.f138814c != null) {
                pkg0 pkg0Var = this.f138815d;
                if (pkg0Var != null) {
                    ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
                    if (byteArrayBlockingQueue != null) {
                        byteArrayBlockingQueue.offer((byte) 0);
                        pkg0Var.f152838a = null;
                    }
                    this.f138815d = null;
                }
                uwg0 uwg0Var = this.f138814c;
                if (uwg0Var != null) {
                    uwg0Var.m198352b();
                    this.f138814c = null;
                    LogUtils.file("DoubaoRealSudASRImpl", "Continuous recognition stopped.");
                    SudLogger.m222811d(this.f138812a, "Continuous recognition stopped.");
                }
            }
        }
    }
}
