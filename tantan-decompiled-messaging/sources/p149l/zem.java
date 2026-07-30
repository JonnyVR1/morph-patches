package p149l;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes.dex */
public class zem {

    /* JADX INFO: renamed from: m */
    public static final zem f202837m = m218356b().m96242a();

    /* JADX INFO: renamed from: a */
    public final int f202838a;

    /* JADX INFO: renamed from: b */
    public final int f202839b;

    /* JADX INFO: renamed from: c */
    public final boolean f202840c;

    /* JADX INFO: renamed from: d */
    public final boolean f202841d;

    /* JADX INFO: renamed from: e */
    public final boolean f202842e;

    /* JADX INFO: renamed from: f */
    public final boolean f202843f;

    /* JADX INFO: renamed from: g */
    public final boolean f202844g;

    /* JADX INFO: renamed from: h */
    public final Bitmap.Config f202845h;

    /* JADX INFO: renamed from: i */
    public final Bitmap.Config f202846i;

    /* JADX INFO: renamed from: j */
    public final cfm f202847j;

    /* JADX INFO: renamed from: k */
    public final ColorSpace f202848k;

    /* JADX INFO: renamed from: l */
    public final boolean f202849l;

    public zem(afm afmVar) {
        this.f202838a = afmVar.m96253l();
        this.f202839b = afmVar.m96252k();
        this.f202840c = afmVar.m96249h();
        this.f202841d = afmVar.m96256o();
        this.f202842e = afmVar.m96255n();
        this.f202843f = afmVar.m96248g();
        this.f202844g = afmVar.m96251j();
        this.f202845h = afmVar.m96244c();
        this.f202846i = afmVar.m96243b();
        this.f202847j = afmVar.m96247f();
        afmVar.m96245d();
        this.f202848k = afmVar.m96246e();
        this.f202849l = afmVar.m96250i();
    }

    /* JADX INFO: renamed from: a */
    public static zem m218355a() {
        return f202837m;
    }

    /* JADX INFO: renamed from: b */
    public static afm m218356b() {
        return new afm();
    }

    /* JADX INFO: renamed from: c */
    public t050.C20089a m218357c() {
        return t050.m186815b(this).m186816a("minDecodeIntervalMs", this.f202838a).m186816a("maxDimensionPx", this.f202839b).m186818c("decodePreviewFrame", this.f202840c).m186818c("useLastFrameForPreview", this.f202841d).m186818c("useEncodedImageForPreview", this.f202842e).m186818c("decodeAllFrames", this.f202843f).m186818c("forceStaticImage", this.f202844g).m186817b("bitmapConfigName", this.f202845h.name()).m186817b("animatedBitmapConfigName", this.f202846i.name()).m186817b("customImageDecoder", this.f202847j).m186817b("bitmapTransformation", null).m186817b("colorSpace", this.f202848k);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zem zemVar = (zem) obj;
        if (this.f202838a != zemVar.f202838a || this.f202839b != zemVar.f202839b || this.f202840c != zemVar.f202840c || this.f202841d != zemVar.f202841d || this.f202842e != zemVar.f202842e || this.f202843f != zemVar.f202843f || this.f202844g != zemVar.f202844g) {
            return false;
        }
        boolean z = this.f202849l;
        if (z || this.f202845h == zemVar.f202845h) {
            return (z || this.f202846i == zemVar.f202846i) && this.f202847j == zemVar.f202847j && this.f202848k == zemVar.f202848k;
        }
        return false;
    }

    public int hashCode() {
        int iOrdinal = (((((((((((this.f202838a * 31) + this.f202839b) * 31) + (this.f202840c ? 1 : 0)) * 31) + (this.f202841d ? 1 : 0)) * 31) + (this.f202842e ? 1 : 0)) * 31) + (this.f202843f ? 1 : 0)) * 31) + (this.f202844g ? 1 : 0);
        if (!this.f202849l) {
            iOrdinal = (iOrdinal * 31) + this.f202845h.ordinal();
        }
        if (!this.f202849l) {
            int i = iOrdinal * 31;
            Bitmap.Config config = this.f202846i;
            iOrdinal = i + (config != null ? config.ordinal() : 0);
        }
        int i2 = iOrdinal * 31;
        cfm cfmVar = this.f202847j;
        int iHashCode = (i2 + (cfmVar != null ? cfmVar.hashCode() : 0)) * 961;
        ColorSpace colorSpace = this.f202848k;
        return iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0);
    }

    public String toString() {
        return "ImageDecodeOptions{" + m218357c().toString() + "}";
    }
}
