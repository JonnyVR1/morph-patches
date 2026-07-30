package com.tantanapp.common.network;

import com.tantanapp.common.data.DataChecker;
import com.tantanapp.common.data.INetParser;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.eclipse.jetty.http.HttpMethods;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.du2;
import p149l.edk0;
import p149l.exc0;
import p149l.f30;
import p149l.gxc0;
import p149l.k850;
import p149l.n11;
import p149l.qkq0;
import p149l.stc0;
import p149l.sx3;
import p149l.t95;
import p149l.v9j;
import p149l.w9j;
import p149l.x74;
import p149l.z3g0;

/* JADX INFO: loaded from: classes13.dex */
public class NetReqObs<T> extends C22306c<T> {
    public static final String TAG = "NetReqObs";

    public static class OnSubs<T> implements C22306c.a<T>, x74, c4g0 {
        ApiCallBack callBack;
        private final DataChecker dataChecker;
        w9j<stc0, k850> httpClient;
        private final boolean overrideRetry;
        private final INetParser<T> parser;
        private f30<exc0, T> postParser;
        private final v9j<stc0> request;
        int retryCount = 0;
        private z3g0<? super T> subscriber;

        public OnSubs(v9j<stc0> v9jVar, INetParser<T> iNetParser, boolean z, DataChecker dataChecker, f30<exc0, T> f30Var, ApiCallBack apiCallBack, w9j<stc0, k850> w9jVar) {
            this.request = v9jVar;
            this.parser = iNetParser;
            this.overrideRetry = z;
            this.postParser = f30Var;
            this.dataChecker = dataChecker;
            this.callBack = apiCallBack;
            this.httpClient = w9jVar;
        }

        private void callOnError(Throwable th) {
            z3g0<? super T> z3g0Var = this.subscriber;
            if (z3g0Var != null) {
                z3g0Var.onError(th);
            }
        }

