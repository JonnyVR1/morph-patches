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
import p153l.eg00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Ljava/lang/StackTraceElement;", "c", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/DebugMetadata;", "a", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)Lkotlin/coroutines/jvm/internal/DebugMetadata;", "", "b", "(Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;)I", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class DebugMetadataKt {
    /* JADX INFO: renamed from: a */
    public static final DebugMetadata m88267a(BaseContinuationImpl baseContinuationImpl) {
        return (DebugMetadata) baseContinuationImpl.getClass().getAnnotation(DebugMetadata.class);
    }

    /* JADX INFO: renamed from: b */
    public static final int m88268b(BaseContinuationImpl baseContinuationImpl) {
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
    public static final StackTraceElement m88269c(@NotNull BaseContinuationImpl baseContinuationImpl) {
        String strM88262c;
        baseContinuationImpl.getClass();
        DebugMetadata debugMetadataM88267a = m88267a(baseContinuationImpl);
        if (debugMetadataM88267a == null || debugMetadataM88267a.m88266v() < 1) {
            return null;
        }
        int iM88268b = m88268b(baseContinuationImpl);
        int i = iM88268b < 0 ? -1 : debugMetadataM88267a.m88264l()[iM88268b];
        String strM120752b = eg00.INSTANCE.m120752b(baseContinuationImpl);
        if (strM120752b == null) {
            strM88262c = debugMetadataM88267a.m88262c();
        } else {
            strM88262c = strM120752b + '/' + debugMetadataM88267a.m88262c();
        }
        return new StackTraceElement(strM88262c, debugMetadataM88267a.m88265m(), debugMetadataM88267a.m88263f(), i);
    }
}
