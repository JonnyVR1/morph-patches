package com.p046mm.mediasdk.bridge;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.cosmos.mdlog.MDLog;
import com.momo.xeengine.script.ScriptBridge;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.lrw;
import p153l.rer;

/* JADX INFO: loaded from: classes6.dex */
public class EngineCommonBridge {

    /* JADX INFO: renamed from: a */
    private final String f14945a = "FileUri";

    /* JADX INFO: renamed from: b */
    private final String f14946b = "ImageSize";

    /* JADX INFO: renamed from: c */
    private final String f14947c = "Landmarks104";

    /* JADX INFO: renamed from: d */
    private final String f14948d = "FaceRect";

    /* JADX INFO: renamed from: e */
    private final String f14949e = "CVSingleFrameProcessBridge";

    /* JADX INFO: renamed from: f */
    private rer f14950f;

    public EngineCommonBridge(rer rerVar) {
        this.f14950f = rerVar;
        if (rerVar != null) {
            rerVar.m181047b0(this, "CVSingleFrameProcessBridge");
        }
    }

    /* JADX INFO: renamed from: a */
    private String m20625a(String str) {
        if (TextUtils.isEmpty(str) || !new File(str).exists()) {
            MDLog.m7445e("EngineCommonBridge", "image path is empty or not exist!!");
            return str;
        }
        String[] strArrSplit = str.split(File.separator);
        if (strArrSplit.length <= 1) {
            MDLog.m7445e("EngineCommonBridge", String.format("image path is illegal:", str));
            return str;
        }
        String str2 = strArrSplit[strArrSplit.length - 1];
        rer rerVar = this.f14950f;
        if (rerVar != null) {
            rerVar.m181045Z(str.replace(str2, ""));
        }
        return str2;
    }

    @Keep
    public String ProcessFaceEntity(String str, ScriptBridge.Callback callback) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            m20625a((String) new JSONObject(str).get("FileUri"));
            lrw.m155653j().m155656b();
            return str;
        } catch (JSONException e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m20626b() {
        rer rerVar = this.f14950f;
        if (rerVar != null) {
            rerVar.mo96080f();
            this.f14950f = null;
        }
    }
}
