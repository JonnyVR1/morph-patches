package com.p046p1.mobile.account_core.network;

import android.util.Log;
import com.p046p1.mobile.account_core.network.DefaultCall;
import com.p046p1.mobile.account_core.reponse_data.AccountEnvelop;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.C21777zv;
import p149l.e30;
import p149l.k850;
import p149l.stc0;
import p149l.tx3;
import p149l.v9j;
import p149l.w9j;

/* JADX INFO: loaded from: classes8.dex */
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
    public static /* synthetic */ k850 m20359a(k850 k850Var, stc0 stc0Var) {
        return k850Var;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ stc0 m20360b(stc0 stc0Var) {
        return stc0Var;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C22306c m20361c(DefaultCall defaultCall, Throwable th) {
        w9j<Throwable, Throwable> w9jVar = defaultCall.errorHandler;
        return w9jVar != null ? C22306c.error(w9jVar.call(th)) : C22306c.error(th);
    }

    private C22306c<AccountEnvelop> executeRequest(final stc0 stc0Var, final k850 k850Var) {
        if (k850Var == null) {
            if (this.okHttpClient == null) {
                this.okHttpClient = new k850();
            }
            k850Var = this.okHttpClient;
        }
        if (C21777zv.f204925a) {
            Log.e(TAG, stc0Var.m185881k().toString());
        }
        C22392a c22392aM221512b = C22392a.m221512b();
        v9j v9jVar = new v9j() { // from class: l.sld
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return DefaultCall.m20360b(stc0Var);
            }
        };
        v9j<ApiCallBack> v9jVar2 = this.apiCallBack;
        new NetReqObs(v9jVar, v9jVar2 != null ? v9jVar2.call() : null, new w9j() { // from class: l.tld
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return DefaultCall.m20359a(k850Var, (stc0) obj);
            }
        }).subscribeOn(Schedulers.m221493io()).onErrorResumeNext(new w9j() { // from class: l.uld
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return DefaultCall.m20361c(this.f177044a, (Throwable) obj);
            }
        }).subscribe(c22392aM221512b);
        return c22392aM221512b.doOnNext(new e30() { // from class: l.vld
            @Override // p149l.e30
            public final void call(Object obj) {
                ((AccountEnvelop) obj).fillExtraData();
            }
        });
    }

    @Override // p149l.tx3
    public C22306c<AccountEnvelop> execute(stc0 stc0Var) {
        return executeRequest(stc0Var, null);
    }

    @Override // p149l.tx3
    public C22306c<AccountEnvelop> executeWithTimeout(stc0 stc0Var, long j) {
        k850 k850Var = this.okHttpClient;
        if (k850Var == null) {
            k850Var = new k850();
        }
        return executeRequest(stc0Var, k850Var.m144867v().m144899t(j, TimeUnit.SECONDS).m144882c());
    }

    public DefaultCall(v9j<ApiCallBack> v9jVar, k850 k850Var) {
        this.apiCallBack = v9jVar;
        this.okHttpClient = k850Var;
    }

    @Override // p149l.tx3
    public stc0 interceptRequest(stc0 stc0Var) throws IOException {
        return stc0Var;
    }
}
