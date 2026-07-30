package com.p046p1.mobile.account_core.network;

import com.google.gson.Gson;
import com.p046p1.mobile.account_core.exception.AccountException;
import com.p046p1.mobile.account_core.exception.TooManyRequests;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Meta;
import java.io.IOException;
import p149l.exc0;
import p149l.gxc0;

/* JADX INFO: loaded from: classes8.dex */
class ExceptionChecker {
    public static Exception check(exc0 exc0Var) {
        Meta meta;
        int iM118609q = exc0Var.m118609q();
        if (iM118609q / 100 == 2) {
            return null;
        }
        if (iM118609q == 429) {
            String strM118611u = exc0Var.m118611u("X-RateLimit-Reset");
            return strM118611u != null ? new TooManyRequests(exc0Var, Math.min(Integer.parseInt(strM118611u), 10)) : new TooManyRequests(exc0Var, 5);
        }
        gxc0 gxc0VarM118606k = exc0Var.m118606k();
        try {
            try {
                AccountEnvelop accountEnvelop = (AccountEnvelop) new Gson().fromJson(gxc0VarM118606k.string(), AccountEnvelop.class);
                if (accountEnvelop != null && (meta = accountEnvelop.meta) != null) {
                    return new AccountException(meta);
                }
            } catch (IOException unused) {
                gxc0VarM118606k.close();
            }
        } catch (Exception unused2) {
        }
        return new Exception("code: " + iM118609q);
    }
}
