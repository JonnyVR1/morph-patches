package com.bytedance.bpea.basics;

import com.clevertap.android.sdk.Constants;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\f2\b\u0010\"\u001a\u0004\u0018\u00010\fJ\u0010\u0010#\u001a\u0004\u0018\u00010\u00012\u0006\u0010!\u001a\u00020\fJ\b\u0010$\u001a\u00020\fH\u0016R\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006%"}, m88121d2 = {"Lcom/bytedance/bpea/basics/CertContext;", "", "()V", "entryCategory", "", "getEntryCategory", "()Ljava/lang/Integer;", "setEntryCategory", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "entryDataTypes", "", "", "getEntryDataTypes", "()[Ljava/lang/String;", "setEntryDataTypes", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "entryExtraInfo", "", "entryToken", "getEntryToken", "()Ljava/lang/String;", "setEntryToken", "(Ljava/lang/String;)V", "timeAnchor", "Lcom/bytedance/bpea/basics/TimeAnchor;", "getTimeAnchor", "()Lcom/bytedance/bpea/basics/TimeAnchor;", "setTimeAnchor", "(Lcom/bytedance/bpea/basics/TimeAnchor;)V", "addExtraInfo", "", Constants.KEY_KEY, "value", "getExtraInfo", "toString", "basics_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class CertContext {

    @Nullable
    private Integer entryCategory;

    @Nullable
    private String[] entryDataTypes;

    @Nullable
    private String entryToken;

    @NotNull
    private TimeAnchor timeAnchor = new TimeAnchor();
    private final Map<String, Object> entryExtraInfo = new LinkedHashMap();

    public final void addExtraInfo(@NotNull String key, @Nullable String value) {
        key.getClass();
        this.entryExtraInfo.put(key, value);
    }

    @Nullable
    public final Integer getEntryCategory() {
        return this.entryCategory;
    }

    @Nullable
    public final String[] getEntryDataTypes() {
        return this.entryDataTypes;
    }

    @Nullable
    public final String getEntryToken() {
        return this.entryToken;
    }

    @Nullable
    public final Object getExtraInfo(@NotNull String key) {
        key.getClass();
        return this.entryExtraInfo.get(key);
    }

    @NotNull
    public final TimeAnchor getTimeAnchor() {
        return this.timeAnchor;
    }

    public final void setEntryCategory(@Nullable Integer num) {
        this.entryCategory = num;
    }

    public final void setEntryDataTypes(@Nullable String[] strArr) {
        this.entryDataTypes = strArr;
    }

    public final void setEntryToken(@Nullable String str) {
        this.entryToken = str;
    }

    public final void setTimeAnchor(@NotNull TimeAnchor timeAnchor) {
        timeAnchor.getClass();
        this.timeAnchor = timeAnchor;
    }

    @NotNull
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("[entryToken:");
        sb.append(this.entryToken);
        sb.append(";entryDataTypes:");
        String[] strArr = this.entryDataTypes;
        if (strArr != null) {
            string = Arrays.toString(strArr);
            string.getClass();
        } else {
            string = null;
        }
        sb.append(string);
        sb.append(";entryCategory:");
        sb.append(this.entryCategory);
        sb.append(";entryExtraInfo:");
        sb.append(this.entryExtraInfo);
        sb.append(']');
        return sb.toString();
    }
}
