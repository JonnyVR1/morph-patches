package com.p051p1.mobile.putong.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Detect;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import p137rx.C22421c;
import p153l.uxj0;
import p153l.x20;

/* JADX INFO: loaded from: classes10.dex */
public class AntiSpamHelper {

    public static class AntispamException extends IllegalStateException {
        public String errorType;

        public AntispamException(String str, String str2) {
            super(str);
            this.errorType = str2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m81449a(Detect detect, String str) {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static C22421c<uxj0> m81450b(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3) {
        return C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: c */
    public static void m81451c(Act act, String str, DetectCategoryType detectCategoryType, String str2, String str3, @NonNull x20 x20Var, @Nullable x20 x20Var2) {
        x20Var.call();
    }
}
