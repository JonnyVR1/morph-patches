package com.hellogroup.p036mk.fdt;

import androidx.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, m88121d2 = {"Lcom/hellogroup/mk/fdt/LogData;", "Lcom/hellogroup/mk/fdt/BaseData;", "()V", "logMsg", "", "getLogMsg", "()Ljava/lang/String;", "setLogMsg", "(Ljava/lang/String;)V", "source", "getSource", "setSource", "MKFDT_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class LogData extends BaseData {

    @SerializedName("log_msg")
    @Expose
    @Nullable
    private String logMsg;

    @SerializedName("source")
    @Expose
    @Nullable
    private String source;

    @Nullable
    public final String getLogMsg() {
        return this.logMsg;
    }

    @Nullable
    public final String getSource() {
        return this.source;
    }

    public final void setLogMsg(@Nullable String str) {
        this.logMsg = str;
    }

    public final void setSource(@Nullable String str) {
        this.source = str;
    }
}
