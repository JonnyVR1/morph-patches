package com.facebook.share.model;

import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m88121d2 = {"com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy", "", "Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "<init>", "(Ljava/lang/String;I)V", "Open", "Closed", "facebook-common_release"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public enum AppGroupCreationContent$AppGroupPrivacy {
    Open,
    Closed;

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static AppGroupCreationContent$AppGroupPrivacy[] valuesCustom() {
        AppGroupCreationContent$AppGroupPrivacy[] appGroupCreationContent$AppGroupPrivacyArrValuesCustom = values();
        return (AppGroupCreationContent$AppGroupPrivacy[]) Arrays.copyOf(appGroupCreationContent$AppGroupPrivacyArrValuesCustom, appGroupCreationContent$AppGroupPrivacyArrValuesCustom.length);
    }
}
