package p153l;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
@AnyThread
@RequiresApi(19)
public final class ha00 {

    /* JADX INFO: renamed from: a */
    public final da00 f108450a;

    /* JADX INFO: renamed from: b */
    public final char[] f108451b;

    /* JADX INFO: renamed from: c */
    public final C17428a f108452c = new C17428a(1024);

    /* JADX INFO: renamed from: d */
    public final Typeface f108453d;

    public ha00(@NonNull Typeface typeface, @NonNull da00 da00Var) {
        this.f108453d = typeface;
        this.f108450a = da00Var;
        this.f108451b = new char[da00Var.m115110j() * 2];
        m134094a(da00Var);
    }

    /* JADX INFO: renamed from: b */
    public static ha00 m134093b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        return new ha00(typeface, ea00.m119988b(byteBuffer));
    }

    /* JADX INFO: renamed from: a */
    public final void m134094a(da00 da00Var) {
        int iM115110j = da00Var.m115110j();
        for (int i = 0; i < iM115110j; i++) {
            fze fzeVar = new fze(this, i);
            Character.toChars(fzeVar.m128165f(), this.f108451b, i * 2);
            m134100h(fzeVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public char[] m134095c() {
        return this.f108451b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public da00 m134096d() {
        return this.f108450a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public int m134097e() {
        return this.f108450a.m115111k();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public C17428a m134098f() {
        return this.f108452c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: g */
    public Typeface m134099g() {
        return this.f108453d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public void m134100h(@NonNull fze fzeVar) {
        yn80.m216776f(fzeVar, "emoji metadata cannot be null");
        yn80.m216772b(fzeVar.m128162c() > 0, "invalid metadata codepoint length");
        this.f108452c.m134103c(fzeVar, 0, fzeVar.m128162c() - 1);
    }

    /* JADX INFO: renamed from: l.ha00$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C17428a {

        /* JADX INFO: renamed from: a */
        public final SparseArray<C17428a> f108454a;

        /* JADX INFO: renamed from: b */
        public fze f108455b;

        public C17428a(int i) {
            this.f108454a = new SparseArray<>(i);
        }

        /* JADX INFO: renamed from: a */
        public C17428a m134101a(int i) {
            SparseArray<C17428a> sparseArray = this.f108454a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: renamed from: b */
        public final fze m134102b() {
            return this.f108455b;
        }

        /* JADX INFO: renamed from: c */
        public void m134103c(@NonNull fze fzeVar, int i, int i2) {
            C17428a c17428aM134101a = m134101a(fzeVar.m128161b(i));
            if (c17428aM134101a == null) {
                c17428aM134101a = new C17428a();
                this.f108454a.put(fzeVar.m128161b(i), c17428aM134101a);
            }
            if (i2 > i) {
                c17428aM134101a.m134103c(fzeVar, i + 1, i2);
            } else {
                c17428aM134101a.f108455b = fzeVar;
            }
        }

        public C17428a() {
            this(1);
        }
    }
}
