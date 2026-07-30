package tech.sud.gip.core;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;
import p153l.bxg0;
import p153l.e7y;
import p153l.gvg0;
import p153l.gxg0;
import p153l.i0h0;
import p153l.jjg0;
import p153l.lgg0;
import p153l.mvg0;
import p153l.nhg0;
import p153l.nng0;
import p153l.ofg0;
import p153l.omg0;
import p153l.pyg0;
import p153l.qpg0;
import p153l.tfg0;
import p153l.tsg0;
import p153l.ulg0;
import p153l.utg0;
import p153l.uyg0;
import p153l.x1d0;
import p153l.z1d0;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.p140ai.ISudListenerAiCommon;
import tech.sud.gip.core.p140ai.ISudListenerAiSse;
import tech.sud.gip.core.p140ai.ISudListenerLoadModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public class SudAiModel {
    public static void aiCommon(String str, ISudListenerAiCommon iSudListenerAiCommon) {
        String str2 = pyg0.f154638a;
        if (iSudListenerAiCommon == null) {
            LogUtils.file("SudAiModelImpl", "aiCommon listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(pyg0.f154638a, "Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "aiCommon Please call on UI or Main thread");
            iSudListenerAiCommon.onCompleted(pyg0.m174284a(-1, "Please call on UI or Main thread"));
        } else {
            if (!utg0.f180947b.f181601a) {
                LogUtils.file("SudAiModelImpl", "aiCommon Please call initSDK first successfully");
                iSudListenerAiCommon.onCompleted(pyg0.m174284a(-10103, "Please call initSDK first successfully"));
                return;
            }
            omg0 omg0Var = new omg0(str, iSudListenerAiCommon);
            ArrayList arrayList = pyg0.f154639b;
            if (!arrayList.contains(omg0Var)) {
                arrayList.add(omg0Var);
            }
            nhg0.m163093b(str, omg0Var);
        }
    }

    public static void aiSse(String str, ISudListenerAiSse iSudListenerAiSse) {
        String str2 = pyg0.f154638a;
        if (iSudListenerAiSse == null) {
            LogUtils.file("SudAiModelImpl", "aiSse listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(pyg0.f154638a, "aiSse Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "aiSse Please call on UI or Main thread");
            iSudListenerAiSse.onFailure(-1, "Please call on UI or Main thread");
        } else {
            if (!utg0.f180947b.f181601a) {
                LogUtils.file("SudAiModelImpl", "aiSse Please call initSDK first successfully");
                iSudListenerAiSse.onFailure(-10103, "Please call initSDK first successfully");
                return;
            }
            qpg0 qpg0Var = new qpg0(iSudListenerAiSse);
            ArrayList arrayList = pyg0.f154639b;
            if (!arrayList.contains(qpg0Var)) {
                arrayList.add(qpg0Var);
            }
            nhg0.m163094c(str, qpg0Var);
        }
    }

    public static void clearAllCache(Context context) {
        String str = pyg0.f154638a;
        if (ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(pyg0.f154638a, "clearAllCache Cannot be called in the main thread");
            LogUtils.file("SudAiModelImpl", "clearAllCache Cannot be called in the main thread");
        } else {
            String absolutePath = context == null ? null : new File(context.getFilesDir(), "sud/mgp/ai").getAbsolutePath();
            if (TextUtils.isEmpty(absolutePath)) {
                return;
            }
            ofg0.m167450c(absolutePath);
        }
    }

    public static String getCachePath(Context context) {
        String str = pyg0.f154638a;
        if (context == null) {
            return null;
        }
        return new File(context.getFilesDir(), "sud/mgp/ai").getAbsolutePath();
    }

    public static void loadModel(String str, ISudListenerLoadModel iSudListenerLoadModel) {
        String strOptString;
        gvg0 gvg0Var;
        String str2 = pyg0.f154638a;
        if (iSudListenerLoadModel == null) {
            LogUtils.file("SudAiModelImpl", "loadModel listener is null");
            return;
        }
        if (!ThreadUtils.checkUIThread()) {
            SudLogger.m222813e(pyg0.f154638a, "loadModel Please call on UI or Main thread");
            LogUtils.file("SudAiModelImpl", "loadModel Please call on UI or Main thread");
            iSudListenerLoadModel.onFailure(-1, "Please call on UI or Main thread");
            return;
        }
        if (!utg0.f180947b.f181601a) {
            LogUtils.file("SudAiModelImpl", "loadModel Please call initSDK first successfully");
            iSudListenerLoadModel.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        nng0 nng0Var = new nng0(str, new mvg0(iSudListenerLoadModel));
        ArrayList arrayList = pyg0.f154639b;
        if (!arrayList.contains(nng0Var)) {
            arrayList.add(nng0Var);
        }
        jjg0 jjg0Var = new jjg0(nng0Var);
        try {
            strOptString = new JSONObject(str).optString("request_id");
        } catch (Exception e) {
            LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            strOptString = null;
        }
        lgg0 lgg0Var = new lgg0(new WeakReference(jjg0Var), strOptString);
        if (!utg0.f180947b.f181601a) {
            lgg0Var.onFailure(-10103, "Please call initSDK first successfully");
            return;
        }
        i0h0 i0h0Var = utg0.f180950e;
        tfg0 tfg0Var = (i0h0Var == null || (gvg0Var = i0h0Var.f112370c) == null) ? null : gvg0Var.f106642m;
        String str3 = tfg0Var != null ? tfg0Var.f173960c : null;
        if (TextUtils.isEmpty(str3)) {
            lgg0Var.onFailure(-1, "model_api_cfg ai_normal url is null");
            return;
        }
        x1d0.C21228a c21228aM209038l = uyg0.m198630e(gxg0.m132863b(UUID.randomUUID().toString()), new bxg0(), null).m209043q(str3).m209038l(z1d0.create(e7y.m119772c("application/json; charset=utf-8"), str));
        tsg0.m192607a(c21228aM209038l);
        tsg0.f175996b.mo181341a(c21228aM209038l.m209028b()).mo135840h(new ulg0(lgg0Var));
    }
}
