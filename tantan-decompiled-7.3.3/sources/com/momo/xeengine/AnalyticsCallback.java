package com.momo.xeengine;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public interface AnalyticsCallback {

    public static class Params {

        /* JADX INFO: renamed from: ex */
        String f15282ex;
        String name;
        int type;
        long value;

        public Params(int i, String str, long j, String str2) {
            this.type = i;
            this.name = str;
            this.value = j;
            this.f15282ex = str2;
        }

        public String getEx() {
            return this.f15282ex;
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
            return "Params{type=" + this.type + ", name='" + this.name + "', value=" + this.value + ", ex='" + this.f15282ex + "'}";
        }
    }

    void upload(@NotNull Params params);
}
