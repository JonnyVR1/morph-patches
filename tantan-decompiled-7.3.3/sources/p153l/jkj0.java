package p153l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface jkj0 {

    /* JADX INFO: renamed from: l.jkj0$a */
    public static final class C17966a {

        /* JADX INFO: renamed from: a */
        public final String f121410a;

        /* JADX INFO: renamed from: b */
        public final int f121411b;

        /* JADX INFO: renamed from: c */
        public final byte[] f121412c;

        public C17966a(String str, int i, byte[] bArr) {
            this.f121410a = str;
            this.f121411b = i;
            this.f121412c = bArr;
        }
    }

    /* JADX INFO: renamed from: l.jkj0$b */
    public static final class C17967b {

        /* JADX INFO: renamed from: a */
        public final int f121413a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f121414b;

        /* JADX INFO: renamed from: c */
        public final List<C17966a> f121415c;

        /* JADX INFO: renamed from: d */
        public final byte[] f121416d;

        public C17967b(int i, @Nullable String str, @Nullable List<C17966a> list, byte[] bArr) {
            this.f121413a = i;
            this.f121414b = str;
            this.f121415c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f121416d = bArr;
        }
    }

    /* JADX INFO: renamed from: l.jkj0$c */
    public interface InterfaceC17968c {
        /* JADX INFO: renamed from: a */
        SparseArray<jkj0> mo145852a();

        @Nullable
        /* JADX INFO: renamed from: b */
        jkj0 mo145853b(int i, C17967b c17967b);
    }

    /* JADX INFO: renamed from: a */
    void mo145849a(ig60 ig60Var, int i) throws ParserException;

    /* JADX INFO: renamed from: b */
    void mo145850b();

    /* JADX INFO: renamed from: c */
    void mo145851c(h0j0 h0j0Var, bsf bsfVar, C17969d c17969d);

    /* JADX INFO: renamed from: l.jkj0$d */
    public static final class C17969d {

        /* JADX INFO: renamed from: a */
        public final String f121417a;

        /* JADX INFO: renamed from: b */
        public final int f121418b;

        /* JADX INFO: renamed from: c */
        public final int f121419c;

        /* JADX INFO: renamed from: d */
        public int f121420d;

        /* JADX INFO: renamed from: e */
        public String f121421e;

        public C17969d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f121417a = str;
            this.f121418b = i2;
            this.f121419c = i3;
            this.f121420d = Integer.MIN_VALUE;
            this.f121421e = "";
        }

        /* JADX INFO: renamed from: a */
        public void m145854a() {
            int i = this.f121420d;
            this.f121420d = i == Integer.MIN_VALUE ? this.f121418b : i + this.f121419c;
            this.f121421e = this.f121417a + this.f121420d;
        }

        /* JADX INFO: renamed from: b */
        public String m145855b() {
            m145857d();
            return this.f121421e;
        }

        /* JADX INFO: renamed from: c */
        public int m145856c() {
            m145857d();
            return this.f121420d;
        }

        /* JADX INFO: renamed from: d */
        public final void m145857d() {
            if (this.f121420d != Integer.MIN_VALUE) {
                return;
            }
            wtq0.m207906a("generateNewId() must be called before retrieving ids.");
        }

        public C17969d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }
    }
}
