package com.google.firebase.messaging;

import androidx.core.app.NotificationCompat;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class MessagingClientEventEncoder implements ObjectEncoder<MessagingClientEvent> {
        static final MessagingClientEventEncoder INSTANCE = new MessagingClientEventEncoder();
        private static final FieldDescriptor PROJECTNUMBER_DESCRIPTOR = FieldDescriptor.builder("projectNumber").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor MESSAGEID_DESCRIPTOR = FieldDescriptor.builder("messageId").withProperty(AtProtobuf.builder().tag(2).build()).build();
        private static final FieldDescriptor INSTANCEID_DESCRIPTOR = FieldDescriptor.builder("instanceId").withProperty(AtProtobuf.builder().tag(3).build()).build();
        private static final FieldDescriptor MESSAGETYPE_DESCRIPTOR = FieldDescriptor.builder("messageType").withProperty(AtProtobuf.builder().tag(4).build()).build();
        private static final FieldDescriptor SDKPLATFORM_DESCRIPTOR = FieldDescriptor.builder("sdkPlatform").withProperty(AtProtobuf.builder().tag(5).build()).build();
        private static final FieldDescriptor PACKAGENAME_DESCRIPTOR = FieldDescriptor.builder(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME).withProperty(AtProtobuf.builder().tag(6).build()).build();
        private static final FieldDescriptor COLLAPSEKEY_DESCRIPTOR = FieldDescriptor.builder("collapseKey").withProperty(AtProtobuf.builder().tag(7).build()).build();
        private static final FieldDescriptor PRIORITY_DESCRIPTOR = FieldDescriptor.builder("priority").withProperty(AtProtobuf.builder().tag(8).build()).build();
        private static final FieldDescriptor TTL_DESCRIPTOR = FieldDescriptor.builder("ttl").withProperty(AtProtobuf.builder().tag(9).build()).build();
        private static final FieldDescriptor TOPIC_DESCRIPTOR = FieldDescriptor.builder("topic").withProperty(AtProtobuf.builder().tag(10).build()).build();
        private static final FieldDescriptor BULKID_DESCRIPTOR = FieldDescriptor.builder("bulkId").withProperty(AtProtobuf.builder().tag(11).build()).build();
        private static final FieldDescriptor EVENT_DESCRIPTOR = FieldDescriptor.builder(NotificationCompat.CATEGORY_EVENT).withProperty(AtProtobuf.builder().tag(12).build()).build();
        private static final FieldDescriptor ANALYTICSLABEL_DESCRIPTOR = FieldDescriptor.builder("analyticsLabel").withProperty(AtProtobuf.builder().tag(13).build()).build();
        private static final FieldDescriptor CAMPAIGNID_DESCRIPTOR = FieldDescriptor.builder("campaignId").withProperty(AtProtobuf.builder().tag(14).build()).build();
        private static final FieldDescriptor COMPOSERLABEL_DESCRIPTOR = FieldDescriptor.builder("composerLabel").withProperty(AtProtobuf.builder().tag(15).build()).build();

        private MessagingClientEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(MessagingClientEvent messagingClientEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PROJECTNUMBER_DESCRIPTOR, messagingClientEvent.getProjectNumber());
            objectEncoderContext.add(MESSAGEID_DESCRIPTOR, messagingClientEvent.getMessageId());
            objectEncoderContext.add(INSTANCEID_DESCRIPTOR, messagingClientEvent.getInstanceId());
            objectEncoderContext.add(MESSAGETYPE_DESCRIPTOR, messagingClientEvent.getMessageType());
            objectEncoderContext.add(SDKPLATFORM_DESCRIPTOR, messagingClientEvent.getSdkPlatform());
            objectEncoderContext.add(PACKAGENAME_DESCRIPTOR, messagingClientEvent.getPackageName());
            objectEncoderContext.add(COLLAPSEKEY_DESCRIPTOR, messagingClientEvent.getCollapseKey());
            objectEncoderContext.add(PRIORITY_DESCRIPTOR, messagingClientEvent.getPriority());
            objectEncoderContext.add(TTL_DESCRIPTOR, messagingClientEvent.getTtl());
            objectEncoderContext.add(TOPIC_DESCRIPTOR, messagingClientEvent.getTopic());
            objectEncoderContext.add(BULKID_DESCRIPTOR, messagingClientEvent.getBulkId());
            objectEncoderContext.add(EVENT_DESCRIPTOR, messagingClientEvent.getEvent());
            objectEncoderContext.add(ANALYTICSLABEL_DESCRIPTOR, messagingClientEvent.getAnalyticsLabel());
            objectEncoderContext.add(CAMPAIGNID_DESCRIPTOR, messagingClientEvent.getCampaignId());
            objectEncoderContext.add(COMPOSERLABEL_DESCRIPTOR, messagingClientEvent.getComposerLabel());
        }
    }

    public static final class MessagingClientEventExtensionEncoder implements ObjectEncoder<MessagingClientEventExtension> {
        static final MessagingClientEventExtensionEncoder INSTANCE = new MessagingClientEventExtensionEncoder();
        private static final FieldDescriptor MESSAGINGCLIENTEVENT_DESCRIPTOR = FieldDescriptor.builder("messagingClientEvent").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private MessagingClientEventExtensionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(MessagingClientEventExtension messagingClientEventExtension, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENT_DESCRIPTOR, messagingClientEventExtension.getMessagingClientEventInternal());
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final FieldDescriptor MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR = FieldDescriptor.m16839of("messagingClientEventExtension");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(MESSAGINGCLIENTEVENTEXTENSION_DESCRIPTOR, protoEncoderDoNotUse.getMessagingClientEventExtension());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, MessagingClientEventExtensionEncoder.INSTANCE);
        encoderConfig.registerEncoder(MessagingClientEvent.class, MessagingClientEventEncoder.INSTANCE);
    }
}
