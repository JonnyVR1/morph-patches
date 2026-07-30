package com.clevertap.android.sdk.pushnotification;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import p149l.ceb0;
import p149l.ggb0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PushNotificationUtil {
    private PushNotificationUtil() {
    }

    /* JADX INFO: renamed from: a */
    public static String m6929a(String str, String str2) {
        return str + "_" + str2;
    }

    /* JADX INFO: renamed from: b */
    public static ArrayList<ggb0> m6930b() {
        ArrayList<ggb0> arrayList = new ArrayList<>();
        arrayList.add(ceb0.f80450a);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static String m6931c(Bundle bundle) {
        return bundle != null ? bundle.getString(Constants.WZRK_PUSH_ID, "") : "";
    }

    public static String getAccountIdFromNotificationBundle(Bundle bundle) {
        return bundle != null ? bundle.getString(Constants.WZRK_ACCT_ID_KEY, "") : "";
    }
}
