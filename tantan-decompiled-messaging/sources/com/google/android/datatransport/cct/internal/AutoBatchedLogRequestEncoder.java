package com.google.android.datatransport.cct.internal;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.p046p1.mobile.putong.data.Device;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class AutoBatchedLogRequestEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoBatchedLogRequestEncoder();

    public static final class AndroidClientInfoEncoder implements ObjectEncoder<AndroidClientInfo> {
        static final AndroidClientInfoEncoder INSTANCE = new AndroidClientInfoEncoder();
        private static final FieldDescriptor SDKVERSION_DESCRIPTOR = FieldDescriptor.m16784of("sdkVersion");
        private static final FieldDescriptor MODEL_DESCRIPTOR = FieldDescriptor.m16784of("model");
        private static final FieldDescriptor HARDWARE_DESCRIPTOR = FieldDescriptor.m16784of("hardware");
        private static final FieldDescriptor DEVICE_DESCRIPTOR = FieldDescriptor.m16784of(Device.TYPE);
        private static final FieldDescriptor PRODUCT_DESCRIPTOR = FieldDescriptor.m16784of("product");
        private static final FieldDescriptor OSBUILD_DESCRIPTOR = FieldDescriptor.m16784of("osBuild");
        private static final FieldDescriptor MANUFACTURER_DESCRIPTOR = FieldDescriptor.m16784of("manufacturer");
        private static final FieldDescriptor FINGERPRINT_DESCRIPTOR = FieldDescriptor.m16784of("fingerprint");
        private static final FieldDescriptor LOCALE_DESCRIPTOR = FieldDescriptor.m16784of("locale");
        private static final FieldDescriptor COUNTRY_DESCRIPTOR = FieldDescriptor.m16784of("country");
        private static final FieldDescriptor MCCMNC_DESCRIPTOR = FieldDescriptor.m16784of("mccMnc");
        private static final FieldDescriptor APPLICATIONBUILD_DESCRIPTOR = FieldDescriptor.m16784of("applicationBuild");

        private AndroidClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(AndroidClientInfo androidClientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(SDKVERSION_DESCRIPTOR, androidClientInfo.getSdkVersion());
            objectEncoderContext.add(MODEL_DESCRIPTOR, androidClientInfo.getModel());
            objectEncoderContext.add(HARDWARE_DESCRIPTOR, androidClientInfo.getHardware());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, androidClientInfo.getDevice());
            objectEncoderContext.add(PRODUCT_DESCRIPTOR, androidClientInfo.getProduct());
            objectEncoderContext.add(OSBUILD_DESCRIPTOR, androidClientInfo.getOsBuild());
            objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, androidClientInfo.getManufacturer());
            objectEncoderContext.add(FINGERPRINT_DESCRIPTOR, androidClientInfo.getFingerprint());
            objectEncoderContext.add(LOCALE_DESCRIPTOR, androidClientInfo.getLocale());
            objectEncoderContext.add(COUNTRY_DESCRIPTOR, androidClientInfo.getCountry());
            objectEncoderContext.add(MCCMNC_DESCRIPTOR, androidClientInfo.getMccMnc());
            objectEncoderContext.add(APPLICATIONBUILD_DESCRIPTOR, androidClientInfo.getApplicationBuild());
        }
    }

    public static final class BatchedLogRequestEncoder implements ObjectEncoder<BatchedLogRequest> {
        static final BatchedLogRequestEncoder INSTANCE = new BatchedLogRequestEncoder();
        private static final FieldDescriptor LOGREQUEST_DESCRIPTOR = FieldDescriptor.m16784of("logRequest");

        private BatchedLogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(BatchedLogRequest batchedLogRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(LOGREQUEST_DESCRIPTOR, batchedLogRequest.getLogRequests());
        }
    }

    public static final class ClientInfoEncoder implements ObjectEncoder<ClientInfo> {
        static final ClientInfoEncoder INSTANCE = new ClientInfoEncoder();
        private static final FieldDescriptor CLIENTTYPE_DESCRIPTOR = FieldDescriptor.m16784of("clientType");
        private static final FieldDescriptor ANDROIDCLIENTINFO_DESCRIPTOR = FieldDescriptor.m16784of("androidClientInfo");

        private ClientInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ClientInfo clientInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLIENTTYPE_DESCRIPTOR, clientInfo.getClientType());
            objectEncoderContext.add(ANDROIDCLIENTINFO_DESCRIPTOR, clientInfo.getAndroidClientInfo());
        }
    }

    public static final class ComplianceDataEncoder implements ObjectEncoder<ComplianceData> {
        static final ComplianceDataEncoder INSTANCE = new ComplianceDataEncoder();
        private static final FieldDescriptor PRIVACYCONTEXT_DESCRIPTOR = FieldDescriptor.m16784of("privacyContext");
        private static final FieldDescriptor PRODUCTIDORIGIN_DESCRIPTOR = FieldDescriptor.m16784of("productIdOrigin");

        private ComplianceDataEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ComplianceData complianceData, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PRIVACYCONTEXT_DESCRIPTOR, complianceData.getPrivacyContext());
            objectEncoderContext.add(PRODUCTIDORIGIN_DESCRIPTOR, complianceData.getProductIdOrigin());
        }
    }

    public static final class ExperimentIdsEncoder implements ObjectEncoder<ExperimentIds> {
        static final ExperimentIdsEncoder INSTANCE = new ExperimentIdsEncoder();
        private static final FieldDescriptor CLEARBLOB_DESCRIPTOR = FieldDescriptor.m16784of("clearBlob");
        private static final FieldDescriptor ENCRYPTEDBLOB_DESCRIPTOR = FieldDescriptor.m16784of("encryptedBlob");

        private ExperimentIdsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExperimentIds experimentIds, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLEARBLOB_DESCRIPTOR, experimentIds.getClearBlob());
            objectEncoderContext.add(ENCRYPTEDBLOB_DESCRIPTOR, experimentIds.getEncryptedBlob());
        }
    }

    public static final class ExternalPRequestContextEncoder implements ObjectEncoder<ExternalPRequestContext> {
        static final ExternalPRequestContextEncoder INSTANCE = new ExternalPRequestContextEncoder();
        private static final FieldDescriptor ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR = FieldDescriptor.m16784of("originAssociatedProductId");

        private ExternalPRequestContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExternalPRequestContext externalPRequestContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ORIGINASSOCIATEDPRODUCTID_DESCRIPTOR, externalPRequestContext.getOriginAssociatedProductId());
        }
    }

    public static final class ExternalPrivacyContextEncoder implements ObjectEncoder<ExternalPrivacyContext> {
        static final ExternalPrivacyContextEncoder INSTANCE = new ExternalPrivacyContextEncoder();
        private static final FieldDescriptor PREQUEST_DESCRIPTOR = FieldDescriptor.m16784of("prequest");

        private ExternalPrivacyContextEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(ExternalPrivacyContext externalPrivacyContext, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PREQUEST_DESCRIPTOR, externalPrivacyContext.getPrequest());
        }
    }

    public static final class LogEventEncoder implements ObjectEncoder<LogEvent> {
        static final LogEventEncoder INSTANCE = new LogEventEncoder();
        private static final FieldDescriptor EVENTTIMEMS_DESCRIPTOR = FieldDescriptor.m16784of("eventTimeMs");
        private static final FieldDescriptor EVENTCODE_DESCRIPTOR = FieldDescriptor.m16784of("eventCode");
        private static final FieldDescriptor COMPLIANCEDATA_DESCRIPTOR = FieldDescriptor.m16784of("complianceData");
        private static final FieldDescriptor EVENTUPTIMEMS_DESCRIPTOR = FieldDescriptor.m16784of("eventUptimeMs");
        private static final FieldDescriptor SOURCEEXTENSION_DESCRIPTOR = FieldDescriptor.m16784of("sourceExtension");
        private static final FieldDescriptor SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR = FieldDescriptor.m16784of("sourceExtensionJsonProto3");
        private static final FieldDescriptor TIMEZONEOFFSETSECONDS_DESCRIPTOR = FieldDescriptor.m16784of("timezoneOffsetSeconds");
        private static final FieldDescriptor NETWORKCONNECTIONINFO_DESCRIPTOR = FieldDescriptor.m16784of("networkConnectionInfo");
        private static final FieldDescriptor EXPERIMENTIDS_DESCRIPTOR = FieldDescriptor.m16784of("experimentIds");

        private LogEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogEvent logEvent, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EVENTTIMEMS_DESCRIPTOR, logEvent.getEventTimeMs());
            objectEncoderContext.add(EVENTCODE_DESCRIPTOR, logEvent.getEventCode());
            objectEncoderContext.add(COMPLIANCEDATA_DESCRIPTOR, logEvent.getComplianceData());
            objectEncoderContext.add(EVENTUPTIMEMS_DESCRIPTOR, logEvent.getEventUptimeMs());
            objectEncoderContext.add(SOURCEEXTENSION_DESCRIPTOR, logEvent.getSourceExtension());
            objectEncoderContext.add(SOURCEEXTENSIONJSONPROTO3_DESCRIPTOR, logEvent.getSourceExtensionJsonProto3());
            objectEncoderContext.add(TIMEZONEOFFSETSECONDS_DESCRIPTOR, logEvent.getTimezoneOffsetSeconds());
            objectEncoderContext.add(NETWORKCONNECTIONINFO_DESCRIPTOR, logEvent.getNetworkConnectionInfo());
            objectEncoderContext.add(EXPERIMENTIDS_DESCRIPTOR, logEvent.getExperimentIds());
        }
    }

    public static final class LogRequestEncoder implements ObjectEncoder<LogRequest> {
        static final LogRequestEncoder INSTANCE = new LogRequestEncoder();
        private static final FieldDescriptor REQUESTTIMEMS_DESCRIPTOR = FieldDescriptor.m16784of("requestTimeMs");
        private static final FieldDescriptor REQUESTUPTIMEMS_DESCRIPTOR = FieldDescriptor.m16784of("requestUptimeMs");
        private static final FieldDescriptor CLIENTINFO_DESCRIPTOR = FieldDescriptor.m16784of("clientInfo");
        private static final FieldDescriptor LOGSOURCE_DESCRIPTOR = FieldDescriptor.m16784of("logSource");
        private static final FieldDescriptor LOGSOURCENAME_DESCRIPTOR = FieldDescriptor.m16784of("logSourceName");
        private static final FieldDescriptor LOGEVENT_DESCRIPTOR = FieldDescriptor.m16784of("logEvent");
        private static final FieldDescriptor QOSTIER_DESCRIPTOR = FieldDescriptor.m16784of("qosTier");

        private LogRequestEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(LogRequest logRequest, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(REQUESTTIMEMS_DESCRIPTOR, logRequest.getRequestTimeMs());
            objectEncoderContext.add(REQUESTUPTIMEMS_DESCRIPTOR, logRequest.getRequestUptimeMs());
            objectEncoderContext.add(CLIENTINFO_DESCRIPTOR, logRequest.getClientInfo());
            objectEncoderContext.add(LOGSOURCE_DESCRIPTOR, logRequest.getLogSource());
            objectEncoderContext.add(LOGSOURCENAME_DESCRIPTOR, logRequest.getLogSourceName());
            objectEncoderContext.add(LOGEVENT_DESCRIPTOR, logRequest.getLogEvents());
            objectEncoderContext.add(QOSTIER_DESCRIPTOR, logRequest.getQosTier());
        }
    }

    public static final class NetworkConnectionInfoEncoder implements ObjectEncoder<NetworkConnectionInfo> {
        static final NetworkConnectionInfoEncoder INSTANCE = new NetworkConnectionInfoEncoder();
        private static final FieldDescriptor NETWORKTYPE_DESCRIPTOR = FieldDescriptor.m16784of("networkType");
        private static final FieldDescriptor MOBILESUBTYPE_DESCRIPTOR = FieldDescriptor.m16784of("mobileSubtype");

        private NetworkConnectionInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(NetworkConnectionInfo networkConnectionInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(NETWORKTYPE_DESCRIPTOR, networkConnectionInfo.getNetworkType());
            objectEncoderContext.add(MOBILESUBTYPE_DESCRIPTOR, networkConnectionInfo.getMobileSubtype());
        }
    }

    private AutoBatchedLogRequestEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        BatchedLogRequestEncoder batchedLogRequestEncoder = BatchedLogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(BatchedLogRequest.class, batchedLogRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_BatchedLogRequest.class, batchedLogRequestEncoder);
        LogRequestEncoder logRequestEncoder = LogRequestEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogRequest.class, logRequestEncoder);
        encoderConfig.registerEncoder(AutoValue_LogRequest.class, logRequestEncoder);
        ClientInfoEncoder clientInfoEncoder = ClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(ClientInfo.class, clientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_ClientInfo.class, clientInfoEncoder);
        AndroidClientInfoEncoder androidClientInfoEncoder = AndroidClientInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(AndroidClientInfo.class, androidClientInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_AndroidClientInfo.class, androidClientInfoEncoder);
        LogEventEncoder logEventEncoder = LogEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(LogEvent.class, logEventEncoder);
        encoderConfig.registerEncoder(AutoValue_LogEvent.class, logEventEncoder);
        ComplianceDataEncoder complianceDataEncoder = ComplianceDataEncoder.INSTANCE;
        encoderConfig.registerEncoder(ComplianceData.class, complianceDataEncoder);
        encoderConfig.registerEncoder(AutoValue_ComplianceData.class, complianceDataEncoder);
        ExternalPrivacyContextEncoder externalPrivacyContextEncoder = ExternalPrivacyContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPrivacyContext.class, externalPrivacyContextEncoder);
        ExternalPRequestContextEncoder externalPRequestContextEncoder = ExternalPRequestContextEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExternalPRequestContext.class, externalPRequestContextEncoder);
        encoderConfig.registerEncoder(AutoValue_ExternalPRequestContext.class, externalPRequestContextEncoder);
        NetworkConnectionInfoEncoder networkConnectionInfoEncoder = NetworkConnectionInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_NetworkConnectionInfo.class, networkConnectionInfoEncoder);
        ExperimentIdsEncoder experimentIdsEncoder = ExperimentIdsEncoder.INSTANCE;
        encoderConfig.registerEncoder(ExperimentIds.class, experimentIdsEncoder);
        encoderConfig.registerEncoder(AutoValue_ExperimentIds.class, experimentIdsEncoder);
    }
}
