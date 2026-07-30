package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface PackagePartProvider {

    public static final class Empty implements PackagePartProvider {

        @NotNull
        public static final Empty INSTANCE = new Empty();

        private Empty() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider
        @NotNull
        /* JADX INFO: renamed from: a */
        public List<String> mo90383a(@NotNull String str) {
            str.getClass();
            return CollectionsKt.emptyList();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    List<String> mo90383a(@NotNull String str);
}
