package p149l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.q8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19443q8 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeCheckerState f153102a;

    /* JADX INFO: renamed from: b */
    public final TypeSystemContext f153103b;

    /* JADX INFO: renamed from: c */
    public final RigidTypeMarker f153104c;

    /* JADX INFO: renamed from: d */
    public final RigidTypeMarker f153105d;

    public C19443q8(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f153102a = typeCheckerState;
        this.f153103b = typeSystemContext;
        this.f153104c = rigidTypeMarker;
        this.f153105d = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.m92513z(this.f153102a, this.f153103b, this.f153104c, this.f153105d));
    }
}
