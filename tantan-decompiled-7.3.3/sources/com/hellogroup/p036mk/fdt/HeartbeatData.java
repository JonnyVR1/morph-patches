package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.p051p1.mobile.putong.data.Device;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR>\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u0001`\r8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/HeartbeatData;", "Lcom/hellogroup/mk/fdt/BaseData;", "()V", Device.TYPE, "Lcom/hellogroup/mk/fdt/DeviceData;", "getDevice", "()Lcom/hellogroup/mk/fdt/DeviceData;", "setDevice", "(Lcom/hellogroup/mk/fdt/DeviceData;)V", "pages", "Ljava/util/LinkedHashMap;", "", "Lcom/hellogroup/mk/fdt/PageData;", "Lkotlin/collections/LinkedHashMap;", "getPages", "()Ljava/util/LinkedHashMap;", "setPages", "(Ljava/util/LinkedHashMap;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class HeartbeatData extends BaseData {

    @SerializedName(Device.TYPE)
    @Expose
    @Nullable
    private DeviceData device;

    @SerializedName("pages")
    @Expose
    @Nullable
    private LinkedHashMap<String, PageData> pages;

    @Nullable
    public final DeviceData getDevice() {
        return this.device;
    }

    @Nullable
    public final LinkedHashMap<String, PageData> getPages() {
        return this.pages;
    }

    public final void setDevice(@Nullable DeviceData deviceData) {
        this.device = deviceData;
    }

    public final void setPages(@Nullable LinkedHashMap<String, PageData> linkedHashMap) {
        this.pages = linkedHashMap;
    }
}
