package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.KClassifier;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, m88121d2 = {"Lkotlin/reflect/jvm/internal/KTypeAliasImpl;", "Lkotlin/reflect/KClassifier;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "fqName", "<init>", "(Lorg/jetbrains/kotlin/name/FqName;)V", "a", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "getFqName", "()Lorg/jetbrains/kotlin/name/FqName;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassifierDescriptor;", "descriptor", "kotlin-reflection"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class KTypeAliasImpl implements KClassifier, KClassifierImpl {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final FqName fqName;

    public KTypeAliasImpl(@NotNull FqName fqName) {
        fqName.getClass();
        this.fqName = fqName;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FqName getFqName() {
        return this.fqName;
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: e */
    public ClassifierDescriptor mo88647e() {
        throw new IllegalStateException(("Cannot load descriptor of a type alias: " + this.fqName).toString());
    }
}
