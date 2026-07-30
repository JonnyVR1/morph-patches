package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0017\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u0011\u0010#\"\u0004\b$\u0010%R$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\"\u001a\u0004\b!\u0010#\"\u0004\b'\u0010%R$\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001c\u0010#\"\u0004\b(\u0010%R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010)\u001a\u0004\b&\u0010*\"\u0004\b+\u0010,R\"\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0012\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016¨\u0006/"}, m88121d2 = {"Ll/pjw;", "", "", "isDebug", "debugPrintLog", "writeDebugLogs", "Ll/to2;", "baseCoreInfo", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "mkSdcardPath", "mkHomeDir", "Ll/elw;", "mkUA", "isKeepLowSysContext", "<init>", "(ZZZLl/to2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll/elw;Z)V", "a", "Z", "h", "()Z", "setDebug", "(Z)V", "b", "c", "setDebugPrintLog", "g", "setWriteDebugLogs", Constants.INAPP_DATA_TAG, "Ll/to2;", "()Ll/to2;", "setBaseCoreInfo", "(Ll/to2;)V", "e", "Ljava/lang/String;", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "f", "setMkSdcardPath", "setMkHomeDir", "Ll/elw;", "()Ll/elw;", "setMkUA", "(Ll/elw;)V", RXScreenCaptureService.KEY_INDEX, "setKeepLowSysContext", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class pjw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isDebug;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean debugPrintLog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean writeDebugLogs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private to2 baseCoreInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private String appId;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private String mkSdcardPath;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private String mkHomeDir;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private elw mkUA;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isKeepLowSysContext;

    public pjw(boolean z, boolean z2, boolean z3, @NotNull to2 to2Var, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable elw elwVar, boolean z4) {
        to2Var.getClass();
        str.getClass();
        this.isDebug = z;
        this.debugPrintLog = z2;
        this.writeDebugLogs = z3;
        this.baseCoreInfo = to2Var;
        this.appId = str;
        this.mkSdcardPath = str2;
        this.mkHomeDir = str3;
        this.mkUA = elwVar;
        this.isKeepLowSysContext = z4;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final to2 getBaseCoreInfo() {
        return this.baseCoreInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDebugPrintLog() {
        return this.debugPrintLog;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMkHomeDir() {
        return this.mkHomeDir;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getMkSdcardPath() {
        return this.mkSdcardPath;
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final elw getMkUA() {
        return this.mkUA;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getWriteDebugLogs() {
        return this.writeDebugLogs;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getIsDebug() {
        return this.isDebug;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getIsKeepLowSysContext() {
        return this.isKeepLowSysContext;
    }
}
