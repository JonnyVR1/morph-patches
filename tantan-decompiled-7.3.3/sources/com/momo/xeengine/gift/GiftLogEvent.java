package com.momo.xeengine.gift;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Keep
class GiftLogEvent {
    public static final String EVENT_ID_CHANGE_SOFTWARE = "3";
    public static final String EVENT_ID_ENGINE_START_TIMEOUT = "4";
    public static final String EVENT_ID_PLAY_FAILED = "2";
    public static final String EVENT_ID_PLAY_SUCCESS = "1";
    private final int errorCode;
    private final String eventDesc;
    private final EventEx eventEx;
    private final String eventId;
    private final long eventStamp = System.currentTimeMillis();

    @Keep
    public static class EventEx {
        public Map<String, Long> fileSize;

        /* JADX INFO: renamed from: id */
        public String f15307id;
        public String name;
        public String result;

        /* JADX WARN: Code duplicated, block: B:21:0x005c A[Catch: JSONException -> 0x007b, LOOP:0: B:19:0x0056->B:21:0x005c, LOOP_END, TryCatch #1 {JSONException -> 0x007b, blocks: (B:3:0x0007, B:5:0x000f, B:6:0x0016, B:8:0x001e, B:9:0x0025, B:14:0x003d, B:16:0x0041, B:18:0x0047, B:19:0x0056, B:21:0x005c, B:22:0x0076, B:13:0x0038, B:11:0x002d), top: B:27:0x0007, inners: #0 }] */
        public JSONObject toJsonObject() {
            Map<String, Long> map;
            JSONObject jSONObject;
            JSONObject jSONObject2 = new JSONObject();
            try {
                if (!TextUtils.isEmpty(this.f15307id)) {
                    jSONObject2.put("id", this.f15307id);
                }
                if (!TextUtils.isEmpty(this.name)) {
                    jSONObject2.put(AuthenticationTokenClaims.JSON_KEY_NAME, this.name);
                }
                if (TextUtils.isEmpty(this.result)) {
                    map = this.fileSize;
                    if (map != null) {
                        jSONObject = new JSONObject();
                        for (Map.Entry<String, Long> entry : this.fileSize.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue().longValue());
                        }
                        jSONObject2.put("fileList", jSONObject);
                    }
                } else {
                    try {
                        jSONObject2.put(LovePlanetStage.result, new JSONObject(this.result));
                    } catch (Throwable unused) {
                        jSONObject2.put(LovePlanetStage.result, this.result);
                    }
                    map = this.fileSize;
                    if (map != null && !map.isEmpty()) {
                        jSONObject = new JSONObject();
                        while (r6.hasNext()) {
                            jSONObject.put(entry.getKey(), entry.getValue().longValue());
                        }
                        jSONObject2.put("fileList", jSONObject);
                    }
                }
            } catch (JSONException unused2) {
            }
            return jSONObject2;
        }
    }

    public GiftLogEvent(String str, int i, String str2, EventEx eventEx) {
        this.eventId = str;
        this.errorCode = i;
        this.eventDesc = str2;
        this.eventEx = eventEx;
    }

    private static Map<String, Long> calculateDirectoryFileSize(File file) {
        HashMap map = new HashMap();
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        map.put(file2.getName(), Long.valueOf(file2.length()));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    private static Map<String, Long> calculatePathFileSize(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            return calculateDirectoryFileSize(file);
        }
        if (file.isFile()) {
            return calculateSingleFileSize(file);
        }
        return null;
    }

    private static Map<String, Long> calculateSingleFileSize(File file) {
        HashMap map = new HashMap();
        map.put(file.getName(), Long.valueOf(file.length()));
        return map;
    }

    public static GiftLogEvent createEvent(GiftEntity giftEntity, String str, int i, String str2) {
        EventEx eventEx;
        if (giftEntity != null) {
            eventEx = new EventEx();
            eventEx.f15307id = giftEntity.getId();
            eventEx.name = giftEntity.getName();
        } else {
            eventEx = null;
        }
        return new GiftLogEvent(str, i, str2, eventEx);
    }

    private static EventEx createEventEx(GiftEntity giftEntity) {
        if (giftEntity == null) {
            return null;
        }
        EventEx eventEx = new EventEx();
        eventEx.f15307id = giftEntity.getId();
        eventEx.name = giftEntity.getName();
        eventEx.fileSize = calculatePathFileSize(giftEntity.getPath());
        return eventEx;
    }

    public static GiftLogEvent createPlayFailedEvent(GiftEntity giftEntity, int i, String str) {
        return new GiftLogEvent("2", i, str, createEventEx(giftEntity));
    }

    public static GiftLogEvent createPlaySuccessEvent(GiftEntity giftEntity, String str) {
        EventEx eventEx;
        if (giftEntity != null) {
            eventEx = new EventEx();
            eventEx.f15307id = giftEntity.getId();
            eventEx.name = giftEntity.getName();
            eventEx.result = str;
        } else {
            eventEx = null;
        }
        return new GiftLogEvent("1", 0, giftEntity.getId(), eventEx);
    }

    public String getEventId() {
        return this.eventId;
    }

    public JSONObject toJSONObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("eventId", this.eventId);
            jSONObject.put("errorCode", this.errorCode);
            if (!TextUtils.isEmpty(this.eventDesc)) {
                jSONObject.put("eventDesc", this.eventDesc);
            }
            jSONObject.put("eventStamp", this.eventStamp);
            EventEx eventEx = this.eventEx;
            if (eventEx != null) {
                jSONObject.put("eventExtend", eventEx.toJsonObject().toString());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
