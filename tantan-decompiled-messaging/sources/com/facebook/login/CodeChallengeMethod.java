package com.facebook.login;

import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/facebook/login/CodeChallengeMethod;", "", BLiveStormDanmakuGiftResourceType.f44446s, "", "(Ljava/lang/String;ILjava/lang/String;)V", "S256", "PLAIN", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    /* synthetic */ CodeChallengeMethod(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "S256" : str);
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CodeChallengeMethod[] valuesCustom() {
        CodeChallengeMethod[] codeChallengeMethodArrValuesCustom = values();
        return (CodeChallengeMethod[]) Arrays.copyOf(codeChallengeMethodArrValuesCustom, codeChallengeMethodArrValuesCustom.length);
    }

    CodeChallengeMethod(String str) {
    }
}
