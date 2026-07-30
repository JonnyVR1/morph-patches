package p149l;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public class qub {

    /* JADX INFO: renamed from: e */
    public Uri f156468e;

    /* JADX INFO: renamed from: f */
    public boolean f156469f;

    /* JADX INFO: renamed from: g */
    public w9j<Bitmap, Integer> f156470g;

    /* JADX INFO: renamed from: a */
    public Bitmap.CompressFormat f156464a = Bitmap.CompressFormat.PNG;

    /* JADX INFO: renamed from: c */
    public int f156466c = -1;

    /* JADX INFO: renamed from: d */
    public int f156467d = -1;

    /* JADX INFO: renamed from: b */
    public int f156465b = 90;

    /* JADX INFO: renamed from: l.qub$a */
    public static class C19581a {

        /* JADX INFO: renamed from: a */
        public qub f156471a;

        public C19581a(Uri uri) {
            this.f156471a = new qub(uri);
        }

        /* JADX INFO: renamed from: a */
        public qub m176592a() {
            return this.f156471a;
        }

        /* JADX INFO: renamed from: b */
        public C19581a m176593b(Bitmap.CompressFormat compressFormat) {
            this.f156471a.f156464a = compressFormat;
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
            qub qubVar = this.f156471a;
            if (compressFormat == compressFormat2) {
                qubVar.f156469f = true;
                return this;
            }
            qubVar.f156469f = false;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19581a m176594c(@IntRange(from = 0, to = 100) int i) {
            this.f156471a.f156465b = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19581a m176595d(int i, int i2) {
            this.f156471a.f156466c = i;
            this.f156471a.f156467d = i2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19581a m176596e(w9j<Bitmap, Integer> w9jVar) {
            this.f156471a.f156470g = w9jVar;
            return this;
        }
    }

    public qub(Uri uri) {
        this.f156468e = uri;
    }

    /* JADX INFO: renamed from: g */
    public Bitmap.CompressFormat m176587g() {
        return this.f156464a;
    }

    /* JADX INFO: renamed from: h */
    public Uri m176588h() {
        return this.f156468e;
    }

    /* JADX INFO: renamed from: i */
    public int m176589i() {
        return this.f156467d;
    }

    /* JADX INFO: renamed from: j */
    public int m176590j(Bitmap bitmap) {
        w9j<Bitmap, Integer> w9jVar;
        return (!this.f156469f || (w9jVar = this.f156470g) == null) ? this.f156465b : w9jVar.call(bitmap).intValue();
    }

    /* JADX INFO: renamed from: k */
    public int m176591k() {
        return this.f156466c;
    }
}
