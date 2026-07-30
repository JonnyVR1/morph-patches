package p153l;

import androidx.annotation.NonNull;
import io.reactivex.FlowableTransformer;
import io.reactivex.functions.Action;

/* JADX INFO: loaded from: classes7.dex */
public class u1n<T> implements FlowableTransformer<T, T> {

    /* JADX INFO: renamed from: a */
    private boolean f177081a = false;

    /* JADX INFO: renamed from: b */
    @NonNull
    private final Action f177082b;

    public u1n(@NonNull Action action) {
        this.f177082b = action;
    }
}
