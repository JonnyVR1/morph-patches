package p149l;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.json.JSONArray;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.asr.base.Sudif;
import tech.sud.gip.asr.base.Sudtry;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.TccRtssCfg;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ecg0 implements Sudtry {

    /* JADX INFO: renamed from: c */
    public static final String f90500c = "SudGIP ".concat(ecg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final BaseRealSudASRImpl f90501a;

    /* JADX INFO: renamed from: b */
    public final jog0 f90502b;

    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    public ecg0(InitASRParamModel initASRParamModel) {
        nhg0 nhg0Var;
        ymg0 ymg0Var;
        asg0 asg0Var;
        kng0 kng0Var;
        TccRtssCfg tccRtssCfg;
        ymg0 ymg0Var2;
        asg0 asg0Var2;
        VolcCfg volcCfg;
        ymg0 ymg0Var3;
        bpg0 bpg0Var;
        jog0 jog0Var = new jog0();
        this.f90502b = jog0Var;
        initASRParamModel.supportTextLanguageList = m115688c();
        initASRParamModel.supportNumberLanguageList = m115686a();
        int iM115687b = m115687b();
        ArrayList arrayListM155142a = mlg0.m155142a();
        String str = f90500c;
        SudLogger.m221565d(str, "asrType:" + iM115687b);
        SudLogger.m221565d(str, "asrLoadList:" + arrayListM155142a);
        LogUtils.file("ProxyASRImpl", "asrType:" + iM115687b);
        LogUtils.file("ProxyASRImpl", "asrLoadList:" + arrayListM155142a);
        jog0Var.f118974a = iM115687b;
        BaseRealSudASRImpl emg0Var = null;
        if (iM115687b == 1) {
            asg0 asg0Var3 = mlg0.f134430e;
            kng0 kng0Var2 = (asg0Var3 == null || (ymg0Var = asg0Var3.f71451c) == null) ? null : ymg0Var.f199003e;
            if (kng0Var2 == null || (nhg0Var = kng0Var2.f123886a) == null) {
                SudLogger.m221573w(str, "asr ms cfg empty");
            } else {
                try {
                    BaseRealSudASRImpl baseRealSudASRImpl = (BaseRealSudASRImpl) Class.forName("tech.sud.gip.asr.azure.AzureRealSudASRImpl").getDeclaredConstructor(String.class, String.class, InitASRParamModel.class).newInstance(nhg0Var.f138978a, nhg0Var.f138979b, initASRParamModel);
                    baseRealSudASRImpl.setMatchASREvent(jog0Var);
                    emg0Var = baseRealSudASRImpl;
                } catch (Exception e) {
                    e.printStackTrace();
                    LogUtils.file("ProxyASRImpl", "not found azure asr impl");
                    asg0Var = mlg0.f134430e;
                    if (asg0Var != null) {
                        kng0Var = null;
                    } else {
                        kng0Var = null;
                    }
                    if (kng0Var != null) {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m221573w(f90500c, "asr tx cfg empty");
                        asg0Var2 = mlg0.f134430e;
                        if (asg0Var2 != null) {
                            volcCfg = null;
                        } else {
                            volcCfg = null;
                        }
                        if (volcCfg != null) {
                            "SudGIP ".concat(Sudif.class.getSimpleName());
                            emg0Var = new emg0(initASRParamModel, volcCfg);
                            emg0Var.setMatchASREvent(this.f90502b);
                        } else {
                            LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                            SudLogger.m221573w(f90500c, "asr tx cfg empty");
                        }
                    } else {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m221573w(f90500c, "asr tx cfg empty");
                        asg0Var2 = mlg0.f134430e;
                        if (asg0Var2 != null) {
                            volcCfg = null;
                        } else {
                            volcCfg = null;
                        }
                        if (volcCfg != null) {
                            "SudGIP ".concat(Sudif.class.getSimpleName());
                            emg0Var = new emg0(initASRParamModel, volcCfg);
                            emg0Var.setMatchASREvent(this.f90502b);
                        } else {
                            LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                            SudLogger.m221573w(f90500c, "asr tx cfg empty");
                        }
                    }
                }
            }
            asg0Var = mlg0.f134430e;
            if (asg0Var != null) {
                kng0Var = null;
            } else {
                kng0Var = null;
            }
            if (kng0Var != null) {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m221573w(f90500c, "asr tx cfg empty");
                asg0Var2 = mlg0.f134430e;
                if (asg0Var2 != null) {
                    volcCfg = null;
                } else {
                    volcCfg = null;
                }
                if (volcCfg != null) {
                    "SudGIP ".concat(Sudif.class.getSimpleName());
                    emg0Var = new emg0(initASRParamModel, volcCfg);
                    emg0Var.setMatchASREvent(this.f90502b);
                } else {
                    LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                    SudLogger.m221573w(f90500c, "asr tx cfg empty");
                }
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m221573w(f90500c, "asr tx cfg empty");
                asg0Var2 = mlg0.f134430e;
                if (asg0Var2 != null) {
                    volcCfg = null;
                } else {
                    volcCfg = null;
                }
                if (volcCfg != null) {
                    "SudGIP ".concat(Sudif.class.getSimpleName());
                    emg0Var = new emg0(initASRParamModel, volcCfg);
                    emg0Var.setMatchASREvent(this.f90502b);
                } else {
                    LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                    SudLogger.m221573w(f90500c, "asr tx cfg empty");
                }
            }
        } else if (iM115687b == 3) {
            asg0Var = mlg0.f134430e;
            if (asg0Var != null || (ymg0Var2 = asg0Var.f71451c) == null) {
                kng0Var = null;
            } else {
                kng0Var = ymg0Var2.f199003e;
            }
            if (kng0Var != null || (tccRtssCfg = kng0Var.f123888c) == null) {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m221573w(f90500c, "asr tx cfg empty");
            } else {
                try {
                    BaseRealSudASRImpl baseRealSudASRImpl2 = (BaseRealSudASRImpl) Class.forName("tech.sud.gip.asr.tx.TxRealSudASRImpl").getDeclaredConstructor(InitASRParamModel.class, TccRtssCfg.class).newInstance(initASRParamModel, tccRtssCfg);
                    baseRealSudASRImpl2.setMatchASREvent(this.f90502b);
                    emg0Var = baseRealSudASRImpl2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    LogUtils.file("ProxyASRImpl", "not found tx asr impl");
                    asg0Var2 = mlg0.f134430e;
                    if (asg0Var2 != null) {
                        volcCfg = null;
                    } else {
                        volcCfg = null;
                    }
                    if (volcCfg != null) {
                        "SudGIP ".concat(Sudif.class.getSimpleName());
                        emg0Var = new emg0(initASRParamModel, volcCfg);
                        emg0Var.setMatchASREvent(this.f90502b);
                    } else {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m221573w(f90500c, "asr tx cfg empty");
                    }
                }
            }
            asg0Var2 = mlg0.f134430e;
            if (asg0Var2 != null) {
                volcCfg = null;
            } else {
                volcCfg = null;
            }
            if (volcCfg != null) {
                "SudGIP ".concat(Sudif.class.getSimpleName());
                emg0Var = new emg0(initASRParamModel, volcCfg);
                emg0Var.setMatchASREvent(this.f90502b);
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m221573w(f90500c, "asr tx cfg empty");
            }
        } else if (iM115687b == 4) {
            asg0Var2 = mlg0.f134430e;
            if (asg0Var2 != null || (ymg0Var3 = asg0Var2.f71451c) == null || (bpg0Var = ymg0Var3.f199012n) == null) {
                volcCfg = null;
            } else {
                volcCfg = bpg0Var.f76625a;
            }
            if (volcCfg != null) {
                "SudGIP ".concat(Sudif.class.getSimpleName());
                emg0Var = new emg0(initASRParamModel, volcCfg);
                emg0Var.setMatchASREvent(this.f90502b);
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m221573w(f90500c, "asr tx cfg empty");
            }
        }
        this.f90501a = emg0Var;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m115686a() {
        ymg0 ymg0Var;
        kng0 kng0Var;
        nhg0 nhg0Var;
        ymg0 ymg0Var2;
        kng0 kng0Var2;
        TccRtssCfg tccRtssCfg;
        int iM115687b = m115687b();
        if (iM115687b == 1) {
            asg0 asg0Var = mlg0.f134430e;
            if (asg0Var != null && (ymg0Var = asg0Var.f71451c) != null && (kng0Var = ymg0Var.f199003e) != null && (nhg0Var = kng0Var.f123886a) != null) {
                return nhg0Var.f138981d;
            }
            try {
                return new JSONArray("[\"zh-CN\"]");
            } catch (Exception e) {
                e.printStackTrace();
                return new JSONArray();
            }
        }
        if (iM115687b != 3) {
            if (iM115687b != 4) {
                return null;
            }
            return mlg0.m155144c();
        }
        asg0 asg0Var2 = mlg0.f134430e;
        if (asg0Var2 != null && (ymg0Var2 = asg0Var2.f71451c) != null && (kng0Var2 = ymg0Var2.f199003e) != null && (tccRtssCfg = kng0Var2.f123888c) != null) {
            return tccRtssCfg.asr_number_language_list;
        }
        try {
            return new JSONArray("[\"zh-CN\"]");
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m115687b() {
        ArrayList arrayListM155142a = mlg0.m155142a();
        if (arrayListM155142a != null && arrayListM155142a.size() != 0) {
            int size = arrayListM155142a.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM155142a.get(i);
                i++;
                Integer num = (Integer) obj;
                try {
                    if (num.intValue() == 1) {
                        Class.forName("tech.sud.gip.asr.azure.AzureRealSudASRImpl");
                        return 1;
                    }
                    if (num.intValue() == 3) {
                        Class.forName("tech.sud.gip.asr.tx.TxRealSudASRImpl");
                        return 3;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m115688c() {
        ymg0 ymg0Var;
        kng0 kng0Var;
        nhg0 nhg0Var;
        ymg0 ymg0Var2;
        kng0 kng0Var2;
        TccRtssCfg tccRtssCfg;
        int iM115687b = m115687b();
        if (iM115687b == 1) {
            asg0 asg0Var = mlg0.f134430e;
            if (asg0Var != null && (ymg0Var = asg0Var.f71451c) != null && (kng0Var = ymg0Var.f199003e) != null && (nhg0Var = kng0Var.f123886a) != null) {
                return nhg0Var.f138980c;
            }
            try {
                return new JSONArray("[\"zh-CN\"]");
            } catch (Exception e) {
                e.printStackTrace();
                return new JSONArray();
            }
        }
        if (iM115687b != 3) {
            if (iM115687b != 4) {
                return null;
            }
            return mlg0.m155144c();
        }
        asg0 asg0Var2 = mlg0.f134430e;
        if (asg0Var2 != null && (ymg0Var2 = asg0Var2.f71451c) != null && (kng0Var2 = ymg0Var2.f199003e) != null && (tccRtssCfg = kng0Var2.f123888c) != null) {
            return tccRtssCfg.asr_text_language_list;
        }
        try {
            return new JSONArray("[\"zh-CN\"]");
        } catch (Exception e2) {
            e2.printStackTrace();
            return new JSONArray();
        }
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public final void handleGameASR(String str) {
        BaseRealSudASRImpl baseRealSudASRImpl = this.f90501a;
        if (baseRealSudASRImpl != null) {
            baseRealSudASRImpl.handleGameASR(str);
        }
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public final void pushAudio(ByteBuffer byteBuffer, int i) {
        throw null;
    }

    @Override // tech.sud.gip.asr.base.Sudtry
    public final void stopASR(boolean z) {
        throw null;
    }
}
