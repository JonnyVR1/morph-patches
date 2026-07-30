package kotlinx.coroutines.flow;

import com.p051p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153l.p7f;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m88121d2 = {"<anonymous>", "", p7f.GPS_DIRECTION_TRUE, Careers.f39580it, "", "invoke", "(Ljava/lang/Throwable;)Ljava/lang/Boolean;"}, m88122k = 3, m88123mv = {1, 9, 0}, m88125xi = 48)
final class FlowKt__MigrationKt$onErrorReturn$1 extends Lambda implements Function1<Throwable, Boolean> {
    public static final FlowKt__MigrationKt$onErrorReturn$1 INSTANCE = new FlowKt__MigrationKt$onErrorReturn$1();

    public FlowKt__MigrationKt$onErrorReturn$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Throwable th) {
        return Boolean.TRUE;
    }
}
