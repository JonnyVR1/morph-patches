package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface i600<Model, Data> {
    @Nullable
    /* JADX INFO: renamed from: a */
    C17490a<Data> mo103352a(@NonNull Model model, int i, int i2, @NonNull px50 px50Var);

    /* JADX INFO: renamed from: b */
    boolean mo103353b(@NonNull Model model);

    /* JADX INFO: renamed from: l.i600$a */
    public static class C17490a<Data> {

        /* JADX INFO: renamed from: a */
        public final kxq f111665a;

        /* JADX INFO: renamed from: b */
        public final List<kxq> f111666b;

        /* JADX INFO: renamed from: c */
        public final l4c<Data> f111667c;

        public C17490a(@NonNull kxq kxqVar, @NonNull List<kxq> list, @NonNull l4c<Data> l4cVar) {
            this.f111665a = (kxq) qf80.m174276d(kxqVar);
            this.f111666b = (List) qf80.m174276d(list);
            this.f111667c = (l4c) qf80.m174276d(l4cVar);
        }

        public C17490a(@NonNull kxq kxqVar, @NonNull l4c<Data> l4cVar) {
            this(kxqVar, Collections.EMPTY_LIST, l4cVar);
        }
    }
}
