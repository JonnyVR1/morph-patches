package p153l;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* JADX INFO: loaded from: classes2.dex */
public class omq implements Function0 {

    /* JADX INFO: renamed from: a */
    public final JavaTypeResolver f147983a;

    /* JADX INFO: renamed from: b */
    public final TypeParameterDescriptor f147984b;

    /* JADX INFO: renamed from: c */
    public final JavaTypeAttributes f147985c;

    /* JADX INFO: renamed from: d */
    public final TypeConstructor f147986d;

    /* JADX INFO: renamed from: e */
    public final JavaClassifierType f147987e;

    public omq(JavaTypeResolver javaTypeResolver, TypeParameterDescriptor typeParameterDescriptor, JavaTypeAttributes javaTypeAttributes, TypeConstructor typeConstructor, JavaClassifierType javaClassifierType) {
        this.f147983a = javaTypeResolver;
        this.f147984b = typeParameterDescriptor;
        this.f147985c = javaTypeAttributes;
        this.f147986d = typeConstructor;
        this.f147987e = javaClassifierType;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return JavaTypeResolver.m90751e(this.f147983a, this.f147984b, this.f147985c, this.f147986d, this.f147987e);
    }
}
