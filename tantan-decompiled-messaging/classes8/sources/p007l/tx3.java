package p007l;

import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import l.stc0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public interface tx3 {
    c<AccountEnvelop> execute(stc0 stc0Var);

    default c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        return execute(stc0Var);
    }

    stc0 interceptRequest(stc0 stc0Var) throws IOException;
}
