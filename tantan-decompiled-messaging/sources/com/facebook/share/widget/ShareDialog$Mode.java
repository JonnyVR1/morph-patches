package com.facebook.share.widget;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m87232d2 = {"com/facebook/share/widget/ShareDialog$Mode", "", "Lcom/facebook/share/widget/ShareDialog$Mode;", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "NATIVE", "WEB", "FEED", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public enum ShareDialog$Mode {
    AUTOMATIC,
    NATIVE,
    WEB,
    FEED;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ShareDialog$Mode[] valuesCustom() {
        ShareDialog$Mode[] shareDialog$ModeArrValuesCustom = values();
        return (ShareDialog$Mode[]) Arrays.copyOf(shareDialog$ModeArrValuesCustom, shareDialog$ModeArrValuesCustom.length);
    }
}
