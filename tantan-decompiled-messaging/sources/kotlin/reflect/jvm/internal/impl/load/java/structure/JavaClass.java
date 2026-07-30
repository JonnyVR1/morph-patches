package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    /* JADX INFO: renamed from: A */
    boolean mo89021A();

    /* JADX INFO: renamed from: D */
    boolean mo89022D();

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<JavaClassifierType> mo89031c();

    @Nullable
    /* JADX INFO: renamed from: d */
    FqName mo89032d();

    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    /* JADX INFO: renamed from: h */
    JavaClass mo89033h();

    boolean isEnum();

    boolean isInterface();

    /* JADX INFO: renamed from: l */
    boolean mo89034l();

    @NotNull
    /* JADX INFO: renamed from: q */
    Collection<Name> mo89035q();

    @Nullable
    /* JADX INFO: renamed from: v */
    LightClassOriginKind mo89036v();

    @NotNull
    /* JADX INFO: renamed from: y */
    Collection<JavaRecordComponent> mo89037y();

    /* JADX INFO: renamed from: z */
    boolean mo89038z();
}
