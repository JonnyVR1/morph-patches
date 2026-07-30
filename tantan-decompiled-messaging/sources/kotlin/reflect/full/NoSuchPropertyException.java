package kotlin.reflect.full;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0010\b\u0002\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Lkotlin/reflect/full/NoSuchPropertyException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "<init>", "(Ljava/lang/Exception;)V", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class NoSuchPropertyException extends Exception {
    public /* synthetic */ NoSuchPropertyException(Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : exc);
    }

    public NoSuchPropertyException(@Nullable Exception exc) {
        super(exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NoSuchPropertyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
