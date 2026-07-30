package kotlin.reflect.jvm.internal.calls;

import com.clevertap.android.sdk.Constants;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m87232d2 = {"Lkotlin/reflect/jvm/internal/calls/ThrowingCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "<init>", "()V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ThrowingCaller implements Caller {

    @NotNull
    public static final ThrowingCaller INSTANCE = new ThrowingCaller();

    private ThrowingCaller() {
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: a */
    public /* bridge */ boolean mo88058a() {
        return m88097c();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ Member mo88059b() {
        return (Member) m88098d();
    }

    /* JADX INFO: renamed from: c */
    public boolean m88097c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) {
        args.getClass();
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public Void m88098d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return CollectionsKt.emptyList();
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }
}
