package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class wml implements re00<e4k, InputStream> {

    /* JADX INFO: renamed from: b */
    public static final q560<Integer> f189806b = q560.m175297f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: a */
    @Nullable
    private final me00<e4k, e4k> f189807a;

    /* JADX INFO: renamed from: l.wml$a */
    public static class C21142a implements se00<e4k, InputStream> {

        /* JADX INFO: renamed from: a */
        private final me00<e4k, e4k> f189808a = new me00<>(500);

        @Override // p153l.se00
        @NonNull
        /* JADX INFO: renamed from: b */
        public re00<e4k, InputStream> mo101570b(qs10 qs10Var) {
            return new wml(this.f189808a);
        }
    }

    public wml(@Nullable me00<e4k, e4k> me00Var) {
        this.f189807a = me00Var;
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public re00.C19812a<InputStream> mo101565a(@NonNull e4k e4kVar, int i, int i2, @NonNull u560 u560Var) {
        me00<e4k, e4k> me00Var = this.f189807a;
        if (me00Var != null) {
            e4k e4kVarM158002a = me00Var.m158002a(e4kVar, 0, 0);
            if (e4kVarM158002a == null) {
                this.f189807a.m158003b(e4kVar, 0, 0, e4kVar);
            } else {
                e4kVar = e4kVarM158002a;
            }
        }
        return new re00.C19812a<>(e4kVar, new unl(e4kVar, ((Integer) u560Var.m194542c(f189806b)).intValue()));
    }

    @Override // p153l.re00
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo101566b(@NonNull e4k e4kVar) {
        return true;
    }

    public wml() {
        this(null);
    }
}
