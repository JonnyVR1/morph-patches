package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class j7e implements ApiCallBack {
    @Override // com.tantanapp.common.network.ApiCallBack
    public stc0 beforeCall(stc0 stc0Var) throws Exception {
        return xc20.m208061b(stc0Var, NetworkTrackInfo.ReportType.API);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    @NonNull
    public gxc0 decodeResponse(@NonNull exc0 exc0Var) {
        return b0f.m99758h(exc0Var);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void requestCancel(stc0 stc0Var) {
        xc20.m208063d(stc0Var);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenApiError(stc0 stc0Var, Throwable th) {
        xc20.m208060a(stc0Var, th);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenApiFinish(stc0 stc0Var) {
        xc20.m208062c(stc0Var, ad20.m95853b());
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public Exception whenResponseCheckError(ApiExcep apiExcep) {
        return qib0.f154693H.boxException(apiExcep);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenGetResponse(stc0 stc0Var, exc0 exc0Var) {
    }
}
