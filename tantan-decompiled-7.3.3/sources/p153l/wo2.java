package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.core.log.core.MKLogLevel;
import com.hellogroup.p036mk.core.log.core.MKLogReporter;
import com.hellogroup.p036mk.core.log.core.MKLogSource;
import com.hellogroup.p036mk.core.log.global.MKGlobalErrorType;
import com.p051p1.mobile.putong.core.data.UserBanAppealSwitch;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0087\u0001\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001d"}, m88121d2 = {"Ll/wo2;", "", "<init>", "()V", "Ll/wo2$a;", "args", "", "a", "(Ll/wo2$a;)V", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "reporter", Constants.INAPP_DATA_TAG, "(Lcom/hellogroup/mk/core/log/core/MKLogReporter;)V", "Lcom/hellogroup/mk/core/log/global/MKGlobalErrorType;", "type", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "source", "", "bid", "url", "", "infoData", "secondBiz", "thirdBiz", "extraPutData", "module", "b", "(Lcom/hellogroup/mk/core/log/global/MKGlobalErrorType;Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "Lcom/hellogroup/mk/core/log/core/MKLogReporter;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class wo2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private volatile MKLogReporter reporter;

    /* JADX INFO: renamed from: l.wo2$a */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\b\u0082\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u000e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u0014R'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b\"\u0010)R2\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010(\u001a\u0004\b!\u0010)\"\u0004\b*\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b'\u0010,\u001a\u0004\b&\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u0014¨\u0006."}, m88121d2 = {"Ll/wo2$a;", "", "", "errorCode", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "source", "bid", "url", "secondBiz", "thirdBiz", "", "infoData", "", "extraPutData", "", UserBanAppealSwitch.offline, "module", "<init>", "(Ljava/lang/String;Lcom/hellogroup/mk/core/log/core/MKLogSource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/hellogroup/mk/core/log/core/MKLogSource;", "h", "()Lcom/hellogroup/mk/core/log/core/MKLogSource;", "c", Constants.INAPP_DATA_TAG, "j", "e", "g", "f", RXScreenCaptureService.KEY_INDEX, "Ljava/util/Map;", "()Ljava/util/Map;", "k", "(Ljava/util/Map;)V", "Z", "()Z", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C21156a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String errorCode;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final MKLogSource source;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private final String bid;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final String url;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private final String secondBiz;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @NotNull
        private final String thirdBiz;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private final Map<String, Object> infoData;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        private Map<String, Object> extraPutData;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private final boolean offline;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        private final String module;

        public C21156a(@NotNull String str, @NotNull MKLogSource mKLogSource, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String str5, @Nullable Map<String, ? extends Object> map, @Nullable Map<String, Object> map2, boolean z, @Nullable String str6) {
            str.getClass();
            mKLogSource.getClass();
            str5.getClass();
            this.errorCode = str;
            this.source = mKLogSource;
            this.bid = str2;
            this.url = str3;
            this.secondBiz = str4;
            this.thirdBiz = str5;
            this.infoData = map;
            this.extraPutData = map2;
            this.offline = z;
            this.module = str6;
        }

        @Nullable
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBid() {
            return this.bid;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Map<String, Object> m207251c() {
            return this.extraPutData;
        }

        @Nullable
        /* JADX INFO: renamed from: d */
        public final Map<String, Object> m207252d() {
            return this.infoData;
        }

        @Nullable
        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getModule() {
            return this.module;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C21156a)) {
                return false;
            }
            C21156a c21156a = (C21156a) other;
            return Intrinsics.m88377d(this.errorCode, c21156a.errorCode) && Intrinsics.m88377d(this.source, c21156a.source) && Intrinsics.m88377d(this.bid, c21156a.bid) && Intrinsics.m88377d(this.url, c21156a.url) && Intrinsics.m88377d(this.secondBiz, c21156a.secondBiz) && Intrinsics.m88377d(this.thirdBiz, c21156a.thirdBiz) && Intrinsics.m88377d(this.infoData, c21156a.infoData) && Intrinsics.m88377d(this.extraPutData, c21156a.extraPutData) && this.offline == c21156a.offline && Intrinsics.m88377d(this.module, c21156a.module);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getOffline() {
            return this.offline;
        }

        @Nullable
        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getSecondBiz() {
            return this.secondBiz;
        }

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final MKLogSource getSource() {
            return this.source;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18, types: [int] */
        /* JADX WARN: Type inference failed for: r2v22, types: [int] */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v31 */
        public int hashCode() {
            String str = this.errorCode;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            MKLogSource mKLogSource = this.source;
            int iHashCode2 = (iHashCode + (mKLogSource != null ? mKLogSource.hashCode() : 0)) * 31;
            String str2 = this.bid;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.url;
            int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.secondBiz;
            int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.thirdBiz;
            int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
            Map<String, Object> map = this.infoData;
            int iHashCode7 = (iHashCode6 + (map != null ? map.hashCode() : 0)) * 31;
            Map<String, Object> map2 = this.extraPutData;
            int iHashCode8 = (iHashCode7 + (map2 != null ? map2.hashCode() : 0)) * 31;
            boolean z = this.offline;
            ?? r2 = z;
            if (z) {
                r2 = 1;
            }
            int i = (iHashCode8 + r2) * 31;
            String str6 = this.module;
            return i + (str6 != null ? str6.hashCode() : 0);
        }

        @NotNull
        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getThirdBiz() {
            return this.thirdBiz;
        }

        @Nullable
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: k */
        public final void m207259k(@Nullable Map<String, Object> map) {
            this.extraPutData = map;
        }

        @NotNull
        public String toString() {
            return "GlobalErrorEmitArgs(errorCode=" + this.errorCode + ", source=" + this.source + ", bid=" + this.bid + ", url=" + this.url + ", secondBiz=" + this.secondBiz + ", thirdBiz=" + this.thirdBiz + ", infoData=" + this.infoData + ", extraPutData=" + this.extraPutData + ", offline=" + this.offline + ", module=" + this.module + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m207245a(C21156a args) {
        C21156a c21156a;
        if (args.m207251c() == null) {
            c21156a = args;
            c21156a.m207259k(new HashMap());
        } else {
            c21156a = args;
        }
        Map<String, Object> mapM207251c = c21156a.m207251c();
        if (mapM207251c != null) {
            mapM207251c.put("mkModule", c21156a.getModule());
        }
        MKLogReporter mKLogReporter = this.reporter;
        if (mKLogReporter != null) {
            mKLogReporter.m18439e(new kkw(MKLogLevel.ERROR, args.getErrorCode(), args.getSource(), args.getModule(), args.getBid(), args.getUrl(), args.getSecondBiz(), args.getThirdBiz(), args.m207252d(), args.m207251c(), args.getOffline(), 0L, 2048, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m207246c(wo2 wo2Var, MKGlobalErrorType mKGlobalErrorType, MKLogSource mKLogSource, String str, String str2, Map map, String str3, String str4, Map map2, String str5, int i, Object obj) {
        if (obj == null) {
            wo2Var.m207247b(mKGlobalErrorType, mKLogSource, str, str2, (i & 16) != 0 ? MapsKt.emptyMap() : map, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? MapsKt.emptyMap() : map2, (i & 256) != 0 ? null : str5);
        } else {
            pr3.m173429a("Super calls with default arguments not supported in this target, function: reportError");
        }
    }

    @JvmOverloads
    /* JADX INFO: renamed from: b */
    public final void m207247b(@NotNull MKGlobalErrorType type, @NotNull MKLogSource source, @Nullable String bid, @Nullable String url, @NotNull Map<String, ? extends Object> infoData, @Nullable String secondBiz, @Nullable String thirdBiz, @NotNull Map<String, ? extends Object> extraPutData, @Nullable String module) {
        type.getClass();
        source.getClass();
        infoData.getClass();
        extraPutData.getClass();
        m207245a(new C21156a(type.getBizThird(), source, bid, url, secondBiz != null ? secondBiz : bid, thirdBiz != null ? thirdBiz : type.getBizThird(), infoData, MapsKt.toMutableMap(extraPutData), type.getOffline(), module));
    }

    /* JADX INFO: renamed from: d */
    public final void m207248d(@Nullable MKLogReporter reporter) {
        this.reporter = reporter;
    }
}
