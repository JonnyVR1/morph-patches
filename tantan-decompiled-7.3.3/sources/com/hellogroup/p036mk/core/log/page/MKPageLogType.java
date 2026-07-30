package com.hellogroup.p036mk.core.log.page;

import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PROCESS_GONE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b7\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B;\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@¨\u0006A"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/page/MKPageLogType;", "", "logLevel", "Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "code", "", "source", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "content", "appendSpace", "", "allLogRecord", "(Ljava/lang/String;ILcom/hellogroup/mk/core/log/core/MKLogLevel;Ljava/lang/String;Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;ZZ)V", "getAllLogRecord", "()Z", "getAppendSpace", "getCode", "()Ljava/lang/String;", "getContent", "getLogLevel", "()Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "getSource", "()Lcom/hellogroup/mk/core/log/core/MKLogSource;", "PROCESS_GONE", "WHITE_SCREEN_NATIVE", "HTML_FAIL", "RECEIVED_ERROR", "BRIDGE_NOT_FOUND", "KILLED_BY_SYSTEM", "RECOVERY", "NATIVE_ERROR", "NATIVE_OVERTIME", "WHITE_SCREEN_JS", "WINDOW_ON_ERROR", "CONSOLE_ERROR", "RECEIVED_TITLE", "CONSOLE_LOG", "MWC_ERR_NATIVE_LOG", "MWC_ERR_JS_LOG", "ON_WEB_VIEW_CREATE", "ON_PAGE_START", "ON_PAGE_FINISHED", "ON_DESTROY", "ON_RESUME", "ON_PAUSE", "APP_FOREGROUND", "APP_BACKGROUND", "APP_DESTROY", "ON_LOAD_RESOURCE", "SHOW_LOADING_PAGE", "HIDE_LOADING_PAGE", "SHOW_WHITE_SCREEN_PAGE_NATIVE", "HIDE_WHITE_SCREEN_PAGE", "APPLICATION_CRASH", "OFFLINE_ERROR", "CREATE_TIMER", "CLOSE_TIMER", "JS_BRIDGE", "SHOW_WHITE_SCREEN_PAGE_JS", "INTERCEPT_FILE", "COMMON_LOG", "MWC_LOG_DEBUG", "MWC_LOG_INFO", "MWC_LOG_WARN", "BRIDGE_CALL", "MKCore_release"}, m88122k = 1, m88123mv = {1, 1, 16})
public final class MKPageLogType {
    private static final /* synthetic */ MKPageLogType[] $VALUES;
    public static final MKPageLogType APPLICATION_CRASH;
    public static final MKPageLogType APP_BACKGROUND;
    public static final MKPageLogType APP_DESTROY;
    public static final MKPageLogType APP_FOREGROUND;
    public static final MKPageLogType BRIDGE_CALL;
    public static final MKPageLogType BRIDGE_NOT_FOUND;
    public static final MKPageLogType CLOSE_TIMER;
    public static final MKPageLogType COMMON_LOG;
    public static final MKPageLogType CONSOLE_ERROR;
    public static final MKPageLogType CONSOLE_LOG;
    public static final MKPageLogType CREATE_TIMER;
    public static final MKPageLogType HIDE_LOADING_PAGE;
    public static final MKPageLogType HIDE_WHITE_SCREEN_PAGE;
    public static final MKPageLogType HTML_FAIL;
    public static final MKPageLogType INTERCEPT_FILE;
    public static final MKPageLogType JS_BRIDGE;
    public static final MKPageLogType KILLED_BY_SYSTEM;
    public static final MKPageLogType MWC_ERR_JS_LOG;
    public static final MKPageLogType MWC_ERR_NATIVE_LOG;
    public static final MKPageLogType MWC_LOG_DEBUG;
    public static final MKPageLogType MWC_LOG_INFO;
    public static final MKPageLogType MWC_LOG_WARN;
    public static final MKPageLogType NATIVE_ERROR;
    public static final MKPageLogType NATIVE_OVERTIME;
    public static final MKPageLogType OFFLINE_ERROR;
    public static final MKPageLogType ON_DESTROY;
    public static final MKPageLogType ON_LOAD_RESOURCE;
    public static final MKPageLogType ON_PAGE_FINISHED;
    public static final MKPageLogType ON_PAGE_START;
    public static final MKPageLogType ON_PAUSE;
    public static final MKPageLogType ON_RESUME;
    public static final MKPageLogType ON_WEB_VIEW_CREATE;
    public static final MKPageLogType PROCESS_GONE;
    public static final MKPageLogType RECEIVED_ERROR;
    public static final MKPageLogType RECEIVED_TITLE;
    public static final MKPageLogType RECOVERY;
    public static final MKPageLogType SHOW_LOADING_PAGE;
    public static final MKPageLogType SHOW_WHITE_SCREEN_PAGE_JS;
    public static final MKPageLogType SHOW_WHITE_SCREEN_PAGE_NATIVE;
    public static final MKPageLogType WHITE_SCREEN_JS;
    public static final MKPageLogType WHITE_SCREEN_NATIVE;
    public static final MKPageLogType WINDOW_ON_ERROR;
    private final boolean allLogRecord;
    private final boolean appendSpace;

