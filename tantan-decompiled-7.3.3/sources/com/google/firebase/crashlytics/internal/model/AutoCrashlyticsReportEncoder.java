package com.google.firebase.crashlytics.internal.model;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.Device;
import com.p051p1.mobile.putong.data.OMSResourceType;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    public static final class CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch> {
        static final CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder();
        private static final FieldDescriptor ARCH_DESCRIPTOR = FieldDescriptor.m16839of("arch");
        private static final FieldDescriptor LIBRARYNAME_DESCRIPTOR = FieldDescriptor.m16839of("libraryName");
        private static final FieldDescriptor BUILDID_DESCRIPTOR = FieldDescriptor.m16839of("buildId");

        private CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch buildIdMappingForArch, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ARCH_DESCRIPTOR, buildIdMappingForArch.getArch());
            objectEncoderContext.add(LIBRARYNAME_DESCRIPTOR, buildIdMappingForArch.getLibraryName());
            objectEncoderContext.add(BUILDID_DESCRIPTOR, buildIdMappingForArch.getBuildId());
        }
    }

    public static final class CrashlyticsReportApplicationExitInfoEncoder implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {
        static final CrashlyticsReportApplicationExitInfoEncoder INSTANCE = new CrashlyticsReportApplicationExitInfoEncoder();
        private static final FieldDescriptor PID_DESCRIPTOR = FieldDescriptor.m16839of("pid");
        private static final FieldDescriptor PROCESSNAME_DESCRIPTOR = FieldDescriptor.m16839of("processName");
        private static final FieldDescriptor REASONCODE_DESCRIPTOR = FieldDescriptor.m16839of("reasonCode");
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = FieldDescriptor.m16839of("importance");
        private static final FieldDescriptor PSS_DESCRIPTOR = FieldDescriptor.m16839of("pss");
        private static final FieldDescriptor RSS_DESCRIPTOR = FieldDescriptor.m16839of("rss");
        private static final FieldDescriptor TIMESTAMP_DESCRIPTOR = FieldDescriptor.m16839of("timestamp");
        private static final FieldDescriptor TRACEFILE_DESCRIPTOR = FieldDescriptor.m16839of("traceFile");
        private static final FieldDescriptor BUILDIDMAPPINGFORARCH_DESCRIPTOR = FieldDescriptor.m16839of("buildIdMappingForArch");

        private CrashlyticsReportApplicationExitInfoEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.ApplicationExitInfo applicationExitInfo, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PID_DESCRIPTOR, applicationExitInfo.getPid());
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, applicationExitInfo.getProcessName());
            objectEncoderContext.add(REASONCODE_DESCRIPTOR, applicationExitInfo.getReasonCode());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, applicationExitInfo.getImportance());
            objectEncoderContext.add(PSS_DESCRIPTOR, applicationExitInfo.getPss());
            objectEncoderContext.add(RSS_DESCRIPTOR, applicationExitInfo.getRss());
            objectEncoderContext.add(TIMESTAMP_DESCRIPTOR, applicationExitInfo.getTimestamp());
            objectEncoderContext.add(TRACEFILE_DESCRIPTOR, applicationExitInfo.getTraceFile());
            objectEncoderContext.add(BUILDIDMAPPINGFORARCH_DESCRIPTOR, applicationExitInfo.getBuildIdMappingForArch());
        }
    }

    public static final class CrashlyticsReportCustomAttributeEncoder implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        static final CrashlyticsReportCustomAttributeEncoder INSTANCE = new CrashlyticsReportCustomAttributeEncoder();
        private static final FieldDescriptor KEY_DESCRIPTOR = FieldDescriptor.m16839of(Constants.KEY_KEY);
        private static final FieldDescriptor VALUE_DESCRIPTOR = FieldDescriptor.m16839of("value");

        private CrashlyticsReportCustomAttributeEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.CustomAttribute customAttribute, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(KEY_DESCRIPTOR, customAttribute.getKey());
            objectEncoderContext.add(VALUE_DESCRIPTOR, customAttribute.getValue());
        }
    }

    public static final class CrashlyticsReportEncoder implements ObjectEncoder<CrashlyticsReport> {
        static final CrashlyticsReportEncoder INSTANCE = new CrashlyticsReportEncoder();
        private static final FieldDescriptor SDKVERSION_DESCRIPTOR = FieldDescriptor.m16839of("sdkVersion");
        private static final FieldDescriptor GMPAPPID_DESCRIPTOR = FieldDescriptor.m16839of("gmpAppId");
        private static final FieldDescriptor PLATFORM_DESCRIPTOR = FieldDescriptor.m16839of("platform");
        private static final FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = FieldDescriptor.m16839of("installationUuid");
        private static final FieldDescriptor FIREBASEINSTALLATIONID_DESCRIPTOR = FieldDescriptor.m16839of("firebaseInstallationId");
        private static final FieldDescriptor FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR = FieldDescriptor.m16839of("firebaseAuthenticationToken");
        private static final FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = FieldDescriptor.m16839of("appQualitySessionId");
        private static final FieldDescriptor BUILDVERSION_DESCRIPTOR = FieldDescriptor.m16839of("buildVersion");
        private static final FieldDescriptor DISPLAYVERSION_DESCRIPTOR = FieldDescriptor.m16839of("displayVersion");
        private static final FieldDescriptor SESSION_DESCRIPTOR = FieldDescriptor.m16839of("session");
        private static final FieldDescriptor NDKPAYLOAD_DESCRIPTOR = FieldDescriptor.m16839of("ndkPayload");
        private static final FieldDescriptor APPEXITINFO_DESCRIPTOR = FieldDescriptor.m16839of("appExitInfo");

        private CrashlyticsReportEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport crashlyticsReport, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(SDKVERSION_DESCRIPTOR, crashlyticsReport.getSdkVersion());
            objectEncoderContext.add(GMPAPPID_DESCRIPTOR, crashlyticsReport.getGmpAppId());
            objectEncoderContext.add(PLATFORM_DESCRIPTOR, crashlyticsReport.getPlatform());
            objectEncoderContext.add(INSTALLATIONUUID_DESCRIPTOR, crashlyticsReport.getInstallationUuid());
            objectEncoderContext.add(FIREBASEINSTALLATIONID_DESCRIPTOR, crashlyticsReport.getFirebaseInstallationId());
            objectEncoderContext.add(FIREBASEAUTHENTICATIONTOKEN_DESCRIPTOR, crashlyticsReport.getFirebaseAuthenticationToken());
            objectEncoderContext.add(APPQUALITYSESSIONID_DESCRIPTOR, crashlyticsReport.getAppQualitySessionId());
            objectEncoderContext.add(BUILDVERSION_DESCRIPTOR, crashlyticsReport.getBuildVersion());
            objectEncoderContext.add(DISPLAYVERSION_DESCRIPTOR, crashlyticsReport.getDisplayVersion());
            objectEncoderContext.add(SESSION_DESCRIPTOR, crashlyticsReport.getSession());
            objectEncoderContext.add(NDKPAYLOAD_DESCRIPTOR, crashlyticsReport.getNdkPayload());
            objectEncoderContext.add(APPEXITINFO_DESCRIPTOR, crashlyticsReport.getAppExitInfo());
        }
    }

    public static final class CrashlyticsReportFilesPayloadEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        static final CrashlyticsReportFilesPayloadEncoder INSTANCE = new CrashlyticsReportFilesPayloadEncoder();
        private static final FieldDescriptor FILES_DESCRIPTOR = FieldDescriptor.m16839of("files");
        private static final FieldDescriptor ORGID_DESCRIPTOR = FieldDescriptor.m16839of("orgId");

        private CrashlyticsReportFilesPayloadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.FilesPayload filesPayload, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(FILES_DESCRIPTOR, filesPayload.getFiles());
            objectEncoderContext.add(ORGID_DESCRIPTOR, filesPayload.getOrgId());
        }
    }

    public static final class CrashlyticsReportFilesPayloadFileEncoder implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        static final CrashlyticsReportFilesPayloadFileEncoder INSTANCE = new CrashlyticsReportFilesPayloadFileEncoder();
        private static final FieldDescriptor FILENAME_DESCRIPTOR = FieldDescriptor.m16839of("filename");
        private static final FieldDescriptor CONTENTS_DESCRIPTOR = FieldDescriptor.m16839of("contents");

        private CrashlyticsReportFilesPayloadFileEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.FilesPayload.File file, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(FILENAME_DESCRIPTOR, file.getFilename());
            objectEncoderContext.add(CONTENTS_DESCRIPTOR, file.getContents());
        }
    }

    public static final class CrashlyticsReportSessionApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        static final CrashlyticsReportSessionApplicationEncoder INSTANCE = new CrashlyticsReportSessionApplicationEncoder();
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = FieldDescriptor.m16839of("identifier");
        private static final FieldDescriptor VERSION_DESCRIPTOR = FieldDescriptor.m16839of(WBConstants.AUTH_PARAMS_VERSION);
        private static final FieldDescriptor DISPLAYVERSION_DESCRIPTOR = FieldDescriptor.m16839of("displayVersion");
        private static final FieldDescriptor ORGANIZATION_DESCRIPTOR = FieldDescriptor.m16839of("organization");
        private static final FieldDescriptor INSTALLATIONUUID_DESCRIPTOR = FieldDescriptor.m16839of("installationUuid");
        private static final FieldDescriptor DEVELOPMENTPLATFORM_DESCRIPTOR = FieldDescriptor.m16839of("developmentPlatform");
        private static final FieldDescriptor DEVELOPMENTPLATFORMVERSION_DESCRIPTOR = FieldDescriptor.m16839of("developmentPlatformVersion");

        private CrashlyticsReportSessionApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, application.getIdentifier());
            objectEncoderContext.add(VERSION_DESCRIPTOR, application.getVersion());
            objectEncoderContext.add(DISPLAYVERSION_DESCRIPTOR, application.getDisplayVersion());
            objectEncoderContext.add(ORGANIZATION_DESCRIPTOR, application.getOrganization());
            objectEncoderContext.add(INSTALLATIONUUID_DESCRIPTOR, application.getInstallationUuid());
            objectEncoderContext.add(DEVELOPMENTPLATFORM_DESCRIPTOR, application.getDevelopmentPlatform());
            objectEncoderContext.add(DEVELOPMENTPLATFORMVERSION_DESCRIPTOR, application.getDevelopmentPlatformVersion());
        }
    }

    public static final class CrashlyticsReportSessionApplicationOrganizationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
        static final CrashlyticsReportSessionApplicationOrganizationEncoder INSTANCE = new CrashlyticsReportSessionApplicationOrganizationEncoder();
        private static final FieldDescriptor CLSID_DESCRIPTOR = FieldDescriptor.m16839of("clsId");

        private CrashlyticsReportSessionApplicationOrganizationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Application.Organization organization, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CLSID_DESCRIPTOR, organization.getClsId());
        }
    }

    public static final class CrashlyticsReportSessionDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Device> {
        static final CrashlyticsReportSessionDeviceEncoder INSTANCE = new CrashlyticsReportSessionDeviceEncoder();
        private static final FieldDescriptor ARCH_DESCRIPTOR = FieldDescriptor.m16839of("arch");
        private static final FieldDescriptor MODEL_DESCRIPTOR = FieldDescriptor.m16839of("model");
        private static final FieldDescriptor CORES_DESCRIPTOR = FieldDescriptor.m16839of("cores");
        private static final FieldDescriptor RAM_DESCRIPTOR = FieldDescriptor.m16839of("ram");
        private static final FieldDescriptor DISKSPACE_DESCRIPTOR = FieldDescriptor.m16839of("diskSpace");
        private static final FieldDescriptor SIMULATOR_DESCRIPTOR = FieldDescriptor.m16839of("simulator");
        private static final FieldDescriptor STATE_DESCRIPTOR = FieldDescriptor.m16839of("state");
        private static final FieldDescriptor MANUFACTURER_DESCRIPTOR = FieldDescriptor.m16839of("manufacturer");
        private static final FieldDescriptor MODELCLASS_DESCRIPTOR = FieldDescriptor.m16839of("modelClass");

        private CrashlyticsReportSessionDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ARCH_DESCRIPTOR, device.getArch());
            objectEncoderContext.add(MODEL_DESCRIPTOR, device.getModel());
            objectEncoderContext.add(CORES_DESCRIPTOR, device.getCores());
            objectEncoderContext.add(RAM_DESCRIPTOR, device.getRam());
            objectEncoderContext.add(DISKSPACE_DESCRIPTOR, device.getDiskSpace());
            objectEncoderContext.add(SIMULATOR_DESCRIPTOR, device.isSimulator());
            objectEncoderContext.add(STATE_DESCRIPTOR, device.getState());
            objectEncoderContext.add(MANUFACTURER_DESCRIPTOR, device.getManufacturer());
            objectEncoderContext.add(MODELCLASS_DESCRIPTOR, device.getModelClass());
        }
    }

    public static final class CrashlyticsReportSessionEncoder implements ObjectEncoder<CrashlyticsReport.Session> {
        static final CrashlyticsReportSessionEncoder INSTANCE = new CrashlyticsReportSessionEncoder();
        private static final FieldDescriptor GENERATOR_DESCRIPTOR = FieldDescriptor.m16839of("generator");
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = FieldDescriptor.m16839of("identifier");
        private static final FieldDescriptor APPQUALITYSESSIONID_DESCRIPTOR = FieldDescriptor.m16839of("appQualitySessionId");
        private static final FieldDescriptor STARTEDAT_DESCRIPTOR = FieldDescriptor.m16839of("startedAt");
        private static final FieldDescriptor ENDEDAT_DESCRIPTOR = FieldDescriptor.m16839of("endedAt");
        private static final FieldDescriptor CRASHED_DESCRIPTOR = FieldDescriptor.m16839of("crashed");
        private static final FieldDescriptor APP_DESCRIPTOR = FieldDescriptor.m16839of("app");
        private static final FieldDescriptor USER_DESCRIPTOR = FieldDescriptor.m16839of("user");
        private static final FieldDescriptor OS_DESCRIPTOR = FieldDescriptor.m16839of("os");
        private static final FieldDescriptor DEVICE_DESCRIPTOR = FieldDescriptor.m16839of(Device.TYPE);
        private static final FieldDescriptor EVENTS_DESCRIPTOR = FieldDescriptor.m16839of("events");
        private static final FieldDescriptor GENERATORTYPE_DESCRIPTOR = FieldDescriptor.m16839of("generatorType");

        private CrashlyticsReportSessionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session session, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(GENERATOR_DESCRIPTOR, session.getGenerator());
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, session.getIdentifierUtf8Bytes());
            objectEncoderContext.add(APPQUALITYSESSIONID_DESCRIPTOR, session.getAppQualitySessionId());
            objectEncoderContext.add(STARTEDAT_DESCRIPTOR, session.getStartedAt());
            objectEncoderContext.add(ENDEDAT_DESCRIPTOR, session.getEndedAt());
            objectEncoderContext.add(CRASHED_DESCRIPTOR, session.isCrashed());
            objectEncoderContext.add(APP_DESCRIPTOR, session.getApp());
            objectEncoderContext.add(USER_DESCRIPTOR, session.getUser());
            objectEncoderContext.add(OS_DESCRIPTOR, session.getOs());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, session.getDevice());
            objectEncoderContext.add(EVENTS_DESCRIPTOR, session.getEvents());
            objectEncoderContext.add(GENERATORTYPE_DESCRIPTOR, session.getGeneratorType());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
        static final CrashlyticsReportSessionEventApplicationEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationEncoder();
        private static final FieldDescriptor EXECUTION_DESCRIPTOR = FieldDescriptor.m16839of("execution");
        private static final FieldDescriptor CUSTOMATTRIBUTES_DESCRIPTOR = FieldDescriptor.m16839of("customAttributes");
        private static final FieldDescriptor INTERNALKEYS_DESCRIPTOR = FieldDescriptor.m16839of("internalKeys");
        private static final FieldDescriptor BACKGROUND_DESCRIPTOR = FieldDescriptor.m16839of(OMSResourceType.background);
        private static final FieldDescriptor CURRENTPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.m16839of("currentProcessDetails");
        private static final FieldDescriptor APPPROCESSDETAILS_DESCRIPTOR = FieldDescriptor.m16839of("appProcessDetails");
        private static final FieldDescriptor UIORIENTATION_DESCRIPTOR = FieldDescriptor.m16839of("uiOrientation");

        private CrashlyticsReportSessionEventApplicationEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application application, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(EXECUTION_DESCRIPTOR, application.getExecution());
            objectEncoderContext.add(CUSTOMATTRIBUTES_DESCRIPTOR, application.getCustomAttributes());
            objectEncoderContext.add(INTERNALKEYS_DESCRIPTOR, application.getInternalKeys());
            objectEncoderContext.add(BACKGROUND_DESCRIPTOR, application.getBackground());
            objectEncoderContext.add(CURRENTPROCESSDETAILS_DESCRIPTOR, application.getCurrentProcessDetails());
            objectEncoderContext.add(APPPROCESSDETAILS_DESCRIPTOR, application.getAppProcessDetails());
            objectEncoderContext.add(UIORIENTATION_DESCRIPTOR, application.getUiOrientation());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionBinaryImageEncoder */
    public static final class C3169x99c932db implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
        static final C3169x99c932db INSTANCE = new C3169x99c932db();
        private static final FieldDescriptor BASEADDRESS_DESCRIPTOR = FieldDescriptor.m16839of("baseAddress");
        private static final FieldDescriptor SIZE_DESCRIPTOR = FieldDescriptor.m16839of("size");
        private static final FieldDescriptor NAME_DESCRIPTOR = FieldDescriptor.m16839of(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final FieldDescriptor UUID_DESCRIPTOR = FieldDescriptor.m16839of("uuid");

        private C3169x99c932db() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(BASEADDRESS_DESCRIPTOR, binaryImage.getBaseAddress());
            objectEncoderContext.add(SIZE_DESCRIPTOR, binaryImage.getSize());
            objectEncoderContext.add(NAME_DESCRIPTOR, binaryImage.getName());
            objectEncoderContext.add(UUID_DESCRIPTOR, binaryImage.getUuidUtf8Bytes());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
        static final CrashlyticsReportSessionEventApplicationExecutionEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionEncoder();
        private static final FieldDescriptor THREADS_DESCRIPTOR = FieldDescriptor.m16839of("threads");
        private static final FieldDescriptor EXCEPTION_DESCRIPTOR = FieldDescriptor.m16839of("exception");
        private static final FieldDescriptor APPEXITINFO_DESCRIPTOR = FieldDescriptor.m16839of("appExitInfo");
        private static final FieldDescriptor SIGNAL_DESCRIPTOR = FieldDescriptor.m16839of("signal");
        private static final FieldDescriptor BINARIES_DESCRIPTOR = FieldDescriptor.m16839of("binaries");

        private CrashlyticsReportSessionEventApplicationExecutionEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution execution, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(THREADS_DESCRIPTOR, execution.getThreads());
            objectEncoderContext.add(EXCEPTION_DESCRIPTOR, execution.getException());
            objectEncoderContext.add(APPEXITINFO_DESCRIPTOR, execution.getAppExitInfo());
            objectEncoderContext.add(SIGNAL_DESCRIPTOR, execution.getSignal());
            objectEncoderContext.add(BINARIES_DESCRIPTOR, execution.getBinaries());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionExceptionEncoder */
    public static final class C3170x55689506 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
        static final C3170x55689506 INSTANCE = new C3170x55689506();
        private static final FieldDescriptor TYPE_DESCRIPTOR = FieldDescriptor.m16839of("type");
        private static final FieldDescriptor REASON_DESCRIPTOR = FieldDescriptor.m16839of(Reason.TYPE);
        private static final FieldDescriptor FRAMES_DESCRIPTOR = FieldDescriptor.m16839of("frames");
        private static final FieldDescriptor CAUSEDBY_DESCRIPTOR = FieldDescriptor.m16839of("causedBy");
        private static final FieldDescriptor OVERFLOWCOUNT_DESCRIPTOR = FieldDescriptor.m16839of("overflowCount");

        private C3170x55689506() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Exception exception, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TYPE_DESCRIPTOR, exception.getType());
            objectEncoderContext.add(REASON_DESCRIPTOR, exception.getReason());
            objectEncoderContext.add(FRAMES_DESCRIPTOR, exception.getFrames());
            objectEncoderContext.add(CAUSEDBY_DESCRIPTOR, exception.getCausedBy());
            objectEncoderContext.add(OVERFLOWCOUNT_DESCRIPTOR, exception.getOverflowCount());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionSignalEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
        static final CrashlyticsReportSessionEventApplicationExecutionSignalEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionSignalEncoder();
        private static final FieldDescriptor NAME_DESCRIPTOR = FieldDescriptor.m16839of(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final FieldDescriptor CODE_DESCRIPTOR = FieldDescriptor.m16839of("code");
        private static final FieldDescriptor ADDRESS_DESCRIPTOR = FieldDescriptor.m16839of(PlaceTypes.ADDRESS);

        private CrashlyticsReportSessionEventApplicationExecutionSignalEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Signal signal, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(NAME_DESCRIPTOR, signal.getName());
            objectEncoderContext.add(CODE_DESCRIPTOR, signal.getCode());
            objectEncoderContext.add(ADDRESS_DESCRIPTOR, signal.getAddress());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationExecutionThreadEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final CrashlyticsReportSessionEventApplicationExecutionThreadEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationExecutionThreadEncoder();
        private static final FieldDescriptor NAME_DESCRIPTOR = FieldDescriptor.m16839of(AuthenticationTokenClaims.JSON_KEY_NAME);
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = FieldDescriptor.m16839of("importance");
        private static final FieldDescriptor FRAMES_DESCRIPTOR = FieldDescriptor.m16839of("frames");

        private CrashlyticsReportSessionEventApplicationExecutionThreadEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread thread, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(NAME_DESCRIPTOR, thread.getName());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, thread.getImportance());
            objectEncoderContext.add(FRAMES_DESCRIPTOR, thread.getFrames());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventApplicationExecutionThreadFrameEncoder */
    public static final class C3171xc3999712 implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final C3171xc3999712 INSTANCE = new C3171xc3999712();
        private static final FieldDescriptor PC_DESCRIPTOR = FieldDescriptor.m16839of("pc");
        private static final FieldDescriptor SYMBOL_DESCRIPTOR = FieldDescriptor.m16839of("symbol");
        private static final FieldDescriptor FILE_DESCRIPTOR = FieldDescriptor.m16839of("file");
        private static final FieldDescriptor OFFSET_DESCRIPTOR = FieldDescriptor.m16839of(IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = FieldDescriptor.m16839of("importance");

        private C3171xc3999712() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PC_DESCRIPTOR, frame.getPc());
            objectEncoderContext.add(SYMBOL_DESCRIPTOR, frame.getSymbol());
            objectEncoderContext.add(FILE_DESCRIPTOR, frame.getFile());
            objectEncoderContext.add(OFFSET_DESCRIPTOR, frame.getOffset());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, frame.getImportance());
        }
    }

    public static final class CrashlyticsReportSessionEventApplicationProcessDetailsEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.ProcessDetails> {
        static final CrashlyticsReportSessionEventApplicationProcessDetailsEncoder INSTANCE = new CrashlyticsReportSessionEventApplicationProcessDetailsEncoder();
        private static final FieldDescriptor PROCESSNAME_DESCRIPTOR = FieldDescriptor.m16839of("processName");
        private static final FieldDescriptor PID_DESCRIPTOR = FieldDescriptor.m16839of("pid");
        private static final FieldDescriptor IMPORTANCE_DESCRIPTOR = FieldDescriptor.m16839of("importance");
        private static final FieldDescriptor DEFAULTPROCESS_DESCRIPTOR = FieldDescriptor.m16839of("defaultProcess");

        private CrashlyticsReportSessionEventApplicationProcessDetailsEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Application.ProcessDetails processDetails, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PROCESSNAME_DESCRIPTOR, processDetails.getProcessName());
            objectEncoderContext.add(PID_DESCRIPTOR, processDetails.getPid());
            objectEncoderContext.add(IMPORTANCE_DESCRIPTOR, processDetails.getImportance());
            objectEncoderContext.add(DEFAULTPROCESS_DESCRIPTOR, processDetails.isDefaultProcess());
        }
    }

    public static final class CrashlyticsReportSessionEventDeviceEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        static final CrashlyticsReportSessionEventDeviceEncoder INSTANCE = new CrashlyticsReportSessionEventDeviceEncoder();
        private static final FieldDescriptor BATTERYLEVEL_DESCRIPTOR = FieldDescriptor.m16839of("batteryLevel");
        private static final FieldDescriptor BATTERYVELOCITY_DESCRIPTOR = FieldDescriptor.m16839of("batteryVelocity");
        private static final FieldDescriptor PROXIMITYON_DESCRIPTOR = FieldDescriptor.m16839of("proximityOn");
        private static final FieldDescriptor ORIENTATION_DESCRIPTOR = FieldDescriptor.m16839of(Constants.KEY_ORIENTATION);
        private static final FieldDescriptor RAMUSED_DESCRIPTOR = FieldDescriptor.m16839of("ramUsed");
        private static final FieldDescriptor DISKUSED_DESCRIPTOR = FieldDescriptor.m16839of("diskUsed");

        private CrashlyticsReportSessionEventDeviceEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Device device, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(BATTERYLEVEL_DESCRIPTOR, device.getBatteryLevel());
            objectEncoderContext.add(BATTERYVELOCITY_DESCRIPTOR, device.getBatteryVelocity());
            objectEncoderContext.add(PROXIMITYON_DESCRIPTOR, device.isProximityOn());
            objectEncoderContext.add(ORIENTATION_DESCRIPTOR, device.getOrientation());
            objectEncoderContext.add(RAMUSED_DESCRIPTOR, device.getRamUsed());
            objectEncoderContext.add(DISKUSED_DESCRIPTOR, device.getDiskUsed());
        }
    }

    public static final class CrashlyticsReportSessionEventEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event> {
        static final CrashlyticsReportSessionEventEncoder INSTANCE = new CrashlyticsReportSessionEventEncoder();
        private static final FieldDescriptor TIMESTAMP_DESCRIPTOR = FieldDescriptor.m16839of("timestamp");
        private static final FieldDescriptor TYPE_DESCRIPTOR = FieldDescriptor.m16839of("type");
        private static final FieldDescriptor APP_DESCRIPTOR = FieldDescriptor.m16839of("app");
        private static final FieldDescriptor DEVICE_DESCRIPTOR = FieldDescriptor.m16839of(Device.TYPE);
        private static final FieldDescriptor LOG_DESCRIPTOR = FieldDescriptor.m16839of("log");
        private static final FieldDescriptor ROLLOUTS_DESCRIPTOR = FieldDescriptor.m16839of("rollouts");

        private CrashlyticsReportSessionEventEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event event, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TIMESTAMP_DESCRIPTOR, event.getTimestamp());
            objectEncoderContext.add(TYPE_DESCRIPTOR, event.getType());
            objectEncoderContext.add(APP_DESCRIPTOR, event.getApp());
            objectEncoderContext.add(DEVICE_DESCRIPTOR, event.getDevice());
            objectEncoderContext.add(LOG_DESCRIPTOR, event.getLog());
            objectEncoderContext.add(ROLLOUTS_DESCRIPTOR, event.getRollouts());
        }
    }

    public static final class CrashlyticsReportSessionEventLogEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
        static final CrashlyticsReportSessionEventLogEncoder INSTANCE = new CrashlyticsReportSessionEventLogEncoder();
        private static final FieldDescriptor CONTENT_DESCRIPTOR = FieldDescriptor.m16839of("content");

        private CrashlyticsReportSessionEventLogEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.Log log, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(CONTENT_DESCRIPTOR, log.getContent());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutAssignmentEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment> {
        static final CrashlyticsReportSessionEventRolloutAssignmentEncoder INSTANCE = new CrashlyticsReportSessionEventRolloutAssignmentEncoder();
        private static final FieldDescriptor ROLLOUTVARIANT_DESCRIPTOR = FieldDescriptor.m16839of("rolloutVariant");
        private static final FieldDescriptor PARAMETERKEY_DESCRIPTOR = FieldDescriptor.m16839of("parameterKey");
        private static final FieldDescriptor PARAMETERVALUE_DESCRIPTOR = FieldDescriptor.m16839of("parameterValue");
        private static final FieldDescriptor TEMPLATEVERSION_DESCRIPTOR = FieldDescriptor.m16839of(RemoteConfigConstants.ResponseFieldKey.TEMPLATE_VERSION_NUMBER);

        private CrashlyticsReportSessionEventRolloutAssignmentEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment rolloutAssignment, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ROLLOUTVARIANT_DESCRIPTOR, rolloutAssignment.getRolloutVariant());
            objectEncoderContext.add(PARAMETERKEY_DESCRIPTOR, rolloutAssignment.getParameterKey());
            objectEncoderContext.add(PARAMETERVALUE_DESCRIPTOR, rolloutAssignment.getParameterValue());
            objectEncoderContext.add(TEMPLATEVERSION_DESCRIPTOR, rolloutAssignment.getTemplateVersion());
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.model.AutoCrashlyticsReportEncoder$CrashlyticsReportSessionEventRolloutAssignmentRolloutVariantEncoder */
    public static final class C3172x319e1f5b implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant> {
        static final C3172x319e1f5b INSTANCE = new C3172x319e1f5b();
        private static final FieldDescriptor ROLLOUTID_DESCRIPTOR = FieldDescriptor.m16839of(ConfigContainer.ROLLOUT_METADATA_ID);
        private static final FieldDescriptor VARIANTID_DESCRIPTOR = FieldDescriptor.m16839of("variantId");

        private C3172x319e1f5b() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant rolloutVariant, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ROLLOUTID_DESCRIPTOR, rolloutVariant.getRolloutId());
            objectEncoderContext.add(VARIANTID_DESCRIPTOR, rolloutVariant.getVariantId());
        }
    }

    public static final class CrashlyticsReportSessionEventRolloutsStateEncoder implements ObjectEncoder<CrashlyticsReport.Session.Event.RolloutsState> {
        static final CrashlyticsReportSessionEventRolloutsStateEncoder INSTANCE = new CrashlyticsReportSessionEventRolloutsStateEncoder();
        private static final FieldDescriptor ASSIGNMENTS_DESCRIPTOR = FieldDescriptor.m16839of("assignments");

        private CrashlyticsReportSessionEventRolloutsStateEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.Event.RolloutsState rolloutsState, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(ASSIGNMENTS_DESCRIPTOR, rolloutsState.getRolloutAssignments());
        }
    }

    public static final class CrashlyticsReportSessionOperatingSystemEncoder implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        static final CrashlyticsReportSessionOperatingSystemEncoder INSTANCE = new CrashlyticsReportSessionOperatingSystemEncoder();
        private static final FieldDescriptor PLATFORM_DESCRIPTOR = FieldDescriptor.m16839of("platform");
        private static final FieldDescriptor VERSION_DESCRIPTOR = FieldDescriptor.m16839of(WBConstants.AUTH_PARAMS_VERSION);
        private static final FieldDescriptor BUILDVERSION_DESCRIPTOR = FieldDescriptor.m16839of("buildVersion");
        private static final FieldDescriptor JAILBROKEN_DESCRIPTOR = FieldDescriptor.m16839of("jailbroken");

        private CrashlyticsReportSessionOperatingSystemEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.OperatingSystem operatingSystem, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(PLATFORM_DESCRIPTOR, operatingSystem.getPlatform());
            objectEncoderContext.add(VERSION_DESCRIPTOR, operatingSystem.getVersion());
            objectEncoderContext.add(BUILDVERSION_DESCRIPTOR, operatingSystem.getBuildVersion());
            objectEncoderContext.add(JAILBROKEN_DESCRIPTOR, operatingSystem.isJailbroken());
        }
    }

    public static final class CrashlyticsReportSessionUserEncoder implements ObjectEncoder<CrashlyticsReport.Session.User> {
        static final CrashlyticsReportSessionUserEncoder INSTANCE = new CrashlyticsReportSessionUserEncoder();
        private static final FieldDescriptor IDENTIFIER_DESCRIPTOR = FieldDescriptor.m16839of("identifier");

        private CrashlyticsReportSessionUserEncoder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public void encode(CrashlyticsReport.Session.User user, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(IDENTIFIER_DESCRIPTOR, user.getIdentifier());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public void configure(EncoderConfig<?> encoderConfig) {
        CrashlyticsReportEncoder crashlyticsReportEncoder = CrashlyticsReportEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.class, crashlyticsReportEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport.class, crashlyticsReportEncoder);
        CrashlyticsReportSessionEncoder crashlyticsReportSessionEncoder = CrashlyticsReportSessionEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, crashlyticsReportSessionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session.class, crashlyticsReportSessionEncoder);
        CrashlyticsReportSessionApplicationEncoder crashlyticsReportSessionApplicationEncoder = CrashlyticsReportSessionApplicationEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, crashlyticsReportSessionApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application.class, crashlyticsReportSessionApplicationEncoder);
        CrashlyticsReportSessionApplicationOrganizationEncoder crashlyticsReportSessionApplicationOrganizationEncoder = CrashlyticsReportSessionApplicationOrganizationEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Application_Organization.class, crashlyticsReportSessionApplicationOrganizationEncoder);
        CrashlyticsReportSessionUserEncoder crashlyticsReportSessionUserEncoder = CrashlyticsReportSessionUserEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, crashlyticsReportSessionUserEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_User.class, crashlyticsReportSessionUserEncoder);
        CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder = CrashlyticsReportSessionOperatingSystemEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_OperatingSystem.class, crashlyticsReportSessionOperatingSystemEncoder);
        CrashlyticsReportSessionDeviceEncoder crashlyticsReportSessionDeviceEncoder = CrashlyticsReportSessionDeviceEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, crashlyticsReportSessionDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Device.class, crashlyticsReportSessionDeviceEncoder);
        CrashlyticsReportSessionEventEncoder crashlyticsReportSessionEventEncoder = CrashlyticsReportSessionEventEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, crashlyticsReportSessionEventEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event.class, crashlyticsReportSessionEventEncoder);
        CrashlyticsReportSessionEventApplicationEncoder crashlyticsReportSessionEventApplicationEncoder = CrashlyticsReportSessionEventApplicationEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, crashlyticsReportSessionEventApplicationEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application.class, crashlyticsReportSessionEventApplicationEncoder);
        CrashlyticsReportSessionEventApplicationExecutionEncoder crashlyticsReportSessionEventApplicationExecutionEncoder = CrashlyticsReportSessionEventApplicationExecutionEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Application_Execution.class, crashlyticsReportSessionEventApplicationExecutionEncoder);
        CrashlyticsReportSessionEventApplicationExecutionThreadEncoder crashlyticsReportSessionEventApplicationExecutionThreadEncoder = CrashlyticsReportSessionEventApplicationExecutionThreadEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        encoderConfig.registerEncoder(C3189x7e3e3ebd.class, crashlyticsReportSessionEventApplicationExecutionThreadEncoder);
        C3171xc3999712 c3171xc3999712 = C3171xc3999712.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, c3171xc3999712);
        encoderConfig.registerEncoder(C3190xce3d994b.class, c3171xc3999712);
        C3170x55689506 c3170x55689506 = C3170x55689506.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, c3170x55689506);
        encoderConfig.registerEncoder(C3187xc2f5febc.class, c3170x55689506);
        CrashlyticsReportApplicationExitInfoEncoder crashlyticsReportApplicationExitInfoEncoder = CrashlyticsReportApplicationExitInfoEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_ApplicationExitInfo.class, crashlyticsReportApplicationExitInfoEncoder);
        CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder = CrashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.BuildIdMappingForArch.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        encoderConfig.registerEncoder(C3175xb26d2aa8.class, crashlyticsReportApplicationExitInfoBuildIdMappingForArchEncoder);
        CrashlyticsReportSessionEventApplicationExecutionSignalEncoder crashlyticsReportSessionEventApplicationExecutionSignalEncoder = CrashlyticsReportSessionEventApplicationExecutionSignalEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        encoderConfig.registerEncoder(C3188x7c929f5b.class, crashlyticsReportSessionEventApplicationExecutionSignalEncoder);
        C3169x99c932db c3169x99c932db = C3169x99c932db.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, c3169x99c932db);
        encoderConfig.registerEncoder(C3186xfe724d07.class, c3169x99c932db);
        CrashlyticsReportCustomAttributeEncoder crashlyticsReportCustomAttributeEncoder = CrashlyticsReportCustomAttributeEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_CustomAttribute.class, crashlyticsReportCustomAttributeEncoder);
        CrashlyticsReportSessionEventApplicationProcessDetailsEncoder crashlyticsReportSessionEventApplicationProcessDetailsEncoder = CrashlyticsReportSessionEventApplicationProcessDetailsEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.ProcessDetails.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        encoderConfig.registerEncoder(C3191x94fa915f.class, crashlyticsReportSessionEventApplicationProcessDetailsEncoder);
        CrashlyticsReportSessionEventDeviceEncoder crashlyticsReportSessionEventDeviceEncoder = CrashlyticsReportSessionEventDeviceEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, crashlyticsReportSessionEventDeviceEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Device.class, crashlyticsReportSessionEventDeviceEncoder);
        CrashlyticsReportSessionEventLogEncoder crashlyticsReportSessionEventLogEncoder = CrashlyticsReportSessionEventLogEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, crashlyticsReportSessionEventLogEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_Log.class, crashlyticsReportSessionEventLogEncoder);
        CrashlyticsReportSessionEventRolloutsStateEncoder crashlyticsReportSessionEventRolloutsStateEncoder = CrashlyticsReportSessionEventRolloutsStateEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutsState.class, crashlyticsReportSessionEventRolloutsStateEncoder);
        CrashlyticsReportSessionEventRolloutAssignmentEncoder crashlyticsReportSessionEventRolloutAssignmentEncoder = CrashlyticsReportSessionEventRolloutAssignmentEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_Session_Event_RolloutAssignment.class, crashlyticsReportSessionEventRolloutAssignmentEncoder);
        C3172x319e1f5b c3172x319e1f5b = C3172x319e1f5b.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.RolloutAssignment.RolloutVariant.class, c3172x319e1f5b);
        encoderConfig.registerEncoder(C3195x87204092.class, c3172x319e1f5b);
        CrashlyticsReportFilesPayloadEncoder crashlyticsReportFilesPayloadEncoder = CrashlyticsReportFilesPayloadEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload.class, crashlyticsReportFilesPayloadEncoder);
        CrashlyticsReportFilesPayloadFileEncoder crashlyticsReportFilesPayloadFileEncoder = CrashlyticsReportFilesPayloadFileEncoder.INSTANCE;
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, crashlyticsReportFilesPayloadFileEncoder);
        encoderConfig.registerEncoder(AutoValue_CrashlyticsReport_FilesPayload_File.class, crashlyticsReportFilesPayloadFileEncoder);
    }
}
