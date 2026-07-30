package p006l;

import androidx.annotation.NonNull;
import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import com.tantanapp.common.network.ApiCallBack;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReqObs;
import com.tantanapp.common.network.NetworkTrackInfo;
import l.exc0;
import l.f30;
import l.gxc0;
import l.stc0;
import l.v9j;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ka20<T> extends NetReqObs<T> {

    /* JADX INFO: renamed from: l.ka20$a */
    public static class C0923a implements ApiCallBack {
        public stc0 beforeCall(stc0 stc0Var) throws Exception {
            return xc20.m27194b(qib0.f19784H.maybeUpdateRequestBeforeCall(stc0Var), NetworkTrackInfo.ReportType.API);
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

        public void whenGetResponse(stc0 stc0Var, exc0 exc0Var) {
            qib0.f19784H.updateServerTime(exc0Var.u("Date"));
        }

        public Exception whenResponseCheckError(ApiExcep apiExcep) {
            return qib0.f19784H.boxException(apiExcep);
        }
    }

    public ka20(v9j<stc0> v9jVar, INetParser<T> iNetParser, DataChecker dataChecker, boolean z, f30<exc0, T> f30Var) {
        super(v9jVar, iNetParser, z, dataChecker, f30Var, new C0923a(), new w9j() { // from class: l.ja20
            public final Object call(Object obj) {
                return qib0.f19784H.getHttp((stc0) obj);
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
