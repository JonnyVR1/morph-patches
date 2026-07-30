package p007l;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.IntRange;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qub {

    /* JADX INFO: renamed from: e */
    public Uri f3978e;

    /* JADX INFO: renamed from: f */
    public boolean f3979f;

    /* JADX INFO: renamed from: g */
    public w9j<Bitmap, Integer> f3980g;

    /* JADX INFO: renamed from: a */
    public Bitmap.CompressFormat f3974a = Bitmap.CompressFormat.PNG;

    /* JADX INFO: renamed from: c */
    public int f3976c = -1;

    /* JADX INFO: renamed from: d */
    public int f3977d = -1;

    /* JADX INFO: renamed from: b */
    public int f3975b = 90;

    /* JADX INFO: renamed from: l.qub$a */
    public static class C0676a {

        /* JADX INFO: renamed from: a */
        public qub f3981a;

        public C0676a(Uri uri) {
            this.f3981a = new qub(uri);
        }

        /* JADX INFO: renamed from: a */
        public qub m10464a() {
            return this.f3981a;
        }

        /* JADX INFO: renamed from: b */
        public C0676a m10465b(Bitmap.CompressFormat compressFormat) {
            this.f3981a.f3974a = compressFormat;
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
            qub qubVar = this.f3981a;
            if (compressFormat == compressFormat2) {
                qubVar.f3979f = true;
                return this;
            }
            qubVar.f3979f = false;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0676a m10466c(@IntRange(from = 0, to = 100) int i) {
            this.f3981a.f3975b = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0676a m10467d(int i, int i2) {
            this.f3981a.f3976c = i;
            this.f3981a.f3977d = i2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0676a m10468e(w9j<Bitmap, Integer> w9jVar) {
            this.f3981a.f3980g = w9jVar;
            return this;
        }
    }

    public qub(Uri uri) {
        this.f3978e = uri;
    }

    /* JADX INFO: renamed from: g */
    public Bitmap.CompressFormat m10459g() {
        return this.f3974a;
    }

    /* JADX INFO: renamed from: h */
    public Uri m10460h() {
        return this.f3978e;
    }

    /* JADX INFO: renamed from: i */
    public int m10461i() {
        return this.f3977d;
    }

    /* JADX INFO: renamed from: j */
    public int m10462j(Bitmap bitmap) {
        w9j<Bitmap, Integer> w9jVar;
        return (!this.f3979f || (w9jVar = this.f3980g) == null) ? this.f3975b : ((Integer) w9jVar.call(bitmap)).intValue();
    }

    /* JADX INFO: renamed from: k */
    public int m10463k() {
        return this.f3976c;
    }
}
