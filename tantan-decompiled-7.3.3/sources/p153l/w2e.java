package p153l;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/w2e;", "Ljava/util/concurrent/Executor;", "<init>", "()V", "Ljava/lang/Runnable;", "r", "", "execute", "(Ljava/lang/Runnable;)V", "kotlinx-coroutines-play-services"}, m88122k = 1, m88123mv = {1, 9, 0}, m88125xi = 48)
public final class w2e implements Executor {

    @NotNull
    public static final w2e INSTANCE = new w2e();

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable r) {
        r.run();
    }
}
