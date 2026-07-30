package p006l;

import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.account_core.exception.AccountException;
import com.p1.mobile.account_core.network.ApiCallBack;
import com.p1.mobile.account_core.network.DefaultCall;
import com.p1.mobile.account_core.reponse_data.AccountEnvelop;
import com.p1.mobile.account_core.reponse_data.Meta;
import com.tantanapp.common.network.ApiExcep;
import com.tantanapp.common.network.NetReporter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import l.exc0;
import l.gxc0;
import l.puk0;
import l.stc0;
import l.sx3;
import l.t95;
import l.v9j;
import l.vjf0;
import okio.BufferedSource;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l2i0 extends DefaultCall {

    /* JADX INFO: renamed from: a */
    public final int[] f16199a = {TantanException.Client.AccountService.GENERAL_BAD_REQUEST, TantanException.Client.AccountService.SHORT_PASSWORD, TantanException.Client.AccountService.INACTIVATED, TantanException.Client.AccountService.INACTIVATED_15DAYS, TantanException.Client.AccountService.VERIFY_CURRENT_PASSWORD, TantanException.Client.AccountService.CONF_CODE_EXPIRED, TantanException.Client.AccountService.NEW_DEVICE_SIGN_IN, 40011, TantanException.Client.AccountService.THIRD_PARTY_USER_EXIST, TantanException.Client.AccountService.THIRD_PARTY_TYPE_INVALID, TantanException.Client.AccountService.CHINA_MOBILE_NOT_SIGN_UP, TantanException.Client.AccountService.ACCOUNT_PASSWORD_FAIL, TantanException.Client.AccountService.INVALID_SMS_CODE, TantanException.Client.AccountService.ACCOUNT_INVALID_ACCESS_TOKEN, TantanException.Client.AccountService.ERROR_ACCOUNT_CHANGE_PHONE_FORBIDDEN, TantanException.Client.AccountService.ERROR_VERIFY_EMAIL_FREQUENTLY, 40003, TantanException.Client.AccountService.ERROR_DEVICE_NOT_FOUND, 40007, 40009, 40010, 40013, 40095};

    /* JADX INFO: renamed from: b */
    public Set<Integer> f16200b = new HashSet();

    public l2i0() {
        ((DefaultCall) this).okHttpClient = qib0.f19784H.getNormalHttp();
        ((DefaultCall) this).errorHandler = new i2i0();
        ((DefaultCall) this).apiCallBack = new v9j() { // from class: l.j2i0
            public final Object call() {
                return this.f14974a.m18531j();
            }
        };
        int i = 0;
        while (true) {
            int[] iArr = this.f16199a;
            if (i >= iArr.length) {
                return;
            }
            this.f16200b.add(Integer.valueOf(iArr[i]));
            i++;
        }
    }

    public c<AccountEnvelop> execute(stc0 stc0Var) {
        return super.execute(stc0Var).onErrorResumeNext(new k2i0(this));
    }

    public c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        return super.executeWithTimeout(stc0Var, j).onErrorResumeNext(new k2i0(this));
    }

    /* JADX INFO: renamed from: g */
    public final int m18528g(int i) {
        if (i < 400095) {
            return ((i / AccountMakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO) * 100) + (i % 100000);
        }
        if (i == 400119) {
            return 40095;
        }
        return i;
    }

    /* JADX INFO: renamed from: h */
    public final c<AccountEnvelop> m18529h(Throwable th) {
        return th instanceof AccountException ? c.error(m18530i((AccountException) th)) : c.error(th);
    }

    /* JADX INFO: renamed from: i */
    public final TantanException.Client.AccountService m18530i(AccountException accountException) {
        int iM18528g = m18528g(accountException.meta.code);
        boolean zContains = this.f16200b.contains(Integer.valueOf(iM18528g));
        Meta meta = accountException.meta;
        return zContains ? new TantanException.Client.AccountService(iM18528g, meta.message) : new TantanException.Client.AccountService(meta.code, meta.message);
    }

    public stc0 interceptRequest(stc0 stc0Var) {
        stc0.a aVarAuthBeforeSignUp;
        if (qib0.f19805c0.signedIn_()) {
            aVarAuthBeforeSignUp = qib0.f19784H.auth(stc0Var.h());
        } else {
            aVarAuthBeforeSignUp = eje.m14574h().m14581i() ? qib0.f19784H.authBeforeSignUp(stc0Var.h()) : qib0.f19784H.basic(stc0Var.h());
        }
        aVarAuthBeforeSignUp.h("X-Putong-One-Id", sh50.m23745d());
        return aVarAuthBeforeSignUp.b();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ApiCallBack m18531j() {
        return new C0960a();
    }

    /* JADX INFO: renamed from: k */
    public final void m18532k(gxc0 gxc0Var) {
        gxc0 gxc0VarCreate = null;
        try {
            BufferedSource bufferedSourceSource = gxc0Var.source();
            bufferedSourceSource.request(Long.MAX_VALUE);
            gxc0VarCreate = gxc0.create(gxc0Var.contentType(), gxc0Var.contentLength(), bufferedSourceSource.buffer().clone());
            puk0.e().c(gxc0VarCreate.string());
            vjf0.e().b(gxc0VarCreate.string());
        } catch (IOException e) {
            NetReporter.reportError(e);
            t95.b(gxc0VarCreate);
        }
    }

    /* JADX INFO: renamed from: l.l2i0$a */
    public class C0960a implements ApiCallBack {
        public C0960a() {
        }

        public stc0 beforeCall(stc0 stc0Var) throws Exception {
            return qib0.f19784H.maybeUpdateRequestBeforeCall(stc0Var);
        }

        public Exception beforeExceptionCheck(exc0 exc0Var) {
            if ("-1".equals(exc0Var.u("Putong-Client-Version-Expires-At"))) {
                return new ApiExcep.ClientExpired(exc0Var);
            }
            return null;
        }

        public void whenGetResponse(exc0 exc0Var) {
            l2i0.this.m18532k(exc0Var.k());
        }

        public void whenApiFinish() {
        }

        public void whenApiError(Exception exc) {
        }

        public void whenGetRealCall(sx3 sx3Var) {
        }
    }
}
