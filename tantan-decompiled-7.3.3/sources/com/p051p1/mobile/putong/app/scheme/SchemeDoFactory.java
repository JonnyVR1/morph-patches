package com.p051p1.mobile.putong.app.scheme;

import android.content.Intent;
import androidx.annotation.NonNull;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import p153l.abe0;
import p153l.o5e0;
import p153l.z20;

/* JADX INFO: loaded from: classes9.dex */
public class SchemeDoFactory {

    /* JADX INFO: renamed from: a */
    public static HashMap<String, o5e0> f17914a = new HashMap<>();

    public static class SchemeNullException extends Exception {
        public SchemeNullException(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m30664a(abe0 abe0Var, z20<String, String> z20Var) {
        o5e0 o5e0Var = f17914a.get(abe0Var.m96741d());
        if (NullChecker.m82486a(o5e0Var)) {
            o5e0Var.mo95798a(abe0Var, z20Var);
            return;
        }
        CrashHelper.m82479c(new SchemeNullException("scheme is null-->" + abe0Var.m96740c()));
        if (NullChecker.m82486a(z20Var)) {
            z20Var.call(abe0Var.m96740c(), "scheme_message_no_handler_found");
        }
    }

    /* JADX INFO: renamed from: b */
    public static Intent m30665b(abe0 abe0Var, z20<String, String> z20Var) {
        o5e0 o5e0Var = f17914a.get(abe0Var.m96741d());
        if (!NullChecker.m82487b(o5e0Var)) {
            return null;
        }
        try {
            return o5e0Var.mo95799c(abe0Var, z20Var);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m30666c(@NonNull String str, o5e0 o5e0Var) {
        if (f17914a.containsKey(str)) {
            return;
        }
        f17914a.put(str, o5e0Var);
    }
}
