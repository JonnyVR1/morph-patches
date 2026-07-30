package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import p153l.l01;
import p153l.ypg0;

/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new RemoteMessageCreator();
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_NORMAL = 2;
    public static final int PRIORITY_UNKNOWN = 0;

    @SafeParcelable.Field(m12517id = 2)
    Bundle bundle;
    private Map<String, String> data;
    private Notification notification;

    public static class Builder {
        private final Bundle bundle;
        private final Map<String, String> data;

        public Builder(@NonNull String str) {
            Bundle bundle = new Bundle();
            this.bundle = bundle;
            this.data = new l01();
            if (TextUtils.isEmpty(str)) {
                ypg0.m217021a("Invalid to: ", str);
                throw null;
            }
            bundle.putString(Constants.MessagePayloadKeys.f11502TO, str);
        }

        @NonNull
        public Builder addData(@NonNull String str, @Nullable String str2) {
            this.data.put(str, str2);
            return this;
        }

        @NonNull
        public RemoteMessage build() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.data.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.bundle);
            this.bundle.remove("from");
            return new RemoteMessage(bundle);
        }

        @NonNull
        public Builder clearData() {
            this.data.clear();
            return this;
        }

        @Nullable
        public String getCollapseKey() {
            return this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @NonNull
        public Map<String, String> getData() {
            return this.data;
        }

        @NonNull
        public String getMessageId() {
            return this.bundle.getString(Constants.MessagePayloadKeys.MSGID, "");
        }

        @Nullable
        public String getMessageType() {
            return this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
        }

        @IntRange(from = 0, to = 86400)
        public int getTtl() {
            return Integer.parseInt(this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE, "0"));
        }

        @NonNull
        public Builder setCollapseKey(@Nullable String str) {
            this.bundle.putString(Constants.MessagePayloadKeys.COLLAPSE_KEY, str);
            return this;
        }

        @NonNull
        public Builder setData(@NonNull Map<String, String> map) {
            this.data.clear();
            this.data.putAll(map);
            return this;
        }

        @NonNull
        public Builder setMessageId(@NonNull String str) {
            this.bundle.putString(Constants.MessagePayloadKeys.MSGID, str);
            return this;
        }

        @NonNull
        public Builder setMessageType(@Nullable String str) {
            this.bundle.putString(Constants.MessagePayloadKeys.MESSAGE_TYPE, str);
            return this;
        }

        @NonNull
        @ShowFirstParty
        public Builder setRawData(byte[] bArr) {
            this.bundle.putByteArray(Constants.MessagePayloadKeys.RAW_DATA, bArr);
            return this;
        }

        @NonNull
        public Builder setTtl(@IntRange(from = 0, to = 86400) int i) {
            this.bundle.putString(Constants.MessagePayloadKeys.TTL, String.valueOf(i));
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface MessagePriority {
    }

    public static class Notification {
        private final String body;
        private final String[] bodyLocArgs;
        private final String bodyLocKey;
        private final String channelId;
        private final String clickAction;
        private final String color;
        private final boolean defaultLightSettings;
        private final boolean defaultSound;
        private final boolean defaultVibrateTimings;
        private final Long eventTime;
        private final String icon;
        private final String imageUrl;
        private final int[] lightSettings;
        private final Uri link;
        private final boolean localOnly;
        private final Integer notificationCount;
        private final Integer notificationPriority;
        private final String sound;
        private final boolean sticky;
        private final String tag;
        private final String ticker;
        private final String title;
        private final String[] titleLocArgs;
        private final String titleLocKey;
        private final long[] vibrateTimings;
        private final Integer visibility;

        private Notification(NotificationParams notificationParams) {
            this.title = notificationParams.getString(Constants.MessageNotificationKeys.TITLE);
            this.titleLocKey = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.TITLE);
            this.titleLocArgs = getLocalizationArgs(notificationParams, Constants.MessageNotificationKeys.TITLE);
            this.body = notificationParams.getString(Constants.MessageNotificationKeys.BODY);
            this.bodyLocKey = notificationParams.getLocalizationResourceForKey(Constants.MessageNotificationKeys.BODY);
            this.bodyLocArgs = getLocalizationArgs(notificationParams, Constants.MessageNotificationKeys.BODY);
            this.icon = notificationParams.getString(Constants.MessageNotificationKeys.ICON);
            this.sound = notificationParams.getSoundResourceName();
            this.tag = notificationParams.getString(Constants.MessageNotificationKeys.TAG);
            this.color = notificationParams.getString(Constants.MessageNotificationKeys.COLOR);
            this.clickAction = notificationParams.getString(Constants.MessageNotificationKeys.CLICK_ACTION);
            this.channelId = notificationParams.getString(Constants.MessageNotificationKeys.CHANNEL);
            this.link = notificationParams.getLink();
            this.imageUrl = notificationParams.getString(Constants.MessageNotificationKeys.IMAGE_URL);
            this.ticker = notificationParams.getString(Constants.MessageNotificationKeys.TICKER);
            this.notificationPriority = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_PRIORITY);
            this.visibility = notificationParams.getInteger(Constants.MessageNotificationKeys.VISIBILITY);
            this.notificationCount = notificationParams.getInteger(Constants.MessageNotificationKeys.NOTIFICATION_COUNT);
            this.sticky = notificationParams.getBoolean(Constants.MessageNotificationKeys.STICKY);
            this.localOnly = notificationParams.getBoolean(Constants.MessageNotificationKeys.LOCAL_ONLY);
            this.defaultSound = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_SOUND);
            this.defaultVibrateTimings = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_VIBRATE_TIMINGS);
            this.defaultLightSettings = notificationParams.getBoolean(Constants.MessageNotificationKeys.DEFAULT_LIGHT_SETTINGS);
            this.eventTime = notificationParams.getLong(Constants.MessageNotificationKeys.EVENT_TIME);
            this.lightSettings = notificationParams.getLightSettings();
            this.vibrateTimings = notificationParams.getVibrateTimings();
        }

        private static String[] getLocalizationArgs(NotificationParams notificationParams, String str) {
            Object[] localizationArgsForKey = notificationParams.getLocalizationArgsForKey(str);
            if (localizationArgsForKey == null) {
                return null;
            }
            String[] strArr = new String[localizationArgsForKey.length];
            for (int i = 0; i < localizationArgsForKey.length; i++) {
                strArr[i] = String.valueOf(localizationArgsForKey[i]);
            }
            return strArr;
        }

        @Nullable
        public String getBody() {
            return this.body;
        }

        @Nullable
        public String[] getBodyLocalizationArgs() {
            return this.bodyLocArgs;
        }

        @Nullable
        public String getBodyLocalizationKey() {
            return this.bodyLocKey;
        }

        @Nullable
        public String getChannelId() {
            return this.channelId;
        }

        @Nullable
        public String getClickAction() {
            return this.clickAction;
        }

        @Nullable
        public String getColor() {
            return this.color;
        }

        public boolean getDefaultLightSettings() {
            return this.defaultLightSettings;
        }

        public boolean getDefaultSound() {
            return this.defaultSound;
        }

        public boolean getDefaultVibrateSettings() {
            return this.defaultVibrateTimings;
        }

        @Nullable
        public Long getEventTime() {
            return this.eventTime;
        }

        @Nullable
        public String getIcon() {
            return this.icon;
        }

        @Nullable
        public Uri getImageUrl() {
            String str = this.imageUrl;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        @Nullable
        public int[] getLightSettings() {
            return this.lightSettings;
        }

        @Nullable
        public Uri getLink() {
            return this.link;
        }

        public boolean getLocalOnly() {
            return this.localOnly;
        }

        @Nullable
        public Integer getNotificationCount() {
            return this.notificationCount;
        }

        @Nullable
        public Integer getNotificationPriority() {
            return this.notificationPriority;
        }

        @Nullable
        public String getSound() {
            return this.sound;
        }

        public boolean getSticky() {
            return this.sticky;
        }

        @Nullable
        public String getTag() {
            return this.tag;
        }

        @Nullable
        public String getTicker() {
            return this.ticker;
        }

        @Nullable
        public String getTitle() {
            return this.title;
        }

        @Nullable
        public String[] getTitleLocalizationArgs() {
            return this.titleLocArgs;
        }

        @Nullable
        public String getTitleLocalizationKey() {
            return this.titleLocKey;
        }

        @Nullable
        public long[] getVibrateTimings() {
            return this.vibrateTimings;
        }

        @Nullable
        public Integer getVisibility() {
            return this.visibility;
        }
    }

    @SafeParcelable.Constructor
    public RemoteMessage(@SafeParcelable.Param(m12518id = 2) Bundle bundle) {
        this.bundle = bundle;
    }

    private int getMessagePriority(String str) {
        if (com.clevertap.android.sdk.Constants.PRIORITY_HIGH.equals(str)) {
            return 1;
        }
        return "normal".equals(str) ? 2 : 0;
    }

    @Nullable
    public String getCollapseKey() {
        return this.bundle.getString(Constants.MessagePayloadKeys.COLLAPSE_KEY);
    }

    @NonNull
    public Map<String, String> getData() {
        if (this.data == null) {
            this.data = Constants.MessagePayloadKeys.extractDeveloperDefinedPayload(this.bundle);
        }
        return this.data;
    }

    @Nullable
    public String getFrom() {
        return this.bundle.getString("from");
    }

    @Nullable
    public String getMessageId() {
        String string = this.bundle.getString(Constants.MessagePayloadKeys.MSGID);
        return string == null ? this.bundle.getString(Constants.MessagePayloadKeys.MSGID_SERVER) : string;
    }

    @Nullable
    public String getMessageType() {
        return this.bundle.getString(Constants.MessagePayloadKeys.MESSAGE_TYPE);
    }

    @Nullable
    public Notification getNotification() {
        if (this.notification == null && NotificationParams.isNotification(this.bundle)) {
            this.notification = new Notification(new NotificationParams(this.bundle));
        }
        return this.notification;
    }

    public int getOriginalPriority() {
        String string = this.bundle.getString(Constants.MessagePayloadKeys.ORIGINAL_PRIORITY);
        if (string == null) {
            string = this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    public int getPriority() {
        String string = this.bundle.getString(Constants.MessagePayloadKeys.DELIVERED_PRIORITY);
        if (string == null) {
            if ("1".equals(this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_REDUCED_V19))) {
                return 2;
            }
            string = this.bundle.getString(Constants.MessagePayloadKeys.PRIORITY_V19);
        }
        return getMessagePriority(string);
    }

    @Nullable
    @ShowFirstParty
    public byte[] getRawData() {
        return this.bundle.getByteArray(Constants.MessagePayloadKeys.RAW_DATA);
    }

    @Nullable
    public String getSenderId() {
        return this.bundle.getString(Constants.MessagePayloadKeys.SENDER_ID);
    }

    public long getSentTime() {
        Object obj = this.bundle.get(Constants.MessagePayloadKeys.SENT_TIME);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0L;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    @Nullable
    public String getTo() {
        return this.bundle.getString(Constants.MessagePayloadKeys.f11502TO);
    }

    public int getTtl() {
        Object obj = this.bundle.get(Constants.MessagePayloadKeys.TTL);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public void populateSendMessageIntent(Intent intent) {
        intent.putExtras(this.bundle);
    }

    @KeepForSdk
    public Intent toIntent() {
        Intent intent = new Intent();
        intent.putExtras(this.bundle);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        RemoteMessageCreator.writeToParcel(this, parcel, i);
    }
}
