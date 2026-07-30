package p153l;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.k8 */
/* JADX INFO: loaded from: classes2.dex */
public class C18115k8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final Collection f124315a;

    /* JADX INFO: renamed from: b */
    public final TypeCheckerState f124316b;

    /* JADX INFO: renamed from: c */
    public final TypeSystemContext f124317c;

    /* JADX INFO: renamed from: d */
    public final RigidTypeMarker f124318d;

    public C18115k8(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        this.f124315a = collection;
        this.f124316b = typeCheckerState;
        this.f124317c = typeSystemContext;
        this.f124318d = rigidTypeMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeChecker.m93403y(this.f124315a, this.f124316b, this.f124317c, this.f124318d, (TypeCheckerState.ForkPointContext) obj);
    }
}
