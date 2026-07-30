package com.clevertap.android.sdk.inapp.customtemplates;

import com.meituan.robust.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/TemplateArgumentType;", "", "", "stringName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "STRING", "BOOLEAN", "NUMBER", "FILE", "ACTION", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum TemplateArgumentType {
    STRING("string"),
    BOOLEAN(Constants.BOOLEAN),
    NUMBER("number"),
    FILE("file"),
    ACTION("action");


    @NotNull
    private final String stringName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    TemplateArgumentType(String str) {
        this.stringName = str;
    }

    @NotNull
    public static EnumEntries<TemplateArgumentType> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.stringName;
    }
}
