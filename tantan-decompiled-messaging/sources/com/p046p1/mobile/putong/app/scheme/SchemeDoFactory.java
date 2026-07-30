package com.p046p1.mobile.putong.app.scheme;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p149l.f30;
import p149l.kxd0;
import p149l.w2e0;

/* JADX INFO: loaded from: classes9.dex */
public class SchemeDoFactory {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, kxd0> f17195a = new HashMap<>();

    public static class SchemeNullException extends Exception {
        public SchemeNullException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m29666a(w2e0 w2e0Var, f30<String, String> f30Var) {
        kxd0 kxd0Var = f17195a.get(w2e0Var.m201096d());
        if (NullChecker.m81303a(kxd0Var)) {
            kxd0Var.mo94421a(w2e0Var, f30Var);
            return;
        }
        CrashHelper.m81296c(new SchemeNullException("scheme is null-->" + w2e0Var.m201095c()));
        if (NullChecker.m81303a(f30Var)) {
            f30Var.call(w2e0Var.m201095c(), "scheme_message_no_handler_found");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m29667b(w2e0 w2e0Var, f30<String, String> f30Var) {
        kxd0 kxd0Var = f17195a.get(w2e0Var.m201096d());
        if (!NullChecker.m81304b(kxd0Var)) {
            return null;
        }
        try {
            return kxd0Var.mo94422c(w2e0Var, f30Var);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m29668c(@NonNull String str, kxd0 kxd0Var) {
        if (f17195a.containsKey(str)) {
            return;
        }
        f17195a.put(str, kxd0Var);
    }
}
