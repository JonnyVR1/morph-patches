package p149l;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: renamed from: l.p8 */
/* JADX INFO: loaded from: classes2.dex */
public class C19153p8 implements Function1 {

    /* JADX INFO: renamed from: a */
    public final Collection f147552a;

    /* JADX INFO: renamed from: b */
    public final TypeCheckerState f147553b;

    /* JADX INFO: renamed from: c */
    public final TypeSystemContext f147554c;

    /* JADX INFO: renamed from: d */
    public final RigidTypeMarker f147555d;

    public C19153p8(Collection collection, TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker) {
        this.f147552a = collection;
        this.f147553b = typeCheckerState;
        this.f147554c = typeSystemContext;
        this.f147555d = rigidTypeMarker;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return AbstractTypeChecker.m92512y(this.f147552a, this.f147553b, this.f147554c, this.f147555d, (TypeCheckerState.ForkPointContext) obj);
    }
}
