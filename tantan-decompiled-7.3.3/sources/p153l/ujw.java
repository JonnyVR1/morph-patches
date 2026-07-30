package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0018\b\u0002\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\fR'\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/ujw;", "", "", "versionName", "versionCode", "appChanel", "customAppendUA", "Lkotlin/Function1;", "customPageAppendUA", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", Constants.INAPP_DATA_TAG, "c", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final /* data */ class ujw {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final String versionName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String versionCode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final String appChanel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final String customAppendUA;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private final Function1<String, String> customPageAppendUA;

    public /* synthetic */ ujw(String str, String str2, String str3, String str4, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : function1);
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAppChanel() {
        return this.appChanel;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCustomAppendUA() {
        return this.customAppendUA;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final Function1<String, String> m196466c() {
        return this.customPageAppendUA;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getVersionCode() {
        return this.versionCode;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getVersionName() {
        return this.versionName;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ujw)) {
            return false;
        }
        ujw ujwVar = (ujw) other;
        return Intrinsics.m88377d(this.versionName, ujwVar.versionName) && Intrinsics.m88377d(this.versionCode, ujwVar.versionCode) && Intrinsics.m88377d(this.appChanel, ujwVar.appChanel) && Intrinsics.m88377d(this.customAppendUA, ujwVar.customAppendUA) && Intrinsics.m88377d(this.customPageAppendUA, ujwVar.customPageAppendUA);
    }

    public int hashCode() {
        String str = this.versionName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.versionCode;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appChanel;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.customAppendUA;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Function1<String, String> function1 = this.customPageAppendUA;
        return iHashCode4 + (function1 != null ? function1.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MKCustomUAParam(versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", appChanel=" + this.appChanel + ", customAppendUA=" + this.customAppendUA + ", customPageAppendUA=" + this.customPageAppendUA + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ujw(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Function1<? super String, String> function1) {
        this.versionName = str;
        this.versionCode = str2;
        this.appChanel = str3;
        this.customAppendUA = str4;
        this.customPageAppendUA = function1;
    }

    public ujw() {
        this(null, null, null, null, null, 31, null);
    }
}
