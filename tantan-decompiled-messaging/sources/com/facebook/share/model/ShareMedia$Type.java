package com.facebook.share.model;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"com/facebook/share/model/ShareMedia$Type", "", "Lcom/facebook/share/model/ShareMedia$Type;", "<init>", "(Ljava/lang/String;I)V", "PHOTO", "VIDEO", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public enum ShareMedia$Type {
    PHOTO,
    VIDEO;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static ShareMedia$Type[] valuesCustom() {
        ShareMedia$Type[] shareMedia$TypeArrValuesCustom = values();
        return (ShareMedia$Type[]) Arrays.copyOf(shareMedia$TypeArrValuesCustom, shareMedia$TypeArrValuesCustom.length);
    }
}
