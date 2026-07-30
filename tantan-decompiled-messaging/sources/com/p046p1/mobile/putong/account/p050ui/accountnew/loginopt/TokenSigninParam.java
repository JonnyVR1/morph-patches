package com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt;

import com.p046p1.mobile.account_core.request_data.RequestData;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"Lcom/p1/mobile/putong/account/ui/accountnew/loginopt/TokenSigninParam;", "Lcom/p1/mobile/account_core/request_data/RequestData;", "tttToken", "", "<init>", "(Ljava/lang/String;)V", "getTttToken", "()Ljava/lang/String;", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class TokenSigninParam extends RequestData {

    @NotNull
    private final String tttToken;

    public TokenSigninParam(@NotNull String str) {
        str.getClass();
        this.tttToken = str;
    }

    @NotNull
    public final String getTttToken() {
        return this.tttToken;
    }
}
