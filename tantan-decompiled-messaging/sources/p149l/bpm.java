package p149l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class bpm {

    /* JADX INFO: renamed from: a */
    private final ArrayList f76652a;

    /* JADX INFO: renamed from: l.bpm$a */
    public static final class C15926a {

        /* JADX INFO: renamed from: a */
        private final Set f76653a = new HashSet();

        @NonNull
        /* JADX INFO: renamed from: a */
        public C15926a m103082a() {
            this.f76653a.add(2);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public bpm m103083b() {
            return new bpm(this.f76653a, null);
        }
    }

    public /* synthetic */ bpm(Set set, dit0 dit0Var) {
        this.f76652a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C15926a m103080a() {
        return new C15926a();
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m103081b() {
        return this.f76652a;
    }
}
