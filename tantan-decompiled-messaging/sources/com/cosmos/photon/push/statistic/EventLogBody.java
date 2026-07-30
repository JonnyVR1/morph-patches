package com.cosmos.photon.push.statistic;

import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.p046p1.mobile.putong.core.data.Reason;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class EventLogBody {
    public static int TYPE_ARRIVED = 1;
    public static int TYPE_ARRIVED_NOT_SHOWN = 4;
    public static int TYPE_CLICKED = 3;
    public static int TYPE_FORGROUND_NOT_SHOWN = 5;
    public static int TYPE_SHOWN = 2;
    public String alias;
    public boolean clickFromBusiness;
    private JSONObject data;
    private String pushSource;
    private int reason;
    private long time;
    private int type;
    public int uploadType;

    private EventLogBody(Builder builder) {
        this.pushSource = builder.pushSource;
        this.time = builder.time;
        this.type = builder.type;
        this.reason = builder.reason;
        this.data = builder.data;
        this.uploadType = builder.uploadType;
        this.alias = builder.alias;
        this.clickFromBusiness = builder.clickFromBusiness;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("push_source", this.pushSource);
            jSONObject.put("time", this.time);
            jSONObject.put("type", this.type);
            jSONObject.put(Reason.TYPE, this.reason);
            if (!TextUtils.isEmpty(this.alias)) {
                jSONObject.put("lc_alias", this.alias);
            }
            jSONObject.put("data", this.data);
            jSONObject.put("cfb", this.clickFromBusiness);
        } catch (JSONException e) {
            MDLog.printErrStackTrace(LogTag.COMMON, e);
        }
        return jSONObject.toString();
    }

    public static final class Builder {
        private String alias;
        private boolean clickFromBusiness;
        private JSONObject data;
        private String pushSource;
        private int reason;
        private long time;
        private int type;
        private int uploadType;

        public Builder alias(String str) {
            this.alias = str;
            return this;
        }

        public EventLogBody build() {
            return new EventLogBody(this);
        }

        public Builder clickFromBusiness(boolean z) {
            this.clickFromBusiness = z;
            return this;
        }

        public Builder data(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            try {
                this.data = new JSONObject(str);
                return this;
            } catch (Exception e) {
                MDLog.printErrStackTrace(LogTag.STATISTIC, e);
                return this;
            }
        }

        public Builder pushSource(String str) {
            this.pushSource = str;
            return this;
        }

        public Builder reason(int i) {
            this.reason = i;
            return this;
        }

        public Builder time(long j) {
            this.time = j;
            return this;
        }

        public Builder type(int i) {
            this.type = i;
            return this;
        }

        public Builder uploadType(int i) {
            this.uploadType = i;
            return this;
        }

        public Builder data(Map<String, String> map) {
            if (map == null) {
                return this;
            }
            this.data = new JSONObject(map);
            return this;
        }

        public Builder data(JSONObject jSONObject) {
            this.data = jSONObject;
            return this;
        }
    }
}
