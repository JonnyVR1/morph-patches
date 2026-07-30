package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.vivo.push.util.C14647p;
import p149l.ig3;

/* JADX INFO: renamed from: com.vivo.push.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14621o {

    /* JADX INFO: renamed from: a */
    private int f61066a;

    /* JADX INFO: renamed from: b */
    private String f61067b;

    public AbstractC14621o(int i) {
        this.f61066a = -1;
        if (i >= 0) {
            this.f61066a = i;
        } else {
            ig3.m135964a("PushCommand: the value of command must > 0.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m84928e(C14532a c14532a) {
        c14532a.m84713a(CommandMessage.COMMAND, this.f61066a);
        c14532a.m84716a("client_pkgname", this.f61067b);
        mo84743c(c14532a);
    }

    /* JADX INFO: renamed from: a */
    public final void m84930a(Intent intent) {
        C14532a c14532aM84710a = C14532a.m84710a(intent);
        if (c14532aM84710a == null) {
            C14647p.m85015b("PushCommand", "bundleWapper is null");
            return;
        }
        m84931a(c14532aM84710a);
        Bundle bundleM84722b = c14532aM84710a.m84722b();
        if (bundleM84722b != null) {
            intent.putExtras(bundleM84722b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m84934b(Intent intent) {
        C14532a c14532aM84710a = C14532a.m84710a(intent);
        if (c14532aM84710a == null) {
            C14647p.m85015b("PushCommand", "bundleWapper is null");
            return;
        }
        c14532aM84710a.m84713a(FirebaseAnalytics.Param.METHOD, this.f61066a);
        m84928e(c14532aM84710a);
        Bundle bundleM84722b = c14532aM84710a.m84722b();
        if (bundleM84722b != null) {
            intent.putExtras(bundleM84722b);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo84743c(C14532a c14532a);

    /* JADX INFO: renamed from: c */
    public boolean mo84782c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo84744d(C14532a c14532a);

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public final void m84932a(String str) {
        this.f61067b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m84929a() {
        return this.f61067b;
    }

    /* JADX INFO: renamed from: a */
    public final void m84931a(C14532a c14532a) {
        String strM84936a = C14622p.m84936a(this.f61066a);
        if (strM84936a == null) {
            strM84936a = "";
        }
        c14532a.m84716a(FirebaseAnalytics.Param.METHOD, strM84936a);
        m84928e(c14532a);
    }

    /* JADX INFO: renamed from: b */
    public final int m84933b() {
        return this.f61066a;
    }

    /* JADX INFO: renamed from: b */
    public final void m84935b(C14532a c14532a) {
        String strM84711a = c14532a.m84711a();
        if (!TextUtils.isEmpty(strM84711a)) {
            this.f61067b = strM84711a;
        } else {
            this.f61067b = c14532a.m84712a("client_pkgname");
        }
        mo84744d(c14532a);
    }
}
