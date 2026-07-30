package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.NotNull;
import p153l.n7h0;

/* JADX INFO: renamed from: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {1, 8, 0}, m88125xi = 48)
final /* synthetic */ class C0646x2da6dfef extends FunctionReferenceImpl implements Function1<n7h0, Boolean> {
    public static final C0646x2da6dfef INSTANCE = new C0646x2da6dfef();

    public C0646x2da6dfef() {
        super(1, n7h0.class, "yieldIfContendedSafely", "yieldIfContendedSafely()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull n7h0 n7h0Var) {
        n7h0Var.getClass();
        return Boolean.valueOf(n7h0Var.yieldIfContendedSafely());
    }
}
