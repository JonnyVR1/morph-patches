package p153l;

import tech.sud.gip.asr.base.Sudif;
import tech.sud.gip.asr.base.utils.ByteArrayBlockingQueue;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class xkg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ rog0 f194787a;

    public xkg0(rog0 rog0Var) {
        this.f194787a = rog0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gvg0 gvg0Var;
        jxg0 jxg0Var;
        rog0 rog0Var = this.f194787a;
        String str = rog0Var.f164200g;
        synchronized (rog0Var) {
            try {
                String str2 = "startASR:" + str + " currentIsRunning:" + rog0Var.f164199f;
                LogUtils.file("AiAgentImpl", str2);
                SudLogger.m222811d(rog0Var.f164194a, str2);
                if (!rog0Var.f164199f) {
                    rog0Var.f164199f = true;
                    i0h0 i0h0Var = utg0.f180950e;
                    VolcCfg volcCfg = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (jxg0Var = gvg0Var.f106643n) == null) ? null : jxg0Var.f123032a;
                    if (volcCfg == null) {
                        LogUtils.file("AiAgentImpl", "无法开启asr识别，因为后台没有给volcCfg配置");
                    } else if (volcCfg.canRecognitionLanguage(str)) {
                        uwg0 uwg0Var = rog0Var.f164201h;
                        if (uwg0Var != null) {
                            uwg0Var.m198352b();
                        }
                        rog0Var.f164201h = new uwg0(new Sudif(utg0.f180952g));
                        hfg0 hfg0Var = new hfg0();
                        hfg0Var.f109284a = volcCfg.async_url;
                        hfg0Var.f109285b = volcCfg.app_key;
                        hfg0Var.f109286c = volcCfg.access_key;
                        hfg0Var.f109287d = volcCfg.resource_id;
                        hfg0Var.f109291h = volcCfg.model_name;
                        hfg0Var.f109294k = volcCfg.request_config;
                        hfg0Var.f109288e = rog0Var.f164197d;
                        pkg0 pkg0Var = rog0Var.f164202i;
                        if (pkg0Var != null) {
                            ByteArrayBlockingQueue byteArrayBlockingQueue = pkg0Var.f152838a;
                            if (byteArrayBlockingQueue != null) {
                                byteArrayBlockingQueue.offer((byte) 0);
                                pkg0Var.f152838a = null;
                            }
                            rog0Var.f164202i = null;
                        }
                        pkg0 pkg0Var2 = new pkg0();
                        rog0Var.f164202i = pkg0Var2;
                        hfg0Var.f109289f = pkg0Var2;
                        hfg0Var.f109290g = str;
                        hfg0Var.f109292i = rog0Var.f164195b;
                        hfg0Var.f109293j = rog0Var.f164196c;
                        rog0Var.f164201h.m198353c(new cgg0(hfg0Var), new esg0(rog0Var));
                        LogUtils.file("AiAgentImpl", "startAudioRecognize success ");
                        SudLogger.m222811d(rog0Var.f164194a, "startAudioRecognize success ");
                    } else {
                        LogUtils.file("AiAgentImpl", "无法开启asr识别，因为当前语言不在于后台给的语言配置列表当中");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f194787a.f164205l = null;
    }
}
