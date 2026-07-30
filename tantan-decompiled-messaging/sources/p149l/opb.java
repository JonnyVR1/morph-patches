package p149l;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
public final /* synthetic */ class opb implements n250, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f144984a;

    public opb(Function1 function1) {
        function1.getClass();
        this.f144984a = function1;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function<?> mo6273a() {
        return this.f144984a;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof n250) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m87488d(mo6273a(), ((FunctionAdapter) obj).mo6273a());
        }
        return false;
    }

    public final int hashCode() {
        return mo6273a().hashCode();
    }

    @Override // p149l.n250
    public final /* synthetic */ void onChanged(Object obj) {
        this.f144984a.invoke(obj);
    }
}
