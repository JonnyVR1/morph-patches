package p149l;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public interface fbj0 {

    /* JADX INFO: renamed from: l.fbj0$a */
    public static final class C16790a {

        /* JADX INFO: renamed from: a */
        public final String f96722a;

        /* JADX INFO: renamed from: b */
        public final int f96723b;

        /* JADX INFO: renamed from: c */
        public final byte[] f96724c;

        public C16790a(String str, int i, byte[] bArr) {
            this.f96722a = str;
            this.f96723b = i;
            this.f96724c = bArr;
        }
    }

    /* JADX INFO: renamed from: l.fbj0$b */
    public static final class C16791b {

        /* JADX INFO: renamed from: a */
        public final int f96725a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public final String f96726b;

        /* JADX INFO: renamed from: c */
        public final List<C16790a> f96727c;

        /* JADX INFO: renamed from: d */
        public final byte[] f96728d;

        public C16791b(int i, @Nullable String str, @Nullable List<C16790a> list, byte[] bArr) {
            this.f96725a = i;
            this.f96726b = str;
            this.f96727c = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
            this.f96728d = bArr;
        }
    }

    /* JADX INFO: renamed from: l.fbj0$c */
    public interface InterfaceC16792c {
        /* JADX INFO: renamed from: a */
        SparseArray<fbj0> mo120355a();

        @Nullable
        /* JADX INFO: renamed from: b */
        fbj0 mo120356b(int i, C16791b c16791b);
    }

    /* JADX INFO: renamed from: a */
    void mo120352a(d860 d860Var, int i) throws ParserException;

    /* JADX INFO: renamed from: b */
    void mo120353b();

    /* JADX INFO: renamed from: c */
    void mo120354c(eri0 eri0Var, uqf uqfVar, C16793d c16793d);

    /* JADX INFO: renamed from: l.fbj0$d */
    public static final class C16793d {

        /* JADX INFO: renamed from: a */
        public final String f96729a;

        /* JADX INFO: renamed from: b */
        public final int f96730b;

        /* JADX INFO: renamed from: c */
        public final int f96731c;

        /* JADX INFO: renamed from: d */
        public int f96732d;

        /* JADX INFO: renamed from: e */
        public String f96733e;

        public C16793d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f96729a = str;
            this.f96730b = i2;
            this.f96731c = i3;
            this.f96732d = Integer.MIN_VALUE;
            this.f96733e = "";
        }

        /* JADX INFO: renamed from: a */
        public void m120357a() {
            int i = this.f96732d;
            this.f96732d = i == Integer.MIN_VALUE ? this.f96730b : i + this.f96731c;
            this.f96733e = this.f96729a + this.f96732d;
        }

        /* JADX INFO: renamed from: b */
        public String m120358b() {
            m120360d();
            return this.f96733e;
        }

        /* JADX INFO: renamed from: c */
        public int m120359c() {
            m120360d();
            return this.f96732d;
        }

        /* JADX INFO: renamed from: d */
        public final void m120360d() {
            if (this.f96732d != Integer.MIN_VALUE) {
                return;
            }
            qkq0.m175383a("generateNewId() must be called before retrieving ids.");
        }

        public C16793d(int i, int i2) {
            this(Integer.MIN_VALUE, i, i2);
        }
    }
}
