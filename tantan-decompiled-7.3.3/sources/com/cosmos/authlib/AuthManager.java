package com.cosmos.authlib;

import java.util.Map;
import p153l.f7m;
import p153l.fpl;
import p153l.q1m;
import p153l.wtq0;
import p153l.xd1;

/* JADX INFO: loaded from: classes.dex */
public class AuthManager implements fpl {
    private static final String TAG = "AuthManager";
    private fpl authImpl;
    private xd1 authManagerConfig;

    /* JADX INFO: renamed from: com.cosmos.authlib.AuthManager$b */
    public static class C1433b {

        /* JADX INFO: renamed from: a */
        public static AuthManager f5829a = new AuthManager();
    }

    private void checkInit() {
        if (this.authImpl != null) {
            return;
        }
        wtq0.m207906a("init must be called first!");
    }

    public static AuthManager getInstance() {
        return C1433b.f5829a;
    }

    @Override // p153l.fpl
    public int getISPType() {
        return this.authImpl.getISPType();
    }

    @Override // p153l.fpl
    public Map<String, String> getRequestBodyMap() {
        checkInit();
        return this.authImpl.getRequestBodyMap();
    }

    public int init(xd1 xd1Var) {
        throw new IllegalStateException("authManagerConfig must not be null!");
    }

    @Override // p153l.fpl
    public void loginAuth(f7m f7mVar) {
        checkInit();
        this.authImpl.loginAuth(f7mVar);
    }

    @Override // p153l.fpl
    public void offerNumber(q1m q1mVar) {
        checkInit();
        this.authImpl.offerNumber(q1mVar);
    }

    private AuthManager() {
    }

    @Override // p153l.fpl
    public void loginAuth(f7m f7mVar, long j) {
        checkInit();
        this.authImpl.loginAuth(f7mVar, j);
    }

    @Override // p153l.fpl
    public void offerNumber(q1m q1mVar, long j) {
        checkInit();
        this.authImpl.offerNumber(q1mVar, j);
    }
}
