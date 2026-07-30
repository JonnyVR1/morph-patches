package p153l;

import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, m88121d2 = {"Ll/lgi;", "", "", "bid", "projectName", "", "Ll/lgi$a;", "versionInfos", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getBid", "b", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class lgi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String bid;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String projectName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Map<String, C18390a> versionInfos;

    /* JADX INFO: renamed from: l.lgi$a */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\r¨\u0006\u0019"}, m88121d2 = {"Ll/lgi$a;", "", "", "tag", "", WBConstants.AUTH_PARAMS_VERSION, "", "type", "<init>", "(Ljava/lang/String;JI)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "c", "()J", "I", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C18390a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final String tag;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long version;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int type;

        public C18390a(@NotNull String str, long j, int i) {
            str.getClass();
            this.tag = str;
            this.version = j;
            this.type = i;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final long getVersion() {
            return this.version;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C18390a)) {
                return false;
            }
            C18390a c18390a = (C18390a) other;
            return Intrinsics.m88377d(this.tag, c18390a.tag) && this.version == c18390a.version && this.type == c18390a.type;
        }

        public int hashCode() {
            String str = this.tag;
            return ((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.version)) * 31) + Integer.hashCode(this.type);
        }

        @NotNull
        public String toString() {
            return "VersionInfo(tag=" + this.tag + ", version=" + this.version + ", type=" + this.type + ")";
        }
    }

    public lgi(@NotNull String str, @Nullable String str2, @Nullable Map<String, C18390a> map) {
        str.getClass();
        this.bid = str;
        this.projectName = str2;
        this.versionInfos = map;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getProjectName() {
        return this.projectName;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Map<String, C18390a> m154068b() {
        return this.versionInfos;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof lgi)) {
            return false;
        }
        lgi lgiVar = (lgi) other;
        return Intrinsics.m88377d(this.bid, lgiVar.bid) && Intrinsics.m88377d(this.projectName, lgiVar.projectName) && Intrinsics.m88377d(this.versionInfos, lgiVar.versionInfos);
    }

    public int hashCode() {
        String str = this.bid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.projectName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, C18390a> map = this.versionInfos;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FepGreyRule(bid=" + this.bid + ", projectName=" + this.projectName + ", versionInfos=" + this.versionInfos + ")";
    }
}
