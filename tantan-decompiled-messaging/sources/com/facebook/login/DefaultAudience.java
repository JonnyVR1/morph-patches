package com.facebook.login;

import kotlin.Metadata;
import org.eclipse.jetty.util.security.Constraint;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m87232d2 = {"Lcom/facebook/login/DefaultAudience;", "", "nativeProtocolAudience", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getNativeProtocolAudience", "()Ljava/lang/String;", Constraint.NONE, "ONLY_ME", "FRIENDS", "EVERYONE", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public enum DefaultAudience {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");


    @Nullable
    private final String nativeProtocolAudience;

    DefaultAudience(String str) {
        this.nativeProtocolAudience = str;
    }

    @Nullable
    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}
