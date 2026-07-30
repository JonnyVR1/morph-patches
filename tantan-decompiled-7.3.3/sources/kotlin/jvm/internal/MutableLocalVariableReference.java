package kotlin.jvm.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\u000b"}, m88121d2 = {"Lkotlin/jvm/internal/MutableLocalVariableReference;", "Lkotlin/jvm/internal/MutablePropertyReference0;", "<init>", "()V", "getOwner", "Lkotlin/reflect/KDeclarationContainer;", "get", "", "set", "", "value", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public class MutableLocalVariableReference extends MutablePropertyReference0 {
    @Override // kotlin.jvm.internal.MutablePropertyReference0
    @Nullable
    public Object get() {
        LocalVariableReferencesKt.m88394b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.CallableReference
    @NotNull
    public KDeclarationContainer getOwner() {
        LocalVariableReferencesKt.m88394b();
        throw new KotlinNothingValueException();
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference0
    public void set(@Nullable Object value) {
        LocalVariableReferencesKt.m88394b();
        throw new KotlinNothingValueException();
    }
}
