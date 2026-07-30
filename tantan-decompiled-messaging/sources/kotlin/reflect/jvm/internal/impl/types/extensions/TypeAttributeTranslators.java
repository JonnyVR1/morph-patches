package kotlin.reflect.jvm.internal.impl.types.extensions;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributeTranslator;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class TypeAttributeTranslators {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<TypeAttributeTranslator> f66344a;

    /* JADX WARN: Multi-variable type inference failed */
    public TypeAttributeTranslators(@NotNull List<? extends TypeAttributeTranslator> list) {
        list.getClass();
        this.f66344a = list;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final List<TypeAttributeTranslator> m93016a() {
        return this.f66344a;
    }
}
