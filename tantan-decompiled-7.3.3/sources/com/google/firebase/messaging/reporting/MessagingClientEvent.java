package com.google.firebase.messaging.reporting;

import com.google.firebase.encoders.proto.ProtoEnum;
import com.google.firebase.encoders.proto.Protobuf;

/* JADX INFO: loaded from: classes7.dex */
public final class MessagingClientEvent {
    private static final MessagingClientEvent DEFAULT_INSTANCE = new Builder().build();
    private final String analytics_label_;
    private final long bulk_id_;
    private final long campaign_id_;
    private final String collapse_key_;
    private final String composer_label_;
    private final Event event_;
    private final String instance_id_;
    private final String message_id_;
    private final MessageType message_type_;
    private final String package_name_;
    private final int priority_;
    private final long project_number_;
    private final SDKPlatform sdk_platform_;
    private final String topic_;
    private final int ttl_;

    public static final class Builder {
        private long project_number_ = 0;
        private String message_id_ = "";
        private String instance_id_ = "";
        private MessageType message_type_ = MessageType.UNKNOWN;
        private SDKPlatform sdk_platform_ = SDKPlatform.UNKNOWN_OS;
        private String package_name_ = "";
        private String collapse_key_ = "";
        private int priority_ = 0;
        private int ttl_ = 0;
        private String topic_ = "";
        private long bulk_id_ = 0;
        private Event event_ = Event.UNKNOWN_EVENT;
        private String analytics_label_ = "";
        private long campaign_id_ = 0;
        private String composer_label_ = "";

        public MessagingClientEvent build() {
            return new MessagingClientEvent(this.project_number_, this.message_id_, this.instance_id_, this.message_type_, this.sdk_platform_, this.package_name_, this.collapse_key_, this.priority_, this.ttl_, this.topic_, this.bulk_id_, this.event_, this.analytics_label_, this.campaign_id_, this.composer_label_);
        }

        public Builder setAnalyticsLabel(String str) {
            this.analytics_label_ = str;
            return this;
        }

        public Builder setBulkId(long j) {
            this.bulk_id_ = j;
            return this;
        }

        public Builder setCampaignId(long j) {
            this.campaign_id_ = j;
            return this;
        }

        public Builder setCollapseKey(String str) {
            this.collapse_key_ = str;
            return this;
        }

        public Builder setComposerLabel(String str) {
            this.composer_label_ = str;
            return this;
        }

        public Builder setEvent(Event event) {
            this.event_ = event;
            return this;
        }

        public Builder setInstanceId(String str) {
            this.instance_id_ = str;
            return this;
        }

        public Builder setMessageId(String str) {
            this.message_id_ = str;
            return this;
        }

        public Builder setMessageType(MessageType messageType) {
            this.message_type_ = messageType;
            return this;
        }

        public Builder setPackageName(String str) {
            this.package_name_ = str;
            return this;
        }

        public Builder setPriority(int i) {
            this.priority_ = i;
            return this;
        }

        public Builder setProjectNumber(long j) {
            this.project_number_ = j;
            return this;
        }

        public Builder setSdkPlatform(SDKPlatform sDKPlatform) {
            this.sdk_platform_ = sDKPlatform;
            return this;
        }

        public Builder setTopic(String str) {
            this.topic_ = str;
            return this;
        }

        public Builder setTtl(int i) {
            this.ttl_ = i;
            return this;
        }
    }

    public enum Event implements ProtoEnum {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements ProtoEnum {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements ProtoEnum {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        public int getNumber() {
            return this.number_;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, int i2, String str5, long j2, Event event, String str6, long j3, String str7) {
        this.project_number_ = j;
        this.message_id_ = str;
        this.instance_id_ = str2;
        this.message_type_ = messageType;
        this.sdk_platform_ = sDKPlatform;
        this.package_name_ = str3;
        this.collapse_key_ = str4;
        this.priority_ = i;
        this.ttl_ = i2;
        this.topic_ = str5;
        this.bulk_id_ = j2;
        this.event_ = event;
        this.analytics_label_ = str6;
        this.campaign_id_ = j3;
        this.composer_label_ = str7;
    }

    public static MessagingClientEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Protobuf(tag = 13)
    public String getAnalyticsLabel() {
        return this.analytics_label_;
    }

    @Protobuf(tag = 11)
    public long getBulkId() {
        return this.bulk_id_;
    }

    @Protobuf(tag = 14)
    public long getCampaignId() {
        return this.campaign_id_;
    }

    @Protobuf(tag = 7)
    public String getCollapseKey() {
        return this.collapse_key_;
    }

    @Protobuf(tag = 15)
    public String getComposerLabel() {
        return this.composer_label_;
    }

    @Protobuf(tag = 12)
    public Event getEvent() {
        return this.event_;
    }

    @Protobuf(tag = 3)
    public String getInstanceId() {
        return this.instance_id_;
    }

    @Protobuf(tag = 2)
    public String getMessageId() {
        return this.message_id_;
    }

    @Protobuf(tag = 4)
    public MessageType getMessageType() {
        return this.message_type_;
    }

    @Protobuf(tag = 6)
    public String getPackageName() {
        return this.package_name_;
    }

    @Protobuf(tag = 8)
    public int getPriority() {
        return this.priority_;
    }

    @Protobuf(tag = 1)
    public long getProjectNumber() {
        return this.project_number_;
    }

    @Protobuf(tag = 5)
    public SDKPlatform getSdkPlatform() {
        return this.sdk_platform_;
    }

    @Protobuf(tag = 10)
    public String getTopic() {
        return this.topic_;
    }

    @Protobuf(tag = 9)
    public int getTtl() {
        return this.ttl_;
    }
}
