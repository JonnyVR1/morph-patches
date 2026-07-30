package com.immomo.momo.brotlij.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m88121d2 = {"Lcom/immomo/momo/brotlij/exception/BrotliEmptyInputException;", "Lcom/immomo/momo/brotlij/exception/BrotliException;", "()V", "brotlij_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class BrotliEmptyInputException extends BrotliException {
    public BrotliEmptyInputException() {
        super("input is empty", null);
    }
}
