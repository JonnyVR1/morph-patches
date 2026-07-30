package tech.sud.gip.core;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;
import p149l.asg0;
import p149l.bbg0;
import p149l.d8g0;
import p149l.eng0;
import p149l.f9g0;
import p149l.ffg0;
import p149l.g7g0;
import p149l.geg0;
import p149l.hqg0;
import p149l.hyx;
import p149l.ihg0;
import p149l.l7g0;
import p149l.lkg0;
import p149l.mdg0;
import p149l.mlg0;
import p149l.mqg0;
import p149l.stc0;
import p149l.tog0;
import p149l.utc0;
import p149l.ymg0;
import p149l.yog0;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.p136ai.ISudListenerAiCommon;
import tech.sud.gip.core.p136ai.ISudListenerAiSse;
import tech.sud.gip.core.p136ai.ISudListenerLoadModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SudAiModel {
    public static void aiCommon(String str, ISudListenerAiCommon iSudListenerAiCommon) {
        String str2 = hqg0.f109056a;
        if (iSudListenerAiCommon == null) {
            LogUtils.file("SudAiModelImpl", "aiCommon listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(hqg0.f109056a, "Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "aiCommon Please call on UI or Main thread");
            iSudListenerAiCommon.onCompleted(hqg0.m132452a(-1, "Please call on UI or Main thread"));
        } else {
            if (!mlg0.f134427b.f135224a) {
                LogUtils.file("SudAiModelImpl", "aiCommon Please call initSDK first successfully");
                iSudListenerAiCommon.onCompleted(hqg0.m132452a(-10103, "Please call initSDK first successfully"));
                return;
            }
            geg0 geg0Var = new geg0(str, iSudListenerAiCommon);
            ArrayList arrayList = hqg0.f109057b;
            if (!arrayList.contains(geg0Var)) {
                arrayList.add(geg0Var);
            }
            f9g0.m120081b(str, geg0Var);
        }
    }

    public static void aiSse(String str, ISudListenerAiSse iSudListenerAiSse) {
        String str2 = hqg0.f109056a;
        if (iSudListenerAiSse == null) {
            LogUtils.file("SudAiModelImpl", "aiSse listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(hqg0.f109056a, "aiSse Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "aiSse Please call on UI or Main thread");
            iSudListenerAiSse.onFailure(-1, "Please call on UI or Main thread");
        } else {
            if (!mlg0.f134427b.f135224a) {
                LogUtils.file("SudAiModelImpl", "aiSse Please call initSDK first successfully");
                iSudListenerAiSse.onFailure(-10103, "Please call initSDK first successfully");
                return;
            }
            ihg0 ihg0Var = new ihg0(iSudListenerAiSse);
            ArrayList arrayList = hqg0.f109057b;
            if (!arrayList.contains(ihg0Var)) {
                arrayList.add(ihg0Var);
            }
            f9g0.m120082c(str, ihg0Var);
        }
    }

    public static void clearAllCache(Context context) {
        String str = hqg0.f109056a;
        if (ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(hqg0.f109056a, "clearAllCache Cannot be called in the main thread");
            LogUtils.file("SudAiModelImpl", "clearAllCache Cannot be called in the main thread");
        } else {
            String absolutePath = context == null ? null : new File(context.getFilesDir(), "sud/mgp/ai").getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath)) {
                return;
            }
            g7g0.m124692c(absolutePath);
        }
    }

    public static String getCachePath(Context context) {
        String str = hqg0.f109056a;
        if (context == null) {
            return null;
        }
        return new File(context.getFilesDir(), "sud/mgp/ai").getAbsolutePath();
    }

    public static void loadModel(String str, ISudListenerLoadModel iSudListenerLoadModel) {
        String strOptString;
        ymg0 ymg0Var;
        String str2 = hqg0.f109056a;
        if (iSudListenerLoadModel == null) {
            LogUtils.file("SudAiModelImpl", "loadModel listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m221567e(hqg0.f109056a, "loadModel Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "loadModel Please call on UI or Main thread");
            iSudListenerLoadModel.onFailure(-1, "Please call on UI or Main thread");
            return;
        }
        if (!mlg0.f134427b.f135224a) {
            LogUtils.file("SudAiModelImpl", "loadModel Please call initSDK first successfully");
            iSudListenerLoadModel.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        ffg0 ffg0Var = new ffg0(str, new eng0(iSudListenerLoadModel));
        ArrayList arrayList = hqg0.f109057b;
        if (!arrayList.contains(ffg0Var)) {
            arrayList.add(ffg0Var);
        }
        bbg0 bbg0Var = new bbg0(ffg0Var);
        try {
            strOptString = new JSONObject(str).optString("request_id");
        } catch (Exception e) {
            LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            strOptString = null;
        }
        d8g0 d8g0Var = new d8g0(new WeakReference(bbg0Var), strOptString);
        if (!mlg0.f134427b.f135224a) {
            d8g0Var.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        asg0 asg0Var = mlg0.f134430e;
        l7g0 l7g0Var = (asg0Var == null || (ymg0Var = asg0Var.f71451c) == null) ? null : ymg0Var.f199011m;
        String str3 = l7g0Var != null ? l7g0Var.f126721c : null;
        if (TextUtils.isEmpty(str3)) {
            d8g0Var.onFailure(-1, "model_api_cfg ai_normal url is null");
            return;
        }
        stc0.C20027a c20027aM185893l = mqg0.m155897e(yog0.m215499b(UUID.randomUUID().toString()), new tog0(), null).m185898q(str3).m185893l(utc0.create(hyx.m133627c("application/json; charset=utf-8"), str));
        lkg0.m150267a(c20027aM185893l);
        lkg0.f128531b.mo144849a(c20027aM185893l.m185883b()).mo96077h(new mdg0(d8g0Var));
    }
}
