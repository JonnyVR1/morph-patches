package com.p000p1.mobile.putong.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.Detect;
import com.p1.mobile.putong.data.DetectCategoryType;
import l.d30;
import l.roj0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AntiSpamHelper {

    public static class AntispamException extends IllegalStateException {
        public String errorType;

        public AntispamException(String str, String str2) {
            super(str);
            this.errorType = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m10617a(Detect detect, String str) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static c<roj0> m10618b(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3) {
        return c.just(roj0.a);
    }

    /* JADX INFO: renamed from: c */
    public static void m10619c(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3, @NonNull d30 d30Var, @Nullable d30 d30Var2) {
        d30Var.call();
    }
}
