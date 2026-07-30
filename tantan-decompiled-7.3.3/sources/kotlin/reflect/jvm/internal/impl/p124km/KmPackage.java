package kotlin.reflect.jvm.internal.impl.p124km;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class KmPackage implements KmDeclarationContainer {

    /* JADX INFO: renamed from: a */
    @NotNull
    public final List<KmFunction> f65188a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public final List<KmProperty> f65189b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final List<KmTypeAlias> f65190c;

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: a */
    public List<KmProperty> mo89990a() {
        return this.f65189b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: b */
    public List<KmTypeAlias> mo89991b() {
        return this.f65190c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.p124km.KmDeclarationContainer
    @NotNull
    /* JADX INFO: renamed from: c */
    public List<KmFunction> mo89992c() {
        return this.f65188a;
    }
}
