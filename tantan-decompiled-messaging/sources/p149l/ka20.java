package p149l;

import androidx.annotation.NonNull;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReqObs;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class ka20<T> extends NetReqObs<T> {

    /* JADX INFO: renamed from: l.ka20$a */
    public static class C17965a implements ApiCallBack {
        @Override // com.tantanapp.common.network.ApiCallBack
        public stc0 beforeCall(stc0 stc0Var) throws Exception {
            return xc20.m208061b(qib0.f154693H.maybeUpdateRequestBeforeCall(stc0Var), NetworkTrackInfo.ReportType.API);
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
        public void whenGetResponse(stc0 stc0Var, exc0 exc0Var) {
            qib0.f154693H.updateServerTime(exc0Var.m118611u("Date"));
        }

        @Override // com.tantanapp.common.network.ApiCallBack
        public Exception whenResponseCheckError(ApiExcep apiExcep) {
            return qib0.f154693H.boxException(apiExcep);
        }
    }

    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser, DataChecker dataChecker, boolean z, f30<exc0, T> f30Var) {
        super(v9jVar, iNetParser, z, dataChecker, f30Var, new C17965a(), new w9j() { // from class: l.ja20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return qib0.f154693H.getHttp((stc0) obj);
            }
        });
    }

    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser, boolean z) {
        this(v9jVar, iNetParser, null, z, null);
    }

    @Deprecated
    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser) {
        this(v9jVar, iNetParser, null, false);
    }

    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser, DataChecker dataChecker) {
        this(v9jVar, iNetParser, dataChecker, false);
    }

    @Deprecated
    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser, DataChecker dataChecker, boolean z) {
        this(v9jVar, iNetParser, dataChecker, z, null);
    }
}
