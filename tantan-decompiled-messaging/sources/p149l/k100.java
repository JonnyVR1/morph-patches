package p149l;

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
public final class k100 {

    /* JADX INFO: renamed from: a */
    public final g100 f120526a;

    /* JADX INFO: renamed from: b */
    public final char[] f120527b;

    /* JADX INFO: renamed from: c */
    public final C17902a f120528c = new C17902a(1024);

    /* JADX INFO: renamed from: d */
    public final Typeface f120529d;

    public k100(@NonNull Typeface typeface, @NonNull g100 g100Var) {
        this.f120529d = typeface;
        this.f120526a = g100Var;
        this.f120527b = new char[g100Var.m124047j() * 2];
        m144127a(g100Var);
    }

    /* JADX INFO: renamed from: b */
    public static k100 m144126b(@NonNull Typeface typeface, @NonNull ByteBuffer byteBuffer) throws IOException {
        return new k100(typeface, h100.m128996b(byteBuffer));
    }

    /* JADX INFO: renamed from: a */
    public final void m144127a(g100 g100Var) {
        int iM124047j = g100Var.m124047j();
        for (int i = 0; i < iM124047j; i++) {
            bye byeVar = new bye(this, i);
            Character.toChars(byeVar.m104445f(), this.f120527b, i * 2);
            m144133h(byeVar);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: c */
    public char[] m144128c() {
        return this.f120527b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: d */
    public g100 m144129d() {
        return this.f120526a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: e */
    public int m144130e() {
        return this.f120526a.m124048k();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: f */
    public C17902a m144131f() {
        return this.f120528c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* JADX INFO: renamed from: g */
    public Typeface m144132g() {
        return this.f120529d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    /* JADX INFO: renamed from: h */
    public void m144133h(@NonNull bye byeVar) {
        tf80.m188659f(byeVar, "emoji metadata cannot be null");
        tf80.m188655b(byeVar.m104442c() > 0, "invalid metadata codepoint length");
        this.f120528c.m144136c(byeVar, 0, byeVar.m104442c() - 1);
    }

    /* JADX INFO: renamed from: l.k100$a */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class C17902a {

        /* JADX INFO: renamed from: a */
        public final SparseArray<C17902a> f120530a;

        /* JADX INFO: renamed from: b */
        public bye f120531b;

        public C17902a(int i) {
            this.f120530a = new SparseArray<>(i);
        }

        /* JADX INFO: renamed from: a */
        public C17902a m144134a(int i) {
            SparseArray<C17902a> sparseArray = this.f120530a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i);
        }

        /* JADX INFO: renamed from: b */
        public final bye m144135b() {
            return this.f120531b;
        }

        /* JADX INFO: renamed from: c */
        public void m144136c(@NonNull bye byeVar, int i, int i2) {
            C17902a c17902aM144134a = m144134a(byeVar.m104441b(i));
            if (c17902aM144134a == null) {
                c17902aM144134a = new C17902a();
                this.f120530a.put(byeVar.m104441b(i), c17902aM144134a);
            }
            if (i2 > i) {
                c17902aM144134a.m144136c(byeVar, i + 1, i2);
            } else {
                c17902aM144134a.f120531b = byeVar;
            }
        }

        public C17902a() {
            this(1);
        }
    }
}
