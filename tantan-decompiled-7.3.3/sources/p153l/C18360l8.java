package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.l8 */
/* JADX INFO: loaded from: classes2.dex */
public class C18360l8 implements Function0 {

    /* JADX INFO: renamed from: a */
    public final TypeCheckerState f130399a;

    /* JADX INFO: renamed from: b */
    public final TypeSystemContext f130400b;

    /* JADX INFO: renamed from: c */
    public final RigidTypeMarker f130401c;

    /* JADX INFO: renamed from: d */
    public final RigidTypeMarker f130402d;

    public C18360l8(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f130399a = typeCheckerState;
        this.f130400b = typeSystemContext;
        this.f130401c = rigidTypeMarker;
        this.f130402d = rigidTypeMarker2;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.m93404z(this.f130399a, this.f130400b, this.f130401c, this.f130402d));
    }
}
