package com.p051p1.mobile.account_core.network;

import android.util.Log;
import com.p051p1.mobile.account_core.network.DefaultCall;
import com.p051p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.C20407tv;
import p153l.pcj;
import p153l.qcj;
import p153l.rg50;
import p153l.sy3;
import p153l.x1d0;
import p153l.y20;

/* JADX INFO: loaded from: classes8.dex */
public class DefaultCall implements sy3 {
    public static final String TAG = "DefaultCall";
    protected pcj<ApiCallBack> apiCallBack;
    protected qcj<Throwable, Throwable> errorHandler;
    protected rg50 okHttpClient;

    public DefaultCall() {
        this.apiCallBack = null;
        this.okHttpClient = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ rg50 m21358a(rg50 rg50Var, x1d0 x1d0Var) {
        return rg50Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ x1d0 m21359b(x1d0 x1d0Var) {
        return x1d0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C22421c m21360c(DefaultCall defaultCall, Throwable th) {
        qcj<Throwable, Throwable> qcjVar = defaultCall.errorHandler;
        return qcjVar != null ? C22421c.error(qcjVar.call(th)) : C22421c.error(th);
    }

    private C22421c<AccountEnvelop> executeRequest(final x1d0 x1d0Var, final rg50 rg50Var) {
        if (rg50Var == null) {
            if (this.okHttpClient == null) {
                this.okHttpClient = new rg50();
            }
            rg50Var = this.okHttpClient;
        }
        if (C20407tv.f176232a) {
            Log.e(TAG, x1d0Var.m209026k().toString());
        }
        C22507a c22507aM222758b = C22507a.m222758b();
        pcj pcjVar = new pcj() { // from class: l.ymd
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return DefaultCall.m21359b(x1d0Var);
            }
        };
        pcj<ApiCallBack> pcjVar2 = this.apiCallBack;
        new NetReqObs(pcjVar, pcjVar2 != null ? pcjVar2.call() : null, new qcj() { // from class: l.zmd
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return DefaultCall.m21358a(rg50Var, (x1d0) obj);
            }
        }).subscribeOn(Schedulers.m222739io()).onErrorResumeNext(new qcj() { // from class: l.and
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return DefaultCall.m21360c(this.f72343a, (Throwable) obj);
            }
        }).subscribe(c22507aM222758b);
        return c22507aM222758b.doOnNext(new y20() { // from class: l.bnd
            @Override // p153l.y20
            public final void call(Object obj) {
                ((AccountEnvelop) obj).fillExtraData();
            }
        });
    }

    @Override // p153l.sy3
    public C22421c<AccountEnvelop> execute(x1d0 x1d0Var) {
        return executeRequest(x1d0Var, null);
    }

    @Override // p153l.sy3
    public C22421c<AccountEnvelop> executeWithTimeout(x1d0 x1d0Var, long j) {
        rg50 rg50Var = this.okHttpClient;
        if (rg50Var == null) {
            rg50Var = new rg50();
        }
        return executeRequest(x1d0Var, rg50Var.m181359v().m181383u(j, TimeUnit.SECONDS).m181365c());
    }

    public DefaultCall(pcj<ApiCallBack> pcjVar, rg50 rg50Var) {
        this.apiCallBack = pcjVar;
        this.okHttpClient = rg50Var;
    }

    @Override // p153l.sy3
    public x1d0 interceptRequest(x1d0 x1d0Var) throws IOException {
        return x1d0Var;
    }
}
