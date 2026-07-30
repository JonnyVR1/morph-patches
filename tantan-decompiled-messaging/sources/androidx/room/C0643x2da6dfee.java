package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p149l.fzg0;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
public /* synthetic */ class C0643x2da6dfee extends FunctionReferenceImpl implements Function1<fzg0, Boolean> {
    public static final C0643x2da6dfee INSTANCE = new C0643x2da6dfee();

    public C0643x2da6dfee() {
        super(1, fzg0.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull fzg0 fzg0Var) {
        fzg0Var.getClass();
        return Boolean.valueOf(fzg0Var.yieldIfContendedSafely());
    }
}
