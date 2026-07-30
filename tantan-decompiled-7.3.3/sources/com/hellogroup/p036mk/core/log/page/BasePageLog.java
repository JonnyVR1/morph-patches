package com.hellogroup.p036mk.core.log.page;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.FepContext;
import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.auf;
import p153l.jzv;
import p153l.okw;
import p153l.pr3;
import p153l.rs8;
import p153l.xh3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\n\b\u0016\u0018\u0000 S2\u00020\u0001:\u00019B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012Ja\u0010\u001c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0016\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0004¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00102\b\u0010,\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b-\u0010+J\u0015\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0004¢\u0006\u0004\b/\u0010+J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u0015¢\u0006\u0004\b1\u00102JY\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u0002032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a2\u0018\b\u0002\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0015H\u0007¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010FR\u0016\u0010I\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010=R\u0014\u0010L\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010MR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bN\u0010:\u001a\u0004\bN\u0010O\"\u0004\bP\u0010+R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010:\u001a\u0004\bQ\u0010O\"\u0004\bR\u0010+¨\u0006T"}, m88121d2 = {"Lcom/hellogroup/mk/core/log/page/BasePageLog;", "", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "reporter", "", "bid", "url", "<init>", "(Lcom/hellogroup/mk/core/log/core/MKLogReporter;Ljava/lang/String;Ljava/lang/String;)V", "triggerLevel", "Lcom/hellogroup/mk/core/log/core/MKLogLevel;", "logLevel", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "source", "thirdBiz", "logStr", "", "m", "(Ljava/lang/String;Lcom/hellogroup/mk/core/log/core/MKLogLevel;Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;Ljava/lang/String;)V", "errorCode", "content", "", "appendSpace", "", "extra", "description", "", "messages", "g", "(Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "reportAllLog", "h", "(ZLcom/hellogroup/mk/core/log/core/MKLogLevel;)Z", "k", "()Z", "isOffline", WBConstants.AUTH_PARAMS_VERSION, "q", "(ZLjava/lang/String;)V", Constants.KEY_T, "(Ljava/lang/String;)Z", "fep", "p", "(Ljava/lang/String;)V", "offlineVersion", "r", "ua", BLiveStormDanmakuGiftResourceType.f45294s, "dns", "o", "(Z)V", "Lcom/hellogroup/mk/core/log/page/MKPageLogType;", "type", "e", "(Lcom/hellogroup/mk/core/log/page/MKPageLogType;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Z)V", BLiveStormDanmakuGiftResourceType.f45292l, "()V", "a", "Ljava/lang/String;", "pageId", "b", "Z", "allowAllLogs", "c", "allowErrorLogs", "Ljava/util/concurrent/CopyOnWriteArrayList;", Constants.INAPP_DATA_TAG, "Ljava/util/concurrent/CopyOnWriteArrayList;", "logBuffer", "", "Ljava/util/Map;", "extraInfo", "f", "isFirstError", "", "J", "createTimeMs", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", RXScreenCaptureService.KEY_INDEX, "()Ljava/lang/String;", "setBid", "j", "n", "Companion", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class BasePageLog {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String pageId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean allowAllLogs;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean allowErrorLogs;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final CopyOnWriteArrayList<String> logBuffer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Map<String, Object> extraInfo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile boolean isFirstError;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final long createTimeMs;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final MKLogReporter reporter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private String bid;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private String url;

    public BasePageLog(@Nullable MKLogReporter mKLogReporter, @Nullable String str, @Nullable String str2) {
        this.reporter = mKLogReporter;
        this.bid = str;
        this.url = str2;
        String string = UUID.randomUUID().toString();
        string.getClass();
        this.pageId = string;
        this.allowAllLogs = rs8.m182914e();
        this.allowErrorLogs = rs8.m182921l();
        this.logBuffer = new CopyOnWriteArrayList<>();
        this.extraInfo = new LinkedHashMap();
        this.isFirstError = true;
        this.createTimeMs = System.currentTimeMillis();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m18468f(BasePageLog basePageLog, MKPageLogType mKPageLogType, String str, List list, Map map, boolean z, int i, Object obj) {
        if (obj != null) {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: addLog");
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        basePageLog.m18473e(mKPageLogType, str, list, map, z);
    }

    /* JADX INFO: renamed from: g */
    private final String m18469g(MKLogSource source, String errorCode, String content, boolean appendSpace, Map<String, ? extends Object> extra, String description, List<String> messages) {
        SortedMap sortedMap;
        AtomicBoolean atomicBoolean = new AtomicBoolean(appendSpace);
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(jCurrentTimeMillis);
        sb.append("|");
        sb.append(source.getStringValue());
        sb.append("|");
        sb.append(errorCode);
        sb.append("|");
        sb.append(content);
        if (description != null && !StringsKt.m94329e0(description)) {
            if (atomicBoolean.getAndSet(true)) {
                sb.append("&&&");
            }
            sb.append(description);
        }
        if (messages != null) {
            for (String str : messages) {
                if (atomicBoolean.getAndSet(true)) {
                    sb.append("&&&");
                }
                sb.append(str);
            }
        }
        if (extra != null && (sortedMap = MapsKt.toSortedMap(extra)) != null) {
            for (Map.Entry entry : sortedMap.entrySet()) {
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    if (atomicBoolean.getAndSet(true)) {
                        sb.append("&&&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(value);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: h */
    private final boolean m18470h(boolean reportAllLog, MKLogLevel logLevel) {
        MKLogReporter mKLogReporter;
        return reportAllLog || ((this.allowErrorLogs || auf.INSTANCE.m100379b()) && (mKLogReporter = this.reporter) != null && mKLogReporter.m18437b(logLevel));
    }

    /* JADX INFO: renamed from: k */
    private final boolean m18471k() {
        MKLogReporter mKLogReporter;
        okw configuration;
        return (this.allowAllLogs || this.allowErrorLogs || auf.INSTANCE.m100379b()) && (mKLogReporter = this.reporter) != null && (configuration = mKLogReporter.getConfiguration()) != null && configuration.getEnabled();
    }

    /* JADX INFO: renamed from: m */
    private final void m18472m(String triggerLevel, MKLogLevel logLevel, MKLogSource source, String thirdBiz, String logStr) {
        List mutableList = CollectionsKt.toMutableList((Collection) this.logBuffer);
        if (mutableList.isEmpty()) {
            return;
        }
        this.logBuffer.clear();
        boolean z = this.isFirstError;
        if (z) {
            this.isFirstError = false;
        }
        xh3.m210980d(FepContext.INSTANCE.m17573a(), null, null, new BasePageLog$performPageLogUpload$1(this, mutableList, z, logLevel, logStr, triggerLevel, source, thirdBiz, null), 3, null);
    }

    @JvmOverloads
    /* JADX INFO: renamed from: e */
    public final void m18473e(@NotNull MKPageLogType type, @Nullable String description, @Nullable List<String> messages, @Nullable Map<String, ? extends Object> extra, boolean reportAllLog) {
        type.getClass();
        if (m18471k()) {
            if (!type.getAllLogRecord() || this.allowAllLogs) {
                String code = type.getCode();
                String strM18469g = m18469g(type.getSource(), code, type.getContent(), type.getAppendSpace(), extra, description, messages);
                jzv.m147734g("BasePageLog", strM18469g);
                this.logBuffer.add(strM18469g);
                auf.INSTANCE.m100381f(strM18469g, type.getSource().getStringValue());
                if (m18470h(reportAllLog, type.getLogLevel())) {
                    m18472m(code, type.getLogLevel(), type.getSource(), type.getCode(), strM18469g);
                }
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public String getBid() {
        throw null;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public String getUrl() {
        throw null;
    }

    /* JADX INFO: renamed from: l */
    public final void m18476l() {
        m18468f(this, MKPageLogType.ON_DESTROY, null, null, null, this.allowAllLogs, 14, null);
    }

    /* JADX INFO: renamed from: n */
    public void mo18477n(@Nullable String str) {
        throw null;
    }

    /* JADX INFO: renamed from: o */
    public final void m18478o(boolean dns) {
        this.extraInfo.put("useDns", Boolean.valueOf(dns));
    }

    /* JADX INFO: renamed from: p */
    public final void m18479p(@NotNull String fep) {
        fep.getClass();
        this.extraInfo.put("fep", fep);
    }

    /* JADX INFO: renamed from: q */
    public final void m18480q(boolean isOffline, @Nullable String version) {
        this.extraInfo.put("isResourceOfflined", Integer.valueOf(isOffline ? 1 : 0));
        if (version == null || version.length() == 0) {
            return;
        }
        this.extraInfo.put("offlineVersion", version);
    }

    /* JADX INFO: renamed from: r */
    public final void m18481r(@Nullable String offlineVersion) {
        this.extraInfo.put("offlineVersion", offlineVersion);
        if (offlineVersion == null || offlineVersion.length() == 0) {
            return;
        }
        this.extraInfo.put("isResourceOfflined", 1);
    }

    /* JADX INFO: renamed from: s */
    public final void m18482s(@NotNull String ua) {
        ua.getClass();
        this.extraInfo.put("ua", ua);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m18483t(@Nullable String url) {
        if (url == null || url.length() == 0) {
            return false;
        }
        mo18477n(url);
        return true;
    }
}
