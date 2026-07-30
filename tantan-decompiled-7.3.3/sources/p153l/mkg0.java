package p153l;

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
public final class mkg0 implements Sudtry {

    /* JADX INFO: renamed from: c */
    public static final String f137297c = "SudGIP ".concat(mkg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final BaseRealSudASRImpl f137298a;

    /* JADX INFO: renamed from: b */
    public final rwg0 f137299b;

    /* JADX WARN: Code duplicated, block: B:25:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x010d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    public mkg0(InitASRParamModel initASRParamModel) {
        vpg0 vpg0Var;
        gvg0 gvg0Var;
        i0h0 i0h0Var;
        svg0 svg0Var;
        TccRtssCfg tccRtssCfg;
        gvg0 gvg0Var2;
        i0h0 i0h0Var2;
        VolcCfg volcCfg;
        gvg0 gvg0Var3;
        jxg0 jxg0Var;
        rwg0 rwg0Var = new rwg0();
        this.f137299b = rwg0Var;
        initASRParamModel.supportTextLanguageList = m158786c();
        initASRParamModel.supportNumberLanguageList = m158784a();
        int iM158785b = m158785b();
        ArrayList arrayListM198033a = utg0.m198033a();
        String str = f137297c;
        SudLogger.m222811d(str, "asrType:" + iM158785b);
        SudLogger.m222811d(str, "asrLoadList:" + arrayListM198033a);
        LogUtils.file("ProxyASRImpl", "asrType:" + iM158785b);
        LogUtils.file("ProxyASRImpl", "asrLoadList:" + arrayListM198033a);
        rwg0Var.f165134a = iM158785b;
        BaseRealSudASRImpl mug0Var = null;
        if (iM158785b == 1) {
            i0h0 i0h0Var3 = utg0.f180950e;
            svg0 svg0Var2 = (i0h0Var3 == null || (gvg0Var = i0h0Var3.f112370c) == null) ? null : gvg0Var.f106634e;
            if (svg0Var2 == null || (vpg0Var = svg0Var2.f170838a) == null) {
                SudLogger.m222819w(str, "asr ms cfg empty");
            } else {
                try {
                    BaseRealSudASRImpl baseRealSudASRImpl = (BaseRealSudASRImpl) Class.forName("tech.sud.gip.asr.azure.AzureRealSudASRImpl").getDeclaredConstructor(String.class, String.class, InitASRParamModel.class).newInstance(vpg0Var.f185250a, vpg0Var.f185251b, initASRParamModel);
                    baseRealSudASRImpl.setMatchASREvent(rwg0Var);
                    mug0Var = baseRealSudASRImpl;
                } catch (Exception e) {
                    e.printStackTrace();
                    LogUtils.file("ProxyASRImpl", "not found azure asr impl");
                    i0h0Var = utg0.f180950e;
                    if (i0h0Var != null) {
                        svg0Var = null;
                    } else {
                        svg0Var = null;
                    }
                    if (svg0Var != null) {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m222819w(f137297c, "asr tx cfg empty");
                        i0h0Var2 = utg0.f180950e;
                        if (i0h0Var2 != null) {
                            volcCfg = null;
                        } else {
                            volcCfg = null;
                        }
                        if (volcCfg != null) {
                            "SudGIP ".concat(Sudif.class.getSimpleName());
                            mug0Var = new mug0(initASRParamModel, volcCfg);
                            mug0Var.setMatchASREvent(this.f137299b);
                        } else {
                            LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                            SudLogger.m222819w(f137297c, "asr tx cfg empty");
                        }
                    } else {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m222819w(f137297c, "asr tx cfg empty");
                        i0h0Var2 = utg0.f180950e;
                        if (i0h0Var2 != null) {
                            volcCfg = null;
                        } else {
                            volcCfg = null;
                        }
                        if (volcCfg != null) {
                            "SudGIP ".concat(Sudif.class.getSimpleName());
                            mug0Var = new mug0(initASRParamModel, volcCfg);
                            mug0Var.setMatchASREvent(this.f137299b);
                        } else {
                            LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                            SudLogger.m222819w(f137297c, "asr tx cfg empty");
                        }
                    }
                }
            }
            i0h0Var = utg0.f180950e;
            if (i0h0Var != null) {
                svg0Var = null;
            } else {
                svg0Var = null;
            }
            if (svg0Var != null) {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m222819w(f137297c, "asr tx cfg empty");
                i0h0Var2 = utg0.f180950e;
                if (i0h0Var2 != null) {
                    volcCfg = null;
                } else {
                    volcCfg = null;
                }
                if (volcCfg != null) {
                    "SudGIP ".concat(Sudif.class.getSimpleName());
                    mug0Var = new mug0(initASRParamModel, volcCfg);
                    mug0Var.setMatchASREvent(this.f137299b);
                } else {
                    LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                    SudLogger.m222819w(f137297c, "asr tx cfg empty");
                }
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m222819w(f137297c, "asr tx cfg empty");
                i0h0Var2 = utg0.f180950e;
                if (i0h0Var2 != null) {
                    volcCfg = null;
                } else {
                    volcCfg = null;
                }
                if (volcCfg != null) {
                    "SudGIP ".concat(Sudif.class.getSimpleName());
                    mug0Var = new mug0(initASRParamModel, volcCfg);
                    mug0Var.setMatchASREvent(this.f137299b);
                } else {
                    LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                    SudLogger.m222819w(f137297c, "asr tx cfg empty");
                }
            }
        } else if (iM158785b == 3) {
            i0h0Var = utg0.f180950e;
            if (i0h0Var != null || (gvg0Var2 = i0h0Var.f112370c) == null) {
                svg0Var = null;
            } else {
                svg0Var = gvg0Var2.f106634e;
            }
            if (svg0Var != null || (tccRtssCfg = svg0Var.f170840c) == null) {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m222819w(f137297c, "asr tx cfg empty");
            } else {
                try {
                    BaseRealSudASRImpl baseRealSudASRImpl2 = (BaseRealSudASRImpl) Class.forName("tech.sud.gip.asr.tx.TxRealSudASRImpl").getDeclaredConstructor(InitASRParamModel.class, TccRtssCfg.class).newInstance(initASRParamModel, tccRtssCfg);
                    baseRealSudASRImpl2.setMatchASREvent(this.f137299b);
                    mug0Var = baseRealSudASRImpl2;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    LogUtils.file("ProxyASRImpl", "not found tx asr impl");
                    i0h0Var2 = utg0.f180950e;
                    if (i0h0Var2 != null) {
                        volcCfg = null;
                    } else {
                        volcCfg = null;
                    }
                    if (volcCfg != null) {
                        "SudGIP ".concat(Sudif.class.getSimpleName());
                        mug0Var = new mug0(initASRParamModel, volcCfg);
                        mug0Var.setMatchASREvent(this.f137299b);
                    } else {
                        LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                        SudLogger.m222819w(f137297c, "asr tx cfg empty");
                    }
                }
            }
            i0h0Var2 = utg0.f180950e;
            if (i0h0Var2 != null) {
                volcCfg = null;
            } else {
                volcCfg = null;
            }
            if (volcCfg != null) {
                "SudGIP ".concat(Sudif.class.getSimpleName());
                mug0Var = new mug0(initASRParamModel, volcCfg);
                mug0Var.setMatchASREvent(this.f137299b);
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m222819w(f137297c, "asr tx cfg empty");
            }
        } else if (iM158785b == 4) {
            i0h0Var2 = utg0.f180950e;
            if (i0h0Var2 != null || (gvg0Var3 = i0h0Var2.f112370c) == null || (jxg0Var = gvg0Var3.f106643n) == null) {
                volcCfg = null;
            } else {
                volcCfg = jxg0Var.f123032a;
            }
            if (volcCfg != null) {
                "SudGIP ".concat(Sudif.class.getSimpleName());
                mug0Var = new mug0(initASRParamModel, volcCfg);
                mug0Var.setMatchASREvent(this.f137299b);
            } else {
                LogUtils.file("ProxyASRImpl", "asr tx cfg empty");
                SudLogger.m222819w(f137297c, "asr tx cfg empty");
            }
        }
        this.f137298a = mug0Var;
    }

    /* JADX INFO: renamed from: a */
    public static JSONArray m158784a() {
        gvg0 gvg0Var;
        svg0 svg0Var;
        vpg0 vpg0Var;
        gvg0 gvg0Var2;
        svg0 svg0Var2;
        TccRtssCfg tccRtssCfg;
        int iM158785b = m158785b();
        if (iM158785b == 1) {
            i0h0 i0h0Var = utg0.f180950e;
            if (i0h0Var != null && (gvg0Var = i0h0Var.f112370c) != null && (svg0Var = gvg0Var.f106634e) != null && (vpg0Var = svg0Var.f170838a) != null) {
                return vpg0Var.f185253d;
            }
            try {
                return new JSONArray("[\"zh-CN\"]");
            } catch (Exception e) {
                e.printStackTrace();
                return new JSONArray();
            }
        }
        if (iM158785b != 3) {
            if (iM158785b != 4) {
                return null;
            }
            return utg0.m198035c();
        }
        i0h0 i0h0Var2 = utg0.f180950e;
        if (i0h0Var2 != null && (gvg0Var2 = i0h0Var2.f112370c) != null && (svg0Var2 = gvg0Var2.f106634e) != null && (tccRtssCfg = svg0Var2.f170840c) != null) {
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
    public static int m158785b() {
        ArrayList arrayListM198033a = utg0.m198033a();
        if (arrayListM198033a != null && arrayListM198033a.size() != 0) {
            int size = arrayListM198033a.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListM198033a.get(i);
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
    public static JSONArray m158786c() {
        gvg0 gvg0Var;
        svg0 svg0Var;
        vpg0 vpg0Var;
        gvg0 gvg0Var2;
        svg0 svg0Var2;
        TccRtssCfg tccRtssCfg;
        int iM158785b = m158785b();
        if (iM158785b == 1) {
            i0h0 i0h0Var = utg0.f180950e;
            if (i0h0Var != null && (gvg0Var = i0h0Var.f112370c) != null && (svg0Var = gvg0Var.f106634e) != null && (vpg0Var = svg0Var.f170838a) != null) {
                return vpg0Var.f185252c;
            }
            try {
                return new JSONArray("[\"zh-CN\"]");
            } catch (Exception e) {
                e.printStackTrace();
                return new JSONArray();
            }
        }
        if (iM158785b != 3) {
            if (iM158785b != 4) {
                return null;
            }
            return utg0.m198035c();
        }
        i0h0 i0h0Var2 = utg0.f180950e;
        if (i0h0Var2 != null && (gvg0Var2 = i0h0Var2.f112370c) != null && (svg0Var2 = gvg0Var2.f106634e) != null && (tccRtssCfg = svg0Var2.f170840c) != null) {
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
        BaseRealSudASRImpl baseRealSudASRImpl = this.f137298a;
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
