package p153l;

import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.feppkg.internal.core.FepPackageContext;
import com.sina.weibo.sdk.constant.WBConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/fhi;", "", "<init>", "()V", "", "url", "urlBid", WBConstants.AUTH_PARAMS_VERSION, "Ll/fhi$a;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ll/fhi$a;", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class fhi {
    public static final fhi INSTANCE = new fhi();

    private fhi() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C16975a m125555b(fhi fhiVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return fhiVar.m125556a(str, str2, str3);
    }

    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: a */
    public final C16975a m125556a(@Nullable String url, @Nullable String urlBid, @Nullable String version) {
        if (urlBid == null || StringsKt.m94329e0(urlBid)) {
            if (url == null || StringsKt.m94329e0(url)) {
                return null;
            }
            urlBid = a6k0.m96329a(url);
        }
        if (StringsKt.m94329e0(urlBid)) {
            return null;
        }
        if (!Intrinsics.m88377d("0", urlBid)) {
            if (version == null || StringsKt.m94329e0(version)) {
                version = (url == null || StringsKt.m94329e0(url)) ? "default" : a6k0.m96336j(url);
            }
            return new C16975a(urlBid, version, url);
        }
        pgi.m172239k(FepPackageContext.INSTANCE.m17685l(), "getPackageInfo bid can't empty, url=" + url, null, 0, null, 14, null);
        return null;
    }

    /* JADX INFO: renamed from: l.fhi$a */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0017\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\t¨\u0006\u001b"}, m88121d2 = {"Ll/fhi$a;", "", "", "bid", "baseVersion", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getJustGetInfo", "()Z", Constants.INAPP_DATA_TAG, "(Z)V", "justGetInfo", "b", "Ljava/lang/String;", "c", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final /* data */ class C16975a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean justGetInfo;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private final String bid;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        private final String baseVersion;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        private final String url;

        public C16975a(@NotNull String str, @NotNull String str2, @Nullable String str3) {
            str.getClass();
            str2.getClass();
            this.bid = str;
            this.baseVersion = str2;
            this.url = str3;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBaseVersion() {
            return this.baseVersion;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBid() {
            return this.bid;
        }

        @Nullable
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: d */
        public final void m125560d(boolean z) {
            this.justGetInfo = z;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C16975a)) {
                return false;
            }
            C16975a c16975a = (C16975a) other;
            return Intrinsics.m88377d(this.bid, c16975a.bid) && Intrinsics.m88377d(this.baseVersion, c16975a.baseVersion) && Intrinsics.m88377d(this.url, c16975a.url);
        }

        public int hashCode() {
            String str = this.bid;
            int iHashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.baseVersion;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.url;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "URLParseResult(bid=" + this.bid + ", baseVersion=" + this.baseVersion + ", url=" + this.url + ")";
        }

        public /* synthetic */ C16975a(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }
    }
}
