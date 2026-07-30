package com.p041mm.mediasdk.bridge;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.cosmos.mdlog.MDLog;
import com.momo.xeengine.script.ScriptBridge;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.mow;
import p149l.qcr;

/* JADX INFO: loaded from: classes7.dex */
public class EngineCommonBridge {

    /* JADX INFO: renamed from: a */
    private final String f14226a = "FileUri";

    /* JADX INFO: renamed from: b */
    private final String f14227b = "ImageSize";

    /* JADX INFO: renamed from: c */
    private final String f14228c = "Landmarks104";

    /* JADX INFO: renamed from: d */
    private final String f14229d = "FaceRect";

    /* JADX INFO: renamed from: e */
    private final String f14230e = "CVSingleFrameProcessBridge";

    /* JADX INFO: renamed from: f */
    private qcr f14231f;

    public EngineCommonBridge(qcr qcrVar) {
        this.f14231f = qcrVar;
        if (qcrVar != null) {
            qcrVar.m173908b0(this, "CVSingleFrameProcessBridge");
        }
    }

    /* JADX INFO: renamed from: a */
    private String m19626a(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            MDLog.m7391e("EngineCommonBridge", "image path is empty or not exist!!");
            return str;
        }
        String[] strArrSplit = str.split(File.separator);
        if (strArrSplit.length <= 1) {
            MDLog.m7391e("EngineCommonBridge", String.format("image path is illegal:", str));
            return str;
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        qcr qcrVar = this.f14231f;
        if (qcrVar != null) {
            qcrVar.m173906Z(str.replace(str2, ""));
        }
        return str2;
    }

    @Keep
    public String ProcessFaceEntity(String str, ScriptBridge.Callback callback) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            m19626a((String) new JSONObject(str).get("FileUri"));
            mow.m155709j().m155712b();
            return str;
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m19627b() {
        qcr qcrVar = this.f14231f;
        if (qcrVar != null) {
            qcrVar.mo102038f();
            this.f14231f = null;
        }
    }
}
