package com.momo.xeengine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public interface AnalyticsCallback {

    public static class Params {

        /* JADX INFO: renamed from: ex */
        String f262ex;
        String name;
        int type;
        long value;

        public Params(int i, String str, long j, String str2) {
            this.type = i;
            this.name = str;
            this.value = j;
            this.f262ex = str2;
        }

        public String getEx() {
            return this.f262ex;
        }

        public String getName() {
            return this.name;
        }

        public int getType() {
            return this.type;
        }

        public long getValue() {
            return this.value;
        }

        public String toString() {
            return "Params{type=" + this.type + ", name='" + this.name + "', value=" + this.value + ", ex='" + this.f262ex + "'}";
        }
    }

    void upload(@NotNull Params params);
}
