package p153l;

import com.p051p1.mobile.account_core.exception.AccountException;
import com.p051p1.mobile.account_core.network.ApiCallBack;
import com.p051p1.mobile.account_core.network.DefaultCall;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p051p1.mobile.account_core.reponse_data.Meta;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReporter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import okio.BufferedSource;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class uai0 extends DefaultCall {

    /* JADX INFO: renamed from: a */
    public final int[] f178212a = {TantanException.Client.AccountService.GENERAL_BAD_REQUEST, TantanException.Client.AccountService.SHORT_PASSWORD, TantanException.Client.AccountService.INACTIVATED, TantanException.Client.AccountService.INACTIVATED_15DAYS, TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, TantanException.Client.AccountService.CONF_CODE_EXPIRED, TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 40011, TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, TantanException.Client.AccountService.THIRD_PARTY_TYPE_INVALID, TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP, TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL, TantanException.Client.AccountService.INVALID_SMS_CODE, TantanException.Client.AccountService.ACCOUNT_INVALID_ACCESS_TOKEN, TantanException.Client.AccountService.ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN, TantanException.Client.AccountService.ERROR_VERIFY_EMAIL_FREQUENTLY, 40003, TantanException.Client.AccountService.ERROR_DEVICE_NOT_FOUND, 40007, 40009, 40010, 40013, 40095};

    /* JADX INFO: renamed from: b */
    public Set<Integer> f178213b = new HashSet();

    public uai0() {
        this.okHttpClient = uqb0.f180376H.getNormalHttp();
        this.errorHandler = new rai0();
        this.apiCallBack = new pcj() { // from class: l.sai0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f167049a.m195173j();
            }
        };
        int i = 0;
        while (true) {
            int[] iArr = this.f178212a;
            if (i >= iArr.length) {
                return;
            }
            this.f178213b.add(Integer.valueOf(iArr[i]));
            i++;
        }
    }

    @Override // com.p051p1.mobile.account_core.network.DefaultCall, p153l.sy3
    public C22421c<AccountEnvelop> execute(x1d0 x1d0Var) {
        return super.execute(x1d0Var).onErrorResumeNext(new tai0(this));
    }

    @Override // com.p051p1.mobile.account_core.network.DefaultCall, p153l.sy3
    public C22421c<AccountEnvelop> executeWithTimeout(x1d0 x1d0Var, long j) {
        return super.executeWithTimeout(x1d0Var, j).onErrorResumeNext(new tai0(this));
    }

    /* JADX INFO: renamed from: g */
    public final int m195170g(int i) {
        if (i < 400095) {
            return ((i / 1000) * 100) + (i % LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        }
        if (i == 400119) {
            return 40095;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public final C22421c<AccountEnvelop> m195171h(Throwable th) {
        return th instanceof AccountException ? C22421c.error(m195172i((AccountException) th)) : C22421c.error(th);
    }

    /* JADX INFO: renamed from: i */
    public final TantanException.Client.AccountService m195172i(AccountException accountException) {
        int iM195170g = m195170g(accountException.meta.code);
        boolean zContains = this.f178213b.contains(Integer.valueOf(iM195170g));
        Meta meta = accountException.meta;
        return zContains ? new TantanException.Client.AccountService(iM195170g, meta.message) : new TantanException.Client.AccountService(meta.code, meta.message);
    }

    @Override // com.p051p1.mobile.account_core.network.DefaultCall, p153l.sy3
    public x1d0 interceptRequest(x1d0 x1d0Var) {
        x1d0.C21228a c21228aAuthBeforeSignUp;
        if (uqb0.f180397c0.signedIn_()) {
            c21228aAuthBeforeSignUp = uqb0.f180376H.auth(x1d0Var.m209023h());
        } else {
            c21228aAuthBeforeSignUp = ike.m140276h().m140283i() ? uqb0.f180376H.authBeforeSignUp(x1d0Var.m209023h()) : uqb0.f180376H.basic(x1d0Var.m209023h());
        }
        c21228aAuthBeforeSignUp.m209034h("X-Putong-One-Id", yp50.m217001d());
        return c21228aAuthBeforeSignUp.m209028b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ApiCallBack m195173j() {
        return new C20532a();
    }

    /* JADX INFO: renamed from: k */
    public final void m195174k(k5d0 k5d0Var) {
        k5d0 k5d0VarCreate = null;
        try {
            BufferedSource bufferedSourceSource = k5d0Var.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            k5d0VarCreate = k5d0.create(k5d0Var.contentType(), k5d0Var.contentLength(), bufferedSourceSource.getBufferField().clone());
            v3l0.m199281e().m199283c(k5d0VarCreate.string());
            esf0.m122324e().m122327b(k5d0VarCreate.string());
        } catch (IOException e) {
            NetReporter.reportError(e);
            ua5.m195158b(k5d0VarCreate);
        }
    }

    /* JADX INFO: renamed from: l.uai0$a */
    public class C20532a implements ApiCallBack {
        public C20532a() {
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public x1d0 beforeCall(x1d0 x1d0Var) throws Exception {
            return uqb0.f180376H.maybeUpdateRequestBeforeCall(x1d0Var);
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public Exception beforeExceptionCheck(i5d0 i5d0Var) {
            if (User.ID_TEAM_ACCOUNT.equals(i5d0Var.m138675u("Putong-Client-Version-Expires-At"))) {
                return new ApiExcep.ClientExpired(i5d0Var);
            }
            return null;
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public void whenGetResponse(i5d0 i5d0Var) {
            uai0.this.m195174k(i5d0Var.m138670k());
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public void whenApiFinish() {
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public void whenApiError(Exception exc) {
        }

        @Override // com.p051p1.mobile.account_core.network.ApiCallBack
        public void whenGetRealCall(ry3 ry3Var) {
        }
    }
}
