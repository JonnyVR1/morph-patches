package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes6.dex */
public class AccountTransferException extends ApiException {
    public AccountTransferException(@NonNull Status status) {
        super(status);
    }
}
