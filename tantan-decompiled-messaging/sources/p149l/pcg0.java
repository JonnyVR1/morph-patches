package p149l;

import tech.sud.gip.asr.base.Sudif;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class pcg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jgg0 f148172a;

    public pcg0(jgg0 jgg0Var) {
        this.f148172a = jgg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ymg0 ymg0Var;
        bpg0 bpg0Var;
        jgg0 jgg0Var = this.f148172a;
        String str = jgg0Var.f117782g;
        synchronized (jgg0Var) {
            try {
                String str2 = "startASR:" + str + " currentIsRunning:" + jgg0Var.f117781f;
                LogUtils.file("AiAgentImpl", str2);
                SudLogger.m221565d(jgg0Var.f117776a, str2);
                if (!jgg0Var.f117781f) {
                    jgg0Var.f117781f = true;
                    asg0 asg0Var = mlg0.f134430e;
                    VolcCfg volcCfg = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (bpg0Var = ymg0Var.f199012n) == null) ? null : bpg0Var.f76625a;
                    if (volcCfg == null) {
                        LogUtils.file("AiAgentImpl", "无法开启asr识别，因为后台没有给volcCfg配置");
                    } else if (volcCfg.canRecognitionLanguage(str)) {
                        mog0 mog0Var = jgg0Var.f117783h;
                        if (mog0Var != null) {
                            mog0Var.m155681b();
                        }
                        jgg0Var.f117783h = new mog0(new Sudif(mlg0.f134432g));
                        z6g0 z6g0Var = new z6g0();
                        z6g0Var.f201913a = volcCfg.async_url;
                        z6g0Var.f201914b = volcCfg.app_key;
                        z6g0Var.f201915c = volcCfg.access_key;
                        z6g0Var.f201916d = volcCfg.resource_id;
                        z6g0Var.f201920h = volcCfg.model_name;
                        z6g0Var.f201923k = volcCfg.request_config;
                        z6g0Var.f201917e = jgg0Var.f117779d;
                        hcg0 hcg0Var = jgg0Var.f117784i;
                        if (hcg0Var != null) {
                            ByteArrayBlockingQueue byteArrayBlockingQueue = hcg0Var.f107048a;
                            if (byteArrayBlockingQueue != null) {
                                byteArrayBlockingQueue.offer((byte) 0);
                                hcg0Var.f107048a = null;
                            }
                            jgg0Var.f117784i = null;
                        }
                        hcg0 hcg0Var2 = new hcg0();
                        jgg0Var.f117784i = hcg0Var2;
                        z6g0Var.f201918f = hcg0Var2;
                        z6g0Var.f201919g = str;
                        z6g0Var.f201921i = jgg0Var.f117777b;
                        z6g0Var.f201922j = jgg0Var.f117778c;
                        jgg0Var.f117783h.m155682c(new u7g0(z6g0Var), new wjg0(jgg0Var));
                        LogUtils.file("AiAgentImpl", "startAudioRecognize success ");
                        SudLogger.m221565d(jgg0Var.f117776a, "startAudioRecognize success ");
                    } else {
                        LogUtils.file("AiAgentImpl", "无法开启asr识别，因为当前语言不在于后台给的语言配置列表当中");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f148172a.f117787l = null;
    }
}
