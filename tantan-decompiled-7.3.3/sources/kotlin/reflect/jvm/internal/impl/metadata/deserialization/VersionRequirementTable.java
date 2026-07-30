package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class VersionRequirementTable {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final VersionRequirementTable f66079b = new VersionRequirementTable(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<ProtoBuf.VersionRequirement> f66080a;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final VersionRequirementTable m91823a(@NotNull ProtoBuf.VersionRequirementTable versionRequirementTable) {
            versionRequirementTable.getClass();
            if (versionRequirementTable.getRequirementCount() == 0) {
                return m91824b();
            }
            List<ProtoBuf.VersionRequirement> requirementList = versionRequirementTable.getRequirementList();
            requirementList.getClass();
            return new VersionRequirementTable(requirementList, null);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final VersionRequirementTable m91824b() {
            return VersionRequirementTable.f66079b;
        }

        private Companion() {
        }
    }

    public VersionRequirementTable(List<ProtoBuf.VersionRequirement> list) {
        this.f66080a = list;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final ProtoBuf.VersionRequirement m91822b(int i) {
        return (ProtoBuf.VersionRequirement) CollectionsKt.getOrNull(this.f66080a, i);
    }

    public /* synthetic */ VersionRequirementTable(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }
}
