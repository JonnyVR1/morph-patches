package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p153l.n7h0;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
public /* synthetic */ class C0645x2da6dfee extends FunctionReferenceImpl implements Function1<n7h0, Boolean> {
    public static final C0645x2da6dfee INSTANCE = new C0645x2da6dfee();

    public C0645x2da6dfee() {
        super(1, n7h0.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull n7h0 n7h0Var) {
        n7h0Var.getClass();
        return Boolean.valueOf(n7h0Var.yieldIfContendedSafely());
    }
}
