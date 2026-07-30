package com.appsflyer.internal;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1dSDK {
    @Nullable
    /* JADX INFO: renamed from: t_ */
    public static Uri m5208t_(@Nullable Intent intent) {
        if (intent == null) {
            return null;
        }
        AFj1sSDK aFj1sSDK = new AFj1sSDK(intent);
        Uri uri = (Uri) ((Parcelable) aFj1sSDK.getMediationNetwork(new Function0() { // from class: com.appsflyer.internal.AFj1sSDK.4
            private /* synthetic */ String $getMonetizationNetwork;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09734() {
                super(0);
                str = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @org.jetbrains.annotations.Nullable
            /* JADX INFO: renamed from: J_ */
            public final Parcelable invoke() {
                return AFj1sSDK.this.getRevenue.getParcelableExtra(str);
            }
        }, "Error while trying to read android.intent.extra.REFERRER extra from intent", null, true));
        if (uri != null) {
            return uri;
        }
        String monetizationNetwork = aFj1sSDK.getMonetizationNetwork("android.intent.extra.REFERRER_NAME");
        if (monetizationNetwork != null) {
            return Uri.parse(monetizationNetwork);
        }
        return null;
    }
}
