package androidx.room;

import com.p046p1.mobile.putong.data.Careers;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import p149l.dk0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m87232d2 = {"", "Ll/dk0;", Careers.f38732it, "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m87233k = 3, m87234mv = {1, 8, 0})
final class AmbiguousColumnResolver$resolve$4 extends Lambda implements Function1<List<? extends dk0>, Unit> {
    final /* synthetic */ Ref.ObjectRef<C0664a> $bestSolution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(Ref.ObjectRef<C0664a> objectRef) {
        super(1);
        this.$bestSolution = objectRef;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.a] */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<dk0> list) {
        list.getClass();
        ?? M3937a = C0664a.INSTANCE.m3937a(list);
        if (M3937a.compareTo(this.$bestSolution.element) < 0) {
            this.$bestSolution.element = M3937a;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends dk0> list) {
        invoke2((List<dk0>) list);
        return Unit.INSTANCE;
    }
}
