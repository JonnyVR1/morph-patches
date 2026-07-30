package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class AutoProtoEncoderDoNotUseEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoProtoEncoderDoNotUseEncoder();

    public static final class ClientMetricsEncoder implements ObjectEncoder<ClientMetrics> {
        static final ClientMetricsEncoder INSTANCE = new ClientMetricsEncoder();
        private static final FieldDescriptor WINDOW_DESCRIPTOR = FieldDescriptor.builder(BLiveBottomPopupStyleTypeEnum.window).withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor LOGSOURCEMETRICS_DESCRIPTOR = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();
        private static final FieldDescriptor GLOBALMETRICS_DESCRIPTOR = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();
        private static final FieldDescriptor APPNAMESPACE_DESCRIPTOR = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private ClientMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ClientMetrics clientMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(WINDOW_DESCRIPTOR, clientMetrics.getWindowInternal());
            objectEncoderContext.add(LOGSOURCEMETRICS_DESCRIPTOR, clientMetrics.getLogSourceMetricsList());
            objectEncoderContext.add(GLOBALMETRICS_DESCRIPTOR, clientMetrics.getGlobalMetricsInternal());
            objectEncoderContext.add(APPNAMESPACE_DESCRIPTOR, clientMetrics.getAppNamespace());
        }
    }

    public static final class GlobalMetricsEncoder implements ObjectEncoder<GlobalMetrics> {
        static final GlobalMetricsEncoder INSTANCE = new GlobalMetricsEncoder();
        private static final FieldDescriptor STORAGEMETRICS_DESCRIPTOR = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private GlobalMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(GlobalMetrics globalMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STORAGEMETRICS_DESCRIPTOR, globalMetrics.getStorageMetricsInternal());
        }
    }

    public static final class LogEventDroppedEncoder implements ObjectEncoder<LogEventDropped> {
        static final LogEventDroppedEncoder INSTANCE = new LogEventDroppedEncoder();
        private static final FieldDescriptor EVENTSDROPPEDCOUNT_DESCRIPTOR = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor REASON_DESCRIPTOR = FieldDescriptor.builder(Reason.TYPE).withProperty(AtProtobuf.builder().tag(3).build()).build();

        private LogEventDroppedEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogEventDropped logEventDropped, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTSDROPPEDCOUNT_DESCRIPTOR, logEventDropped.getEventsDroppedCount());
            objectEncoderContext.add(REASON_DESCRIPTOR, logEventDropped.getReason());
        }
    }

    public static final class LogSourceMetricsEncoder implements ObjectEncoder<LogSourceMetrics> {
        static final LogSourceMetricsEncoder INSTANCE = new LogSourceMetricsEncoder();
        private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor LOGEVENTDROPPED_DESCRIPTOR = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private LogSourceMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogSourceMetrics logSourceMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logSourceMetrics.getLogSource());
            objectEncoderContext.add(LOGEVENTDROPPED_DESCRIPTOR, logSourceMetrics.getLogEventDroppedList());
        }
    }

    public static final class ProtoEncoderDoNotUseEncoder implements ObjectEncoder<ProtoEncoderDoNotUse> {
        static final ProtoEncoderDoNotUseEncoder INSTANCE = new ProtoEncoderDoNotUseEncoder();
        private static final FieldDescriptor CLIENTMETRICS_DESCRIPTOR = FieldDescriptor.m16784of("clientMetrics");

        private ProtoEncoderDoNotUseEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ProtoEncoderDoNotUse protoEncoderDoNotUse, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLIENTMETRICS_DESCRIPTOR, protoEncoderDoNotUse.getClientMetrics());
        }
    }

    public static final class StorageMetricsEncoder implements ObjectEncoder<StorageMetrics> {
        static final StorageMetricsEncoder INSTANCE = new StorageMetricsEncoder();
        private static final FieldDescriptor CURRENTCACHESIZEBYTES_DESCRIPTOR = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor MAXCACHESIZEBYTES_DESCRIPTOR = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private StorageMetricsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(StorageMetrics storageMetrics, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CURRENTCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getCurrentCacheSizeBytes());
            objectEncoderContext.add(MAXCACHESIZEBYTES_DESCRIPTOR, storageMetrics.getMaxCacheSizeBytes());
        }
    }

    public static final class TimeWindowEncoder implements ObjectEncoder<TimeWindow> {
        static final TimeWindowEncoder INSTANCE = new TimeWindowEncoder();
        private static final FieldDescriptor STARTMS_DESCRIPTOR = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor ENDMS_DESCRIPTOR = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private TimeWindowEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(TimeWindow timeWindow, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(STARTMS_DESCRIPTOR, timeWindow.getStartMs());
            objectEncoderContext.add(ENDMS_DESCRIPTOR, timeWindow.getEndMs());
        }
    }

    private AutoProtoEncoderDoNotUseEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(ProtoEncoderDoNotUse.class, ProtoEncoderDoNotUseEncoder.INSTANCE);
        encoderConfig.registerEncoder(ClientMetrics.class, ClientMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(TimeWindow.class, TimeWindowEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogSourceMetrics.class, LogSourceMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(LogEventDropped.class, LogEventDroppedEncoder.INSTANCE);
        encoderConfig.registerEncoder(GlobalMetrics.class, GlobalMetricsEncoder.INSTANCE);
        encoderConfig.registerEncoder(StorageMetrics.class, StorageMetricsEncoder.INSTANCE);
    }
}
