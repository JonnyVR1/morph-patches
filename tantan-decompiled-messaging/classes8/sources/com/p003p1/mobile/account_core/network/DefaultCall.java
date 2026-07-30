package com.p003p1.mobile.account_core.network;

import android.util.Log;
import com.p003p1.mobile.account_core.network.DefaultCall;
import com.p003p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l.e30;
import l.k850;
import l.stc0;
import l.v9j;
import l.w9j;
import p007l.C0811zv;
import p007l.tx3;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class DefaultCall implements tx3 {
    public static final String TAG = "DefaultCall";
    protected v9j<ApiCallBack> apiCallBack;
    protected w9j<Throwable, Throwable> errorHandler;
    protected k850 okHttpClient;

    public DefaultCall() {
        this.apiCallBack = null;
        this.okHttpClient = null;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ k850 m630a(k850 k850Var, stc0 stc0Var) {
        return k850Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ stc0 m631b(stc0 stc0Var) {
        return stc0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ c m632c(DefaultCall defaultCall, Throwable th) {
        w9j<Throwable, Throwable> w9jVar = defaultCall.errorHandler;
        return w9jVar != null ? c.error((Throwable) w9jVar.call(th)) : c.error(th);
    }

    private c<AccountEnvelop> executeRequest(final stc0 stc0Var, final k850 k850Var) {
        if (k850Var == null) {
            if (this.okHttpClient == null) {
                this.okHttpClient = new k850();
            }
            k850Var = this.okHttpClient;
        }
        if (C0811zv.f5543a) {
            Log.e(TAG, stc0Var.k().toString());
        }
        a aVarB = a.b();
        v9j v9jVar = new v9j() { // from class: l.sld
            public final Object call() {
                return DefaultCall.m631b(stc0Var);
            }
        };
        v9j<ApiCallBack> v9jVar2 = this.apiCallBack;
        new NetReqObs(v9jVar, v9jVar2 != null ? (ApiCallBack) v9jVar2.call() : null, new w9j() { // from class: l.tld
            public final Object call(Object obj) {
                return DefaultCall.m630a(k850Var, (stc0) obj);
            }
        }).subscribeOn(Schedulers.io()).onErrorResumeNext(new w9j() { // from class: l.uld
            public final Object call(Object obj) {
                return DefaultCall.m632c(this.f4929a, (Throwable) obj);
            }
        }).subscribe(aVarB);
        return aVarB.doOnNext(new e30() { // from class: l.vld
            public final void call(Object obj) {
                ((AccountEnvelop) obj).fillExtraData();
            }
        });
    }

    @Override // p007l.tx3
    public c<AccountEnvelop> execute(stc0 stc0Var) {
        return executeRequest(stc0Var, null);
    }

    @Override // p007l.tx3
    public c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        k850 k850Var = this.okHttpClient;
        if (k850Var == null) {
            k850Var = new k850();
        }
        return executeRequest(stc0Var, k850Var.v().t(j, TimeUnit.SECONDS).c());
    }

    public DefaultCall(v9j<ApiCallBack> v9jVar, k850 k850Var) {
        this.apiCallBack = v9jVar;
        this.okHttpClient = k850Var;
    }

    @Override // p007l.tx3
    public stc0 interceptRequest(stc0 stc0Var) throws IOException {
        return stc0Var;
    }
}
