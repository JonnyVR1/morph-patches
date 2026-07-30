package p149l;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, m87232d2 = {"Ll/g2f;", "", "", "Lorg/json/JSONObject;", "immediateClientSideInApps", "delayedClientSideInApps", "serverSideInActionInApps", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* data */ class g2f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<JSONObject> immediateClientSideInApps;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<JSONObject> delayedClientSideInApps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final List<JSONObject> serverSideInActionInApps;

    /* JADX WARN: Multi-variable type inference failed */
    public g2f(@NotNull List<? extends JSONObject> list, @NotNull List<? extends JSONObject> list2, @NotNull List<? extends JSONObject> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.immediateClientSideInApps = list;
        this.delayedClientSideInApps = list2;
        this.serverSideInActionInApps = list3;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<JSONObject> m124155a() {
        return this.delayedClientSideInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<JSONObject> m124156b() {
        return this.immediateClientSideInApps;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<JSONObject> m124157c() {
        return this.serverSideInActionInApps;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof g2f)) {
            return false;
        }
        g2f g2fVar = (g2f) other;
        return Intrinsics.m87488d(this.immediateClientSideInApps, g2fVar.immediateClientSideInApps) && Intrinsics.m87488d(this.delayedClientSideInApps, g2fVar.delayedClientSideInApps) && Intrinsics.m87488d(this.serverSideInActionInApps, g2fVar.serverSideInActionInApps);
    }

    public int hashCode() {
        return (((this.immediateClientSideInApps.hashCode() * 31) + this.delayedClientSideInApps.hashCode()) * 31) + this.serverSideInActionInApps.hashCode();
    }

    @NotNull
    public String toString() {
        return "EvaluatedInAppsResult(immediateClientSideInApps=" + this.immediateClientSideInApps + ", delayedClientSideInApps=" + this.delayedClientSideInApps + ", serverSideInActionInApps=" + this.serverSideInActionInApps + ')';
    }
}
