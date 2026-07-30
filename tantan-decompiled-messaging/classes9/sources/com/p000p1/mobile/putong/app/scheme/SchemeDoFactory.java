package com.p000p1.mobile.putong.app.scheme;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import l.f30;
import p006l.kxd0;
import p006l.w2e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SchemeDoFactory {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, kxd0> f1184a = new HashMap<>();

    public static class SchemeNullException extends Exception {
        public SchemeNullException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1576a(w2e0 w2e0Var, f30<String, String> f30Var) {
        kxd0 kxd0Var = f1184a.get(w2e0Var.m26158d());
        if (NullChecker.a(kxd0Var)) {
            kxd0Var.mo11681a(w2e0Var, f30Var);
            return;
        }
        CrashHelper.c(new SchemeNullException("scheme is null-->" + w2e0Var.m26157c()));
        if (NullChecker.a(f30Var)) {
            f30Var.call(w2e0Var.m26157c(), "scheme_message_no_handler_found");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m1577b(w2e0 w2e0Var, f30<String, String> f30Var) {
        kxd0 kxd0Var = f1184a.get(w2e0Var.m26158d());
        if (!NullChecker.b(kxd0Var)) {
            return null;
        }
        try {
            return kxd0Var.mo11682c(w2e0Var, f30Var);
        } catch (Exception e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m1578c(@NonNull String str, kxd0 kxd0Var) {
        if (f1184a.containsKey(str)) {
            return;
        }
        f1184a.put(str, kxd0Var);
    }
}
