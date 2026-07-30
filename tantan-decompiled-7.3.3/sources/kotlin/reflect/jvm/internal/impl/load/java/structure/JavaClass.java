package kotlin.reflect.jvm.internal.impl.load.java.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaClass extends JavaClassifier, JavaModifierListOwner, JavaTypeParameterListOwner {
    /* JADX INFO: renamed from: A */
    boolean mo89912A();

    /* JADX INFO: renamed from: D */
    boolean mo89913D();

    @NotNull
    /* JADX INFO: renamed from: c */
    Collection<JavaClassifierType> mo89922c();

    @Nullable
    /* JADX INFO: renamed from: d */
    FqName mo89923d();

    @NotNull
    Collection<JavaConstructor> getConstructors();

    @NotNull
    Collection<JavaField> getFields();

    @NotNull
    Collection<JavaMethod> getMethods();

    @Nullable
    /* JADX INFO: renamed from: h */
    JavaClass mo89924h();

    boolean isEnum();

    boolean isInterface();

    /* JADX INFO: renamed from: l */
    boolean mo89925l();

    @NotNull
    /* JADX INFO: renamed from: q */
    Collection<Name> mo89926q();

    @Nullable
    /* JADX INFO: renamed from: v */
    LightClassOriginKind mo89927v();

    @NotNull
    /* JADX INFO: renamed from: y */
    Collection<JavaRecordComponent> mo89928y();

    /* JADX INFO: renamed from: z */
    boolean mo89929z();
}
