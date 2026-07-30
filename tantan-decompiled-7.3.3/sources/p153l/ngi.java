package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b&\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0011J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0011J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010*\u001a\u0004\b\u001f\u0010+\"\u0004\b,\u0010-R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b.\u0010\u0011\"\u0004\b0\u00101¨\u00062"}, m88121d2 = {"Ll/ngi;", "", "", "url", "", "greyState", "", "localVersion", "Ll/lgi$a;", "matchedVersion", "Ll/lgi;", "greyRule", "", "isSameVersion", "<init>", "(Ljava/lang/String;IJLl/lgi$a;Ll/lgi;Z)V", "c", "()Z", "g", "e", Constants.INAPP_DATA_TAG, "a", "()Ljava/lang/String;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "b", "I", "getGreyState", "setGreyState", "(I)V", "J", "getLocalVersion", "()J", "Ll/lgi$a;", "getMatchedVersion", "()Ll/lgi$a;", "Ll/lgi;", "()Ll/lgi;", "setGreyRule", "(Ll/lgi;)V", "f", "Z", "setSameVersion", "(Z)V", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class ngi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int greyState;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final long localVersion;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final lgi.C18390a matchedVersion;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private lgi greyRule;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isSameVersion;

    public /* synthetic */ ngi(String str, int i, long j, lgi.C18390a c18390a, lgi lgiVar, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? null : c18390a, (i2 & 16) == 0 ? lgiVar : null, (i2 & 32) != 0 ? false : z);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m162966a() {
        String str = "";
        if (this.matchedVersion == null) {
            return "";
        }
        if (m162969d()) {
            str = "f";
        } else if (m162970e()) {
            str = "g";
        }
        return str + '+' + this.localVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final lgi getGreyRule() {
        return this.greyRule;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m162968c() {
        int i = this.greyState;
        return i == 0 || i == 1;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m162969d() {
        return this.greyState == 1;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m162970e() {
        return this.greyState == 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ngi)) {
            return false;
        }
        ngi ngiVar = (ngi) other;
        return Intrinsics.m88377d(this.url, ngiVar.url) && this.greyState == ngiVar.greyState && this.localVersion == ngiVar.localVersion && Intrinsics.m88377d(this.matchedVersion, ngiVar.matchedVersion) && Intrinsics.m88377d(this.greyRule, ngiVar.greyRule) && this.isSameVersion == ngiVar.isSameVersion;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsSameVersion() {
        return this.isSameVersion;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m162972g() {
        return m162968c() && !this.isSameVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public int hashCode() {
        String str = this.url;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.greyState)) * 31) + Long.hashCode(this.localVersion)) * 31;
        lgi.C18390a c18390a = this.matchedVersion;
        int iHashCode2 = (iHashCode + (c18390a != null ? c18390a.hashCode() : 0)) * 31;
        lgi lgiVar = this.greyRule;
        int iHashCode3 = (iHashCode2 + (lgiVar != null ? lgiVar.hashCode() : 0)) * 31;
        boolean z = this.isSameVersion;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        return iHashCode3 + r4;
    }

    @NotNull
    public String toString() {
        return "FepGreyState(url=" + this.url + ", greyState=" + this.greyState + ", localVersion=" + this.localVersion + ", matchedVersion=" + this.matchedVersion + ", greyRule=" + this.greyRule + ", isSameVersion=" + this.isSameVersion + ")";
    }

    public ngi(@NotNull String str, int i, long j, @Nullable lgi.C18390a c18390a, @Nullable lgi lgiVar, boolean z) {
        str.getClass();
        this.url = str;
        this.greyState = i;
        this.localVersion = j;
        this.matchedVersion = c18390a;
        this.greyRule = lgiVar;
        this.isSameVersion = z;
    }
}
