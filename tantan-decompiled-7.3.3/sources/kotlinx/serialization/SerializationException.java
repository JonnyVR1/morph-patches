package kotlinx.serialization;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0003\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\nB\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\f"}, m88121d2 = {"Lkotlinx/serialization/SerializationException;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "<init>", "()V", "message", "", "(Ljava/lang/String;)V", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "(Ljava/lang/Throwable;)V", "kotlinx-serialization-core"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public class SerializationException extends IllegalArgumentException {
    public SerializationException() {
    }

    public SerializationException(@Nullable String str) {
        super(str);
    }

    public SerializationException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public SerializationException(@Nullable Throwable th) {
        super(th);
    }
}
