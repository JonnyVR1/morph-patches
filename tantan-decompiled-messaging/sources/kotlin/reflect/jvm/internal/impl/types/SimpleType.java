package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import org.jetbrains.annotations.NotNull;
import p149l.r0g0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public abstract SimpleType mo89967N0(boolean z);

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public abstract SimpleType mo89968O0(@NotNull TypeAttributes typeAttributes);

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            r0g0.m177399k(sb, "[", DescriptorRenderer.m91438Q(DescriptorRenderer.f65745j, it.next(), null, 2, null), "] ");
        }
        sb.append(mo91890G0());
        if (!mo91888E0().isEmpty()) {
            CollectionsKt.joinTo$default(mo91888E0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo89966H0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
