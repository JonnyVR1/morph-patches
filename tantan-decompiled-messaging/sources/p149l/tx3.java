package p149l;

import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes8.dex */
public interface tx3 {
    C22306c<AccountEnvelop> execute(stc0 stc0Var);

    default C22306c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        return execute(stc0Var);
    }

    stc0 interceptRequest(stc0 stc0Var) throws IOException;
}
