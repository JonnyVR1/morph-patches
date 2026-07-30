package tech.sud.gip.core;

import android.content.Context;
import android.os.Looper;
import java.util.List;
import l.mlg0;
import l.opg0;
import l.qfg0;
import l.sig0;
import l.u8g0;
import l.v8g0;
import l.xlg0;
import p003l.c7g0;
import p003l.lkg0;
import p003l.mqg0;
import tech.sud.base.utils.Utils;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.network.detection.INetworkDetectionFuture;
import tech.sud.gip.core.network.detection.INetworkDetectionListener;
import tech.sud.gip.core.network.detection.NetworkDetectionResult;
import tech.sud.gip.core.network.detection.SudNetworkDetectionParamModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudGIP {
    private static final String FILE_TAG = "SudGIP";
    private static final String _TAG = "SudGIP SudGIP";

    public static void cancelPreloadMGPkgList(List<Long> list) {
        if (!ThreadUtils.checkUIThread()) {
            LogUtils.file(FILE_TAG, "cancelPreloadMGPkgList Please call on UI or Main thread");
            return;
        }
        opg0 opg0Var = opg0.c;
        if (opg0Var == null) {
            LogUtils.file(FILE_TAG, "cancelPreloadMGPkgList preloader is null");
        } else {
            opg0Var.cancelPreloadMGPkgList(list);
        }
    }

    public static boolean destroyMG(ISudFSTAPP iSudFSTAPP) {
        if (ThreadUtils.checkUIThread()) {
            if (iSudFSTAPP != null) {
                return iSudFSTAPP.destroyMG();
            }
            return true;
        }
        SudLogger.m10034e("SudMGP", "destroyMG Please call on UI or Main thread");
        LogUtils.file(FILE_TAG, "destroyMG Please call on UI or Main thread");
        return false;
    }

    public static ISudCfg getCfg() {
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m10034e("SudMGP", "Please call on UI or Main thread");
        }
        return sig0.a;
    }

    public static String getLogDirPath(Context context) {
        return LogUtils.getLogDirPath(context);
    }

    public static void getMGList(ISudListenerGetMGList iSudListenerGetMGList) {
        if (!ThreadUtils.checkUIThread() && iSudListenerGetMGList != null) {
            iSudListenerGetMGList.onFailure(-1, "Please call on UI or Main thread");
        }
        String str = mlg0.a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            if (iSudListenerGetMGList != null) {
                iSudListenerGetMGList.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            return;
        }
        mqg0 mqg0Var = mlg0.b;
        if (mqg0Var.f5726a) {
            lkg0.f5324c.execute(new c7g0(mqg0Var, mqg0Var.f5734i, iSudListenerGetMGList));
        } else if (iSudListenerGetMGList != null) {
            iSudListenerGetMGList.onFailure(-10103, "Please call initSDK first successfully");
        }
    }

    public static String getVersion() {
        return "1.6.7.1286";
    }

    public static String getVersionAlias() {
        return "v1.6.7.1286-static";
    }

    public static void initSDK(SudInitSDKParamModel sudInitSDKParamModel, ISudListenerInitSDK iSudListenerInitSDK) {
        mlg0.b(sudInitSDKParamModel, iSudListenerInitSDK, (qfg0) null, (qfg0) null);
    }

    public static ISudFSTAPP loadMG(SudLoadMGParamModel sudLoadMGParamModel, ISudFSMMG iSudFSMMG) {
        String str = _TAG;
        SudLogger.m10036i(str, "loadMG");
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m10034e(str, "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "loadMG Please call on UI or Main thread");
            return null;
        }
        if (sudLoadMGParamModel == null || !sudLoadMGParamModel.check() || iSudFSMMG == null) {
            SudLogger.m10034e(str, "Parameters cannot be null");
            LogUtils.file(FILE_TAG, "loadMG Parameters cannot be null");
            return null;
        }
        Utils.initContext(sudLoadMGParamModel.activity);
        xlg0.a = sudLoadMGParamModel.userId;
        mlg0.d = sudLoadMGParamModel.language;
        return new v8g0(sudLoadMGParamModel, iSudFSMMG);
    }

    public static void preloadMGPkgList(Context context, List<Long> list, ISudListenerPreloadMGPkg iSudListenerPreloadMGPkg) {
        if (!ThreadUtils.checkUIThread()) {
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -1, "Please call on UI or Main thread");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call on UI or Main thread");
            return;
        }
        opg0 opg0Var = opg0.c;
        if (opg0Var == null) {
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -10103, "Please call initSDK first successfully");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call initSDK first successfully");
        } else {
            if (list != null && list.size() != 0) {
                opg0Var.preloadMGPkgList(context, list, iSudListenerPreloadMGPkg);
                return;
            }
            if (iSudListenerPreloadMGPkg != null) {
                iSudListenerPreloadMGPkg.onPreloadFailure(0L, -10104, "Parameters cannot be null");
            }
            LogUtils.file(FILE_TAG, "preloadMGPkgList Please call initSDK first successfully");
        }
    }

    public static void setLogLevel(int i) {
        LogUtils.file(FILE_TAG, "setLogLevel:" + i);
        if (ThreadUtils.checkUIThread()) {
            SudLogger.setLogLevel(i);
        } else {
            SudLogger.m10034e("SudMGP", "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "setLogLevel Please call on UI or Main thread");
        }
    }

    public static void setLogger(ISudLogger iSudLogger) {
        LogUtils.file(FILE_TAG, "setLogger:" + iSudLogger);
        if (ThreadUtils.checkUIThread()) {
            SudLogger.setLogger(iSudLogger);
        } else {
            SudLogger.m10034e("SudMGP", "Please call on UI or Main thread");
            LogUtils.file(FILE_TAG, "setLogger Please call on UI or Main thread");
        }
    }

    public static boolean setReportStatsEventListener(ISudListenerReportStatsEvent iSudListenerReportStatsEvent) {
        if (ThreadUtils.checkUIThread()) {
            xlg0.b = iSudListenerReportStatsEvent;
            return true;
        }
        SudLogger.m10034e("SudMGP", "Please call on UI or Main thread");
        return false;
    }

    public static INetworkDetectionFuture startNetworkDetection(SudNetworkDetectionParamModel sudNetworkDetectionParamModel, INetworkDetectionListener iNetworkDetectionListener) {
        if (sudNetworkDetectionParamModel != null && sudNetworkDetectionParamModel.check()) {
            u8g0 u8g0Var = new u8g0(sudNetworkDetectionParamModel, iNetworkDetectionListener);
            new Thread((Runnable) u8g0Var).start();
            return u8g0Var.c;
        }
        LogUtils.file(FILE_TAG, "initSDK Parameters cannot be null");
        SudLogger.m10034e(_TAG, "initSDK Parameters cannot be null");
        if (iNetworkDetectionListener == null) {
            return null;
        }
        NetworkDetectionResult networkDetectionResult = new NetworkDetectionResult();
        networkDetectionResult.code = -10104;
        networkDetectionResult.msg = "Parameters cannot be null";
        iNetworkDetectionListener.onCompleted(networkDetectionResult);
        return null;
    }

    public static void uninitSDK(ISudListenerUninitSDK iSudListenerUninitSDK) {
        LogUtils.file(FILE_TAG, "uninitSDK");
        if (!ThreadUtils.checkUIThread()) {
            if (iSudListenerUninitSDK != null) {
                iSudListenerUninitSDK.onFailure(-1, "Please call on UI or Main thread");
            }
        } else {
            mlg0.b.m6433f();
            if (iSudListenerUninitSDK != null) {
                iSudListenerUninitSDK.onSuccess();
            }
        }
    }
}
