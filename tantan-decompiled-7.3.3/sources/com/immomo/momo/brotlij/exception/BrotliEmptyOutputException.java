package com.immomo.momo.brotlij.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"Lcom/immomo/momo/brotlij/exception/BrotliEmptyOutputException;", "Lcom/immomo/momo/brotlij/exception/BrotliException;", "msg", "", "(Ljava/lang/String;)V", "brotlij_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class BrotliEmptyOutputException extends BrotliException {
    public BrotliEmptyOutputException(@Nullable String str) {
        super("depress failed! output is empty...msg:" + str, null);
    }

    public /* synthetic */ BrotliEmptyOutputException(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrotliEmptyOutputException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
