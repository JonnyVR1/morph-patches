package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R2\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001c\u0010\u001dR\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\f\"\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m87232d2 = {"Ll/w4j0;", "", "Ljava/util/ArrayList;", "Ll/o3g0;", "Lkotlin/collections/ArrayList;", "subTraceBeans", "", Constants.KEY_KEY, "extras", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/ArrayList;", "c", "()Ljava/util/ArrayList;", "setSubTraceBeans", "(Ljava/util/ArrayList;)V", "b", "Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final /* data */ class w4j0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public ArrayList<o3g0> subTraceBeans;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public String key;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public String extras;

    public w4j0(@NotNull ArrayList<o3g0> arrayList, @NotNull String str, @NotNull String str2) {
        arrayList.getClass();
        str.getClass();
        str2.getClass();
        this.subTraceBeans = arrayList;
        this.key = str;
        this.extras = str2;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getExtras() {
        return this.extras;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final ArrayList<o3g0> m201530c() {
        return this.subTraceBeans;
    }

    /* JADX INFO: renamed from: d */
    public final void m201531d(@NotNull String str) {
        str.getClass();
        this.extras = str;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof w4j0)) {
            return false;
        }
        w4j0 w4j0Var = (w4j0) other;
        return Intrinsics.m87488d(this.subTraceBeans, w4j0Var.subTraceBeans) && Intrinsics.m87488d(this.key, w4j0Var.key) && Intrinsics.m87488d(this.extras, w4j0Var.extras);
    }

    public int hashCode() {
        return (((this.subTraceBeans.hashCode() * 31) + this.key.hashCode()) * 31) + this.extras.hashCode();
    }

    @NotNull
    public String toString() {
        return "TraceBean(subTraceBeans=" + this.subTraceBeans + ", key=" + this.key + ", extras=" + this.extras + ")";
    }
}
