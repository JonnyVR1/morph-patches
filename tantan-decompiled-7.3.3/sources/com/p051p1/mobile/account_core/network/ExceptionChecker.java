package com.p051p1.mobile.account_core.network;

import com.google.gson.Gson;
import com.p051p1.mobile.account_core.exception.AccountException;
import com.p051p1.mobile.account_core.exception.TooManyRequests;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Meta;
import java.io.IOException;
import p153l.i5d0;
import p153l.k5d0;

/* JADX INFO: loaded from: classes8.dex */
class ExceptionChecker {
    public static Exception check(i5d0 i5d0Var) {
        Meta meta;
        int iM138673q = i5d0Var.m138673q();
        if (iM138673q / 100 == 2) {
            return null;
        }
        if (iM138673q == 429) {
            String strM138675u = i5d0Var.m138675u("X-RateLimit-Reset");
            return strM138675u != null ? new TooManyRequests(i5d0Var, Math.min(Integer.parseInt(strM138675u), 10)) : new TooManyRequests(i5d0Var, 5);
        }
        k5d0 k5d0VarM138670k = i5d0Var.m138670k();
        try {
            try {
                AccountEnvelop accountEnvelop = (AccountEnvelop) new Gson().fromJson(k5d0VarM138670k.string(), AccountEnvelop.class);
                if (accountEnvelop != null && (meta = accountEnvelop.meta) != null) {
                    return new AccountException(meta);
                }
            } catch (IOException unused) {
                k5d0VarM138670k.close();
            }
        } catch (Exception unused2) {
        }
        return new Exception("code: " + iM138673q);
    }
}
