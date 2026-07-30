package com.tantanapp.common.network;

import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.jetty.http.HttpMethods;
import p137rx.C22421c;
import p153l.gcg0;
import p153l.i5d0;
import p153l.k5d0;
import p153l.kcg0;
import p153l.kmk0;
import p153l.pcj;
import p153l.qcj;
import p153l.rg50;
import p153l.ry3;
import p153l.tu2;
import p153l.u11;
import p153l.ua5;
import p153l.w84;
import p153l.wtq0;
import p153l.x1d0;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class NetReqObs<T> extends C22421c<T> {
    public static final String TAG = "NetReqObs";

    public static class OnSubs<T> implements C22421c.a<T>, w84, kcg0 {
        ApiCallBack callBack;
        private final DataChecker dataChecker;
        qcj<x1d0, rg50> httpClient;
        private final boolean overrideRetry;
        private final INetParser<T> parser;
        private z20<i5d0, T> postParser;
        private final pcj<x1d0> request;
        int retryCount = 0;
        private gcg0<? super T> subscriber;

        public OnSubs(pcj<x1d0> pcjVar, INetParser<T> iNetParser, boolean z, DataChecker dataChecker, z20<i5d0, T> z20Var, ApiCallBack apiCallBack, qcj<x1d0, rg50> qcjVar) {
            this.request = pcjVar;
            this.parser = iNetParser;
            this.overrideRetry = z;
            this.postParser = z20Var;
            this.dataChecker = dataChecker;
            this.callBack = apiCallBack;
            this.httpClient = qcjVar;
        }

        private void callOnError(Throwable th) {
            gcg0<? super T> gcg0Var = this.subscriber;
            if (gcg0Var != null) {
                gcg0Var.onError(th);
            }
        }

        /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [l.ry3] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [l.ry3] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void executeRequest() throws Throwable {
            Closeable closeable;
            Throwable th;
            x1d0 x1d0Var;
            Exception e;
            ?? r2;
            if (isUnsubscribed()) {
                return;
            }
            ?? r0 = 0;
            r0 = 0;
            x1d0 x1d0Var2 = null;
            try {
                x1d0 x1d0VarCall = this.request.call();
                try {
                    try {
                        ApiCallBack apiCallBack = this.callBack;
                        if (apiCallBack != null) {
                            x1d0VarCall = apiCallBack.beforeCall(x1d0VarCall);
                        }
                        try {
                            ry3 ry3VarMo181341a = this.httpClient.call(x1d0VarCall).mo181341a(x1d0VarCall);
                            try {
                                try {
                                    i5d0 i5d0VarExecute = ry3VarMo181341a.execute();
                                    if (this.callBack != null) {
                                        k5d0 k5d0VarM138670k = i5d0VarExecute.m138670k();
                                        k5d0 k5d0VarDecodeResponse = this.callBack.decodeResponse(i5d0VarExecute);
                                        if (k5d0VarDecodeResponse != k5d0VarM138670k) {
                                            k5d0VarM138670k.close();
                                            i5d0VarExecute = i5d0VarExecute.m138664N().m138678b(k5d0VarDecodeResponse).m138679c();
                                        }
                                        this.callBack.whenGetResponse(ry3VarMo181341a.request(), i5d0VarExecute);
                                    }
                                    if (kmk0.f127510c) {
                                        x1d0VarCall.toString();
                                    }
                                    onResponse(ry3VarMo181341a, i5d0VarExecute);
                                    if (this.callBack != null) {
                                        if (ry3VarMo181341a.isCanceled()) {
                                            this.callBack.requestCancel(x1d0VarCall);
                                        }
                                        this.callBack.whenApiFinish(x1d0VarCall);
                                    }
                                    ua5.m195158b(i5d0VarExecute);
                                } catch (Exception e2) {
                                    onError(x1d0VarCall, e2);
                                    if (this.callBack != null) {
                                        if (ry3VarMo181341a != null && ry3VarMo181341a.isCanceled()) {
                                            this.callBack.requestCancel(x1d0VarCall);
                                        }
                                        this.callBack.whenApiFinish(x1d0VarCall);
                                    }
                                    ua5.m195158b(null);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                x1d0 x1d0Var3 = x1d0VarCall;
                                closeable = null;
                                r0 = ry3VarMo181341a;
                                x1d0Var = x1d0Var3;
                                if (this.callBack != null) {
                                    if (r0 != 0) {
                                        this.callBack.requestCancel(x1d0Var);
                                    }
                                    this.callBack.whenApiFinish(x1d0Var);
                                }
                                ua5.m195158b(closeable);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            x1d0 x1d0Var4 = x1d0VarCall;
                            closeable = null;
                            x1d0Var2 = x1d0Var4;
                            r2 = apiCallBack;
                            try {
                                onError(x1d0Var2, e);
                                if (this.callBack != null) {
                                    if (r2 != 0 && r2.isCanceled()) {
                                        this.callBack.requestCancel(x1d0Var2);
                                    }
                                    this.callBack.whenApiFinish(x1d0Var2);
                                }
                                ua5.m195158b(closeable);
                            } catch (Throwable th3) {
                                th = th3;
                                ?? r5 = r2;
                                x1d0Var = x1d0Var2;
                                r0 = r5;
                                if (this.callBack != null) {
                                    if (r0 != 0 && r0.isCanceled()) {
                                        this.callBack.requestCancel(x1d0Var);
                                    }
                                    this.callBack.whenApiFinish(x1d0Var);
                                }
                                ua5.m195158b(closeable);
                                throw th;
                            }
                        }
                    } catch (NetIgnoredException e4) {
                        onError(x1d0VarCall, e4);
                        ApiCallBack apiCallBack2 = this.callBack;
                        if (apiCallBack2 != null) {
                            apiCallBack2.whenApiFinish(x1d0VarCall);
                        }
                        ua5.m195158b(null);
                    }
                } catch (Exception e5) {
                    e = e5;
                    r2 = 0;
                    x1d0Var2 = x1d0VarCall;
                    closeable = null;
                } catch (Throwable th4) {
                    th = th4;
                    x1d0Var = x1d0VarCall;
                    closeable = null;
                }
            } catch (Exception e6) {
                closeable = null;
                e = e6;
                r2 = 0;
            } catch (Throwable th5) {
                closeable = null;
                th = th5;
                x1d0Var = null;
            }
        }

        private void netWorkTrackThrowable(x1d0 x1d0Var, Throwable th) {
            ApiCallBack apiCallBack = this.callBack;
            if (apiCallBack != null) {
                apiCallBack.whenApiError(x1d0Var, th);
            }
        }

        @Override // p153l.y20
        public void call(gcg0<? super T> gcg0Var) throws Throwable {
            u11.m193892f();
            if (this.subscriber != null) {
                wtq0.m207906a("Should be only called once");
                return;
            }
            this.subscriber = gcg0Var;
            gcg0Var.m129866b(this);
            executeRequest();
        }

        public boolean canRetry(x1d0 x1d0Var) {
            if (x1d0Var == null) {
                return true;
            }
            String strM209022g = x1d0Var.m209022g();
            return this.overrideRetry || "GET".equals(strM209022g) || HttpMethods.HEAD.equals(strM209022g) || HttpMethods.PUT.equals(strM209022g) || HttpMethods.DELETE.equals(strM209022g);
        }

        @Override // p153l.kcg0
        public boolean isUnsubscribed() {
            return this.subscriber == null;
        }

        public void onError(x1d0 x1d0Var, Exception exc) throws Throwable {
            int i;
            StringBuilder sb = new StringBuilder("request error : ");
            sb.append(x1d0Var == null ? null : x1d0Var.m209026k());
            sb.append(", api error : ");
            sb.append(exc.getMessage());
            tu2.m192703a("[common][network]", sb.toString());
            netWorkTrackThrowable(x1d0Var, exc);
            if (!canRetry(x1d0Var) || (i = this.retryCount) >= 2) {
                callOnError(exc);
                NetReporter.reportError(exc);
            } else {
                String str = kmk0.f127508a;
                this.retryCount = i + 1;
                executeRequest();
            }
        }

        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) throws Throwable {
            onError(ry3Var.request(), iOException);
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
            int i;
            int i2;
            try {
                if (isUnsubscribed()) {
                    if (kmk0.f127510c) {
                        i5d0Var.m138668Z().m209026k().toString();
                    }
                    ua5.m195158b(i5d0Var);
                    return;
                }
                Exception excCheck = ExceptionChecker.check(i5d0Var);
                if (excCheck instanceof ApiExcep) {
                    tu2.m192703a("[common][network]", "NetReqObs onResponse ApiExcep : " + i5d0Var.m138668Z().m209026k().toString() + ", check error : " + excCheck.getMessage());
                    ApiCallBack apiCallBack = this.callBack;
                    if (apiCallBack != null) {
                        excCheck = apiCallBack.whenResponseCheckError((ApiExcep) excCheck);
                    }
                }
                if (excCheck != null) {
                    netWorkTrackThrowable(ry3Var.request(), excCheck);
                    if ((excCheck instanceof ApiExcep.Client.Unauthorized) && (i2 = this.retryCount) < 3) {
                        this.retryCount = i2 + 1;
                        executeRequest();
                    } else if (!(excCheck instanceof ApiExcep.Client.TooManyRequests) || (i = this.retryCount) >= 3) {
                        callOnError(excCheck);
                    } else {
                        this.retryCount = i + 1;
                        int i3 = ((ApiExcep.Client.TooManyRequests) excCheck).resetInSeconds;
                        String str = kmk0.f127508a;
                        try {
                            Thread.sleep(i3 * 1000);
                        } catch (InterruptedException unused) {
                        }
                        executeRequest();
                    }
                } else {
                    InputStream inputStreamInputStreamAfterCheck = ExceptionChecker.inputStreamAfterCheck(i5d0Var);
                    T t = null;
                    if (inputStreamInputStreamAfterCheck != null) {
                        try {
                            t = this.parser.parse(inputStreamInputStreamAfterCheck, ry3Var.request().m209026k().toString(), this.dataChecker);
                            z20<i5d0, T> z20Var = this.postParser;
                            if (z20Var != null) {
                                z20Var.call(i5d0Var, t);
                            }
                        } catch (Exception e) {
                            netWorkTrackThrowable(ry3Var.request(), e);
                            callOnError(e);
                            NetReporter.reportError(e);
                        }
                    }
                    gcg0<? super T> gcg0Var = this.subscriber;
                    if (gcg0Var != null) {
                        gcg0Var.onNext(t);
                        gcg0<? super T> gcg0Var2 = this.subscriber;
                        if (gcg0Var2 != null) {
                            gcg0Var2.onCompleted();
                        }
                    }
                }
                ua5.m195158b(i5d0Var);
            } catch (Throwable th) {
                ua5.m195158b(i5d0Var);
                throw th;
            }
        }

        @Override // p153l.kcg0
        public void unsubscribe() {
            this.subscriber = null;
        }
    }

    public NetReqObs(pcj<x1d0> pcjVar, INetParser<T> iNetParser, boolean z, DataChecker dataChecker, z20<i5d0, T> z20Var, ApiCallBack apiCallBack, qcj<x1d0, rg50> qcjVar) {
        super(new OnSubs(pcjVar, iNetParser, z, dataChecker, z20Var, apiCallBack, qcjVar));
    }
}
