package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeParameterDescriptor extends ClassifierDescriptor, TypeParameterMarker {
    /* JADX INFO: renamed from: A */
    boolean mo88599A();

    @NotNull
    /* JADX INFO: renamed from: Z */
    StorageManager mo88600Z();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    @NotNull
    /* JADX INFO: renamed from: a */
    TypeParameterDescriptor mo88445a();

    int getIndex();

    @NotNull
    List<KotlinType> getUpperBounds();

    @NotNull
    /* JADX INFO: renamed from: h */
    Variance mo88601h();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor
    @NotNull
    /* JADX INFO: renamed from: l */
    TypeConstructor mo88305l();

    /* JADX INFO: renamed from: s */
    boolean mo88602s();
}
