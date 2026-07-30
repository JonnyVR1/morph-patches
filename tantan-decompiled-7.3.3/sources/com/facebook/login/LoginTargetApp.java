package com.facebook.login;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m88120d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m88121d2 = {"Lcom/facebook/login/LoginTargetApp;", "", "", "targetApp", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", "a", "FACEBOOK", "INSTAGRAM", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public enum LoginTargetApp {
    FACEBOOK("facebook"),
    INSTAGRAM("instagram");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String targetApp;

    /* JADX INFO: renamed from: com.facebook.login.LoginTargetApp$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/facebook/login/LoginTargetApp$a;", "", "<init>", "()V", "", "stringValue", "Lcom/facebook/login/LoginTargetApp;", "a", "(Ljava/lang/String;)Lcom/facebook/login/LoginTargetApp;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final LoginTargetApp m9174a(@Nullable String stringValue) {
            for (LoginTargetApp loginTargetApp : LoginTargetApp.values()) {
                if (Intrinsics.m88377d(loginTargetApp.toString(), stringValue)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }

        public Companion() {
        }
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    @JvmStatic
    @NotNull
    public static final LoginTargetApp fromString(@Nullable String str) {
        return INSTANCE.m9174a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.targetApp;
    }
}
