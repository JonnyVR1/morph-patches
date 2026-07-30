package p153l;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/dmc0;", p7f.GPS_DIRECTION_TRUE, "Ll/l3g0;", "", "readException", "<init>", "(Ljava/lang/Throwable;)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "datastore-core"}, m88122k = 1, m88123mv = {1, 5, 1}, m88125xi = 48)
public final class dmc0<T> extends l3g0<T> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Throwable readException;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmc0(@NotNull Throwable th) {
        super(null);
        th.getClass();
        this.readException = th;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Throwable getReadException() {
        return this.readException;
    }
}
