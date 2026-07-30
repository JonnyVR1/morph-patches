package com.p046p1.mobile.account_core.network;

import android.os.Looper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.p046p1.mobile.account_core.exception.TooManyRequests;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import org.eclipse.jetty.http.HttpMethods;
import p133rx.C22306c;
import p149l.C21777zv;
import p149l.c4g0;
import p149l.cll;
import p149l.exc0;
import p149l.k850;
import p149l.qkq0;
import p149l.stc0;
import p149l.sx3;
import p149l.v9j;
import p149l.w9j;
import p149l.wck0;
import p149l.x74;
import p149l.z3g0;

/* JADX INFO: loaded from: classes8.dex */
public class NetReqObs extends C22306c<AccountEnvelop> {
    public static final String TAG = "NetReqObs";

    public static class OnSubs implements C22306c.a<AccountEnvelop>, x74, c4g0 {
        ApiCallBack callBack;
        private stc0 currentRequest;
        w9j<stc0, k850> httpClient;
        private final v9j<stc0> request;
        int retryCount = 0;
        private z3g0<? super AccountEnvelop> subscriber;

        public OnSubs(v9j<stc0> v9jVar, ApiCallBack apiCallBack, w9j<stc0, k850> w9jVar) {
            this.request = v9jVar;
            this.callBack = apiCallBack;
            this.httpClient = w9jVar;
        }

        private void callOnError(Throwable th) {
            z3g0<? super AccountEnvelop> z3g0Var = this.subscriber;
            if (z3g0Var != null) {
                z3g0Var.onError(th);
            }
        }

        private void executeRequest() throws Throwable {
            ApiCallBack apiCallBack;
            if (isUnsubscribed()) {
                return;
            }
            exc0 exc0Var = null;
            try {
                try {
                    stc0 stc0VarCall = this.request.call();
                    this.currentRequest = stc0VarCall;
                    ApiCallBack apiCallBack2 = this.callBack;
                    if (apiCallBack2 != null) {
                        this.currentRequest = apiCallBack2.beforeCall(stc0VarCall);
                    }
                    sx3 sx3VarMo144849a = this.httpClient.call(this.currentRequest).mo144849a(this.currentRequest);
                    ApiCallBack apiCallBack3 = this.callBack;
                    if (apiCallBack3 != null) {
                        apiCallBack3.whenGetRealCall(sx3VarMo144849a);
                    }
                    try {
                        exc0 exc0VarExecute = sx3VarMo144849a.execute();
                        try {
                            ApiCallBack apiCallBack4 = this.callBack;
                            if (apiCallBack4 != null) {
                                apiCallBack4.whenGetResponse(exc0VarExecute);
                            }
                            onResponse(null, exc0VarExecute);
                            wck0.m202665a(exc0VarExecute);
                            ApiCallBack apiCallBack5 = this.callBack;
                            if (apiCallBack5 != null) {
                                apiCallBack5.whenApiFinish();
                            }
                        } catch (Exception e) {
                            e = e;
                            exc0Var = exc0VarExecute;
                            ApiCallBack apiCallBack6 = this.callBack;
                            if (apiCallBack6 != null) {
                                apiCallBack6.whenApiError(e);
                            }
                            onError(this.currentRequest.m185881k(), e);
                            wck0.m202665a(exc0Var);
                            apiCallBack = this.callBack;
                            if (apiCallBack == null) {
                                return;
                            }
                            apiCallBack.whenApiFinish();
                        } catch (Throwable th) {
                            th = th;
                            exc0Var = exc0VarExecute;
                            wck0.m202665a(exc0Var);
                            ApiCallBack apiCallBack7 = this.callBack;
                            if (apiCallBack7 != null) {
                                apiCallBack7.whenApiFinish();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        if (this.callBack != null) {
                            this.callBack.whenApiError(e2);
                        }
                        onError(this.currentRequest.m185881k(), e2);
                        wck0.m202665a(null);
                        apiCallBack = this.callBack;
                        if (apiCallBack == null) {
                            return;
                        }
                        apiCallBack.whenApiFinish();
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }

        @Override // p149l.e30
        public void call(z3g0<? super AccountEnvelop> z3g0Var) throws Throwable {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                qkq0.m175383a("Should not be called from main thread");
            } else {
                if (this.subscriber != null) {
                    qkq0.m175383a("Should be only called once");
                    return;
                }
                this.subscriber = z3g0Var;
                z3g0Var.m217046b(this);
                executeRequest();
            }
        }

        public boolean canRetry() {
            stc0 stc0Var = this.currentRequest;
            if (stc0Var == null) {
                return true;
            }
            String strM185877g = stc0Var.m185877g();
            return "GET".equals(strM185877g) || HttpMethods.HEAD.equals(strM185877g) || HttpMethods.PUT.equals(strM185877g) || HttpMethods.DELETE.equals(strM185877g);
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.subscriber == null;
        }

        public void onError(cll cllVar, Exception exc) throws Throwable {
            int i;
            if (!canRetry() || (i = this.retryCount) >= 2) {
                callOnError(exc);
            } else {
                this.retryCount = i + 1;
                executeRequest();
            }
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) throws Throwable {
            onError(sx3Var.request().m185881k(), iOException);
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            int i;
            try {
                if (isUnsubscribed()) {
                    wck0.m202665a(exc0Var);
                    return;
                }
                ApiCallBack apiCallBack = this.callBack;
                AccountEnvelop accountEnvelop = null;
                Exception excBeforeExceptionCheck = apiCallBack != null ? apiCallBack.beforeExceptionCheck(exc0Var) : null;
                if (excBeforeExceptionCheck == null) {
                    excBeforeExceptionCheck = ExceptionChecker.check(exc0Var);
                }
                if (excBeforeExceptionCheck == null) {
                    String strString = exc0Var.m118609q() != 204 ? exc0Var.m118606k().string() : null;
                    if (strString != null) {
                        try {
                            accountEnvelop = (AccountEnvelop) new Gson().fromJson(strString, AccountEnvelop.class);
                        } catch (JsonSyntaxException e) {
                            callOnError(e);
                        }
                    }
                    z3g0<? super AccountEnvelop> z3g0Var = this.subscriber;
                    if (z3g0Var != null) {
                        z3g0Var.onNext(accountEnvelop);
                        z3g0<? super AccountEnvelop> z3g0Var2 = this.subscriber;
                        if (z3g0Var2 != null) {
                            z3g0Var2.onCompleted();
                        }
                    }
                } else if (!(excBeforeExceptionCheck instanceof TooManyRequests) || (i = this.retryCount) >= 3) {
                    callOnError(excBeforeExceptionCheck);
                } else {
                    this.retryCount = i + 1;
                    int i2 = ((TooManyRequests) excBeforeExceptionCheck).resetInSeconds;
                    boolean z = C21777zv.f204925a;
                    try {
                        Thread.sleep(i2 * 1000);
                    } catch (InterruptedException unused) {
                    }
                    executeRequest();
                }
                wck0.m202665a(exc0Var);
            } catch (Throwable th) {
                wck0.m202665a(exc0Var);
                throw th;
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.subscriber = null;
        }
    }

    public NetReqObs(v9j<stc0> v9jVar, ApiCallBack apiCallBack, w9j<stc0, k850> w9jVar) {
        super(new OnSubs(v9jVar, apiCallBack, w9jVar));
    }
}
