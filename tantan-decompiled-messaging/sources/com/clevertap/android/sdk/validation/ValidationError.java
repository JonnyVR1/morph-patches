package com.clevertap.android.sdk.validation;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010)\u001a\u00020\u00052\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050+\"\u00020\u0005¢\u0006\u0002\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(¨\u0006-"}, m87232d2 = {"Lcom/clevertap/android/sdk/validation/ValidationError;", "", "code", "", "messageTemplate", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "EVENT_NAME_NULL", "EVENT_NAME_TOO_LONG", "EVENT_NAME_INVALID_CHARACTERS", "INVALID_COUNTRY_CODE", "INVALID_PHONE", "EMPTY_KEY", "EMPTY_KEY_ABORT", "PROP_VALUE_NOT_PRIMITIVE", "CHANNEL_ID_MISSING_IN_PAYLOAD", "CHANNEL_ID_NOT_REGISTERED", "NOTIFICATION_VIEWED_DISABLED", "RESTRICTED_EVENT_NAME", "DISCARDED_EVENT_NAME", "USE_CUSTOM_ID_FALLBACK", "USE_CUSTOM_ID_MISSING_IN_MANIFEST", "UNABLE_TO_SET_CT_CUSTOM_ID", "INVALID_CT_CUSTOM_ID", "KEY_INVALID_CHARACTERS", "KEY_LENGTH_EXCEEDED", "VALUE_CHARS_LIMIT_EXCEEDED", "VALUE_INVALID_CHARACTERS", "CHARGED_EVENT_TOO_MANY_ITEMS", "RESTRICTED_MULTI_VALUE_KEY", "PROFILE_IDENTIFIERS_MISMATCH", "DEPTH_LIMIT_EXCEEDED", "ARRAY_KEY_COUNT_LIMIT_EXCEEDED", "OBJECT_KEY_COUNT_LIMIT_EXCEEDED", "ARRAY_LENGTH_LIMIT_EXCEEDED", "KV_PAIR_COUNT_LIMIT_EXCEEDED", "NULL_VALUE_REMOVED", "EMPTY_VALUE_REMOVED", "getMessage", "values", "", "([Ljava/lang/String;)Ljava/lang/String;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public enum ValidationError {
    EVENT_NAME_NULL(510, "Event Name is null/empty"),
    EVENT_NAME_TOO_LONG(510, "Event name '%s' exceeds the limit of %s characters. Trimmed to '%s'"),
    EVENT_NAME_INVALID_CHARACTERS(510, "Event name '%s' contains invalid characters. Cleaned to '%s'"),
    INVALID_COUNTRY_CODE(512, "Device country code not available and profile phone: %s does not appear to start with country code"),
    INVALID_PHONE(512, "Invalid phone number"),
    EMPTY_KEY(512, "Found an empty key. Skipping and continuing"),
    EMPTY_KEY_ABORT(512, "Found an empty key. Aborting the operation"),
    PROP_VALUE_NOT_PRIMITIVE(512, "Property value for property %s wasn't a primitive (%s)"),
    CHANNEL_ID_MISSING_IN_PAYLOAD(512, "ChannelId is required for API 26+ but not provided in the notification payload. Falling to default channel: %s"),
    CHANNEL_ID_NOT_REGISTERED(512, "Unable to render notification on channelId: %s as it is not registered by the app. Falling to default channel. "),
    NOTIFICATION_VIEWED_DISABLED(512, "Recording of Notification Viewed is disabled in the CleverTap Dashboard for notification payload: %s"),
    RESTRICTED_EVENT_NAME(513, "%s is a restricted event name. Last event aborted."),
    DISCARDED_EVENT_NAME(513, "%s is a discarded event name. Last event aborted."),
    USE_CUSTOM_ID_FALLBACK(514, "CLEVERTAP_USE_CUSTOM_ID has been specified in the AndroidManifest.xml/Instance Configuration. CleverTap SDK will create a fallback device ID"),
    USE_CUSTOM_ID_MISSING_IN_MANIFEST(514, "CLEVERTAP_USE_CUSTOM_ID has not been specified in the AndroidManifest.xml. Custom CleverTap ID passed will not be used."),
    UNABLE_TO_SET_CT_CUSTOM_ID(514, "CleverTap ID - %s already exists. Unable to set custom CleverTap ID - %s"),
    INVALID_CT_CUSTOM_ID(514, "Attempted to set invalid custom CleverTap ID - %s, falling back to default error CleverTap ID - %s"),
    KEY_INVALID_CHARACTERS(520, "Key '%s' contains invalid characters. Cleaned to '%s'"),
    KEY_LENGTH_EXCEEDED(520, "Key '%s' exceeds the limit of %s characters. Trimmed to '%s'"),
    VALUE_CHARS_LIMIT_EXCEEDED(521, "Value '%s' for key '%s' exceeds the limit of %s characters. Trimmed to '%s'"),
    VALUE_INVALID_CHARACTERS(521, "Value '%s' for key '%s' contains invalid characters. Cleaned to '%s'"),
    CHARGED_EVENT_TOO_MANY_ITEMS(522, "Charged event contained more than 50 items."),
    RESTRICTED_MULTI_VALUE_KEY(523, "%s... is a restricted key for multi-value properties. Dropped."),
    PROFILE_IDENTIFIERS_MISMATCH(531, "Profile Identifiers mismatch with the previously saved ones"),
    DEPTH_LIMIT_EXCEEDED(540, "Event data exceeded maximum nesting depth. Depth: %s, Limit: %s"),
    ARRAY_KEY_COUNT_LIMIT_EXCEEDED(541, "Event data exceeded maximum array key count. Count: %s, Limit: %s"),
    OBJECT_KEY_COUNT_LIMIT_EXCEEDED(542, "Event data exceeded maximum object key count. Count: %s, Limit: %s"),
    ARRAY_LENGTH_LIMIT_EXCEEDED(543, "Event data exceeded maximum array length. Length: %s, Limit: %s"),
    KV_PAIR_COUNT_LIMIT_EXCEEDED(544, "Event data exceeded maximum key-value pair count. Count: %s, Limit: %s"),
    NULL_VALUE_REMOVED(545, "Null value for key '%s' was removed"),
    EMPTY_VALUE_REMOVED(545, "Empty value for key '%s' was removed");

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m87385a(values());
    private final int code;

    @NotNull
    private final String messageTemplate;

    ValidationError(int i, String str) {
        this.code = i;
        this.messageTemplate = str;
    }

    @NotNull
    public static EnumEntries<ValidationError> getEntries() {
        return $ENTRIES;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMessage(@NotNull String... values) {
        values.getClass();
        if (values.length == 0) {
            return this.messageTemplate;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = this.messageTemplate;
        Object[] objArrCopyOf = Arrays.copyOf(values, values.length);
        return String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
