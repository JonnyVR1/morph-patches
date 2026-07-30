package p153l;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class drm {

    /* JADX INFO: renamed from: a */
    private final ArrayList f90397a;

    /* JADX INFO: renamed from: l.drm$a */
    public static final class C16610a {

        /* JADX INFO: renamed from: a */
        private final Set f90398a = new HashSet();

        @NonNull
        /* JADX INFO: renamed from: a */
        public C16610a m117691a() {
            this.f90398a.add(2);
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public drm m117692b() {
            return new drm(this.f90398a, null);
        }
    }

    public /* synthetic */ drm(Set set, jrt0 jrt0Var) {
        this.f90397a = new ArrayList(Collections.unmodifiableList(new ArrayList(set)));
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static C16610a m117689a() {
        return new C16610a();
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m117690b() {
        return this.f90397a;
    }
}
