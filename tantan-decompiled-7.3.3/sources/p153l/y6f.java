package p153l;

import com.immomo.mwc.sdk.utils.thread.MThreadUtilsKt;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/y6f;", "", "", "executorType", "<init>", "(I)V", "thisRef", "Lkotlin/reflect/KProperty;", "property", "Ljava/util/concurrent/ScheduledExecutorService;", "a", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/util/concurrent/ScheduledExecutorService;", "I", "mwc_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class y6f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int executorType;

    public y6f(int i) {
        this.executorType = i;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService m214483a(@Nullable Object thisRef, @NotNull KProperty<?> property) {
        property.getClass();
        return MThreadUtilsKt.m20438c(this.executorType);
    }
}
