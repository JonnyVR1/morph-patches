package com.clevertap.android.sdk.network;

import com.clevertap.android.sdk.events.EventGroup;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p149l.l9r;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/EndpointId;", "", "", "identifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "Companion", "a", "ENDPOINT_SPIKY", "ENDPOINT_A1", "ENDPOINT_HELLO", "ENDPOINT_DEFINE_VARS", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum EndpointId {
    ENDPOINT_SPIKY("-spiky"),
    ENDPOINT_A1("/a1"),
    ENDPOINT_HELLO("/hello"),
    ENDPOINT_DEFINE_VARS("/defineVars");


    @NotNull
    private final String identifier;
    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.clevertap.android.sdk.network.EndpointId$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Lcom/clevertap/android/sdk/network/EndpointId$a;", "", "<init>", "()V", "", "identifier", "Lcom/clevertap/android/sdk/network/EndpointId;", "b", "(Ljava/lang/String;)Lcom/clevertap/android/sdk/network/EndpointId;", "Lcom/clevertap/android/sdk/events/EventGroup;", "eventGroup", "a", "(Lcom/clevertap/android/sdk/events/EventGroup;)Lcom/clevertap/android/sdk/network/EndpointId;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* JADX INFO: renamed from: com.clevertap.android.sdk.network.EndpointId$a$a */
        @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f5380a;

            static {
                int[] iArr = new int[EventGroup.values().length];
                try {
                    iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EventGroup.REGULAR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EventGroup.VARIABLES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f5380a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final EndpointId m6787a(@NotNull EventGroup eventGroup) {
            eventGroup.getClass();
            int i = a.f5380a[eventGroup.ordinal()];
            if (i == 1) {
                return EndpointId.ENDPOINT_SPIKY;
            }
            if (i == 2) {
                return EndpointId.ENDPOINT_A1;
            }
            if (i == 3) {
                return EndpointId.ENDPOINT_DEFINE_VARS;
            }
            l9r.m149037a();
            return null;
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: b */
        public final EndpointId m6788b(@NotNull String identifier) {
            EndpointId endpointId;
            identifier.getClass();
            EndpointId[] endpointIdArrValues = EndpointId.values();
            int length = endpointIdArrValues.length;
            int i = 0;
            while (true) {
                endpointId = null;
                if (i >= length) {
                    break;
                }
                EndpointId endpointId2 = endpointIdArrValues[i];
                if (StringsKt.m93412P(identifier, endpointId2.getIdentifier(), false, 2, null)) {
                    endpointId = endpointId2;
                    break;
                }
                i++;
            }
            return endpointId == null ? EndpointId.ENDPOINT_A1 : endpointId;
        }

        private Companion() {
        }
    }

    EndpointId(String str) {
        this.identifier = str;
    }

    @JvmStatic
    @NotNull
    public static final EndpointId fromEventGroup(@NotNull EventGroup eventGroup) {
        return INSTANCE.m6787a(eventGroup);
    }

    @JvmStatic
    @NotNull
    public static final EndpointId fromString(@NotNull String str) {
        return INSTANCE.m6788b(str);
    }

    @NotNull
    public static EnumEntries<EndpointId> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }
}