        /* JADX WARN: Code duplicated, block: B:76:0x00ea  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4, types: [l.sx3] */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r2v12 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4, types: [l.sx3] */
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
            stc0 stc0Var;
            Exception e;
            ?? r2;
            if (isUnsubscribed()) {
                return;
            }
            ?? r0 = 0;
            r0 = 0;
            stc0 stc0Var2 = null;
            try {
                stc0 stc0VarCall = this.request.call();
                try {
                    try {
                        ApiCallBack apiCallBack = this.callBack;
                        if (apiCallBack != null) {
                            stc0VarCall = apiCallBack.beforeCall(stc0VarCall);
                        }
                        try {
                            sx3 sx3VarMo144849a = this.httpClient.call(stc0VarCall).mo144849a(stc0VarCall);
                            try {
                                try {
                                    exc0 exc0VarExecute = sx3VarMo144849a.execute();
                                    if (this.callBack != null) {
                                        gxc0 gxc0VarM118606k = exc0VarExecute.m118606k();
                                        gxc0 gxc0VarDecodeResponse = this.callBack.decodeResponse(exc0VarExecute);
                                        if (gxc0VarDecodeResponse != gxc0VarM118606k) {
                                            gxc0VarM118606k.close();
                                            exc0VarExecute = exc0VarExecute.m118600N().m118614b(gxc0VarDecodeResponse).m118615c();
                                        }
                                        this.callBack.whenGetResponse(sx3VarMo144849a.request(), exc0VarExecute);
                                    }
                                    if (edk0.f90613c) {
                                        stc0VarCall.toString();
                                    }
                                    onResponse(sx3VarMo144849a, exc0VarExecute);
                                    if (this.callBack != null) {
                                        if (sx3VarMo144849a.isCanceled()) {
                                            this.callBack.requestCancel(stc0VarCall);
                                        }
                                        this.callBack.whenApiFinish(stc0VarCall);
                                    }
                                    t95.m187604b(exc0VarExecute);
                                } catch (Exception e2) {
                                    onError(stc0VarCall, e2);
                                    if (this.callBack != null) {
                                        if (sx3VarMo144849a != null && sx3VarMo144849a.isCanceled()) {
                                            this.callBack.requestCancel(stc0VarCall);
                                        }
                                        this.callBack.whenApiFinish(stc0VarCall);
                                    }
                                    t95.m187604b(null);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                stc0 stc0Var3 = stc0VarCall;
                                closeable = null;
                                r0 = sx3VarMo144849a;
                                stc0Var = stc0Var3;
                                if (this.callBack != null) {
                                    if (r0 != 0) {
                                        this.callBack.requestCancel(stc0Var);
                                    }
                                    this.callBack.whenApiFinish(stc0Var);
                                }
                                t95.m187604b(closeable);
                                throw th;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            stc0 stc0Var4 = stc0VarCall;
                            closeable = null;
                            stc0Var2 = stc0Var4;
                            r2 = apiCallBack;
                            try {
                                onError(stc0Var2, e);
                                if (this.callBack != null) {
                                    if (r2 != 0 && r2.isCanceled()) {
                                        this.callBack.requestCancel(stc0Var2);
                                    }
                                    this.callBack.whenApiFinish(stc0Var2);
                                }
                                t95.m187604b(closeable);
                            } catch (Throwable th3) {
                                th = th3;
                                ?? r5 = r2;
                                stc0Var = stc0Var2;
                                r0 = r5;
                                if (this.callBack != null) {
                                    if (r0 != 0 && r0.isCanceled()) {
                                        this.callBack.requestCancel(stc0Var);
                                    }
                                    this.callBack.whenApiFinish(stc0Var);
                                }
                                t95.m187604b(closeable);
                                throw th;
                            }
                        }
                    } catch (NetIgnoredException e4) {
                        onError(stc0VarCall, e4);
                        ApiCallBack apiCallBack2 = this.callBack;
                        if (apiCallBack2 != null) {
                            apiCallBack2.whenApiFinish(stc0VarCall);
                        }
                        t95.m187604b(null);
                    }
                } catch (Exception e5) {
                    e = e5;
                    r2 = 0;
                    stc0Var2 = stc0VarCall;
                    closeable = null;
                } catch (Throwable th4) {
                    th = th4;
                    stc0Var = stc0VarCall;
                    closeable = null;
                }
            } catch (Exception e6) {
                closeable = null;
                e = e6;
                r2 = 0;
            } catch (Throwable th5) {
                closeable = null;
                th = th5;
                stc0Var = null;
            }
        }

        private void netWorkTrackThrowable(stc0 stc0Var, Throwable th) {
            ApiCallBack apiCallBack = this.callBack;
            if (apiCallBack != null) {
                apiCallBack.whenApiError(stc0Var, th);
            }
        }

        @Override // p149l.e30
        public void call(z3g0<? super T> z3g0Var) throws Throwable {
            n11.m157333f();
            if (this.subscriber != null) {
                qkq0.m175383a("Should be only called once");
                return;
            }
            this.subscriber = z3g0Var;
            z3g0Var.m217046b(this);
            executeRequest();
        }

        public boolean canRetry(stc0 stc0Var) {
            if (stc0Var == null) {
                return true;
            }
            String strM185877g = stc0Var.m185877g();
            return this.overrideRetry || "GET".equals(strM185877g) || HttpMethods.HEAD.equals(strM185877g) || HttpMethods.PUT.equals(strM185877g) || HttpMethods.DELETE.equals(strM185877g);
        }

        @Override // p149l.c4g0
        public boolean isUnsubscribed() {
            return this.subscriber == null;
        }

        public void onError(stc0 stc0Var, Exception exc) throws Throwable {
            int i;
            StringBuilder sb = new StringBuilder("request error : ");
            sb.append(stc0Var == null ? null : stc0Var.m185881k());
            sb.append(", api error : ");
            sb.append(exc.getMessage());
            du2.m113670a("[common][network]", sb.toString());
            netWorkTrackThrowable(stc0Var, exc);
            if (!canRetry(stc0Var) || (i = this.retryCount) >= 2) {
                callOnError(exc);
                NetReporter.reportError(exc);
            } else {
                String str = edk0.f90611a;
                this.retryCount = i + 1;
                executeRequest();
            }
        }

        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) throws Throwable {
            onError(sx3Var.request(), iOException);
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            int i;
            int i2;
            try {
                if (isUnsubscribed()) {
                    if (edk0.f90613c) {
                        exc0Var.m118604Y().m185881k().toString();
                    }
                    t95.m187604b(exc0Var);
                    return;
                }
                Exception excCheck = ExceptionChecker.check(exc0Var);
                if (excCheck instanceof ApiExcep) {
                    du2.m113670a("[common][network]", "NetReqObs onResponse ApiExcep : " + exc0Var.m118604Y().m185881k().toString() + ", check error : " + excCheck.getMessage());
                    ApiCallBack apiCallBack = this.callBack;
                    if (apiCallBack != null) {
                        excCheck = apiCallBack.whenResponseCheckError((ApiExcep) excCheck);
                    }
                }
                if (excCheck != null) {
                    netWorkTrackThrowable(sx3Var.request(), excCheck);
                    if ((excCheck instanceof ApiExcep.Client.Unauthorized) && (i2 = this.retryCount) < 3) {
                        this.retryCount = i2 + 1;
                        executeRequest();
                    } else if (!(excCheck instanceof ApiExcep.Client.TooManyRequests) || (i = this.retryCount) >= 3) {
                        callOnError(excCheck);
                    } else {
                        this.retryCount = i + 1;
                        int i3 = ((ApiExcep.Client.TooManyRequests) excCheck).resetInSeconds;
                        String str = edk0.f90611a;
                        try {
                            Thread.sleep(i3 * 1000);
                        } catch (InterruptedException unused) {
                        }
                        executeRequest();
                    }
                } else {
                    InputStream inputStreamInputStreamAfterCheck = ExceptionChecker.inputStreamAfterCheck(exc0Var);
                    T t = null;
                    if (inputStreamInputStreamAfterCheck != null) {
                        try {
                            t = this.parser.parse(inputStreamInputStreamAfterCheck, sx3Var.request().m185881k().toString(), this.dataChecker);
                            f30<exc0, T> f30Var = this.postParser;
                            if (f30Var != null) {
                                f30Var.call(exc0Var, t);
                            }
                        } catch (Exception e) {
                            netWorkTrackThrowable(sx3Var.request(), e);
                            callOnError(e);
                            NetReporter.reportError(e);
                        }
                    }
                    z3g0<? super T> z3g0Var = this.subscriber;
                    if (z3g0Var != null) {
                        z3g0Var.onNext(t);
                        z3g0<? super T> z3g0Var2 = this.subscriber;
                        if (z3g0Var2 != null) {
                            z3g0Var2.onCompleted();
                        }
                    }
                }
                t95.m187604b(exc0Var);
            } catch (Throwable th) {
                t95.m187604b(exc0Var);
                throw th;
            }
        }

        @Override // p149l.c4g0
        public void unsubscribe() {
            this.subscriber = null;
        }
    }

    public NetReqObs(v9j<stc0> v9jVar, INetParser<T> iNetParser, boolean z, DataChecker dataChecker, f30<exc0, T> f30Var, ApiCallBack apiCallBack, w9j<stc0, k850> w9jVar) {
        super(new OnSubs(v9jVar, iNetParser, z, dataChecker, f30Var, apiCallBack, w9jVar));
    }
}
