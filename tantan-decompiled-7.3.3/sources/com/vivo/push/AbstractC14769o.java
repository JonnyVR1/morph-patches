package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.vivo.push.util.C14795p;
import p153l.wg3;

/* JADX INFO: renamed from: com.vivo.push.o */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC14769o {

    /* JADX INFO: renamed from: a */
    private int f61913a;

    /* JADX INFO: renamed from: b */
    private String f61914b;

    public AbstractC14769o(int i) {
        this.f61913a = -1;
        if (i >= 0) {
            this.f61913a = i;
        } else {
            wg3.m206174a("PushCommand: the value of command must > 0.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: e */
    private void m86099e(C14680a c14680a) {
        c14680a.m85884a(CommandMessage.COMMAND, this.f61913a);
        c14680a.m85887a("client_pkgname", this.f61914b);
        mo85914c(c14680a);
    }

    /* JADX INFO: renamed from: a */
    public final void m86101a(Intent intent) {
        C14680a c14680aM85881a = C14680a.m85881a(intent);
        if (c14680aM85881a == null) {
            C14795p.m86186b("PushCommand", "bundleWapper is null");
            return;
        }
        m86102a(c14680aM85881a);
        Bundle bundleM85893b = c14680aM85881a.m85893b();
        if (bundleM85893b != null) {
            intent.putExtras(bundleM85893b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86105b(Intent intent) {
        C14680a c14680aM85881a = C14680a.m85881a(intent);
        if (c14680aM85881a == null) {
            C14795p.m86186b("PushCommand", "bundleWapper is null");
            return;
        }
        c14680aM85881a.m85884a(FirebaseAnalytics.Param.METHOD, this.f61913a);
        m86099e(c14680aM85881a);
        Bundle bundleM85893b = c14680aM85881a.m85893b();
        if (bundleM85893b != null) {
            intent.putExtras(bundleM85893b);
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo85914c(C14680a c14680a);

    /* JADX INFO: renamed from: c */
    public boolean mo85953c() {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo85915d(C14680a c14680a);

    public String toString() {
        return getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: a */
    public final void m86103a(String str) {
        this.f61914b = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m86100a() {
        return this.f61914b;
    }

    /* JADX INFO: renamed from: a */
    public final void m86102a(C14680a c14680a) {
        String strM86107a = C14770p.m86107a(this.f61913a);
        if (strM86107a == null) {
            strM86107a = "";
        }
        c14680a.m85887a(FirebaseAnalytics.Param.METHOD, strM86107a);
        m86099e(c14680a);
    }

    /* JADX INFO: renamed from: b */
    public final int m86104b() {
        return this.f61913a;
    }

    /* JADX INFO: renamed from: b */
    public final void m86106b(C14680a c14680a) {
        String strM85882a = c14680a.m85882a();
        if (!TextUtils.isEmpty(strM85882a)) {
            this.f61914b = strM85882a;
        } else {
            this.f61914b = c14680a.m85883a("client_pkgname");
        }
        mo85915d(c14680a);
    }
}
