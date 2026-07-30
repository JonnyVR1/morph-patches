package p153l;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* synthetic */ class crb implements cb50, FunctionAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Function1 f83309a;

    public crb(Function1 function1) {
        function1.getClass();
        this.f83309a = function1;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    @NotNull
    /* JADX INFO: renamed from: a */
    public final Function<?> mo6327a() {
        return this.f83309a;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof cb50) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.m88377d(mo6327a(), ((FunctionAdapter) obj).mo6327a());
        }
        return false;
    }

    public final int hashCode() {
        return mo6327a().hashCode();
    }

    @Override // p153l.cb50
    public final /* synthetic */ void onChanged(Object obj) {
        this.f83309a.invoke(obj);
    }
}
