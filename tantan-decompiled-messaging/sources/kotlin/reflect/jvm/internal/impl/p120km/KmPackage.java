package kotlin.reflect.jvm.internal.impl.p120km;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmPackage implements KmDeclarationContainer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmFunction> f64514a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmProperty> f64515b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeAlias> f64516c;

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<KmProperty> mo89099a() {
        return this.f64515b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<KmTypeAlias> mo89100b() {
        return this.f64516c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p120km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KmFunction> mo89101c() {
        return this.f64514a;
    }
}
