package com.p074ss.bytertc.engine.data;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class EngineConfig {
    private static final String TAG = "EngineConfig";
    public String appID;
    public Context context = null;
    public Object eglContext = null;
    public String nativeLoadPath = null;
    public JSONObject parameters = null;
    public boolean isGameScene = false;
}
