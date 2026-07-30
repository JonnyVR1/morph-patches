package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface re00<Model, Data> {
    @Nullable
    /* JADX INFO: renamed from: a */
    C19812a<Data> mo101565a(@NonNull Model model, int i, int i2, @NonNull u560 u560Var);

    /* JADX INFO: renamed from: b */
    boolean mo101566b(@NonNull Model model);

    /* JADX INFO: renamed from: l.re00$a */
    public static class C19812a<Data> {

        /* JADX INFO: renamed from: a */
        public final kzq f162369a;

        /* JADX INFO: renamed from: b */
        public final List<kzq> f162370b;

        /* JADX INFO: renamed from: c */
        public final t5c<Data> f162371c;

        public C19812a(@NonNull kzq kzqVar, @NonNull List<kzq> list, @NonNull t5c<Data> t5cVar) {
            this.f162369a = (kzq) vn80.m201944d(kzqVar);
            this.f162370b = (List) vn80.m201944d(list);
            this.f162371c = (t5c) vn80.m201944d(t5cVar);
        }

        public C19812a(@NonNull kzq kzqVar, @NonNull t5c<Data> t5cVar) {
            this(kzqVar, Collections.EMPTY_LIST, t5cVar);
        }
    }
}
