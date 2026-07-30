package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m88121d2 = {"<anonymous>", "", "E", "e", "invoke"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
@SourceDebugExtension
final class ExceptionsConstructorKt$createConstructor$1$4 extends Lambda implements Function1<Throwable, Throwable> {
    final /* synthetic */ Constructor<?> $constructor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionsConstructorKt$createConstructor$1$4(Constructor<?> constructor) {
        super(1);
        this.$constructor = constructor;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Throwable invoke(@NotNull Throwable th) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance = this.$constructor.newInstance(null);
        objNewInstance.getClass();
        Throwable th2 = (Throwable) objNewInstance;
        th2.initCause(th);
        return th2;
    }
}
