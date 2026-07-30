package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface DeclaredMemberIndex {

    public static final class Empty implements DeclaredMemberIndex {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* JADX INFO: renamed from: a */
        public Set<Name> mo90523a() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* JADX INFO: renamed from: b */
        public Set<Name> mo90524b() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        /* JADX INFO: renamed from: c */
        public JavaField mo90525c(@NotNull Name name) {
            name.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* JADX INFO: renamed from: d */
        public Set<Name> mo90526d() {
            return SetsKt.emptySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @Nullable
        /* JADX INFO: renamed from: f */
        public JavaRecordComponent mo90528f(@NotNull Name name) {
            name.getClass();
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.DeclaredMemberIndex
        @NotNull
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<JavaMethod> mo90527e(@NotNull Name name) {
            name.getClass();
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    Set<Name> mo90523a();

    @NotNull
    /* JADX INFO: renamed from: b */
    Set<Name> mo90524b();

    @Nullable
    /* JADX INFO: renamed from: c */
    JavaField mo90525c(@NotNull Name name);

    @NotNull
    /* JADX INFO: renamed from: d */
    Set<Name> mo90526d();

    @NotNull
    /* JADX INFO: renamed from: e */
    Collection<JavaMethod> mo90527e(@NotNull Name name);

    @Nullable
    /* JADX INFO: renamed from: f */
    JavaRecordComponent mo90528f(@NotNull Name name);
}
