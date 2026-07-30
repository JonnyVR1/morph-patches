package com.clevertap.android.sdk.inapp.customtemplates;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateType;", "", "", "stringName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "TEMPLATE", "FUNCTION", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public enum CustomTemplateType {
    TEMPLATE("template"),
    FUNCTION("function");


    @NotNull
    private final String stringName;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m88274a(values());

    CustomTemplateType(String str) {
        this.stringName = str;
    }

    @NotNull
    public static EnumEntries<CustomTemplateType> getEntries() {
        return $ENTRIES;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.stringName;
    }
}
