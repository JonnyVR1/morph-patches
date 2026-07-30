package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ikl implements i600<n1k, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final kx50<Integer> f113686b = kx50.m147678f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    @Nullable
    private final d600<n1k, n1k> f113687a;

    /* JADX INFO: renamed from: l.ikl$a */
    public static class C17570a implements j600<n1k, InputStream> {

        /* JADX INFO: renamed from: a */
        private final d600<n1k, n1k> f113688a = new d600<>(500);

        @Override // p149l.j600
        @NonNull
        /* JADX INFO: renamed from: b */
        public i600<n1k, InputStream> mo103357b(gk10 gk10Var) {
            return new ikl(this.f113688a);
        }
    }

    public ikl(@Nullable d600<n1k, n1k> d600Var) {
        this.f113687a = d600Var;
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i600.C17490a<InputStream> mo103352a(@NonNull n1k n1kVar, int i, int i2, @NonNull px50 px50Var) {
        d600<n1k, n1k> d600Var = this.f113687a;
        if (d600Var != null) {
            n1k n1kVarM110108a = d600Var.m110108a(n1kVar, 0, 0);
            if (n1kVarM110108a == null) {
                this.f113687a.m110109b(n1kVar, 0, 0, n1kVar);
            } else {
                n1kVar = n1kVarM110108a;
            }
        }
        return new i600.C17490a<>(n1kVar, new fll(n1kVar, ((Integer) px50Var.m171822c(f113686b)).intValue()));
    }

    @Override // p149l.i600
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo103353b(@NonNull n1k n1kVar) {
        return true;
    }

    public ikl() {
        this(null);
    }
}
