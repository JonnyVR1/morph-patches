package com.appsflyer.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1vSDK {

    public static final class AFa1ySDK {

        @Nullable
        public final String AFAdRevenueData;
        public final float getMonetizationNetwork;

        public AFa1ySDK(float f, @Nullable String str) {
            this.getMonetizationNetwork = f;
            this.AFAdRevenueData = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AFa1ySDK)) {
                return false;
            }
            AFa1ySDK aFa1ySDK = (AFa1ySDK) obj;
            return Intrinsics.m87488d(Float.valueOf(this.getMonetizationNetwork), Float.valueOf(aFa1ySDK.getMonetizationNetwork)) && Intrinsics.m87488d(this.AFAdRevenueData, aFa1ySDK.AFAdRevenueData);
        }

        public final int hashCode() {
            int iHashCode = Float.hashCode(this.getMonetizationNetwork) * 31;
            String str = this.AFAdRevenueData;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("BatteryData(level=");
            sb.append(this.getMonetizationNetwork);
            sb.append(", charging=");
            sb.append(this.AFAdRevenueData);
            sb.append(')');
            return sb.toString();
        }
    }

    @NotNull
    AFa1ySDK getMonetizationNetwork(@NotNull Context context);
}
