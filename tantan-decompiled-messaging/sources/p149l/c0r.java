package p149l;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* JADX INFO: loaded from: classes2.dex */
public class c0r implements Function1 {

    /* JADX INFO: renamed from: a */
    public final TypeConstructor f78166a;

    /* JADX INFO: renamed from: b */
    public final List f78167b;

    /* JADX INFO: renamed from: c */
    public final TypeAttributes f78168c;

    /* JADX INFO: renamed from: d */
    public final boolean f78169d;

    public c0r(TypeConstructor typeConstructor, List list, TypeAttributes typeAttributes, boolean z) {
        this.f78166a = typeConstructor;
        this.f78167b = list;
        this.f78168c = typeAttributes;
        this.f78169d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return KotlinTypeFactory.m92635l(this.f78166a, this.f78167b, this.f78168c, this.f78169d, (KotlinTypeRefiner) obj);
    }
}
