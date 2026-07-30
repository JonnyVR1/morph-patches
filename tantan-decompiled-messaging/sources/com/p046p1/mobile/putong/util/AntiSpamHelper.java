package com.p046p1.mobile.putong.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Detect;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import p133rx.C22306c;
import p149l.d30;
import p149l.roj0;

/* JADX INFO: loaded from: classes11.dex */
public class AntiSpamHelper {

    public static class AntispamException extends IllegalStateException {
        public String errorType;

        public AntispamException(String str, String str2) {
            super(str);
            this.errorType = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m80266a(Detect detect, String str) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C22306c<roj0> m80267b(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3) {
        return C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: c */
    public static void m80268c(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3, @NonNull d30 d30Var, @Nullable d30 d30Var2) {
        d30Var.call();
    }
}
