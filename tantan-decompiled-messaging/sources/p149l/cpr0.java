package p149l;

import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.MovieHeaderBox;
import java.nio.ByteBuffer;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public final class cpr0 extends tfx0 {

    /* JADX INFO: renamed from: l */
    public Date f81986l;

    /* JADX INFO: renamed from: m */
    public Date f81987m;

    /* JADX INFO: renamed from: n */
    public long f81988n;

    /* JADX INFO: renamed from: o */
    public long f81989o;

    /* JADX INFO: renamed from: p */
    public double f81990p;

    /* JADX INFO: renamed from: q */
    public float f81991q;

    /* JADX INFO: renamed from: r */
    public dgx0 f81992r;

    /* JADX INFO: renamed from: s */
    public long f81993s;

    public cpr0() {
        super(MovieHeaderBox.TYPE);
        this.f81990p = 1.0d;
        this.f81991q = 1.0f;
        this.f81992r = dgx0.f86209j;
    }

    @Override // p149l.rfx0
    /* JADX INFO: renamed from: c */
    public final void mo108173c(ByteBuffer byteBuffer) {
        m188753g(byteBuffer);
        if (m188752f() == 1) {
            this.f81986l = yfx0.m214597a(yor0.m215550f(byteBuffer));
            this.f81987m = yfx0.m214597a(yor0.m215550f(byteBuffer));
            this.f81988n = yor0.m215549e(byteBuffer);
            this.f81989o = yor0.m215550f(byteBuffer);
        } else {
            this.f81986l = yfx0.m214597a(yor0.m215549e(byteBuffer));
            this.f81987m = yfx0.m214597a(yor0.m215549e(byteBuffer));
            this.f81988n = yor0.m215549e(byteBuffer);
            this.f81989o = yor0.m215549e(byteBuffer);
        }
        this.f81990p = yor0.m215546b(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.f81991q = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        yor0.m215548d(byteBuffer);
        yor0.m215549e(byteBuffer);
        yor0.m215549e(byteBuffer);
        this.f81992r = new dgx0(yor0.m215546b(byteBuffer), yor0.m215546b(byteBuffer), yor0.m215546b(byteBuffer), yor0.m215546b(byteBuffer), yor0.m215545a(byteBuffer), yor0.m215545a(byteBuffer), yor0.m215545a(byteBuffer), yor0.m215546b(byteBuffer), yor0.m215546b(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.f81993s = yor0.m215549e(byteBuffer);
    }

    /* JADX INFO: renamed from: h */
    public final long m108174h() {
        return this.f81989o;
    }

    /* JADX INFO: renamed from: i */
    public final long m108175i() {
        return this.f81988n;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.f81986l + ";modificationTime=" + this.f81987m + ";timescale=" + this.f81988n + ";duration=" + this.f81989o + ";rate=" + this.f81990p + ";volume=" + this.f81991q + ";matrix=" + this.f81992r + ";nextTrackId=" + this.f81993s + Constants.AES_SUFFIX;
    }
}
