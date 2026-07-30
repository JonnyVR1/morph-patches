package androidx.room;

import android.os.CancellationSignal;
import com.p046p1.mobile.putong.data.Careers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC15486o;
import org.jetbrains.annotations.Nullable;
import p149l.azg0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, m87232d2 = {"<anonymous>", "", "R", Careers.f38732it, "", "invoke"}, m87233k = 3, m87234mv = {1, 8, 0}, m87236xi = 48)
final class CoroutinesRoom$Companion$execute$4$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CancellationSignal $cancellationSignal;
    final /* synthetic */ InterfaceC15486o $job;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$1(CancellationSignal cancellationSignal, InterfaceC15486o interfaceC15486o) {
        super(1);
        this.$cancellationSignal = cancellationSignal;
        this.$job = interfaceC15486o;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        CancellationSignal cancellationSignal = this.$cancellationSignal;
        if (cancellationSignal != null) {
            azg0.m99664a(cancellationSignal);
        }
        InterfaceC15486o.a.m94245a(this.$job, null, 1, null);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }
}
