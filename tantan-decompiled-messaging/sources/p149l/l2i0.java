package p149l;

import com.p046p1.mobile.account_core.exception.AccountException;
import com.p046p1.mobile.account_core.network.ApiCallBack;
import com.p046p1.mobile.account_core.network.DefaultCall;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p046p1.mobile.account_core.reponse_data.Meta;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReporter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import okio.BufferedSource;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class l2i0 extends DefaultCall {

    /* JADX INFO: renamed from: a */
    public final int[] f125788a = {TantanException.Client.AccountService.GENERAL_BAD_REQUEST, TantanException.Client.AccountService.SHORT_PASSWORD, TantanException.Client.AccountService.INACTIVATED, TantanException.Client.AccountService.INACTIVATED_15DAYS, TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, TantanException.Client.AccountService.CONF_CODE_EXPIRED, TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 40011, TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, TantanException.Client.AccountService.THIRD_PARTY_TYPE_INVALID, TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP, TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL, TantanException.Client.AccountService.INVALID_SMS_CODE, TantanException.Client.AccountService.ACCOUNT_INVALID_ACCESS_TOKEN, TantanException.Client.AccountService.ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN, TantanException.Client.AccountService.ERROR_VERIFY_EMAIL_FREQUENTLY, 40003, TantanException.Client.AccountService.ERROR_DEVICE_NOT_FOUND, 40007, 40009, 40010, 40013, 40095};

    /* JADX INFO: renamed from: b */
    public Set<Integer> f125789b = new HashSet();

    public l2i0() {
        this.okHttpClient = qib0.f154693H.getNormalHttp();
        this.errorHandler = new i2i0();
        this.apiCallBack = new v9j() { // from class: l.j2i0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f115929a.m148290j();
            }
        };
        int i = 0;
        while (true) {
            int[] iArr = this.f125788a;
            if (i >= iArr.length) {
                return;
            }
            this.f125789b.add(Integer.valueOf(iArr[i]));
            i++;
        }
    }

    @Override // com.p046p1.mobile.account_core.network.DefaultCall, p149l.tx3
    public C22306c<AccountEnvelop> execute(stc0 stc0Var) {
        return super.execute(stc0Var).onErrorResumeNext(new k2i0(this));
    }

    @Override // com.p046p1.mobile.account_core.network.DefaultCall, p149l.tx3
    public C22306c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        return super.executeWithTimeout(stc0Var, j).onErrorResumeNext(new k2i0(this));
    }

    /* JADX INFO: renamed from: g */
    public final int m148287g(int i) {
        if (i < 400095) {
            return ((i / 1000) * 100) + (i % LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        }
        if (i == 400119) {
            return 40095;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public final C22306c<AccountEnvelop> m148288h(Throwable th) {
        return th instanceof AccountException ? C22306c.error(m148289i((AccountException) th)) : C22306c.error(th);
    }

    /* JADX INFO: renamed from: i */
    public final TantanException.Client.AccountService m148289i(AccountException accountException) {
        int iM148287g = m148287g(accountException.meta.code);
        boolean zContains = this.f125789b.contains(Integer.valueOf(iM148287g));
        Meta meta = accountException.meta;
        return zContains ? new TantanException.Client.AccountService(iM148287g, meta.message) : new TantanException.Client.AccountService(meta.code, meta.message);
    }

    @Override // com.p046p1.mobile.account_core.network.DefaultCall, p149l.tx3
    public stc0 interceptRequest(stc0 stc0Var) {
        stc0.C20027a c20027aAuthBeforeSignUp;
        if (qib0.f154714c0.signedIn_()) {
            c20027aAuthBeforeSignUp = qib0.f154693H.auth(stc0Var.m185878h());
        } else {
            c20027aAuthBeforeSignUp = eje.m116824h().m116831i() ? qib0.f154693H.authBeforeSignUp(stc0Var.m185878h()) : qib0.f154693H.basic(stc0Var.m185878h());
        }
        c20027aAuthBeforeSignUp.m185889h("X-Putong-One-Id", sh50.m184159d());
        return c20027aAuthBeforeSignUp.m185883b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ApiCallBack m148290j() {
        return new C18141a();
    }

    /* JADX INFO: renamed from: k */
    public final void m148291k(gxc0 gxc0Var) {
        gxc0 gxc0VarCreate = null;
        try {
            BufferedSource bufferedSourceSource = gxc0Var.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            gxc0VarCreate = gxc0.create(gxc0Var.contentType(), gxc0Var.contentLength(), bufferedSourceSource.getBufferField().clone());
            puk0.m171431e().m171433c(gxc0VarCreate.string());
            vjf0.m198623e().m198626b(gxc0VarCreate.string());
        } catch (IOException e) {
            NetReporter.reportError(e);
            t95.m187604b(gxc0VarCreate);
        }
    }

    /* JADX INFO: renamed from: l.l2i0$a */
    public class C18141a implements ApiCallBack {
        public C18141a() {
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public stc0 beforeCall(stc0 stc0Var) throws Exception {
            return qib0.f154693H.maybeUpdateRequestBeforeCall(stc0Var);
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public Exception beforeExceptionCheck(exc0 exc0Var) {
            if (User.ID_TEAM_ACCOUNT.equals(exc0Var.m118611u("Putong-Client-Version-Expires-At"))) {
                return new ApiExcep.ClientExpired(exc0Var);
            }
            return null;
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public void whenGetResponse(exc0 exc0Var) {
            l2i0.this.m148291k(exc0Var.m118606k());
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public void whenApiFinish() {
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public void whenApiError(Exception exc) {
        }

        @Override // com.p046p1.mobile.account_core.network.ApiCallBack
        public void whenGetRealCall(sx3 sx3Var) {
        }
    }
}
