package p149l;

import Sudif.Sudtry;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONArray;
import tech.sud.base.utils.Utils;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudCfg;
import tech.sud.gip.core.ISudListenerInitSDK;
import tech.sud.gip.core.SudGIP;
import tech.sud.gip.core.SudInitSDKParamModel;
import tech.sud.gip.core.model.VolcCfg;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class mlg0 {

    /* JADX INFO: renamed from: a */
    public static final String f134426a = "SudGIP ".concat(mlg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public static final mqg0 f134427b = new mqg0();

    /* JADX INFO: renamed from: c */
    public static boolean f134428c = false;

    /* JADX INFO: renamed from: d */
    public static String f134429d = "zh-CN";

    /* JADX INFO: renamed from: e */
    public static asg0 f134430e = new asg0();

    /* JADX INFO: renamed from: f */
    public static int f134431f = 1;

    /* JADX INFO: renamed from: g */
    public static String f134432g = "";

    /* JADX INFO: renamed from: h */
    public static String f134433h = "";

    /* JADX INFO: renamed from: i */
    public static String f134434i = "";

    /* JADX INFO: renamed from: j */
    public static final String f134435j = yog0.m215499b(UUID.randomUUID().toString());

    /* JADX INFO: renamed from: a */
    public static ArrayList m155142a() {
        ymg0 ymg0Var;
        kng0 kng0Var;
        ArrayList arrayList;
        String[] strArrSplit;
        String str = (String) sig0.f164716a.f106933d.get(ISudCfg.ASR_LOAD_LIST);
        if (str != null && (strArrSplit = str.split(Constants.SEPARATOR_COMMA)) != null && strArrSplit.length > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArrSplit) {
                try {
                    arrayList2.add(Integer.valueOf(Integer.parseInt(str2)));
                } catch (Exception e) {
                    LogUtils.file("SdkMgr", LogUtils.getErrorInfo(e));
                }
            }
            if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        asg0 asg0Var = f134430e;
        if (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null || (kng0Var = ymg0Var.f199003e) == null || (arrayList = kng0Var.f123887b) == null) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m155143b(SudInitSDKParamModel sudInitSDKParamModel, ISudListenerInitSDK iSudListenerInitSDK, qfg0 qfg0Var, qfg0 qfg0Var2) {
        String str = f134426a;
        SudLogger.m221569i(str, "initSDK");
        if (!ThreadUtils.checkUIThread()) {
            LogUtils.file("SdkMgr", "initSDK Please call on UI or Main thread");
            SudLogger.m221567e(str, "initSDK Please call on UI or Main thread");
            if (iSudListenerInitSDK != null) {
                iSudListenerInitSDK.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            return;
        }
        if (sudInitSDKParamModel == null || !sudInitSDKParamModel.check()) {
            LogUtils.file("SdkMgr", "initSDK Parameters cannot be null");
            SudLogger.m221567e(str, "initSDK Parameters cannot be null");
            if (iSudListenerInitSDK != null) {
                iSudListenerInitSDK.onFailure(-10104, "Parameters cannot be null");
                return;
            }
            return;
        }
        Context applicationContext = sudInitSDKParamModel.context.getApplicationContext();
        sudInitSDKParamModel.context = applicationContext;
        if (opg0.f144995c == null) {
            synchronized (opg0.class) {
                try {
                    if (opg0.f144995c == null) {
                        opg0.f144995c = new opg0(applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Context context = sudInitSDKParamModel.context;
        String str2 = t8g0.f168916d;
        if (Sudtry.f210108Suddo == null) {
            Sudtry.f210108Suddo = context;
        }
        if (sudInitSDKParamModel.userId == null) {
            sudInitSDKParamModel.userId = "";
        }
        xlg0.f193417a = sudInitSDKParamModel.userId;
        Utils.initContext(context);
        String str3 = deg0.f85793e;
        c9g0.f79931a.m111257a(Utils.getApp());
        int i = f134431f;
        boolean z = f134428c;
        boolean z2 = sudInitSDKParamModel.isTestEnv;
        f134428c = z2;
        if (i == 1) {
            if (z2) {
                f134431f = 2;
                f134427b.getClass();
                mqg0.m155902z();
            } else {
                f134431f = 1;
                f134427b.getClass();
                mqg0.m155902z();
            }
        } else if (i == 2) {
            if (z2) {
                f134431f = 2;
                f134427b.getClass();
                mqg0.m155902z();
            } else {
                f134431f = 1;
                f134427b.getClass();
                mqg0.m155902z();
            }
        }
        int i2 = f134431f;
        if (!f134432g.equals(sudInitSDKParamModel.appId) || !f134433h.equals(sudInitSDKParamModel.appKey) || i != i2 || z != sudInitSDKParamModel.isTestEnv) {
            f134427b.m155904f();
        }
        f134432g = sudInitSDKParamModel.appId;
        f134433h = sudInitSDKParamModel.appKey;
        String packageName = sudInitSDKParamModel.context.getPackageName();
        if (packageName == null) {
            f134434i = "";
        } else {
            f134434i = packageName;
        }
        LogUtils.file("SdkMgr", "initSDK appId:" + f134432g + "  appKey:" + sudInitSDKParamModel.appKey + "  bundleId:" + f134434i + "  isTestEnv:" + sudInitSDKParamModel.isTestEnv);
        f134427b.m155919y(iSudListenerInitSDK, sudInitSDKParamModel.context, sudInitSDKParamModel.appId, sudInitSDKParamModel.appKey, sudInitSDKParamModel.isTestEnv, qfg0Var, qfg0Var2);
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m155144c() {
        ymg0 ymg0Var;
        bpg0 bpg0Var;
        VolcCfg volcCfg;
        asg0 asg0Var = f134430e;
        if (asg0Var != null && (ymg0Var = asg0Var.f71451c) != null && (bpg0Var = ymg0Var.f199012n) != null && (volcCfg = bpg0Var.f76625a) != null) {
            return volcCfg.languages;
        }
        try {
            return new JSONArray("[\"zh-CN\"]");
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONArray();
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m155145d() {
        String packageName = f134434i;
        if (TextUtils.isEmpty(packageName)) {
            packageName = Utils.getApp().getPackageName();
        }
        return packageName == null ? "" : packageName;
    }

    /* JADX INFO: renamed from: e */
    public static keg0 m155146e() {
        ymg0 ymg0Var;
        asg0 asg0Var = f134430e;
        if (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) {
            return null;
        }
        return ymg0Var.f199007i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m155147f() {
        asg0 asg0Var;
        ymg0 ymg0Var;
        String str = SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.RUNTIME_3D_MULTIPROCESS);
        LogUtils.file("SdkMgr", "runtime3dMultiprocess:" + str);
        if ("true".equals(str)) {
            return true;
        }
        if ("false".equals(str) || (asg0Var = f134430e) == null || (ymg0Var = asg0Var.f71451c) == null) {
            return false;
        }
        return ymg0Var.f199009k;
    }
}
