package com.bytedance.bpea.basics;

import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001J\u001c\u0010\u0013\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001a"}, m87232d2 = {"Lcom/bytedance/bpea/basics/CheckResult;", "", "code", "", "msg", "", "(ILjava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "extraMap", "", "getExtraMap", "()Ljava/util/Map;", "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "putExtraInfo", "", Constants.KEY_KEY, "value", "map", "", "toString", "basics_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class CheckResult {
    private int code;

    @NotNull
    private final Map<String, Object> extraMap;

    @NotNull
    private String msg;

    public CheckResult(int i, @NotNull String str) {
        str.getClass();
        this.code = i;
        this.msg = str;
        this.extraMap = new LinkedHashMap();
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Map<String, Object> getExtraMap() {
        return this.extraMap;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public final void putExtraInfo(@NotNull String key, @Nullable Object value) {
        key.getClass();
        this.extraMap.put(key, value);
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMsg(@NotNull String str) {
        str.getClass();
        this.msg = str;
    }

    @NotNull
    public String toString() {
        return "CheckResult(code=" + this.code + ", msg='" + this.msg + "', extraMap=" + this.extraMap + ')';
    }

    public final void putExtraInfo(@NotNull Map<String, ? extends Object> map) {
        map.getClass();
        this.extraMap.putAll(map);
    }
}