    @NotNull
    private final String code;

    @NotNull
    private final String content;

    @NotNull
    private final MKLogLevel logLevel;

    @NotNull
    private final MKLogSource source;

    static {
        MKLogLevel mKLogLevel = MKLogLevel.ERROR;
        MKLogSource mKLogSource = MKLogSource.NATIVE;
        boolean z = false;
        MKPageLogType mKPageLogType = new MKPageLogType("PROCESS_GONE", 0, mKLogLevel, "ERR_1.1", mKLogSource, "[LC]onRenderProcessGone", false, z, 48, null);
        PROCESS_GONE = mKPageLogType;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z2 = false;
        MKPageLogType mKPageLogType2 = new MKPageLogType("WHITE_SCREEN_NATIVE", 1, mKLogLevel, "ERR_1.2", mKLogSource, "[LC]showWhiteScreenPage", z, z2, 48, defaultConstructorMarker);
        WHITE_SCREEN_NATIVE = mKPageLogType2;
        MKPageLogType mKPageLogType3 = new MKPageLogType("HTML_FAIL", 2, mKLogLevel, "ERR_1.3", mKLogSource, "[LC]", z, z2, 32, defaultConstructorMarker);
        HTML_FAIL = mKPageLogType3;
        MKPageLogType mKPageLogType4 = new MKPageLogType("RECEIVED_ERROR", 3, mKLogLevel, "ERR_2.1", mKLogSource, "[LC]onReceivedError", z, z2, 48, defaultConstructorMarker);
        RECEIVED_ERROR = mKPageLogType4;
        MKPageLogType mKPageLogType5 = new MKPageLogType("BRIDGE_NOT_FOUND", 4, mKLogLevel, "ERR_2.4", mKLogSource, "[MB]bridge not found", z, z2, 48, defaultConstructorMarker);
        BRIDGE_NOT_FOUND = mKPageLogType5;
        MKPageLogType mKPageLogType6 = new MKPageLogType("KILLED_BY_SYSTEM", 5, mKLogLevel, "ERR_4.1", mKLogSource, "killed by system", z, z2, 48, defaultConstructorMarker);
        KILLED_BY_SYSTEM = mKPageLogType6;
        MKPageLogType mKPageLogType7 = new MKPageLogType("RECOVERY", 6, mKLogLevel, "ERR_4.2", mKLogSource, "reload webView success", z, z2, 48, defaultConstructorMarker);
        RECOVERY = mKPageLogType7;
        MKPageLogType mKPageLogType8 = new MKPageLogType("NATIVE_ERROR", 7, mKLogLevel, "ERR_5.1", mKLogSource, "[LC]Naitive Error", z, z2, 48, defaultConstructorMarker);
        NATIVE_ERROR = mKPageLogType8;
        int i = 48;
        MKPageLogType mKPageLogType9 = new MKPageLogType("NATIVE_OVERTIME", 8, mKLogLevel, "ERR_5.2", mKLogSource, "[LC]Naitive OverTime", z, z2, i, defaultConstructorMarker);
        NATIVE_OVERTIME = mKPageLogType9;
        MKLogSource mKLogSource2 = MKLogSource.JS;
        MKPageLogType mKPageLogType10 = new MKPageLogType("WHITE_SCREEN_JS", 9, mKLogLevel, "ERR_1.4", mKLogSource2, "[LC]showWhiteScreenPage", z, z2, i, defaultConstructorMarker);
        WHITE_SCREEN_JS = mKPageLogType10;
        MKPageLogType mKPageLogType11 = new MKPageLogType("WINDOW_ON_ERROR", 10, mKLogLevel, "ERR_2.3", mKLogSource2, "[WE]window.onerror", z, z2, i, defaultConstructorMarker);
        WINDOW_ON_ERROR = mKPageLogType11;
        MKPageLogType mKPageLogType12 = new MKPageLogType("CONSOLE_ERROR", 11, mKLogLevel, "ERR_3.1", mKLogSource2, "[JE]console.onerror", z, z2, i, defaultConstructorMarker);
        CONSOLE_ERROR = mKPageLogType12;
        MKPageLogType mKPageLogType13 = new MKPageLogType("RECEIVED_TITLE", 12, mKLogLevel, "ERR_1.5", mKLogSource, "[LC]onReceivedTitle", z, z2, i, defaultConstructorMarker);
        RECEIVED_TITLE = mKPageLogType13;
        MKLogLevel mKLogLevel2 = MKLogLevel.INFO;
        boolean z3 = false;
        MKPageLogType mKPageLogType14 = new MKPageLogType("CONSOLE_LOG", 13, mKLogLevel2, "log", mKLogSource2, "[JL]", false, true);
        CONSOLE_LOG = mKPageLogType14;
        int i2 = 48;
        boolean z4 = false;
        MKPageLogType mKPageLogType15 = new MKPageLogType("MWC_ERR_NATIVE_LOG", 14, mKLogLevel, "MWC_ERR", mKLogSource, "[MWC]Error", z4, z2, i2, defaultConstructorMarker);
        MWC_ERR_NATIVE_LOG = mKPageLogType15;
        MKPageLogType mKPageLogType16 = new MKPageLogType("MWC_ERR_JS_LOG", 15, mKLogLevel, "MWC_ERR", mKLogSource2, "[MWC]Error", z4, z2, i2, defaultConstructorMarker);
        MWC_ERR_JS_LOG = mKPageLogType16;
        int i3 = 48;
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z5 = false;
        boolean z6 = false;
        MKPageLogType mKPageLogType17 = new MKPageLogType("ON_WEB_VIEW_CREATE", 16, mKLogLevel2, "log", mKLogSource, "[LC]onWebViewCreate", z5, z6, i3, defaultConstructorMarker2);
        ON_WEB_VIEW_CREATE = mKPageLogType17;
        MKPageLogType mKPageLogType18 = new MKPageLogType("ON_PAGE_START", 17, mKLogLevel2, "log", mKLogSource, "[LC]onPageStart", z5, z6, i3, defaultConstructorMarker2);
        ON_PAGE_START = mKPageLogType18;
        MKPageLogType mKPageLogType19 = new MKPageLogType("ON_PAGE_FINISHED", 18, mKLogLevel2, "log", mKLogSource, "[LC]onPageFinished", z5, z6, i3, defaultConstructorMarker2);
        ON_PAGE_FINISHED = mKPageLogType19;
        MKPageLogType mKPageLogType20 = new MKPageLogType("ON_DESTROY", 19, mKLogLevel2, "log", mKLogSource, "[LC]destroy", z5, z6, i3, defaultConstructorMarker2);
        ON_DESTROY = mKPageLogType20;
        MKPageLogType mKPageLogType21 = new MKPageLogType("ON_RESUME", 20, mKLogLevel2, "log", mKLogSource, "[LC]onResume", z5, z6, i3, defaultConstructorMarker2);
        ON_RESUME = mKPageLogType21;
        MKPageLogType mKPageLogType22 = new MKPageLogType("ON_PAUSE", 21, mKLogLevel2, "log", mKLogSource, "[LC]onPause", z5, z6, i3, defaultConstructorMarker2);
        ON_PAUSE = mKPageLogType22;
        MKPageLogType mKPageLogType23 = new MKPageLogType("APP_FOREGROUND", 22, mKLogLevel2, "log", mKLogSource, "[LC]appForeground", z5, z6, i3, defaultConstructorMarker2);
        APP_FOREGROUND = mKPageLogType23;
        MKPageLogType mKPageLogType24 = new MKPageLogType("APP_BACKGROUND", 23, mKLogLevel2, "log", mKLogSource, "[LC]appBackground", z5, z6, i3, defaultConstructorMarker2);
        APP_BACKGROUND = mKPageLogType24;
        MKPageLogType mKPageLogType25 = new MKPageLogType("APP_DESTROY", 24, mKLogLevel2, "log", mKLogSource, "[LC]AppDestroy", z5, z6, i3, defaultConstructorMarker2);
        APP_DESTROY = mKPageLogType25;
        MKPageLogType mKPageLogType26 = new MKPageLogType("ON_LOAD_RESOURCE", 25, mKLogLevel2, "log", mKLogSource, "[LC]onLoadResource", z5, z6, i3, defaultConstructorMarker2);
        ON_LOAD_RESOURCE = mKPageLogType26;
        MKPageLogType mKPageLogType27 = new MKPageLogType("SHOW_LOADING_PAGE", 26, mKLogLevel2, "log", mKLogSource, "[LC]showLoadingPage", z5, z6, i3, defaultConstructorMarker2);
        SHOW_LOADING_PAGE = mKPageLogType27;
        MKPageLogType mKPageLogType28 = new MKPageLogType("HIDE_LOADING_PAGE", 27, mKLogLevel2, "log", mKLogSource, "[LC]hideLoadingPage", z5, z6, i3, defaultConstructorMarker2);
        HIDE_LOADING_PAGE = mKPageLogType28;
        MKPageLogType mKPageLogType29 = new MKPageLogType("SHOW_WHITE_SCREEN_PAGE_NATIVE", 28, mKLogLevel2, "log", mKLogSource, "[LC]showWhiteScreenPage", z5, z6, i3, defaultConstructorMarker2);
        SHOW_WHITE_SCREEN_PAGE_NATIVE = mKPageLogType29;
        MKPageLogType mKPageLogType30 = new MKPageLogType("HIDE_WHITE_SCREEN_PAGE", 29, mKLogLevel2, "log", mKLogSource, "[LC]hideWhiteScreenPage", z5, z6, i3, defaultConstructorMarker2);
        HIDE_WHITE_SCREEN_PAGE = mKPageLogType30;
        MKPageLogType mKPageLogType31 = new MKPageLogType("APPLICATION_CRASH", 30, mKLogLevel2, "log", mKLogSource, "[LC]Application Crash", z5, z6, i3, defaultConstructorMarker2);
        APPLICATION_CRASH = mKPageLogType31;
        MKPageLogType mKPageLogType32 = new MKPageLogType("OFFLINE_ERROR", 31, mKLogLevel2, "log", mKLogSource, "[LC]offline error", z5, z6, i3, defaultConstructorMarker2);
        OFFLINE_ERROR = mKPageLogType32;
        MKPageLogType mKPageLogType33 = new MKPageLogType("CREATE_TIMER", 32, mKLogLevel2, "log", mKLogSource, "[MM]createTimer", z5, z6, i3, defaultConstructorMarker2);
        CREATE_TIMER = mKPageLogType33;
        MKPageLogType mKPageLogType34 = new MKPageLogType("CLOSE_TIMER", 33, mKLogLevel2, "log", mKLogSource, "[MM]closeTimer", z5, z6, i3, defaultConstructorMarker2);
        CLOSE_TIMER = mKPageLogType34;
        MKPageLogType mKPageLogType35 = new MKPageLogType("JS_BRIDGE", 34, mKLogLevel2, "log", mKLogSource, "[JB]JS Bridge", z5, z6, i3, defaultConstructorMarker2);
        JS_BRIDGE = mKPageLogType35;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        boolean z7 = false;
        MKPageLogType mKPageLogType36 = new MKPageLogType("SHOW_WHITE_SCREEN_PAGE_JS", 35, mKLogLevel2, "log", mKLogSource2, "[JB]showWhiteScreenPage", z3, z7, 48, defaultConstructorMarker3);
        SHOW_WHITE_SCREEN_PAGE_JS = mKPageLogType36;
        MKPageLogType mKPageLogType37 = new MKPageLogType("INTERCEPT_FILE", 36, mKLogLevel2, "log", mKLogSource, "[IL]", false, true);
        INTERCEPT_FILE = mKPageLogType37;
        MKPageLogType mKPageLogType38 = new MKPageLogType("COMMON_LOG", 37, mKLogLevel2, "log", mKLogSource2, "[LC]", z3, z7, 32, defaultConstructorMarker3);
        COMMON_LOG = mKPageLogType38;
        MKPageLogType mKPageLogType39 = new MKPageLogType("MWC_LOG_DEBUG", 38, mKLogLevel2, "MWC_DEBUG", mKLogSource, "[MWC]Log", true, true);
        MWC_LOG_DEBUG = mKPageLogType39;
        MKPageLogType mKPageLogType40 = new MKPageLogType("MWC_LOG_INFO", 39, mKLogLevel2, "MWC_INFO", mKLogSource, "[MWC]Log", true, true);
        MWC_LOG_INFO = mKPageLogType40;
        MKPageLogType mKPageLogType41 = new MKPageLogType("MWC_LOG_WARN", 40, mKLogLevel2, "MWC_WARN", mKLogSource, "[MWC]Log", true, true);
        MWC_LOG_WARN = mKPageLogType41;
        MKPageLogType mKPageLogType42 = new MKPageLogType("BRIDGE_CALL", 41, mKLogLevel2, "log", mKLogSource, "[MB]BridgeCall", true, true);
        BRIDGE_CALL = mKPageLogType42;
        $VALUES = new MKPageLogType[]{mKPageLogType, mKPageLogType2, mKPageLogType3, mKPageLogType4, mKPageLogType5, mKPageLogType6, mKPageLogType7, mKPageLogType8, mKPageLogType9, mKPageLogType10, mKPageLogType11, mKPageLogType12, mKPageLogType13, mKPageLogType14, mKPageLogType15, mKPageLogType16, mKPageLogType17, mKPageLogType18, mKPageLogType19, mKPageLogType20, mKPageLogType21, mKPageLogType22, mKPageLogType23, mKPageLogType24, mKPageLogType25, mKPageLogType26, mKPageLogType27, mKPageLogType28, mKPageLogType29, mKPageLogType30, mKPageLogType31, mKPageLogType32, mKPageLogType33, mKPageLogType34, mKPageLogType35, mKPageLogType36, mKPageLogType37, mKPageLogType38, mKPageLogType39, mKPageLogType40, mKPageLogType41, mKPageLogType42};
    }

    public /* synthetic */ MKPageLogType(String str, int i, MKLogLevel mKLogLevel, String str2, MKLogSource mKLogSource, String str3, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, mKLogLevel, str2, mKLogSource, str3, (i2 & 16) != 0 ? true : z, (i2 & 32) != 0 ? false : z2);
    }

    public static MKPageLogType valueOf(String str) {
        return (MKPageLogType) Enum.valueOf(MKPageLogType.class, str);
    }

    public static MKPageLogType[] values() {
        return (MKPageLogType[]) $VALUES.clone();
    }

    public final boolean getAllLogRecord() {
        return this.allLogRecord;
    }

    public final boolean getAppendSpace() {
        return this.appendSpace;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final MKLogLevel getLogLevel() {
        return this.logLevel;
    }

    @NotNull
    public final MKLogSource getSource() {
        return this.source;
    }

    private MKPageLogType(String str, int i, MKLogLevel mKLogLevel, String str2, MKLogSource mKLogSource, String str3, boolean z, boolean z2) {
        super(str, i);
        this.logLevel = mKLogLevel;
        this.code = str2;
        this.source = mKLogSource;
        this.content = str3;
        this.appendSpace = z;
        this.allLogRecord = z2;
    }
}
