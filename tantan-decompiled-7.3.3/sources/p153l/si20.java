package p153l;

import androidx.annotation.NonNull;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReqObs;
import com.tantanapp.common.network.NetworkTrackInfo;

/* JADX INFO: loaded from: classes9.dex */
public class si20<T> extends NetReqObs<T> {

    /* JADX INFO: renamed from: l.si20$a */
    public static class C20048a implements ApiCallBack {
        @Override // com.tantanapp.common.network.ApiCallBack
        public x1d0 beforeCall(x1d0 x1d0Var) throws Exception {
            return hl20.m135655b(uqb0.f180376H.maybeUpdateRequestBeforeCall(x1d0Var), NetworkTrackInfo.ReportType.API);
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
        public void whenGetResponse(x1d0 x1d0Var, i5d0 i5d0Var) {
            uqb0.f180376H.updateServerTime(i5d0Var.m138675u("Date"));
        }

        @Override // com.tantanapp.common.network.ApiCallBack
        public Exception whenResponseCheckError(ApiExcep apiExcep) {
            return uqb0.f180376H.boxException(apiExcep);
        }
    }

    public si20(pcj<x1d0> pcjVar, INetParser<T> iNetParser, DataChecker dataChecker, boolean z, z20<i5d0, T> z20Var) {
        super(pcjVar, iNetParser, z, dataChecker, z20Var, new C20048a(), new qcj() { // from class: l.ri20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uqb0.f180376H.getHttp((x1d0) obj);
            }
        });
    }

    public si20(pcj<x1d0> pcjVar, INetParser<T> iNetParser, boolean z) {
        this(pcjVar, iNetParser, null, z, null);
    }

    @Deprecated
    public si20(pcj<x1d0> pcjVar, INetParser<T> iNetParser) {
        this(pcjVar, iNetParser, null, false);
    }

    public si20(pcj<x1d0> pcjVar, INetParser<T> iNetParser, DataChecker dataChecker) {
        this(pcjVar, iNetParser, dataChecker, false);
    }

    @Deprecated
    public si20(pcj<x1d0> pcjVar, INetParser<T> iNetParser, DataChecker dataChecker, boolean z) {
        this(pcjVar, iNetParser, dataChecker, z, null);
    }
}
