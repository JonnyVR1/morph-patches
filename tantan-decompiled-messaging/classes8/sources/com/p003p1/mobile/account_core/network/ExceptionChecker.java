package com.p003p1.mobile.account_core.network;

import com.google.gson.Gson;
import com.p003p1.mobile.account_core.exception.AccountException;
import com.p003p1.mobile.account_core.exception.TooManyRequests;
import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p003p1.mobile.account_core.reponse_data.Meta;
import java.io.IOException;
import l.exc0;
import l.gxc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
class ExceptionChecker {
    public static Exception check(exc0 exc0Var) {
        Meta meta;
        int iQ = exc0Var.q();
        if (iQ / 100 == 2) {
            return null;
        }
        if (iQ == 429) {
            String strU = exc0Var.u("X-RateLimit-Reset");
            return strU != null ? new TooManyRequests(exc0Var, Math.min(Integer.parseInt(strU), 10)) : new TooManyRequests(exc0Var, 5);
        }
        gxc0 gxc0VarK = exc0Var.k();
        try {
            try {
                AccountEnvelop accountEnvelop = (AccountEnvelop) new Gson().fromJson(gxc0VarK.string(), AccountEnvelop.class);
                if (accountEnvelop != null && (meta = accountEnvelop.meta) != null) {
                    return new AccountException(meta);
                }
            } catch (IOException unused) {
                gxc0VarK.close();
            }
        } catch (Exception unused2) {
        }
        return new Exception("code: " + iQ);
    }
}
