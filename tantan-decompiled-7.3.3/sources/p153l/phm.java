package p153l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public class phm {

    /* JADX INFO: renamed from: m */
    public static final phm f152447m = m172329b().m176595a();

    /* JADX INFO: renamed from: a */
    public final int f152448a;

    /* JADX INFO: renamed from: b */
    public final int f152449b;

    /* JADX INFO: renamed from: c */
    public final boolean f152450c;

    /* JADX INFO: renamed from: d */
    public final boolean f152451d;

    /* JADX INFO: renamed from: e */
    public final boolean f152452e;

    /* JADX INFO: renamed from: f */
    public final boolean f152453f;

    /* JADX INFO: renamed from: g */
    public final boolean f152454g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.Config f152455h;

    /* JADX INFO: renamed from: i */
    public final Bitmap.Config f152456i;

    /* JADX INFO: renamed from: j */
    public final shm f152457j;

    /* JADX INFO: renamed from: k */
    public final ColorSpace f152458k;

    /* JADX INFO: renamed from: l */
    public final boolean f152459l;

    public phm(qhm qhmVar) {
        this.f152448a = qhmVar.m176606l();
        this.f152449b = qhmVar.m176605k();
        this.f152450c = qhmVar.m176602h();
        this.f152451d = qhmVar.m176609o();
        this.f152452e = qhmVar.m176608n();
        this.f152453f = qhmVar.m176601g();
        this.f152454g = qhmVar.m176604j();
        this.f152455h = qhmVar.m176597c();
        this.f152456i = qhmVar.m176596b();
        this.f152457j = qhmVar.m176600f();
        qhmVar.m176598d();
        this.f152458k = qhmVar.m176599e();
        this.f152459l = qhmVar.m176603i();
    }

    /* JADX INFO: renamed from: a */
    public static phm m172328a() {
        return f152447m;
    }

    /* JADX INFO: renamed from: b */
    public static qhm m172329b() {
        return new qhm();
    }

    /* JADX INFO: renamed from: c */
    public i950.C17670a m172330c() {
        return i950.m139075b(this).m139076a("minDecodeIntervalMs", this.f152448a).m139076a("maxDimensionPx", this.f152449b).m139078c("decodePreviewFrame", this.f152450c).m139078c("useLastFrameForPreview", this.f152451d).m139078c("useEncodedImageForPreview", this.f152452e).m139078c("decodeAllFrames", this.f152453f).m139078c("forceStaticImage", this.f152454g).m139077b("bitmapConfigName", this.f152455h.name()).m139077b("animatedBitmapConfigName", this.f152456i.name()).m139077b("customImageDecoder", this.f152457j).m139077b("bitmapTransformation", null).m139077b("colorSpace", this.f152458k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        phm phmVar = (phm) obj;
        if (this.f152448a != phmVar.f152448a || this.f152449b != phmVar.f152449b || this.f152450c != phmVar.f152450c || this.f152451d != phmVar.f152451d || this.f152452e != phmVar.f152452e || this.f152453f != phmVar.f152453f || this.f152454g != phmVar.f152454g) {
            return false;
        }
        boolean z = this.f152459l;
        if (z || this.f152455h == phmVar.f152455h) {
            return (z || this.f152456i == phmVar.f152456i) && this.f152457j == phmVar.f152457j && this.f152458k == phmVar.f152458k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f152448a * 31) + this.f152449b) * 31) + (this.f152450c ? 1 : 0)) * 31) + (this.f152451d ? 1 : 0)) * 31) + (this.f152452e ? 1 : 0)) * 31) + (this.f152453f ? 1 : 0)) * 31) + (this.f152454g ? 1 : 0);
        if (!this.f152459l) {
            iOrdinal = (iOrdinal * 31) + this.f152455h.ordinal();
        }
        if (!this.f152459l) {
            int i = iOrdinal * 31;
            Bitmap.Config config = this.f152456i;
            iOrdinal = i + (config != null ? config.ordinal() : 0);
        }
        int i2 = iOrdinal * 31;
        shm shmVar = this.f152457j;
        int iHashCode = (i2 + (shmVar != null ? shmVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f152458k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + m172330c().toString() + "}";
    }
}
