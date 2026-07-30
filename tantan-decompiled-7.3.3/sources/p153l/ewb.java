package p153l;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.IntRange;

/* JADX INFO: loaded from: classes8.dex */
public class ewb {

    /* JADX INFO: renamed from: e */
    public Uri f96135e;

    /* JADX INFO: renamed from: f */
    public boolean f96136f;

    /* JADX INFO: renamed from: g */
    public qcj<Bitmap, Integer> f96137g;

    /* JADX INFO: renamed from: a */
    public Bitmap.CompressFormat f96131a = Bitmap.CompressFormat.PNG;

    /* JADX INFO: renamed from: c */
    public int f96133c = -1;

    /* JADX INFO: renamed from: d */
    public int f96134d = -1;

    /* JADX INFO: renamed from: b */
    public int f96132b = 90;

    /* JADX INFO: renamed from: l.ewb$a */
    public static class C16850a {

        /* JADX INFO: renamed from: a */
        public ewb f96138a;

        public C16850a(Uri uri) {
            this.f96138a = new ewb(uri);
        }

        /* JADX INFO: renamed from: a */
        public ewb m122939a() {
            return this.f96138a;
        }

        /* JADX INFO: renamed from: b */
        public C16850a m122940b(Bitmap.CompressFormat compressFormat) {
            this.f96138a.f96131a = compressFormat;
            Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.WEBP;
            ewb ewbVar = this.f96138a;
            if (compressFormat == compressFormat2) {
                ewbVar.f96136f = true;
                return this;
            }
            ewbVar.f96136f = false;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C16850a m122941c(@IntRange(from = 0, to = 100) int i) {
            this.f96138a.f96132b = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C16850a m122942d(int i, int i2) {
            this.f96138a.f96133c = i;
            this.f96138a.f96134d = i2;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C16850a m122943e(qcj<Bitmap, Integer> qcjVar) {
            this.f96138a.f96137g = qcjVar;
            return this;
        }
    }

    public ewb(Uri uri) {
        this.f96135e = uri;
    }

    /* JADX INFO: renamed from: g */
    public Bitmap.CompressFormat m122934g() {
        return this.f96131a;
    }

    /* JADX INFO: renamed from: h */
    public Uri m122935h() {
        return this.f96135e;
    }

    /* JADX INFO: renamed from: i */
    public int m122936i() {
        return this.f96134d;
    }

    /* JADX INFO: renamed from: j */
    public int m122937j(Bitmap bitmap) {
        qcj<Bitmap, Integer> qcjVar;
        return (!this.f96136f || (qcjVar = this.f96137g) == null) ? this.f96132b : qcjVar.call(bitmap).intValue();
    }

    /* JADX INFO: renamed from: k */
    public int m122938k() {
        return this.f96133c;
    }
}
