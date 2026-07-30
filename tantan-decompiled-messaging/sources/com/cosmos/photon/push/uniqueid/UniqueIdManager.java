package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.ThreadUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class UniqueIdManager {
    private static final String TAG = "UniqueIdManager";
    private JSONObject cachedIds;
    private boolean isDebug;
    private String pushIdCached;
    private UniqueCache uniqueCache;
    private List<IUniqueId> uniqueIds;
    private JSONObject uniqueObject;

    public static class UniqueIdManagerHolder {
        static UniqueIdManager uniqueIdManager = new UniqueIdManager();
    }

    private UniqueIdManager() {
        ArrayList arrayList = new ArrayList();
        this.uniqueIds = arrayList;
        arrayList.add(new UniqueMacAddress());
        this.uniqueIds.add(new UniqueDeviceId());
        this.uniqueIds.add(new UniqueIMEI());
        this.uniqueIds.add(new UniqueSerialNumber());
        this.uniqueIds.add(new UniqueAndroidId());
    }

    public static UniqueIdManager getInstance() {
        return UniqueIdManagerHolder.uniqueIdManager;
    }

    private JSONObject seekUniqueId(final Context context) {
        JSONObject jSONObject = new JSONObject();
        for (IUniqueId iUniqueId : this.uniqueIds) {
            try {
                if (this.cachedIds == null) {
                    this.cachedIds = new JSONObject();
                }
                if (TextUtils.isEmpty(this.cachedIds.optString(iUniqueId.getTag()))) {
                    String uniqueId = iUniqueId.getUniqueId(context);
                    if (!TextUtils.isEmpty(uniqueId)) {
                        jSONObject.put(iUniqueId.getTag(), uniqueId);
                        this.cachedIds.put(iUniqueId.getTag(), uniqueId);
                    }
                } else {
                    jSONObject.put(iUniqueId.getTag(), iUniqueId.getUniqueId(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        ThreadUtils.execute(new Runnable() { // from class: com.cosmos.photon.push.uniqueid.UniqueIdManager.1
            @Override // java.lang.Runnable
            public void run() throws Throwable {
                UniqueIdManager.this.uniqueCache.saveUnique(context, UniqueIdManager.this.cachedIds, UniqueAndroidId.IDTAG);
            }
        });
        return jSONObject;
    }

    public String getPushID() {
        if (this.isDebug) {
            MDLog.m7397v("uniq_did", this.pushIdCached);
        }
        return this.pushIdCached;
    }

    public JSONObject getUniqueId() {
        if (this.isDebug) {
            MDLog.m7397v("aIds", this.uniqueObject.toString());
        }
        return this.uniqueObject;
    }

    public void init(Context context, String str) {
        if (this.uniqueObject == null) {
            this.isDebug = (context.getApplicationInfo().flags & 2) != 0;
            this.uniqueCache = new UniqueCache();
            this.pushIdCached = new UniquePushId().getPushId(context, str);
            this.cachedIds = this.uniqueCache.getCacheUniqueId(context);
            this.uniqueObject = seekUniqueId(context);
        }
    }
}
