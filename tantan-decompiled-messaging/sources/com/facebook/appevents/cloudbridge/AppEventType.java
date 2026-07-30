package com.facebook.appevents.cloudbridge;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "MOBILE_APP_INSTALL", "CUSTOM", "OTHER", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public enum AppEventType {
    MOBILE_APP_INSTALL,
    CUSTOM,
    OTHER;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.facebook.appevents.cloudbridge.AppEventType$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/facebook/appevents/cloudbridge/AppEventType$a;", "", "<init>", "()V", "", "rawValue", "Lcom/facebook/appevents/cloudbridge/AppEventType;", "a", "(Ljava/lang/String;)Lcom/facebook/appevents/cloudbridge/AppEventType;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final AppEventType m7666a(@NotNull String rawValue) {
            rawValue.getClass();
            if (Intrinsics.m87488d(rawValue, "MOBILE_APP_INSTALL")) {
                return AppEventType.MOBILE_APP_INSTALL;
            }
            return Intrinsics.m87488d(rawValue, "CUSTOM_APP_EVENTS") ? AppEventType.CUSTOM : AppEventType.OTHER;
        }

        public Companion() {
        }
    }
}
