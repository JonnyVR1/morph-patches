package p153l;

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
public abstract class utg0 {

    /* JADX INFO: renamed from: a */
    public static final String f180946a = "SudGIP ".concat(utg0.class.getSimpleName());

    /* JADX INFO: renamed from: b */
    public static final uyg0 f180947b = new uyg0();

    /* JADX INFO: renamed from: c */
    public static boolean f180948c = false;

    /* JADX INFO: renamed from: d */
    public static String f180949d = "zh-CN";

    /* JADX INFO: renamed from: e */
    public static i0h0 f180950e = new i0h0();

    /* JADX INFO: renamed from: f */
    public static int f180951f = 1;

    /* JADX INFO: renamed from: g */
    public static String f180952g = "";

    /* JADX INFO: renamed from: h */
    public static String f180953h = "";

    /* JADX INFO: renamed from: i */
    public static String f180954i = "";

    /* JADX INFO: renamed from: j */
    public static final String f180955j = gxg0.m132863b(UUID.randomUUID().toString());

    /* JADX INFO: renamed from: a */
    public static ArrayList m198033a() {
        gvg0 gvg0Var;
        svg0 svg0Var;
        ArrayList arrayList;
        String[] strArrSplit;
        String str = (String) arg0.f72934a.f152695d.get(ISudCfg.ASR_LOAD_LIST);
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
        i0h0 i0h0Var = f180950e;
        if (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null || (svg0Var = gvg0Var.f106634e) == null || (arrayList = svg0Var.f170839b) == null) {
            return null;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static void m198034b(SudInitSDKParamModel sudInitSDKParamModel, ISudListenerInitSDK iSudListenerInitSDK, yng0 yng0Var, yng0 yng0Var2) {
        String str = f180946a;
        SudLogger.m222815i(str, "initSDK");
        if (!ThreadUtils.checkUIThread()) {
            LogUtils.file("SdkMgr", "initSDK Please call on UI or Main thread");
            SudLogger.m222813e(str, "initSDK Please call on UI or Main thread");
            if (iSudListenerInitSDK != null) {
                iSudListenerInitSDK.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            return;
        }
        if (sudInitSDKParamModel == null || !sudInitSDKParamModel.check()) {
            LogUtils.file("SdkMgr", "initSDK Parameters cannot be null");
            SudLogger.m222813e(str, "initSDK Parameters cannot be null");
            if (iSudListenerInitSDK != null) {
                iSudListenerInitSDK.onFailure(-10104, "Parameters cannot be null");
                return;
            }
            return;
        }
        Context applicationContext = sudInitSDKParamModel.context.getApplicationContext();
        sudInitSDKParamModel.context = applicationContext;
        if (wxg0.f191490c == null) {
            synchronized (wxg0.class) {
                try {
                    if (wxg0.f191490c == null) {
                        wxg0.f191490c = new wxg0(applicationContext);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Context context = sudInitSDKParamModel.context;
        String str2 = bhg0.f76783d;
        if (Sudtry.f211030Suddo == null) {
            Sudtry.f211030Suddo = context;
        }
        if (sudInitSDKParamModel.userId == null) {
            sudInitSDKParamModel.userId = "";
        }
        fug0.f100911a = sudInitSDKParamModel.userId;
        Utils.initContext(context);
        String str3 = lmg0.f132690e;
        khg0.f126870a.m154862a(Utils.getApp());
        int i = f180951f;
        boolean z = f180948c;
        boolean z2 = sudInitSDKParamModel.isTestEnv;
        f180948c = z2;
        if (i == 1) {
            if (z2) {
                f180951f = 2;
                f180947b.getClass();
                uyg0.m198635z();
            } else {
                f180951f = 1;
                f180947b.getClass();
                uyg0.m198635z();
            }
        } else if (i == 2) {
            if (z2) {
                f180951f = 2;
                f180947b.getClass();
                uyg0.m198635z();
            } else {
                f180951f = 1;
                f180947b.getClass();
                uyg0.m198635z();
            }
        }
        int i2 = f180951f;
        if (!f180952g.equals(sudInitSDKParamModel.appId) || !f180953h.equals(sudInitSDKParamModel.appKey) || i != i2 || z != sudInitSDKParamModel.isTestEnv) {
            f180947b.m198637f();
        }
        f180952g = sudInitSDKParamModel.appId;
        f180953h = sudInitSDKParamModel.appKey;
        String packageName = sudInitSDKParamModel.context.getPackageName();
        if (packageName == null) {
            f180954i = "";
        } else {
            f180954i = packageName;
        }
        LogUtils.file("SdkMgr", "initSDK appId:" + f180952g + "  appKey:" + sudInitSDKParamModel.appKey + "  bundleId:" + f180954i + "  isTestEnv:" + sudInitSDKParamModel.isTestEnv);
        f180947b.m198652y(iSudListenerInitSDK, sudInitSDKParamModel.context, sudInitSDKParamModel.appId, sudInitSDKParamModel.appKey, sudInitSDKParamModel.isTestEnv, yng0Var, yng0Var2);
    }

    /* JADX INFO: renamed from: c */
    public static JSONArray m198035c() {
        gvg0 gvg0Var;
        jxg0 jxg0Var;
        VolcCfg volcCfg;
        i0h0 i0h0Var = f180950e;
        if (i0h0Var != null && (gvg0Var = i0h0Var.f112370c) != null && (jxg0Var = gvg0Var.f106643n) != null && (volcCfg = jxg0Var.f123032a) != null) {
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
    public static String m198036d() {
        String packageName = f180954i;
        if (TextUtils.isEmpty(packageName)) {
            packageName = Utils.getApp().getPackageName();
        }
        return packageName == null ? "" : packageName;
    }

    /* JADX INFO: renamed from: e */
    public static smg0 m198037e() {
        gvg0 gvg0Var;
        i0h0 i0h0Var = f180950e;
        if (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) {
            return null;
        }
        return gvg0Var.f106638i;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m198038f() {
        i0h0 i0h0Var;
        gvg0 gvg0Var;
        String str = SudGIP.getCfg().getAdvancedConfigMap().get(ISudCfg.RUNTIME_3D_MULTIPROCESS);
        LogUtils.file("SdkMgr", "runtime3dMultiprocess:" + str);
        if ("true".equals(str)) {
            return true;
        }
        if ("false".equals(str) || (i0h0Var = f180950e) == null || (gvg0Var = i0h0Var.f112370c) == null) {
            return false;
        }
        return gvg0Var.f106640k;
    }
}
