package com.p003p1.mobile.account_core.exception;

import com.p003p1.mobile.account_core.reponse_data.Meta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class AccountException extends RuntimeException {
    public Meta meta;

    public AccountException(Meta meta) {
        this.meta = meta;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Meta meta = this.meta;
        return meta != null ? meta.message : super.getMessage();
    }
}
