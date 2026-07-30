package com.p051p1.mobile.account_core.network;

import android.os.Looper;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.p051p1.mobile.account_core.exception.TooManyRequests;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import org.eclipse.jetty.http.HttpMethods;
import p137rx.C22421c;
import p153l.C20407tv;
import p153l.cmk0;
import p153l.gcg0;
import p153l.i5d0;
import p153l.kcg0;
import p153l.pcj;
import p153l.qcj;
import p153l.rg50;
import p153l.rnl;
import p153l.ry3;
import p153l.w84;
import p153l.wtq0;
import p153l.x1d0;

/* JADX INFO: loaded from: classes8.dex */
public class NetReqObs extends C22421c<AccountEnvelop> {
    public static final String TAG = "NetReqObs";

    public static class OnSubs implements C22421c.a<AccountEnvelop>, w84, kcg0 {
        ApiCallBack callBack;
        private x1d0 currentRequest;
        qcj<x1d0, rg50> httpClient;
        private final pcj<x1d0> request;
        int retryCount = 0;
        private gcg0<? super AccountEnvelop> subscriber;

        public OnSubs(pcj<x1d0> pcjVar, ApiCallBack apiCallBack, qcj<x1d0, rg50> qcjVar) {
            this.request = pcjVar;
            this.callBack = apiCallBack;
            this.httpClient = qcjVar;
        }

        private void callOnError(Throwable th) {
            gcg0<? super AccountEnvelop> gcg0Var = this.subscriber;
            if (gcg0Var != null) {
                gcg0Var.onError(th);
            }
        }

        private void executeRequest() throws Throwable {
            ApiCallBack apiCallBack;
            if (isUnsubscribed()) {
                return;
            }
            i5d0 i5d0Var = null;
            try {
                try {
                    x1d0 x1d0VarCall = this.request.call();
                    this.currentRequest = x1d0VarCall;
                    ApiCallBack apiCallBack2 = this.callBack;
                    if (apiCallBack2 != null) {
                        this.currentRequest = apiCallBack2.beforeCall(x1d0VarCall);
                    }
                    ry3 ry3VarMo181341a = this.httpClient.call(this.currentRequest).mo181341a(this.currentRequest);
                    ApiCallBack apiCallBack3 = this.callBack;
                    if (apiCallBack3 != null) {
                        apiCallBack3.whenGetRealCall(ry3VarMo181341a);
                    }
                    try {
                        i5d0 i5d0VarExecute = ry3VarMo181341a.execute();
                        try {
                            ApiCallBack apiCallBack4 = this.callBack;
                            if (apiCallBack4 != null) {
                                apiCallBack4.whenGetResponse(i5d0VarExecute);
                            }
                            onResponse(null, i5d0VarExecute);
                            cmk0.m111281a(i5d0VarExecute);
                            ApiCallBack apiCallBack5 = this.callBack;
                            if (apiCallBack5 != null) {
                                apiCallBack5.whenApiFinish();
                            }
                        } catch (Exception e) {
                            e = e;
                            i5d0Var = i5d0VarExecute;
                            ApiCallBack apiCallBack6 = this.callBack;
                            if (apiCallBack6 != null) {
                                apiCallBack6.whenApiError(e);
                            }
                            onError(this.currentRequest.m209026k(), e);
                            cmk0.m111281a(i5d0Var);
                            apiCallBack = this.callBack;
                            if (apiCallBack == null) {
                                return;
                            }
                            apiCallBack.whenApiFinish();
                        } catch (Throwable th) {
                            th = th;
                            i5d0Var = i5d0VarExecute;
                            cmk0.m111281a(i5d0Var);
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
                        onError(this.currentRequest.m209026k(), e2);
                        cmk0.m111281a(null);
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

        @Override // p153l.y20
        public void call(gcg0<? super AccountEnvelop> gcg0Var) throws Throwable {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                wtq0.m207906a("Should not be called from main thread");
            } else {
                if (this.subscriber != null) {
                    wtq0.m207906a("Should be only called once");
                    return;
                }
                this.subscriber = gcg0Var;
                gcg0Var.m129866b(this);
                executeRequest();
            }
        }

        public boolean canRetry() {
            x1d0 x1d0Var = this.currentRequest;
            if (x1d0Var == null) {
                return true;
            }
            String strM209022g = x1d0Var.m209022g();
            return "GET".equals(strM209022g) || HttpMethods.HEAD.equals(strM209022g) || HttpMethods.PUT.equals(strM209022g) || HttpMethods.DELETE.equals(strM209022g);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.subscriber == null;
        }

        public void onError(rnl rnlVar, Exception exc) throws Throwable {
            int i;
            if (!canRetry() || (i = this.retryCount) >= 2) {
                callOnError(exc);
            } else {
                this.retryCount = i + 1;
                executeRequest();
            }
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) throws Throwable {
            onError(ry3Var.request().m209026k(), iOException);
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
            int i;
            try {
                if (isUnsubscribed()) {
                    cmk0.m111281a(i5d0Var);
                    return;
                }
                ApiCallBack apiCallBack = this.callBack;
                AccountEnvelop accountEnvelop = null;
                Exception excBeforeExceptionCheck = apiCallBack != null ? apiCallBack.beforeExceptionCheck(i5d0Var) : null;
                if (excBeforeExceptionCheck == null) {
                    excBeforeExceptionCheck = ExceptionChecker.check(i5d0Var);
                }
                if (excBeforeExceptionCheck == null) {
                    String strString = i5d0Var.m138673q() != 204 ? i5d0Var.m138670k().string() : null;
                    if (strString != null) {
                        try {
                            accountEnvelop = (AccountEnvelop) new Gson().fromJson(strString, AccountEnvelop.class);
                        } catch (JsonSyntaxException e) {
                            callOnError(e);
                        }
                    }
                    gcg0<? super AccountEnvelop> gcg0Var = this.subscriber;
                    if (gcg0Var != null) {
                        gcg0Var.onNext(accountEnvelop);
                        gcg0<? super AccountEnvelop> gcg0Var2 = this.subscriber;
                        if (gcg0Var2 != null) {
                            gcg0Var2.onCompleted();
                        }
                    }
                } else if (!(excBeforeExceptionCheck instanceof TooManyRequests) || (i = this.retryCount) >= 3) {
                    callOnError(excBeforeExceptionCheck);
                } else {
                    this.retryCount = i + 1;
                    int i2 = ((TooManyRequests) excBeforeExceptionCheck).resetInSeconds;
                    boolean z = C20407tv.f176232a;
                    try {
                        Thread.sleep(i2 * 1000);
                    } catch (InterruptedException unused) {
                    }
                    executeRequest();
                }
                cmk0.m111281a(i5d0Var);
            } catch (Throwable th) {
                cmk0.m111281a(i5d0Var);
                throw th;
            }
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.subscriber = null;
        }
    }

    public NetReqObs(pcj<x1d0> pcjVar, ApiCallBack apiCallBack, qcj<x1d0, rg50> qcjVar) {
        super(new OnSubs(pcjVar, apiCallBack, qcjVar));
    }
}
