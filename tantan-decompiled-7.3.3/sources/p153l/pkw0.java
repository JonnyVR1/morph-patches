package p153l;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public final class pkw0 extends ikw0 {

    /* JADX INFO: renamed from: a */
    public fpw0<Integer> f152965a;

    /* JADX INFO: renamed from: b */
    public fpw0<Integer> f152966b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public okw0 f152967c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public HttpURLConnection f152968d;

    public pkw0(fpw0<Integer> fpw0Var, fpw0<Integer> fpw0Var2, @Nullable okw0 okw0Var) {
        this.f152965a = fpw0Var;
        this.f152966b = fpw0Var2;
        this.f152967c = okw0Var;
    }

    /* JADX INFO: renamed from: B */
    public static void m172768B(@Nullable HttpURLConnection httpURLConnection) {
        jkw0.m145933a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Integer m172769m() {
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Integer m172770n() {
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m172768B(this.f152968d);
    }

    /* JADX INFO: renamed from: u */
    public HttpURLConnection m172773u() throws IOException {
        jkw0.m145934b(((Integer) this.f152965a.zza()).intValue(), ((Integer) this.f152966b.zza()).intValue());
        okw0 okw0Var = this.f152967c;
        okw0Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) okw0Var.zza();
        this.f152968d = httpURLConnection;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: v */
    public HttpURLConnection m172774v(okw0 okw0Var, final int i, final int i2) throws IOException {
        this.f152965a = new fpw0() { // from class: l.mkw0
            @Override // p153l.fpw0
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.f152966b = new fpw0() { // from class: l.nkw0
            @Override // p153l.fpw0
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.f152967c = okw0Var;
        return m172773u();
    }

    public pkw0() {
        this(new fpw0() { // from class: l.kkw0
            @Override // p153l.fpw0
            public final Object zza() {
                return pkw0.m172769m();
            }
        }, new fpw0() { // from class: l.lkw0
            @Override // p153l.fpw0
            public final Object zza() {
                return pkw0.m172770n();
            }
        }, null);
    }
}
