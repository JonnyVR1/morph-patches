package tech.sud.gip.asr.base.model;

import android.content.Context;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import tech.sud.gip.core.ISudFSTAPP;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class InitASRParamModel {
    public Context context;
    public WeakReference<ISudFSTAPP> iSudFSTAPP;
    public long mgId;
    public String roomId;
    public JSONArray supportNumberLanguageList;
    public JSONArray supportTextLanguageList;
    public String userId;
}
