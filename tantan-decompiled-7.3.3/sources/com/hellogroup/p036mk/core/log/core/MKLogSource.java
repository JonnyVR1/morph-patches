package com.hellogroup.p036mk.core.log.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.nbr;
import p153l.qkw;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/core/MKLogSource;", "", "value", "", "(Ljava/lang/String;II)V", "stringValue", "", "getStringValue", "()Ljava/lang/String;", "getValue", "()I", "NATIVE", "JS", "MWC", "MKCore_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public enum MKLogSource {
    NATIVE(0),
    JS(1),
    MWC(2);

    private final int value;

    MKLogSource(int i) {
        this.value = i;
    }

    @NotNull
    public final String getStringValue() {
        int i = qkw.f158180a[ordinal()];
        if (i == 1) {
            return "native";
        }
        if (i == 2) {
            return "js";
        }
        if (i == 3) {
            return "mwc";
        }
        nbr.m162172a();
        return null;
    }

    public final int getValue() {
        return this.value;
    }
}
