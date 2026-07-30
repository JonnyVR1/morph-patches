package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/RemoveDeviceData;", "Lcom/hellogroup/mk/fdt/BaseData;", "()V", "deviceID", "", "getDeviceID", "()Ljava/lang/String;", "setDeviceID", "(Ljava/lang/String;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class RemoveDeviceData extends BaseData {

    @SerializedName("deviceID")
    @Expose
    @Nullable
    private String deviceID;

    @Nullable
    public final String getDeviceID() {
        return this.deviceID;
    }

    public final void setDeviceID(@Nullable String str) {
        this.deviceID = str;
    }
}
