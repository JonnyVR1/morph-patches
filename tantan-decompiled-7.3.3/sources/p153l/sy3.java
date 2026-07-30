package p153l;

import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes8.dex */
public interface sy3 {
    C22421c<AccountEnvelop> execute(x1d0 x1d0Var);

    default C22421c<AccountEnvelop> executeWithTimeout(x1d0 x1d0Var, long j) {
        return execute(x1d0Var);
    }

    x1d0 interceptRequest(x1d0 x1d0Var) throws IOException;
}
