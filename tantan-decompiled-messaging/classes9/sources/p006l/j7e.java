package p006l;

import androidx.annotation.NonNull;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetworkTrackInfo;
import l.exc0;
import l.gxc0;
import l.stc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class j7e implements ApiCallBack {
    public stc0 beforeCall(stc0 stc0Var) throws Exception {
        return xc20.m27194b(stc0Var, NetworkTrackInfo.ReportType.API);
    }

    @NonNull
    public gxc0 decodeResponse(@NonNull exc0 exc0Var) {
        return b0f.m12420h(exc0Var);
    }

    public void requestCancel(stc0 stc0Var) {
        xc20.m27196d(stc0Var);
    }

    public void whenApiError(stc0 stc0Var, Throwable th) {
        xc20.m27193a(stc0Var, th);
    }

    public void whenApiFinish(stc0 stc0Var) {
        xc20.m27195c(stc0Var, ad20.m11809b());
    }

    public Exception whenResponseCheckError(ApiExcep apiExcep) {
        return qib0.f19784H.boxException(apiExcep);
    }

    public void whenGetResponse(stc0 stc0Var, exc0 exc0Var) {
    }
}
