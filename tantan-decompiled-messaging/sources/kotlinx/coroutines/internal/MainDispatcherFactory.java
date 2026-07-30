package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.hpw;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m87232d2 = {"Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "", "allFactories", "Ll/hpw;", "createDispatcher", "(Ljava/util/List;)Ll/hpw;", "", "hintOnError", "()Ljava/lang/String;", "", "getLoadPriority", "()I", "loadPriority", "kotlinx-coroutines-core"}, m87233k = 1, m87234mv = {1, 9, 0}, m87236xi = 48)
public interface MainDispatcherFactory {
    @NotNull
    hpw createDispatcher(@NotNull List<? extends MainDispatcherFactory> allFactories);

    int getLoadPriority();

    @Nullable
    String hintOnError();
}
