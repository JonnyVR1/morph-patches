package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class y8e implements ApiCallBack {
    @Override // com.tantanapp.common.network.ApiCallBack
    public x1d0 beforeCall(x1d0 x1d0Var) throws Exception {
        return hl20.m135655b(x1d0Var, NetworkTrackInfo.ReportType.API);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    @NonNull
    public k5d0 decodeResponse(@NonNull i5d0 i5d0Var) {
        return f1f.m123565h(i5d0Var);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void requestCancel(x1d0 x1d0Var) {
        hl20.m135657d(x1d0Var);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenApiError(x1d0 x1d0Var, Throwable th) {
        hl20.m135654a(x1d0Var, th);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenApiFinish(x1d0 x1d0Var) {
        hl20.m135656c(x1d0Var, kl20.m150342b());
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public Exception whenResponseCheckError(ApiExcep apiExcep) {
        return uqb0.f180376H.boxException(apiExcep);
    }

    @Override // com.tantanapp.common.network.ApiCallBack
    public void whenGetResponse(x1d0 x1d0Var, i5d0 i5d0Var) {
    }
}
