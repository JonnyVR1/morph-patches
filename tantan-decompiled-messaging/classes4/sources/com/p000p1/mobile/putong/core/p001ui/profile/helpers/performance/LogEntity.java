package com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance;

import com.google.gson.annotations.SerializedName;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.LogName;
import java.io.Serializable;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LogEntity<T extends LogName> implements Serializable {

    @SerializedName("bindHash")
    public int bindHash;

    @SerializedName("logDescription")
    public String logDescription;

    @SerializedName("logName")
    public T logName;

    @SerializedName("logTime")
    public long logTime;

    @SerializedName("traceHash")
    public int traceHash;

    @SerializedName("type")
    public LogType type;

    public static abstract class Builder<T extends LogName, K extends LogEntity<T>> {
        T logName;
        int tranceHash;
        LogType type;
        int bindHash = -1;
        long logTime = System.currentTimeMillis();
        String logDescription = "";

        public Builder<T, K> bindHash(int i) {
            this.bindHash = i;
            return this;
        }

        public K build() {
            if (this.logName == null || this.type == null) {
                qkq0.a("check you log!!!");
                return null;
            }
            K k = (K) newInstance();
            k.bindHash = this.bindHash;
            k.type = this.type;
            k.logName = this.logName;
            k.logDescription = this.logDescription;
            k.logTime = this.logTime;
            k.traceHash = this.tranceHash;
            return k;
        }

        public Builder<T, K> logDescription(String str) {
            this.logDescription = str;
            return this;
        }

        public Builder<T, K> logName(T t) {
            this.logName = t;
            return this;
        }

        public Builder<T, K> logTime(long j) {
            this.logTime = j;
            return this;
        }

        public abstract K newInstance();

        public Builder<T, K> tranceHash(int i) {
            this.tranceHash = i;
            return this;
        }

        public Builder<T, K> type(LogType logType) {
            this.type = logType;
            return this;
        }
    }

    public enum LogType {
        BEGIN,
        END,
        SINGLE
    }

    public static <T extends LogName> Builder<T, LogEntity<T>> builder() {
        return (Builder<T, LogEntity<T>>) new Builder<T, LogEntity<T>>() { // from class: com.p1.mobile.putong.core.ui.profile.helpers.performance.LogEntity.1
            @Override // com.p1.mobile.putong.core.ui.profile.helpers.performance.LogEntity.Builder
            public LogEntity<T> newInstance() {
                return new LogEntity<>();
            }
        };
    }

    public long durationTime(long j) {
        return this.logTime - j;
    }

    public String toString() {
        return "LOG{traceHash=" + this.traceHash + ", bindHash=" + this.bindHash + ", logTime=" + this.logTime + ", logName=" + this.logName + ", type=" + this.type + ", logDescription='" + this.logDescription + "'}";
    }
}
