package androidx.work;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: androidx.work.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00122\u00020\u0001:\u0001\fBI\b\u0000\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, m87232d2 = {"Landroidx/work/g;", "", "", "Ljava/util/UUID;", "ids", "", "uniqueWorkNames", "tags", "Landroidx/work/WorkInfo$State;", "states", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", Constants.INAPP_DATA_TAG, "c", "Companion", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class C0767g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final List<UUID> ids;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final List<String> uniqueWorkNames;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<String> tags;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<WorkInfo.State> states;

    public /* synthetic */ C0767g(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2, (i & 4) != 0 ? CollectionsKt.emptyList() : list3, (i & 8) != 0 ? CollectionsKt.emptyList() : list4);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<UUID> m4427a() {
        return this.ids;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<WorkInfo.State> m4428b() {
        return this.states;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final List<String> m4429c() {
        return this.tags;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final List<String> m4430d() {
        return this.uniqueWorkNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0767g(@NotNull List<UUID> list, @NotNull List<String> list2, @NotNull List<String> list3, @NotNull List<? extends WorkInfo.State> list4) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.ids = list;
        this.uniqueWorkNames = list2;
        this.tags = list3;
        this.states = list4;
    }

    public C0767g() {
        this(null, null, null, null, 15, null);
    }
}
