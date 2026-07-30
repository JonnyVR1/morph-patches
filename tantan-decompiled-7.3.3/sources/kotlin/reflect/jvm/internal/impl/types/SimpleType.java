package kotlin.reflect.jvm.internal.impl.types;

import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker;
import org.jetbrains.annotations.NotNull;
import p153l.y8g0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SimpleType extends UnwrappedType implements SimpleTypeMarker, TypeArgumentListMarker {
    public SimpleType() {
        super(null);
    }

    @NotNull
    /* JADX INFO: renamed from: N0 */
    public abstract SimpleType mo90858N0(boolean z);

    @NotNull
    /* JADX INFO: renamed from: O0 */
    public abstract SimpleType mo90859O0(@NotNull TypeAttributes typeAttributes);

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<AnnotationDescriptor> it = getAnnotations().iterator();
        while (it.hasNext()) {
            y8g0.m214750k(sb, "[", DescriptorRenderer.m92329Q(DescriptorRenderer.f66419j, it.next(), null, 2, null), "] ");
        }
        sb.append(mo92781G0());
        if (!mo92779E0().isEmpty()) {
            CollectionsKt.joinTo$default(mo92779E0(), sb, ", ", "<", ">", 0, null, null, 112, null);
        }
        if (mo90857H0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
