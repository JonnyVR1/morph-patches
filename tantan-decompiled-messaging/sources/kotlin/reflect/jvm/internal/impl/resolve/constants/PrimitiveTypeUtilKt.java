package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class PrimitiveTypeUtilKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Collection<KotlinType> m91956a(@NotNull ModuleDescriptor moduleDescriptor) {
        moduleDescriptor.getClass();
        return CollectionsKt.listOf((Object[]) new SimpleType[]{moduleDescriptor.mo88546f().m88208E(), moduleDescriptor.mo88546f().m88211G(), moduleDescriptor.mo88546f().m88244u(), moduleDescriptor.mo88546f().m88222U()});
    }
}
