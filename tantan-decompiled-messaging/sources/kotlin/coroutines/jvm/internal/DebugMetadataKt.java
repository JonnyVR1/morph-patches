package kotlin.coroutines.jvm.internal;

import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.v700;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "c", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "a", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "b", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class DebugMetadataKt {
    /* JADX INFO: renamed from: a */
    public static final DebugMetadata m87378a(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* JADX INFO: renamed from: b */
    public static final int m87379b(BaseContinuationImpl baseContinuationImpl) {
        try {
            Field declaredField = baseContinuationImpl.getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(baseContinuationImpl);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    @SinceKotlin
    @JvmName
    @Nullable
    @PublishedApi
    /* JADX INFO: renamed from: c */
    public static final StackTraceElement m87380c(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String strM87373c;
        baseContinuationImpl.getClass();
        DebugMetadata debugMetadataM87378a = m87378a(baseContinuationImpl);
        if (debugMetadataM87378a == null || debugMetadataM87378a.m87377v() < 1) {
            return null;
        }
        int iM87379b = m87379b(baseContinuationImpl);
        int i = iM87379b < 0 ? -1 : debugMetadataM87378a.m87375l()[iM87379b];
        String strM197310b = v700.INSTANCE.m197310b(baseContinuationImpl);
        if (strM197310b == null) {
            strM87373c = debugMetadataM87378a.m87373c();
        } else {
            strM87373c = strM197310b + '/' + debugMetadataM87378a.m87373c();
        }
        return new StackTraceElement(strM87373c, debugMetadataM87378a.m87376m(), debugMetadataM87378a.m87374f(), i);
    }
}
