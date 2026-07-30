package com.immomo.mmdns;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u001f\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m87232d2 = {"Lcom/immomo/mmdns/DnsSlaData;", "", NotificationCompat.CATEGORY_STATUS, "", "", "(Ljava/util/Map;)V", "getStatus", "()Ljava/util/Map;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "mmdns_release"}, m87233k = 1, m87234mv = {1, 1, 16})
public final /* data */ class DnsSlaData {

    @NotNull
    private final Map<Integer, Integer> status;

    public /* synthetic */ DnsSlaData(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DnsSlaData copy$default(DnsSlaData dnsSlaData, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = dnsSlaData.status;
        }
        return dnsSlaData.copy(map);
    }

    @NotNull
    public final Map<Integer, Integer> component1() {
        return this.status;
    }

    @NotNull
    public final DnsSlaData copy(@NotNull Map<Integer, Integer> status) {
        status.getClass();
        return new DnsSlaData(status);
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof DnsSlaData) && Intrinsics.m87488d(this.status, ((DnsSlaData) other).status);
        }
        return true;
    }

    @NotNull
    public final Map<Integer, Integer> getStatus() {
        return this.status;
    }

    public int hashCode() {
        Map<Integer, Integer> map = this.status;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "DnsSlaData(status=" + this.status + ")";
    }

    public DnsSlaData(@NotNull Map<Integer, Integer> map) {
        map.getClass();
        this.status = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DnsSlaData() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
