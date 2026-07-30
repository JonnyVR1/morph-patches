package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/SocketProtocol;", "Ljava/io/Serializable;", "()V", "data", "Lcom/hellogroup/mk/fdt/BaseData;", "getData", "()Lcom/hellogroup/mk/fdt/BaseData;", "setData", "(Lcom/hellogroup/mk/fdt/BaseData;)V", "type", "", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class SocketProtocol implements Serializable {

    @SerializedName("data")
    @Expose
    @Nullable
    private BaseData data;

    @SerializedName("type")
    @Expose
    @NotNull
    private String type = "";

    @Nullable
    public final BaseData getData() {
        return this.data;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final void setData(@Nullable BaseData baseData) {
        this.data = baseData;
    }

    public final void setType(@NotNull String str) {
        str.getClass();
        this.type = str;
    }
}
