package com.cosmos.authlib;

import java.util.Map;
import p149l.p4m;
import p149l.qd1;
import p149l.qkq0;
import p149l.uml;
import p149l.vyl;

/* JADX INFO: loaded from: classes.dex */
public class AuthManager implements uml {
    private static final String TAG = "AuthManager";
    private uml authImpl;
    private qd1 authManagerConfig;

    /* JADX INFO: renamed from: com.cosmos.authlib.AuthManager$b */
    public static class C1410b {

        /* JADX INFO: renamed from: a */
        public static AuthManager f5792a = new AuthManager();
    }

    private void checkInit() {
        if (this.authImpl != null) {
            return;
        }
        qkq0.m175383a("init must be called first!");
    }

    public static AuthManager getInstance() {
        return C1410b.f5792a;
    }

    @Override // p149l.uml
    public int getISPType() {
        return this.authImpl.getISPType();
    }

    @Override // p149l.uml
    public Map<String, String> getRequestBodyMap() {
        checkInit();
        return this.authImpl.getRequestBodyMap();
    }

    public int init(qd1 qd1Var) {
        throw new IllegalStateException("authManagerConfig must not be null!");
    }

    @Override // p149l.uml
    public void loginAuth(p4m p4mVar) {
        checkInit();
        this.authImpl.loginAuth(p4mVar);
    }

    @Override // p149l.uml
    public void offerNumber(vyl vylVar) {
        checkInit();
        this.authImpl.offerNumber(vylVar);
    }

    private AuthManager() {
    }

    @Override // p149l.uml
    public void loginAuth(p4m p4mVar, long j) {
        checkInit();
        this.authImpl.loginAuth(p4mVar, j);
    }

    @Override // p149l.uml
    public void offerNumber(vyl vylVar, long j) {
        checkInit();
        this.authImpl.offerNumber(vylVar, j);
    }
}
