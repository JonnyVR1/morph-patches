package com.hellogroup.p036mk.core.log.core;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEBUG", "INFO", "WARNING", "ERROR", "MKCore_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public enum MKLogLevel {
    DEBUG(0),
    INFO(1),
    WARNING(2),
    ERROR(3);

    private final int value;

    MKLogLevel(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
