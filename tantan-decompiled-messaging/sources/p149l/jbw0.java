package p149l;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes6.dex */
public final class jbw0 extends cbw0 {

    /* JADX INFO: renamed from: a */
    public zfw0<Integer> f117222a;

    /* JADX INFO: renamed from: b */
    public zfw0<Integer> f117223b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public ibw0 f117224c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public HttpURLConnection f117225d;

    public jbw0(zfw0<Integer> zfw0Var, zfw0<Integer> zfw0Var2, @Nullable ibw0 ibw0Var) {
        this.f117222a = zfw0Var;
        this.f117223b = zfw0Var2;
        this.f117224c = ibw0Var;
    }

    /* JADX INFO: renamed from: B */
    public static void m140822B(@Nullable HttpURLConnection httpURLConnection) {
        dbw0.m110649a();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Integer m140823m() {
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Integer m140824n() {
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m140822B(this.f117225d);
    }

    /* JADX INFO: renamed from: u */
    public HttpURLConnection m140827u() throws IOException {
        dbw0.m110650b(((Integer) this.f117222a.zza()).intValue(), ((Integer) this.f117223b.zza()).intValue());
        ibw0 ibw0Var = this.f117224c;
        ibw0Var.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) ibw0Var.zza();
        this.f117225d = httpURLConnection;
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: v */
    public HttpURLConnection m140828v(ibw0 ibw0Var, final int i, final int i2) throws IOException {
        this.f117222a = new zfw0() { // from class: l.gbw0
            @Override // p149l.zfw0
            public final Object zza() {
                return Integer.valueOf(i);
            }
        };
        this.f117223b = new zfw0() { // from class: l.hbw0
            @Override // p149l.zfw0
            public final Object zza() {
                return Integer.valueOf(i2);
            }
        };
        this.f117224c = ibw0Var;
        return m140827u();
    }

    public jbw0() {
        this(new zfw0() { // from class: l.ebw0
            @Override // p149l.zfw0
            public final Object zza() {
                return jbw0.m140823m();
            }
        }, new zfw0() { // from class: l.fbw0
            @Override // p149l.zfw0
            public final Object zza() {
                return jbw0.m140824n();
            }
        }, null);
    }
}
