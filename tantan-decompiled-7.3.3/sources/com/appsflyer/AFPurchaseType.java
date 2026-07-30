package com.appsflyer;

import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, m88121d2 = {"Lcom/appsflyer/AFPurchaseType;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "value", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "SUBSCRIPTION", "ONE_TIME_PURCHASE"}, m88122k = 1, m88123mv = {1, 6, 0}, m88125xi = 48)
public enum AFPurchaseType {
    SUBSCRIPTION("subscription"),
    ONE_TIME_PURCHASE("one_time_purchase");


    @NotNull
    private final String value;

    AFPurchaseType(String str) {
        this.value = str;
    }

    @JvmName
    @NotNull
    public final String getValue() {
        return this.value;
    }
}
