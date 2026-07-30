package com.bytedance.bpea.entry.common;

import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertContext;
import com.bytedance.bpea.basics.CheckResult;
import com.bytedance.bpea.basics.EntryCategory;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m87232d2 = {"Lcom/bytedance/bpea/entry/common/BPEACertAuthEntry;", "", "()V", "Companion", "common-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final class BPEACertAuthEntry {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @JvmStatic
    @Nullable
    public static final CheckResult checkAndTranslateSDKCert(@Nullable Cert cert, @Nullable String[] strArr, @NotNull String str, @NotNull String str2) throws BPEAException {
        return INSTANCE.checkAndTranslateSDKCert(cert, strArr, str, str2);
    }

    @JvmStatic
    public static final void checkAudioCert(@Nullable Cert cert, @NotNull String str) throws BPEAException {
        INSTANCE.checkAudioCert(cert, str);
    }

    @JvmStatic
    public static final void checkBPEAEntryCert(@Nullable Cert cert, @Nullable String[] strArr, @NotNull String str) throws BPEAException {
        INSTANCE.checkBPEAEntryCert(cert, strArr, str);
    }

    @JvmStatic
    public static final void checkClipboardCert(@Nullable Cert cert, @NotNull String str) throws BPEAException {
        INSTANCE.checkClipboardCert(cert, str);
    }

    @JvmStatic
    public static final void checkLocationCert(@Nullable Cert cert, @NotNull String str) throws BPEAException {
        INSTANCE.checkLocationCert(cert, str);
    }

    @JvmStatic
    public static final void checkMediaRecorderCert(@Nullable Cert cert, @NotNull String str) throws BPEAException {
        INSTANCE.checkMediaRecorderCert(cert, str);
    }

    @JvmStatic
    public static final void checkSDKCert(@Nullable Cert cert, @Nullable String[] strArr, @NotNull String str, @NotNull String str2) throws BPEAException {
        INSTANCE.checkSDKCert(cert, strArr, str, str2);
    }

    @JvmStatic
    public static final void checkVideoCert(@Nullable Cert cert, @NotNull String str) throws BPEAException {
        INSTANCE.checkVideoCert(cert, str);
    }

    @Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\fJ\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0007J/\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u001a\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0007J\u001a\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0007J7\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0007J-\u0010\u0018\u001a\u00020\u00192\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002¢\u0006\u0002\u0010\u001c¨\u0006\u001d"}, m87232d2 = {"Lcom/bytedance/bpea/entry/common/BPEACertAuthEntry$Companion;", "", "()V", "checkAndTranslateSDKCert", "Lcom/bytedance/bpea/basics/CheckResult;", "cert", "Lcom/bytedance/bpea/basics/Cert;", "dataTypes", "", "", "sdkName", "methodName", "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/bytedance/bpea/basics/CheckResult;", "checkAudioCert", "", "entryToken", "checkBPEAEntryCert", "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;)V", "checkClipboardCert", "checkLocationCert", "checkMediaRecorderCert", "checkSDKCert", "(Lcom/bytedance/bpea/basics/Cert;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "checkVideoCert", "createCertContext", "Lcom/bytedance/bpea/basics/CertContext;", "entryCategory", "", "([Ljava/lang/String;Ljava/lang/String;I)Lcom/bytedance/bpea/basics/CertContext;", "common-entry_release"}, m87233k = 1, m87234mv = {1, 1, 16})
    public static final class Companion {
        private Companion() {
        }

        private final CertContext createCertContext(String[] dataTypes, String entryToken, int entryCategory) {
            CertContext certContext = new CertContext();
            certContext.setEntryDataTypes(dataTypes);
            certContext.setEntryToken(entryToken);
            certContext.setEntryCategory(Integer.valueOf(entryCategory));
            return certContext;
        }

        @JvmStatic
        @Nullable
        public final CheckResult checkAndTranslateSDKCert(@Nullable Cert cert, @Nullable String[] dataTypes, @NotNull String sdkName, @NotNull String methodName) throws BPEAException {
            sdkName.getClass();
            methodName.getClass();
            CertContext certContextCreateCertContext = createCertContext(dataTypes, sdkName + '_' + methodName, EntryCategory.DIRECT_AUTH.getType());
            certContextCreateCertContext.addExtraInfo("sdkName", sdkName);
            certContextCreateCertContext.addExtraInfo("methodName", methodName);
            return PrivacyCertCheckerHolder.INSTANCE.check(cert, certContextCreateCertContext);
        }

        @JvmStatic
        public final void checkAudioCert(@Nullable Cert cert, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            checkBPEAEntryCert(cert, new String[]{"audio"}, entryToken);
        }

        @JvmStatic
        public final void checkBPEAEntryCert(@Nullable Cert cert, @Nullable String[] dataTypes, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            PrivacyCertCheckerHolder.INSTANCE.check(cert, createCertContext(dataTypes, entryToken, EntryCategory.BPEA_ENTRY.getType()));
        }

        @JvmStatic
        public final void checkClipboardCert(@Nullable Cert cert, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            checkBPEAEntryCert(cert, new String[]{DataType.CLIPBOARD}, entryToken);
        }

        @JvmStatic
        public final void checkLocationCert(@Nullable Cert cert, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            checkBPEAEntryCert(cert, new String[]{DataType.LAT_AND_LON}, entryToken);
        }

        @JvmStatic
        public final void checkMediaRecorderCert(@Nullable Cert cert, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            checkBPEAEntryCert(cert, new String[]{"audio", "video"}, entryToken);
        }

        @JvmStatic
        public final void checkSDKCert(@Nullable Cert cert, @Nullable String[] dataTypes, @NotNull String sdkName, @NotNull String methodName) throws BPEAException {
            sdkName.getClass();
            methodName.getClass();
            CertContext certContextCreateCertContext = createCertContext(dataTypes, sdkName + '_' + methodName, EntryCategory.DIRECT_AUTH.getType());
            certContextCreateCertContext.addExtraInfo("sdkName", sdkName);
            certContextCreateCertContext.addExtraInfo("methodName", methodName);
            PrivacyCertCheckerHolder.INSTANCE.check(cert, certContextCreateCertContext);
        }

        @JvmStatic
        public final void checkVideoCert(@Nullable Cert cert, @NotNull String entryToken) throws BPEAException {
            entryToken.getClass();
            checkBPEAEntryCert(cert, new String[]{"video"}, entryToken);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
